package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class o10 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.z10 f113693d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.notice.NoticeStatusView f113694e;

    public o10(com.tencent.mm.plugin.finder.live.plugin.z10 z10Var, com.tencent.mm.plugin.finder.view.notice.NoticeStatusView noticeStatusView) {
        this.f113693d = z10Var;
        this.f113694e = noticeStatusView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveNoticeBubble$refreshView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.view.notice.NoticeStatusView noticeStatusView = this.f113694e;
        kotlin.jvm.internal.o.f(noticeStatusView, "$noticeStatusView");
        com.tencent.mm.plugin.finder.live.plugin.z10.a(this.f113693d, noticeStatusView);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveNoticeBubble$refreshView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
