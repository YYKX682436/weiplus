package jm0;

/* loaded from: classes5.dex */
public final class e implements androidx.lifecycle.f1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jm0.o f300265a;

    public e(jm0.o oVar) {
        this.f300265a = oVar;
    }

    @Override // androidx.lifecycle.f1
    public androidx.lifecycle.c1 a(java.lang.Class modelClass) {
        kotlin.jvm.internal.o.g(modelClass, "modelClass");
        java.lang.Object newInstance = modelClass.getConstructor(jm0.o.class).newInstance(this.f300265a);
        kotlin.jvm.internal.o.f(newInstance, "newInstance(...)");
        return (androidx.lifecycle.c1) newInstance;
    }
}
