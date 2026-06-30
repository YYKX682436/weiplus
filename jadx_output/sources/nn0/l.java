package nn0;

/* loaded from: classes14.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nn0.m f338591d;

    public l(nn0.m mVar) {
        this.f338591d = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        int i18;
        nn0.m mVar = this.f338591d;
        int i19 = mVar.f338596e;
        int i27 = mVar.f338597f;
        android.view.TextureView textureView = mVar.f338592a;
        if (textureView != null && i19 != 0 && i27 != 0 && (i17 = mVar.f338594c) != 0 && (i18 = mVar.f338595d) != 0) {
            double d17 = i27 / i19;
            int i28 = (int) (i17 * d17);
            if (i18 > i28) {
                mVar.f338598g = i17;
                mVar.f338599h = i28;
            } else {
                mVar.f338598g = (int) (i18 / d17);
                mVar.f338599h = i18;
            }
            int i29 = mVar.f338598g;
            float f17 = (i17 - i29) / 2.0f;
            float f18 = (i18 - r7) / 2.0f;
            float f19 = i29 / i17;
            float f27 = mVar.f338599h / i18;
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            textureView.getTransform(matrix);
            matrix.setScale(f19, f27);
            matrix.postTranslate(f17, f18);
            textureView.setTransform(matrix);
            textureView.requestLayout();
        }
        mVar.c(mVar.f338600i);
        mVar.e(mVar.f338601j);
    }
}
