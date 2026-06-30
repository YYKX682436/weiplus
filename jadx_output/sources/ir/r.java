package ir;

/* loaded from: classes12.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f293895a;

    public r(int i17) {
        this.f293895a = i17;
    }

    public boolean a(java.lang.String groupId) {
        kotlin.jvm.internal.o.g(groupId, "groupId");
        return kotlin.jvm.internal.o.b(c(), groupId);
    }

    public boolean b(java.lang.Object obj) {
        if (equals(obj) && (obj instanceof ir.r)) {
            ir.r rVar = (ir.r) obj;
            if (kotlin.jvm.internal.o.b(rVar.d(), d()) && kotlin.jvm.internal.o.b(rVar.e(), e())) {
                return true;
            }
        }
        return false;
    }

    public abstract java.lang.String c();

    public abstract java.lang.String d();

    public abstract java.lang.String e();

    public boolean equals(java.lang.Object obj) {
        if (obj != null && (obj instanceof ir.r) && kotlin.jvm.internal.o.b(obj.getClass(), getClass())) {
            ir.r rVar = (ir.r) obj;
            if (rVar.f293895a == this.f293895a && kotlin.jvm.internal.o.b(rVar.c(), c())) {
                return true;
            }
        }
        return false;
    }
}
