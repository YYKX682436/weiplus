package nv;

/* loaded from: classes11.dex */
public class x2 extends com.tencent.mm.sdk.event.n {
    public x2() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.MsgSynchronizeABTestEvent msgSynchronizeABTestEvent = (com.tencent.mm.autogen.events.MsgSynchronizeABTestEvent) iEvent;
        if (msgSynchronizeABTestEvent != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupCore", "receive MsgSynchronizeABTestEvent.");
            com.tencent.mm.storage.c z07 = com.tencent.mm.model.newabtest.z.Ai().z0("100224");
            if (z07.isValid()) {
                java.util.Map t07 = z07.t0();
                vi3.b.f437554a = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) t07.get("SyncOpen"), 0);
                vi3.b.f437555b = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) t07.get("WindowsVersion"), 1644429312);
                vi3.b.f437556c = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) t07.get("MacVersion"), 302122240);
                vi3.b.f437557d = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) t07.get("MsgSyncSessionCount"), 50);
                vi3.b.f437558e = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) t07.get("MsgSyncMsgCount"), 20);
                vi3.b.f437559f = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) t07.get("MsgSyncSessionListCount"), 100);
                vi3.b.f437560g = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) t07.get("MsgSyncTimeLimit"), 3);
                vi3.b.f437561h = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) t07.get("MsgSyncAfterSleepSwitch"), 1);
                vi3.b.f437562i = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) t07.get("MsgSyncGetMoreSwitch"), 1);
                vi3.b.f437563j = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) t07.get("MsgSyncGetMoreMaxMsgCount"), 1000);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgSynchronizeConstants", "initMsgSynchronizeAbtest, SYNC_CLOSE:%d, WINDOWS_VERSION:%d, MAC_VERSION:%d, SESSION_COUNT:%d, MSG_COUNT%d, MSG_LIST_COUNT:%d, TIME_LIMIT:%d, AFTER_SLEEP_SWITCH:%d, GET_MORE_SWITCH:%d, GET_MORE_MAX_MSG_COUNT:%d", java.lang.Integer.valueOf(vi3.b.f437554a), java.lang.Integer.valueOf(vi3.b.f437555b), java.lang.Integer.valueOf(vi3.b.f437556c), java.lang.Integer.valueOf(vi3.b.f437557d), java.lang.Integer.valueOf(vi3.b.f437558e), java.lang.Integer.valueOf(vi3.b.f437559f), java.lang.Integer.valueOf(vi3.b.f437560g), java.lang.Integer.valueOf(vi3.b.f437561h), java.lang.Integer.valueOf(vi3.b.f437562i), java.lang.Integer.valueOf(vi3.b.f437563j));
            int i17 = vi3.b.f437554a;
            am.yj yjVar = msgSynchronizeABTestEvent.f54501g;
            yjVar.f8465a = i17;
            yjVar.f8466b = vi3.b.f437555b;
            yjVar.f8467c = vi3.b.f437556c;
        }
        return false;
    }
}
