package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class da implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.fa f112242d;

    public da(com.tencent.mm.plugin.finder.live.plugin.fa faVar) {
        this.f112242d = faVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mm.plugin.finder.live.plugin.fa faVar = this.f112242d;
        mm2.c1 c1Var = (mm2.c1) faVar.P0(mm2.c1.class);
        if (!c1Var.U7() && c1Var.l7()) {
            ((mm2.c1) faVar.P0(mm2.c1.class)).w7();
            pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.z9(faVar, str));
        }
        return jz5.f0.f302826a;
    }
}
