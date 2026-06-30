package dv2;

/* loaded from: classes2.dex */
public final class d2 implements java.util.function.Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dv2.y1 f243832a;

    public d2(dv2.y1 y1Var) {
        this.f243832a = y1Var;
    }

    @Override // java.util.function.Predicate
    public boolean test(java.lang.Object obj) {
        dv2.y1 y1Var = (dv2.y1) obj;
        int i17 = y1Var.f243979c;
        dv2.y1 y1Var2 = this.f243832a;
        if (i17 == y1Var2.f243979c) {
            if (y1Var.f243980d == y1Var2.f243980d) {
                return true;
            }
        }
        return false;
    }
}
