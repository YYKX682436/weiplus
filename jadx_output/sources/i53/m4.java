package i53;

/* loaded from: classes8.dex */
public class m4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f288663d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f288664e;

    public m4(i53.n4 n4Var, android.widget.ImageView imageView, android.graphics.Bitmap bitmap) {
        this.f288663d = imageView;
        this.f288664e = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f288663d.setImageBitmap(this.f288664e);
    }
}
