package com.tencent.mm.plugin.voip.ui;

/* loaded from: classes.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f176970d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(java.util.ArrayList arrayList) {
        super(1);
        this.f176970d = arrayList;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        byte[] decode = android.util.Base64.decode(it, 0);
        kotlin.jvm.internal.o.f(decode, "decode(...)");
        this.f176970d.add(new com.tencent.mm.plugin.voip.ui.w(decode[2], decode[3], decode[4], decode[5], decode[6], decode[7], (((byte) (decode[8] & Byte.MAX_VALUE)) << 0) | (((byte) (decode[9] & Byte.MAX_VALUE)) << 8) | (((byte) (decode[10] & Byte.MAX_VALUE)) << com.tencent.wxmm.v2encoder.enumCODEC_vcodec2) | (((byte) (decode[11] & Byte.MAX_VALUE)) << 24)));
        return jz5.f0.f302826a;
    }
}
