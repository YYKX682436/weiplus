package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes10.dex */
public class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.segment.VideoCompressUI f149061d;

    public n1(com.tencent.mm.plugin.mmsight.segment.VideoCompressUI videoCompressUI) {
        this.f149061d = videoCompressUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.modelcontrol.VideoTransPara snsAlbumVideoTransPara = com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.getInstance().getSnsAlbumVideoTransPara();
        com.tencent.mm.plugin.mmsight.segment.VideoCompressUI videoCompressUI = this.f149061d;
        videoCompressUI.f148964i = snsAlbumVideoTransPara;
        if (videoCompressUI.f148964i != null) {
            wo.v1.a(com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.getInstance().getDeviceInfoConfig());
            s75.d.b(videoCompressUI.f148968p, "video_remuxing_if_needed");
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.VideoCompressUI", "VideoSendPreprocessTask para is null");
            videoCompressUI.setResult(0);
            videoCompressUI.finish();
        }
    }
}
