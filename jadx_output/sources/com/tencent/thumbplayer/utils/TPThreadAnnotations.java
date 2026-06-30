package com.tencent.thumbplayer.utils;

/* loaded from: classes13.dex */
public class TPThreadAnnotations {
    private static java.util.ArrayList<com.tencent.thumbplayer.utils.TPThreadAnnotations.RegisterMethod> mRegisterMethods = new java.util.ArrayList<>();

    /* loaded from: classes6.dex */
    public static class RegisterMethod {
        java.lang.String className;
        java.util.Map<java.lang.Integer, java.lang.reflect.Method> methodMap;

        private RegisterMethod() {
        }
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.TYPE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    /* loaded from: classes6.dex */
    public @interface ThreadSwitch {
        boolean checkObj() default false;

        boolean needWait() default false;

        boolean removeRepeat() default false;
    }

    public static boolean checkObj(java.lang.Class<?> cls, int i17) {
        java.lang.reflect.Method method;
        com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch threadSwitch;
        java.util.Map<java.lang.Integer, java.lang.reflect.Method> registerMethodMap = getRegisterMethodMap(cls);
        if (registerMethodMap == null || (method = registerMethodMap.get(java.lang.Integer.valueOf(i17))) == null || (threadSwitch = (com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch) method.getAnnotation(com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch.class)) == null) {
            return false;
        }
        return threadSwitch.checkObj();
    }

    public static java.lang.String getApi(java.lang.Class<?> cls, int i17) {
        java.lang.reflect.Method method;
        java.util.Map<java.lang.Integer, java.lang.reflect.Method> registerMethodMap = getRegisterMethodMap(cls);
        return (registerMethodMap == null || (method = registerMethodMap.get(java.lang.Integer.valueOf(i17))) == null) ? com.eclipsesource.mmv8.Platform.UNKNOWN : method.getName();
    }

    public static java.lang.reflect.Method getMethod(java.lang.Class<?> cls, java.lang.String str, java.lang.Object[] objArr) {
        java.util.Map<java.lang.Integer, java.lang.reflect.Method> registerMethodMap = getRegisterMethodMap(cls);
        if (registerMethodMap == null) {
            return null;
        }
        java.util.Iterator<java.util.Map.Entry<java.lang.Integer, java.lang.reflect.Method>> it = registerMethodMap.entrySet().iterator();
        while (it.hasNext()) {
            java.lang.reflect.Method value = it.next().getValue();
            if (value != null && str.equals(value.getName()) && isMatchParams(value, objArr)) {
                return value;
            }
        }
        return null;
    }

    public static java.lang.reflect.Method getMethodByMsgId(java.lang.Class<?> cls, int i17) {
        java.util.Map<java.lang.Integer, java.lang.reflect.Method> registerMethodMap = getRegisterMethodMap(cls);
        if (registerMethodMap == null) {
            return null;
        }
        return registerMethodMap.get(java.lang.Integer.valueOf(i17));
    }

    public static int getMethodMsgId(java.lang.Class<?> cls, java.lang.String str, java.lang.Object[] objArr) {
        java.util.Map<java.lang.Integer, java.lang.reflect.Method> registerMethodMap = getRegisterMethodMap(cls);
        if (registerMethodMap == null) {
            return -1;
        }
        for (java.util.Map.Entry<java.lang.Integer, java.lang.reflect.Method> entry : registerMethodMap.entrySet()) {
            java.lang.reflect.Method value = entry.getValue();
            if (value != null && str.equals(value.getName()) && isMatchParams(value, objArr)) {
                return entry.getKey().intValue();
            }
        }
        return -1;
    }

    private static java.util.Map<java.lang.Integer, java.lang.reflect.Method> getRegisterMethodMap(java.lang.Class<?> cls) {
        java.lang.String str;
        java.util.Iterator<com.tencent.thumbplayer.utils.TPThreadAnnotations.RegisterMethod> it = mRegisterMethods.iterator();
        while (it.hasNext()) {
            com.tencent.thumbplayer.utils.TPThreadAnnotations.RegisterMethod next = it.next();
            if (next != null && (str = next.className) != null && str.equals(cls.getName())) {
                return next.methodMap;
            }
        }
        return null;
    }

