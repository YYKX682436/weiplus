package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class SettingsModifyAliasCheckUI extends com.tencent.mm.ui.MMWizardActivity {

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f160515e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f160516f = null;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f160517g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public boolean f160518h = false;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489449cl4;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.ug(this));
        this.f160515e = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.mpy);
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.mpz)).setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.vg(this));
        java.util.List list = f14.j.f258687e;
        this.f160516f = list;
        if (list == null || list.isEmpty()) {
            this.f160518h = false;
            this.f160515e.removeAllViews();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsModifyAliasCheckUI", "conditions %s", java.lang.Integer.valueOf(this.f160516f.size()));
        this.f160515e.removeAllViews();
        this.f160518h = true;
        for (int i17 = 0; i17 < this.f160516f.size(); i17++) {
            android.view.View inflate = android.view.View.inflate(this, com.tencent.mm.R.layout.clq, null);
            ((java.util.ArrayList) this.f160517g).add(inflate);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.jpk);
            android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.jpi);
            android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.jpj);
            textView.setText(((r45.e00) this.f160516f.get(i17)).f372886d);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(((r45.e00) this.f160516f.get(i17)).f372887e)) {
                textView2.setText(((r45.e00) this.f160516f.get(i17)).f372887e);
                textView2.setVisibility(0);
            }
            textView3.setText(((r45.e00) this.f160516f.get(i17)).f372888f);
            if (((r45.e00) this.f160516f.get(i17)).f372889g) {
                textView3.setTextColor(getResources().getColor(com.tencent.mm.R.color.f479206su));
            } else {
                textView3.setTextColor(getResources().getColor(com.tencent.mm.R.color.f479482a31));
            }
            if (i17 % 2 == 0) {
                android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.jpl);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsModifyAliasCheckUI", "showConditions", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/setting/ui/setting/SettingsModifyAliasCheckUI", "showConditions", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.jph);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsModifyAliasCheckUI", "showConditions", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/setting/ui/setting/SettingsModifyAliasCheckUI", "showConditions", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.jph);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsModifyAliasCheckUI", "showConditions", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/setting/ui/setting/SettingsModifyAliasCheckUI", "showConditions", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            this.f160515e.addView(inflate, new android.widget.LinearLayout.LayoutParams(-1, -2));
            this.f160518h = this.f160518h && ((r45.e00) this.f160516f.get(i17)).f372889g;
        }
    }

    @Override // com.tencent.mm.ui.MMWizardActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
        if (((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableModAlias", 0) == 0) {
            finish();
        }
    }
}
