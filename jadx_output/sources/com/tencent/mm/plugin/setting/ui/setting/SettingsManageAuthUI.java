package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public class SettingsManageAuthUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f160484d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f160485e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.setting.ui.setting.uf f160486f;

    /* renamed from: g, reason: collision with root package name */
    public android.app.ProgressDialog f160487g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f160488h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public boolean f160489i;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f160490m;

    public final void T6() {
        removeAllOptionMenu();
        if (((java.util.ArrayList) this.f160488h).isEmpty()) {
            android.view.View view = this.f160485e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsManageAuthUI", "refreshOptionMenu", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/setting/ui/setting/SettingsManageAuthUI", "refreshOptionMenu", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f160485e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsManageAuthUI", "refreshOptionMenu", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/setting/ui/setting/SettingsManageAuthUI", "refreshOptionMenu", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f160489i) {
            addTextOptionMenu(700, getString(com.tencent.mm.R.string.f490441v5), new com.tencent.mm.plugin.setting.ui.setting.pf(this));
        } else {
            addTextOptionMenu(700, getString(com.tencent.mm.R.string.f490471w0), new com.tencent.mm.plugin.setting.ui.setting.qf(this));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cll;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f160484d = (android.widget.ListView) findViewById(com.tencent.mm.R.id.a8a);
        this.f160485e = findViewById(com.tencent.mm.R.id.a8_);
        com.tencent.mm.plugin.setting.ui.setting.uf ufVar = new com.tencent.mm.plugin.setting.ui.setting.uf(this, null);
        this.f160486f = ufVar;
        this.f160484d.setAdapter((android.widget.ListAdapter) ufVar);
        this.f160484d.setOnScrollListener(new com.tencent.mm.plugin.setting.ui.setting.mf(this));
        this.f160484d.setOnItemClickListener(new com.tencent.mm.plugin.setting.ui.setting.nf(this));
        T6();
        setMMTitle(com.tencent.mm.R.string.ipn);
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.of(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        gm0.j1.d().q(1146, this);
        gm0.j1.d().q(1127, this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        gm0.j1.d().a(1146, this);
        gm0.j1.d().a(1127, this);
        gm0.j1.d().g(new k14.c0(null));
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsManageAuthUI", "errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        android.app.ProgressDialog progressDialog = this.f160487g;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        if (i17 != 0 || i18 != 0) {
            db5.e1.T(this, str);
            return;
        }
        int type = m1Var.getType();
        java.util.List list = this.f160488h;
        if (type == 1146) {
            k14.c0 c0Var = (k14.c0) m1Var;
            this.f160490m = c0Var.H();
            if (!(c0Var.f303314f != null)) {
                ((java.util.ArrayList) list).clear();
            }
            r45.cq3 cq3Var = c0Var.f303313e;
            ((java.util.ArrayList) list).addAll(cq3Var != null ? cq3Var.f371788e : java.util.Collections.emptyList());
            com.tencent.mm.plugin.setting.ui.setting.uf ufVar = this.f160486f;
            ufVar.f161610d = list;
            ufVar.notifyDataSetChanged();
            T6();
            return;
        }
        if (m1Var.getType() == 1127) {
            java.lang.String str2 = ((k14.w) m1Var).f303392e;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                return;
            }
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
            if (!arrayList.isEmpty()) {
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((r45.ov6) it.next()).f382560d.equals(str2)) {
                        it.remove();
                        break;
                    }
                }
            }
            this.f160486f.notifyDataSetChanged();
        }
    }
}
