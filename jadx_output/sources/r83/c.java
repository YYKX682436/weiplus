package r83;

/* loaded from: classes14.dex */
public class c extends k83.f {

    /* renamed from: i, reason: collision with root package name */
    public p83.h f393313i;

    @Override // k83.b
    public int[] d() {
        return new int[]{824};
    }

    @Override // k83.b
    public int e() {
        return 5;
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
            this.f393313i = new p83.h(gVar2.f304898a, gVar2.f304899b, gVar2.f304900c);
            c01.d9.e().g(this.f393313i);
        }
    }

    @Override // k83.f
    public int k() {
        return 50000;
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
        if (this.f393313i != null) {
            c01.d9.e().d(this.f393313i);
        }
    }
}
