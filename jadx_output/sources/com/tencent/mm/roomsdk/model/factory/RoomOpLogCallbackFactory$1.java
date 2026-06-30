package com.tencent.mm.roomsdk.model.factory;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes11.dex */
public class RoomOpLogCallbackFactory$1 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.OplogServiceResultEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.roomsdk.model.factory.f f192244d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomOpLogCallbackFactory$1(com.tencent.mm.roomsdk.model.factory.f fVar, androidx.lifecycle.y yVar) {
        super(yVar);
        this.f192244d = fVar;
        this.__eventId = 1984241019;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.OplogServiceResultEvent oplogServiceResultEvent) {
        com.tencent.mm.autogen.events.OplogServiceResultEvent oplogServiceResultEvent2 = oplogServiceResultEvent;
        com.tencent.mm.roomsdk.model.factory.f fVar = this.f192244d;
        fVar.f192263h.dead();
        java.lang.Object[] objArr = new java.lang.Object[2];
        xg3.q0 q0Var = fVar.f192261f;
        objArr[0] = q0Var != null ? java.lang.Integer.valueOf(q0Var.b()) : "null";
        objArr[1] = java.lang.Integer.valueOf(oplogServiceResultEvent2.f54602g.f8204a);
        com.tencent.mars.xlog.Log.i("MicroMsg.RoomCallbackFactory", "oplogServiceEvent callback, cmdId: %s, ret: %s", objArr);
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.roomsdk.model.factory.d(this, oplogServiceResultEvent2));
        return false;
    }
}
