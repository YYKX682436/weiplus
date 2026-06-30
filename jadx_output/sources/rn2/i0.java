package rn2;

/* loaded from: classes.dex */
public final class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f397761d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f397762e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f397763f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.dz1 f397764g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v65.n f397765h;

    public i0(com.tencent.mm.ui.widget.dialog.k0 k0Var, boolean z17, android.content.Context context, r45.dz1 dz1Var, v65.n nVar) {
        this.f397761d = k0Var;
        this.f397762e = z17;
        this.f397763f = context;
        this.f397764g = dz1Var;
        this.f397765h = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateGiftUtil$showBuyConfirmDialog$2$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f361767a >= 500) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f361767a);
            z17 = true;
        }
        qd2.h.f361767a = currentTimeMillis;
        if (z17) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateGiftUtil$showBuyConfirmDialog$2$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        this.f397761d.u();
        boolean z18 = this.f397762e;
        v65.n nVar = this.f397765h;
        r45.dz1 dz1Var = this.f397764g;
        android.content.Context context = this.f397763f;
        kotlinx.coroutines.i2 i2Var = kotlinx.coroutines.i2.f310477d;
        if (z18) {
            kotlinx.coroutines.l.d(i2Var, kotlinx.coroutines.q1.f310570c, null, new rn2.g0(context, dz1Var, nVar, null), 2, null);
        } else {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(i2Var, kotlinx.coroutines.internal.b0.f310484a, null, new rn2.h0(context, dz1Var, nVar, null), 2, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateGiftUtil$showBuyConfirmDialog$2$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
