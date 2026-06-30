package pn4;

/* loaded from: classes4.dex */
public final class u1 implements androidx.lifecycle.f1 {
    @Override // androidx.lifecycle.f1
    public androidx.lifecycle.c1 a(java.lang.Class modelClass) {
        kotlin.jvm.internal.o.g(modelClass, "modelClass");
        java.lang.Object newInstance = modelClass.newInstance();
        kotlin.jvm.internal.o.f(newInstance, "newInstance(...)");
        return (androidx.lifecycle.c1) newInstance;
    }
}
