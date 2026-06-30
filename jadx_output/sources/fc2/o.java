package fc2;

/* loaded from: classes2.dex */
public abstract class o extends fc2.e {

    /* renamed from: b, reason: collision with root package name */
    public final int f260957b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f260958c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Rect f260959d;

    /* renamed from: e, reason: collision with root package name */
    public int f260960e;

    /* renamed from: f, reason: collision with root package name */
    public int f260961f;

    /* renamed from: g, reason: collision with root package name */
    public final int f260962g;

    /* renamed from: h, reason: collision with root package name */
    public int f260963h;

    /* renamed from: i, reason: collision with root package name */
    public int f260964i;

    /* renamed from: j, reason: collision with root package name */
    public int f260965j;

    /* renamed from: k, reason: collision with root package name */
    public int[] f260966k;

    /* renamed from: l, reason: collision with root package name */
    public int f260967l;

    /* renamed from: m, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f260968m;

    /* renamed from: n, reason: collision with root package name */
    public final long f260969n;

    /* renamed from: o, reason: collision with root package name */
    public final androidx.recyclerview.widget.h2 f260970o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Runnable f260971p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f260972q;

    public o(fc2.c cVar) {
        super(cVar);
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(com.tencent.mm.sdk.platformtools.x2.f193071a);
        kotlin.jvm.internal.o.f(viewConfiguration, "get(...)");
        this.f260957b = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDisplayMetrics().heightPixels;
        this.f260958c = jz5.h.b(fc2.h.f260945d);
        this.f260959d = new android.graphics.Rect();
        this.f260960e = Integer.MAX_VALUE;
        this.f260961f = Integer.MAX_VALUE;
        this.f260962g = viewConfiguration.getScaledTouchSlop();
        this.f260966k = new int[5];
        this.f260969n = 500L;
        this.f260970o = new fc2.f(this);
        this.f260971p = new fc2.n(this);
        this.f260972q = new fc2.g(this, android.os.Looper.getMainLooper());
    }

    public static final /* synthetic */ java.lang.String b(fc2.o oVar) {
        oVar.getClass();
        return "Finder.FinderFeedFlowEventSubscriber";
    }

    public abstract fc2.a c(androidx.recyclerview.widget.RecyclerView recyclerView, int i17);

    public void d(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        this.f260968m = recyclerView;
        recyclerView.i(new fc2.i(this));
        recyclerView.O(new fc2.k(recyclerView, this));
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        if (adapter == null || !(adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter)) {
            return;
        }
        adapter.registerAdapterDataObserver(this.f260970o);
    }

    public void e() {
        com.tencent.mm.sdk.platformtools.u3.l(this.f260971p);
        this.f260972q.removeMessages(0);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f260968m;
        if (recyclerView != null) {
            g(recyclerView, 10);
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderFeedFlowEventSubscriber", "onInvisible " + this.f260960e + ' ' + this.f260961f);
    }

    public void f() {
        com.tencent.mars.xlog.Log.i("Finder.FinderFeedFlowEventSubscriber", "onVisible " + this.f260960e + ' ' + this.f260961f);
        this.f260960e = Integer.MAX_VALUE;
        this.f260961f = Integer.MAX_VALUE;
        com.tencent.mm.sdk.platformtools.u3.i(this.f260971p, 200L);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f260968m;
        if (recyclerView != null) {
            g(recyclerView, 7);
        }
    }

    public void g(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        fc2.a c17;
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        if (kotlin.jvm.internal.o.b(android.os.Looper.getMainLooper().getThread(), java.lang.Thread.currentThread())) {
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            c17 = c(recyclerView, i17);
            long uptimeMillis2 = android.os.SystemClock.uptimeMillis() - uptimeMillis;
            if (uptimeMillis2 >= 50) {
                com.tencent.mars.xlog.Log.w("Finder.FinderFeedFlowEventSubscriber", "[checkUICost] " + ("what are you doing? guy! This operation is so slow in ui thread.[" + uptimeMillis2 + "ms]"));
            }
        } else {
            c17 = c(recyclerView, i17);
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        boolean z17 = false;
        if (layoutManager != null && !layoutManager.isAttachedToWindow()) {
            z17 = true;
        }
        if (z17 && (i17 == 10 || i17 == 7)) {
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f128056z8).getValue()).r()).intValue() == 1) {
                pm0.v.V(0L, new fc2.l(this, c17));
                com.tencent.mars.xlog.Log.i("Finder.FinderFeedFlowEventSubscriber", "publish event but recyclerView is detached, newState:" + i17);
                pm0.z.b(xy2.b.f458155b, "unfocusNotCalled", false, null, null, false, false, null, 124, null);
                return;
            }
        }
        recyclerView.post(new fc2.m(this, c17));
    }
}
