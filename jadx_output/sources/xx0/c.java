package xx0;

/* loaded from: classes5.dex */
public final class c extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f457861d;

    /* renamed from: e, reason: collision with root package name */
    public final xx0.i f457862e;

    /* renamed from: f, reason: collision with root package name */
    public com.google.android.material.tabs.TabLayout f457863f;

    /* renamed from: g, reason: collision with root package name */
    public xx0.f0 f457864g;

    /* renamed from: h, reason: collision with root package name */
    public final kotlinx.coroutines.r2 f457865h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f457866i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f457867m;

    /* renamed from: n, reason: collision with root package name */
    public final int f457868n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Context context, kotlinx.coroutines.y0 scope, xx0.i dataProvider, xx0.j jVar) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(dataProvider, "dataProvider");
        this.f457861d = scope;
        this.f457862e = dataProvider;
        this.f457866i = new java.util.ArrayList();
        this.f457868n = 1;
        setOrientation(1);
        setGravity(17);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        this.f457865h = kotlinx.coroutines.l.d(scope, kotlinx.coroutines.internal.b0.f310484a, null, new xx0.b(context, this, jVar, null), 2, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            kotlinx.coroutines.r2 r2Var = this.f457865h;
            if (((kotlinx.coroutines.a) r2Var).a()) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
    }
}
