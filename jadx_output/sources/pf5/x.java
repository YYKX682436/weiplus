package pf5;

/* loaded from: classes5.dex */
public final class x extends androidx.lifecycle.h1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f353946b;

    public x(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        this.f353946b = appCompatActivity;
    }

    @Override // androidx.lifecycle.h1, androidx.lifecycle.f1
    public androidx.lifecycle.c1 a(java.lang.Class modelClass) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(modelClass, "modelClass");
        androidx.lifecycle.c1 c1Var = null;
        if ((pf5.o.class.isAssignableFrom(modelClass) ? modelClass : null) != null) {
            androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f353946b;
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                obj = kotlin.Result.m521constructorimpl((androidx.lifecycle.c1) modelClass.getConstructor(androidx.appcompat.app.AppCompatActivity.class).newInstance(appCompatActivity));
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                obj = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(obj);
            if (m524exceptionOrNullimpl != null) {
                throw new java.lang.RuntimeException("Cannot create an instance of " + modelClass, m524exceptionOrNullimpl);
            }
            kotlin.ResultKt.throwOnFailure(obj);
            c1Var = (androidx.lifecycle.c1) obj;
        }
        if (c1Var != null) {
            return c1Var;
        }
        androidx.lifecycle.c1 a17 = super.a(modelClass);
        kotlin.jvm.internal.o.f(a17, "create(...)");
        return a17;
    }
}
