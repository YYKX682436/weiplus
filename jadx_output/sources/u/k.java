package u;

/* loaded from: classes16.dex */
public final class k extends u.n implements oa.c {
    public final jz5.g B6;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.B6 = jz5.h.b(new u.j(this));
    }

    public final com.google.android.material.tabs.TabLayout a() {
        return (com.google.android.material.tabs.TabLayout) ((jz5.n) this.B6).getValue();
    }

    public final void b(oa.i iVar, boolean z17) {
        android.view.View view;
        android.widget.TextView textView = (iVar == null || (view = iVar.f343783f) == null) ? null : (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f487785n6);
        if (textView == null) {
            return;
        }
        textView.setTypeface(textView.getTypeface(), z17 ? 1 : 0);
        textView.setTextColor(b3.l.getColor(getActivity(), z17 ? com.tencent.mm.R.color.abw : com.tencent.mm.R.color.adg));
    }

    @Override // oa.c
    public void h0(oa.i iVar) {
    }

    @Override // oa.c
    public void l4(oa.i iVar) {
        b(iVar, false);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CombineTabBarUIC", "onCreate");
        com.google.android.material.tabs.TabLayout a17 = a();
        oa.i l17 = a().l();
        android.view.View inflate = android.view.LayoutInflater.from(getActivity()).inflate(com.tencent.mm.R.layout.d_, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487785n6)).setText(getString(com.tencent.mm.R.string.f491657fl));
        l17.f343783f = inflate;
        l17.f();
        a17.b(l17);
        com.google.android.material.tabs.TabLayout a18 = a();
        oa.i l18 = a().l();
        android.view.View inflate2 = android.view.LayoutInflater.from(getActivity()).inflate(com.tencent.mm.R.layout.d_, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.f487785n6)).setText(getString(com.tencent.mm.R.string.f491602fk));
        l18.f343783f = inflate2;
        l18.f();
        a18.b(l18);
        a().a(this);
        int tabCount = a().getTabCount();
        int i17 = 0;
        while (i17 < tabCount) {
            b(a().k(i17), i17 == T6());
            i17++;
        }
        oa.i k17 = a().k(T6());
        if (k17 != null) {
            k17.b();
        }
    }

    @Override // oa.c
    public void u1(oa.i iVar) {
        if (iVar != null) {
            int i17 = iVar.f343782e;
            com.tencent.mars.xlog.Log.i("MicroMsg.CombineTabBarUIC", "onTabSelected position=" + i17);
            P6().setCurrentItem(i17, false);
            b(iVar, true);
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[2];
            lVarArr[0] = new jz5.l("post_session_id", ca4.z0.l());
            lVarArr[1] = new jz5.l("50479_btn_type", java.lang.Integer.valueOf(i17 == 0 ? 1 : 2));
            ((cy1.a) rVar).Hj("button_50479", "view_clk", kz5.c1.k(lVarArr), 36244);
        }
    }
}
