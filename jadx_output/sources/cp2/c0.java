package cp2;

/* loaded from: classes2.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp2.v0 f220781d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(cp2.v0 v0Var) {
        super(0);
        this.f220781d = v0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.recyclerview.widget.f2 adapter = ((cp2.q1) this.f220781d.z()).o().getAdapter();
        cp2.z0 z0Var = adapter instanceof cp2.z0 ? (cp2.z0) adapter : null;
        return java.lang.Integer.valueOf(z0Var != null ? z0Var.f220958e : 0);
    }
}
