package xn5;

/* loaded from: classes13.dex */
public final class p1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xn5.c0 f455700d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y f455701e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(xn5.c0 c0Var, androidx.lifecycle.y yVar) {
        super(0);
        this.f455700d = c0Var;
        this.f455701e = yVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.Map map = xn5.q1.f455714b;
        xn5.c0 c0Var = this.f455700d;
        java.lang.String str = c0Var.f455654a;
        map.put(str, new xn5.k1(str, null, c0Var.f455656c, xn5.o1.f455698d, new java.lang.ref.WeakReference(this.f455701e), 2, null));
        return jz5.f0.f302826a;
    }
}
