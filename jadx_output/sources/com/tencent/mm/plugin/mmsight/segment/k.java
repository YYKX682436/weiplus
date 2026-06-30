package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes10.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f149048d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.segment.MMSightEditUI f149049e;

    public k(com.tencent.mm.plugin.mmsight.segment.MMSightEditUI mMSightEditUI, long j17) {
        this.f149049e = mMSightEditUI;
        this.f149048d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightEditUI", "connect cost %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - this.f149048d));
        if (com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.getInstance() != null) {
            wo.v1.a(com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.getInstance().getDeviceInfoConfig());
        }
        int i17 = com.tencent.mm.plugin.mmsight.segment.MMSightEditUI.f148857t;
        com.tencent.mm.plugin.mmsight.segment.MMSightEditUI mMSightEditUI = this.f149049e;
        mMSightEditUI.getClass();
        if (com.tencent.mm.ui.bl.f(mMSightEditUI)) {
            mMSightEditUI.setSelfNavigationBarColor(-637534208);
            mMSightEditUI.setSelfNavigationBarVisible(0);
        }
        mMSightEditUI.f148858d = (android.view.ViewGroup) mMSightEditUI.findViewById(com.tencent.mm.R.id.m7g);
        mMSightEditUI.f148859e = (com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView) mMSightEditUI.findViewById(com.tencent.mm.R.id.ozt);
        mMSightEditUI.f148860f = (com.tencent.mm.plugin.mmsight.ui.VideoSeekBarEditorView) mMSightEditUI.findViewById(com.tencent.mm.R.id.p09);
        mMSightEditUI.f148860f.setTextColor(mMSightEditUI.getIntent().getStringExtra("key_text_color"));
        mMSightEditUI.f148861g = mMSightEditUI.getIntent().getStringExtra("key_video_path");
        mMSightEditUI.f148863i = (com.tencent.mm.modelcontrol.VideoTransPara) mMSightEditUI.getIntent().getParcelableExtra("key_video_para");
        mMSightEditUI.f148867p = mMSightEditUI.getIntent().getBooleanExtra("key_need_clip_video_first", false);
        mMSightEditUI.f148868q = mMSightEditUI.getIntent().getBooleanExtra("key_need_remux_video", true);
        int intExtra = mMSightEditUI.getIntent().getIntExtra("key_max_duration_seconds", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightEditUI", "maxDurationSeconds: %s", java.lang.Integer.valueOf(intExtra));
        if (!mMSightEditUI.f148868q) {
            mMSightEditUI.f148867p = true;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(mMSightEditUI.f148861g)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSightEditUI", "error!, videoPath is null!!");
            return;
        }
        if (mMSightEditUI.f148863i == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSightEditUI", "videoTransPara is null!, use SnsAlbumVideoTransPara");
            mMSightEditUI.f148863i = com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.getInstance().getSnsAlbumVideoTransPara();
        }
        if (mMSightEditUI.f148863i == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSightEditUI", "videoTransPara still null!!!");
            mMSightEditUI.f148863i = new com.tencent.mm.modelcontrol.VideoTransPara();
        }
        if (intExtra > 0) {
            mMSightEditUI.f148863i.f71195h = intExtra;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightEditUI", "videoTransPara: %s", mMSightEditUI.f148863i);
        mMSightEditUI.f148859e.setAlpha(0.0f);
        mMSightEditUI.f148859e.setVideoPath(mMSightEditUI.f148861g);
        mMSightEditUI.f148859e.setLoop(true);
        mMSightEditUI.f148859e.setForceScaleFullScreen(true);
        mMSightEditUI.f148859e.setVideoCallback(mMSightEditUI.f148870s);
        mMSightEditUI.f148865n = com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.getInstance().getAccVideoPath() + "vsg_output_" + java.lang.System.currentTimeMillis() + ".mp4";
        mMSightEditUI.f148866o = com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.getInstance().getAccVideoPath() + "vsg_thumb_" + java.lang.System.currentTimeMillis() + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG;
        if (com.tencent.mm.ui.bl.f(mMSightEditUI)) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) mMSightEditUI.f148860f.getLayoutParams();
            marginLayoutParams.bottomMargin += com.tencent.mm.ui.bl.c(mMSightEditUI);
            mMSightEditUI.f148860f.setLayoutParams(marginLayoutParams);
        }
    }
}
