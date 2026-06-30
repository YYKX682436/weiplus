package fv4;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f267007a;

    /* renamed from: b, reason: collision with root package name */
    public fv4.g f267008b;

    /* renamed from: c, reason: collision with root package name */
    public tg0.c2 f267009c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f267010d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f267011e;

    /* renamed from: f, reason: collision with root package name */
    public final ev4.d f267012f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f267013g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f267014h = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: i, reason: collision with root package name */
    public final ev4.j f267015i;

    public i(android.content.Context context, int i17, java.util.Map map, io.flutter.plugin.common.MethodChannel methodChannel) {
        java.lang.Object m521constructorimpl;
        android.view.View view;
        tg0.c1 c1Var;
        tg0.s2 s2Var;
        this.f267007a = context;
        this.f267008b = new fv4.a();
        this.f267012f = new ev4.d(methodChannel, this);
        ev4.j jVar = new ev4.j(this);
        this.f267015i = jVar;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            tg0.l1 l1Var = (tg0.l1) i95.n0.c(tg0.l1.class);
            m521constructorimpl = kotlin.Result.m521constructorimpl(l1Var != null ? ((yg0.o3) l1Var).Di(context, i17, map, jVar.f256954b) : null);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            java.lang.String content = "init, create view failed: " + m524exceptionOrNullimpl;
            kotlin.jvm.internal.o.g(content, "content");
            com.tencent.mars.xlog.Log.e("MicroMsg.FTSPlatformWebView", content);
        }
        tg0.c2 c2Var = (tg0.c2) (kotlin.Result.m527isFailureimpl(m521constructorimpl) ? null : m521constructorimpl);
        this.f267009c = c2Var;
        android.view.View view2 = (c2Var == null || (s2Var = c2Var.f419051f) == null) ? null : ((ch0.p0) s2Var).f41251a;
        this.f267008b.getClass();
        android.app.Activity a17 = a();
        this.f267010d = view2 == null ? new android.view.View(a17 instanceof com.tencent.mm.ui.vas.VASActivity ? ((com.tencent.mm.ui.vas.VASActivity) a17).getContainerActivity() : a17) : view2;
        tg0.c2 c2Var2 = this.f267009c;
        tg0.g2 g2Var = c2Var2 != null ? c2Var2.f419049d : null;
        if ((g2Var == null ? -1 : fv4.h.f267006a[g2Var.ordinal()]) == 1) {
            fv4.f fVar = new fv4.f();
            this.f267008b.g();
            this.f267008b = fVar;
            fVar.f(this);
        } else {
            fv4.k kVar = new fv4.k();
            this.f267008b.g();
            this.f267008b = kVar;
            kVar.f(this);
        }
        tg0.c2 c2Var3 = this.f267009c;
        if (c2Var3 != null && c2Var3.f419046a) {
            if ((c2Var3 != null ? c2Var3.f419049d : null) == tg0.g2.f419074f) {
                if (((c2Var3 == null || (c1Var = c2Var3.f419055j) == null || c1Var.f419029a != 1) ? false : true) && (view = this.f267010d) != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/websearch/searchplatformwebview/logic/PlatformWebViewLogicContext", "<init>", "(Landroid/content/Context;ILjava/util/Map;Lio/flutter/plugin/common/MethodChannel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/websearch/searchplatformwebview/logic/PlatformWebViewLogicContext", "<init>", "(Landroid/content/Context;ILjava/util/Map;Lio/flutter/plugin/common/MethodChannel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            ((ev4.i) this.f267015i.f256954b).b();
        }
    }

    public final android.app.Activity a() {
        android.content.Context context = this.f267007a;
        if ((context instanceof android.content.MutableContextWrapper) && (((android.content.MutableContextWrapper) context).getBaseContext() instanceof android.app.Activity)) {
            android.content.Context baseContext = ((android.content.MutableContextWrapper) context).getBaseContext();
            kotlin.jvm.internal.o.e(baseContext, "null cannot be cast to non-null type android.app.Activity");
            return (android.app.Activity) baseContext;
        }
        if (context instanceof android.app.Activity) {
            return (android.app.Activity) context;
        }
        return null;
    }
}
