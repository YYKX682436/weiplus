package gg1;

/* loaded from: classes7.dex */
public final class l0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg1.c1 f271600d;

    public l0(gg1.c1 c1Var) {
        this.f271600d = c1Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        gg1.c1 c1Var = this.f271600d;
        if (c1Var.f271544j) {
            return false;
        }
        ((fg1.g) c1Var.f271536b).e(false);
        return true;
    }
}
