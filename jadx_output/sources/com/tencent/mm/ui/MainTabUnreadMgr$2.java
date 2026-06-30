package com.tencent.mm.ui;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes11.dex */
public class MainTabUnreadMgr$2 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.JDSysMsgNotifyEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.he f196942d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainTabUnreadMgr$2(com.tencent.mm.ui.he heVar, androidx.lifecycle.y yVar) {
        super(yVar);
        this.f196942d = heVar;
        this.__eventId = 1450669203;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.JDSysMsgNotifyEvent jDSysMsgNotifyEvent) {
        nm.j.f338443g.a(new com.tencent.mm.ui.te(this));
        return true;
    }
}
