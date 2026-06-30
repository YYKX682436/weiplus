package com.tencent.mm.plugin.order.ui;

@db5.a(3)
/* loaded from: classes9.dex */
public class MallOrderProductListUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f152847d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.BaseAdapter f152848e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f152849f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f152850g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f152851h = "";

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bwr;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.grj);
        android.os.Bundle input = getInput();
        java.util.ArrayList parcelableArrayList = input.getParcelableArrayList("order_product_list");
        if (parcelableArrayList != null && parcelableArrayList.size() > 0) {
            java.util.ArrayList arrayList = (java.util.ArrayList) this.f152849f;
            arrayList.clear();
            arrayList.addAll(parcelableArrayList);
        }
        this.f152850g = input.getString("key_trans_id");
        this.f152851h = input.getString("appname");
        this.f152847d = (android.widget.ListView) findViewById(com.tencent.mm.R.id.kle);
        fp3.l lVar = new fp3.l(this, null);
        this.f152848e = lVar;
        this.f152847d.setAdapter((android.widget.ListAdapter) lVar);
        this.f152848e.notifyDataSetChanged();
        this.f152847d.setOnItemClickListener(new fp3.k(this));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentViewVisibility(0);
        initView();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyUp(i17, keyEvent);
        }
        if (!(com.tencent.mm.wallet_core.a.g(this) instanceof bp3.e)) {
            return true;
        }
        com.tencent.mm.wallet_core.a.a(this);
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }
}
