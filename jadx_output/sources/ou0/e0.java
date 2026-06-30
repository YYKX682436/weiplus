package ou0;

/* loaded from: classes5.dex */
public abstract class e0 {
    public static final void a(ex0.f fVar, gx0.bf playbackControlUIC, gx0.kh timelineUIC, android.util.SizeF videoContainerSizeF) {
        android.graphics.PointF pointF;
        kotlin.jvm.internal.o.g(fVar, "<this>");
        kotlin.jvm.internal.o.g(playbackControlUIC, "playbackControlUIC");
        kotlin.jvm.internal.o.g(timelineUIC, "timelineUIC");
        kotlin.jvm.internal.o.g(videoContainerSizeF, "videoContainerSizeF");
        com.tencent.maas.moviecomposing.PlaybackSession k76 = playbackControlUIC.k7();
        if (k76 == null) {
            return;
        }
        com.tencent.maas.moviecomposing.Timeline o76 = timelineUIC.o7();
        boolean z17 = false;
        if (o76 != null) {
            if (o76.q() >= 1.0d) {
                z17 = true;
            }
        }
        float width = videoContainerSizeF.getWidth();
        float height = videoContainerSizeF.getHeight();
        if (z17) {
            android.graphics.PointF v17 = fVar.v();
            pointF = new android.graphics.PointF(width * v17.x, height * v17.y);
        } else {
            android.graphics.PointF w17 = fVar.w();
            pointF = new android.graphics.PointF(width * w17.x, height * w17.y);
        }
        android.graphics.PointF calcRenderCoord = k76.calcRenderCoord(pointF);
        kotlin.jvm.internal.o.f(calcRenderCoord, "calcRenderCoord(...)");
        fVar.r(calcRenderCoord);
        fVar.t(z17 ? new android.graphics.PointF(0.865f, 0.865f) : new android.graphics.PointF(1.0f, 1.0f));
    }
}
