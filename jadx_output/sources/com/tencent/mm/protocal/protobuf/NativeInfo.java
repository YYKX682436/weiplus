package com.tencent.mm.protocal.protobuf;

/* loaded from: classes2.dex */
public class NativeInfo extends com.tencent.mm.protobuf.e {
    public NativeInfo() {
        super(com.tencent.mm.protobuf.i.i(1, "native_type"), com.tencent.mm.protobuf.i.u(2, "necessary_params"), com.tencent.mm.protobuf.i.a(3, "necessary_params_bytes"), com.tencent.mm.protobuf.i.r(4, "next_object_info", r45.mt4.class), com.tencent.mm.protobuf.i.u(5, "jump_info_native_by_pass_info"));
        this.__printBytes = true;
    }

    public static com.tencent.mm.protocal.protobuf.NativeInfo create() {
        return new com.tencent.mm.protocal.protobuf.NativeInfo();
    }

    public final java.lang.String getJump_info_native_by_pass_info() {
        return getString(4);
    }

    public final int getNative_type() {
        return getInteger(0);
    }

    public final java.lang.String getNecessary_params() {
        return getString(1);
    }

    public final com.tencent.mm.protobuf.g getNecessary_params_bytes() {
        return getByteString(2);
    }

    public final r45.mt4 getNext_object_info() {
        return (r45.mt4) getCustom(3);
    }

    public final com.tencent.mm.protocal.protobuf.NativeInfo setJump_info_native_by_pass_info(java.lang.String str) {
        set(4, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.NativeInfo setNative_type(int i17) {
        set(0, java.lang.Integer.valueOf(i17));
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.NativeInfo setNecessary_params(java.lang.String str) {
        set(1, str);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.NativeInfo setNecessary_params_bytes(com.tencent.mm.protobuf.g gVar) {
        set(2, gVar);
        return this;
    }

    public final com.tencent.mm.protocal.protobuf.NativeInfo setNext_object_info(r45.mt4 mt4Var) {
        set(3, mt4Var);
        return this;
    }
}
