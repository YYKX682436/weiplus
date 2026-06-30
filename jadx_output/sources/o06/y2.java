package o06;

/* loaded from: classes16.dex */
public abstract class y2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f342008a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f342009b;

    public y2(java.lang.String name, boolean z17) {
        kotlin.jvm.internal.o.g(name, "name");
        this.f342008a = name;
        this.f342009b = z17;
    }

    public java.lang.Integer a(o06.y2 visibility) {
        kotlin.jvm.internal.o.g(visibility, "visibility");
        java.util.Map map = o06.x2.f342005a;
        if (this == visibility) {
            return 0;
        }
        lz5.m mVar = (lz5.m) o06.x2.f342005a;
        java.lang.Integer num = (java.lang.Integer) mVar.get(this);
        java.lang.Integer num2 = (java.lang.Integer) mVar.get(visibility);
        if (num == null || num2 == null || kotlin.jvm.internal.o.b(num, num2)) {
            return null;
        }
        return java.lang.Integer.valueOf(num.intValue() - num2.intValue());
    }

    public java.lang.String b() {
        return this.f342008a;
    }

    public o06.y2 c() {
        return this;
    }

    public final java.lang.String toString() {
        return b();
    }
}
