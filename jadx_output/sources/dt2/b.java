package dt2;

/* loaded from: classes3.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dt2.d f243161d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f243162e;

    public b(dt2.d dVar, yz5.a aVar) {
        this.f243161d = dVar;
        this.f243162e = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f361767a >= 500) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f361767a);
            z17 = true;
        }
        qd2.h.f361767a = currentTimeMillis;
        if (z17) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        dt2.d dVar = this.f243161d;
        dt2.d.a(dVar, true, dVar.f243165e, dVar.getObjId());
        com.tencent.mm.ui.widget.dialog.y1 bottomSheet = dVar.getBottomSheet();
        if (bottomSheet != null) {
            bottomSheet.q();
        }
        this.f243162e.invoke();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
