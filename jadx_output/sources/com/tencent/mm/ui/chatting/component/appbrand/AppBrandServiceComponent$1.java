package com.tencent.mm.ui.chatting.component.appbrand;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class AppBrandServiceComponent$1 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.OnWxaOptionsChangedEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.appbrand.f f198663d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBrandServiceComponent$1(com.tencent.mm.ui.chatting.component.appbrand.f fVar, androidx.lifecycle.y yVar) {
        super(yVar);
        this.f198663d = fVar;
        this.__eventId = 495598387;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.OnWxaOptionsChangedEvent onWxaOptionsChangedEvent) {
        com.tencent.mm.autogen.events.OnWxaOptionsChangedEvent onWxaOptionsChangedEvent2 = onWxaOptionsChangedEvent;
        am.gn gnVar = onWxaOptionsChangedEvent2.f54587g;
        if (gnVar == null || gnVar.f6783a == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandServiceComponent", "OnWxaOptionsChangedEvent event is empty");
            return false;
        }
        com.tencent.mm.ui.chatting.component.appbrand.f fVar = this.f198663d;
        fVar.f198685d.x();
        am.gn gnVar2 = onWxaOptionsChangedEvent2.f54587g;
        if (gnVar2.f6783a.equals(fVar.f198685d.x())) {
            fVar.f198679q = (gnVar2.f6784b & 2) > 0;
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.chatting.component.appbrand.a(this));
        }
        return true;
    }
}
