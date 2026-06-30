package p16;

/* loaded from: classes16.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    public final p16.h0 f351353a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f351354b;

    /* renamed from: c, reason: collision with root package name */
    public final p16.h0 f351355c;

    /* renamed from: d, reason: collision with root package name */
    public final p16.t f351356d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.reflect.Method f351357e;

    public u(p16.h0 h0Var, java.lang.Object obj, p16.h0 h0Var2, p16.t tVar, java.lang.Class cls) {
        if (h0Var == null) {
            throw new java.lang.IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (tVar.f351347e == p16.g1.f351287i && h0Var2 == null) {
            throw new java.lang.IllegalArgumentException("Null messageDefaultInstance");
        }
        this.f351353a = h0Var;
        this.f351354b = obj;
        this.f351355c = h0Var2;
        this.f351356d = tVar;
        if (!p16.w.class.isAssignableFrom(cls)) {
            this.f351357e = null;
            return;
        }
        try {
            this.f351357e = cls.getMethod("valueOf", java.lang.Integer.TYPE);
        } catch (java.lang.NoSuchMethodException e17) {
            java.lang.String name = cls.getName();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(name.length() + 45 + "valueOf".length());
            sb6.append("Generated message class \"");
            sb6.append(name);
            sb6.append("\" missing method \"valueOf\".");
            throw new java.lang.RuntimeException(sb6.toString(), e17);
        }
    }

    public java.lang.Object a(java.lang.Object obj) {
        if (this.f351356d.f351347e.f351290d != p16.h1.ENUM) {
            return obj;
        }
        try {
            return this.f351357e.invoke(null, (java.lang.Integer) obj);
        } catch (java.lang.IllegalAccessException e17) {
            throw new java.lang.RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e17);
        } catch (java.lang.reflect.InvocationTargetException e18) {
            java.lang.Throwable cause = e18.getCause();
            if (cause instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) cause);
            }
            if (cause instanceof java.lang.Error) {
                throw ((java.lang.Error) cause);
            }
            throw new java.lang.RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public java.lang.Object b(java.lang.Object obj) {
        return this.f351356d.f351347e.f351290d == p16.h1.ENUM ? java.lang.Integer.valueOf(((p16.w) obj).getNumber()) : obj;
    }
}
