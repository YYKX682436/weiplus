package fn2;

/* loaded from: classes10.dex */
public final class x1 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final sf2.d3 f264439d;

    /* renamed from: e, reason: collision with root package name */
    public final int f264440e;

    /* renamed from: f, reason: collision with root package name */
    public final fn2.u1 f264441f;

    /* renamed from: g, reason: collision with root package name */
    public final fn2.v1 f264442g;

    /* renamed from: h, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f264443h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f264444i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f264445m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(android.content.Context context, sf2.d3 controller, int i17, fn2.u1 sourceScene, fn2.v1 tabType, kotlinx.coroutines.y0 y0Var, java.lang.String str) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(controller, "controller");
        kotlin.jvm.internal.o.g(sourceScene, "sourceScene");
        kotlin.jvm.internal.o.g(tabType, "tabType");
        this.f264439d = controller;
        this.f264440e = i17;
        this.f264441f = sourceScene;
        this.f264442g = tabType;
        this.f264443h = y0Var;
        this.f264444i = str;
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489004ec5, (android.view.ViewGroup) this, true);
        com.tencent.mars.xlog.Log.i("FinderLiveUnifiedSongTabView", "TabView created for tabType: " + tabType);
    }
}
