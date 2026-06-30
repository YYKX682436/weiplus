package xq5;

/* loaded from: classes15.dex */
public final class a implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.zoomimage.ZoomImageView f456123d;

    public a(com.tencent.mm.zoomimage.ZoomImageView zoomImageView) {
        this.f456123d = zoomImageView;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        zq5.v vVar = (zq5.v) obj;
        com.tencent.mm.zoomimage.ZoomImageView zoomImageView = this.f456123d;
        long j17 = ((zq5.g) ((kotlinx.coroutines.flow.h3) zoomImageView.getZoomable().f256254o).getValue()).f475067a;
        android.graphics.Matrix matrix = zoomImageView.f214900n;
        dr5.c.a(matrix, vVar, j17, false, 4, null);
        super/*android.widget.ImageView*/.setImageMatrix(matrix);
        fr5.q qVar = zoomImageView.f214902p;
        if (qVar != null) {
            qVar.f266015f.setAlpha(qVar.f266013d);
            fr5.j jVar = qVar.f266017h;
            jVar.a();
            if (!jVar.f265976j) {
                jVar.f265976j = true;
                long j18 = 800;
                jVar.f265975i = java.lang.System.currentTimeMillis() + j18;
                jVar.f265967a.postDelayed(jVar.f265974h, j18);
            }
        }
        return jz5.f0.f302826a;
    }
}
