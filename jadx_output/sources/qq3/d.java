package qq3;

/* loaded from: classes12.dex */
public final class d implements com.tencent.mm.modelcdntran.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qq3.e f365945a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sq3.a f365946b;

    public d(qq3.e eVar, sq3.a aVar) {
        this.f365945a = eVar;
        this.f365946b = aVar;
    }

    @Override // com.tencent.mm.modelcdntran.q0
    public void a(com.tencent.mm.modelcdntran.n1 event) {
        kotlin.jvm.internal.o.g(event, "event");
        int ordinal = event.f71103a.ordinal();
        qq3.e eVar = this.f365945a;
        if (ordinal != 0) {
            if (ordinal == 1) {
                qq3.i.e(eVar, 1, 0, 2, null);
                ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).bj((java.lang.String) ((jz5.n) eVar.f365950n).getValue(), 3, null, null);
                bx1.s sVar = (bx1.s) i95.n0.c(bx1.s.class);
                long j17 = eVar.f365961f;
                sq3.a aVar = this.f365946b;
                java.lang.String w07 = aVar.w0();
                kotlin.jvm.internal.o.f(w07, "getFromUser(...)");
                ((kq3.e) sVar).Bi(1L, j17, w07, aVar.u0(), aVar.G0(), aVar.v0(), aVar.getCreateTime());
                return;
            }
            if (ordinal == 2) {
                dn.g gVar = event.f71107e;
                if (gVar != null) {
                    eVar.f365962g = gVar.field_finishedLength;
                }
                eVar.f();
                return;
            }
            if (ordinal != 6 && ordinal != 7 && ordinal != 10 && ordinal != 11) {
                return;
            }
        }
        eVar.d(2, event.f71105c);
    }
}
