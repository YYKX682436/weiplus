package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderLiveVisitorFansTaskView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveVisitorFansTaskView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f131257d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f131258e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f131259f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f131260g;

    /* renamed from: h, reason: collision with root package name */
    public final bm2.p2 f131261h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveVisitorFansTaskView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.aqo, (android.view.ViewGroup) this, true);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f131257d = inflate;
        this.f131258e = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.qiu);
        this.f131259f = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.dqz);
        this.f131260g = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.dsn);
        bm2.p2 p2Var = new bm2.p2();
        this.f131261h = p2Var;
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) inflate.findViewById(com.tencent.mm.R.id.drc);
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(inflate.getContext()));
        recyclerView.setAdapter(p2Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveVisitorFansTaskView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.aqo, (android.view.ViewGroup) this, true);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f131257d = inflate;
        this.f131258e = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.qiu);
        this.f131259f = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.dqz);
        this.f131260g = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.dsn);
        bm2.p2 p2Var = new bm2.p2();
        this.f131261h = p2Var;
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) inflate.findViewById(com.tencent.mm.R.id.drc);
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(inflate.getContext()));
        recyclerView.setAdapter(p2Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveVisitorFansTaskView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.aqo, (android.view.ViewGroup) this, true);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f131257d = inflate;
        this.f131258e = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.qiu);
        this.f131259f = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.dqz);
        this.f131260g = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.dsn);
        bm2.p2 p2Var = new bm2.p2();
        this.f131261h = p2Var;
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) inflate.findViewById(com.tencent.mm.R.id.drc);
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(inflate.getContext()));
        recyclerView.setAdapter(p2Var);
    }
}
