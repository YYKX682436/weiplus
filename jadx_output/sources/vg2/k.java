package vg2;

/* loaded from: classes3.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.libpag.PAGFile f436531d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f436532e;

    public k(org.libpag.PAGFile pAGFile, com.tencent.mm.view.MMPAGView mMPAGView) {
        this.f436531d = pAGFile;
        this.f436532e = mMPAGView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.libpag.PAGFile pAGFile = this.f436531d;
        float width = pAGFile.width();
        float height = pAGFile.height();
        com.tencent.mm.view.MMPAGView mMPAGView = this.f436532e;
        int width2 = mMPAGView.getWidth();
        int height2 = mMPAGView.getHeight();
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        float f17 = width2 / width;
        if ((f17 == 0.0f) || java.lang.Float.isInfinite(f17) || java.lang.Float.isNaN(f17)) {
            f17 = 1.0f;
        }
        matrix.setTranslate(0.0f, height2 - height);
        matrix.preScale(f17, f17, 0.0f, height);
        mMPAGView.setComposition(pAGFile);
        mMPAGView.setPagMatrix(matrix);
        mMPAGView.g();
    }
}
