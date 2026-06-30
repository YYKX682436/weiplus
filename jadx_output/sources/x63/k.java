package x63;

/* loaded from: classes5.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f452252d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x63.p f452253e;

    public k(x63.p pVar, com.tencent.mm.storage.f9 f9Var) {
        this.f452253e = pVar;
        this.f452252d = f9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        x63.p pVar = this.f452253e;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = pVar.f452266a;
        com.tencent.mm.storage.f9 f9Var = this.f452252d;
        android.util.Pair pair = (android.util.Pair) concurrentHashMap.remove(java.lang.Long.valueOf(f9Var.getMsgId()));
        java.lang.Boolean bool = (java.lang.Boolean) pVar.f452267b.remove(java.lang.Long.valueOf(f9Var.getMsgId()));
        x63.o oVar = (x63.o) pVar.f452269d.remove(java.lang.Long.valueOf(f9Var.getMsgId()));
        if (pair != null) {
            y63.a f17 = ((t63.e) i95.n0.c(t63.e.class)).wi().f((java.lang.String) pair.first, (java.lang.String) pair.second);
            com.tencent.mm.autogen.events.NotifyGroupSolitatireEvent notifyGroupSolitatireEvent = new com.tencent.mm.autogen.events.NotifyGroupSolitatireEvent();
            am.ol olVar = notifyGroupSolitatireEvent.f54543g;
            olVar.f7555a = 1;
            olVar.f7557c = f17.field_key;
            olVar.f7556b = f17.field_username;
            bool.booleanValue();
            olVar.getClass();
            long I0 = bool.booleanValue() ? pt0.f0.Li(f9Var.Q0(), f17.field_firstMsgId).I0() : f9Var.I0();
            notifyGroupSolitatireEvent.f54544h.f7630b = I0;
            notifyGroupSolitatireEvent.e();
            this.f452253e.c(f17, bool.booleanValue(), c01.z1.r(), I0);
            if (oVar != null) {
                y63.a aVar = oVar.f452263a;
                aVar.field_msgSvrId = I0;
                pVar.i(aVar, oVar.f452264b, oVar.f452265c);
            }
        }
    }
}
