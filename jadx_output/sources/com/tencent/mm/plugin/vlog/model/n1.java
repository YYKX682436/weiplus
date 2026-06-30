package com.tencent.mm.plugin.vlog.model;

/* loaded from: classes10.dex */
public final class n1 implements wm5.f {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.vlog.model.h1 f175697a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f175698b;

    /* renamed from: c, reason: collision with root package name */
    public final uq5.p f175699c;

    public n1(com.tencent.mm.plugin.vlog.model.h1 composition, java.util.HashMap labelMap, uq5.p pVar) {
        kotlin.jvm.internal.o.g(composition, "composition");
        kotlin.jvm.internal.o.g(labelMap, "labelMap");
        this.f175697a = composition;
        this.f175698b = labelMap;
        this.f175699c = pVar;
    }

    @Override // wm5.f
    public void a(long j17) {
        uq5.p pVar;
        com.tencent.mm.plugin.vlog.model.i1 c17 = com.tencent.mm.plugin.vlog.model.x.c(this.f175697a, j17);
        java.lang.Integer num = (java.lang.Integer) this.f175698b.get(c17 != null ? c17.f175616a : null);
        int intValue = num != null ? num.intValue() : -1;
        if (!((java.util.ArrayList) so4.g.f410784i).contains(java.lang.Integer.valueOf(intValue)) || (pVar = this.f175699c) == null) {
            return;
        }
        com.tencent.mm.xeffect.effect.VLogEffectJNI.INSTANCE.setScene$renderlib_release(pVar.f430269c, intValue);
    }

    @Override // wm5.f
    public void b() {
    }
}
