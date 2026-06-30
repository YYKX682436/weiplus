package ut2;

/* loaded from: classes3.dex */
public final class i3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f430919d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ut2.s3 f430920e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gk2.e f430921f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f430922g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.l f430923h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(ut2.s3 s3Var, gk2.e eVar, cm2.m0 m0Var, com.tencent.mm.plugin.finder.live.plugin.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f430920e = s3Var;
        this.f430921f = eVar;
        this.f430922g = m0Var;
        this.f430923h = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ut2.i3(this.f430920e, this.f430921f, this.f430922g, this.f430923h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ut2.i3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f430919d;
        cm2.m0 m0Var = this.f430922g;
        gk2.e eVar = this.f430921f;
        ut2.s3 s3Var = this.f430920e;
        st2.c2 c2Var = st2.c2.f412249a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            android.content.Context context = s3Var.itemView.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            this.f430919d = 1;
            obj = c2Var.h((com.tencent.mm.ui.MMActivity) context, eVar, m0Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        l81.b1 b1Var = (l81.b1) obj;
        if (b1Var != null) {
            com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = b1Var.f317041s;
            if (appBrandLaunchReferrer == null) {
                appBrandLaunchReferrer = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer();
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.lang.String string = m0Var.f43368v.getString(26);
            if (string == null) {
                string = "";
            }
            jSONObject.put("cookies", string);
            appBrandLaunchReferrer.f77322d = 1;
            appBrandLaunchReferrer.f77325g = jSONObject.toString();
            b1Var.f317041s = appBrandLaunchReferrer;
            c2Var.k(b1Var);
            dk2.q4 q4Var = dk2.q4.f233938a;
            android.content.Context context2 = s3Var.itemView.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f430923h;
            q4Var.n(context2, eVar, b1Var, lVar != null ? lVar.Y0() : null);
            androidx.recyclerview.widget.f2 f2Var = s3Var.L;
            tt2.e1 e1Var = f2Var instanceof tt2.e1 ? (tt2.e1) f2Var : null;
            if (e1Var != null) {
                tt2.e1.W(e1Var, ml2.f4.f327435i, m0Var, 3, b1Var, s3Var, null, 32, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
