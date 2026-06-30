package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes15.dex */
public class IPCallPackageUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f142642d = null;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f142643e = null;

    /* renamed from: f, reason: collision with root package name */
    public android.app.ProgressDialog f142644f = null;

    /* renamed from: g, reason: collision with root package name */
    public android.app.ProgressDialog f142645g = null;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.ipcall.ui.f3 f142646h = null;

    /* renamed from: i, reason: collision with root package name */
    public p83.e f142647i = null;

    /* renamed from: m, reason: collision with root package name */
    public p83.j f142648m = null;

    /* renamed from: n, reason: collision with root package name */
    public final q83.e f142649n = new q83.e();

    public final void T6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallPackageUI", "startGetPackageProductList");
        com.tencent.mm.plugin.ipcall.ui.f3 f3Var = this.f142646h;
        if (f3Var != null) {
            f3Var.f142825d = null;
            f3Var.notifyDataSetChanged();
        }
        android.widget.ListView listView = this.f142642d;
        if (listView != null) {
            listView.setVisibility(8);
        }
        android.widget.TextView textView = this.f142643e;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.app.ProgressDialog progressDialog = this.f142644f;
        if (progressDialog == null) {
            this.f142644f = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.g3z), true, true, new com.tencent.mm.plugin.ipcall.ui.x2(this));
        } else {
            progressDialog.show();
        }
        this.f142647i = new p83.e();
        c01.d9.e().g(this.f142647i);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489189bm5;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        c01.d9.e().a(831, this);
        c01.d9.e().a(com.tencent.mm.plugin.appbrand.jsapi.bio.soter.k.CTRL_INDEX, this);
        q83.e eVar = this.f142649n;
        eVar.d();
        eVar.f360756b++;
        eVar.b();
        setMMTitle(com.tencent.mm.R.string.g5v);
        setBackBtn(new com.tencent.mm.plugin.ipcall.ui.w2(this));
        this.f142642d = (android.widget.ListView) findViewById(com.tencent.mm.R.id.kns);
        com.tencent.mm.plugin.ipcall.ui.f3 f3Var = new com.tencent.mm.plugin.ipcall.ui.f3(this);
        this.f142646h = f3Var;
        this.f142642d.setAdapter((android.widget.ListAdapter) f3Var);
        this.f142643e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.kca);
        T6();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c01.d9.e().q(831, this);
        c01.d9.e().q(com.tencent.mm.plugin.appbrand.jsapi.bio.soter.k.CTRL_INDEX, this);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.util.List list;
        java.util.LinkedList linkedList;
        android.app.ProgressDialog progressDialog = this.f142644f;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f142644f.dismiss();
        }
        android.app.ProgressDialog progressDialog2 = this.f142645g;
        if (progressDialog2 != null && progressDialog2.isShowing()) {
            this.f142645g.dismiss();
        }
        r45.p57 p57Var = null;
        if (m1Var instanceof p83.e) {
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallPackageUI", "onSceneEnd NetSceneIPCallGetPackageProductList errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i18), str);
            if (i17 != 0 || i18 != 0) {
                dp.a.makeText(getContext(), getString(com.tencent.mm.R.string.g3w), 0).show();
                finish();
                return;
            }
            r45.pr3 pr3Var = ((p83.e) m1Var).f352741e;
            if (pr3Var == null || (linkedList = pr3Var.f383327e) == null || linkedList.size() <= 0) {
                com.tencent.mm.plugin.ipcall.ui.f3 f3Var = this.f142646h;
                f3Var.f142825d = null;
                f3Var.notifyDataSetChanged();
                this.f142643e.setVisibility(0);
                return;
            }
            com.tencent.mm.plugin.ipcall.ui.f3 f3Var2 = this.f142646h;
            f3Var2.f142825d = linkedList;
            f3Var2.notifyDataSetChanged();
            this.f142642d.setVisibility(0);
            return;
        }
        if (!(m1Var instanceof p83.j)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallPackageUI", "onSceneEnd errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i18), str);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallPackageUI", "onSceneEnd NetSceneIPCallPurchasePackage errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i18), str);
        q83.e eVar = this.f142649n;
        eVar.f360760f = i18;
        if (i17 == 0 && i18 == 0) {
            eVar.b();
            dp.a.makeText(getContext(), getString(com.tencent.mm.R.string.g5x), 0).show();
            T6();
            return;
        }
        if (i18 != 101) {
            eVar.b();
            dp.a.makeText(getContext(), getString(com.tencent.mm.R.string.g5r), 0).show();
            T6();
            return;
        }
        com.tencent.mm.plugin.ipcall.ui.f3 f3Var3 = this.f142646h;
        r45.r57 r57Var = ((p83.j) m1Var).f352758e;
        java.lang.String str2 = r57Var != null ? r57Var.f384566d : "";
        f3Var3.getClass();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && (list = f3Var3.f142825d) != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                r45.p57 p57Var2 = (r45.p57) it.next();
                if (p57Var2 != null && p57Var2.f382781m.equals(str2)) {
                    p57Var = p57Var2;
                    break;
                }
            }
        }
        if (p57Var != null) {
            db5.e1.C(getContext(), getContext().getString(com.tencent.mm.R.string.g5t, p57Var.f382776e, p57Var.f382775d), getContext().getString(com.tencent.mm.R.string.g5u), getContext().getString(com.tencent.mm.R.string.g4b), getContext().getString(com.tencent.mm.R.string.g5o), false, new com.tencent.mm.plugin.ipcall.ui.z2(this), new com.tencent.mm.plugin.ipcall.ui.a3(this));
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.IPCallPackageUI", "onSceneEnd: proToBuy is null");
        eVar.b();
        dp.a.makeText(getContext(), getString(com.tencent.mm.R.string.g5r), 0).show();
    }
}
