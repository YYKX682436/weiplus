package hk0;

/* loaded from: classes3.dex */
public final class a0 implements androidx.lifecycle.f1 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.y f281691a;

    public a0(androidx.lifecycle.y owner) {
        kotlin.jvm.internal.o.g(owner, "owner");
        this.f281691a = owner;
    }

    @Override // androidx.lifecycle.f1
    public androidx.lifecycle.c1 a(java.lang.Class modelClass) {
        kotlin.jvm.internal.o.g(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(hk0.u0.class)) {
            return new hk0.u0(this.f281691a);
        }
        throw new java.lang.IllegalArgumentException("Unknown ViewModel class");
    }
}
