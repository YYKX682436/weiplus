package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes4.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.story.b1 f145897d;

    public n0(com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager envelopeStoryVideoManager, com.tencent.mm.plugin.luckymoney.story.b1 b1Var) {
        this.f145897d = b1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if (r1.f354447j == 4) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
    
        if (r1.f71651y1 == 4) goto L15;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r10 = this;
            com.tencent.mm.plugin.luckymoney.story.b1 r0 = r10.f145897d
            boolean r1 = r0.f145825e
            java.lang.String r2 = "MicroMsg.EnvelopeStoryVideoManager"
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L4a
            com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoView r1 = r0.f145833m
            com.tencent.mm.pluginsdk.ui.tools.f4 r6 = r1.f189748q
            boolean r7 = r6 instanceof com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView
            r8 = 0
            r9 = 4
            if (r7 == 0) goto L24
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView r6 = (com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView) r6
            ph3.k r1 = r6.f191450m
            if (r1 == 0) goto L31
            ph3.o r1 = r1.f354428f
            if (r1 == 0) goto L31
            int r1 = r1.f354447j
            if (r1 != r9) goto L31
            goto L30
        L24:
            java.lang.String r6 = "MicroMsg.EnvelopeStoryVideoView"
            java.lang.String r7 = "videoview not VideoPlayerTextureView"
            com.tencent.mars.xlog.Log.e(r6, r7)
            int r1 = r1.f71651y1
            if (r1 != r9) goto L31
        L30:
            r8 = r3
        L31:
            if (r8 == 0) goto L4a
            java.lang.String r1 = "resume success, keep play"
            com.tencent.mars.xlog.Log.w(r2, r1)
            com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoView r1 = r0.f145833m
            r1.g()
            com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoView r1 = r0.f145833m
            int r1 = r1.getCurrPosSec()
            long r1 = (long) r1
            r0.f145830j = r1
            r0.f145831k = r4
            goto L66
        L4a:
            com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoView r1 = r0.f145833m
            boolean r1 = r1.isPlaying()
            if (r1 == 0) goto L66
            java.lang.String r1 = "resume fail, restart play"
            com.tencent.mars.xlog.Log.w(r2, r1)
            com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoView r1 = r0.f145833m
            r1.stop()
            com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoView r1 = r0.f145833m
            r1.start()
            r0.f145830j = r4
            r0.f145831k = r4
        L66:
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f145832l
            r0.set(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.story.n0.run():void");
    }
}
