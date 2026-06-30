package wu;

/* loaded from: classes9.dex */
public final class a2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final wu.a2 f449542d = new wu.a2();

    public a2() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        s15.h item = (s15.h) obj;
        kotlin.jvm.internal.o.g(item, "item");
        s15.x C = item.C();
        return java.lang.Integer.valueOf((C != null ? C.j() : null) == null ? 0 : 1);
    }
}
