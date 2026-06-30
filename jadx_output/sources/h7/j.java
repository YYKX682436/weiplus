package h7;

/* loaded from: classes13.dex */
public class j extends n7.c {

    /* renamed from: g, reason: collision with root package name */
    public final android.os.Handler f279344g;

    /* renamed from: h, reason: collision with root package name */
    public final int f279345h;

    /* renamed from: i, reason: collision with root package name */
    public final long f279346i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Bitmap f279347m;

    public j(android.os.Handler handler, int i17, long j17) {
        this.f279344g = handler;
        this.f279345h = i17;
        this.f279346i = j17;
    }

    @Override // n7.h
    public void b(android.graphics.drawable.Drawable drawable) {
        this.f279347m = null;
    }

    @Override // n7.h
    public void c(java.lang.Object obj, o7.c cVar) {
        this.f279347m = (android.graphics.Bitmap) obj;
        android.os.Handler handler = this.f279344g;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f279346i);
    }
}
