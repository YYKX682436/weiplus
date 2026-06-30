package com.tencent.mm.pluginsdk.ui;

@db5.a(3)
/* loaded from: classes5.dex */
public class ProfileHdHeadImg extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f189810d = null;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bic;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (getSupportActionBar() != null) {
            getSupportActionBar().o();
        }
        this.f189810d = getIntent().getStringExtra(dm.i4.COL_USERNAME);
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.BW_0));
        setNavigationbarColor(getResources().getColor(com.tencent.mm.R.color.BW_0));
        com.tencent.mm.plugin.setting.ui.setting.view.GetHdHeadImageGalleryView getHdHeadImageGalleryView = (com.tencent.mm.plugin.setting.ui.setting.view.GetHdHeadImageGalleryView) findViewById(com.tencent.mm.R.id.ghs);
        getHdHeadImageGalleryView.setUsername(this.f189810d);
        getHdHeadImageGalleryView.setSingleClickOverListener(new com.tencent.mm.ui.tools.s5() { // from class: com.tencent.mm.pluginsdk.ui.ProfileHdHeadImg$$a
            @Override // com.tencent.mm.ui.tools.s5
            public final void a() {
                com.tencent.mm.pluginsdk.ui.ProfileHdHeadImg.this.finish();
            }
        });
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(f45.b.class);
    }
}
