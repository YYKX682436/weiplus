package xm2;

/* loaded from: classes14.dex */
public final class c extends xm2.h implements lo0.h {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f455193d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f455194e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f455195f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f455196g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f455197h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f455198i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f455199m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Integer f455200n;

    /* renamed from: o, reason: collision with root package name */
    public final int f455201o;

    /* renamed from: p, reason: collision with root package name */
    public zm2.b f455202p;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(android.content.Context r22, yz5.l r23) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xm2.c.<init>(android.content.Context, yz5.l):void");
    }

    @Override // lo0.h
    public void c(lo0.b badge) {
        kotlin.jvm.internal.o.g(badge, "badge");
        badge.c(this);
        android.view.View view = this.f455199m;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyFineTuningControlPanelWidget$ItemViewHolder", "onBadgeDismissed", "(Lcom/tencent/mm/live/core/util/beautyModel/LiveBeautyBadge;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyFineTuningControlPanelWidget$ItemViewHolder", "onBadgeDismissed", "(Lcom/tencent/mm/live/core/util/beautyModel/LiveBeautyBadge;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void i(zm2.b bVar) {
        android.view.View view = this.f455198i;
        int i17 = java.lang.Math.abs(bVar.f474167i - bVar.f474166h) < 0.005d ? 4 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyFineTuningControlPanelWidget$ItemViewHolder", "setModificationIndicatorVisibility", "(Lcom/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/items/FinderLiveBeautyFineTuningControlPanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyFineTuningControlPanelWidget$ItemViewHolder", "setModificationIndicatorVisibility", "(Lcom/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/items/FinderLiveBeautyFineTuningControlPanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void j(boolean z17) {
        android.view.View view = this.f455194e;
        int i17 = z17 ? 0 : 4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyFineTuningControlPanelWidget$ItemViewHolder", "setSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyFineTuningControlPanelWidget$ItemViewHolder", "setSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
