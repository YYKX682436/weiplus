package lo0;

/* loaded from: classes12.dex */
public final class n {
    public n(kotlin.jvm.internal.i iVar) {
    }

    public static final java.lang.String b(java.lang.String str) {
        java.io.File file = new java.io.File(str);
        try {
            java.lang.String canonicalPath = file.getCanonicalPath();
            kotlin.jvm.internal.o.d(canonicalPath);
            return canonicalPath;
        } catch (java.io.IOException unused) {
            java.lang.String absolutePath = file.getAbsolutePath();
            kotlin.jvm.internal.o.d(absolutePath);
            return absolutePath;
        }
    }

    public final java.lang.String a(java.lang.String relativePath, java.lang.String absoluteParentPath) {
        kotlin.jvm.internal.o.g(relativePath, "relativePath");
        kotlin.jvm.internal.o.g(absoluteParentPath, "absoluteParentPath");
        if (relativePath.length() == 0) {
            return null;
        }
        if (absoluteParentPath.length() == 0) {
            return null;
        }
        java.lang.String b17 = b(absoluteParentPath);
        java.lang.String o17 = new com.tencent.mm.vfs.r6(absoluteParentPath, relativePath).o();
        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
        java.lang.String b18 = b(o17);
        if (r26.i0.y(b18, b17, false)) {
            return b18;
        }
        return null;
    }
}
