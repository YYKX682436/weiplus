package ro1;

/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ro1.a f397974a = new ro1.a();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.reflect.Field f397975b;

    static {
        java.lang.reflect.Field field = (java.lang.reflect.Field) java.lang.Class.class.getDeclaredMethod("getDeclaredField", java.lang.String.class).invoke(android.os.storage.StorageVolume.class, "mPath");
        if (field != null) {
            field.setAccessible(true);
        }
        f397975b = field;
    }

    public final long a(java.io.InputStream input, java.io.OutputStream out, ro1.d dVar, int i17) {
        kotlin.jvm.internal.o.g(input, "input");
        kotlin.jvm.internal.o.g(out, "out");
        byte[] bArr = new byte[i17];
        int read = input.read(bArr);
        long j17 = 0;
        long j18 = 0;
        while (read >= 0) {
            out.write(bArr, 0, read);
            long j19 = read;
            j18 += j19;
            j17 += j19;
            if (j17 >= 10485760) {
                if (dVar != null) {
                    dVar.a(j17);
                }
                j17 = 0;
            }
            read = input.read(bArr);
        }
        if (j17 != 0 && dVar != null) {
            dVar.a(j17);
        }
        return j18;
    }

    public final java.lang.String b(java.lang.String parent, java.lang.String fileName) {
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(fileName, "fileName");
        if (r26.n0.E(parent, java.io.File.separatorChar, false, 2, null) || r26.n0.i0(fileName, java.io.File.separatorChar, false, 2, null)) {
            return parent.concat(fileName);
        }
        return parent + java.io.File.separatorChar + fileName;
    }
}
