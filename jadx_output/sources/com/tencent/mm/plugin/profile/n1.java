package com.tencent.mm.plugin.profile;

/* loaded from: classes2.dex */
public final class n1 extends com.tencent.mm.sdk.event.n {
    public n1() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        java.lang.Long l17;
        int i17;
        java.lang.String str;
        com.tencent.mm.autogen.events.ProfileFinderClickEvent event = (com.tencent.mm.autogen.events.ProfileFinderClickEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.wo woVar = event.f54629g;
        woVar.getClass();
        long j17 = woVar.f8306a;
        java.lang.String str2 = woVar.f8307b;
        int i18 = woVar.f8308c;
        if (woVar.f8309d) {
            l17 = 0L;
            i17 = i18;
            str = str2;
            gr3.b.f274847a.b(0L, java.lang.Long.valueOf(j17), 701L, 0L, (r29 & 16) != 0 ? 0L : 0L, (r29 & 32) != 0 ? "" : str2, i18, (r29 & 128) != 0 ? 0 : 0, (r29 & 256) != 0 ? 0 : 0);
        } else {
            l17 = 0L;
            i17 = i18;
            str = str2;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ProfileFinderTabClickMsgEventListener", "callback msgId:%d, idx:%d, url:%s, scene:%d", l17, java.lang.Long.valueOf(j17), str, java.lang.Integer.valueOf(i17));
        return false;
    }
}
