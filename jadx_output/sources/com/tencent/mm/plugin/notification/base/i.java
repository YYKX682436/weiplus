package com.tencent.mm.plugin.notification.base;

/* loaded from: classes15.dex */
public class i implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.msg.MsgIdTalker f152441d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.notification.base.j f152442e;

    public i(com.tencent.mm.plugin.notification.base.j jVar, com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker) {
        this.f152442e = jVar;
        this.f152441d = msgIdTalker;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.notification.base.j jVar = this.f152442e;
        java.util.ArrayList arrayList = jVar.f152447e;
        com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker = this.f152441d;
        if (arrayList.contains(msgIdTalker)) {
            return true;
        }
        java.util.ArrayList arrayList2 = jVar.f152448f;
        if (arrayList2.contains(msgIdTalker) || !jVar.f152443a.f152453a.contains(msgIdTalker)) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AbstractSendMsgFailNotification", "msgIdTalker:%s send timeout, move this message to fail list, continue send next message", msgIdTalker.toString());
        arrayList2.add(msgIdTalker);
        jVar.f152449g.add(msgIdTalker);
        if (jVar.f152447e.size() + arrayList2.size() >= jVar.f152443a.b()) {
            jVar.u();
            return true;
        }
        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.notification.base.h(jVar, jVar.f152443a.a()), 200L);
        return true;
    }
}
