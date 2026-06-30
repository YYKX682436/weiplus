package dp0;

/* loaded from: classes5.dex */
public class e extends dp0.d {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f242117d;

    /* renamed from: e, reason: collision with root package name */
    public final float f242118e;

    public e(boolean z17, float f17) {
        this.f242117d = z17;
        this.f242118e = f17;
    }

    @Override // zo0.k
    public hp0.g a(cp0.n nVar, vo0.h hVar, hp0.g gVar) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) gVar.f282913a;
        if (this.f242117d) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            float f17 = this.f242118e;
            if (width == height) {
                bitmap = com.tencent.mm.sdk.platformtools.x.s0(bitmap, false, bitmap.getWidth() * f17);
            } else {
                int min = java.lang.Math.min(bitmap.getWidth(), bitmap.getHeight());
                if (min <= 0) {
                    min = java.lang.Math.max(bitmap.getWidth(), bitmap.getHeight());
                }
                bitmap = com.tencent.mm.sdk.platformtools.x.s0(com.tencent.mm.sdk.platformtools.x.k0(bitmap, min, min, true), false, min * f17);
            }
        }
        return new hp0.g(bitmap);
    }

    @Override // zo0.k
    public java.lang.String b(java.lang.String str) {
        return "_round_" + this.f242118e + "_";
    }
}
