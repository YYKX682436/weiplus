package df2;

/* loaded from: classes3.dex */
public final class lo implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.to f230689d;

    public lo(df2.to toVar) {
        this.f230689d = toVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.util.LinkedList list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LiveNoticeBannerController$getNoticeItemViewInstance$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f361767a >= 500) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f361767a);
            z17 = true;
        }
        qd2.h.f361767a = currentTimeMillis;
        df2.to toVar = this.f230689d;
        if (z17) {
            com.tencent.mars.xlog.Log.i(toVar.f231460m, "noticeItemView fast click");
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LiveNoticeBannerController$getNoticeItemViewInstance$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        df2.to.Z6(toVar, 2);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onBannerClick] notice size = ");
        r45.j32 j32Var = toVar.f231462o;
        sb6.append((j32Var == null || (list = j32Var.getList(0)) == null) ? null : java.lang.Integer.valueOf(list.size()));
        com.tencent.mars.xlog.Log.i(toVar.f231460m, sb6.toString());
        com.tencent.mm.plugin.finder.live.util.y.o(toVar, null, null, new df2.qo(toVar, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LiveNoticeBannerController$getNoticeItemViewInstance$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
