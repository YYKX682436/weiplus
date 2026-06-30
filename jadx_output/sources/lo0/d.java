package lo0;

/* loaded from: classes14.dex */
public final class d implements lo0.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lo0.f f319978d;

    public d(lo0.f fVar) {
        this.f319978d = fVar;
    }

    @Override // lo0.h
    public void c(lo0.b badge) {
        kotlin.jvm.internal.o.g(badge, "badge");
        lo0.f fVar = this.f319978d;
        ((java.util.ArrayList) fVar.f319987c).remove(badge);
        badge.c(this);
        java.util.List list = fVar.f319989e;
        java.util.Iterator it = kz5.n0.S0(list).iterator();
        while (it.hasNext()) {
            lo0.g gVar = (lo0.g) ((java.lang.ref.WeakReference) it.next()).get();
            if (gVar != null) {
                xm2.o oVar = (xm2.o) gVar;
                if (!fVar.a()) {
                    kz5.h0.B(list, new lo0.e(oVar));
                    android.view.View view = oVar.f455241o;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyPresetControlPanelWidget$ItemViewHolder", "onCollectionActiveBadgesChanged", "(Lcom/tencent/mm/live/core/util/beautyModel/LiveBeautyBadgeCollection;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/beauty/controlpanels/FinderLiveBeautyPresetControlPanelWidget$ItemViewHolder", "onCollectionActiveBadgesChanged", "(Lcom/tencent/mm/live/core/util/beautyModel/LiveBeautyBadgeCollection;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
        if (((java.util.ArrayList) fVar.f319987c).isEmpty()) {
            ((java.util.ArrayList) list).clear();
        }
    }
}
