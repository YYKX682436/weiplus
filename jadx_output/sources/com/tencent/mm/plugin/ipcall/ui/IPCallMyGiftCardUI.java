package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes.dex */
public class IPCallMyGiftCardUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.ipcall.ui.v2 f142637d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ListView f142638e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f142639f;

    /* renamed from: g, reason: collision with root package name */
    public android.app.ProgressDialog f142640g;

    /* renamed from: h, reason: collision with root package name */
    public p83.d f142641h;

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489187bm3;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        c01.d9.e().a(288, this);
        setMMTitle(com.tencent.mm.R.string.g5i);
        setBackBtn(new com.tencent.mm.plugin.ipcall.ui.r2(this));
        addTextOptionMenu(0, getContext().getString(com.tencent.mm.R.string.g5g), new com.tencent.mm.plugin.ipcall.ui.s2(this));
        this.f142639f = findViewById(com.tencent.mm.R.id.hgs);
        this.f142638e = (android.widget.ListView) findViewById(com.tencent.mm.R.id.hgt);
        com.tencent.mm.plugin.ipcall.ui.v2 v2Var = new com.tencent.mm.plugin.ipcall.ui.v2(this);
        this.f142637d = v2Var;
        this.f142638e.setAdapter((android.widget.ListAdapter) v2Var);
        this.f142640g = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.g3z), true, true, new com.tencent.mm.plugin.ipcall.ui.t2(this));
        this.f142641h = new p83.d();
        c01.d9.e().g(this.f142641h);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c01.d9.e().q(288, this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallMyGiftCardUI", "onSceneEnd>errCode:%d,onSceneEnd>errMsg:%s", java.lang.Integer.valueOf(i18), str);
        if (m1Var instanceof p83.d) {
            if (i17 != 0 || i18 != 0) {
                android.app.ProgressDialog progressDialog = this.f142640g;
                if (progressDialog != null && progressDialog.isShowing()) {
                    this.f142640g.dismiss();
                }
                android.view.View view = this.f142639f;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallMyGiftCardUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/ipcall/ui/IPCallMyGiftCardUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                dp.a.makeText(getContext(), getString(com.tencent.mm.R.string.g3w), 0).show();
                return;
            }
            r45.nr3 nr3Var = ((p83.d) m1Var).f352738e;
            android.app.ProgressDialog progressDialog2 = this.f142640g;
            if (progressDialog2 != null && progressDialog2.isShowing()) {
                this.f142640g.dismiss();
            }
            com.tencent.mm.plugin.ipcall.ui.v2 v2Var = this.f142637d;
            v2Var.f143041d = nr3Var.f381615e;
            v2Var.notifyDataSetChanged();
            if (nr3Var.f381615e.size() == 0) {
                android.view.View view2 = this.f142639f;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallMyGiftCardUI", "refreshView", "(Lcom/tencent/mm/protocal/protobuf/GetWCOGiftCardListResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/ipcall/ui/IPCallMyGiftCardUI", "refreshView", "(Lcom/tencent/mm/protocal/protobuf/GetWCOGiftCardListResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }
}
