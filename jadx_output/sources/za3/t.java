package za3;

/* loaded from: classes15.dex */
public class t implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.PoiPoint f471022d;

    public t(com.tencent.mm.plugin.location.ui.PoiPoint poiPoint) {
        this.f471022d = poiPoint;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.tencent.mm.plugin.location.ui.PoiPoint poiPoint = this.f471022d;
        if (valueAnimator == poiPoint.f144639q) {
            int intValue = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
            com.tencent.mars.xlog.Log.i("MicroMsg.PoiPoint", "greenRadiusChangeAnim, val: %s.", java.lang.Integer.valueOf(intValue));
            poiPoint.f144634i = intValue;
        } else if (valueAnimator == poiPoint.f144640r) {
            int intValue2 = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
            com.tencent.mars.xlog.Log.i("MicroMsg.PoiPoint", "whiteRadiusChangeAnim, val: %s.", java.lang.Integer.valueOf(intValue2));
            poiPoint.f144636n = intValue2;
        } else if (valueAnimator == poiPoint.f144641s) {
            int intValue3 = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
            com.tencent.mars.xlog.Log.i("MicroMsg.PoiPoint", "greenLineChangeAnim, val: %s.", java.lang.Integer.valueOf(intValue3));
            poiPoint.f144638p = intValue3;
        }
        if (poiPoint.f144642t) {
            poiPoint.f144630e.updateMarkerView(poiPoint);
        }
    }
}
