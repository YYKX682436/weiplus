package vr0;

/* loaded from: classes14.dex */
public final class b0 extends androidx.camera.core.MeteringPointFactory {

    /* renamed from: a, reason: collision with root package name */
    public final sr0.g f439449a = new sr0.g();

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Matrix f439450b = new android.graphics.Matrix();

    @Override // androidx.camera.core.MeteringPointFactory
    public android.graphics.PointF convertPoint(float f17, float f18) {
        sr0.g gVar = this.f439449a;
        float width = f17 / gVar.f411446d.width();
        float height = f18 / gVar.f411446d.height();
        float[] fArr = new float[2];
        this.f439450b.mapPoints(fArr, new float[]{width, height});
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraKitFocusHelper", "convertPoint origin:[" + width + ' ' + height + "] dest:[" + fArr[0] + ' ' + fArr[1] + ']');
        return new android.graphics.PointF(fArr[0], fArr[1]);
    }
}
