package ou4;

/* loaded from: classes6.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ou4.y f349039d = new ou4.y();

    public y() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ou4.w wVar = ou4.x.f349034d;
        ou4.x xVar = ou4.x.f349035e;
        if (xVar == null) {
            synchronized (wVar) {
                xVar = ou4.x.f349035e;
                if (xVar == null) {
                    xVar = new ou4.x(null);
                    ou4.x.f349035e = xVar;
                }
            }
        }
        return xVar;
    }
}
