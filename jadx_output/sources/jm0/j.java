package jm0;

/* loaded from: classes4.dex */
public final class j implements androidx.lifecycle.f1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jm0.k f300268a;

    public j(jm0.k kVar) {
        this.f300268a = kVar;
    }

    @Override // androidx.lifecycle.f1
    public androidx.lifecycle.c1 a(java.lang.Class modelClass) {
        kotlin.jvm.internal.o.g(modelClass, "modelClass");
        java.lang.Object newInstance = modelClass.getConstructor(n75.b.class).newInstance(this.f300268a);
        kotlin.jvm.internal.o.f(newInstance, "newInstance(...)");
        return (androidx.lifecycle.c1) newInstance;
    }
}
