package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class py implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.qy f119456d;

    public py(com.tencent.mm.plugin.finder.live.widget.qy qyVar) {
        this.f119456d = qyVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        com.tencent.mm.plugin.finder.live.widget.qy qyVar = this.f119456d;
        qyVar.f119558d.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.oy(((mm2.c1) qyVar.f119560f.P0(mm2.c1.class)).M2, qyVar));
        if (kotlin.jvm.internal.o.b(java.lang.Boolean.valueOf(qyVar.f119561g), bool)) {
            return;
        }
        jf2.k0 k0Var = (jf2.k0) qyVar.f119560f.U0(jf2.k0.class);
        if (k0Var != null) {
            k0Var.a7("FinderLiveVisitorGameEntranceWidget", false);
        }
        kotlin.jvm.internal.o.d(bool);
        qyVar.f119561g = bool.booleanValue();
    }
}
