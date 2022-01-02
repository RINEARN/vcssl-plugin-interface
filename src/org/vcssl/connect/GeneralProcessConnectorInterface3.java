/*
 * ==================================================
 * General Process Connector Interface 3 (GPCI 3)
 * ( for VCSSL / Vnano Plug-in Development )
 * --------------------------------------------------
 * This file is released under CC0.
 * Written in 2017-2022 by RINEARN (Fumihiro Matsui)
 * ==================================================
 */

package org.vcssl.connect;

/**
 * <p>
 * <span class="lang-en">A legacy interface for implementing GPCI 3 plug-ins</span>
 * <span class="lang-ja">GPCI 3 形式のプラグインを実装するためのレガシーインターフェースです</span>
 * .
 * </p>
 * 
 * <p>
 * <span class="lang-en">
 * GPCI series are old interfaces. 
 * GPCI3 is defined as this file, but there is no script engine supporting it.
 * </span>
 * <span class="lang-ja">
 * GPCI系は古いインターフェースです. 
 * GPCI3 は, このファイルで定義はされていますが, 現時点で利用可能な処理系はありません. 
 * </span>
 * </p>
 */
public interface GeneralProcessConnectorInterface3 {

	/**
	 * <span class="lang-en">The type name of this interface (value: "GPCI") referred when the plug-in will be loaded</span>
	 * <span class="lang-ja">プラグインのロード時に参照される, このインターフェースの形式名（値: "GPCI"）です</span>
	 * .
	 */
	public static final String INTERFACE_TYPE = "GPCI";

	/**
	 * <span class="lang-en">The generation of this interface (value: "1")</span>
	 * <span class="lang-ja">このインターフェースの世代名です（値: "1"）</span>
	 * .
	 */
	public static final String INTERFACE_GENERATION = "3";


	/**
	 * <span class="lang-en">Returns whether this plug-in can process the function having the specified name</span>
	 * <span class="lang-ja">このプラグインが, 指定された名前を持つ関数を実行可能かどうかを返します</span>
	 * .
	 * @param functionName
	 *     <span class="lang-en">The name of the function</span>
	 *     <span class="lang-ja">関数の名前</span>
	 * 
	 * @return
	 *     <span class="lang-en">
	 *     Returns "true" if this plug-in can process the function having the specified name
	 *     </span>
	 *     <span class="lang-ja">
	 *     指定された名前を持つ関数を実行可能な場合に true が返されます
	 *     </span>
	 */
	public abstract boolean isProcessable(String functionName);


	/**
	 * <span class="lang-en">Processes the function having the spacified name</span>
	 * <span class="lang-ja">指定された名前を持つ関数を実行します</span>
	 * .
	 * @param functionName
	 *     <span class="lang-en">The name of the function to be processed</span>
	 *     <span class="lang-ja">実行する関数の名前</span>
	 * 
	 * @param arguments
	 *     <span class="lang-en">An array storing values of all actual arguments</span>
	 *     <span class="lang-ja">全ての実引数の値を格納する配列</span>
	 * 
	 * @return
	 *     <span class="lang-en">An array storing return value of the function</span>
	 *     <span class="lang-ja">関数の戻り値を格納する配列</span>
	 */
	public abstract String[] process( String functionName, String[] args );


	/**
	 * <p>
	 * <span class="lang-en">
	 * Performs the initialization process necessary when this plug-in is connected to the script engine
	 * </span>
	 * <span class="lang-ja">
	 * このプラグインが, スクリプトエンジンに接続される際に必要となる初期化処理を実行します
	 * </span>
	 * .
	 * </p>
	 *
	 * <p>
	 * <span class="lang-en">
	 * As an argument "engineConnector", an object for communicating with the script engine will be passed.
	 * The type of the object depends on the script engine, but it is probably implementing
	 * {@link EngineConnectorInterface1 EngineConnectorInterface1} interface.
	 * </span>
	 * <span class="lang-ja">
	 * 引数 engineConnector には, スクリプトエンジンと情報をやり取りする際に使用するオブジェクトが渡されます. 
	 * このオブジェクトの型はスクリプトエンジンに依存しますが, 恐らくは 
	 * {@link EngineConnectorInterface1 EngineConnectorInterface1} インターフェースを実装しています.
	 * </span>
	 * </p>
	 *
	 * @param engineConnector
	 *     <span class="lang-en">An object for communicating with the script engine</span>
	 *     <span class="lang-ja">スクリプトエンジンと情報をやり取りする際に使用するオブジェクト</span>
	 * 
	 * @throws ConnectorException
	 *     <span class="lang-en">Thrown when the initialization has failed</span>
	 *     <span class="lang-ja">初期化処理に失敗した場合にスローされます</span>
	 */
	public abstract void initializeForConnection(Object engineConnector) throws ConnectorException;


