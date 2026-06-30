package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes.dex */
public class IPCallAllRecordUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f142547d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f142548e;

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bll;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f142547d = getIntent().getStringExtra("IPCallAllRecordUI_phoneNumber");
        this.f142548e = getIntent().getStringExtra("IPCallAllRecordUI_contactId");
        getIntent().getBooleanExtra("IPCallAllRecordUI_isSinglePhoneNumber", false);
        setMMTitle(com.tencent.mm.R.string.g4j);
        setBackBtn(new com.tencent.mm.plugin.ipcall.ui.r0(this));
        ((android.widget.ListView) findViewById(com.tencent.mm.R.id.f482942sg)).setAdapter((android.widget.ListAdapter) new com.tencent.mm.plugin.ipcall.ui.t0(this, this));
    }
}
