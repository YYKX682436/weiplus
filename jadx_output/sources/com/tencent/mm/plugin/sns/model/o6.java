package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public final class o6 implements n55.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.z f164550a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f164551b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f164552c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f164553d;

    public o6(com.tencent.mm.plugin.sns.model.z zVar, int i17, int i18, boolean z17) {
        this.f164550a = zVar;
        this.f164551b = i17;
        this.f164552c = i18;
        this.f164553d = z17;
    }

    @Override // n55.e
    public void a(o55.a aVar) {
        byte[] bArr;
        ec4.j b17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler$checkFakeVideoIsError$getBackgroundVideoCallback$1");
        com.tencent.mm.plugin.sns.model.z zVar = this.f164550a;
        if (aVar != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("info workType >> ");
            sb6.append(aVar.f343162a);
            sb6.append(", confirmRemuxTime: ");
            long j17 = aVar.f343164c;
            sb6.append(j17);
            sb6.append(", muxCode: ");
            int i17 = aVar.f343167f;
            sb6.append(i17);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsTimeLineFakeViewHandler", sb6.toString());
            boolean z17 = j17 > 0 && java.lang.System.currentTimeMillis() - j17 > 180000;
            boolean z18 = j17 > 0 && java.lang.System.currentTimeMillis() - j17 > 600000;
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsTimeLineFakeViewHandler", "time check: " + z17 + ", timeOut: " + z18);
            int i18 = this.f164551b;
            if (i17 == 0 && z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsTimeLineFakeViewHandler", "checkFakeVideoIsError >> remux success");
                ((com.tencent.mm.plugin.sns.model.r7$$a) zVar).a(false);
                ((wp4.x) ((n55.f) i95.n0.c(n55.f.class))).Ai(aVar.f343163b, aVar.f343164c, aVar.f343168g, aVar.f343167f);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$checkToCommit", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkToCommit", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsTimeLineFakeViewHandler", "checkToCommit");
                java.lang.String str = aVar.f343165d;
                if (com.tencent.mm.vfs.w6.j(str) && (bArr = aVar.f343170i) != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsTimeLineFakeViewHandler", "go to commit");
                    ec4.j d17 = new ec4.j().d(i18, bArr);
                    if (d17 != null && (b17 = d17.b(str, aVar.f343166e)) != null) {
                        b17.c();
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkToCommit", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$checkToCommit", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler$checkFakeVideoIsError$getBackgroundVideoCallback$1");
                return;
            }
            if (i17 == 1002 && z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsTimeLineFakeViewHandler", "checkFakeVideoIsError >> remux error");
                ((com.tencent.mm.plugin.sns.model.r7$$a) zVar).a(true);
                ((wp4.x) ((n55.f) i95.n0.c(n55.f.class))).Ai(aVar.f343163b, aVar.f343164c, aVar.f343168g, aVar.f343167f);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler$checkFakeVideoIsError$getBackgroundVideoCallback$1");
                return;
            }
            if (z18) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsTimeLineFakeViewHandler", "checkFakeVideoIsError >> isTimeOut");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateWorkTimeOut", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
                int i19 = this.f164552c;
                if (this.f164553d) {
                    yy0.g8 g8Var = (yy0.g8) ((pp0.o0) i95.n0.c(pp0.o0.class));
                    g8Var.getClass();
                    com.tencent.mars.xlog.Log.i(g8Var.f468112d, "updateWorkTimeOut >> snsLocalId: " + i18 + ", createTime: " + i19);
                    kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), kotlinx.coroutines.q1.f310570c, null, new yy0.c8(i18, i19, g8Var, null), 2, null);
                } else {
                    wp4.x xVar = (wp4.x) ((n55.f) i95.n0.c(n55.f.class));
                    xVar.getClass();
                    com.tencent.mars.xlog.Log.i(xVar.f448453d, "updateWorkTimeOut >> snsLocalId: " + i18 + ", createTime: " + i19);
                    kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), kotlinx.coroutines.q1.f310570c, null, new wp4.t(i18, i19, xVar, null), 2, null);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateWorkTimeOut", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
            }
            ((com.tencent.mm.plugin.sns.model.r7$$a) zVar).a(z18);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsTimeLineFakeViewHandler", "checkFakeVideoIsError >> is null");
            ((com.tencent.mm.plugin.sns.model.r7$$a) zVar).a(true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler$checkFakeVideoIsError$getBackgroundVideoCallback$1");
    }
}
