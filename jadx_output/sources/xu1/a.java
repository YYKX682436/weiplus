package xu1;

/* loaded from: classes13.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xu1.b f457185d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f457186e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f457187f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(xu1.b bVar, java.lang.String str, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f457185d = bVar;
        this.f457186e = str;
        this.f457187f = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xu1.a(this.f457185d, this.f457186e, this.f457187f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        xu1.a aVar = (xu1.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        aVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.String str = this.f457186e;
        int i17 = this.f457187f;
        xu1.b bVar = this.f457185d;
        xu1.c cVar = bVar.f457188a;
        if (cVar == xu1.c.f457190d || cVar == xu1.c.f457194h || cVar == xu1.c.f457193g) {
            try {
                bVar.f457188a = xu1.c.f457191e;
                java.net.Socket socket = bVar.f457189b;
                kotlin.jvm.internal.o.d(socket);
                socket.connect(new java.net.InetSocketAddress(str, i17), 2000);
                bVar.f457188a = xu1.c.f457192f;
            } catch (java.net.SocketTimeoutException e17) {
                com.tencent.mars.xlog.Log.e("client_connection", "connection timeout", e17);
                bVar.f457188a = xu1.c.f457193g;
                bVar.f457189b = new java.net.Socket();
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("client_connection", "Fail connection", e18);
                bVar.f457188a = xu1.c.f457194h;
                bVar.f457189b = new java.net.Socket();
            }
        }
        return jz5.f0.f302826a;
    }
}
