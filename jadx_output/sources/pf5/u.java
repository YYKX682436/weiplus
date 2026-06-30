package pf5;

/* loaded from: classes5.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final pf5.u f353936a = new pf5.u();

    public final pf5.b a(java.lang.Class t17) {
        kotlin.jvm.internal.o.g(t17, "t");
        pf5.z zVar = pf5.z.f353948a;
        java.lang.Object obj = pf5.z.f353950c.get(t17.getName());
        java.lang.Class cls = obj instanceof java.lang.Class ? (java.lang.Class) obj : null;
        if (cls != null) {
            cls.isInterface();
            java.lang.Object newInstance = cls.newInstance();
            kotlin.jvm.internal.o.f(newInstance, "newInstance(...)");
            return (pf5.b) newInstance;
        }
        throw new java.lang.RuntimeException(this + " never import any instance.");
    }

    public final pf5.v b(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (context instanceof androidx.appcompat.app.AppCompatActivity) {
            return zVar.a((androidx.appcompat.app.AppCompatActivity) context);
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }

    public final pf5.v c(androidx.appcompat.app.AppCompatActivity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        return pf5.z.f353948a.a(activity);
    }

    public final pf5.v d(androidx.fragment.app.Fragment fragment) {
        kotlin.jvm.internal.o.g(fragment, "fragment");
        return pf5.z.f353948a.b(fragment);
    }

    public final pf5.v e(java.lang.Class ownerClazz) {
        kotlin.jvm.internal.o.g(ownerClazz, "ownerClazz");
        i95.m owner = i95.m.class.isAssignableFrom(ownerClazz) ? i95.n0.c(ownerClazz) : null;
        if (!(owner instanceof androidx.lifecycle.m1)) {
            throw new java.lang.RuntimeException(owner + ": " + ownerClazz + " cannot create ViewModelProvider failed.");
        }
        pf5.z zVar = pf5.z.f353948a;
        kotlin.jvm.internal.o.g(owner, "owner");
        if (owner instanceof androidx.lifecycle.m1) {
            return new pf5.v((androidx.lifecycle.m1) owner, new pf5.y(owner));
        }
        throw new java.lang.RuntimeException(owner + ": " + ownerClazz + " cannot create ViewModelProvider failed.");
    }
}
