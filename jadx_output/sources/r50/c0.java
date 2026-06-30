package r50;

/* loaded from: classes5.dex */
public final class c0 implements fl5.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r50.j0 f392571a;

    public c0(r50.j0 j0Var) {
        this.f392571a = j0Var;
    }

    @Override // fl5.g
    public final boolean a(fl5.i iVar, int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return false;
        }
        j75.f Q6 = this.f392571a.Q6();
        if (Q6 != null) {
            Q6.B3(new wg5.d());
        }
        return true;
    }
}
