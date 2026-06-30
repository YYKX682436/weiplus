package r53;

/* loaded from: classes8.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f392681d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r53.q f392682e;

    public p(r53.q qVar, android.graphics.Bitmap bitmap) {
        this.f392682e = qVar;
        this.f392681d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.ImageView imageView = this.f392682e.f392685c;
        if (imageView != null) {
            imageView.setImageBitmap(this.f392681d);
        }
    }
}
