package j34;

/* loaded from: classes9.dex */
public class h implements x51.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final j34.i f297492a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f297493b;

    public h(j34.i iVar) {
        this.f297492a = null;
        this.f297493b = "";
        this.f297492a = iVar;
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
        return g() + "_tv";
    }

    @Override // x51.o0
    public java.lang.String d() {
        return g() + "_tv";
    }

    @Override // x51.o0
    public android.graphics.Bitmap e() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (context == null) {
            return null;
        }
        android.content.res.Resources resources = context.getResources();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.bkr));
        arrayList.add(resources);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/shake/util/TVImgGetStrategy", "getNoSDCardBitmap", "()Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.e(obj, decodeResource, "com/tencent/mm/plugin/shake/util/TVImgGetStrategy", "getNoSDCardBitmap", "()Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        return decodeResource;
    }

    @Override // x51.o0
    public void f() {
    }

    @Override // x51.o0
    public java.lang.String g() {
        java.lang.String str;
        j34.i iVar = this.f297492a;
        return (iVar == null || (str = iVar.field_thumburl) == null) ? this.f297493b : str;
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
        java.lang.String str;
        j34.i iVar = this.f297492a;
        if (iVar != null && (str = iVar.field_thumburl) != null) {
            return c34.h0.Ai(str, "@S");
        }
        java.lang.String str2 = this.f297493b;
        return str2 != null ? c34.h0.Ai(str2, "@S") : "";
    }

    @Override // x51.o0
    public android.graphics.Bitmap l(android.graphics.Bitmap bitmap, x51.m0 m0Var, java.lang.String str) {
        if (x51.m0.NET == m0Var) {
            try {
                com.tencent.mm.sdk.platformtools.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.PNG, k(), false);
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TVImgGetStrategy", e17, "", new java.lang.Object[0]);
            }
        }
        return bitmap;
    }

    public h(java.lang.String str) {
        this.f297492a = null;
        this.f297493b = "";
        this.f297493b = str;
    }
}
