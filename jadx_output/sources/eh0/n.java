package eh0;

/* loaded from: classes5.dex */
public final class n implements java.util.function.BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh0.o f252894a;

    public n(eh0.o oVar) {
        this.f252894a = oVar;
    }

    @Override // java.util.function.BiConsumer
    public void accept(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String key = (java.lang.String) obj;
        eh0.i session = (eh0.i) obj2;
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(session, "session");
        java.lang.String str = session.f252882e;
        long j17 = session.f252878a;
        long c17 = c01.id.c();
        eh0.g.f252875a.b(key);
        if ((str == null || str.length() == 0) || j17 == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WeClawStream.Service", "restoreUnfinishedStreams: talker or msgSvrId is empty");
            return;
        }
        java.lang.String str2 = session.f252881d;
        boolean z17 = str2 == null || str2.length() == 0;
        long j18 = session.f252883f;
        if (!z17 && c17 - j18 <= 3600000) {
            this.f252894a.Di(str, j17, str2, session.f252886i);
            com.tencent.mars.xlog.Log.i("MicroMsg.WeClawStream.Service", "restoreUnfinishedStreams: restart stream for talker:%s, msgSvrId:%d, streamTicket:%s", str, java.lang.Long.valueOf(j17), str2);
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.WeClawStream.Service", "restoreUnfinishedStreams: stream expired: talker:" + str + ", msgSvrId:" + j17 + ", streamTicket:" + str2 + ", createTime:" + j18 + ", currentTime:" + c17);
    }
}
