package sg0;

/* loaded from: classes8.dex */
public final class v2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f407829d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f407830e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f407831f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407832g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f407833h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ sg0.w2 f407834i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407835m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f407836n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f407837o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f407838p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407839q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f407840r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f407841s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f407842t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f407843u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f407844v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(int i17, java.lang.String str, androidx.appcompat.app.AppCompatActivity appCompatActivity, sg0.w2 w2Var, java.lang.String str2, boolean z17, boolean z18, boolean z19, java.lang.String str3, java.util.Map map, boolean z27, long j17, android.view.ViewGroup viewGroup, kotlinx.coroutines.y0 y0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f407831f = i17;
        this.f407832g = str;
        this.f407833h = appCompatActivity;
        this.f407834i = w2Var;
        this.f407835m = str2;
        this.f407836n = z17;
        this.f407837o = z18;
        this.f407838p = z19;
        this.f407839q = str3;
        this.f407840r = map;
        this.f407841s = z27;
        this.f407842t = j17;
        this.f407843u = viewGroup;
        this.f407844v = y0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        sg0.v2 v2Var = new sg0.v2(this.f407831f, this.f407832g, this.f407833h, this.f407834i, this.f407835m, this.f407836n, this.f407837o, this.f407838p, this.f407839q, this.f407840r, this.f407841s, this.f407842t, this.f407843u, this.f407844v, continuation);
        v2Var.f407830e = obj;
        return v2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((sg0.v2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        ou4.d0 wi6;
        ou4.d0 d0Var;
        androidx.lifecycle.o oVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f407829d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        try {
            try {
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.hitest.WebSearchFlutterService", "tryShowSearchResultPage failed: " + e17.getMessage(), e17);
                java.lang.String str = (java.lang.String) this.f407834i.f407850n.remove(new java.lang.Long(this.f407842t));
                if (str != null) {
                    try {
                        ou4.e0 hj6 = this.f407834i.hj();
                        if (hj6 != null) {
                            ((ou4.z) hj6).Ai(str);
                        }
                    } catch (java.lang.Exception unused) {
                    }
                }
                this.f407834i.f407852p.remove(new java.lang.Long(this.f407842t));
            }
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.tencent.mars.xlog.Log.i("MicroMsg.hitest.WebSearchFlutterService", "tryShowSearchResultPage, scene: " + this.f407831f + ", searchText: " + this.f407832g);
                com.tencent.mm.plugin.lite.LiteAppCenter.setJsApiContextForAppId(this.f407833h, "wxalite13df24d39cdd33868c7c01a247000f87");
                java.util.Map Zi = sg0.w2.Zi(this.f407834i, this.f407831f, this.f407832g, this.f407835m, this.f407836n, this.f407837o, this.f407838p, this.f407839q, this.f407840r, this.f407841s);
                sg0.j2 aj6 = sg0.w2.aj(this.f407834i);
                java.util.List cj6 = sg0.w2.cj(this.f407834i, aj6);
                ou4.d0 fj6 = sg0.w2.fj(this.f407834i);
                if (fj6 != null) {
                    ((ou4.s) fj6).a(cj6);
                    wi6 = fj6;
                } else {
                    ou4.e0 hj7 = this.f407834i.hj();
                    wi6 = hj7 != null ? ((ou4.z) hj7).wi("websearch", new ou4.t("result_page", Zi, cj6, false, false, null, 56, null)) : null;
                }
                if (wi6 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.hitest.WebSearchFlutterService", "IFlutterContainerService not available, cannot create container");
                    return f0Var;
                }
                this.f407834i.f407850n.put(new java.lang.Long(this.f407842t), ((ou4.s) wi6).f349017a);
                this.f407834i.f407852p.put(new java.lang.Long(this.f407842t), new sg0.i2(aj6, this.f407833h));
                ou4.s sVar = (ou4.s) wi6;
                sVar.d(vg0.n.f436463a.a(null));
                if (((ou4.s) wi6).f349026j) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.hitest.WebSearchFlutterService", "tryShowSearchResultPage: reusing preloaded container");
                    this.f407830e = wi6;
                    this.f407829d = 1;
                    if (sVar.c("result_page", Zi, this) == aVar) {
                        return aVar;
                    }
                } else {
                    this.f407830e = wi6;
                    this.f407829d = 2;
                    if (sVar.f(this) == aVar) {
                        return aVar;
                    }
                }
                d0Var = wi6;
            } else {
                if (i17 != 1 && i17 != 2) {
                    if (i17 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.tencent.mars.xlog.Log.i("MicroMsg.hitest.WebSearchFlutterService", "showAsView end");
                    return f0Var;
                }
                d0Var = (ou4.d0) this.f407830e;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle = this.f407841s ? new com.tencent.mm.flutter.ui.FlutterPageStyle(0, 0, io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.opaque, false, false, false, null, 0, false, false, false, null, 3323, null) : new com.tencent.mm.flutter.ui.FlutterPageStyle(0, 0, null, false, false, false, null, 0, false, true, false, null, 3327, null);
            com.tencent.mars.xlog.Log.i("MicroMsg.hitest.WebSearchFlutterService", "showAsView start");
            android.view.ViewGroup viewGroup = this.f407843u;
            androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f407833h;
            if (appCompatActivity == null || (oVar = appCompatActivity.mo133getLifecycle()) == null) {
                oVar = (jm0.s) ((jz5.n) this.f407834i.f300277e).getValue();
            }
            kotlin.jvm.internal.o.d(oVar);
            androidx.appcompat.app.AppCompatActivity appCompatActivity2 = this.f407833h;
            this.f407830e = null;
            this.f407829d = 3;
            if (((ou4.s) d0Var).e(viewGroup, oVar, flutterPageStyle, appCompatActivity2, this) == aVar) {
                return aVar;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.hitest.WebSearchFlutterService", "showAsView end");
            return f0Var;
        } finally {
            kotlinx.coroutines.z0.e(this.f407844v, null, 1, null);
        }
    }
}
