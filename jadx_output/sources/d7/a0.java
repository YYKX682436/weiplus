package d7;

/* loaded from: classes13.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final x6.d f226784a = new d7.z();

    public static w6.z0 a(x6.d dVar, android.graphics.drawable.Drawable drawable, int i17, int i18) {
        android.graphics.Bitmap bitmap;
        android.graphics.drawable.Drawable current = drawable.getCurrent();
        boolean z17 = false;
        if (current instanceof android.graphics.drawable.BitmapDrawable) {
            bitmap = ((android.graphics.drawable.BitmapDrawable) current).getBitmap();
        } else if (current instanceof android.graphics.drawable.Animatable) {
            bitmap = null;
        } else {
            if (i17 != Integer.MIN_VALUE || current.getIntrinsicWidth() > 0) {
                if (i18 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                    if (current.getIntrinsicWidth() > 0) {
                        i17 = current.getIntrinsicWidth();
                    }
                    if (current.getIntrinsicHeight() > 0) {
                        i18 = current.getIntrinsicHeight();
                    }
                    java.util.concurrent.locks.Lock lock = d7.n0.f226828d;
                    lock.lock();
                    android.graphics.Bitmap d17 = dVar.d(i17, i18, android.graphics.Bitmap.Config.ARGB_8888);
                    try {
                        android.graphics.Canvas canvas = new android.graphics.Canvas(d17);
                        current.setBounds(0, 0, i17, i18);
                        current.draw(canvas);
                        canvas.setBitmap(null);
                        lock.unlock();
                        bitmap = d17;
                        z17 = true;
                    } catch (java.lang.Throwable th6) {
                        lock.unlock();
                        throw th6;
                    }
                } else if (android.util.Log.isLoggable("DrawableToBitmap", 5)) {
                    current.toString();
                }
            } else if (android.util.Log.isLoggable("DrawableToBitmap", 5)) {
                current.toString();
            }
            bitmap = null;
            z17 = true;
        }
        if (!z17) {
            dVar = f226784a;
        }
        return d7.e.b(bitmap, dVar);
    }
}
