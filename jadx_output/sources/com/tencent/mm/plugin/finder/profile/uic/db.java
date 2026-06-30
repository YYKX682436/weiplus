package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class db extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f123623d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f123624e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db(com.tencent.mm.plugin.finder.profile.uic.ob obVar, ya2.b2 b2Var) {
        super(1);
        this.f123623d = obVar;
        this.f123624e = b2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.v31 v31Var;
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.profile.uic.ob obVar = this.f123623d;
        if (obVar.S1 == null) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) obVar.getContext(), 1, true);
            com.tencent.mm.plugin.finder.profile.uic.l2 l2Var = (com.tencent.mm.plugin.finder.profile.uic.l2) com.tencent.mm.plugin.finder.profile.uic.p2.f124101r.get(obVar.getUsername());
            if (l2Var != null && (v31Var = l2Var.A) != null) {
                long j17 = v31Var.f387850g;
                if (j17 > 0) {
                    k0Var.q(obVar.getResources().getString(com.tencent.mm.R.string.nic, k35.m1.d(obVar.getContext().getString(com.tencent.mm.R.string.nib), j17)), 17);
                }
            }
            k0Var.f211872n = new com.tencent.mm.plugin.finder.profile.uic.x6(obVar);
            k0Var.f211881s = new com.tencent.mm.plugin.finder.profile.uic.y6(obVar, this.f123624e);
            k0Var.f211854d = new com.tencent.mm.plugin.finder.profile.uic.z6(obVar);
            obVar.S1 = k0Var;
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var2 = obVar.S1;
        if (k0Var2 != null && !k0Var2.i()) {
            k0Var2.v();
        }
        return jz5.f0.f302826a;
    }
}
