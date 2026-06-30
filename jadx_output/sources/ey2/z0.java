package ey2;

/* loaded from: classes2.dex */
public final class z0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f257588d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ey2.b1 f257589e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f257590f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.oq2 f257591g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(int i17, ey2.b1 b1Var, int i18, r45.oq2 oq2Var) {
        super(0);
        this.f257588d = i17;
        this.f257589e = b1Var;
        this.f257590f = i18;
        this.f257591g = oq2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        db2.n3 n3Var = new db2.n3(this.f257588d, 23, null, null, null, false, false, false, 0, false, null, null, null, 8176, null);
        ey2.b1 b1Var = this.f257589e;
        int i17 = this.f257590f;
        int i18 = this.f257588d;
        n3Var.f228092t = new ey2.x0(b1Var, i17, i18);
        n3Var.f228091s = new ey2.y0(i18, b1Var, this.f257591g);
        return n3Var;
    }
}
