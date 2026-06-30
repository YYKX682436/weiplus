package d7;

/* loaded from: classes13.dex */
public abstract class f implements t6.p {
    @Override // t6.p
    public final w6.z0 a(android.content.Context context, w6.z0 z0Var, int i17, int i18) {
        if (!q7.p.f(i17, i18)) {
            throw new java.lang.IllegalArgumentException("Cannot apply transformation on width: " + i17 + " or height: " + i18 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        x6.d dVar = com.bumptech.glide.c.b(context).f43922d;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) z0Var.get();
        if (i17 == Integer.MIN_VALUE) {
            i17 = bitmap.getWidth();
        }
        if (i18 == Integer.MIN_VALUE) {
            i18 = bitmap.getHeight();
        }
        android.graphics.Bitmap c17 = c(dVar, bitmap, i17, i18);
        return bitmap.equals(c17) ? z0Var : d7.e.b(c17, dVar);
    }

    public abstract android.graphics.Bitmap c(x6.d dVar, android.graphics.Bitmap bitmap, int i17, int i18);
}
