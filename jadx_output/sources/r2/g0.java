package r2;

/* loaded from: classes14.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r2.h0 f368714d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(r2.h0 h0Var) {
        super(0);
        this.f368714d = h0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r2.h0 h0Var = this.f368714d;
        android.view.View typedView$ui_release = h0Var.getTypedView$ui_release();
        if (typedView$ui_release != null) {
            h0Var.getUpdateBlock().invoke(typedView$ui_release);
        }
        return jz5.f0.f302826a;
    }
}
