package ok;

/* loaded from: classes10.dex */
public class k implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ok.m f345939d;

    public k(ok.m mVar) {
        this.f345939d = mVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue("deltaY")).floatValue();
        float floatValue2 = ((java.lang.Float) valueAnimator.getAnimatedValue("deltaX")).floatValue();
        ok.m mVar = this.f345939d;
        float f17 = mVar.f345946h;
        dl.y yVar = mVar.f345941c;
        float f18 = floatValue2 - mVar.f345947i;
        float f19 = floatValue - mVar.f345946h;
        java.lang.String str = mVar.f345943e;
        um.g gVar = (um.g) yVar.d();
        if (gVar != null) {
            java.util.ListIterator f27 = gVar.f();
            while (true) {
                if (!f27.hasPrevious()) {
                    break;
                }
                xk0.f fVar = (xk0.f) f27.previous();
                if (fVar.q().equals(str)) {
                    fVar.y(f18, f19, fVar.f454957o, fVar.f454956n);
                    yVar.r();
                    break;
                }
            }
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.EmojiAndTextArtist", "cache is null!");
        }
        mVar.f345946h = floatValue;
        mVar.f345947i = floatValue2;
    }
}
