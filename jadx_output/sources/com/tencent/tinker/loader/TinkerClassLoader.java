package com.tencent.tinker.loader;

/* loaded from: classes13.dex */
public final class TinkerClassLoader extends dalvik.system.PathClassLoader {
    private final java.lang.ClassLoader mOriginAppClassLoader;

    /* loaded from: classes13.dex */
    public class CompoundEnumeration<E> implements java.util.Enumeration<E> {
        private java.util.Enumeration<E>[] enums;
        private int index = 0;

        public CompoundEnumeration(java.util.Enumeration<E>[] enumerationArr) {
            this.enums = enumerationArr;
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            while (true) {
                int i17 = this.index;
                java.util.Enumeration<E>[] enumerationArr = this.enums;
                if (i17 >= enumerationArr.length) {
                    return false;
                }
                java.util.Enumeration<E> enumeration = enumerationArr[i17];
                if (enumeration != null && enumeration.hasMoreElements()) {
                    return true;
                }
                this.index++;
            }
        }

        @Override // java.util.Enumeration
        public E nextElement() {
            if (hasMoreElements()) {
                return this.enums[this.index].nextElement();
            }
            throw new java.util.NoSuchElementException();
        }
    }

    public TinkerClassLoader(java.lang.String str, java.io.File file, java.lang.String str2, java.lang.ClassLoader classLoader) {
        super("", str2, java.lang.ClassLoader.getSystemClassLoader());
        this.mOriginAppClassLoader = classLoader;
        injectDexPath(this, str, file);
    }

    private static void injectDexPath(java.lang.ClassLoader classLoader, java.lang.String str, java.io.File file) {
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList(16);
            for (java.lang.String str2 : str.split(":")) {
                if (!str2.isEmpty()) {
                    arrayList.add(new java.io.File(str2));
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            com.tencent.tinker.loader.SystemClassLoaderAdder.injectDexesInternal(classLoader, arrayList, file);
        } catch (java.lang.Throwable th6) {
            throw new com.tencent.tinker.loader.TinkerRuntimeException("Fail to create TinkerClassLoader.", th6);
        }
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public java.lang.Class<?> findClass(java.lang.String str) {
        java.lang.Class<?> cls;
        try {
            cls = super.findClass(str);
        } catch (java.lang.ClassNotFoundException unused) {
            cls = null;
        }
        return cls != null ? cls : this.mOriginAppClassLoader.loadClass(str);
    }

    @Override // java.lang.ClassLoader
    public java.net.URL getResource(java.lang.String str) {
        java.net.URL resource = java.lang.Object.class.getClassLoader().getResource(str);
        if (resource != null) {
            return resource;
        }
        java.net.URL findResource = findResource(str);
        return findResource != null ? findResource : this.mOriginAppClassLoader.getResource(str);
    }

    @Override // java.lang.ClassLoader
    public java.util.Enumeration<java.net.URL> getResources(java.lang.String str) {
        return new com.tencent.tinker.loader.TinkerClassLoader.CompoundEnumeration(new java.util.Enumeration[]{java.lang.Object.class.getClassLoader().getResources(str), findResources(str), this.mOriginAppClassLoader.getResources(str)});
    }
}
