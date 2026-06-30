package ye5;

/* loaded from: classes9.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final ye5.j0 f461266d = new ye5.j0();

    public j0() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yb5.d chattingContext = (yb5.d) obj;
        rd5.d msgData = (rd5.d) obj2;
        kotlin.jvm.internal.o.g(chattingContext, "chattingContext");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        return java.lang.Boolean.valueOf(ye5.k0.b(ye5.l0.f461271a, msgData) != null);
    }
}
