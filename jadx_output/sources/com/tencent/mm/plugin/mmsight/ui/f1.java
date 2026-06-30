package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class f1 implements ls0.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f149326a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f149327b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sight.base.b f149328c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.l1 f149329d;

    public f1(com.tencent.mm.plugin.mmsight.ui.l1 l1Var, java.lang.String str, long j17, com.tencent.mm.plugin.sight.base.b bVar) {
        this.f149329d = l1Var;
        this.f149326a = str;
        this.f149327b = j17;
        this.f149328c = bVar;
    }

    @Override // ls0.m
    public void b(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightVideoEditor", "mediaCodecRemuxer remux onFinish");
        java.lang.Object obj = com.tencent.mm.plugin.mmsight.ui.a2.D;
        synchronized (obj) {
            int i17 = 0;
            try {
                obj.notifyAll();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMSightVideoEditor", e17, "wait mediaCodecRemuxer error", new java.lang.Object[0]);
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.mmsight.ui.d1(this));
                com.tencent.mm.plugin.mmsight.segment.h1.a(this.f149329d.f149361e.f149277m.a());
                return;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f149329d.f149361e.f149287w)) {
                com.tencent.mm.vfs.w6.w(this.f149326a, str);
            }
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.f149327b;
            boolean z17 = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightVideoEditor", "doRemuxVideo used %sms", java.lang.Long.valueOf(elapsedRealtime));
            com.tencent.mm.plugin.mmsight.segment.h1.b(1, elapsedRealtime);
            this.f149329d.f149361e.A = com.tencent.mm.vfs.w6.p(str);
            com.tencent.mm.plugin.mmsight.ui.a2 a2Var = this.f149329d.f149361e;
            gi3.b bVar = a2Var.f149290z;
            int i18 = a2Var.f149268d;
            if (i18 < 0 || a2Var.f149269e <= 0) {
                z17 = false;
            }
            bVar.f272282g = z17;
            bVar.f272279d = a2Var.f149269e - i18;
            com.tencent.mm.plugin.sight.base.b bVar2 = this.f149328c;
            if (bVar2 != null) {
                i17 = bVar2.f162382a;
            }
            bVar.f272278c = i17;
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.mmsight.ui.e1(this));
        }
    }
}
