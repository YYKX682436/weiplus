package com.tencent.mm.plugin.flash;

/* loaded from: classes14.dex */
public class a extends android.os.CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.FaceFlashPreviewLayout f137061a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.mm.plugin.flash.FaceFlashPreviewLayout faceFlashPreviewLayout, long j17, long j18) {
        super(j17, j18);
        this.f137061a = faceFlashPreviewLayout;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "onFinish");
        com.tencent.mm.plugin.flash.FaceFlashPreviewLayout faceFlashPreviewLayout = this.f137061a;
        faceFlashPreviewLayout.H = true;
        if (faceFlashPreviewLayout.f137037y || faceFlashPreviewLayout.getVisibility() != 0) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "onFinish break face detect!");
        faceFlashPreviewLayout.g();
        com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.getInstance().fireEvent(com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtFrameworkFireEventType.YT_EVENT_TRIGGER_CANCEL_LIVENESS, null);
        vz2.c.b().B = 6;
        faceFlashPreviewLayout.f137029q.a7(((tz2.e) faceFlashPreviewLayout.f137032t).f(i65.a.r(faceFlashPreviewLayout.getContext(), com.tencent.mm.R.string.f491173c81), 90017).toString());
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j17) {
    }
}
