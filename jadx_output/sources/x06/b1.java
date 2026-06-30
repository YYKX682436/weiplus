package x06;

/* loaded from: classes15.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f451206a;

    /* renamed from: b, reason: collision with root package name */
    public final n16.g f451207b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f451208c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f451209d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f451210e;

    public b1(java.lang.String classInternalName, n16.g name, java.lang.String parameters, java.lang.String returnType) {
        kotlin.jvm.internal.o.g(classInternalName, "classInternalName");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(parameters, "parameters");
        kotlin.jvm.internal.o.g(returnType, "returnType");
        this.f451206a = classInternalName;
        this.f451207b = name;
        this.f451208c = parameters;
        this.f451209d = returnType;
        java.lang.String jvmDescriptor = name + '(' + parameters + ')' + returnType;
        kotlin.jvm.internal.o.g(jvmDescriptor, "jvmDescriptor");
        this.f451210e = classInternalName + '.' + jvmDescriptor;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x06.b1)) {
            return false;
        }
        x06.b1 b1Var = (x06.b1) obj;
        return kotlin.jvm.internal.o.b(this.f451206a, b1Var.f451206a) && kotlin.jvm.internal.o.b(this.f451207b, b1Var.f451207b) && kotlin.jvm.internal.o.b(this.f451208c, b1Var.f451208c) && kotlin.jvm.internal.o.b(this.f451209d, b1Var.f451209d);
    }

    public int hashCode() {
        return (((((this.f451206a.hashCode() * 31) + this.f451207b.hashCode()) * 31) + this.f451208c.hashCode()) * 31) + this.f451209d.hashCode();
    }

    public java.lang.String toString() {
        return "NameAndSignature(classInternalName=" + this.f451206a + ", name=" + this.f451207b + ", parameters=" + this.f451208c + ", returnType=" + this.f451209d + ')';
    }
}
