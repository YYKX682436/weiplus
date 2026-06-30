package xn5;

/* loaded from: classes13.dex */
public abstract class i implements xn5.f0 {

    /* renamed from: a, reason: collision with root package name */
    public java.util.HashMap f455679a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f455680b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f455681c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final xn5.h f455682d = new xn5.h(this);

    @Override // xn5.f0
    public xn5.d0 a() {
        return xn5.q1.f455713a;
    }

    @Override // xn5.f0
    public xn5.z b() {
        return xn5.e1.f455663a;
    }

    @Override // xn5.f0
    public xn5.g0 c() {
        return xn5.i1.f455683a;
    }

    @Override // xn5.f0
    public xn5.y d() {
        return this.f455682d;
    }

    @Override // xn5.f0
    public xn5.e0 e(int i17) {
        xn5.e0 f17 = f(i17);
        if (f17 != null) {
            return (xn5.e0) f17.getClass().newInstance();
        }
        return null;
    }

    @Override // xn5.f0
    public xn5.e0 f(int i17) {
        java.util.HashMap hashMap = this.f455679a;
        if (hashMap != null) {
            return (xn5.e0) hashMap.get(java.lang.Integer.valueOf(i17));
        }
        return null;
    }

    public final void g(int i17, xn5.e0 viewCreator) {
        kotlin.jvm.internal.o.g(viewCreator, "viewCreator");
        java.util.HashMap hashMap = this.f455679a;
        if (hashMap != null) {
        }
    }
}
