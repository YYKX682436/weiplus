package ox3;

/* loaded from: classes10.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f349723d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ox3.f0 f349724e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(android.view.View view, ox3.f0 f0Var) {
        super(0);
        this.f349723d = view;
        this.f349724e = f0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f349723d;
        if (view != null) {
            this.f349724e.f349746m.add(view);
        }
        return jz5.f0.f302826a;
    }
}
