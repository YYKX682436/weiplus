package sr2;

/* loaded from: classes8.dex */
public final class u1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.y2 f411730d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f411731e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(sr2.y2 y2Var, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f411730d = y2Var;
        this.f411731e = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = false;
        if (((java.lang.Boolean) ((jz5.n) this.f411730d.f411806m).getValue()).booleanValue()) {
            m92.b j37 = g92.a.j3(g92.b.f269769e, xy2.c.e(this.f411731e), false, 2, null);
            if (((j37 != null ? j37.u0().getInteger(41) : 0) & 1) != 0) {
                z17 = true;
            }
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