	/**
	 * <p>
	 * <span class="lang-en">
	 * Performs the finalization process necessary when this plug-in is disconnected from the script engine
	 * </span>
	 * <span class="lang-ja">
	 * このプラグインが, スクリプトエンジンから接続解除される際に必要となる終了時処理を実行します
	 * </span>
	 * .
	 * </p>
	 *
	 * <p>
	 * <span class="lang-en">
	 * As an argument "engineConnector", an object for communicating with the script engine will be passed.
	 * The type of the object depends on the script engine, but it is probably implementing
	 * {@link EngineConnectorInterface1 EngineConnectorInterface1} interface.
	 * </span>
	 * <span class="lang-ja">
	 * 引数 engineConnector には, スクリプトエンジンと情報をやり取りする際に使用するオブジェクトが渡されます. 
	 * このオブジェクトの型はスクリプトエンジンに依存しますが, 恐らくは 
	 * {@link EngineConnectorInterface1 EngineConnectorInterface1} インターフェースを実装しています.
	 * </span>
	 * </p>
	 *
	 * @param engineConnector
	 *     <span class="lang-en">An object for communicating with the script engine</span>
	 *     <span class="lang-ja">スクリプトエンジンと情報をやり取りする際に使用するオブジェクト</span>
	 * 
	 * @throws ConnectorException
	 *     <span class="lang-en">Thrown when the finalization has failed</span>
	 *     <span class="lang-ja">終了時処理に失敗した場合にスローされます</span>
	 */
	public abstract void finalizeForDisconnection(Object engineConnector) throws ConnectorException;


	/**
	 * <p>
	 * <span class="lang-en">Performs the initialization process necessary for each execution of a script</span>
	 * <span class="lang-ja">スクリプトの実行毎に必要な初期化処理を実行します</span>
	 * .
	 * </p>
	 *
	 * <p>
	 * <span class="lang-en">
	 * As an argument "engineConnector", an object for communicating with the script engine will be passed.
	 * The type of the object depends on the script engine, but it is probably implementing
	 * {@link EngineConnectorInterface1 EngineConnectorInterface1} interface.
	 * </span>
	 * <span class="lang-ja">
	 * 引数 engineConnector には, スクリプトエンジンと情報をやり取りする際に使用するオブジェクトが渡されます. 
	 * このオブジェクトの型はスクリプトエンジンに依存しますが, 恐らくは 
	 * {@link EngineConnectorInterface1 EngineConnectorInterface1} インターフェースを実装しています.
	 * </span>
	 * </p>
	 *
	 * @param engineConnector
	 *     <span class="lang-en">An object for communicating with the script engine</span>
	 *     <span class="lang-ja">スクリプトエンジンと情報をやり取りする際に使用するオブジェクト</span>
	 * 
	 * @throws ConnectorException
	 *     <span class="lang-en">Thrown when the initialization has failed</span>
	 *     <span class="lang-ja">初期化処理に失敗した場合にスローされます</span>
	 */
	public abstract void initializeForExecution(Object engineConnector) throws ConnectorException;


	/**
	 * <p>
	 * <span class="lang-en">Performs the finalization process necessary for each execution of a script</span>
	 * <span class="lang-ja">スクリプトの実行毎に必要な終了時処理を実行します</span>
	 * .
	 * </p>
	 *
	 * <p>
	 * <span class="lang-en">
	 * As an argument "engineConnector", an object for communicating with the script engine will be passed.
	 * The type of the object depends on the script engine, but it is probably implementing
	 * {@link EngineConnectorInterface1 EngineConnectorInterface1} interface.
	 * </span>
	 * <span class="lang-ja">
	 * 引数 engineConnector には, スクリプトエンジンと情報をやり取りする際に使用するオブジェクトが渡されます. 
	 * このオブジェクトの型はスクリプトエンジンに依存しますが, 恐らくは 
	 * {@link EngineConnectorInterface1 EngineConnectorInterface1} インターフェースを実装しています.
	 * </span>
	 * </p>
	 *
	 * @param engineConnector
	 *     <span class="lang-en">An object for communicating with the script engine</span>
	 *     <span class="lang-ja">スクリプトエンジンと情報をやり取りする際に使用するオブジェクト</span>
	 * 
	 * @throws ConnectorException
	 *     <span class="lang-en">Thrown when the finalization has failed</span>
	 *     <span class="lang-ja">終了時処理に失敗した場合にスローされます</span>
	 */
	public abstract void finalizeForTermination(Object engineConnector) throws ConnectorException;

}
