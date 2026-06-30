package ts0;

/* loaded from: classes10.dex */
public final class h implements android.hardware.Camera.PreviewCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ts0.l f421554d;

    public h(ts0.l lVar) {
        this.f421554d = lVar;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public final void onPreviewFrame(byte[] bArr, android.hardware.Camera camera) {
        ts0.l lVar = this.f421554d;
        if (bArr != null) {
            boolean z17 = true;
            if (!(bArr.length == 0) && lVar.f421561z != null) {
                lVar.getClass();
                java.util.List list = lVar.f421560y;
                if (list != null && ((java.util.ArrayList) list).size() > 0) {
                    android.graphics.Point point = lVar.f421537s;
                    if (point != null) {
                        ei3.x xVar = ei3.x.f253187d;
                        int i17 = lVar.f421529k.f232711c;
                        kotlin.jvm.internal.o.d(point);
                        byte[] m17 = xVar.m(java.lang.Integer.valueOf(((i17 * point.y) * 3) / 2));
                        lVar.E.a(1L);
                        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
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
                        lVar.F.a(android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
                        if (!lVar.f421525g) {
                            elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                            android.graphics.Point point8 = lVar.f421537s;
                            kotlin.jvm.internal.o.d(point8);
                            int i37 = point8.x;
                            android.graphics.Point point9 = lVar.f421537s;
                            kotlin.jvm.internal.o.d(point9);
                            int i38 = point9.y;
                            wo.h hVar = lVar.A;
                            kotlin.jvm.internal.o.d(hVar);
                            if (hVar.f447714b != 270) {
                                wo.h hVar2 = lVar.A;
                                kotlin.jvm.internal.o.d(hVar2);
                                if (hVar2.f447714b != 90) {
                                    z17 = false;
                                }
                            }
                            com.tencent.mm.plugin.sight.base.SightVideoJNI.mirrorCameraData(m17, i37, i38, z17);
                        }
                        boolean N = lVar.N(m17);
                        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
                        if (N) {
                            lVar.G.a(elapsedRealtime2);
                        }
                    } else {
                        if (!lVar.f421525g) {
                            di3.g0 g0Var2 = lVar.f421529k;
                            int i39 = g0Var2.f232711c;
                            int i47 = g0Var2.f232710b;
                            wo.h hVar3 = lVar.A;
                            kotlin.jvm.internal.o.d(hVar3);
                            if (hVar3.f447714b != 270) {
                                wo.h hVar4 = lVar.A;
                                kotlin.jvm.internal.o.d(hVar4);
                                if (hVar4.f447714b != 90) {
                                    z17 = false;
                                }
                            }
                            com.tencent.mm.plugin.sight.base.SightVideoJNI.mirrorCameraData(bArr, i39, i47, z17);
                        }
                        lVar.N(bArr);
                    }
                }
                lVar.getClass();
                wo.d1 d1Var = lVar.f421561z;
                kotlin.jvm.internal.o.d(d1Var);
                d1Var.a(bArr);
                return;
            }
        }
        com.tencent.mars.xlog.Log.e(lVar.f421558w, "onPreviewFrame, frame data is null!!");
    }
}
