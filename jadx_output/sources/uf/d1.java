package uf;

/* loaded from: classes7.dex */
public final class d1 implements com.tencent.mm.plugin.appbrand.jsapi.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf.o1 f427015d;

    public d1(uf.o1 o1Var) {
        this.f427015d = o1Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.x
    public final void b() {
        uf.o1 o1Var = this.f427015d;
        o1Var.f427082q = true;
        uf.o0 q17 = o1Var.q();
        com.tencent.mm.sdk.platformtools.b4 b4Var = q17.f427065h;
        if (b4Var.e()) {
            return;
        }
        b4Var.d();
        q17.f427064g = true;
    }
}
