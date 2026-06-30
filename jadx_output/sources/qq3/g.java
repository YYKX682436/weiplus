package qq3;

/* loaded from: classes12.dex */
public final class g implements com.tencent.mm.modelcdntran.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qq3.h f365953a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sq3.a f365954b;

    public g(qq3.h hVar, sq3.a aVar) {
        this.f365953a = hVar;
        this.f365954b = aVar;
    }

    @Override // com.tencent.mm.modelcdntran.q0
    public void a(com.tencent.mm.modelcdntran.n1 event) {
        kotlin.jvm.internal.o.g(event, "event");
        int ordinal = event.f71103a.ordinal();
        qq3.h hVar = this.f365953a;
        if (ordinal != 0) {
            if (ordinal == 1) {
                qq3.i.e(hVar, 1, 0, 2, null);
                a00.i iVar = (a00.i) i95.n0.c(a00.i.class);
                jz5.g gVar = hVar.f365956i;
                ((t02.e) iVar).bj((java.lang.String) ((jz5.n) gVar).getValue(), 3, null, null);
                if (hVar.f365958n > 0 && !com.tencent.mm.sdk.platformtools.t8.K0(hVar.f365957m)) {
                    ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).fj((java.lang.String) ((jz5.n) gVar).getValue(), 3, hVar.f365957m, hVar.f365958n, null);
                }
                bx1.s sVar = (bx1.s) i95.n0.c(bx1.s.class);
                long j17 = hVar.f365961f;
                sq3.a aVar = this.f365954b;
                java.lang.String w07 = aVar.w0();
                kotlin.jvm.internal.o.f(w07, "getFromUser(...)");
                ((kq3.e) sVar).Bi(1L, j17, w07, aVar.u0(), aVar.G0(), aVar.v0(), aVar.getCreateTime());
                return;
            }
            if (ordinal == 2) {
                dn.g gVar2 = event.f71107e;
                if (gVar2 != null) {
                    hVar.f365962g = gVar2.field_finishedLength;
                }
                hVar.f();
                return;
            }
            if (ordinal != 6 && ordinal != 7 && ordinal != 10 && ordinal != 11) {
                return;
            }
        }
        hVar.d(2, event.f71105c);
    }
}
