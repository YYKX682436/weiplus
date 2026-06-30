package zl1;

/* loaded from: classes7.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f473587d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f473588e;

    public f(zl1.t tVar, android.widget.ImageView imageView, android.graphics.Bitmap bitmap) {
        this.f473587d = imageView;
        this.f473588e = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f473587d.setImageBitmap(this.f473588e);
    }
}
