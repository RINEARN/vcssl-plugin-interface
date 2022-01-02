/*
 * ================================================================
 * Scalar Data Accessor Interface 1 (SDAI 1) for Boolean Type Data
 * ( for VCSSL / Vnano Plug-in Development )
 * ----------------------------------------------------------------
 * This file is released under CC0.
 * Written in 2020-2022 by RINEARN (Fumihiro Matsui)
 * ================================================================
 */

package org.vcssl.connect;

/**
 * <p>
 * <span class="lang-en">
 * A data-I/O interface (abbreviated as Bool SDAI 1), mainly implemented by data container objects of language processor systems
 * </span>
 * <span class="lang-ja">
 * 主に処理系のデータコンテナが実装してサポートする, データ入出力インターフェースの一つ（略称 Bool SDAI 1）です
 * </span>
 * .
 * </p>
 *
 * <p>
 * <span class="lang-en">
 * In this package, multiple data I/O interfaces are provided for passing/receiving data 
 * without any data-conversions, between script-engine-side and plug-in-side, if required.
 * In them, this interface Bool SDAI 1 provides I/O methods of a boolean-type scalar value.
 * </span>
 * <span class="lang-ja">
 * このパッケージ内では, スクリプトエンジン側とプラグイン側との間で, 
 * 必要に応じてデータ型の変換なしにデータを受け渡しするための, 
 * 複数のデータ入出力インターフェースが提供されています. 
 * その中でこの Bool SDAI 1 は, boolean 型のスカラ値に対する入出力機能を提供します. 
 * </span>
 * </p>
 */
public interface BoolScalarDataAccessorInterface1 {

	/**
	 * <span class="lang-en">The type name of this interface (value: "BOOL_SDAI") referred when the plug-in will be loaded</span>
	 * <span class="lang-ja">プラグインのロード時に参照される, このインターフェースの形式名（値: "BOOL_SDAI"）です</span>
	 * .
	 */
	public static final String INTERFACE_TYPE = "BOOL_SDAI";

	/**
	 * <span class="lang-en">The generation of this interface (value: "1")</span>
	 * <span class="lang-ja">このインターフェースの世代名です（値: "1"）</span>
	 * .
	 */
	public static final String INTERFACE_GENERATION = "1";


	/**
	 * <span class="lang-en">Sets the boolean-type scalar value</span>
	 * <span class="lang-ja">boolean 型のスカラ値を設定します</span>
	 * .
	 * @param data
	 *     <span class="lang-en">The scalar value to be set</span>
	 *     <span class="lang-ja">設定するスカラ値</span>
	 */
	public abstract void setBoolScalarData(boolean data);


	/**
	 * <span class="lang-en">Gets the boolean-type scalar value</span>
	 * <span class="lang-ja">boolean 型のスカラ値を取得します</span>
	 * .
	 * @return
	 *     <span class="lang-en">The scalar value</span>
	 *     <span class="lang-ja">スカラ値</span>
	 */
	public abstract boolean getBoolScalarData();


	/**
	 * <span class="lang-en">Returns whether any boolean-type scalar value can be gotten or not</span>
	 * <span class="lang-ja">boolean 型のスカラ値を取得可能かどうかを判定します</span>
	 * .
	 * @return
	 *     <span class="lang-en">Returns "true" if any boolean-type scalar value can be gotton</span>
	 *     <span class="lang-ja">boolean 型のスカラ値を取得可能であれば true が返されます</span>
	 */
	public abstract boolean hasBoolScalarData();
}
