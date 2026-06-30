package ym5;

/* loaded from: classes15.dex */
public final class f0 implements com.tencent.mm.pluginsdk.ui.h1 {

    /* renamed from: a, reason: collision with root package name */
    public final ir.h f463275a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f463276b;

    /* renamed from: c, reason: collision with root package name */
    public float f463277c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.g1 f463278d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.VelocityTracker f463279e;

    /* renamed from: f, reason: collision with root package name */
    public final int f463280f;

    /* renamed from: g, reason: collision with root package name */
    public int f463281g;

    /* renamed from: h, reason: collision with root package name */
    public final int f463282h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.OverScroller f463283i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f463284j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f463285k;

    /* renamed from: l, reason: collision with root package name */
    public final int f463286l;

    /* renamed from: m, reason: collision with root package name */
    public yz5.a f463287m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f463288n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f463289o;

    /* renamed from: p, reason: collision with root package name */
    public int f463290p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Set f463291q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f463292r;

    /* renamed from: s, reason: collision with root package name */
    public int f463293s;

    /* renamed from: t, reason: collision with root package name */
    public nr.e f463294t;

    public f0(android.content.Context context, ir.h config) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(config, "config");
        this.f463275a = config;
        this.f463281g = -1;
        this.f463284j = true;
        this.f463286l = context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479649bo);
        this.f463291q = new java.util.LinkedHashSet();
        this.f463292r = true;
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        this.f463280f = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f463282h = viewConfiguration.getScaledTouchSlop();
        this.f463283i = new android.widget.OverScroller(context, ym5.z.f463584a);
    }

    public final void a() {
        android.widget.OverScroller overScroller = this.f463283i;
        if (overScroller.computeScrollOffset()) {
            e(overScroller.getCurrY());
            com.tencent.mm.pluginsdk.ui.g1 g1Var = this.f463278d;
            if (g1Var != null) {
                g1Var.a(this.f463293s);
            }
            if (!overScroller.isFinished()) {
                android.view.View view = this.f463276b;
                if (view != null) {
                    java.lang.Runnable runnable = new java.lang.Runnable() { // from class: ym5.b0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ym5.f0.this.a();
                        }
                    };
                    java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                    n3.u0.m(view, runnable);
                    return;
                }
                return;
            }
            int i17 = this.f463293s;
            int i18 = this.f463290p;
            this.f463275a.f293855n = i17 == i18;
            com.tencent.mm.pluginsdk.ui.g1 g1Var2 = this.f463278d;
            if (g1Var2 != null) {
                g1Var2.b(i17 == i18);
            }
            yz5.a aVar = this.f463287m;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    public void b(int i17, int i18, int i19) {
        int i27 = this.f463286l;
        this.f463290p = (i17 - i27) + i19 > i18 ? ((i17 - i18) - i27) - i19 : 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiPanelDragIndicator", "determineExtent: parentHeight=" + i17 + ", collapsedHeight=" + i18 + ", inputHeight=" + i19 + ", maxExtendedHeight=" + this.f463290p);
    }

    public boolean c() {
        return this.f463289o || !this.f463283i.isFinished() || this.f463293s > 0;
    }

    public void d() {
        this.f463285k = true;
        android.widget.OverScroller overScroller = this.f463283i;
        if (!overScroller.isFinished()) {
            overScroller.forceFinished(true);
        }
        if (this.f463293s != 0) {
            e(0);
            com.tencent.mm.pluginsdk.ui.g1 g1Var = this.f463278d;
            if (g1Var != null) {
                g1Var.b(false);
            }
        }
    }

    public void e(int i17) {
        this.f463293s = i17;
        boolean z17 = i17 == 0;
        if (this.f463292r != z17) {
            java.util.Set set = this.f463291q;
            if (z17) {
                java.util.Iterator it = set.iterator();
                while (it.hasNext()) {
                    com.tencent.mm.view.EmojiPanelSlideIndicatorView emojiPanelSlideIndicatorView = (com.tencent.mm.view.EmojiPanelSlideIndicatorView) ((ym5.a0) it.next());
                    emojiPanelSlideIndicatorView.f213301e = false;
                    emojiPanelSlideIndicatorView.setContentDescription(emojiPanelSlideIndicatorView.getResources().getString(com.tencent.mm.R.string.by8));
                    emojiPanelSlideIndicatorView.notifySubtreeAccessibilityStateChanged(emojiPanelSlideIndicatorView, emojiPanelSlideIndicatorView, 4);
                }
            } else {
                java.util.Iterator it6 = set.iterator();
                while (it6.hasNext()) {
                    com.tencent.mm.view.EmojiPanelSlideIndicatorView emojiPanelSlideIndicatorView2 = (com.tencent.mm.view.EmojiPanelSlideIndicatorView) ((ym5.a0) it6.next());
                    emojiPanelSlideIndicatorView2.f213301e = true;
                    emojiPanelSlideIndicatorView2.setContentDescription(emojiPanelSlideIndicatorView2.getResources().getString(com.tencent.mm.R.string.by7));
                    emojiPanelSlideIndicatorView2.notifySubtreeAccessibilityStateChanged(emojiPanelSlideIndicatorView2, emojiPanelSlideIndicatorView2, 4);
                }
            }
        }
        this.f463292r = z17;
    }

    public final void f(int i17, int i18) {
        int i19 = i17 - this.f463293s;
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiPanelDragIndicator", "settle, target: " + i17 + ", duration: " + i18 + ", dy: " + i19);
        android.widget.OverScroller overScroller = this.f463283i;
        overScroller.forceFinished(true);
        overScroller.startScroll(0, this.f463293s, 0, i19, i18);
        android.view.View view = this.f463276b;
        if (view != null) {
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: ym5.e0
                @Override // java.lang.Runnable
                public final void run() {
                    ym5.f0.this.a();
                }
            };
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.u0.m(view, runnable);
        }
    }
}
