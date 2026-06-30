package kc2;

/* loaded from: classes15.dex */
public final class r1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f306483d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kc2.v1 f306484e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f306485f;

    public r1(java.lang.String str, kc2.v1 v1Var, int i17) {
        this.f306483d = str;
        this.f306484e = v1Var;
        this.f306485f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f306483d;
        boolean z17 = str == null || str.length() == 0;
        int i17 = this.f306485f;
        kc2.v1 v1Var = this.f306484e;
        if (z17) {
            kc2.a2.a(v1Var.b(), i17, false, 2, null);
            return;
        }
        kc2.a2.a(v1Var.a(), i17, false, 2, null);
        v1Var.f306509k = i17;
        kc2.h1.f306405a.b(v1Var.f306507i, v1Var.f306508j, v1Var.f306510l, i17);
    }
}
