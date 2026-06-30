package ud2;

/* loaded from: classes10.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ud2.c0 f426665d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(ud2.c0 c0Var) {
        super(2);
        this.f426665d = c0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        this.f426665d.c("playChangeSize", kz5.c1.l(new jz5.l("width", java.lang.Integer.valueOf(((java.lang.Number) obj).intValue())), new jz5.l("height", java.lang.Integer.valueOf(((java.lang.Number) obj2).intValue()))));
        return jz5.f0.f302826a;
    }
}
