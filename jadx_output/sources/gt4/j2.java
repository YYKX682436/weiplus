package gt4;

/* loaded from: classes9.dex */
public class j2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f275461d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gt4.k2 f275462e;

    public j2(gt4.k2 k2Var, android.graphics.Bitmap bitmap) {
        this.f275462e = k2Var;
        this.f275461d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        gt4.k2 k2Var = this.f275462e;
        k2Var.f275465a.f180738m.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        k2Var.f275465a.f180738m.setImageBitmap(this.f275461d);
    }
}
