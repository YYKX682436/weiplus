package xy5;

/* loaded from: classes13.dex */
public abstract class c {
    public static java.lang.Object a(java.lang.Object obj, java.lang.String str) {
        java.lang.Class<?> cls = obj.getClass();
        while (cls != null && cls != java.lang.Object.class) {
            try {
                java.lang.reflect.Field declaredField = cls.getDeclaredField(str);
                declaredField.setAccessible(true);
                return declaredField.get(obj);
            } catch (java.lang.NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            } catch (java.lang.Exception e17) {
                xy5.b.a("enricwu", "[getFieldInternal] throw Exception : " + e17.getMessage());
            }
        }
        return null;
    }

    public static java.lang.Object b(java.lang.Object obj, java.lang.String str, java.lang.Class[] clsArr, java.lang.Object... objArr) {
        if (obj == null) {
            throw new java.lang.IllegalArgumentException("Target object cannot be null for instance method invocation.");
        }
        java.lang.Class<?> cls = obj.getClass();
        java.lang.Class<?> cls2 = cls;
        while (cls2 != null && cls2 != java.lang.Object.class) {
            try {
                java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                declaredMethod.setAccessible(true);
                return declaredMethod.invoke(obj, objArr);
            } catch (java.lang.NoSuchMethodException unused) {
                cls2 = cls2.getSuperclass();
            } catch (java.lang.Exception e17) {
                xy5.b.a("enricwu", "[invokeInternal] throw Exception : " + e17.getMessage());
            }
        }
        return null;
    }

    public static java.lang.Object c(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            throw new java.lang.IllegalArgumentException("input object or class cannot be null.");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Class<?> cls = obj instanceof java.lang.Class ? (java.lang.Class) obj : obj.getClass(); cls != null && cls != java.lang.Object.class; cls = cls.getSuperclass()) {
            java.util.Collections.addAll(arrayList, cls.getDeclaredFields());
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.reflect.Field field = (java.lang.reflect.Field) it.next();
            if (android.text.TextUtils.equals(field.getType().getSimpleName(), str)) {
                field.setAccessible(true);
                return field.get(obj);
            }
        }
        return null;
    }
}
