package ts0;

/* loaded from: classes10.dex */
public final class g implements android.hardware.Camera.PreviewCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ts0.l f421553d;

    public g(ts0.l lVar) {
        this.f421553d = lVar;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public final void onPreviewFrame(byte[] bArr, android.hardware.Camera camera) {
        android.graphics.Point point;
        ts0.l lVar = this.f421553d;
        if (bArr != null) {
            if (!(bArr.length == 0)) {
                if (((java.util.ArrayList) lVar.f421560y).size() <= 0) {
                    wo.d1 d1Var = lVar.f421561z;
                    if (d1Var != null) {
                        d1Var.a(bArr);
                        return;
                    }
                    return;
                }
                lVar.getClass();
                if (((java.util.ArrayList) lVar.f421560y).size() > 0 && (point = lVar.f421537s) != null) {
                    if (point != null && point.x == lVar.f421529k.f232711c) {
                        if (point != null && point.y == lVar.f421529k.f232710b) {
                            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                            boolean N = lVar.N(bArr);
                            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
                            if (N) {
                                lVar.G.a(elapsedRealtime2);
                            }
                            if (N) {
                                bArr = ei3.x.f253187d.m(java.lang.Integer.valueOf(bArr.length));
                            }
                        }
                    }
                    ei3.x xVar = ei3.x.f253187d;
                    int i17 = lVar.f421529k.f232711c;
                    kotlin.jvm.internal.o.d(point);
                    byte[] m17 = xVar.m(java.lang.Integer.valueOf(((i17 * point.y) * 3) / 2));
                    lVar.E.a(1L);
                    boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
                    di3.g0 g0Var = lVar.f421529k;
                    int i18 = g0Var.f232711c;
                    int i19 = g0Var.f232710b;
                    android.graphics.Point point2 = lVar.f421537s;
                    kotlin.jvm.internal.o.d(point2);
                    com.tencent.mm.plugin.sight.base.SightVideoJNI.cropCameraData(bArr, m17, i18, i19, point2.y);
                    android.graphics.Point point3 = lVar.f421537s;
                    kotlin.jvm.internal.o.d(point3);
                    if (point3.x < lVar.f421529k.f232711c) {
                        android.graphics.Point point4 = lVar.f421537s;
                        kotlin.jvm.internal.o.d(point4);
                        int i27 = point4.x;
                        android.graphics.Point point5 = lVar.f421537s;
                        kotlin.jvm.internal.o.d(point5);
                        byte[] m18 = xVar.m(java.lang.Integer.valueOf(((i27 * point5.y) * 3) / 2));
                        int i28 = lVar.f421529k.f232711c;
                        android.graphics.Point point6 = lVar.f421537s;
                        kotlin.jvm.internal.o.d(point6);
                        int i29 = point6.x;
                        android.graphics.Point point7 = lVar.f421537s;
                        kotlin.jvm.internal.o.d(point7);
                        com.tencent.mm.plugin.sight.base.SightVideoJNI.cropCameraDataLongEdge(m17, m18, i28, i29, point7.y);
                        xVar.o(m17);
                        m17 = m18;
                    }
                    lVar.F.a(android.os.SystemClock.elapsedRealtime() - elapsedRealtime3);
                    boolean N2 = lVar.N(m17);
                    long elapsedRealtime4 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime3;
                    if (N2) {
                        lVar.G.a(elapsedRealtime4);
                    }
                }
                wo.d1 d1Var2 = lVar.f421561z;
                if (d1Var2 != null) {
                    d1Var2.a(bArr);
                    return;
                }
                return;
            }
        }
        com.tencent.mars.xlog.Log.e(lVar.f421558w, "onPreviewFrame, frame data is null!!");
    }
}
