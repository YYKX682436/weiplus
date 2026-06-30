package ms4;

/* loaded from: classes8.dex */
public final class i implements androidx.lifecycle.f1 {

    /* renamed from: a, reason: collision with root package name */
    public final js4.n f331041a;

    public i(js4.n param) {
        kotlin.jvm.internal.o.g(param, "param");
        this.f331041a = param;
    }

    @Override // androidx.lifecycle.f1
    public androidx.lifecycle.c1 a(java.lang.Class modelClass) {
        kotlin.jvm.internal.o.g(modelClass, "modelClass");
        return new ms4.h(this.f331041a);
    }
}
