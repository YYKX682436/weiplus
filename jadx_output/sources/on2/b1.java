package on2;

/* loaded from: classes3.dex */
public final class b1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ on2.j1 f346846d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.dz1 f346847e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f346848f;

    public b1(on2.j1 j1Var, r45.dz1 dz1Var, int i17) {
        this.f346846d = j1Var;
        this.f346847e = dz1Var;
        this.f346848f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/FinderLiveLotteryPanelListAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f361767a >= 500) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f361767a);
            z17 = true;
        }
        qd2.h.f361767a = currentTimeMillis;
        if (z17) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/FinderLiveLotteryPanelListAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        yz5.p pVar = this.f346846d.f346947f;
        if (pVar != null) {
            pVar.invoke(this.f346847e, java.lang.Integer.valueOf(this.f346848f));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/FinderLiveLotteryPanelListAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
