package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderLiveVisitorFansRightView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveVisitorFansRightView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f131242d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.LinearLayout f131243e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f131244f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f131245g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f131246h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f131247i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f131248m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f131249n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.ViewGroup f131250o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.ViewGroup f131251p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f131252q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View f131253r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View f131254s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View f131255t;

    /* renamed from: u, reason: collision with root package name */
    public final bm2.y2 f131256u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveVisitorFansRightView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.aql, (android.view.ViewGroup) this, true);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f131242d = inflate;
        this.f131243e = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.dsc);
        this.f131244f = inflate.findViewById(com.tencent.mm.R.id.qjx);
        this.f131245g = inflate.findViewById(com.tencent.mm.R.id.qjy);
        this.f131246h = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.exg);
        this.f131247i = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.exi);
        this.f131248m = inflate.findViewById(com.tencent.mm.R.id.qjp);
        this.f131249n = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.fpv);
        this.f131250o = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.qqa);
        this.f131251p = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.qq_);
        this.f131252q = inflate.findViewById(com.tencent.mm.R.id.qjm);
        this.f131253r = inflate.findViewById(com.tencent.mm.R.id.qjn);
        this.f131254s = inflate.findViewById(com.tencent.mm.R.id.qjl);
        this.f131255t = inflate.findViewById(com.tencent.mm.R.id.qhw);
        bm2.y2 y2Var = new bm2.y2();
        this.f131256u = y2Var;
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) inflate.findViewById(com.tencent.mm.R.id.m3y);
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(inflate.getContext()));
        recyclerView.setAdapter(y2Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveVisitorFansRightView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.aql, (android.view.ViewGroup) this, true);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f131242d = inflate;
        this.f131243e = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.dsc);
        this.f131244f = inflate.findViewById(com.tencent.mm.R.id.qjx);
        this.f131245g = inflate.findViewById(com.tencent.mm.R.id.qjy);
        this.f131246h = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.exg);
        this.f131247i = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.exi);
        this.f131248m = inflate.findViewById(com.tencent.mm.R.id.qjp);
        this.f131249n = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.fpv);
        this.f131250o = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.qqa);
        this.f131251p = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.qq_);
        this.f131252q = inflate.findViewById(com.tencent.mm.R.id.qjm);
        this.f131253r = inflate.findViewById(com.tencent.mm.R.id.qjn);
        this.f131254s = inflate.findViewById(com.tencent.mm.R.id.qjl);
        this.f131255t = inflate.findViewById(com.tencent.mm.R.id.qhw);
        bm2.y2 y2Var = new bm2.y2();
        this.f131256u = y2Var;
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) inflate.findViewById(com.tencent.mm.R.id.m3y);
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(inflate.getContext()));
        recyclerView.setAdapter(y2Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveVisitorFansRightView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.aql, (android.view.ViewGroup) this, true);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f131242d = inflate;
        this.f131243e = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.dsc);
        this.f131244f = inflate.findViewById(com.tencent.mm.R.id.qjx);
        this.f131245g = inflate.findViewById(com.tencent.mm.R.id.qjy);
        this.f131246h = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.exg);
        this.f131247i = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.exi);
        this.f131248m = inflate.findViewById(com.tencent.mm.R.id.qjp);
        this.f131249n = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.fpv);
        this.f131250o = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.qqa);
        this.f131251p = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.qq_);
        this.f131252q = inflate.findViewById(com.tencent.mm.R.id.qjm);
        this.f131253r = inflate.findViewById(com.tencent.mm.R.id.qjn);
        this.f131254s = inflate.findViewById(com.tencent.mm.R.id.qjl);
        this.f131255t = inflate.findViewById(com.tencent.mm.R.id.qhw);
        bm2.y2 y2Var = new bm2.y2();
        this.f131256u = y2Var;
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) inflate.findViewById(com.tencent.mm.R.id.m3y);
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(inflate.getContext()));
        recyclerView.setAdapter(y2Var);
    }
}
