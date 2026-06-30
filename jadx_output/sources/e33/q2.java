package e33;

/* loaded from: classes10.dex */
public class q2 implements rj0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e33.u2 f247440a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f247441b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f247442c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f247443d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e33.v2 f247444e;

    public q2(e33.v2 v2Var, e33.u2 u2Var, android.graphics.Bitmap bitmap, java.lang.String str, int i17) {
        this.f247444e = v2Var;
        this.f247440a = u2Var;
        this.f247441b = bitmap;
        this.f247442c = str;
        this.f247443d = i17;
    }

    @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener
    public void onImageLoadError(com.davemorrissey.labs.subscaleview.decoder.ImageDecodeResult imageDecodeResult) {
        rq5.b.a(imageDecodeResult.errCode);
        if (imageDecodeResult.errCode == 4) {
            android.graphics.Bitmap bitmap = this.f247441b;
            e33.v2 v2Var = this.f247444e;
            e33.u2 u2Var = this.f247440a;
            v2Var.q(u2Var, bitmap);
            java.util.HashSet hashSet = v2Var.f247504o;
            java.lang.String str = this.f247442c;
            if (hashSet.contains(str)) {
                return;
            }
            v2Var.f247504o.add(str);
            u2Var.f247484b.setTag(u2Var);
            v2Var.B.b(u2Var.f247484b, str, this.f247443d);
        }
    }

    @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener
    public void onImageLoaded(android.graphics.Bitmap bitmap) {
    }

    @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener
    public void onPreviewLoadError(com.davemorrissey.labs.subscaleview.decoder.ImageDecodeResult imageDecodeResult) {
    }

    @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener
    public void onPreviewLoaded() {
    }

    @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener
    public void onPreviewReleased() {
    }

    @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener
    public void onReady() {
    }

    @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener
    public void onTileLoadError(com.davemorrissey.labs.subscaleview.decoder.ImageDecodeResult imageDecodeResult) {
    }
}
