package tt2;

/* loaded from: classes3.dex */
public final class b1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f421837d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tt2.e1 f421838e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f421839f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ut2.s3 f421840g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.bd5 f421841h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(tt2.e1 e1Var, so2.j5 j5Var, ut2.s3 s3Var, r45.bd5 bd5Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f421838e = e1Var;
        this.f421839f = j5Var;
        this.f421840g = s3Var;
        this.f421841h = bd5Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new tt2.b1(this.f421838e, this.f421839f, this.f421840g, this.f421841h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((tt2.b1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String string;
        com.tencent.mm.plugin.finder.live.plugin.l lVar;
        dk2.xf W0;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f421837d;
        so2.j5 j5Var = this.f421839f;
        tt2.e1 e1Var = this.f421838e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            st2.c2 c2Var = st2.c2.f412249a;
            android.content.Context context = e1Var.f421880h;
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            this.f421837d = 1;
            obj = c2Var.g((com.tencent.mm.ui.MMActivity) context, e1Var.f421882m, (cm2.m0) j5Var, this);
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
            java.lang.String str = "";
            if (e1Var.f421881i) {
                ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                ml2.y4 y4Var = ml2.j0.f327583i;
                java.lang.String str2 = b1Var.f317014b;
                y4Var.getClass();
                if (str2 == null) {
                    str2 = "";
                }
                y4Var.f328292d = str2;
            }
            com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = b1Var.f317041s;
            if (appBrandLaunchReferrer == null) {
                appBrandLaunchReferrer = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer();
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            cm2.m0 m0Var = (cm2.m0) j5Var;
            java.lang.String string2 = m0Var.f43368v.getString(26);
            if (string2 == null) {
                string2 = "";
            }
            jSONObject.put("cookies", string2);
            appBrandLaunchReferrer.f77322d = 1;
            appBrandLaunchReferrer.f77325g = jSONObject.toString();
            b1Var.f317041s = appBrandLaunchReferrer;
            ut2.s3 s3Var = this.f421840g;
            android.content.Context context2 = s3Var.itemView.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.tencent.mm.plugin.finder.live.viewmodel.aa) ((zy2.v9) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).c(zy2.v9.class))).U6(((mm2.e1) e1Var.f421882m.a(mm2.e1.class)).f328988r.getLong(0), b1Var);
            zl2.r4 r4Var = zl2.r4.f473950a;
            android.content.Context context3 = e1Var.f421880h;
            r4Var.h3(context3, true);
            st2.h1 h1Var = e1Var.f421891v;
            if (h1Var != null && (lVar = h1Var.f412337h) != null && (W0 = lVar.W0()) != null) {
                kotlin.jvm.internal.o.e(context3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                ((dk2.r4) W0).l0((com.tencent.mm.ui.MMActivity) context3, m0Var, new tt2.a1(e1Var, b1Var, j5Var));
            }
            ml2.f4 f4Var = ml2.f4.f327437m;
            jz5.l[] lVarArr = new jz5.l[1];
            r45.bd5 bd5Var = this.f421841h;
            if (bd5Var != null && (string = bd5Var.getString(0)) != null) {
                str = string;
            }
            lVarArr[0] = new jz5.l("buy_btn_word", str);
            e1Var.V(f4Var, m0Var, 1, b1Var, s3Var, kz5.c1.l(lVarArr));
        }
        return jz5.f0.f302826a;
    }
}
