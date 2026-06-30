package sc2;

/* loaded from: classes2.dex */
public final class v2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.w2 f406300d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f406301e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f406302f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(sc2.w2 w2Var, boolean z17, in5.s0 s0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f406300d = w2Var;
        this.f406301e = z17;
        this.f406302f = s0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sc2.v2(this.f406300d, this.f406301e, this.f406302f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((sc2.v2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        sc2.w2 w2Var = this.f406300d;
        java.lang.String str = w2Var.f406329w;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("actual show account around view ");
        boolean z17 = this.f406301e;
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        android.view.View view = w2Var.f3143d;
        android.view.View findViewById = view != null ? view.findViewById(com.tencent.mm.R.id.m3n) : null;
        if (findViewById != null) {
            int i17 = z17 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperAccountAroundObserver$updateShowAccountAroundView$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/component/FeedJumperAccountAroundObserver$updateShowAccountAroundView$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!z17) {
            w2Var.D(8);
            return f0Var;
        }
        w2Var.D(0);
        int i18 = w2Var.f3150n;
        in5.s0 s0Var = this.f406302f;
        if (i18 == 39) {
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            so2.o2.f410517f.a().g(w2Var.f3145f, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135380n, so2.h2.f410388h);
        }
        if (w2Var.f406330x != null) {
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            android.content.Context context2 = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            long j17 = w2Var.f3145f;
            java.lang.String str2 = w2Var.f3146g;
            w2Var.getClass();
            xc2.p0 p0Var = w2Var.f406330x;
            kotlin.jvm.internal.o.d(p0Var);
            o3Var.Ai(context2, j17, str2, "operational_jumpinfo", p0Var);
        }
        return f0Var;
    }
}
