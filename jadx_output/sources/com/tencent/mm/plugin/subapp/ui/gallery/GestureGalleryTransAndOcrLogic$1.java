package com.tencent.mm.plugin.subapp.ui.gallery;

/* loaded from: classes3.dex */
class GestureGalleryTransAndOcrLogic$1 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ScanTranslationResultEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.gallery.j f172183d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestureGalleryTransAndOcrLogic$1(com.tencent.mm.plugin.subapp.ui.gallery.j jVar, androidx.lifecycle.y yVar) {
        super(yVar);
        this.f172183d = jVar;
        this.__eventId = -1699517927;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.ScanTranslationResultEvent scanTranslationResultEvent) {
        com.tencent.mm.autogen.events.ScanTranslationResultEvent scanTranslationResultEvent2 = scanTranslationResultEvent;
        com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryTransLogic", "scanTranslationResult %d, %s", java.lang.Integer.valueOf(scanTranslationResultEvent2.f54739g.f6400a), java.lang.Boolean.valueOf(scanTranslationResultEvent2.f54739g.f6402c));
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.subapp.ui.gallery.a(this, scanTranslationResultEvent2));
        return true;
    }
}
