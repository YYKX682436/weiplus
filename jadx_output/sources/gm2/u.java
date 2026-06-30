package gm2;

/* loaded from: classes3.dex */
public final class u {
    public u(kotlin.jvm.internal.i iVar) {
    }

    public static android.graphics.drawable.Drawable a(gm2.u uVar, java.lang.String spanStr, float f17, float f18, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            int i18 = gm2.w.f273509i;
            f17 = gm2.w.f273510j;
        }
        if ((i17 & 4) != 0) {
            int i19 = gm2.w.f273509i;
            f18 = gm2.w.f273511k;
        }
        uVar.getClass();
        kotlin.jvm.internal.o.g(spanStr, "spanStr");
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setTextSize(f17);
        float measureText = paint.measureText(spanStr, 0, spanStr.length()) + (2 * f18) + f18;
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setBounds(0, 0, (int) measureText, 1);
        return gradientDrawable;
    }
}
