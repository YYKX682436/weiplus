package rn2;

/* loaded from: classes3.dex */
public final class i1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn2.t2 f397766d;

    public i1(rn2.t2 t2Var) {
        this.f397766d = t2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$initPrizeSourceChooser$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rn2.t2 t2Var = this.f397766d;
        com.tencent.mm.ui.MMActivity mMActivity = t2Var.f397853e;
        t2Var.M = new com.tencent.mm.ui.widget.dialog.z2(mMActivity, 0, 2);
        android.view.View inflate = android.view.View.inflate(mMActivity, com.tencent.mm.R.layout.der, null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.q8_);
        textView.setText(textView.getContext().getResources().getString(com.tencent.mm.R.string.drb));
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.q8a);
        if (findViewById != null) {
            findViewById.setOnClickListener(new rn2.m2(t2Var));
        }
        com.tencent.mm.ui.widget.dialog.z2 z2Var = t2Var.M;
        if (z2Var != null) {
            z2Var.s(inflate);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = new androidx.recyclerview.widget.RecyclerView(mMActivity, null);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(mMActivity, 1, false));
        rn2.w2 w2Var = new rn2.w2();
        rn2.f fVar = t2Var.f397854f;
        w2Var.f397907d = fVar != null ? ((rn2.c1) fVar).f397682y.f397703e : null;
        w2Var.f397908e = new rn2.n2(t2Var);
        recyclerView.setAdapter(w2Var);
        com.tencent.mm.ui.widget.dialog.z2 z2Var2 = t2Var.M;
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
        com.tencent.mm.ui.widget.dialog.z2 z2Var3 = t2Var.M;
        if (z2Var3 != null) {
            z2Var3.C();
        }
        if (((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).fk()) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", 19);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.f328366o, jSONObject.toString(), null, 4, null);
        } else {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("type", 8);
            i95.m c18 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            ml2.c1 c1Var = ml2.c1.f327325e;
            zy2.zb.j5((zy2.zb) c18, 6L, jSONObject2.toString(), null, 4, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$initPrizeSourceChooser$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
