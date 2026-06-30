package di3;

/* loaded from: classes10.dex */
public class j implements android.hardware.Camera.PreviewCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ di3.n f232724d;

    public j(di3.n nVar) {
        this.f232724d = nVar;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, android.hardware.Camera camera) {
        byte[] bArr2;
        java.util.List list;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6 = bArr;
        di3.n nVar = this.f232724d;
        boolean z17 = true;
        if (!nVar.B) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCamera", "onPreviewFrame: %s %s", bArr6, nVar.f232741h);
            this.f232724d.B = true;
        }
        if (bArr6 == null || bArr6.length <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSightCamera", "onPreviewFrame, frame data is null!!");
            return;
        }
        xp1.a aVar = this.f232724d.f232756z;
        if (aVar.f455870c == 0) {
            aVar.f455869b++;
            aVar.f455868a = com.tencent.mm.sdk.platformtools.t8.D1(wo.r.d(), 0);
        }
        int i17 = aVar.f455870c + 1;
        aVar.f455870c = i17;
        if (i17 >= 90) {
            i17 = 0;
        }
        aVar.f455870c = i17;
        if (this.f232724d.L || (list = this.f232724d.A) == null || ((java.util.ArrayList) list).size() <= 0) {
            bArr2 = bArr6;
        } else {
            di3.n nVar2 = this.f232724d;
            android.graphics.Point point = nVar2.f232753w;
            if (point != null) {
                ei3.x xVar = ei3.x.f253187d;
                byte[] m17 = xVar.m(java.lang.Integer.valueOf(((nVar2.f232739f.f232711c * point.y) * 3) / 2));
                this.f232724d.F.a(1L);
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                di3.n nVar3 = this.f232724d;
                di3.g0 g0Var = nVar3.f232739f;
                com.tencent.mm.plugin.sight.base.SightVideoJNI.cropCameraData(bArr6, m17, g0Var.f232711c, g0Var.f232710b, nVar3.f232753w.y);
                di3.n nVar4 = this.f232724d;
                android.graphics.Point point2 = nVar4.f232753w;
                int i18 = point2.x;
                if (i18 < nVar4.f232739f.f232711c) {
                    byte[] m18 = xVar.m(java.lang.Integer.valueOf(((i18 * point2.y) * 3) / 2));
                    di3.n nVar5 = this.f232724d;
                    int i19 = nVar5.f232739f.f232711c;
                    android.graphics.Point point3 = nVar5.f232753w;
                    com.tencent.mm.plugin.sight.base.SightVideoJNI.cropCameraDataLongEdge(m17, m18, i19, point3.x, point3.y);
                    xVar.o(m17);
                    m17 = m18;
                }
                this.f232724d.G.a(android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
                if (!this.f232724d.Q) {
                    elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                    di3.n nVar6 = this.f232724d;
                    android.graphics.Point point4 = nVar6.f232753w;
                    int i27 = point4.x;
                    int i28 = point4.y;
                    int i29 = nVar6.f232744n.f447714b;
                    if (i29 != 270 && i29 != 90) {
                        z17 = false;
                    }
                    com.tencent.mm.plugin.sight.base.SightVideoJNI.mirrorCameraData(m17, i27, i28, z17);
                    this.f232724d.H.a(android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
                }
                boolean a17 = di3.n.a(this.f232724d, m17);
                long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
                if (a17) {
                    this.f232724d.I.a(elapsedRealtime2);
                }
                byte[] bArr7 = m17;
                bArr2 = bArr6;
                bArr6 = bArr7;
            } else {
                boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
                di3.n nVar7 = this.f232724d;
                if (!nVar7.Q) {
                    di3.g0 g0Var2 = nVar7.f232739f;
                    int i37 = g0Var2.f232711c;
                    int i38 = g0Var2.f232710b;
                    int i39 = nVar7.f232744n.f447714b;
                    if (i39 != 270 && i39 != 90) {
                        z17 = false;
                    }
                    com.tencent.mm.plugin.sight.base.SightVideoJNI.mirrorCameraData(bArr6, i37, i38, z17);
                    this.f232724d.H.a(android.os.SystemClock.elapsedRealtime() - elapsedRealtime3);
                }
                di3.n nVar8 = this.f232724d;
                if (!nVar8.f232755y || (bArr5 = nVar8.f232754x) == null) {
                    bArr3 = bArr6;
                } else {
                    android.graphics.Point point5 = nVar8.f232752v;
                    com.tencent.mm.plugin.sight.base.SightVideoJNI.paddingYuvData16(bArr6, bArr5, point5.x, nVar8.f232751u.y, point5.y);
                    bArr3 = this.f232724d.f232754x;
                }
                boolean a18 = di3.n.a(this.f232724d, bArr3);
                long elapsedRealtime4 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime3;
                if (a18) {
                    this.f232724d.I.a(elapsedRealtime4);
                }
                di3.n nVar9 = this.f232724d;
                if ((!nVar9.f232755y || nVar9.f232754x == null) && a18) {
                    bArr6 = ei3.x.f253187d.m(java.lang.Integer.valueOf(bArr6.length));
                }
                di3.n nVar10 = this.f232724d;
                if (nVar10.f232755y && (bArr4 = nVar10.f232754x) != null) {
                    if (a18) {
                        bArr4 = ei3.x.f253187d.m(java.lang.Integer.valueOf(bArr4.length));
                    }
                    nVar10.f232754x = bArr4;
                }
                bArr2 = bArr6;
                bArr6 = bArr3;
            }
        }
        this.f232724d.K = bArr6;
        di3.n nVar11 = this.f232724d;
        di3.l lVar = nVar11.C;
        if (lVar == di3.l.Preview) {
            nVar11.E.a(1L);
        } else if (lVar == di3.l.Recording) {
            nVar11.D.a(1L);
        }
        this.f232724d.f232741h.a(bArr2);
    }
}
