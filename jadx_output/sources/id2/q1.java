package id2;

/* loaded from: classes.dex */
public final class q1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f290754d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f290755e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ id2.v1 f290756f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f290757g;

    public q1(com.tencent.mm.ui.widget.dialog.k0 k0Var, boolean z17, id2.v1 v1Var, android.widget.TextView textView) {
        this.f290754d = k0Var;
        this.f290755e = z17;
        this.f290756f = v1Var;
        this.f290757g = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$showBuyConfirmDialog$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f361767a >= 500) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f361767a);
            z17 = true;
        }
        qd2.h.f361767a = currentTimeMillis;
        if (z17) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$showBuyConfirmDialog$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        this.f290754d.u();
        boolean z18 = this.f290755e;
        id2.v1 v1Var = this.f290756f;
        android.widget.TextView textView = this.f290757g;
        kotlinx.coroutines.i2 i2Var = kotlinx.coroutines.i2.f310477d;
        if (z18) {
            kotlinx.coroutines.l.d(i2Var, kotlinx.coroutines.q1.f310570c, null, new id2.o1(v1Var, textView, null), 2, null);
        } else {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(i2Var, kotlinx.coroutines.internal.b0.f310484a, null, new id2.p1(textView, v1Var, null), 2, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$showBuyConfirmDialog$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
