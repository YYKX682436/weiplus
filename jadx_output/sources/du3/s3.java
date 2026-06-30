package du3;

/* loaded from: classes10.dex */
public final class s3 implements qk.p7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f243704a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ du3.t3 f243705b;

    public s3(yz5.l lVar, du3.t3 t3Var) {
        this.f243704a = lVar;
        this.f243705b = t3Var;
    }

    @Override // qk.p7
    public void a(android.graphics.Bitmap bitmap, boolean z17) {
        int min;
        du3.t3 t3Var = this.f243705b;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = t3Var.f243724n;
        int i17 = recordConfigProvider != null ? recordConfigProvider.f155671f : 1920;
        if (bitmap != null && i17 > 0 && (min = java.lang.Math.min(bitmap.getWidth(), bitmap.getHeight())) > i17) {
            float f17 = (i17 * 1.0f) / min;
            bitmap = com.tencent.mm.sdk.platformtools.x.F0(bitmap, f17, f17, true);
        }
        android.graphics.Bitmap.CompressFormat compressFormat = android.graphics.Bitmap.CompressFormat.JPEG;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider2 = t3Var.f243724n;
        com.tencent.mm.sdk.platformtools.x.D0(bitmap, 100, compressFormat, recordConfigProvider2 != null ? recordConfigProvider2.E : null, true);
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider3 = t3Var.f243724n;
        java.lang.String str = recordConfigProvider3 != null ? recordConfigProvider3.E : null;
        if (str == null) {
            str = "";
        }
        this.f243704a.invoke(str);
    }

    @Override // qk.p7
    public void onError(java.lang.Exception exc) {
        this.f243704a.invoke("");
    }
}
