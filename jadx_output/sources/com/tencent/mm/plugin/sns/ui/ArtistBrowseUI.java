package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ArtistBrowseUI extends com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI {
    public java.lang.String S = "";
    public java.lang.String T = "";

    @Override // com.tencent.mm.ui.MMFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI");
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0) {
            boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI");
            return dispatchKeyEvent;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("sns_cmd_list", f7().h());
        setResult(-1, intent);
        finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI");
        return com.tencent.mm.R.layout.crv;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:1|(3:34|35|(10:39|(5:42|(3:45|46|43)|47|48|40)|49|50|20|(1:22)(1:30)|23|(1:25)(1:29)|26|27))|3|4|(1:6)(1:32)|(1:8)|9|(4:12|(3:15|16|13)|17|10)|18|19|20|(0)(0)|23|(0)(0)|26|27) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01af, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.SnsInfoStorageLogic", "error initDataArtist");
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01d0  */
    @Override // com.tencent.mm.ui.MMActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initView() {
        /*
            Method dump skipped, instructions count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.ArtistBrowseUI.initView():void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.ArtistBrowseUI", "onAcvityResult requestCode:" + i17);
        if (i18 != -1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI");
            return;
        }
        int intExtra = intent.getIntExtra("sns_gallery_op_id", 0);
        com.tencent.mm.plugin.sns.ui.c4 f76 = f7();
        f76.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addOpCmd", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        if (intExtra == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addOpCmd", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        } else {
            f76.f168088e.a(intExtra);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addOpCmd", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI");
        super.onCreate(bundle);
        initView();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI");
        com.tencent.mm.plugin.sns.model.l4.hj().N(this);
        super.onDestroy();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI");
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f166810o;
        if (snsInfoFlip != null) {
            snsInfoFlip.b0();
        }
        super.onPause();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI");
        super.onResume();
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f166810o;
        if (snsInfoFlip != null) {
            snsInfoFlip.c0(false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI, com.tencent.mm.plugin.sns.ui.n4
    public void s3(boolean z17, java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyData", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI");
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f166810o;
        if (snsInfoFlip != null) {
            if (z17) {
                snsInfoFlip.c0(true);
            } else {
                snsInfoFlip.W();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyData", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI, com.tencent.mm.plugin.sns.ui.n4
    public void y1(java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSelectedId", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSelectedId", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI");
    }
}
