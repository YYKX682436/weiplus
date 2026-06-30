package com.tencent.mm.protobuf;

/* loaded from: classes7.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.protobuf.d f192154d = new com.tencent.mm.protobuf.d();

    public d() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String format = java.lang.String.format("%02X", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Byte.valueOf(((java.lang.Number) obj).byteValue())}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        return format;
    }
}
