package cq1;

/* loaded from: classes8.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f221362d;

    /* renamed from: e, reason: collision with root package name */
    public int f221363e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.biz.scheme.BizComSchIntermediateUI f221364f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221365g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.plugin.biz.scheme.BizComSchIntermediateUI bizComSchIntermediateUI, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f221364f = bizComSchIntermediateUI;
        this.f221365g = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cq1.o(this.f221364f, this.f221365g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((cq1.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        dq1.b bVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f221363e;
        com.tencent.mm.plugin.biz.scheme.BizComSchIntermediateUI bizComSchIntermediateUI = this.f221364f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            bizComSchIntermediateUI.f93877h = com.tencent.mm.ui.widget.dialog.u3.f(bizComSchIntermediateUI.getContext(), bizComSchIntermediateUI.getContext().getString(com.tencent.mm.R.string.ggd), true, 3, new cq1.n(bizComSchIntermediateUI));
            com.tencent.mm.ui.widget.dialog.u3 u3Var = bizComSchIntermediateUI.f93877h;
            kotlin.jvm.internal.o.d(u3Var);
            u3Var.show();
            dq1.b bVar2 = new dq1.b();
            if (gm0.j1.b().n()) {
                str = gm0.j1.b().j();
                kotlin.jvm.internal.o.f(str, "getUinString(...)");
            } else {
                str = "";
            }
            bVar2.f242345a = str;
            cq1.s sVar = bizComSchIntermediateUI.f93874e;
            this.f221362d = bVar2;
            this.f221363e = 1;
            sVar.getClass();
            oz5.n nVar = new oz5.n(pz5.f.b(this));
            boolean n17 = gm0.j1.b().n();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("runCheckCgi, isLogin: ");
            sb6.append(n17);
            sb6.append(", url:");
            java.lang.String str2 = this.f221365g;
            sb6.append(str2);
            com.tencent.mars.xlog.Log.i("BizCommonSchemeUrlCgiServe", sb6.toString());
            if (n17) {
                new cq1.t(str2).l().K(new cq1.q(sVar, nVar));
            } else {
                new cq1.u(str2).l().K(new cq1.r(sVar, nVar));
            }
            java.lang.Object a17 = nVar.a();
            if (a17 == aVar) {
                return aVar;
            }
            bVar = bVar2;
            obj = a17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = (dq1.b) this.f221362d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        r45.r00 r00Var = (r45.r00) obj;
        boolean isFinishing = bizComSchIntermediateUI.isFinishing();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (isFinishing) {
            com.tencent.mars.xlog.Log.i(bizComSchIntermediateUI.f93873d, "isFinishing, checkResp illegal!");
            return f0Var;
        }
        if (r00Var == null || r00Var.f384395e == null) {
            com.tencent.mars.xlog.Log.i(bizComSchIntermediateUI.f93873d, "empty resp!");
            bizComSchIntermediateUI.Z6();
            return f0Var;
        }
        java.lang.String str3 = bizComSchIntermediateUI.f93873d;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("antispam_type = ");
        r45.o00 o00Var = r00Var.f384398h;
        sb7.append(o00Var != null ? new java.lang.Integer(o00Var.f381792e) : null);
        com.tencent.mars.xlog.Log.i(str3, sb7.toString());
        r45.o00 o00Var2 = r00Var.f384398h;
        java.lang.Integer num = o00Var2 != null ? new java.lang.Integer(o00Var2.f381792e) : null;
        cq1.a[] aVarArr = cq1.a.f221326d;
        if (num != null && num.intValue() == 1) {
            com.tencent.mm.plugin.biz.scheme.BizComSchIntermediateUI.T6(bizComSchIntermediateUI, r00Var, bVar);
        } else {
            cq1.a[] aVarArr2 = cq1.a.f221326d;
            if (num != null && num.intValue() == 2) {
                com.tencent.mm.plugin.biz.scheme.BizComSchIntermediateUI.U6(bizComSchIntermediateUI, r00Var, bVar);
            } else {
                cq1.a[] aVarArr3 = cq1.a.f221326d;
                if (num != null && num.intValue() == 3) {
                    com.tencent.mm.plugin.biz.scheme.BizComSchIntermediateUI.U6(bizComSchIntermediateUI, r00Var, bVar);
                } else {
                    bizComSchIntermediateUI.Z6();
                }
            }
        }
        return f0Var;
    }
}
