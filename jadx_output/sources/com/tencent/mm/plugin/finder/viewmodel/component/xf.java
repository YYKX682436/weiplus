package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes10.dex */
public final class xf extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f136456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f136457e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f136458f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f136459g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.gg f136460h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f136461i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f136462m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xf(boolean z17, boolean z18, boolean z19, com.tencent.mm.plugin.finder.viewmodel.component.gg ggVar, boolean z27, boolean z28, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f136457e = z17;
        this.f136458f = z18;
        this.f136459g = z19;
        this.f136460h = ggVar;
        this.f136461i = z27;
        this.f136462m = z28;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.xf(this.f136457e, this.f136458f, this.f136459g, this.f136460h, this.f136461i, this.f136462m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.viewmodel.component.xf) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        r45.qt2 qt2Var;
        r45.qt2 qt2Var2;
        r45.qt2 qt2Var3;
        com.tencent.mm.plugin.finder.storage.FeedData feedData;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f136456d;
        boolean z17 = this.f136457e;
        com.tencent.mm.plugin.finder.viewmodel.component.gg ggVar = this.f136460h;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kd2.o0 o0Var = kd2.p1.N;
            o0Var.a().f93132d.f93058s = z17;
            kd2.p1 a17 = o0Var.a();
            boolean z18 = this.f136458f;
            boolean z19 = this.f136459g;
            com.tencent.mm.plugin.finder.feed.model.ea eaVar = ggVar.f134513o;
            boolean z27 = this.f136461i;
            this.f136456d = 1;
            obj = kd2.p1.y0(a17, z18, false, z19, eaVar, z27, this, 2, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        if (booleanValue) {
            ggVar.f134508g = true;
        }
        ggVar.f134509h = booleanValue;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addFloatBall: ret=");
        sb6.append(booleanValue);
        sb6.append(", needTriggerBack=");
        boolean z28 = this.f136462m;
        sb6.append(z28);
        sb6.append(", isPassive=");
        sb6.append(this.f136458f);
        sb6.append(", addFromSwipe=");
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, sb6.toString());
        if (z28 && booleanValue) {
            if (!ggVar.P6(true)) {
                android.app.Activity activity = ggVar.getContext();
                kotlin.jvm.internal.o.g(activity, "activity");
                pf5.z zVar = pf5.z.f353948a;
                if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                if (!((com.tencent.mm.plugin.finder.viewmodel.component.gg) zVar.a((androidx.appcompat.app.AppCompatActivity) activity).a(com.tencent.mm.plugin.finder.viewmodel.component.gg.class)).f134514p) {
                    com.tencent.mm.plugin.finder.viewmodel.component.gg.f134504z = true;
                    com.tencent.mars.xlog.Log.i(pf5.o.TAG, "resumeFromClickFloatBallAndBack:true");
                }
                ggVar.f134514p = true;
                ggVar.getActivity().onBackPressed();
            }
            kd2.o0 o0Var2 = kd2.p1.N;
            kd2.b0 E0 = o0Var2.a().E0();
            androidx.appcompat.app.AppCompatActivity context = ggVar.getActivity();
            E0.getClass();
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            cl0.g gVar = new cl0.g();
            java.lang.String str3 = o0Var2.a().D;
            java.lang.Object obj2 = "";
            if (str3 == null) {
                str3 = "";
            }
            gVar.h("float_frame_id", str3);
            kd2.q0 q0Var = o0Var2.a().C;
            gVar.h("feedid", (q0Var == null || (feedData = q0Var.f306806g) == null) ? "" : pm0.v.u(feedData.getFeedId()));
            kd2.p1 p1Var = E0.f306709a;
            kd2.q0 q0Var2 = p1Var.f306787x;
            if (q0Var2 == null || (qt2Var3 = q0Var2.f306803d) == null || (str = qt2Var3.getString(2)) == null) {
                str = "";
            }
            gVar.h("source_tabcontextid", str);
            kd2.q0 q0Var3 = p1Var.f306787x;
            if (q0Var3 == null || (qt2Var2 = q0Var3.f306803d) == null || (str2 = qt2Var2.getString(1)) == null) {
                str2 = "";
            }
            gVar.h("source_contextid", str2);
            kd2.q0 q0Var4 = p1Var.f306787x;
            if (q0Var4 != null && (qt2Var = q0Var4.f306803d) != null) {
                obj2 = java.lang.Integer.valueOf(qt2Var.getInteger(5));
            }
            gVar.h("source_commentscene", obj2);
            com.tencent.mm.plugin.finder.report.b6.d(b6Var, V6, "button_create_float_frame", 1, gVar, false, null, 48, null);
        }
        return jz5.f0.f302826a;
    }
}
