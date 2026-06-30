package kp3;

/* loaded from: classes12.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kp3.p0 f311008d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f311009e;

    public l0(kp3.p0 p0Var, android.graphics.Bitmap bitmap) {
        this.f311008d = p0Var;
        this.f311009e = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kp3.p0 p0Var = this.f311008d;
        android.widget.ImageView imageView = p0Var.f311027m;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("finishBlurIv");
            throw null;
        }
        imageView.setImageBitmap(this.f311009e);
        android.widget.ImageView imageView2 = p0Var.f311027m;
        if (imageView2 == null) {
            kotlin.jvm.internal.o.o("finishBlurIv");
            throw null;
        }
        imageView2.setVisibility(0);
        androidx.appcompat.app.AppCompatActivity activity = p0Var.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitRecordViewLayout cameraKitRecordViewLayout = ((kp3.x) pf5.z.f353948a.a(activity).a(kp3.x.class)).f311051g;
        if (cameraKitRecordViewLayout == null) {
            return;
        }
        cameraKitRecordViewLayout.setVisibility(4);
    }
}
