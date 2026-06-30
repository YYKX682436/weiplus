package ry2;

/* loaded from: classes8.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry2.q0 f401368d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(ry2.q0 q0Var) {
        super(0);
        this.f401368d = q0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f401368d.f401455w;
        if (view != null) {
            view.setEnabled(true);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("selectCoverView");
        throw null;
    }
}
