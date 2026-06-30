package kd2;

/* loaded from: classes8.dex */
public final class a0 extends dp1.u {

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Bitmap f306706m;

    @Override // dp1.u, dp1.x
    public android.graphics.Bitmap getBitmap() {
        android.graphics.Bitmap bitmap = this.f306706m;
        if (bitmap != null) {
            return bitmap;
        }
        android.graphics.Bitmap bitmap2 = super.getBitmap();
        kotlin.jvm.internal.o.f(bitmap2, "getBitmap(...)");
        return bitmap2;
    }

    @Override // dp1.u, dp1.x
    public void q(boolean z17) {
        super.q(z17);
        this.f306706m = null;
    }
}
