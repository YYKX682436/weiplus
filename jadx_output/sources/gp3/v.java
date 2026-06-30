package gp3;

/* loaded from: classes3.dex */
public class v extends com.tencent.mm.ui.base.preference.Preference {
    public android.view.View L;
    public boolean M;
    public boolean N;
    public boolean P;

    public v(android.content.Context context) {
        super(context);
        this.L = null;
        this.M = false;
        this.N = false;
        this.P = true;
        this.G = com.tencent.mm.R.layout.bwh;
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View p(android.view.View view, android.view.ViewGroup viewGroup) {
        if (this.L == null) {
            this.L = u(viewGroup);
        }
        t(this.L);
        return this.L;
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.j_c);
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) findViewById.getLayoutParams();
        int d17 = com.tencent.mm.sdk.platformtools.j.d(this.f197770d, 10.0f);
        int i17 = this.M ? d17 : 0;
        if (!this.N) {
            d17 = 0;
        }
        layoutParams.setMargins(0, i17, 0, d17);
        findViewById.setLayoutParams(layoutParams);
        if (this.P) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/order/ui/preference/MallOrderDividerPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/order/ui/preference/MallOrderDividerPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(4);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/order/ui/preference/MallOrderDividerPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/order/ui/preference/MallOrderDividerPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
