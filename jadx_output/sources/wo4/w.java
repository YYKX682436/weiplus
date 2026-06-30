package wo4;

/* loaded from: classes10.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo4.y f448292d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(wo4.y yVar) {
        super(0);
        this.f448292d = yVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        wo4.y yVar = this.f448292d;
        es0.d dVar = yVar.f448299f;
        wo4.v vVar = new wo4.v(yVar);
        try {
            yVar.f448297d = fp.h.c(23) ? new gs0.p(dVar, vVar) : new gs0.l(dVar, vVar);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VLogRemuxer", e17, "remux error", new java.lang.Object[0]);
            yVar.b();
            yz5.r rVar = yVar.f448312s;
            if (rVar != null) {
                rVar.C("", "", java.lang.Boolean.FALSE, 3);
            }
        }
        gs0.b bVar = yVar.f448297d;
        if (bVar != null) {
            android.view.Surface c17 = bVar.c();
            com.tencent.mm.plugin.vlog.model.l1 l1Var = yVar.f448295b;
            int i17 = l1Var.f175659d;
            int i18 = l1Var.f175660e;
            wo4.l lVar = new wo4.l(c17, i17, i18, i17, i18, l1Var.f175656a, dVar.f256315e, yVar.f448306m, yVar.f448307n, yVar.f448294a, new wo4.p(yVar, bVar), new wo4.q(bVar));
            yVar.f448298e = lVar;
            boolean z17 = yVar.f448313t;
            vo4.i iVar = lVar.f448275d;
            if (z17) {
                iVar.f438639j = new wo4.k(lVar, new wo4.s(yVar));
            }
            iVar.b(null);
            wo4.l lVar2 = yVar.f448298e;
            if (lVar2 != null) {
                boolean z18 = yVar.f448313t;
                com.tencent.mars.xlog.Log.i("MicroMsg.VLogDecoder", "startDecode, withSnapshot:" + z18);
                lVar2.f448280i = z18;
                vo4.i.a(lVar2.f448275d, (android.graphics.Bitmap) ((wo4.j) lVar2.f448281j).invoke(0L), z18, null, 4, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
