package uf;

/* loaded from: classes7.dex */
public final class x implements z91.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uf.o0 f427120a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f427121b;

    public x(uf.o0 o0Var, int i17) {
        this.f427120a = o0Var;
        this.f427121b = i17;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        com.tencent.mars.xlog.Log.e("MicroMsg.MediaCastController", "play fail");
        uf.n nVar = uf.n.f427052m;
        uf.o0 o0Var = this.f427120a;
        uf.o0.a(o0Var, new uf.m(nVar, o0Var.f427068k));
    }

    @Override // z91.a
    public void b(aa1.e response) {
        kotlin.jvm.internal.o.g(response, "response");
        uf.o0 o0Var = this.f427120a;
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCastController", "play success, url = [%s]", ((uf.o1) o0Var.f427058a).f427076h);
        int i17 = this.f427121b;
        if (i17 <= 0) {
            return;
        }
        o0Var.f427069l = new uf.b0(o0Var, i17);
    }
}
