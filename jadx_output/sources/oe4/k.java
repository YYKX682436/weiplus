package oe4;

/* loaded from: classes15.dex */
public class k implements eu5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ oe4.l f344812a;

    public k(oe4.l lVar) {
        this.f344812a = lVar;
    }

    @Override // eu5.b
    public void a(eu5.e eVar) {
        eu5.c cVar = (eu5.c) eVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterNetDelegateUtil", "generate and upload ask onResult errCode: %d, errMsg: %s", java.lang.Integer.valueOf(cVar.f475605a), cVar.f475606b);
        boolean a17 = cVar.a();
        oe4.l lVar = this.f344812a;
        if (a17) {
            oe4.a aVar = lVar.f344813a;
            if (aVar != null) {
                ((oe4.f) aVar).f344802a.H();
                return;
            }
            return;
        }
        re4.n.c(1, cVar.f475605a, 1L);
        oe4.a aVar2 = lVar.f344813a;
        if (aVar2 != null) {
            ((oe4.f) aVar2).f344802a.I(3, cVar.f475605a, cVar.f475606b);
        }
    }
}
