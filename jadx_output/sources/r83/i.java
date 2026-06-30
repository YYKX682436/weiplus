package r83;

/* loaded from: classes14.dex */
public class i extends k83.f {

    /* renamed from: i, reason: collision with root package name */
    public p83.o f393317i = null;

    /* renamed from: m, reason: collision with root package name */
    public int f393318m = 0;

    @Override // k83.b
    public int[] d() {
        return new int[]{819};
    }

    @Override // k83.b
    public int e() {
        return 2;
    }

    @Override // k83.b
    public void g() {
    }

    @Override // k83.b
    public void h() {
    }

    @Override // k83.b
    public void i(k83.g gVar) {
        k83.g gVar2 = this.f304891e;
        if (gVar2 != null) {
            this.f393318m = gVar2.f304911n;
            this.f393317i = new p83.o(gVar2.f304898a, gVar2.f304899b, gVar2.b(), this.f304891e.f304900c, false);
            c01.d9.e().g(this.f393317i);
        }
    }

    @Override // k83.f
    public int k() {
        return this.f393318m;
    }

    @Override // k83.f
    public boolean l() {
        return false;
    }

    @Override // k83.f
    public void m(com.tencent.mm.modelbase.m1 m1Var) {
    }

    @Override // k83.f
    public void n(com.tencent.mm.modelbase.m1 m1Var) {
    }

    @Override // k83.f
    public void o() {
        if (this.f393317i != null) {
            c01.d9.e().d(this.f393317i);
        }
    }
}
