package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class hj extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.hm f112817d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj(com.tencent.mm.plugin.finder.live.plugin.hm hmVar) {
        super(3);
        this.f112817d = hmVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        ((java.lang.Boolean) obj2).booleanValue();
        if (((java.lang.Boolean) obj3).booleanValue()) {
            float abs = java.lang.Math.abs(floatValue);
            com.tencent.mm.plugin.finder.live.plugin.hm hmVar = this.f112817d;
            if (abs > ((java.lang.Number) ((jz5.n) hmVar.P1).getValue()).intValue()) {
                hmVar.E1().g();
            }
        }
        return jz5.f0.f302826a;
    }
}
