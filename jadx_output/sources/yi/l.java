package yi;

/* loaded from: classes15.dex */
public class l extends yi.j {

    /* renamed from: b, reason: collision with root package name */
    public final java.io.OutputStream f462474b;

    /* renamed from: c, reason: collision with root package name */
    public int f462475c;

    /* renamed from: d, reason: collision with root package name */
    public final java.io.ByteArrayOutputStream f462476d;

    public l(java.io.OutputStream outputStream) {
        super(null);
        this.f462475c = 0;
        this.f462476d = new java.io.ByteArrayOutputStream();
        this.f462474b = outputStream;
    }

    @Override // yi.j
    public void a() {
        try {
            this.f462474b.flush();
        } catch (java.lang.Throwable th6) {
            throw new java.lang.RuntimeException(th6);
        }
    }

    @Override // yi.j
    public void b(java.lang.String str, int i17, long j17) {
        java.io.OutputStream outputStream = this.f462474b;
        try {
            if (i17 <= 0 || i17 >= 1073741823) {
                throw new java.io.IOException("bad idSize: " + i17);
            }
            this.f462475c = i17;
            outputStream.write(str.getBytes(java.nio.charset.Charset.forName(com.tencent.mapsdk.internal.rv.f51270c)));
            outputStream.write(0);
            aj.a.i(outputStream, i17);
            aj.a.j(outputStream, j17);
        } catch (java.lang.Throwable th6) {
            throw new java.lang.RuntimeException(th6);
        }
    }

    @Override // yi.j
    public yi.h c(int i17, int i18, long j17) {
        try {
            return new yi.k(this, i17, i18, j17);
        } catch (java.lang.Throwable th6) {
            throw new java.lang.RuntimeException(th6);
        }
    }

    @Override // yi.j
    public void d(int i17, zi.b bVar, int i18, zi.b bVar2, int i19, long j17) {
        java.io.OutputStream outputStream = this.f462474b;
        try {
            outputStream.write(2);
            aj.a.i(outputStream, i19);
            aj.a.i(outputStream, (int) j17);
            aj.a.i(outputStream, i17);
            outputStream.write(bVar.f473076a);
            aj.a.i(outputStream, i18);
            outputStream.write(bVar2.f473076a);
        } catch (java.lang.Throwable th6) {
            throw new java.lang.RuntimeException(th6);
        }
    }

    @Override // yi.j
    public void e(zi.b bVar, zi.b bVar2, zi.b bVar3, zi.b bVar4, int i17, int i18, int i19, long j17) {
        java.io.OutputStream outputStream = this.f462474b;
        try {
            outputStream.write(4);
            aj.a.i(outputStream, i19);
            aj.a.i(outputStream, (int) j17);
            outputStream.write(bVar.f473076a);
            outputStream.write(bVar2.f473076a);
            outputStream.write(bVar3.f473076a);
            outputStream.write(bVar4.f473076a);
            aj.a.i(outputStream, i17);
            aj.a.i(outputStream, i18);
        } catch (java.lang.Throwable th6) {
            throw new java.lang.RuntimeException(th6);
        }
    }

    @Override // yi.j
    public void f(int i17, int i18, zi.b[] bVarArr, int i19, long j17) {
        java.io.OutputStream outputStream = this.f462474b;
        try {
            outputStream.write(5);
            aj.a.i(outputStream, i19);
            aj.a.i(outputStream, (int) j17);
            aj.a.i(outputStream, i17);
            aj.a.i(outputStream, i18);
            aj.a.i(outputStream, bVarArr.length);
            for (zi.b bVar : bVarArr) {
                outputStream.write(bVar.f473076a);
            }
        } catch (java.lang.Throwable th6) {
            throw new java.lang.RuntimeException(th6);
        }
    }

    @Override // yi.j
    public void g(zi.b bVar, java.lang.String str, int i17, long j17) {
        java.io.OutputStream outputStream = this.f462474b;
        try {
            outputStream.write(1);
            aj.a.i(outputStream, i17);
            aj.a.i(outputStream, (int) j17);
            outputStream.write(bVar.f473076a);
            outputStream.write(str.getBytes(java.nio.charset.Charset.forName(com.tencent.mapsdk.internal.rv.f51270c)), 0, str.length());
        } catch (java.lang.Throwable th6) {
            throw new java.lang.RuntimeException(th6);
        }
    }

    @Override // yi.j
    public void h(int i17, int i18, long j17, byte[] bArr) {
        java.io.OutputStream outputStream = this.f462474b;
        try {
            outputStream.write(i17);
            aj.a.i(outputStream, i18);
            int i19 = (int) j17;
            aj.a.i(outputStream, i19);
            outputStream.write(bArr, 0, i19);
        } catch (java.lang.Throwable th6) {
            throw new java.lang.RuntimeException(th6);
        }
    }
}
