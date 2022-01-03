/*
 * ==================================================
 * Connector Implementation Container
 * --------------------------------------------------
 * This file is released under CC0.
 * Written in 2019-2022 by RINEARN (Fumihiro Matsui)
 * ==================================================
 */

package org.vcssl.connect;

/**
 * <span class="lang-en">An object for storing the loaded result of {@link ConnectorImplementationLoader}</span>
 * <span class="lang-ja">{@link ConnectorImplementationLoader} によるロード結果を格納するためのオブジェクトです</span>
 * .
 */
public class ConnectorImplementationContainer {

	/**
	 * <span class="lang-en">Stores the loaded object implementing plug-in connector interfaces</span>
	 * <span class="lang-ja">読み込まれたプラグイン接続インターフェース実装オブジェクトを保持します</span>
	 * .
	 */
	private Object connectorImplementation = null;

	/**
	 * <span class="lang-en">Stores the (abbreviated) type name of the interface, implemented by the loaded plug-in</span>
	 * <span class="lang-ja">読み込まれたプラグインが実装している, インターフェースの形式名（略称）を保持します</span>
	 * .
	 */
	private String interfaceType = null;

	/**
	 * <span class="lang-en">Stores the generation of the interface, implemented by the loaded plug-in</span>
	 * <span class="lang-ja">読み込まれたプラグインが実装している, インターフェースの世代を保持します</span>
	 * .
	 */
	private String interfacaGeneration = null;


	/**
	 * <span class="lang-en">Creates an instance storing specified loaded results</span>
	 * <span class="lang-ja">指定されたロード結果を格納するインスタンスを生成します</span>
	 * .
	 * @param connectorImplementation
	 *     <span class="lang-en">The loaded object implementing plug-in connector interfaces</span>
	 *     <span class="lang-ja">読み込まれたプラグイン接続インターフェース実装オブジェクト</span>
	 * 
	 * @param interfaceType
	 *     <span class="lang-en">The (abbreviated) type name of the interface</span>
	 *     <span class="lang-ja">インターフェースの形式名（略称）</span>
	 * 
	 * @param interfaceGeneration
	 *     <span class="lang-en">The generation of the interface</span>
	 *     <span class="lang-ja">インターフェースの世代</span>
	 */
	public ConnectorImplementationContainer(
			Object connectorImplementation, String interfaceType, String interfaceGeneration) {

		this.connectorImplementation = connectorImplementation;
		this.interfaceType = interfaceType;
		this.interfacaGeneration = interfaceGeneration;
	}


	/**
	 * <span class="lang-en">Returns the loaded object implementing plug-in connector interfaces</span>
	 * <span class="lang-ja">読み込まれたプラグイン接続インターフェース実装オブジェクトを返します</span>
	 * .
	 * @return
	 *     <span class="lang-en">The loaded object implementing plug-in connector interfaces</span>
	 *     <span class="lang-ja">読み込まれたプラグイン接続インターフェース実装オブジェクト</span>
	 */
	public Object getConnectorImplementation() {
		return this.connectorImplementation;
	}


	/**
	 * <span class="lang-en">Returns the (abbreviated) type name of the interface, implemented by the loaded plug-in</span>
	 * <span class="lang-ja">読み込まれたプラグインが実装している, インターフェースの形式名（略称）を返します</span>
	 * .
	 * @return
	 *     <span class="lang-en">The (abbreviated) type name of the interface</span>
	 *     <span class="lang-ja">インターフェースの形式名（略称）</span>
	 */
	public String getInterfaceType() {
		return this.interfaceType;
	}


	/**
	 * <span class="lang-en">Returns the generation of the interface, implemented by the loaded plug-in</span>
	 * <span class="lang-ja">読み込まれたプラグインが実装している, インターフェースの世代を返します</span>
	 * .
	 * @return
	 *     <span class="lang-en">The generation of the interface</span>
	 *     <span class="lang-ja">インターフェースの世代</span>
	 */
	public String getInterfaceGeneration() {
		return this.interfacaGeneration;
	}
}
