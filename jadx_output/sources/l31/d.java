package l31;

/* loaded from: classes9.dex */
public final class d implements f31.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l31.e f315331d;

    public d(l31.e eVar) {
        this.f315331d = eVar;
    }

    @Override // f31.e
    public void a(int i17, int i18, java.lang.String errMsg, com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        com.tencent.mars.xlog.Log.i("MicroMsg.GetAllSubscribeListTask", "getSubscribeMsgListByUsername end errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), errMsg);
        if (i17 == 0 && i18 == 0) {
            if ((subscribeMsgRequestResult != null ? subscribeMsgRequestResult.f71785h : null) != null) {
                l31.e eVar = this.f315331d;
                java.util.ArrayList arrayList = subscribeMsgRequestResult.f71785h;
                eVar.getClass();
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((com.tencent.mm.msgsubscription.SubscribeMsgTmpItem) it.next()).f71809o = currentTimeMillis;
                }
                l31.e eVar2 = this.f315331d;
                if (eVar2.f315339f != null) {
                    java.lang.String bizUsername = eVar2.f315313a;
                    java.util.ArrayList subscribeMsgList = subscribeMsgRequestResult.f71785h;
                    boolean z17 = subscribeMsgRequestResult.f71789o;
                    kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
                    kotlin.jvm.internal.o.g(subscribeMsgList, "subscribeMsgList");
                    ((ku5.t0) ku5.t0.f312615d).h(new k31.f(1, bizUsername, subscribeMsgList, z17), "SubscribeMsgSaveTag");
                }
            }
        }
        com.tencent.mm.sdk.platformtools.u3.h(new l31.c(i17, i18, this.f315331d, subscribeMsgRequestResult, errMsg));
    }
}
