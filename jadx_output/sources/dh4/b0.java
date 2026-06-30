package dh4;

/* loaded from: classes15.dex */
public class b0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dh4.f0 f232504d;

    public b0(dh4.f0 f0Var) {
        this.f232504d = f0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        dh4.f0 f0Var = this.f232504d;
        int i17 = f0Var.f232517i;
        long j17 = f0Var.f232518m;
        java.lang.String str = f0Var.f232516h;
        c01.d9.e().g(new eh4.d(i17, j17, 1, str, f0Var.l(str)));
        return true;
    }
}
