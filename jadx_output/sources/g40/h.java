package g40;

/* loaded from: classes12.dex */
public final class h implements com.tencent.mm.modelcdntran.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g40.l f268688a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h40.f f268689b;

    public h(g40.l lVar, h40.f fVar) {
        this.f268688a = lVar;
        this.f268689b = fVar;
    }

    @Override // com.tencent.mm.modelcdntran.q0
    public void a(com.tencent.mm.modelcdntran.n1 event) {
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mm.modelcdntran.m1 m1Var = event.f71103a;
        com.tencent.mars.xlog.Log.i("MicroMsg.FileRecordMsgDownloadHelper", "CdnJavaHelperListener %s", m1Var);
        if (m1Var == com.tencent.mm.modelcdntran.m1.f71085q) {
            g40.l lVar = this.f268688a;
            lVar.f268697e = false;
            i40.b bVar = this.f268689b.f278743d;
            if (bVar != null) {
                bVar.b();
            }
            java.lang.String str = lVar.f268699g;
            if (str != null) {
                d40.q qVar = (d40.q) i95.n0.c(d40.q.class);
                f40.k kVar = new f40.k(5, 0L, 0L);
                qVar.getClass();
                f40.m.f259438g.a().f259439f.compute(str, new f40.l(kVar));
            }
            lVar.c();
        }
    }
}
