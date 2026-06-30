package com.tencent.mm.roomsdk.model.factory;

/* loaded from: classes11.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.OplogServiceResultEvent f192253d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.roomsdk.model.factory.RoomOpLogCallbackFactory$1 f192254e;

    public d(com.tencent.mm.roomsdk.model.factory.RoomOpLogCallbackFactory$1 roomOpLogCallbackFactory$1, com.tencent.mm.autogen.events.OplogServiceResultEvent oplogServiceResultEvent) {
        this.f192254e = roomOpLogCallbackFactory$1;
        this.f192253d = oplogServiceResultEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.roomsdk.model.factory.RoomOpLogCallbackFactory$1 roomOpLogCallbackFactory$1 = this.f192254e;
        com.tencent.mm.roomsdk.model.factory.f fVar = roomOpLogCallbackFactory$1.f192244d;
        if (fVar.f192262g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RoomCallbackFactory", "oplogServiceEvent callback already processed, skip");
            return;
        }
        fVar.f192262g = true;
        am.vn vnVar = this.f192253d.f54602g;
        java.lang.String str = vnVar.f8205b;
        java.lang.String str2 = vnVar.f8206c;
        int i17 = vnVar.f8204a;
        o65.b bVar = fVar.f192248d;
        if (bVar != null) {
            if (bVar instanceof o65.f) {
                o65.f fVar2 = (o65.f) bVar;
                fVar2.f343224b = str;
                fVar2.f343223a = i17;
                fVar2.f343225c = str2;
                bVar.a(0, i17, "", bVar);
            } else {
                bVar.a(0, i17, "", bVar);
            }
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = roomOpLogCallbackFactory$1.f192244d.f192249e;
        if (u3Var != null) {
            u3Var.dismiss();
        }
    }
}
