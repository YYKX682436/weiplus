package g4;

/* loaded from: classes5.dex */
public abstract class q3 {

    /* renamed from: a, reason: collision with root package name */
    public g4.f3 f268511a;

    /* renamed from: b, reason: collision with root package name */
    public g4.y4 f268512b;

    /* renamed from: c, reason: collision with root package name */
    public final g4.e1 f268513c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f268514d;

    /* renamed from: e, reason: collision with root package name */
    public final g4.u4 f268515e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f268516f;

    /* renamed from: g, reason: collision with root package name */
    public volatile int f268517g;

    /* renamed from: h, reason: collision with root package name */
    public final g4.p3 f268518h;

    /* renamed from: i, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f268519i;

    /* renamed from: j, reason: collision with root package name */
    public final g4.f0 f268520j;

    /* renamed from: k, reason: collision with root package name */
    public final kotlinx.coroutines.p0 f268521k;

    public q3(g4.f0 differCallback, kotlinx.coroutines.p0 mainDispatcher) {
        kotlin.jvm.internal.o.g(differCallback, "differCallback");
        kotlin.jvm.internal.o.g(mainDispatcher, "mainDispatcher");
        this.f268520j = differCallback;
        this.f268521k = mainDispatcher;
        g4.f3 f3Var = g4.f3.f268291e;
        g4.f3 f3Var2 = g4.f3.f268291e;
        if (f3Var2 == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.paging.PagePresenter<T>");
        }
        this.f268511a = f3Var2;
        g4.e1 e1Var = new g4.e1();
        this.f268513c = e1Var;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = new java.util.concurrent.CopyOnWriteArrayList();
        this.f268514d = copyOnWriteArrayList;
        this.f268515e = new g4.u4(true);
        this.f268518h = new g4.p3(this);
        this.f268519i = kotlinx.coroutines.flow.i3.a(e1Var.c());
        g4.k3 k3Var = new g4.k3(this);
        copyOnWriteArrayList.add(k3Var);
        k3Var.invoke(e1Var.c());
    }
}
