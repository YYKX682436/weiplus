package wu1;

/* loaded from: classes13.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f449661d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f449662e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f449663f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wu1.c f449664g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ wu1.a f449665h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String str, int i17, wu1.c cVar, wu1.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f449662e = str;
        this.f449663f = i17;
        this.f449664g = cVar;
        this.f449665h = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wu1.b(this.f449662e, this.f449663f, this.f449664g, this.f449665h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((wu1.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f449661d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("ScreenRecord.Main", "thread try connect to server " + this.f449662e + ':' + this.f449663f);
            xu1.b bVar = this.f449664g.f449666a;
            java.lang.String str = this.f449662e;
            int i18 = this.f449663f;
            this.f449661d = 1;
            bVar.getClass();
            java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310568a, new xu1.a(bVar, str, i18, null), this);
            if (g17 != aVar) {
                g17 = f0Var;
            }
            if (g17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Socket:");
        sb6.append(this.f449664g.f449666a.f457189b);
        sb6.append("status:");
        java.net.Socket socket = this.f449664g.f449666a.f457189b;
        kotlin.jvm.internal.o.d(socket);
        sb6.append(socket.isConnected());
        com.tencent.mars.xlog.Log.i("ScreenRecord.Main", sb6.toString());
        java.net.Socket socket2 = this.f449664g.f449666a.f457189b;
        if (socket2 != null) {
            kotlin.jvm.internal.o.d(socket2);
            if (socket2.isConnected()) {
                wu1.c cVar = this.f449664g;
                java.net.Socket socket3 = cVar.f449666a.f457189b;
                kotlin.jvm.internal.o.d(socket3);
                yu1.c cVar2 = (yu1.c) cVar.f449667b;
                cVar2.getClass();
                java.io.InputStream inputStream = socket3.getInputStream();
                kotlin.jvm.internal.o.f(inputStream, "getInputStream(...)");
                java.io.Reader inputStreamReader = new java.io.InputStreamReader(inputStream, r26.c.f368865a);
                cVar2.f465846c = inputStreamReader instanceof java.io.BufferedReader ? (java.io.BufferedReader) inputStreamReader : new java.io.BufferedReader(inputStreamReader, 8192);
                cVar2.f465845b = true;
                kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, null, null, new yu1.a(cVar2, null), 3, null);
                zu1.a aVar2 = (zu1.a) cVar.f449668c;
                aVar2.getClass();
                aVar2.f475689b = socket3.getOutputStream();
                aVar2.f475690c = socket3;
                aVar2.f475688a = true;
                wu1.c cVar3 = this.f449664g;
                yu1.d dVar = cVar3.f449667b;
                java.util.List handlers = cVar3.f449671f;
                yu1.c cVar4 = (yu1.c) dVar;
                cVar4.getClass();
                kotlin.jvm.internal.o.g(handlers, "handlers");
                ((java.util.ArrayList) cVar4.f465844a).addAll(handlers);
            }
        }
        wu1.a aVar3 = this.f449665h;
        xu1.c errCode = this.f449664g.f449666a.f457188a;
        tu1.l lVar = (tu1.l) aVar3;
        lVar.getClass();
        kotlin.jvm.internal.o.g(errCode, "errCode");
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenCastManager", "realExecuteTcpConnect " + lVar.f422104a.f310116d + " result=" + errCode);
        tu1.o oVar = lVar.f422105b;
        if (!oVar.f422129t) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScreenCastManager", "realExecuteTcpConnect canceled baceuse tcpAllowConnectingFlag is false");
            wu1.c cVar5 = lVar.f422105b.f422126q;
            if (cVar5 != null) {
                cVar5.a();
            }
        } else if (errCode == xu1.c.f457192f) {
            oVar.f422127r = errCode;
            ((ku5.t0) ku5.t0.f312615d).B(new tu1.j(lVar.f422105b, errCode));
        } else if (lVar.f422104a.f310116d < lVar.f422106c.size() - 1) {
            kotlin.jvm.internal.f0 f0Var2 = lVar.f422104a;
            int i19 = f0Var2.f310116d + 1;
            f0Var2.f310116d = i19;
            tu1.o.c(lVar.f422105b, i19, (java.lang.String) lVar.f422106c.get(i19), lVar.f422107d, lVar);
        } else {
            lVar.f422105b.f422127r = xu1.c.f457195i;
            ((ku5.t0) ku5.t0.f312615d).B(new tu1.k(lVar.f422105b));
        }
        return f0Var;
    }
}
