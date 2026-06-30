package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes12.dex */
public final class ey extends androidx.recyclerview.widget.q1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorActiveDetailWidget f118291e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey(com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorActiveDetailWidget finderLiveVisitorActiveDetailWidget) {
        super(new com.tencent.mm.plugin.finder.live.widget.dy());
        this.f118291e = finderLiveVisitorActiveDetailWidget;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.plugin.finder.live.widget.cy holder = (com.tencent.mm.plugin.finder.live.widget.cy) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = this.f12200d.f12105e.get(i17);
        kotlin.jvm.internal.o.f(obj, "getItem(...)");
        r45.nu0 nu0Var = (r45.nu0) obj;
        holder.f118031d.setText(nu0Var.getString(1) + ' ' + nu0Var.getString(2));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorActiveDetailWidget finderLiveVisitorActiveDetailWidget = this.f118291e;
        android.view.View inflate = com.tencent.mm.ui.id.b(finderLiveVisitorActiveDetailWidget.getContext()).inflate(com.tencent.mm.R.layout.dob, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new com.tencent.mm.plugin.finder.live.widget.cy(finderLiveVisitorActiveDetailWidget, inflate);
    }
}
