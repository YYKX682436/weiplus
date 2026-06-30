package xk3;

/* loaded from: classes3.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f455062d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(android.widget.ImageView imageView) {
        super(2);
        this.f455062d = imageView;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        cp0.n viewWeakHolder = (cp0.n) obj;
        kotlin.jvm.internal.o.g(viewWeakHolder, "viewWeakHolder");
        pm0.v.X(new xk3.t((android.graphics.Bitmap) obj2, this.f455062d));
        return jz5.f0.f302826a;
    }
}
