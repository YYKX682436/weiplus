package com.tencent.thumbplayer.utils;

/* loaded from: classes15.dex */
public class TPOptionalParamObjectChecker {
    private static final java.util.HashMap<java.lang.Integer, java.lang.Class> mMapKeyToClass;

    static {
        java.util.HashMap<java.lang.Integer, java.lang.Class> hashMap = new java.util.HashMap<>();
        mMapKeyToClass = hashMap;
        hashMap.put(414, com.tencent.thumbplayer.api.TPAudioAttributes.class);
        hashMap.put(507, com.tencent.thumbplayer.api.TPSubtitleRenderModel.class);
        hashMap.put(140, com.tencent.thumbplayer.api.TPJitterBufferConfig.class);
    }

    public static boolean checkObjectType(@com.tencent.thumbplayer.api.TPCommonEnum.TPOptionalId int i17, java.lang.Object obj) {
        java.lang.Class cls;
        return (obj == null || (cls = mMapKeyToClass.get(java.lang.Integer.valueOf(i17))) == null || obj.getClass() != cls) ? false : true;
    }
}
