package w63;

/* loaded from: classes5.dex */
public class e extends com.tencent.mm.sdk.event.n {
    public e() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        y63.a L0;
        com.tencent.mm.autogen.events.NotifyGroupSolitatireEvent notifyGroupSolitatireEvent = (com.tencent.mm.autogen.events.NotifyGroupSolitatireEvent) iEvent;
        if (notifyGroupSolitatireEvent != null) {
            am.ol olVar = notifyGroupSolitatireEvent.f54543g;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(olVar.f7556b) && !com.tencent.mm.sdk.platformtools.t8.K0(olVar.f7557c)) {
                java.lang.Integer valueOf = java.lang.Integer.valueOf(olVar.f7555a);
                java.lang.String str = olVar.f7556b;
                java.lang.String str2 = olVar.f7557c;
                am.pl plVar = notifyGroupSolitatireEvent.f54544h;
                com.tencent.mars.xlog.Log.i("NotifyGroupSolitatireInsertEventIListener", "NotifyGroupSolitatireEvent %s %s %s %s %s", valueOf, str, str2, java.lang.Long.valueOf(plVar.f7630b), java.lang.Long.valueOf(plVar.f7629a));
                int i17 = olVar.f7555a;
                if (i17 == 0 && plVar.f7629a != 0) {
                    y63.a L02 = ((t63.e) i95.n0.c(t63.e.class)).Bi().L0(olVar.f7556b, olVar.f7557c, true);
                    if (L02 != null && L02.field_firstMsgId == 0) {
                        L02.field_firstMsgId = plVar.f7629a;
                        com.tencent.mars.xlog.Log.i("NotifyGroupSolitatireInsertEventIListener", "NotifyGroupSolitatireEvent username:%s key:%s msgId:%s ret:%s", olVar.f7556b, olVar.f7557c, java.lang.Long.valueOf(plVar.f7629a), java.lang.Boolean.valueOf(((t63.e) i95.n0.c(t63.e.class)).Bi().W0(L02, true)));
                    }
                } else if (i17 == 1 && plVar.f7630b != 0 && (L0 = ((t63.e) i95.n0.c(t63.e.class)).Bi().L0(olVar.f7556b, olVar.f7557c, true)) != null && L0.field_msgSvrId == 0) {
                    L0.field_msgSvrId = plVar.f7630b;
                    com.tencent.mars.xlog.Log.i("NotifyGroupSolitatireInsertEventIListener", "NotifyGroupSolitatireEvent username:%s key:%s msgSvrId:%s ret:%s", olVar.f7556b, olVar.f7557c, java.lang.Long.valueOf(plVar.f7630b), java.lang.Boolean.valueOf(((t63.e) i95.n0.c(t63.e.class)).Bi().W0(L0, true)));
                }
            }
        }
        return true;
    }
}
