package kz5;

/* loaded from: classes14.dex */
public final class m1 extends kz5.c {

    /* renamed from: f, reason: collision with root package name */
    public int f313986f;

    /* renamed from: g, reason: collision with root package name */
    public int f313987g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kz5.n1 f313988h;

    public m1(kz5.n1 n1Var) {
        this.f313988h = n1Var;
        this.f313986f = n1Var.d();
        this.f313987g = n1Var.f313991g;
    }

    @Override // kz5.c
    public void b() {
        int i17 = this.f313986f;
        if (i17 == 0) {
            this.f313962d = 2;
            return;
        }
        kz5.n1 n1Var = this.f313988h;
        java.lang.Object[] objArr = n1Var.f313989e;
        int i18 = this.f313987g;
        this.f313963e = objArr[i18];
        this.f313962d = 1;
        this.f313987g = (i18 + 1) % n1Var.f313990f;
        this.f313986f = i17 - 1;
    }
}
