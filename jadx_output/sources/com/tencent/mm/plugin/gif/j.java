package com.tencent.mm.plugin.gif;

/* loaded from: classes15.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gif.k f142135d;

    public j(com.tencent.mm.plugin.gif.k kVar) {
        this.f142135d = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f142135d.f142139f == 0) {
            return;
        }
        if (this.f142135d.f142138e) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GIF.MMGIFDrawable", "This gif had been recycle.");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.gif.k kVar = this.f142135d;
        if (kVar.f142150t + 1 > kVar.f142149s - 1) {
            kVar.f142150t = -1;
        }
        kVar.f142150t++;
        com.tencent.mm.feature.emoji.api.IGIFJNIService iGIFJNIService = (com.tencent.mm.feature.emoji.api.IGIFJNIService) i95.n0.c(com.tencent.mm.feature.emoji.api.IGIFJNIService.class);
        long j17 = this.f142135d.f142139f;
        com.tencent.mm.plugin.gif.k kVar2 = this.f142135d;
        boolean drawFramePixels = iGIFJNIService.drawFramePixels(j17, kVar2.f142146p, kVar2.f142140g);
        com.tencent.mm.plugin.gif.k kVar3 = this.f142135d;
        boolean z17 = !kVar3.f142148r;
        kVar3.f142148r = true;
        if (drawFramePixels) {
            kVar3.E++;
            ((com.tencent.mm.feature.emoji.api.IGIFJNIService) i95.n0.c(com.tencent.mm.feature.emoji.api.IGIFJNIService.class)).reset(this.f142135d.f142139f);
        }
        this.f142135d.f142152v = java.lang.System.currentTimeMillis() - currentTimeMillis;
        com.tencent.mm.plugin.gif.k kVar4 = this.f142135d;
        long j18 = kVar4.f142153w;
        if (j18 != 0) {
            long j19 = (j18 - kVar4.f142152v) - kVar4.f142156z;
            kVar4.f142154x = j19;
            if (j19 < 0) {
                int i17 = kVar4.f142140g[5];
                jx3.f fVar = jx3.f.INSTANCE;
                fVar.idkeyStat(401L, 0L, 1L, false);
                fVar.idkeyStat(401L, 1L, java.lang.Math.abs(this.f142135d.f142154x), false);
                if (this.f142135d.f142154x < -100) {
                    com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().stopPerformance(com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifEnable() || com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifFrameEnable(), this.f142135d.G);
                    this.f142135d.G = com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().startPerformance(com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifFrameEnable(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifFrameDelay(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifFrameCPU(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifFrameIO(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifFrameThr() ? android.os.Process.myTid() : 0, com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifFrameTimeout(), 602, com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifFrameAction(), "MicroMsg.GIF.MMGIFDrawable");
                }
            }
        }
        if (z17) {
            com.tencent.mm.plugin.gif.k kVar5 = this.f142135d;
            java.lang.Runnable runnable = kVar5.L;
            kVar5.A = android.os.SystemClock.uptimeMillis();
            if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
                ((com.tencent.mm.plugin.gif.f) runnable).run();
            } else {
                com.tencent.mm.sdk.platformtools.o3 o3Var = kVar5.H;
                if (o3Var != null) {
                    o3Var.d(runnable);
                }
            }
        } else {
            com.tencent.mm.plugin.gif.k kVar6 = this.f142135d;
            java.lang.Runnable runnable2 = kVar6.L;
            long j27 = kVar6.f142154x;
            kVar6.g(runnable2, j27 > 0 ? j27 : 0L);
        }
        com.tencent.mm.plugin.gif.k kVar7 = this.f142135d;
        if (kVar7.f142140g[2] == 1) {
            kVar7.f142153w = 5000L;
        } else {
            kVar7.f142153w = r2[4];
        }
    }
}
