package org.chromium.base;

/* loaded from: classes13.dex */
public class WrappedClassLoader extends java.lang.ClassLoader {
    private final java.lang.ClassLoader mPrimaryClassLoader;
    private final java.lang.ClassLoader mSecondaryClassLoader;

    public WrappedClassLoader(java.lang.ClassLoader classLoader, java.lang.ClassLoader classLoader2) {
        this.mPrimaryClassLoader = classLoader;
        this.mSecondaryClassLoader = classLoader2;
    }

    @Override // java.lang.ClassLoader
    public java.lang.Class<?> findClass(java.lang.String str) {
        try {
            return this.mPrimaryClassLoader.loadClass(str);
        } catch (java.lang.ClassNotFoundException e17) {
            try {
                return this.mSecondaryClassLoader.loadClass(str);
            } catch (java.lang.ClassNotFoundException e18) {
                e17.addSuppressed(e18);
                throw e17;
            }
        }
    }

    @Override // java.lang.ClassLoader
    public java.lang.String findLibrary(java.lang.String str) {
        java.lang.String str2;
        java.lang.ClassLoader classLoader = this.mPrimaryClassLoader;
        if (classLoader instanceof dalvik.system.BaseDexClassLoader) {
            str2 = ((dalvik.system.BaseDexClassLoader) classLoader).findLibrary(str);
            if (str2 != null) {
                return str2;
            }
        } else {
            str2 = null;
        }
        java.lang.ClassLoader classLoader2 = this.mSecondaryClassLoader;
        return classLoader2 instanceof dalvik.system.BaseDexClassLoader ? ((dalvik.system.BaseDexClassLoader) classLoader2).findLibrary(str) : str2;
    }
}
