package com.tencent.mm.plugin.voip.widget;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public class NewVideoTalkingSmallView$2 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LogoutEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.widget.e f177098d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewVideoTalkingSmallView$2(com.tencent.mm.plugin.voip.widget.e eVar, androidx.lifecycle.y yVar) {
        super(yVar);
        this.f177098d = eVar;
        this.__eventId = 276997888;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.LogoutEvent logoutEvent) {
        if (!(logoutEvent instanceof com.tencent.mm.autogen.events.LogoutEvent)) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.NewVideoTalkingSmallView", "summerkick LogoutEvent thread name[%s]", java.lang.Thread.currentThread().getName());
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.voip.widget.g(this));
        return false;
    }
}
