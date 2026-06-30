package l01;

/* loaded from: classes5.dex */
public final class p0 extends android.graphics.drawable.BitmapDrawable {
    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        if (getBitmap() == null || getBitmap().isRecycled()) {
            return;
        }
        super.draw(canvas);
    }
}
