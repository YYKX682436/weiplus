package tn0;

/* loaded from: classes3.dex */
public final class h1 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tn0.j1 f420679d;

    public h1(tn0.j1 j1Var) {
        this.f420679d = j1Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        tn0.j1 j1Var = this.f420679d;
        if (!j1Var.f420698a.D.f309589i) {
            return false;
        }
        pm0.v.X(new tn0.g1(j1Var));
        return true;
    }
}
