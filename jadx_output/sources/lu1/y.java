package lu1;

/* loaded from: classes5.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f321355d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lu1.z f321356e;

    public y(lu1.z zVar, android.graphics.Bitmap bitmap) {
        this.f321356e = zVar;
        this.f321355d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        lu1.z zVar = this.f321356e;
        boolean z17 = zVar.f321359f;
        android.widget.ImageView imageView = zVar.f321358e;
        android.graphics.Bitmap bitmap = this.f321355d;
        if (!z17) {
            imageView.setImageBitmap(bitmap);
            return;
        }
        float min = java.lang.Math.min(bitmap.getWidth(), bitmap.getHeight()) / 2;
        android.graphics.Bitmap bitmap2 = null;
        if (bitmap.isRecycled()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardUtil", "getRoundedCornerBitmap in bitmap is null");
        } else {
            android.graphics.Bitmap m17 = com.tencent.mm.sdk.platformtools.x.m(bitmap.getWidth(), bitmap.getHeight(), android.graphics.Bitmap.Config.ARGB_8888, false);
            if (m17 != null) {
                android.graphics.Canvas canvas = new android.graphics.Canvas(m17);
                android.graphics.Paint paint = new android.graphics.Paint();
                android.graphics.Rect rect = new android.graphics.Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                android.graphics.RectF rectF = new android.graphics.RectF(rect);
                paint.setAntiAlias(true);
                paint.setDither(true);
                paint.setFilterBitmap(true);
                canvas.drawARGB(0, 0, 0, 0);
                paint.setColor(-4144960);
                canvas.drawRoundRect(rectF, min, min, paint);
                paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
                canvas.drawBitmap(bitmap, rect, rect, paint);
                com.tencent.mars.xlog.Log.i("MicroMsg.CardUtil", "bitmap recycle %s", bitmap.toString());
                bitmap.recycle();
                bitmap2 = m17;
            }
        }
        imageView.setImageBitmap(bitmap2);
    }
}
