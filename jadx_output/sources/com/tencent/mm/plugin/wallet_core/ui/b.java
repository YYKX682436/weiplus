package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class b implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.c f180140d;

    public b(com.tencent.mm.plugin.wallet_core.ui.c cVar) {
        this.f180140d = cVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        rv.v2 v2Var = (rv.v2) i95.n0.c(rv.v2.class);
        com.tencent.mm.plugin.wallet_core.ui.c cVar = this.f180140d;
        java.lang.String d17 = cVar.f180157e.d1();
        ((qv.q) v2Var).getClass();
        qk.o b17 = r01.z.b(d17);
        ((qv.e) ((rv.m2) i95.n0.c(rv.m2.class))).wi(b17, (android.app.Activity) cVar.f180156d, cVar.f180157e, false);
        cVar.a();
    }
}
