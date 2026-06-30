package d04;

/* loaded from: classes8.dex */
public final class x2 implements d04.j3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d04.y2 f225553a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d04.j3 f225554b;

    public x2(d04.y2 y2Var, d04.j3 j3Var) {
        this.f225553a = y2Var;
        this.f225554b = j3Var;
    }

    @Override // d04.j3
    public void a(int i17, int i18) {
        d04.y2 y2Var = this.f225553a;
        java.lang.Integer num = (java.lang.Integer) y2Var.f225567f.get(java.lang.Integer.valueOf(i17));
        if (num != null) {
            y2Var.f225565d = num.intValue();
        }
        this.f225554b.a(i17, i18);
    }

    @Override // d04.j3
    public void b(int i17) {
        this.f225554b.b(i17);
    }
}
