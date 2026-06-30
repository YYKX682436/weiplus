package nt3;

/* loaded from: classes10.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nt3.a0 f339807d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ es0.d f339808e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(nt3.a0 a0Var, es0.d dVar) {
        super(2);
        this.f339807d = a0Var;
        this.f339808e = dVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yz5.a aVar;
        java.nio.Buffer buffer = (java.nio.Buffer) obj2;
        if (!((java.lang.Boolean) obj).booleanValue()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxFrameDrawFailed");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(986L, 19L, 1L);
        }
        nt3.a0 a0Var = this.f339807d;
        a0Var.f339709J++;
        com.tencent.mars.xlog.Log.i(a0Var.f339722m, "onFrameDraw, drawFrameCount:" + this.f339807d.f339709J + ", encodeFrameCount:" + this.f339807d.I + ", isDecodeEnd:" + this.f339807d.K);
        ls0.w0 w0Var = this.f339807d.B;
        if (w0Var != null && (aVar = w0Var.f320955o) != null) {
            ((ls0.t0) aVar).invoke();
        }
        nt3.a0 a0Var2 = this.f339807d;
        if (!a0Var2.f339720k) {
            gs0.b bVar = a0Var2.f339727r;
            if (bVar != null) {
                bVar.a(0L);
            }
        } else if (buffer != null) {
            gs0.r rVar = a0Var2.f339728s;
            if (rVar != null) {
                es0.d dVar = this.f339808e;
                int i17 = dVar.f256312b;
                int i18 = dVar.f256313c;
                if (rVar.f275011a < 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.X264TransEncoder", "writeRGBData error, buffId error");
                } else {
                    synchronized (rVar.f275016f) {
                        if (!rVar.f275014d && !rVar.f275015e) {
                            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                            com.tencent.mm.plugin.sight.base.SightVideoJNI.writeRGBDataForMMSight(rVar.f275011a, buffer, i17, i18, false, false, i17, i18);
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("writeRGBData ");
                            sb6.append(i17);
                            sb6.append(", ");
                            sb6.append(i18);
                            sb6.append(" cost ");
                            sb6.append(android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
                            sb6.append("ms, ");
                            int i19 = rVar.f275017g;
                            rVar.f275017g = i19 + 1;
                            sb6.append(i19);
                            com.tencent.mars.xlog.Log.i("MicroMsg.X264TransEncoder", sb6.toString());
                            if (!rVar.f275019i) {
                                ru5.i iVar = rVar.f275012b;
                                if (iVar != null) {
                                    iVar.h();
                                }
                                rVar.f275019i = true;
                            }
                        }
                        com.tencent.mars.xlog.Log.e("MicroMsg.X264TransEncoder", "writeRGBData, already stop or cancel, ignore");
                    }
                }
            }
            nt3.a0 a0Var3 = this.f339807d;
            a0Var3.I++;
            nt3.a0.e(a0Var3);
        } else {
            com.tencent.mars.xlog.Log.w(a0Var2.f339722m, "encode error, useX264Encode true but outputBuffer null");
        }
        nt3.k kVar = this.f339807d.f339726q;
        if (kVar != null) {
            kVar.d(false);
        }
        return jz5.f0.f302826a;
    }
}