    private static boolean isMatchParams(java.lang.reflect.Method method, java.lang.Object[] objArr) {
        java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
        if (objArr == null || objArr.length == 0) {
            return parameterTypes.length == 0;
        }
        if (parameterTypes.length != objArr.length) {
            return false;
        }
        for (int i17 = 0; i17 < parameterTypes.length; i17++) {
            java.lang.Class<?> cls = parameterTypes[i17];
            java.lang.Object obj = objArr[i17];
            if (obj == null) {
                if (cls.isPrimitive()) {
                    return false;
                }
            } else if (!cls.isAssignableFrom(obj.getClass()) && !isSamePrimitive(cls, objArr[i17])) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNeedWait(java.lang.Class<?> cls, int i17) {
        java.lang.reflect.Method method;
        java.util.Map<java.lang.Integer, java.lang.reflect.Method> registerMethodMap = getRegisterMethodMap(cls);
        if (registerMethodMap != null && (method = registerMethodMap.get(java.lang.Integer.valueOf(i17))) != null) {
            java.lang.Class<?>[] exceptionTypes = method.getExceptionTypes();
            if (exceptionTypes != null && exceptionTypes.length > 0) {
                return true;
            }
            com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch threadSwitch = (com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch) method.getAnnotation(com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch.class);
            if (threadSwitch != null) {
                return threadSwitch.needWait();
            }
        }
        return false;
    }

    private static boolean isRegistered(java.lang.Class<?> cls) {
        java.lang.String str;
        java.util.Iterator<com.tencent.thumbplayer.utils.TPThreadAnnotations.RegisterMethod> it = mRegisterMethods.iterator();
        while (it.hasNext()) {
            com.tencent.thumbplayer.utils.TPThreadAnnotations.RegisterMethod next = it.next();
            if (next != null && (str = next.className) != null && str.equals(cls.getName())) {
                return true;
            }
        }
        return false;
    }

    private static boolean isSamePrimitive(java.lang.Class<?> cls, java.lang.Object obj) {
        if (!cls.isPrimitive()) {
            return false;
        }
        try {
            return obj.getClass().getField("TYPE").get(null).equals(cls);
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public static synchronized boolean register(java.lang.Class<?> cls, int i17) {
        synchronized (com.tencent.thumbplayer.utils.TPThreadAnnotations.class) {
            if (isRegistered(cls)) {
                return true;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            try {
                for (java.lang.reflect.Method method : cls.getMethods()) {
                    if (((com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch) method.getAnnotation(com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch.class)) != null) {
                        hashMap.put(java.lang.Integer.valueOf(i17), method);
                        i17++;
                    }
                }
                com.tencent.thumbplayer.utils.TPThreadAnnotations.RegisterMethod registerMethod = new com.tencent.thumbplayer.utils.TPThreadAnnotations.RegisterMethod();
                registerMethod.className = cls.getName();
                registerMethod.methodMap = hashMap;
                mRegisterMethods.add(registerMethod);
                return true;
            } catch (java.lang.Exception unused) {
                hashMap.clear();
                return false;
            }
        }
    }

    public static boolean removeRepeat(java.lang.Class<?> cls, int i17) {
        java.lang.reflect.Method method;
        com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch threadSwitch;
        java.util.Map<java.lang.Integer, java.lang.reflect.Method> registerMethodMap = getRegisterMethodMap(cls);
        if (registerMethodMap == null || (method = registerMethodMap.get(java.lang.Integer.valueOf(i17))) == null || (threadSwitch = (com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch) method.getAnnotation(com.tencent.thumbplayer.utils.TPThreadAnnotations.ThreadSwitch.class)) == null) {
            return false;
        }
        return threadSwitch.removeRepeat();
    }
}
