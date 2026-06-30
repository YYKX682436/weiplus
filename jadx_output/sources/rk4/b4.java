package rk4;

/* loaded from: classes11.dex */
public final class b4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rk4.c4 f396561d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(rk4.c4 c4Var) {
        super(0);
        this.f396561d = c4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        b66.g gVar = (b66.g) ((jz5.n) this.f396561d.f396579a).getValue();
        if (gVar != null) {
            return ((b66.i) gVar).a();
        }
        return null;
    }
}
