package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes10.dex */
public class q implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar f149073d;

    public q(com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar recyclerThumbSeekBar) {
        this.f149073d = recyclerThumbSeekBar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object call() {
        /*
            r5 = this;
            com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar r0 = r5.f149073d
            java.lang.String r1 = r0.f148872d
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.K0(r1)
            if (r1 != 0) goto L69
            java.lang.String r1 = r0.f148872d
            boolean r1 = com.tencent.mm.vfs.w6.j(r1)
            if (r1 == 0) goto L69
            java.lang.String r1 = r0.f148872d
            boolean r1 = com.tencent.mm.modelvideoh265toh264.j.h(r1)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "RecyclerThumbSeekBar"
            java.lang.String r4 = "get thumb fetcher, ish265: %s"
            com.tencent.mars.xlog.Log.i(r3, r4, r2)
            if (r1 != 0) goto L55
            java.lang.String r1 = r0.f148872d
            r2 = 1
            com.tencent.mm.plugin.sight.base.b r1 = com.tencent.mm.plugin.sight.base.e.d(r1, r2)
            java.lang.Class<e42.e0> r2 = e42.e0.class
            i95.m r2 = i95.n0.c(r2)
            e42.e0 r2 = (e42.e0) r2
            e42.d0 r3 = e42.d0.clicfg_use_ffmpeg_frame_retriever
            r4 = 0
            h62.d r2 = (h62.d) r2
            boolean r2 = r2.fj(r3, r4)
            if (r1 == 0) goto L55
            int r3 = r1.f162384c
            r4 = 2000(0x7d0, float:2.803E-42)
            if (r3 >= r4) goto L55
            int r1 = r1.f162385d
            if (r1 >= r4) goto L55
            if (r2 == 0) goto L55
            com.tencent.mm.plugin.mmsight.segment.FFmpegSightJNIThumbFetcher r1 = new com.tencent.mm.plugin.mmsight.segment.FFmpegSightJNIThumbFetcher
            r1.<init>()
            goto L56
        L55:
            r1 = 0
        L56:
            if (r1 != 0) goto L5d
            com.tencent.mm.plugin.mmsight.segment.p r1 = new com.tencent.mm.plugin.mmsight.segment.p
            r1.<init>()
        L5d:
            java.lang.String r2 = r0.f148872d
            int r3 = r0.f148873e
            int r4 = r0.f148876h
            int r0 = r0.f148875g
            r1.init(r2, r3, r4, r0)
            return r1
        L69:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "create thumb fetcher error, file not exist"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.mmsight.segment.q.call():java.lang.Object");
    }
}
