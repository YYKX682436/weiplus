package iu1;

/* loaded from: classes9.dex */
public final class n implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI f294923a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f294924b;

    public n(com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI cardHomePageNewUI, java.lang.String str) {
        this.f294923a = cardHomePageNewUI;
        this.f294924b = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.CardHomePageNewUI", "errtype: %s, errcode: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        int i17 = fVar.f70615a;
        com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI cardHomePageNewUI = this.f294923a;
        if (i17 != 0 || fVar.f70616b != 0) {
            lu1.a0.q(cardHomePageNewUI, "");
            return jz5.f0.f302826a;
        }
        com.tencent.mm.protobuf.f fVar2 = fVar.f70618d;
        r45.kd0 kd0Var = (r45.kd0) fVar2;
        com.tencent.mars.xlog.Log.i("MicroMsg.CardHomePageNewUI", "retCode: %s", java.lang.Integer.valueOf(kd0Var.f378598d));
        if (kd0Var.f378598d != 0) {
            lu1.a0.r(cardHomePageNewUI, kd0Var.f378599e);
            return fVar2;
        }
        iu1.c cVar = cardHomePageNewUI.f95184m;
        if (cVar != null) {
            cVar.z(this.f294924b);
            return fVar2;
        }
        kotlin.jvm.internal.o.o("mHomePageAdapter");
        throw null;
    }
}
