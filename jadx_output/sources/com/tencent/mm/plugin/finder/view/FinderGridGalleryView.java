package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\nB\u001d\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B%\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0014J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¨\u0006\u0015"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderGridGalleryView;", "Landroid/widget/LinearLayout;", "Lt23/m1;", "Le33/i2;", "", "columnNum", "Ljz5/f0;", "setColumnNum", "selectLimit", "setMaxSelectLimit", "Lcom/tencent/mm/plugin/finder/view/na;", "onItemSelectedListener", "setOnItemSelectListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderGridGalleryView extends android.widget.LinearLayout implements t23.m1, e33.i2 {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f131103t = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f131104d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f131105e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f131106f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f131107g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.GridView f131108h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMSwitchBtn f131109i;

    /* renamed from: m, reason: collision with root package name */
    public e33.j2 f131110m;

    /* renamed from: n, reason: collision with root package name */
    public e60.f1 f131111n;

    /* renamed from: o, reason: collision with root package name */
    public rl5.r f131112o;

    /* renamed from: p, reason: collision with root package name */
    public int f131113p;

    /* renamed from: q, reason: collision with root package name */
    public int f131114q;

    /* renamed from: r, reason: collision with root package name */
    public long f131115r;

    /* renamed from: s, reason: collision with root package name */
    public int f131116s;

    public FinderGridGalleryView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f131104d = "Finder.FinderGridGalleryView";
        this.f131105e = new int[]{com.tencent.mm.R.string.cye, com.tencent.mm.R.string.cyg, com.tencent.mm.R.string.cyf};
        this.f131106f = new int[]{1, 2, 3};
        this.f131113p = 4;
        this.f131114q = 1;
        this.f131116s = 9;
        b();
    }

    @Override // e33.i2
    public void a(int i17, int i18, int i19, int i27) {
        com.tencent.mars.xlog.Log.i(this.f131104d, "selected  " + i17 + " items");
    }

    public final void b() {
        android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.f488825ak5, this);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.jeg);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f131107g = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.f486013jv1);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f131109i = (com.tencent.mm.ui.widget.MMSwitchBtn) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.jds);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.GridView gridView = (android.widget.GridView) findViewById3;
        this.f131108h = gridView;
        gridView.setNumColumns(this.f131113p);
        android.widget.TextView textView = this.f131107g;
        if (textView == null) {
            kotlin.jvm.internal.o.o("mediaTypeTv");
            throw null;
        }
        textView.setText(this.f131105e[0]);
        ((d60.y) ((e60.c1) i95.n0.c(e60.c1.class))).getClass();
        t23.x1 x1Var = new t23.x1();
        this.f131111n = x1Var;
        x1Var.g(this.f131106f[0]);
        e60.f1 f1Var = this.f131111n;
        if (f1Var == null) {
            kotlin.jvm.internal.o.o("queryService");
            throw null;
        }
        ((t23.x1) f1Var).b(this);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f131115r = currentTimeMillis;
        e60.f1 f1Var2 = this.f131111n;
        if (f1Var2 == null) {
            kotlin.jvm.internal.o.o("queryService");
            throw null;
        }
        t23.x1 x1Var2 = (t23.x1) f1Var2;
        x1Var2.e("", x1Var2.f415298g, currentTimeMillis);
        e60.c1 c1Var = (e60.c1) i95.n0.c(e60.c1.class);
        android.content.Context context = getContext();
        ((d60.y) c1Var).getClass();
        e33.b0 b0Var = new e33.b0(false, context, this);
        this.f131110m = b0Var;
        e60.f1 f1Var3 = this.f131111n;
        if (f1Var3 == null) {
            kotlin.jvm.internal.o.o("queryService");
            throw null;
        }
        b0Var.f247134m = ((t23.x1) f1Var3).f415298g;
        b0Var.f247128d = this.f131114q;
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = this.f131109i;
        if (mMSwitchBtn == null) {
            kotlin.jvm.internal.o.o("multiSelect");
            throw null;
        }
        mMSwitchBtn.setSwitchListener(new com.tencent.mm.plugin.finder.view.oa(this));
        android.content.Context context2 = getContext();
        android.widget.TextView textView2 = this.f131107g;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("mediaTypeTv");
            throw null;
        }
        rl5.r rVar = new rl5.r(context2, textView2);
        this.f131112o = rVar;
        rVar.f397351u = new com.tencent.mm.plugin.finder.view.pa(this);
        rVar.f397354x = new com.tencent.mm.plugin.finder.view.qa(this);
        android.widget.TextView textView3 = this.f131107g;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("mediaTypeTv");
            throw null;
        }
        textView3.setOnClickListener(new com.tencent.mm.plugin.finder.view.ra(this));
        android.widget.GridView gridView2 = this.f131108h;
        if (gridView2 != null) {
            gridView2.setOnItemClickListener(new com.tencent.mm.plugin.finder.view.sa(this));
        } else {
            kotlin.jvm.internal.o.o("gridView");
            throw null;
        }
    }

    public final void setColumnNum(int i17) {
        this.f131113p = i17;
        android.widget.GridView gridView = this.f131108h;
        if (gridView != null) {
            gridView.setNumColumns(i17);
        } else {
            kotlin.jvm.internal.o.o("gridView");
            throw null;
        }
    }

    public final void setMaxSelectLimit(int i17) {
        this.f131116s = i17;
    }

    public final void setOnItemSelectListener(com.tencent.mm.plugin.finder.view.na onItemSelectedListener) {
        kotlin.jvm.internal.o.g(onItemSelectedListener, "onItemSelectedListener");
    }

    @Override // t23.m1
    public void u5(java.util.LinkedList linkedList, long j17, boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ticket ");
        sb6.append(j17);
        sb6.append(" query finished  ");
        sb6.append(linkedList != null ? java.lang.Integer.valueOf(linkedList.size()) : null);
        sb6.append(" medias");
        com.tencent.mars.xlog.Log.i(this.f131104d, sb6.toString());
        if (this.f131115r != j17 || linkedList == null) {
            return;
        }
        post(new com.tencent.mm.plugin.finder.view.ta(this, linkedList));
    }

    public FinderGridGalleryView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f131104d = "Finder.FinderGridGalleryView";
        this.f131105e = new int[]{com.tencent.mm.R.string.cye, com.tencent.mm.R.string.cyg, com.tencent.mm.R.string.cyf};
        this.f131106f = new int[]{1, 2, 3};
        this.f131113p = 4;
        this.f131114q = 1;
        this.f131116s = 9;
        b();
    }
}
