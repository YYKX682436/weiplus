package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes7.dex */
public class MMSightRecordViewTestUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.mmsight.api.MMSightRecordView f149214d;

    /* renamed from: e, reason: collision with root package name */
    public final int f149215e = com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH;

    /* renamed from: f, reason: collision with root package name */
    public final float f149216f = 0.67f;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c1v;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setBackBtn(new com.tencent.mm.plugin.mmsight.ui.k0(this));
        com.tencent.mm.plugin.mmsight.api.MMSightRecordView mMSightRecordView = (com.tencent.mm.plugin.mmsight.api.MMSightRecordView) findViewById(com.tencent.mm.R.id.lpz);
        this.f149214d = mMSightRecordView;
        mMSightRecordView.setDisplayRatio(this.f149216f);
        this.f149214d.setPreviewSizeLimit(this.f149215e);
        this.f149214d.d(100000, 4800000, 30, 64000, 44100);
        this.f149214d.setVideoFilePath(lp0.b.D() + "mmsighttest.mp4");
        this.f149214d.setClipPictureSize(true);
        this.f149214d.setClipVideoSize(true);
        ((kt3.n) this.f149214d.f148832d).getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppRecordViewImpl", "setHalfPreviewVideoSize");
        this.f149214d.setFlashMode(3);
        this.f149214d.setFrameDataCallback(new com.tencent.mm.plugin.mmsight.ui.l0(this));
        this.f149214d.f();
        this.f149214d.f148832d.getClass();
        findViewById(com.tencent.mm.R.id.nxn).setOnClickListener(new com.tencent.mm.plugin.mmsight.ui.n0(this));
        findViewById(com.tencent.mm.R.id.ngv).setOnClickListener(new com.tencent.mm.plugin.mmsight.ui.q0(this));
        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.mmsight.ui.r0(this, (android.widget.TextView) findViewById(com.tencent.mm.R.id.f484030cr4)), 1000L);
        findViewById(com.tencent.mm.R.id.ntq).setOnClickListener(new com.tencent.mm.plugin.mmsight.ui.s0(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        kt3.n nVar = (kt3.n) this.f149214d.f148832d;
        kt3.l lVar = nVar.f312007d;
        if (lVar != null) {
            lVar.release();
        }
        nVar.f312016p = null;
    }
}
