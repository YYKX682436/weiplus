package com.tencent.mm.plugin.flash.action;

/* loaded from: classes14.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.action.x f137188d;

    public w(com.tencent.mm.plugin.flash.action.x xVar) {
        this.f137188d = xVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.flash.action.x xVar = this.f137188d;
        if (!xVar.f137190a.A) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionPreviewLayout", "prepareVerifying = false ,face not in rect.");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionPreviewLayout", "onAnimationEnd end......... start face verity.");
        vz2.c.j("sdkVerify");
        com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.getInstance().fireEvent(com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtFrameworkFireEventType.YT_EVENT_TRIGGER_BEGIN_LIVENESS, null);
        com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout faceFlashActionPreviewLayout = xVar.f137190a;
        faceFlashActionPreviewLayout.B = true;
        if (faceFlashActionPreviewLayout.f137083x != com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_LIPREAD_TYPE) {
            faceFlashActionPreviewLayout.f137082w.e();
            return;
        }
        android.view.View view = faceFlashActionPreviewLayout.f137074p;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/flash/action/FaceFlashActionPreviewLayout$7$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/flash/action/FaceFlashActionPreviewLayout$7$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        faceFlashActionPreviewLayout.f137073o.setVisibility(0);
        faceFlashActionPreviewLayout.f137073o.b();
        tz2.i iVar = (tz2.i) faceFlashActionPreviewLayout.f137081v;
        com.tencent.mm.plugin.flash.action.v vVar = new com.tencent.mm.plugin.flash.action.v(this);
        iVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerNumber", com.tencent.mm.plugin.appbrand.jsapi.audio.d3.NAME);
        e72.e eVar = iVar.F;
        tz2.g gVar = new tz2.g(iVar, vVar);
        eVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceVoiceRecordLogic", "start record");
        s75.d.c(new e72.c(eVar, gVar, null), "FaceVoice_record", 10);
    }
}
