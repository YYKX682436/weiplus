package st2;

/* loaded from: classes3.dex */
public final class p2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPanel f412414a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.widget.FinderLiveFixClickIssueRecyclerView f412415b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f412416c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f412417d;

    /* renamed from: e, reason: collision with root package name */
    public final long f412418e;

    /* renamed from: f, reason: collision with root package name */
    public long f412419f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.recyclerview.widget.LinearLayoutManager f412420g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f412421h;

    /* renamed from: i, reason: collision with root package name */
    public final long f412422i;

    /* renamed from: j, reason: collision with root package name */
    public float f412423j;

    /* renamed from: k, reason: collision with root package name */
    public float f412424k;

    public p2(com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPanel container, com.tencent.mm.plugin.finder.live.widget.FinderLiveFixClickIssueRecyclerView linearLayoutRecyclerView) {
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(linearLayoutRecyclerView, "linearLayoutRecyclerView");
        this.f412414a = container;
        this.f412415b = linearLayoutRecyclerView;
        this.f412416c = jz5.h.b(st2.n2.f412402d);
        this.f412417d = true;
        this.f412418e = 600L;
        this.f412422i = 600L;
    }

    public static final void a(st2.p2 p2Var, android.view.MotionEvent motionEvent) {
        boolean z17;
        if (p2Var.f412421h) {
            return;
        }
        p2Var.f412421h = true;
        p2Var.f412423j = motionEvent.getY();
        p2Var.f412424k = 0.0f;
        com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPanel finderLiveShoppingPanel = p2Var.f412414a;
        finderLiveShoppingPanel.j();
        boolean enableNestScrolled = finderLiveShoppingPanel.getEnableNestScrolled();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = p2Var.f412420g;
        if (linearLayoutManager != null) {
            z17 = linearLayoutManager.w() == 0;
            if (z17 && !enableNestScrolled) {
                long currentTimeMillis = java.lang.System.currentTimeMillis() - p2Var.f412419f;
                if (currentTimeMillis <= p2Var.f412418e) {
                    com.tencent.mars.xlog.Log.i("ShoppingPanelNestedScrollController", "enableNestedState enable but touchUpPassTime:" + currentTimeMillis + " too fast!");
                }
            }
            com.tencent.mars.xlog.Log.i("ShoppingPanelNestedScrollController", "enableNestedState :" + z17);
            finderLiveShoppingPanel.setEnableNestScrolled(z17);
            p2Var.f412415b.setConsumedTouchEnvent(false);
        }
        z17 = false;
        com.tencent.mars.xlog.Log.i("ShoppingPanelNestedScrollController", "enableNestedState :" + z17);
        finderLiveShoppingPanel.setEnableNestScrolled(z17);
        p2Var.f412415b.setConsumedTouchEnvent(false);
    }
}
