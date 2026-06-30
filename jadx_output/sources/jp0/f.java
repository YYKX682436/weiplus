package jp0;

/* loaded from: classes10.dex */
public final class f implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public java.io.InputStream f300979d = null;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f300980e = null;

    /* renamed from: f, reason: collision with root package name */
    public jp0.i f300981f;

    /* renamed from: g, reason: collision with root package name */
    public final jp0.h f300982g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Object f300983h;

    public f(jp0.i iVar, jp0.h hVar, java.lang.Object obj) {
        this.f300981f = iVar;
        this.f300982g = hVar;
        this.f300983h = obj;
    }

    public static jp0.f c(java.lang.String str, java.lang.Object obj) {
        jp0.a aVar = new jp0.a(str);
        return new jp0.f(aVar, aVar, obj);
    }

    public byte[] a() {
        byte[] bArr = this.f300980e;
        if (bArr != null) {
            return bArr;
        }
        jp0.h hVar = this.f300982g;
        if (hVar == null) {
            return null;
        }
        byte[] a17 = hVar.a();
        this.f300980e = a17;
        return a17;
    }

    public java.io.InputStream b() {
        java.io.InputStream inputStream = this.f300979d;
        if (inputStream != null) {
            return inputStream;
        }
        jp0.i iVar = this.f300981f;
        if (iVar == null) {
            return null;
        }
        java.io.InputStream b17 = iVar.b();
        this.f300979d = b17;
        return b17;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        jp0.i iVar = this.f300981f;
        if (iVar != null) {
            iVar.close();
            this.f300981f = null;
        }
        jp0.h hVar = this.f300982g;
        if (hVar != null) {
            hVar.close();
        }
    }
}
