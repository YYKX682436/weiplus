package uf;

/* loaded from: classes7.dex */
public final class e1 implements com.tencent.mm.plugin.appbrand.jsapi.v {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf.o1 f427021d;

    public e1(uf.o1 o1Var) {
        this.f427021d = o1Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.v
    public final void c() {
        uf.o1 o1Var = this.f427021d;
        o1Var.f427082q = false;
        uf.o0 q17 = o1Var.q();
        com.tencent.mm.sdk.platformtools.b4 b4Var = q17.f427065h;
        if (b4Var.e()) {
            q17.f427064g = false;
            b4Var.c(5000L, 5000L);
        }
    }
}
