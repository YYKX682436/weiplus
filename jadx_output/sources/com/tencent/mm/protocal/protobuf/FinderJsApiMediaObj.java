package com.tencent.mm.protocal.protobuf;

/* loaded from: classes.dex */
public class FinderJsApiMediaObj extends com.tencent.mm.protobuf.e {
    public FinderJsApiMediaObj() {
        super(com.tencent.mm.protobuf.i.u(1, "mediaPath"), com.tencent.mm.protobuf.i.i(2, "mediaType"), com.tencent.mm.protobuf.i.r(3, "thumbInfo", com.tencent.mm.protocal.protobuf.FinderJsApiMediaThumbInfo.class));
        this.__printBytes = true;
    }

    public static com.tencent.mm.protocal.protobuf.FinderJsApiMediaObj create() {
        return new com.tencent.mm.protocal.protobuf.FinderJsApiMediaObj();
    }

    public final java.lang.String getMediaPath() {
        return getString(0);
    }

    public final int getMediaType() {
        return getInteger(1);
    }

    public final com.tencent.mm.protocal.protobuf.FinderJsApiMediaThumbInfo getThumbInfo() {
        return (com.tencent.mm.protocal.protobuf.FinderJsApiMediaThumbInfo) getCustom(2);
    }

    public final com.tencent.mm.protocal.protobuf.FinderJsApiMediaObj setMediaPath(java.lang.String str) {
        set(0, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJsApiMediaObj setMediaType(int i17) {
        set(1, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJsApiMediaObj setThumbInfo(com.tencent.mm.protocal.protobuf.FinderJsApiMediaThumbInfo finderJsApiMediaThumbInfo) {
        set(2, finderJsApiMediaThumbInfo);
        return this;
    }
}
