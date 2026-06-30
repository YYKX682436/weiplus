package yi;

/* loaded from: classes15.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f462452a = new java.util.HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f462453b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f462454c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f462455d = new java.util.HashSet();

    /* renamed from: e, reason: collision with root package name */
    public zi.b f462456e = null;

    /* renamed from: f, reason: collision with root package name */
    public zi.b f462457f = null;

    /* renamed from: g, reason: collision with root package name */
    public zi.b f462458g = null;

    /* renamed from: h, reason: collision with root package name */
    public zi.b f462459h = null;

    /* renamed from: i, reason: collision with root package name */
    public zi.b f462460i = null;

    /* renamed from: j, reason: collision with root package name */
    public zi.b f462461j = null;

    /* renamed from: k, reason: collision with root package name */
    public zi.b f462462k = null;

    /* renamed from: l, reason: collision with root package name */
    public int f462463l = 0;

    /* renamed from: m, reason: collision with root package name */
    public zi.b f462464m = null;

    /* renamed from: n, reason: collision with root package name */
    public zi.a[] f462465n = null;

    /* renamed from: o, reason: collision with root package name */
    public zi.a[] f462466o = null;

    public void a(java.io.File file, java.io.File file2) {
        java.io.FileInputStream fileInputStream;
        java.io.BufferedOutputStream bufferedOutputStream;
        java.io.BufferedOutputStream bufferedOutputStream2 = null;
        try {
            fileInputStream = new java.io.FileInputStream(file);
            try {
                bufferedOutputStream = new java.io.BufferedOutputStream(new java.io.FileOutputStream(file2));
            } catch (java.lang.Throwable th6) {
                th = th6;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            fileInputStream = null;
        }
        try {
            yi.i iVar = new yi.i(new java.io.BufferedInputStream(fileInputStream));
            iVar.a(new yi.d(this));
            fileInputStream.getChannel().position(0L);
            iVar.a(new yi.f(this));
            fileInputStream.getChannel().position(0L);
            iVar.a(new yi.b(this, new yi.l(bufferedOutputStream)));
            try {
                bufferedOutputStream.close();
            } catch (java.lang.Throwable unused) {
            }
            try {
                fileInputStream.close();
            } catch (java.lang.Throwable unused2) {
            }
        } catch (java.lang.Throwable th8) {
            th = th8;
            bufferedOutputStream2 = bufferedOutputStream;
            if (bufferedOutputStream2 != null) {
                try {
                    bufferedOutputStream2.close();
                } catch (java.lang.Throwable unused3) {
                }
            }
            if (fileInputStream == null) {
                throw th;
            }
            try {
                fileInputStream.close();
                throw th;
            } catch (java.lang.Throwable unused4) {
                throw th;
            }
        }
    }
}
