package com.tencent.unit_rc;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0007J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0087 J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J$\u0010\f\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0007J&\u0010\r\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0003R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/tencent/unit_rc/ProguardConfig;", "", "", "className", "Ljava/lang/Class;", "clazz", "Ljz5/f0;", "register", "registerClass", "findClass", "methodName", "signature", "findMethod", "findMethodInternal", "", "classMap", "Ljava/util/Map;", "<init>", "()V", "unit_rc_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes13.dex */
public final class ProguardConfig {
    public static final com.tencent.unit_rc.ProguardConfig INSTANCE = new com.tencent.unit_rc.ProguardConfig();
    private static final java.util.Map<java.lang.String, java.lang.String> classMap = new java.util.LinkedHashMap();

    private ProguardConfig() {
    }

    public static final synchronized java.lang.String findClass(java.lang.String className) {
        java.lang.String str;
        synchronized (com.tencent.unit_rc.ProguardConfig.class) {
            kotlin.jvm.internal.o.g(className, "className");
            com.tencent.unit_rc.UnitRCLog.info("findClass ".concat(className));
            str = classMap.get(className);
            com.tencent.unit_rc.UnitRCLog.info("foundClass " + className + ' ' + str);
            if (str == null) {
                throw new java.lang.IllegalStateException("Class " + className + " not found");
            }
        }
        return str;
    }

    public static final java.lang.String findMethod(java.lang.Class<?> clazz, java.lang.String methodName, java.lang.String signature) {
        kotlin.jvm.internal.o.g(clazz, "clazz");
        kotlin.jvm.internal.o.g(methodName, "methodName");
        kotlin.jvm.internal.o.g(signature, "signature");
        com.tencent.unit_rc.UnitRCLog.info("findMethod " + clazz + ' ' + methodName + ' ' + signature);
        java.lang.String findMethodInternal = findMethodInternal(clazz, methodName, signature);
        if (findMethodInternal != null) {
            com.tencent.unit_rc.UnitRCLog.info("foundMethod " + findMethodInternal + ", " + methodName + " in " + clazz);
            return findMethodInternal;
        }
        java.lang.Class<?>[] interfaces = clazz.getInterfaces();
        kotlin.jvm.internal.o.f(interfaces, "clazz.interfaces");
        for (java.lang.Class<?> inf : interfaces) {
            kotlin.jvm.internal.o.f(inf, "inf");
            java.lang.String findMethodInternal2 = findMethodInternal(inf, methodName, signature);
            if (findMethodInternal2 != null) {
                com.tencent.unit_rc.UnitRCLog.info("foundMethod " + findMethodInternal2 + ", " + methodName + " in " + inf);
                return findMethodInternal2;
            }
        }
        throw new java.lang.IllegalStateException("Method " + methodName + " not found");
    }

    private static final java.lang.String findMethodInternal(java.lang.Class<?> clazz, java.lang.String methodName, java.lang.String signature) {
        java.lang.reflect.Method method;
        boolean z17;
        java.lang.reflect.Method[] declaredMethods = clazz.getDeclaredMethods();
        kotlin.jvm.internal.o.f(declaredMethods, "clazz.declaredMethods");
        int length = declaredMethods.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                method = null;
                break;
            }
            method = declaredMethods[i17];
            com.tencent.unit_rc.URMethodAnnotation uRMethodAnnotation = (com.tencent.unit_rc.URMethodAnnotation) method.getAnnotation(com.tencent.unit_rc.URMethodAnnotation.class);
            if (uRMethodAnnotation != null) {
                java.lang.String name = uRMethodAnnotation.name();
                z17 = kotlin.jvm.internal.o.b(uRMethodAnnotation.signature(), signature) & kotlin.jvm.internal.o.b(name, methodName);
            } else {
                z17 = false;
            }
            if (z17) {
                break;
            }
            i17++;
        }
        if (method != null) {
            return method.getName();
        }
        return null;
    }

    public static final synchronized void register(java.lang.String className, java.lang.Class<?> clazz) {
        synchronized (com.tencent.unit_rc.ProguardConfig.class) {
            kotlin.jvm.internal.o.g(className, "className");
            kotlin.jvm.internal.o.g(clazz, "clazz");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.Package r37 = clazz.getPackage();
            java.lang.String name = r37 != null ? r37.getName() : null;
            if (name == null) {
                name = "";
            }
            sb6.append(name);
            sb6.append('.');
            sb6.append(clazz.getSimpleName());
            java.lang.String v17 = r26.i0.v(sb6.toString(), ".", "/", false, 4, null);
            com.tencent.unit_rc.UnitRCLog.info("register " + className + ", " + v17);
            classMap.put(className, v17);
            registerClass(v17, clazz);
        }
    }

    public static final native void registerClass(java.lang.String str, java.lang.Class<?> cls);
}
