package i06;

/* loaded from: classes16.dex */
public final class x2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i06.y2 f286790d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(i06.y2 y2Var) {
        super(0);
        this.f286790d = y2Var;
    }

    @Override // yz5.a
    public final java.lang.Object invoke() {
        i06.y2 y2Var = this.f286790d;
        java.lang.Object p17 = y2Var.p();
        try {
            java.lang.Object obj = i06.q3.f286730s;
            java.lang.Object a17 = y2Var.o() ? j06.s0.a(y2Var.f286734p, y2Var.l()) : null;
            if (!(a17 != obj)) {
                a17 = null;
            }
            y2Var.o();
            java.lang.reflect.AccessibleObject accessibleObject = p17 instanceof java.lang.reflect.AccessibleObject ? (java.lang.reflect.AccessibleObject) p17 : null;
            if (accessibleObject != null) {
                accessibleObject.setAccessible(h06.a.a(y2Var));
            }
            if (p17 == null) {
                return null;
            }
            if (p17 instanceof java.lang.reflect.Field) {
                return ((java.lang.reflect.Field) p17).get(a17);
            }
            if (!(p17 instanceof java.lang.reflect.Method)) {
                throw new java.lang.AssertionError("delegate field/method " + p17 + " neither field nor method");
            }
            int length = ((java.lang.reflect.Method) p17).getParameterTypes().length;
            if (length == 0) {
                return ((java.lang.reflect.Method) p17).invoke(null, new java.lang.Object[0]);
            }
            if (length == 1) {
                java.lang.reflect.Method method = (java.lang.reflect.Method) p17;
                java.lang.Object[] objArr = new java.lang.Object[1];
                if (a17 == null) {
                    java.lang.Class<?> cls = ((java.lang.reflect.Method) p17).getParameterTypes()[0];
                    kotlin.jvm.internal.o.f(cls, "get(...)");
                    a17 = i06.o4.e(cls);
                }
                objArr[0] = a17;
                return method.invoke(null, objArr);
            }
            if (length == 2) {
                java.lang.reflect.Method method2 = (java.lang.reflect.Method) p17;
                java.lang.Class<?> cls2 = ((java.lang.reflect.Method) p17).getParameterTypes()[1];
                kotlin.jvm.internal.o.f(cls2, "get(...)");
                return method2.invoke(null, a17, i06.o4.e(cls2));
            }
            throw new java.lang.AssertionError("delegate method " + p17 + " should take 0, 1, or 2 parameters");
        } catch (java.lang.IllegalAccessException e17) {
            throw new g06.b(e17);
        }
    }
}
