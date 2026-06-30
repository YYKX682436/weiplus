package lr;

/* loaded from: classes15.dex */
public abstract class u extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final lr.o0 f320584d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.recyclerview.widget.GridLayoutManager f320585e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.emoji.panel.EmojiPanelRecyclerView f320586f;

    /* renamed from: g, reason: collision with root package name */
    public final lr.z f320587g;

    /* renamed from: h, reason: collision with root package name */
    public final lr.y f320588h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.view.EmojiPanelSlideIndicatorView f320589i;

    /* renamed from: m, reason: collision with root package name */
    public ir.t0 f320590m;

    /* renamed from: n, reason: collision with root package name */
    public final lr.t f320591n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ lr.x f320592o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(lr.x xVar, android.view.View itemView, lr.o0 sizeResolver, androidx.recyclerview.widget.GridLayoutManager layoutManager) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(sizeResolver, "sizeResolver");
        kotlin.jvm.internal.o.g(layoutManager, "layoutManager");
        this.f320592o = xVar;
        this.f320584d = sizeResolver;
        this.f320585e = layoutManager;
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.dcg);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.emoji.panel.EmojiPanelRecyclerView emojiPanelRecyclerView = (com.tencent.mm.emoji.panel.EmojiPanelRecyclerView) findViewById;
        this.f320586f = emojiPanelRecyclerView;
        lr.z zVar = new lr.z(xVar.f320600d);
        this.f320587g = zVar;
        this.f320588h = new lr.q(this, zVar);
        lr.p0 p0Var = new lr.p0(zVar, layoutManager);
        com.tencent.mm.view.EmojiPanelSlideIndicatorView emojiPanelSlideIndicatorView = (com.tencent.mm.view.EmojiPanelSlideIndicatorView) itemView.findViewById(com.tencent.mm.R.id.dcf);
        this.f320589i = emojiPanelSlideIndicatorView;
        this.f320591n = new lr.t(this);
        emojiPanelRecyclerView.setRecycledViewPool(xVar.f320607n);
        emojiPanelRecyclerView.setHasFixedSize(true);
        emojiPanelRecyclerView.setAdapter(zVar);
        emojiPanelRecyclerView.setSizeResolver(sizeResolver);
        emojiPanelRecyclerView.setPanelLifeCycle(xVar.f320601e);
        emojiPanelRecyclerView.N(new lr.a0(sizeResolver));
        layoutManager.B = p0Var;
        emojiPanelRecyclerView.setLayoutManager(layoutManager);
        emojiPanelRecyclerView.setFocusable(false);
        emojiPanelRecyclerView.setItemAnimator(null);
        zVar.f320620g = xVar.f320608o;
        if (emojiPanelSlideIndicatorView == null) {
            return;
        }
        emojiPanelSlideIndicatorView.setController(xVar.f320604h);
    }

    public final void i() {
        ir.e1 e1Var;
        int i17;
        ir.t0 t0Var = this.f320590m;
        if (t0Var instanceof ir.i1) {
            ir.i1 i1Var = (ir.i1) t0Var;
            if (!i1Var.f293871e.f293813c.isEmpty() && (i17 = (e1Var = i1Var.f293871e).f293833e) > 0) {
                lr.x xVar = this.f320592o;
                xVar.f320600d.f293856o = null;
                e1Var.f293833e = 0;
                com.tencent.mars.xlog.Log.i(xVar.f320605i, "checkScrollToPosition: " + i17);
                com.tencent.mm.emoji.panel.EmojiPanelRecyclerView emojiPanelRecyclerView = this.f320586f;
                lr.t tVar = this.f320591n;
                emojiPanelRecyclerView.removeCallbacks(tVar);
                tVar.f320582d = i17;
                emojiPanelRecyclerView.postDelayed(tVar, 300L);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x010a, code lost:
    
        if ((!(r8 instanceof ir.f1)) != false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(ir.t0 r8) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lr.u.j(ir.t0):void");
    }

    public void k() {
        ir.k0 b17;
        ir.r p17;
        lr.x xVar = this.f320592o;
        java.lang.String str = xVar.f320605i;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onUnbind: ");
        ir.t0 t0Var = this.f320590m;
        sb6.append((t0Var == null || (b17 = t0Var.b()) == null || (p17 = b17.p()) == null) ? null : p17.c());
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        ir.t0 t0Var2 = this.f320590m;
        if (t0Var2 != null) {
            t0Var2.g(null);
        }
        this.f320590m = null;
        this.f320586f.removeCallbacks(this.f320591n);
        com.tencent.mm.sdk.platformtools.n3 n3Var = xVar.f320610q;
        if (n3Var != null) {
            n3Var.removeCallbacksAndMessages(null);
        }
        xVar.f320610q = null;
    }
}
