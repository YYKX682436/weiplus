package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class b4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f128927d;

    /* renamed from: e, reason: collision with root package name */
    public int f128928e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderCreateContactUI f128929f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f128930g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.hz0 f128931h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.hz0 f128932i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f128933m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f128934n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(com.tencent.mm.plugin.finder.ui.FinderCreateContactUI finderCreateContactUI, java.lang.String str, r45.hz0 hz0Var, r45.hz0 hz0Var2, kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.f0 f0Var2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f128929f = finderCreateContactUI;
        this.f128930g = str;
        this.f128931h = hz0Var;
        this.f128932i = hz0Var2;
        this.f128933m = f0Var;
        this.f128934n = f0Var2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.ui.b4(this.f128929f, this.f128930g, this.f128931h, this.f128932i, this.f128933m, this.f128934n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.ui.b4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object D4;
        kotlin.coroutines.Continuation continuation;
        com.tencent.mm.plugin.finder.ui.FinderCreateContactUI finderCreateContactUI;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f128928e;
        com.tencent.mm.plugin.finder.ui.FinderCreateContactUI finderCreateContactUI2 = this.f128929f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            g92.b bVar = g92.b.f269769e;
            com.tencent.mm.plugin.finder.ui.a3 a3Var = com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.H1;
            m92.a aVar2 = new m92.a("FinderCreateUser_" + java.lang.System.nanoTime());
            java.lang.String str = com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.J1;
            kotlin.jvm.internal.o.g(str, "<set-?>");
            aVar2.f324968b = str;
            java.lang.String str2 = finderCreateContactUI2.D1 ? com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.L1 : "";
            kotlin.jvm.internal.o.g(str2, "<set-?>");
            aVar2.f324969c = str2;
            java.lang.String str3 = this.f128930g;
            aVar2.f324970d = str3 != null ? str3 : "";
            aVar2.f324971e = this.f128931h;
            aVar2.f324972f = this.f128932i;
            aVar2.f324973g = this.f128933m.f310116d;
            aVar2.f324974h = this.f128934n.f310116d;
            aVar2.f324975i = (!com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.S1 || finderCreateContactUI2.C1) ? 2 : 1;
            aVar2.f324976j = finderCreateContactUI2.C1 ? 1 : 0;
            r45.fa0 fa0Var = new r45.fa0();
            int i18 = finderCreateContactUI2.Y;
            if ((i18 > 0) == false) {
                i18 = finderCreateContactUI2.C1 ? 4 : finderCreateContactUI2.D1 ? 2 : 0;
            }
            fa0Var.set(0, java.lang.Integer.valueOf(i18));
            fa0Var.set(1, finderCreateContactUI2.F1);
            fa0Var.set(2, finderCreateContactUI2.E1);
            fa0Var.set(3, java.lang.Long.valueOf(finderCreateContactUI2.Z));
            aVar2.f324977k = fa0Var;
            this.f128928e = 1;
            D4 = bVar.D4(aVar2, this);
            if (D4 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            D4 = ((kotlin.Result) obj).getValue();
        }
        if (kotlin.Result.m528isSuccessimpl(D4)) {
            r45.r01 r01Var = (r45.r01) D4;
            android.app.ProgressDialog progressDialog = finderCreateContactUI2.U;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = r01Var != null ? (com.tencent.mm.protocal.protobuf.FinderContact) r01Var.getCustom(1) : null;
            if (finderContact != null) {
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.C(1585L, 1L, 1L);
                com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                int i19 = com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.O1;
                int i27 = com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.N1;
                int i28 = com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.M1;
                int i29 = finderCreateContactUI2.V;
                boolean z17 = com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.S1;
                java.lang.String str4 = com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.T1;
                android.widget.EditText editText = finderCreateContactUI2.f128546w;
                if (editText == null) {
                    kotlin.jvm.internal.o.o("nickEdt");
                    throw null;
                }
                boolean z18 = !kotlin.jvm.internal.o.b(str4, editText.getText().toString());
                com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
                com.tencent.mm.plugin.finder.viewmodel.component.ny e17 = iyVar.e(finderCreateContactUI2);
                o3Var.mj(0, 1, i19, true, i27, i28, i29, z17, z18, e17 != null ? e17.V6() : null);
                g0Var.C(1279L, 32L, 1L);
                android.content.Intent intent = new android.content.Intent();
                if (finderCreateContactUI2.B1) {
                    intent.putExtra("finder_username", finderContact.getUsername());
                    intent.putExtra("KEY_FINDER_SELF_FLAG", true);
                    com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar, finderCreateContactUI2, intent, 0L, null, 0, 0, false, 0, null, 508, null);
                    finderCreateContactUI = finderCreateContactUI2;
                    ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).mk(finderCreateContactUI, intent);
                } else {
                    finderCreateContactUI = finderCreateContactUI2;
                }
                intent.putExtra("KEY_FINDER_USERNAME_SELF", finderContact.getUsername());
                intent.putExtra("KEY_FINDER_NICK_NAME", finderContact.getNickname());
                intent.putExtra("KEY_FINDER_AVATAR", finderContact.getHeadUrl());
                com.tencent.mm.protocal.protobuf.FinderAuthInfo authInfo = finderContact.getAuthInfo();
                intent.putExtra("KEY_FINDER_AUTHOR_INFO", authInfo != null ? authInfo.toByteArray() : null);
                finderCreateContactUI.setResult(1, intent);
                finderCreateContactUI.finish();
                finderCreateContactUI.i7(1);
                continuation = null;
            } else {
                continuation = null;
                finderCreateContactUI = finderCreateContactUI2;
                finderCreateContactUI.i7(3);
            }
            pm0.v.X(com.tencent.mm.plugin.finder.ui.i3.f129347d);
        } else {
            continuation = null;
            finderCreateContactUI = finderCreateContactUI2;
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(D4);
        if (m524exceptionOrNullimpl != null && (m524exceptionOrNullimpl instanceof rm0.j)) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            com.tencent.mm.plugin.finder.ui.a4 a4Var = new com.tencent.mm.plugin.finder.ui.a4(finderCreateContactUI, m524exceptionOrNullimpl, continuation);
            this.f128927d = D4;
            this.f128928e = 2;
            if (kotlinx.coroutines.l.g(g3Var, a4Var, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f302826a;
    }
}
