package k13;

/* loaded from: classes10.dex */
public final class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f303269d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f303270e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k13.l1 f303271f;

    public u0(int i17, int i18, k13.l1 l1Var) {
        this.f303269d = i17;
        this.f303270e = i18;
        this.f303271f = l1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f303269d;
        for (int i18 = i17; i18 < this.f303270e; i18++) {
            if (i17 >= 0) {
                k13.l1 l1Var = this.f303271f;
                if (i17 < l1Var.f303239q.size()) {
                    k13.l1.d(l1Var, ((i13.c) l1Var.f303239q.get(i17)).f287275d);
                }
            }
        }
    }
}
