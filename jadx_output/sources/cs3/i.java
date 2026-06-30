package cs3;

/* loaded from: classes9.dex */
public class i implements x51.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cs3.j f222113a;

    public i(cs3.j jVar) {
        this.f222113a = jVar;
    }

    @Override // x51.o0
    public boolean a() {
        return false;
    }

    @Override // x51.o0
    public x51.n0 b() {
        return null;
    }

    @Override // x51.o0
    public java.lang.String c() {
        return this.f222113a.f222114d;
    }

    @Override // x51.o0
    public java.lang.String d() {
        return this.f222113a.f222114d;
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
        return this.f222113a.f222114d;
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
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        c01.d9.b().getClass();
        sb6.append(((r01.s1) ((r01.x2) i95.n0.c(r01.x2.class))).wi());
        sb6.append(com.tencent.mm.sdk.platformtools.w2.a(this.f222113a.f222114d));
        return sb6.toString();
    }

    @Override // x51.o0
    public android.graphics.Bitmap l(android.graphics.Bitmap bitmap, x51.m0 m0Var, java.lang.String str) {
        if (x51.m0.NET == m0Var) {
            try {
                com.tencent.mm.sdk.platformtools.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.PNG, k(), false);
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.UrlDrawable", e17, "", new java.lang.Object[0]);
                com.tencent.mars.xlog.Log.w("MicroMsg.UrlDrawable", "save bitmap fail");
            }
        }
        m0Var.toString();
        return bitmap;
    }
}
