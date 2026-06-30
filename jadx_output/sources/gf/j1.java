package gf;

/* loaded from: classes7.dex */
public final class j1 extends gf.k1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas canvas, android.view.View child, long j17) {
        android.graphics.Bitmap bitmap;
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(child, "child");
        if (!canvas.isHardwareAccelerated() && (child instanceof android.widget.ImageView)) {
            android.graphics.drawable.Drawable drawable = ((android.widget.ImageView) child).getDrawable();
            android.graphics.Bitmap.Config config = null;
            android.graphics.drawable.BitmapDrawable bitmapDrawable = drawable instanceof android.graphics.drawable.BitmapDrawable ? (android.graphics.drawable.BitmapDrawable) drawable : null;
            if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                config = bitmap.getConfig();
            }
            if (config == android.graphics.Bitmap.Config.HARDWARE) {
                return false;
            }
        }
        return super.drawChild(canvas, child, j17);
    }
}
