package qi2;

/* loaded from: classes3.dex */
public final class w0 extends com.tencent.mm.plugin.finder.live.widget.g {

    /* renamed from: h, reason: collision with root package name */
    public final si2.b f363647h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.l f363648i;

    /* renamed from: m, reason: collision with root package name */
    public fg2.w0 f363649m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f363650n;

    /* renamed from: o, reason: collision with root package name */
    public ce2.i f363651o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f363652p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r10v3, types: [com.tencent.mm.plugin.finder.live.mic.pk.FinderLivePkGiftSelectPanelWidget$initRecyclerView$2] */
    public w0(android.content.Context context, si2.b callback, yz5.l selectBlock) {
        super(context, false, null, false, 14, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(callback, "callback");
        kotlin.jvm.internal.o.g(selectBlock, "selectBlock");
        this.f363647h = callback;
        this.f363648i = selectBlock;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f363650n = arrayList;
        fg2.w0 w0Var = this.f363649m;
        if (w0Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        w0Var.f262388d.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this.f118381d));
        qi2.n0 n0Var = new qi2.n0(new in5.s() { // from class: com.tencent.mm.plugin.finder.live.mic.pk.FinderLivePkGiftSelectPanelWidget$initRecyclerView$2
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return new ti2.j();
            }
        }, arrayList);
        n0Var.f293105o = new qi2.o0(this);
        this.f363652p = n0Var;
        fg2.w0 w0Var2 = this.f363649m;
        if (w0Var2 != null) {
            w0Var2.f262388d.setAdapter(n0Var);
        } else {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
    }

    public static final void y(qi2.w0 w0Var) {
        fg2.w0 w0Var2 = w0Var.f363649m;
        if (w0Var2 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        w0Var2.f262387c.setVisibility(8);
        fg2.w0 w0Var3 = w0Var.f363649m;
        if (w0Var3 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        w0Var3.f262388d.setVisibility(8);
        fg2.w0 w0Var4 = w0Var.f363649m;
        if (w0Var4 != null) {
            w0Var4.f262386b.setVisibility(0);
        } else {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public android.view.View b() {
        return h();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.dey;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public java.lang.String o() {
        java.lang.String string = this.f118381d.getResources().getString(com.tencent.mm.R.string.ljc);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        int i17 = com.tencent.mm.R.id.dhl;
        android.widget.TextView textView = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.dhl);
        if (textView != null) {
            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) rootView;
            i17 = com.tencent.mm.R.id.imn;
            android.widget.ProgressBar progressBar = (android.widget.ProgressBar) x4.b.a(rootView, com.tencent.mm.R.id.imn);
            if (progressBar != null) {
                i17 = com.tencent.mm.R.id.lqa;
                com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) x4.b.a(rootView, com.tencent.mm.R.id.lqa);
                if (wxRecyclerView != null) {
                    this.f363649m = new fg2.w0(relativeLayout, textView, relativeLayout, progressBar, wxRecyclerView);
                    return;
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i17)));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void t() {
        super.t();
        this.f363650n.clear();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f363652p;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.notifyDataSetChanged();
        } else {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void u() {
        a();
        this.f363648i.invoke(this.f363651o);
    }
}
