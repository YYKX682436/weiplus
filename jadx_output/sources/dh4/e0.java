package dh4;

/* loaded from: classes15.dex */
public class e0 extends ah4.g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dh4.f0 f232511d;

    public e0(dh4.f0 f0Var) {
        this.f232511d = f0Var;
    }

    @Override // ah4.h
    public void A4(int i17, int i18, boolean z17) {
        dh4.f0 f0Var = this.f232511d;
        if (z17) {
            f0Var.f232521p = 0;
            f0Var.f232529x.a("");
            return;
        }
        if (i18 > f0Var.f232519n) {
            f0Var.f232519n = i18;
            if (f0Var.f232514f >= 3) {
                f0Var.f232529x.d(311);
            }
            f0Var.g();
        }
        if (f0Var.f232521p == i17) {
            return;
        }
        f0Var.f232521p = i17;
        java.lang.String j17 = f0Var.j();
        if (!f0Var.f232515g && j17 == null) {
            f0Var.f232515g = true;
            int i19 = f0Var.f232517i;
            long j18 = f0Var.f232518m;
            java.lang.String str = f0Var.f232516h;
            c01.d9.e().g(new eh4.c(i19, j18, str, f0Var.l(str)));
            dh4.l.Bi().f232597j++;
            dh4.l.Bi().f232598k++;
        }
        f0Var.f232529x.a(j17);
        com.tencent.mm.sdk.platformtools.v5.b(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.f493317jq1);
    }
}
