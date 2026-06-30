package com.tencent.mm.plugin.profile.ui;

/* loaded from: classes4.dex */
public final class BizBindWxaInfoUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f153650d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f153651e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f153652f;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488212km;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent() == null) {
            finish();
            return;
        }
        this.f153651e = getIntent().getStringExtra("extra_username");
        this.f153652f = getIntent().getStringExtra("extra_appid");
        setBackBtn(new hr3.z(this));
        setMMTitle(com.tencent.mm.R.string.bbn);
        setActionbarColor(getActionbarColor());
        java.util.ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("extra_wxa_entry_info_list");
        android.view.View inflate = getLayoutInflater().inflate(com.tencent.mm.R.layout.f488211kl, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.obg);
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Integer.valueOf(parcelableArrayListExtra != null ? parcelableArrayListExtra.size() : 0);
        textView.setText(getString(com.tencent.mm.R.string.f490729aj3, objArr));
        android.widget.ListView listView = (android.widget.ListView) findViewById(com.tencent.mm.R.id.cqe);
        this.f153650d = listView;
        listView.addHeaderView(inflate);
        this.f153650d.setAdapter((android.widget.ListAdapter) new hr3.c0(getLayoutInflater(), parcelableArrayListExtra));
        this.f153650d.setOnItemClickListener(new hr3.a0(this));
        getContentView().setBackgroundResource(com.tencent.mm.R.color.a48);
    }
}
