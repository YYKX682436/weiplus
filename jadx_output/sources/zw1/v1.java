package zw1;

/* loaded from: classes5.dex */
public class v1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.CollectMainUI f476825a;

    public v1(com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI) {
        this.f476825a = collectMainUI;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI = this.f476825a;
        if (collectMainUI.isFinishing() || collectMainUI.isDestroyed()) {
            return null;
        }
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            collectMainUI.S1 = (r45.ov) fVar.f70618d;
            com.tencent.mm.ui.widget.dialog.z2 z2Var = collectMainUI.P1;
            if (z2Var == null || !z2Var.h()) {
                com.tencent.mm.ui.widget.dialog.z2 z2Var2 = new com.tencent.mm.ui.widget.dialog.z2(collectMainUI, 1, 3, false);
                collectMainUI.P1 = z2Var2;
                z2Var2.f212058g.setFocusable(false);
                com.tencent.mm.ui.widget.dialog.z2 z2Var3 = collectMainUI.P1;
                r45.ov ovVar = collectMainUI.S1;
                z2Var3.m(ovVar.f382536g.f389135d, ovVar.f382537h.f389135d);
                android.widget.TextView textView = new android.widget.TextView(collectMainUI);
                textView.setPadding(i65.a.b(collectMainUI, 24), i65.a.b(collectMainUI, 40), i65.a.b(collectMainUI, 24), i65.a.b(collectMainUI, 24));
                textView.setTextSize(1, i65.a.q(collectMainUI.getContext()) * 17.0f);
                textView.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
                textView.setTextColor(collectMainUI.getResources().getColor(com.tencent.mm.R.color.FG_0));
                textView.setText(collectMainUI.S1.f382533d);
                collectMainUI.P1.t(textView);
                androidx.recyclerview.widget.RecyclerView recyclerView = new androidx.recyclerview.widget.RecyclerView(collectMainUI, null);
                if (collectMainUI.R1 == null) {
                    ww1.y yVar = new ww1.y(collectMainUI, collectMainUI.S1.f382535f);
                    collectMainUI.R1 = yVar;
                    yVar.f450355e = collectMainUI.S1.f382534e;
                    yVar.f450358h = collectMainUI;
                }
                recyclerView.setFocusable(false);
                recyclerView.setAdapter(collectMainUI.R1);
                recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(collectMainUI));
                recyclerView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
                collectMainUI.P1.j(recyclerView);
                collectMainUI.R1.f450357g = new zw1.q0(collectMainUI);
                zw1.s0 s0Var = new zw1.s0(collectMainUI);
                zw1.u0 u0Var = new zw1.u0(collectMainUI);
                collectMainUI.P1.b(false);
                com.tencent.mm.ui.widget.dialog.z2 z2Var4 = collectMainUI.P1;
                z2Var4.D = s0Var;
                z2Var4.E = u0Var;
                z2Var4.C();
                collectMainUI.Y1 = collectMainUI.P1.f212058g.getMeasuredHeight();
            }
        }
        return java.lang.Boolean.TRUE;
    }
}
