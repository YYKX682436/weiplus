package pf5;

/* loaded from: classes5.dex */
public final class y extends androidx.lifecycle.h1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f353947b;

    public y(java.lang.Object obj) {
        this.f353947b = obj;
    }

    @Override // androidx.lifecycle.h1, androidx.lifecycle.f1
    public androidx.lifecycle.c1 a(java.lang.Class modelClass) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(modelClass, "modelClass");
        androidx.lifecycle.c1 c1Var = null;
        if ((pf5.o0.class.isAssignableFrom(modelClass) ? modelClass : null) != null) {
            java.lang.Object obj2 = this.f353947b;
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                java.lang.Object newInstance = modelClass.getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
                androidx.lifecycle.c1 c1Var2 = (androidx.lifecycle.c1) newInstance;
                kotlin.jvm.internal.o.e(c1Var2, "null cannot be cast to non-null type com.tencent.mm.ui.component.UIComponentPlugin<P of com.tencent.mm.ui.component.UICProviderImpl.of.<no name provided>.create$lambda$4$lambda$2$lambda$1>");
                kotlin.jvm.internal.o.g(obj2, "<set-?>");
                ((pf5.o0) c1Var2).f353927d = obj2;
                obj = kotlin.Result.m521constructorimpl((androidx.lifecycle.c1) newInstance);
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
