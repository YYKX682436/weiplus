package rk4;

/* loaded from: classes11.dex */
public final class j8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f396762d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f396763e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rk4.k8 f396764f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f396765g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f396766h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f396767i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ pi0.l1 f396768m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f396769n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f396770o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8(android.os.Bundle bundle, rk4.k8 k8Var, boolean z17, boolean z18, boolean z19, pi0.l1 l1Var, android.content.Context context, java.lang.Long l17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f396763e = bundle;
        this.f396764f = k8Var;
        this.f396765g = z17;
        this.f396766h = z18;
        this.f396767i = z19;
        this.f396768m = l1Var;
        this.f396769n = context;
        this.f396770o = l17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rk4.j8(this.f396763e, this.f396764f, this.f396765g, this.f396766h, this.f396767i, this.f396768m, this.f396769n, this.f396770o, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rk4.j8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.app.ActivityManager.RunningTaskInfo m17;
        android.content.ComponentName componentName;
        java.lang.String className;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f396762d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            android.os.Bundle bundle = this.f396763e;
            if (bundle == null) {
                bundle = new android.os.Bundle();
            }
            android.os.Bundle bundle2 = bundle;
            bundle2.putString("session_id", this.f396764f.f396796e);
            bundle2.putBoolean("up_down_animation", this.f396765g);
            if (this.f396766h && !this.f396767i) {
                rk4.u6 u6Var = rk4.k8.f396788r;
                ((ef0.h3) rk4.u6.a(u6Var)).wi(false);
                ef0.h3 h3Var = (ef0.h3) rk4.u6.a(u6Var);
                h3Var.getClass();
                com.tencent.mm.plugin.ting.TingFlutterActivity tingFlutterActivity = h3Var.f252225e;
                if (tingFlutterActivity != null) {
                    tingFlutterActivity.getB();
                    bundle2.toString();
                    android.content.Intent intent = tingFlutterActivity.getIntent();
                    if (intent != null) {
                        intent.putExtras(bundle2);
                    }
                }
                return jz5.f0.f302826a;
            }
            rk4.u6 u6Var2 = rk4.k8.f396788r;
            if (((ef0.h3) rk4.u6.a(u6Var2)).Ai() && !this.f396767i) {
                ((ef0.h3) rk4.u6.a(u6Var2)).wi(true);
            }
            pi0.l1 l1Var = this.f396768m;
            android.content.Context context = this.f396769n;
            com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle = this.f396765g ? (com.tencent.mm.flutter.ui.FlutterPageStyle) ((jz5.n) this.f396764f.f396804p).getValue() : rk4.k8.f396789s;
            java.lang.Class cls = rk4.k8.f396794x;
            java.lang.Long l17 = this.f396770o;
            this.f396762d = 1;
            obj = l1Var.d(context, flutterPageStyle, cls, l17, bundle2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        android.content.Intent intent2 = (android.content.Intent) obj;
        if (intent2 != null) {
            if (ep1.m.g(intent2)) {
                il4.l lVar = il4.l.f292142a;
                android.content.Context context2 = this.f396769n;
                kotlin.jvm.internal.o.g(context2, "context");
                boolean z17 = com.tencent.mm.app.w.INSTANCE.f53889n;
                com.tencent.mars.xlog.Log.i("MicroMsg.TingMusicUtils", "topTaskIsAppBrandUI isAppForeground " + z17);
                if ((!z17 || (m17 = com.tencent.mm.app.w.m(context2)) == null || (componentName = m17.topActivity) == null || (className = componentName.getClassName()) == null || !r26.n0.B(className, ".AppBrandUI", false)) ? false : true) {
                    ((ft.e) i95.n0.c(ft.e.class)).Rc(new com.tencent.mm.plugin.appbrand.event.StartActivityFromAppBrandEvent(intent2, false));
                }
            }
            android.content.Context context3 = this.f396769n;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context3, arrayList.toArray(), "com/tencent/mm/plugin/ting/TingRouter$showTingStyle$3", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context3.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context3, "com/tencent/mm/plugin/ting/TingRouter$showTingStyle$3", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.TingRouter", "showTingStyle but intent is null");
        }
        return jz5.f0.f302826a;
    }
}
