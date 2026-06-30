package com.tencent.mm.plugin.finder.live.widget;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorActiveDetailWidget;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "com/tencent/mm/plugin/finder/live/widget/ay", "com/tencent/mm/plugin/finder/live/widget/cy", "com/tencent/mm/plugin/finder/live/widget/ey", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class FinderLiveVisitorActiveDetailWidget extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f117693d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f117694e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f117695f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.LinearLayout f117696g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.widget.ey f117697h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveVisitorActiveDetailWidget(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f117693d = "VisitorActiveDetailWidget";
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.ea_, this);
        this.f117694e = inflate;
        this.f117695f = inflate.findViewById(com.tencent.mm.R.id.imc);
        this.f117696g = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.vnn);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) inflate.findViewById(com.tencent.mm.R.id.vno);
        com.tencent.mm.plugin.finder.live.widget.ey eyVar = new com.tencent.mm.plugin.finder.live.widget.ey(this);
        this.f117697h = eyVar;
        wxRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(inflate.getContext()));
        wxRecyclerView.setAdapter(eyVar);
        wxRecyclerView.N(new com.tencent.mm.plugin.finder.live.widget.ay(this, (int) (4 * wxRecyclerView.getContext().getResources().getDisplayMetrics().density)));
    }
}
