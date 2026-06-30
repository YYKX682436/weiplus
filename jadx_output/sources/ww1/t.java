package ww1;

/* loaded from: classes9.dex */
public class t implements x51.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f450281a;

    /* renamed from: b, reason: collision with root package name */
    public final x51.n0 f450282b = new ww1.s(this);

    public t(java.lang.String str) {
        this.f450281a = str;
    }

    @Override // x51.o0
    public boolean a() {
        return true;
    }

    @Override // x51.o0
    public x51.n0 b() {
        return this.f450282b;
    }

    @Override // x51.o0
    public java.lang.String c() {
        return this.f450281a;
    }

    @Override // x51.o0
    public java.lang.String d() {
        return this.f450281a;
    }

    @Override // x51.o0
    public android.graphics.Bitmap e() {
        return null;
    }

    @Override // x51.o0
    public void f() {
    }

    @Override // x51.o0
    public java.lang.String g() {
        return this.f450281a;
    }

    @Override // x51.o0
    public void h(x51.m0 m0Var, java.lang.String str) {
    }

    @Override // x51.o0
    public boolean i() {
        return false;
    }

    @Override // x51.o0
    public void j(java.lang.String str, boolean z17) {
    }

    @Override // x51.o0
    public java.lang.String k() {
        return dt4.b.a(this.f450281a);
    }

    @Override // x51.o0
    public android.graphics.Bitmap l(android.graphics.Bitmap bitmap, x51.m0 m0Var, java.lang.String str) {
        if (x51.m0.NET == m0Var) {
            try {
                com.tencent.mm.sdk.platformtools.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.PNG, k(), false);
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletGetPicStrategy", e17, "", new java.lang.Object[0]);
            }
        }
        return bitmap;
    }
}
