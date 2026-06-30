package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class e3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f129089d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderCreateContactUI f129090e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(com.tencent.mm.modelbase.f fVar, com.tencent.mm.plugin.finder.ui.FinderCreateContactUI finderCreateContactUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f129089d = fVar;
        this.f129090e = finderCreateContactUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.ui.e3(this.f129089d, this.f129090e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.ui.e3 e3Var = (com.tencent.mm.plugin.finder.ui.e3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        e3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("errType:");
        com.tencent.mm.modelbase.f fVar = this.f129089d;
        sb6.append(fVar != null ? new java.lang.Integer(fVar.f70615a) : null);
        sb6.append(", errCode:");
        sb6.append(fVar != null ? new java.lang.Integer(fVar.f70616b) : null);
        sb6.append(", errMsg:");
        sb6.append(fVar != null ? fVar.f70617c : null);
        com.tencent.mars.xlog.Log.i("Finder.FinderCreateContactUI", sb6.toString());
        android.app.ProgressDialog progressDialog = this.f129090e.U;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1279L, 33L, 1L);
        com.tencent.mm.plugin.finder.ui.FinderCreateContactUI finderCreateContactUI = this.f129090e;
        java.lang.String string = finderCreateContactUI.getString(com.tencent.mm.R.string.cro);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.m7(finderCreateContactUI, string, null, null, 6, null);
        return jz5.f0.f302826a;
    }
}
