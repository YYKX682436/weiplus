package rn2;

/* loaded from: classes3.dex */
public final class v1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn2.t2 f397898d;

    public v1(rn2.t2 t2Var) {
        this.f397898d = t2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f361767a >= 500) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f361767a);
            z17 = true;
        }
        qd2.h.f361767a = currentTimeMillis;
        if (z17) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        rn2.t2 t2Var = this.f397898d;
        com.tencent.mm.ui.MMActivity mMActivity = t2Var.f397853e;
        t2Var.L = new com.tencent.mm.ui.widget.dialog.z2(mMActivity, 0, 2);
        android.view.View inflate = android.view.View.inflate(mMActivity, com.tencent.mm.R.layout.f488918au1, null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f485720ir5);
        textView.setText(textView.getContext().getResources().getString(com.tencent.mm.R.string.drb));
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.f485717ir2);
        if (findViewById != null) {
            findViewById.setOnClickListener(new rn2.o2(t2Var));
        }
        com.tencent.mm.ui.widget.dialog.z2 z2Var = t2Var.L;
        if (z2Var != null) {
            z2Var.s(inflate);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = new androidx.recyclerview.widget.RecyclerView(mMActivity, null);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(mMActivity, 1, false));
        rn2.w2 w2Var = new rn2.w2();
        rn2.f fVar = t2Var.f397854f;
        w2Var.f397907d = fVar != null ? (java.util.ArrayList) ((jz5.n) ((rn2.c1) fVar).f397682y.f397710l).getValue() : null;
        w2Var.f397908e = new rn2.p2(t2Var);
        recyclerView.setAdapter(w2Var);
        com.tencent.mm.ui.widget.dialog.z2 z2Var2 = t2Var.L;
        if (z2Var2 != null) {
            z2Var2.j(recyclerView);
        }
        android.view.ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams != null) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = com.tencent.mm.ui.bl.c(com.tencent.mm.sdk.platformtools.x2.f193071a);
            }
        }
        com.tencent.mm.ui.widget.dialog.z2 z2Var3 = t2Var.L;
        if (z2Var3 != null) {
            z2Var3.C();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
