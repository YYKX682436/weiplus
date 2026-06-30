package xn5;

/* loaded from: classes13.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final xn5.b0 f455650d = new xn5.b0();

    public b0() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        xn5.c0 it = (xn5.c0) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object newInstance = java.lang.Class.forName(it.f455654a).getConstructor(android.content.Context.class, android.util.AttributeSet.class).newInstance(com.tencent.mm.sdk.platformtools.x2.f193071a, xn5.q0.f455705d);
        if (newInstance instanceof android.view.View) {
            return (android.view.View) newInstance;
        }
        return null;
    }
}
