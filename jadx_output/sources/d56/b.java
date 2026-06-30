package d56;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class f226631a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f226632b;

    public b(java.lang.Class cls, java.lang.Object obj) {
        this.f226631a = cls;
        this.f226632b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.lang.reflect.AccessibleObject a(java.lang.reflect.AccessibleObject accessibleObject) {
        if (accessibleObject == 0) {
            return null;
        }
        if (accessibleObject instanceof java.lang.reflect.Member) {
            java.lang.reflect.Member member = (java.lang.reflect.Member) accessibleObject;
            if (java.lang.reflect.Modifier.isPublic(member.getModifiers()) && java.lang.reflect.Modifier.isPublic(member.getDeclaringClass().getModifiers())) {
                return accessibleObject;
            }
        }
        if (!accessibleObject.isAccessible()) {
            accessibleObject.setAccessible(true);
        }
        return accessibleObject;
    }

    public static d56.b h(java.lang.Object obj) {
        return new d56.b(obj == null ? java.lang.Object.class : obj.getClass(), obj);
    }

    public static d56.b i(java.lang.String str) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName(str);
            return new d56.b(cls, cls);
        } catch (java.lang.Exception e17) {
            throw new d56.c(e17);
        }
    }

    public static d56.b j(java.lang.reflect.Method method, java.lang.Object obj, java.lang.Object... objArr) {
        try {
            a(method);
            if (method.getReturnType() != java.lang.Void.TYPE) {
                return h(method.invoke(obj, objArr));
            }
            method.invoke(obj, objArr);
            return h(obj);
        } catch (java.lang.Exception e17) {
            throw new d56.c(e17);
        }
    }

    public static java.lang.Class[] m(java.lang.Object... objArr) {
        if (objArr == null) {
            return new java.lang.Class[0];
        }
        java.lang.Class[] clsArr = new java.lang.Class[objArr.length];
        for (int i17 = 0; i17 < objArr.length; i17++) {
            java.lang.Object obj = objArr[i17];
            clsArr[i17] = obj == null ? d56.a.class : obj.getClass();
        }
        return clsArr;
    }

    public static java.lang.Class n(java.lang.Class cls) {
        if (cls == null) {
            return null;
        }
        return cls.isPrimitive() ? java.lang.Boolean.TYPE == cls ? java.lang.Boolean.class : java.lang.Integer.TYPE == cls ? java.lang.Integer.class : java.lang.Long.TYPE == cls ? java.lang.Long.class : java.lang.Short.TYPE == cls ? java.lang.Short.class : java.lang.Byte.TYPE == cls ? java.lang.Byte.class : java.lang.Double.TYPE == cls ? java.lang.Double.class : java.lang.Float.TYPE == cls ? java.lang.Float.class : java.lang.Character.TYPE == cls ? java.lang.Character.class : java.lang.Void.TYPE == cls ? java.lang.Void.class : cls : cls;
    }

    public d56.b b(java.lang.String str, java.lang.Object... objArr) {
        java.lang.reflect.Method declaredMethod;
        java.lang.Object obj = this.f226632b;
        java.lang.Class<?>[] m17 = m(objArr);
        try {
            try {
                java.lang.Class cls = this.f226631a;
                try {
                    declaredMethod = cls.getMethod(str, m17);
                } catch (java.lang.NoSuchMethodException unused) {
                    do {
                        try {
                            declaredMethod = cls.getDeclaredMethod(str, m17);
                        } catch (java.lang.NoSuchMethodException unused2) {
                            cls = cls.getSuperclass();
                        }
                    } while (cls != null);
                    throw new java.lang.NoSuchMethodException();
                }
                return j(declaredMethod, obj, objArr);
            } catch (java.lang.NoSuchMethodException e17) {
                throw new d56.c(e17);
            }
        } catch (java.lang.NoSuchMethodException unused3) {
            return j(l(str, m17), obj, objArr);
        }
    }

    public d56.b c() {
        return d(new java.lang.Object[0]);
    }

    public d56.b d(java.lang.Object... objArr) {
        java.lang.Class cls = this.f226631a;
        java.lang.Class<?>[] m17 = m(objArr);
        try {
            java.lang.reflect.Constructor declaredConstructor = cls.getDeclaredConstructor(m17);
            try {
                return new d56.b(declaredConstructor.getDeclaringClass(), ((java.lang.reflect.Constructor) a(declaredConstructor)).newInstance(objArr));
            } catch (java.lang.Exception e17) {
                throw new d56.c(e17);
            }
        } catch (java.lang.NoSuchMethodException e18) {
            for (java.lang.reflect.Constructor<?> constructor : cls.getDeclaredConstructors()) {
                if (g(constructor.getParameterTypes(), m17)) {
                    try {
                        return new d56.b(constructor.getDeclaringClass(), ((java.lang.reflect.Constructor) a(constructor)).newInstance(objArr));
                    } catch (java.lang.Exception e19) {
                        throw new d56.c(e19);
                    }
                }
            }
            throw new d56.c(e18);
        }
    }

    public final java.lang.reflect.Field e(java.lang.String str) {
        java.lang.Class cls = this.f226631a;
        try {
            return (java.lang.reflect.Field) a(cls.getField(str));
        } catch (java.lang.NoSuchFieldException e17) {
            do {
                try {
                    return (java.lang.reflect.Field) a(cls.getDeclaredField(str));
                } catch (java.lang.NoSuchFieldException unused) {
                    cls = cls.getSuperclass();
                    if (cls == null) {
                        throw new d56.c(e17);
                    }
                }
            } while (cls == null);
            throw new d56.c(e17);
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof d56.b)) {
            return false;
        }
        return this.f226632b.equals(((d56.b) obj).f226632b);
    }

    public java.lang.Object f(java.lang.String str) {
        try {
            java.lang.reflect.Field e17 = e(str);
            e17.getType();
            return e17.get(this.f226632b);
        } catch (java.lang.Exception e18) {
            throw new d56.c(e18);
        }
    }

    public final boolean g(java.lang.Class[] clsArr, java.lang.Class[] clsArr2) {
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i17 = 0; i17 < clsArr2.length; i17++) {
            if (clsArr2[i17] != d56.a.class && !n(clsArr[i17]).isAssignableFrom(n(clsArr2[i17]))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.f226632b.hashCode();
    }

    public d56.b k(java.lang.String str, java.lang.Object obj) {
        try {
            java.lang.reflect.Field e17 = e(str);
            if ((e17.getModifiers() & 16) == 16) {
                java.lang.reflect.Field declaredField = java.lang.reflect.Field.class.getDeclaredField("modifiers");
                declaredField.setAccessible(true);
                declaredField.setInt(e17, e17.getModifiers() & (-17));
            }
            java.lang.Object obj2 = this.f226632b;
            if (obj instanceof d56.b) {
                obj = ((d56.b) obj).f226632b;
            }
            e17.set(obj2, obj);
            return this;
        } catch (java.lang.Exception e18) {
            throw new d56.c(e18);
        }
    }

    public final java.lang.reflect.Method l(java.lang.String str, java.lang.Class[] clsArr) {
        java.lang.Class cls = this.f226631a;
        java.lang.reflect.Method[] methods = cls.getMethods();
        int length = methods.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                java.lang.Class cls2 = cls;
                do {
                    for (java.lang.reflect.Method method : cls2.getDeclaredMethods()) {
                        if (method.getName().equals(str) && g(method.getParameterTypes(), clsArr)) {
                            return method;
                        }
                    }
                    cls2 = cls2.getSuperclass();
                } while (cls2 != null);
                throw new java.lang.NoSuchMethodException("No similar method " + str + " with params " + java.util.Arrays.toString(clsArr) + " could be found on type " + cls + ".");
            }
            java.lang.reflect.Method method2 = methods[i17];
            if (method2.getName().equals(str) && g(method2.getParameterTypes(), clsArr)) {
                return method2;
            }
            i17++;
        }
    }

    public java.lang.String toString() {
        return this.f226632b.toString();
    }
}
