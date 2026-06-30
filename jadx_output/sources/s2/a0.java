package s2;

/* loaded from: classes14.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s2.b0 f402195d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(s2.b0 b0Var) {
        super(0);
        this.f402195d = b0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        s1.z parentLayoutCoordinates;
        s2.b0 b0Var = this.f402195d;
        parentLayoutCoordinates = b0Var.getParentLayoutCoordinates();
        return java.lang.Boolean.valueOf((parentLayoutCoordinates == null || b0Var.m534getPopupContentSizebOM6tXw() == null) ? false : true);
    }
}
