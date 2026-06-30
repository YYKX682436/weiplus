package rn2;

/* loaded from: classes3.dex */
public final class s1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn2.t2 f397841d;

    public s1(rn2.t2 t2Var) {
        this.f397841d = t2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        df2.od odVar;
        android.text.Editable text;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$initView$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f361767a >= 500) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f361767a);
            z17 = true;
        }
        qd2.h.f361767a = currentTimeMillis;
        if (z17) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$initView$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.Integer[] numArr = {2, 3};
        rn2.t2 t2Var = this.f397841d;
        rn2.f fVar = t2Var.f397854f;
        if (!kz5.z.G(numArr, fVar != null ? java.lang.Integer.valueOf(((rn2.c1) fVar).f397682y.b()) : null)) {
            android.widget.EditText editText = t2Var.F;
            java.lang.String obj = (editText == null || (text = editText.getText()) == null) ? null : text.toString();
            if (obj == null || obj.length() == 0) {
                com.tencent.mm.ui.MMActivity mMActivity = t2Var.f397853e;
                db5.t7.makeText(mMActivity, mMActivity.getString(com.tencent.mm.R.string.drm), 0).show();
                yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$initView$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        rn2.f fVar2 = t2Var.f397854f;
        if (fVar2 != null && ((rn2.c1) fVar2).f397682y.b() == 2) {
            if (fVar2 != null) {
                v65.i.c(new com.tencent.mm.sdk.coroutines.LifecycleScope("FinderLiveLotteryCreateViewCallback", t2Var.f397853e, 0, 4, null), null, new rn2.r1(t2Var, ((rn2.c1) fVar2).q(), null), 1, null);
            }
        } else if (fVar2 != null) {
            rn2.c1 c1Var = (rn2.c1) fVar2;
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_LOTTERY_LICENSE_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
            if (c1Var.f397681x == 0) {
                c1Var.h(null, 0);
            } else {
                c1Var.v();
            }
        }
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
        if (liveRoomControllerStore != null && (odVar = (df2.od) liveRoomControllerStore.controller(df2.od.class)) != null) {
            odVar.e7(r45.n72.kActionType_CreateLottery);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$initView$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
