package com.tencent.thumbplayer.tmediacodec.util;

/* loaded from: classes13.dex */
public class ReflectUtils {
    public static final java.lang.Class<?>[] EMPTY_PARAM_TYPES = new java.lang.Class[0];
    public static final java.lang.Object[] EMPTY_PARAMS = new java.lang.Object[0];

    public static java.lang.String getClassName(java.lang.Class<?> cls) {
        java.lang.String name = cls.getName();
        return name.substring(name.lastIndexOf(46) + 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.reflect.Constructor<?>] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public static java.lang.reflect.Constructor<?> getConstructor(java.lang.Class<?> cls, boolean z17, boolean z18, java.lang.Class<?>... clsArr) {
        try {
            cls = z17 ? cls.getDeclaredConstructor(clsArr) : cls.getConstructor(clsArr);
            return cls;
        } catch (java.lang.NoSuchMethodException unused) {
            java.lang.reflect.Constructor<?> constructor = null;
            if (z18) {
                java.lang.Class superclass = cls.getSuperclass();
                while (constructor == null && superclass != null) {
                    if (z17) {
                        try {
                            constructor = cls.getDeclaredConstructor(clsArr);
                        } catch (java.lang.NoSuchMethodException unused2) {
                            superclass = superclass.getSuperclass();
                        }
                    } else {
                        constructor = cls.getConstructor(clsArr);
                    }
                }
            }
            return constructor;
        }
    }

    public static java.util.List<java.lang.reflect.Constructor<?>> getConstructors(java.lang.Class<?> cls, boolean z17, boolean z18, boolean z19) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (z18) {
            java.util.List<java.lang.Class<?>> superClasss = getSuperClasss(cls, true);
            if (z19) {
                for (int size = superClasss.size() - 1; size > -1; size--) {
                    for (java.lang.reflect.Constructor<?> constructor : z17 ? superClasss.get(size).getDeclaredConstructors() : superClasss.get(size).getConstructors()) {
                        arrayList.add(constructor);
                    }
                }
            } else {
                for (int i17 = 0; i17 < superClasss.size(); i17++) {
                    for (java.lang.reflect.Constructor<?> constructor2 : z17 ? superClasss.get(i17).getDeclaredConstructors() : superClasss.get(i17).getConstructors()) {
                        arrayList.add(constructor2);
                    }
                }
            }
        } else {
            for (java.lang.reflect.Constructor<?> constructor3 : z17 ? cls.getDeclaredConstructors() : cls.getConstructors()) {
                arrayList.add(constructor3);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    public static java.lang.reflect.Field getField(java.lang.Class<?> cls, java.lang.String str, boolean z17, boolean z18) {
        try {
            cls = z17 ? cls.getDeclaredField(str) : cls.getField(str);
            return cls;
        } catch (java.lang.NoSuchFieldException unused) {
            if (!z18) {
                return null;
            }
            java.lang.Class superclass = cls.getSuperclass();
            java.lang.reflect.Field field = null;
            while (field == null && superclass != null) {
                if (z17) {
                    try {
                        field = superclass.getDeclaredField(str);
                    } catch (java.lang.NoSuchFieldException unused2) {
                        superclass = superclass.getSuperclass();
                    }
                } else {
                    field = superclass.getField(str);
                }
            }
            return field;
        }
    }

    public static java.util.List<java.lang.reflect.Field> getFields(java.lang.Class<?> cls, boolean z17, boolean z18, boolean z19, boolean z27) {
        java.util.List<java.lang.Class<?>> list;
        java.lang.reflect.Field[] fields;
        java.lang.reflect.Field[] fields2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (z18) {
            if (z19) {
                list = getSuperClasss(cls, true);
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(2);
                arrayList2.add(cls);
                java.lang.Class<? super java.lang.Object> superclass = cls.getSuperclass();
                if (superclass != null) {
                    arrayList2.add(superclass);
                }
                list = arrayList2;
            }
            if (z27) {
                for (int size = list.size() - 1; size > -1; size--) {
                    if (z17) {
                        fields2 = list.get(size).getDeclaredFields();
                    } else {
                        fields2 = list.get(size).getFields();
                    }
                    for (java.lang.reflect.Field field : fields2) {
                        arrayList.add(field);
                    }
                }
            } else {
                for (int i17 = 0; i17 < list.size(); i17++) {
                    if (z17) {
                        fields = list.get(i17).getDeclaredFields();
                    } else {
                        fields = list.get(i17).getFields();
                    }
                    for (java.lang.reflect.Field field2 : fields) {
                        arrayList.add(field2);
                    }
                }
            }
        } else {
            for (java.lang.reflect.Field field3 : z17 ? cls.getDeclaredFields() : cls.getFields()) {
                arrayList.add(field3);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    public static java.lang.reflect.Method getMethod(java.lang.Class<?> cls, boolean z17, boolean z18, java.lang.String str, java.lang.Class<?>... clsArr) {
        try {
            if (z17) {
                cls = cls.getDeclaredMethod(str, clsArr);
            } else {
                cls = cls.getMethod(str, clsArr);
            }
            return cls;
        } catch (java.lang.NoSuchMethodException unused) {
            if (!z18) {
                return null;
            }
            java.lang.Class superclass = cls.getSuperclass();
            java.lang.reflect.Method method = null;
            while (method == null && superclass != null) {
                if (z17) {
                    try {
                        method = superclass.getDeclaredMethod(str, clsArr);
                    } catch (java.lang.NoSuchMethodException unused2) {
                        superclass = superclass.getSuperclass();
                    }
                } else {
                    method = superclass.getMethod(str, clsArr);
                }
            }
            return method;
        }
    }

    public static java.util.List<java.lang.reflect.Method> getMethods(java.lang.Class<?> cls, boolean z17, boolean z18, boolean z19) {
        java.lang.reflect.Method[] methods;
        java.lang.reflect.Method[] methods2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (z18) {
            java.util.List<java.lang.Class<?>> superClasss = getSuperClasss(cls, true);
            if (z19) {
                for (int size = superClasss.size() - 1; size > -1; size--) {
                    if (z17) {
                        methods2 = superClasss.get(size).getDeclaredMethods();
                    } else {
                        methods2 = superClasss.get(size).getMethods();
                    }
                    for (java.lang.reflect.Method method : methods2) {
                        arrayList.add(method);
                    }
                }
            } else {
                for (int i17 = 0; i17 < superClasss.size(); i17++) {
                    if (z17) {
                        methods = superClasss.get(i17).getDeclaredMethods();
                    } else {
                        methods = superClasss.get(i17).getMethods();
                    }
                    for (java.lang.reflect.Method method2 : methods) {
                        arrayList.add(method2);
                    }
                }
            }
        } else {
            for (java.lang.reflect.Method method3 : z17 ? cls.getDeclaredMethods() : cls.getMethods()) {
                arrayList.add(method3);
            }
        }
        return arrayList;
    }

    public static <T> T getObjectByFieldName(java.lang.Object obj, java.lang.String str, java.lang.Class<T> cls) {
        if (obj != null && !android.text.TextUtils.isEmpty(str) && cls != null) {
            try {
                java.lang.reflect.Field field = getField(obj.getClass(), str, true, true);
                if (field != null) {
                    field.setAccessible(true);
                    return (T) field.get(obj);
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return null;
    }

    public static java.util.List<java.lang.Class<?>> getSuperClasss(java.lang.Class<?> cls, boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!z17) {
            cls = cls.getSuperclass();
        }
        while (cls != null) {
            arrayList.add(cls);
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    public static java.lang.reflect.Method getValueOfMethod(java.lang.Class<?> cls, java.lang.Class<?>... clsArr) {
        return getMethod(cls, true, true, "valueOf", clsArr);
    }

    public static java.lang.Object invokeMethod(java.lang.reflect.Method method, java.lang.Object obj) {
        return method.invoke(obj, EMPTY_PARAMS);
    }

    public static final boolean isArrayByType(java.lang.reflect.Field field, java.lang.Class<?> cls) {
        java.lang.Class<?> type = field.getType();
        return type.isArray() && cls.isAssignableFrom(type.getComponentType());
    }

    public static final boolean isCollectionByType(java.lang.reflect.Field field, java.lang.Class<? extends java.util.Collection> cls, java.lang.Class<?> cls2) {
        if (cls.isAssignableFrom(field.getType())) {
            return cls2.isAssignableFrom((java.lang.Class) ((java.lang.reflect.ParameterizedType) field.getGenericType()).getActualTypeArguments()[0]);
        }
        return false;
    }

    public static boolean setField(java.lang.Object obj, java.lang.String str, java.lang.Object obj2, boolean z17, boolean z18) {
        java.lang.reflect.Field field = getField(obj.getClass(), str, z17, z18);
        if (field == null) {
            return false;
        }
        try {
            field.setAccessible(true);
            field.set(obj, obj2);
            return true;
        } catch (java.lang.IllegalAccessException unused) {
            return false;
        }
    }

    public static java.lang.Object invokeMethod(java.lang.reflect.Method method, java.lang.Object obj, java.lang.Object... objArr) {
        return method.invoke(obj, objArr);
    }

    public static java.lang.reflect.Field getField(java.lang.Class<?> cls, java.lang.String str) {
        return getField(cls, str, true, true);
    }

    public static java.lang.reflect.Method getMethod(java.lang.Class<?> cls, java.lang.String str, java.lang.Class<?>... clsArr) {
        return getMethod(cls, true, true, str, clsArr);
    }

    public static java.lang.reflect.Method getMethod(java.lang.Class<?> cls, java.lang.String str) {
        return getMethod(cls, str, EMPTY_PARAM_TYPES);
    }

    public static java.util.List<java.lang.reflect.Method> getMethods(java.lang.Class<?> cls) {
        return getMethods(cls, true, true, true);
    }

    public static java.util.List<java.lang.reflect.Field> getFields(java.lang.Class<?> cls) {
        return getFields(cls, true, true, true, true);
    }
}
