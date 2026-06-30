package com.tencent.mm.sdk.platformtools;

/* loaded from: classes5.dex */
public abstract class s4 {
    public static android.content.ContentValues a(java.util.HashMap hashMap) {
        try {
            java.lang.reflect.Constructor declaredConstructor = android.content.ContentValues.class.getDeclaredConstructor(java.util.HashMap.class);
            declaredConstructor.setAccessible(true);
            return (android.content.ContentValues) declaredConstructor.newInstance(hashMap);
        } catch (java.lang.IllegalAccessException e17) {
            throw new java.lang.RuntimeException(e17);
        } catch (java.lang.IllegalArgumentException e18) {
            throw new java.lang.RuntimeException(e18);
        } catch (java.lang.InstantiationException e19) {
            throw new java.lang.RuntimeException(e19);
        } catch (java.lang.NoSuchMethodException e27) {
            throw new java.lang.RuntimeException(e27);
        } catch (java.lang.reflect.InvocationTargetException e28) {
            throw new java.lang.RuntimeException(e28);
        }
    }
}
