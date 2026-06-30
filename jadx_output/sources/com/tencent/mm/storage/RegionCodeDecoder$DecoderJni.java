package com.tencent.mm.storage;

/* loaded from: classes12.dex */
class RegionCodeDecoder$DecoderJni {
    static {
        com.tencent.mm.sdk.platformtools.r9.a();
    }

    public static native void buildFromFile(java.lang.String str);

    public static native com.tencent.mm.storage.RegionCodeDecoder$Region[] getCities(java.lang.String str, java.lang.String str2, java.lang.String str3);

    public static native com.tencent.mm.storage.RegionCodeDecoder$Region[] getCountries(java.lang.String str);

    public static native java.lang.String getLocName(java.lang.String str);

    public static native com.tencent.mm.storage.RegionCodeDecoder$Region[] getProvinces(java.lang.String str, java.lang.String str2);

    public static native void release();
}
