package wh;

/* loaded from: classes12.dex */
public abstract class d0 {
    public d0(java.lang.String methodName, java.lang.String str) {
        kotlin.jvm.internal.o.g(methodName, "methodName");
    }

    public abstract java.lang.String a();

    public abstract java.lang.String b();

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || (!kotlin.jvm.internal.o.b(getClass(), obj.getClass()))) {
            return false;
        }
        wh.d0 d0Var = (wh.d0) obj;
        return java.util.Objects.equals(b(), d0Var.b()) && java.util.Objects.equals(a(), d0Var.a());
    }
}
