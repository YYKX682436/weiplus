package uk1;

/* loaded from: classes7.dex */
public class e extends uk1.d {
    @Override // uk1.d, uk1.b
    public uk1.a b(xk1.a aVar) {
        return uk1.d.i(aVar) == 13 ? uk1.a.MATCHED : uk1.a.NOT_MATCHED;
    }

    @Override // uk1.d, uk1.b
    public uk1.b c() {
        return new uk1.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // uk1.d, uk1.b
    public xk1.b d(xk1.b bVar) {
        super.d(bVar);
        ((xk1.f) bVar).b("Sec-WebSocket-Version", "13");
        return bVar;
    }
}
