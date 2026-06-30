package com.tencent.mm.plugin.notification.base;

/* loaded from: classes15.dex */
public class f implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.notification.base.j f152437d;

    public f(com.tencent.mm.plugin.notification.base.j jVar) {
        this.f152437d = jVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.notification.base.j jVar = this.f152437d;
        if (!jVar.f152445c) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AbstractSendMsgFailNotification", "mCheckMsgExistTimer, before check msgList.size:%d, successList.size:%d, failedList.size:%d", java.lang.Integer.valueOf(jVar.f152443a.b()), java.lang.Integer.valueOf(jVar.f152447e.size()), java.lang.Integer.valueOf(jVar.f152448f.size()));
        jVar.s();
        com.tencent.mars.xlog.Log.i("MicroMsg.AbstractSendMsgFailNotification", "mCheckMsgExistTimer, after check msgList.size:%d, successList.size:%d, failedList.size:%d", java.lang.Integer.valueOf(jVar.f152443a.b()), java.lang.Integer.valueOf(jVar.f152447e.size()), java.lang.Integer.valueOf(jVar.f152448f.size()));
        if (jVar.f152443a.b() > 0) {
            jVar.z();
            return true;
        }
        jVar.u();
        return true;
    }
}
