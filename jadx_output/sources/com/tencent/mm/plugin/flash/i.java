package com.tencent.mm.plugin.flash;

/* loaded from: classes14.dex */
public class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.FaceFlashPreviewLayout f137221d;

    public i(com.tencent.mm.plugin.flash.FaceFlashPreviewLayout faceFlashPreviewLayout) {
        this.f137221d = faceFlashPreviewLayout;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/flash/FaceFlashPreviewLayout$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.flash.FaceFlashPreviewLayout faceFlashPreviewLayout = this.f137221d;
        faceFlashPreviewLayout.f137037y = true;
        faceFlashPreviewLayout.setOnClickListener(null);
        faceFlashPreviewLayout.f137026n.setVisibility(4);
        faceFlashPreviewLayout.f137025m.setVisibility(0);
        faceFlashPreviewLayout.f137032t.reset();
        tz2.i iVar = (tz2.i) faceFlashPreviewLayout.f137032t;
        com.tencent.mm.plugin.flash.h hVar = new com.tencent.mm.plugin.flash.h(this);
        iVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerNumber", com.tencent.mm.plugin.appbrand.jsapi.audio.d3.NAME);
        e72.e eVar = iVar.F;
        tz2.g gVar = new tz2.g(iVar, hVar);
        eVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceVoiceRecordLogic", "start record");
        s75.d.c(new e72.c(eVar, gVar, null), "FaceVoice_record", 10);
        faceFlashPreviewLayout.f137025m.b();
        vz2.c.b().f56195t = java.lang.System.currentTimeMillis();
        com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.getInstance().fireEvent(com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtFrameworkFireEventType.YT_EVENT_TRIGGER_BEGIN_LIVENESS, null);
        yj0.a.h(this, "com/tencent/mm/plugin/flash/FaceFlashPreviewLayout$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
