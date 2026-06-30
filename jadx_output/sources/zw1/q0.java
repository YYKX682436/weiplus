package zw1;

/* loaded from: classes5.dex */
public class q0 implements ww1.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.CollectMainUI f476763a;

    public q0(com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI) {
        this.f476763a = collectMainUI;
    }

    @Override // ww1.w
    public void a(android.view.View view, int i17) {
        com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI = this.f476763a;
        android.view.View view2 = collectMainUI.Q1;
        if (view2 != null) {
            ((android.widget.LinearLayout) collectMainUI.Q1.findViewById(com.tencent.mm.R.id.c3j)).setVisibility(4);
            ((android.widget.LinearLayout) collectMainUI.Q1.findViewById(com.tencent.mm.R.id.c3h)).setContentDescription(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.kdy, ((android.widget.TextView) collectMainUI.Q1.findViewById(com.tencent.mm.R.id.c3m)).getText()));
        }
        ((android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.c3j)).setVisibility(0);
        if (i17 == collectMainUI.S1.f382535f.size()) {
            collectMainUI.f96390b2 = true;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.c3l);
            linearLayout.setVisibility(0);
            com.tencent.mm.ui.widget.edittext.PasterEditText pasterEditText = (com.tencent.mm.ui.widget.edittext.PasterEditText) linearLayout.findViewById(com.tencent.mm.R.id.c3k);
            pasterEditText.postDelayed(new zw1.o0(this, pasterEditText), 50L);
            collectMainUI.P1.b(!com.tencent.mm.sdk.platformtools.t8.K0(pasterEditText.getText().toString()));
            if (!collectMainUI.f96389a2) {
                collectMainUI.Z1 = collectMainUI.P1.f212058g.getMeasuredHeight();
            }
        } else {
            collectMainUI.f96390b2 = false;
            android.view.View view3 = collectMainUI.Q1;
            if (view3 != null) {
                android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) view3.findViewById(com.tencent.mm.R.id.c3l);
                if (linearLayout2.getVisibility() == 0) {
                    linearLayout2.setVisibility(8);
                    linearLayout2.clearFocus();
                    linearLayout2.postDelayed(new zw1.p0(this), 200L);
                }
                ((android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.c3h)).setContentDescription(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.kdz, collectMainUI.U1));
            }
            collectMainUI.P1.b(true);
            collectMainUI.U1 = ((r45.hg5) collectMainUI.S1.f382535f.get(i17)).f376139d;
            if (!collectMainUI.f96389a2) {
                collectMainUI.Y1 = collectMainUI.P1.f212058g.getMeasuredHeight();
            }
        }
        collectMainUI.Q1 = view;
    }
}
