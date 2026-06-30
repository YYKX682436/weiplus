package t36;

/* loaded from: classes13.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class f415458a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f415459b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Class[] f415460c;

    public j(java.lang.Class cls, java.lang.String str, java.lang.Class... clsArr) {
        this.f415458a = cls;
        this.f415459b = str;
        this.f415460c = clsArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0011, code lost:
    
        if ((r4.getModifiers() & 1) == 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.reflect.Method a(java.lang.Class r4) {
        /*
            r3 = this;
            r0 = 0
            java.lang.String r1 = r3.f415459b
            if (r1 == 0) goto L26
            java.lang.Class[] r2 = r3.f415460c
            java.lang.reflect.Method r4 = r4.getMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L13
            int r1 = r4.getModifiers()     // Catch: java.lang.NoSuchMethodException -> L14
            r1 = r1 & 1
            if (r1 != 0) goto L14
        L13:
            r4 = r0
        L14:
            if (r4 == 0) goto L25
            java.lang.Class r1 = r3.f415458a
            if (r1 == 0) goto L25
            java.lang.Class r2 = r4.getReturnType()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 != 0) goto L25
            goto L26
        L25:
            r0 = r4
        L26:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t36.j.a(java.lang.Class):java.lang.reflect.Method");
    }

    public java.lang.Object b(java.lang.Object obj, java.lang.Object... objArr) {
        java.lang.reflect.Method a17 = a(obj.getClass());
        if (a17 == null) {
            throw new java.lang.AssertionError("Method " + this.f415459b + " not supported for object " + obj);
        }
        try {
            return a17.invoke(obj, objArr);
        } catch (java.lang.IllegalAccessException e17) {
            java.lang.AssertionError assertionError = new java.lang.AssertionError("Unexpectedly could not call: " + a17);
            assertionError.initCause(e17);
            throw assertionError;
        }
    }

    public java.lang.Object c(java.lang.Object obj, java.lang.Object... objArr) {
        try {
            java.lang.reflect.Method a17 = a(obj.getClass());
            if (a17 != null) {
                try {
                } catch (java.lang.IllegalAccessException unused) {
                    return null;
                }
            }
            return a17.invoke(obj, objArr);
        } catch (java.lang.reflect.InvocationTargetException e17) {
            java.lang.Throwable targetException = e17.getTargetException();
            if (targetException instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) targetException);
            }
            java.lang.AssertionError assertionError = new java.lang.AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }
}
