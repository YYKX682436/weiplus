package com.tencent.mm.protocal.protobuf;

/* loaded from: classes2.dex */
public class FinderJumpInfoRedDot extends com.tencent.mm.protobuf.e {
    public FinderJumpInfoRedDot() {
        super(com.tencent.mm.protobuf.i.n(1, "red_dot_type"), com.tencent.mm.protobuf.i.u(2, "value"));
        this.__printBytes = true;
    }

    public static com.tencent.mm.protocal.protobuf.FinderJumpInfoRedDot create() {
        return new com.tencent.mm.protocal.protobuf.FinderJumpInfoRedDot();
    }

    public final long getRed_dot_type() {
        return getLong(0);
    }

    public final java.lang.String getValue() {
        return getString(1);
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfoRedDot setRed_dot_type(long j17) {
        set(0, java.lang.Long.valueOf(j17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfoRedDot setValue(java.lang.String str) {
        set(1, str);
        return this;
    }
}
