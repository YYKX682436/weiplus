package d3;

/* loaded from: classes13.dex */
public abstract class p {
    public final void a(final int i17, android.os.Handler handler) {
        if (handler == null) {
            handler = new android.os.Handler(android.os.Looper.getMainLooper());
        }
        handler.post(new java.lang.Runnable() { // from class: d3.p$$b
            @Override // java.lang.Runnable
            public final void run() {
                d3.p.this.c(i17);
            }
        });
    }

    public final void b(final android.graphics.Typeface typeface, android.os.Handler handler) {
        if (handler == null) {
            handler = new android.os.Handler(android.os.Looper.getMainLooper());
        }
        handler.post(new java.lang.Runnable() { // from class: d3.p$$a
            @Override // java.lang.Runnable
            public final void run() {
                d3.p.this.d(typeface);
            }
        });
    }

    public abstract void c(int i17);

    public abstract void d(android.graphics.Typeface typeface);
}
