package kp;

/* loaded from: classes7.dex */
public final class h1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f310753d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f310754e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f310754e = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kp.h1(this.f310754e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((kp.h1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f310753d;
        if (i17 != 0 && i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        do {
            java.lang.String str = this.f310754e;
            try {
                java.util.Enumeration<java.net.InetAddress> inetAddresses = java.net.NetworkInterface.getByName(str).getInetAddresses();
                kotlin.jvm.internal.o.d(inetAddresses);
                while (inetAddresses.hasMoreElements()) {
                    java.net.InetAddress nextElement = inetAddresses.nextElement();
                    if (nextElement instanceof java.net.Inet4Address) {
                        com.tencent.mars.xlog.Log.i("WiFiDirectService", "p2p ip dispatched: " + ((java.net.Inet4Address) nextElement).getHostAddress() + " (Interface: " + str + ')');
                        return java.lang.Boolean.TRUE;
                    }
                }
            } catch (java.net.SocketException e17) {
                com.tencent.mars.xlog.Log.e("WiFiDirectService", "Fail to get p2p ip: " + e17);
            }
            this.f310753d = 1;
        } while (kotlinx.coroutines.k1.b(200L, this) != aVar);
        return aVar;
    }
}
