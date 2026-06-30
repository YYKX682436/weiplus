package f53;

/* loaded from: classes5.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.ui.circle.AtSomeoneView f259657d;

    public i(com.tencent.mm.plugin.game.luggage.ui.circle.AtSomeoneView atSomeoneView) {
        this.f259657d = atSomeoneView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.luggage.ui.circle.AtSomeoneView atSomeoneView = this.f259657d;
        if (((java.util.LinkedList) atSomeoneView.f139978k2).size() > 0) {
            android.view.View findViewById = atSomeoneView.getRootView().findViewById(com.tencent.mm.R.id.giq);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneView$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneView$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById2 = atSomeoneView.getRootView().findViewById(com.tencent.mm.R.id.f483280a61);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneView$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneView$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View findViewById3 = atSomeoneView.getRootView().findViewById(com.tencent.mm.R.id.giq);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneView$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneView$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById4 = atSomeoneView.getRootView().findViewById(com.tencent.mm.R.id.f483280a61);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneView$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneView$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        f53.m mVar = atSomeoneView.f139975h2;
        java.util.List list = atSomeoneView.f139978k2;
        java.util.LinkedList linkedList = new java.util.LinkedList(list);
        mVar.f259674d = ((java.util.LinkedList) list).size();
        java.util.LinkedList linkedList2 = (java.util.LinkedList) mVar.f259675e;
        linkedList2.clear();
        if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
            linkedList2.addAll(linkedList);
        }
        mVar.notifyDataSetChanged();
    }
}
