package kotlinx.coroutines.internal;

/* loaded from: classes14.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final kotlinx.coroutines.internal.p0 f310515d = new kotlinx.coroutines.internal.p0();

    public p0() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        kotlinx.coroutines.u3 u3Var = (kotlinx.coroutines.u3) obj;
        oz5.i iVar = (oz5.i) obj2;
        if (u3Var != null) {
            return u3Var;
        }
        if (iVar instanceof kotlinx.coroutines.u3) {
            return (kotlinx.coroutines.u3) iVar;
        }
        return null;
    }
}
