package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class tm implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.wm f119894d;

    public tm(com.tencent.mm.plugin.finder.live.widget.wm wmVar) {
        this.f119894d = wmVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveKTVSendFlowerEntranceWidget$setupLongClickListener$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.plugin.finder.live.widget.wm wmVar = this.f119894d;
        java.lang.String str = wmVar.f120212m;
        java.lang.String str2 = wmVar.f120208f;
        if (str == null) {
            com.tencent.mars.xlog.Log.e(str2, "handleLongPress - giftId is null");
        } else {
            com.tencent.mars.xlog.Log.i(str2, "handleLongPress - giftId=".concat(str));
            ce2.i e17 = dk2.u7.f234181a.e(str);
            if (e17 == null || e17.z0().isEmpty()) {
                com.tencent.mars.xlog.Log.w(str2, "handleLongPress - no batch config, showing toast");
                android.view.ViewGroup viewGroup = wmVar.f120206d;
                db5.t7.m(viewGroup.getContext(), viewGroup.getContext().getString(com.tencent.mm.R.string.dja));
                vg2.y1 y1Var = wmVar.f120221v;
                if (y1Var != null) {
                    y1Var.f436626e.dismiss();
                }
            } else {
                com.tencent.mars.xlog.Log.i(str2, "handleLongPress - showing batch select panel");
                vg2.y1 y1Var2 = wmVar.f120221v;
                if (y1Var2 != null) {
                    android.view.ViewGroup clickArea = wmVar.f120209g;
                    kotlin.jvm.internal.o.f(clickArea, "clickArea");
                    r45.kv1 c17 = e17.c1();
                    y1Var2.f436630i = c17;
                    r45.qv1 qv1Var = (r45.qv1) c17.getCustom(23);
                    java.util.LinkedList list = qv1Var != null ? qv1Var.getList(0) : null;
                    int size = list != null ? list.size() : 0;
                    android.widget.PopupWindow popupWindow = y1Var2.f436626e;
                    if (size == 0) {
                        popupWindow.dismiss();
                    } else {
                        java.util.LinkedList linkedList = y1Var2.f436628g;
                        linkedList.clear();
                        if (list != null) {
                            linkedList.addAll(list);
                        }
                        y1Var2.f436629h.notifyItemRangeChanged(0, linkedList.size());
                        android.view.View view2 = y1Var2.f436625d;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList2.add(java.lang.Float.valueOf(0.0f));
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/gift/widget/KTVGiftBatchSelectPanelWidget", "showWidget", "(Landroid/view/ViewGroup;Lcom/tencent/mm/protocal/protobuf/FinderLiveGift;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/gift/widget/KTVGiftBatchSelectPanelWidget", "showWidget", "(Landroid/view/ViewGroup;Lcom/tencent/mm/protocal/protobuf/FinderLiveGift;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        popupWindow.showAtLocation(clickArea, 51, 0, 0);
                        popupWindow.setOnDismissListener(null);
                        y1Var2.f436625d.getViewTreeObserver().addOnPreDrawListener(new vg2.x1(y1Var2, clickArea));
                    }
                }
            }
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveKTVSendFlowerEntranceWidget$setupLongClickListener$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
