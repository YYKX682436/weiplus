package qx2;

/* loaded from: classes2.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qx2.g f367326d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f367327e;

    public c(qx2.g gVar, yz5.a aVar) {
        this.f367326d = gVar;
        this.f367327e = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/license/FinderLawLicensePopupView$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f361767a >= 500) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f361767a);
            z17 = true;
        }
        qd2.h.f361767a = currentTimeMillis;
        if (z17) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/view/license/FinderLawLicensePopupView$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderLawLicensePopupView", "#btn on confirm click");
        com.tencent.mm.ui.widget.dialog.y1 y1Var = this.f367326d.f367333e;
        if (y1Var != null) {
            y1Var.q();
        }
        this.f367327e.invoke();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/license/FinderLawLicensePopupView$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
