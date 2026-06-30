package gk2;

/* loaded from: classes5.dex */
public final class a extends androidx.lifecycle.h1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pf5.f f272468b;

    public a(pf5.f fVar) {
        this.f272468b = fVar;
    }

    @Override // androidx.lifecycle.h1, androidx.lifecycle.f1
    public androidx.lifecycle.c1 a(java.lang.Class modelClass) {
        kotlin.jvm.internal.o.g(modelClass, "modelClass");
        if (!mm2.e.class.isAssignableFrom(modelClass)) {
            androidx.lifecycle.c1 a17 = super.a(modelClass);
            kotlin.jvm.internal.o.f(a17, "create(...)");
            return a17;
        }
        try {
            java.lang.reflect.Constructor constructor = modelClass.getConstructor(gk2.e.class);
            pf5.f fVar = this.f272468b;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.model.context.LiveBuContext");
            androidx.lifecycle.c1 c1Var = (androidx.lifecycle.c1) constructor.newInstance(fVar);
            kotlin.jvm.internal.o.d(c1Var);
            return c1Var;
        } catch (java.lang.IllegalAccessException e17) {
            throw new java.lang.RuntimeException("Cannot create an instance of " + modelClass, e17);
        } catch (java.lang.InstantiationException e18) {
            throw new java.lang.RuntimeException("Cannot create an instance of " + modelClass, e18);
        } catch (java.lang.NoSuchMethodException e19) {
            throw new java.lang.RuntimeException("Cannot create an instance of " + modelClass, e19);
        } catch (java.lang.reflect.InvocationTargetException e27) {
            throw new java.lang.RuntimeException("Cannot create an instance of " + modelClass, e27);
        }
    }
}
