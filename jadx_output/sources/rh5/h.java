package rh5;

/* loaded from: classes3.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.media.base.image.BaseTranslationDataComponent f395825d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.ScanTranslationResultEvent f395826e;

    public h(com.tencent.mm.ui.media.base.image.BaseTranslationDataComponent baseTranslationDataComponent, com.tencent.mm.autogen.events.ScanTranslationResultEvent scanTranslationResultEvent) {
        this.f395825d = baseTranslationDataComponent;
        this.f395826e = scanTranslationResultEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.media.base.image.BaseTranslationDataComponent baseTranslationDataComponent = this.f395825d;
        int i17 = baseTranslationDataComponent.f209134e;
        com.tencent.mm.autogen.events.ScanTranslationResultEvent scanTranslationResultEvent = this.f395826e;
        am.ct ctVar = scanTranslationResultEvent.f54739g;
        if (i17 == ctVar.f6400a) {
            if (!ctVar.f6402c) {
                com.tencent.mars.xlog.Log.e("MediaGallery.DefaultTranslateDataComponent", "event data has no result");
                eg3.h hVar = baseTranslationDataComponent.f209133d;
                if (hVar != null) {
                    ((eg3.f) hVar).f252659a.S();
                    return;
                }
                return;
            }
            boolean j17 = com.tencent.mm.vfs.w6.j(ctVar.f6403d);
            am.ct ctVar2 = scanTranslationResultEvent.f54739g;
            if (!j17) {
                com.tencent.mars.xlog.Log.w("MediaGallery.DefaultTranslateDataComponent", "trans result path " + ctVar2.f6403d + " not exist!");
                eg3.h hVar2 = baseTranslationDataComponent.f209133d;
                if (hVar2 != null) {
                    ((eg3.f) hVar2).f252659a.S();
                    return;
                }
                return;
            }
            com.tencent.mars.xlog.Log.i("MediaGallery.DefaultTranslateDataComponent", "trans success! curScanSourcePath:" + baseTranslationDataComponent.f209135f + " resultPath " + ctVar2.f6403d + " , ");
            java.util.Map map = baseTranslationDataComponent.f209136g;
            java.lang.String str = baseTranslationDataComponent.f209135f;
            java.lang.String resultPath = ctVar2.f6403d;
            kotlin.jvm.internal.o.f(resultPath, "resultPath");
            ((java.util.HashMap) map).put(str, resultPath);
            eg3.h hVar3 = baseTranslationDataComponent.f209133d;
            if (hVar3 != null) {
                java.lang.String resultPath2 = ctVar2.f6403d;
                kotlin.jvm.internal.o.f(resultPath2, "resultPath");
                ((eg3.f) hVar3).a(resultPath2);
            }
        }
    }
}
