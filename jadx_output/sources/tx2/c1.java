package tx2;

/* loaded from: classes3.dex */
public final class c1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tx2.g1 f422540d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f422541e;

    public c1(tx2.g1 g1Var, yz5.a aVar) {
        this.f422540d = g1Var;
        this.f422541e = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/notice/PayLiveSecondCheckWidget$initView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f361767a >= 500) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f361767a);
            z17 = true;
        }
        qd2.h.f361767a = currentTimeMillis;
        if (z17) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/view/notice/PayLiveSecondCheckWidget$initView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.ui.widget.dialog.y1 y1Var = this.f422540d.f422568e;
        if (y1Var != null) {
            y1Var.q();
        }
        this.f422541e.invoke();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/notice/PayLiveSecondCheckWidget$initView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
