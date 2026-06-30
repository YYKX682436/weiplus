package xt2;

/* loaded from: classes3.dex */
public final class i2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.e3 f456788d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(xt2.e3 e3Var) {
        super(0);
        this.f456788d = e3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yz5.a userActionClick = this.f456788d.getUserActionClick();
        if (userActionClick != null) {
            userActionClick.invoke();
        }
        return jz5.f0.f302826a;
    }
}
