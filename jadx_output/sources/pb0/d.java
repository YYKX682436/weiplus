package pb0;

/* loaded from: classes12.dex */
public final class d implements yj0.b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ThreadLocal f353118a = new java.lang.ThreadLocal();

    @Override // yj0.b
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Object obj, java.lang.Object obj2) {
        jz5.f0 f0Var;
        java.lang.ThreadLocal threadLocal = this.f353118a;
        java.lang.Object[] objArr = (java.lang.Object[]) threadLocal.get();
        threadLocal.remove();
        if (obj2 == null || !(obj2 instanceof android.graphics.Bitmap)) {
            return;
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        int byteCount = bitmap.getByteCount();
        pb0.g gVar = pb0.g.f353121a;
        boolean z17 = byteCount >= ((java.lang.Number) ((jz5.n) pb0.g.f353123c).getValue()).intValue();
        if (objArr == null) {
            if (!r26.i0.q(str4, "getPrimaryImage", false, 2, null) || !r26.i0.q(str5, "()Landroid/graphics/Bitmap;", false, 2, null)) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.HellBitmapTracer", new java.lang.Throwable(), "args should NOT be null", new java.lang.Object[0]);
                return;
            }
            pb0.g.a(gVar, bitmap, byteCount, str + " -> " + str4, z17 ? new java.lang.Throwable("MediaMetadataRetriever") : null);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj3 : objArr) {
            if (obj3 instanceof android.graphics.BitmapFactory.Options) {
                arrayList.add(obj3);
            }
        }
        android.graphics.BitmapFactory.Options options = (android.graphics.BitmapFactory.Options) kz5.n0.Z(arrayList);
        if (options != null) {
            if (!options.inJustDecodeBounds) {
                pb0.g.a(pb0.g.f353121a, bitmap, byteCount, str + " -> " + str4, z17 ? new java.lang.Throwable(java.lang.String.valueOf(str4)) : null);
            }
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            pb0.g.a(pb0.g.f353121a, bitmap, byteCount, str + " -> " + str4, z17 ? new java.lang.Throwable(java.lang.String.valueOf(str4)) : null);
        }
    }

    @Override // yj0.b
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Object obj, java.lang.Object[] objArr) {
        this.f353118a.set(objArr);
    }
}
