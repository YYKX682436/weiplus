package te2;

/* loaded from: classes14.dex */
public final class e2 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.l2 f417972d;

    public e2(te2.l2 l2Var) {
        this.f417972d = l2Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        te2.l2 l2Var = this.f417972d;
        com.tencent.mars.xlog.Log.i(l2Var.f418192e, "search device times:" + l2Var.f418195h);
        int i17 = l2Var.f418195h;
        boolean z17 = false;
        if (i17 >= l2Var.f418194g) {
            l2Var.f418195h = 0;
            te2.c2 c2Var = l2Var.f418196i;
            if (c2Var == null) {
                return false;
            }
            pm0.v.X(new te2.w2((te2.a3) c2Var));
            return false;
        }
        l2Var.f418195h = i17 + 1;
        java.lang.String a17 = nf.s.a();
        java.lang.String b17 = nf.s.b();
        int i18 = y91.i0.f460281h;
        y91.i0 i0Var = y91.h0.f460277a;
        if (com.tencent.mm.sdk.platformtools.a2.b(a17) && com.tencent.mm.sdk.platformtools.a2.b(b17)) {
            z17 = true;
        }
        i0Var.f(z17);
        return true;
    }
}
