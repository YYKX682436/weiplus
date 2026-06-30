package lf4;

/* loaded from: classes4.dex */
public final class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf4.j1 f318477d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f318478e;

    public r0(lf4.j1 j1Var, int i17) {
        this.f318477d = j1Var;
        this.f318478e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lf4.j1 j1Var = this.f318477d;
        java.util.ArrayList arrayList = j1Var.f318423m;
        int i17 = this.f318478e;
        if (((lf4.i) arrayList.get(i17)).f318412a != 2) {
            j1Var.f318424n.add(j1Var.f318431u.get(i17));
        }
        int i18 = i17 + 1;
        if (i18 < j1Var.f318431u.size()) {
            j1Var.f318424n.add(j1Var.f318431u.get(i18));
            j1Var.n();
        }
    }
}
