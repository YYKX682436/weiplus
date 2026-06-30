package m11;

/* loaded from: classes10.dex */
public class h0 extends android.graphics.drawable.BitmapDrawable {
    public static void a(android.graphics.Bitmap bitmap, android.widget.ImageView imageView) {
        if (imageView == null || imageView.getResources() == null) {
            return;
        }
        m11.h0 h0Var = new m11.h0(imageView.getResources(), bitmap);
        if (imageView.getLayerType() == 1) {
            imageView.destroyDrawingCache();
            imageView.setLayerType(0, null);
        }
        imageView.setImageDrawable(h0Var);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        if (getBitmap() != null && !getBitmap().isRecycled()) {
            super.draw(canvas);
        } else if (getBitmap() != null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImgInfoStorage", "Cannot draw recycled bitmaps:%s", getBitmap().toString());
        }
    }
}
