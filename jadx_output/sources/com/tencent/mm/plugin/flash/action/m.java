package com.tencent.mm.plugin.flash.action;

/* loaded from: classes14.dex */
public class m extends android.os.CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout f137160a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout faceFlashActionPreviewLayout, long j17, long j18) {
        super(j17, j18);
        this.f137160a = faceFlashActionPreviewLayout;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout faceFlashActionPreviewLayout = this.f137160a;
        faceFlashActionPreviewLayout.L = true;
        if (faceFlashActionPreviewLayout.B || faceFlashActionPreviewLayout.getVisibility() != 0) {
            return;
        }
        faceFlashActionPreviewLayout.f137077r.g();
        tz2.l lVar = tz2.l.f423303e;
        faceFlashActionPreviewLayout.f137075p0 = lVar;
        faceFlashActionPreviewLayout.i(lVar);
        com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.getInstance().fireEvent(com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtFrameworkFireEventType.YT_EVENT_TRIGGER_CANCEL_LIVENESS, null);
        vz2.c.c().f56217s = 6;
        faceFlashActionPreviewLayout.f137078s.a7(((tz2.e) faceFlashActionPreviewLayout.f137081v).f(i65.a.r(faceFlashActionPreviewLayout.getContext(), com.tencent.mm.R.string.f491173c81), 90017).toString());
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j17) {
    }
}
