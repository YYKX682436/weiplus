package com.tencent.mm.protocal.protobuf;

/* loaded from: classes.dex */
public class FinderJsApiMediaThumbInfo extends com.tencent.mm.protobuf.e {
    public FinderJsApiMediaThumbInfo() {
        super(com.tencent.mm.protobuf.i.i(1, "thumbWidth"), com.tencent.mm.protobuf.i.i(2, "thumbHeight"), com.tencent.mm.protobuf.i.u(3, "thumbPath"));
        this.__printBytes = true;
    }

    public static com.tencent.mm.protocal.protobuf.FinderJsApiMediaThumbInfo create() {
        return new com.tencent.mm.protocal.protobuf.FinderJsApiMediaThumbInfo();
    }

    public final int getThumbHeight() {
        return getInteger(1);
    }

    public final java.lang.String getThumbPath() {
        return getString(2);
    }

    public final int getThumbWidth() {
        return getInteger(0);
    }

    public final com.tencent.mm.protocal.protobuf.FinderJsApiMediaThumbInfo setThumbHeight(int i17) {
        set(1, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJsApiMediaThumbInfo setThumbPath(java.lang.String str) {
        set(2, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJsApiMediaThumbInfo setThumbWidth(int i17) {
        set(0, java.lang.Integer.valueOf(i17));
        return this;
    }
}
