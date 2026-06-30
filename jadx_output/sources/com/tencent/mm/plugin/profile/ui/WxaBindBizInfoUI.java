package com.tencent.mm.plugin.profile.ui;

/* loaded from: classes4.dex */
public class WxaBindBizInfoUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f153870d;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d_k;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent() == null) {
            finish();
            return;
        }
        setBackBtn(new hr3.oi(this), com.tencent.mm.R.raw.actionbar_icon_dark_back);
        setMMTitle(com.tencent.mm.R.string.f490253pe);
        setActionbarColor(getActionbarColor());
        java.util.ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("wxa_entry_info_list");
        java.lang.String stringExtra = getIntent().getStringExtra("register");
        android.view.View inflate = getLayoutInflater().inflate(com.tencent.mm.R.layout.f488211kl, (android.view.ViewGroup) null);
        inflate.setAccessibilityDelegate(new hr3.pi(this));
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.obg);
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            stringExtra = getString(com.tencent.mm.R.string.f490253pe);
        }
        textView.setText(stringExtra);
        android.widget.ListView listView = (android.widget.ListView) findViewById(com.tencent.mm.R.id.cqe);
        this.f153870d = listView;
        listView.addHeaderView(inflate);
        this.f153870d.setAdapter((android.widget.ListAdapter) new hr3.ti(getLayoutInflater(), parcelableArrayListExtra));
        this.f153870d.setOnItemClickListener(new hr3.qi(this));
        getContentView().setBackgroundResource(com.tencent.mm.R.color.a48);
    }
}
