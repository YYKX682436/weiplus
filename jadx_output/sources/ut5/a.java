package ut5;

/* loaded from: classes13.dex */
public class a extends java.lang.ClassLoader {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String[] f431187a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ClassLoader f431188b;

    public a(java.lang.ClassLoader classLoader, java.lang.String[] strArr, java.lang.ClassLoader classLoader2) {
        super(classLoader);
        classLoader2 = classLoader2 == null ? classLoader.getParent() : classLoader2;
        this.f431188b = classLoader2;
        ut5.b.f431189a.info("WhiteListClassLoader#mGrandClassLoader " + classLoader2);
        this.f431187a = strArr == null ? new java.lang.String[0] : strArr;
    }

    @Override // java.lang.ClassLoader
    public java.lang.Class loadClass(java.lang.String str, boolean z17) {
        java.lang.Class<?> findLoadedClass = findLoadedClass(str);
        if (findLoadedClass != null) {
            return findLoadedClass;
        }
        java.lang.String[] strArr = this.f431187a;
        int length = strArr.length;
        boolean z18 = false;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                break;
            }
            if (str.startsWith(strArr[i17])) {
                z18 = true;
                break;
            }
            i17++;
        }
        return z18 ? super.loadClass(str, z17) : this.f431188b.loadClass(str);
    }
}
