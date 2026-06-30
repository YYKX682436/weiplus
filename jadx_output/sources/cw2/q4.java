package cw2;

/* loaded from: classes14.dex */
public final class q4 implements cw2.aa {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.FinderVideoFrameView f223949a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.xm f223950b;

    public q4(android.content.Context context, r45.mb4 media) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(media, "media");
        com.tencent.mm.plugin.finder.view.FinderVideoFrameView finderVideoFrameView = new com.tencent.mm.plugin.finder.view.FinderVideoFrameView(context);
        this.f223949a = finderVideoFrameView;
        java.lang.String string = media.getString(0);
        this.f223950b = new com.tencent.mm.plugin.finder.view.xm(string == null ? "" : string, finderVideoFrameView.getTextureView());
    }

    @Override // cw2.aa
    public void a(yz5.a onReady, yz5.a onDestroy, yz5.l onSeekFrame) {
        kotlin.jvm.internal.o.g(onReady, "onReady");
        kotlin.jvm.internal.o.g(onDestroy, "onDestroy");
        kotlin.jvm.internal.o.g(onSeekFrame, "onSeekFrame");
        try {
            this.f223950b.e(onReady, onDestroy, onSeekFrame);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("FinderNormalVideoCoverPreview", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // cw2.aa
    public void destroy() {
        com.tencent.mm.plugin.finder.view.xm xmVar = this.f223950b;
        xmVar.d();
        xmVar.a().g();
        xmVar.b().g();
        android.os.HandlerThread handlerThread = xmVar.f133349j;
        if (handlerThread == null) {
            kotlin.jvm.internal.o.o("ht");
            throw null;
        }
        handlerThread.quit();
        yz5.a aVar = xmVar.f133356q;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // cw2.aa
    public android.graphics.Bitmap getBitmap() {
        return this.f223949a.getTextureView().getBitmap();
    }

    @Override // cw2.aa
    public long getCurrentPositionMs() {
        return this.f223950b.f133351l;
    }

    @Override // cw2.aa
    public android.view.View getView() {
        return this.f223949a;
    }

    @Override // cw2.aa
    public void resume() {
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0083 A[Catch: all -> 0x0094, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x0025, B:8:0x002d, B:10:0x0033, B:11:0x007f, B:13:0x0083, B:15:0x0087, B:16:0x008a, B:17:0x008d, B:22:0x003b, B:24:0x004b, B:26:0x004f, B:27:0x0052, B:29:0x0056, B:30:0x0059), top: B:3:0x0007 }] */
    @Override // cw2.aa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void seekTo(long r14) {
        /*
            r13 = this;
            com.tencent.mm.plugin.finder.view.xm r0 = r13.f223950b
            java.lang.String r1 = "lxl change taget, start sync time:"
            java.lang.Object r2 = r0.f133343d
            monitor-enter(r2)
            r0.f133351l = r14     // Catch: java.lang.Throwable -> L94
            gp.c r3 = r0.b()     // Catch: java.lang.Throwable -> L94
            long r4 = r0.f133351l     // Catch: java.lang.Throwable -> L94
            r6 = 1000(0x3e8, float:1.401E-42)
            long r6 = (long) r6     // Catch: java.lang.Throwable -> L94
            long r4 = r4 * r6
            r8 = 0
            r3.h(r4, r8)     // Catch: java.lang.Throwable -> L94
            gp.c r3 = r0.b()     // Catch: java.lang.Throwable -> L94
            long r3 = r3.b()     // Catch: java.lang.Throwable -> L94
            long r9 = r0.f133352m     // Catch: java.lang.Throwable -> L94
            int r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r5 != 0) goto L3b
            long r9 = r0.f133353n     // Catch: java.lang.Throwable -> L94
            r11 = 0
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r5 < 0) goto L3b
            long r11 = r14 * r6
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r5 >= 0) goto L3b
            java.lang.String r14 = r0.f133342c     // Catch: java.lang.Throwable -> L94
            java.lang.String r15 = "lxl same taget~"
            com.tencent.mars.xlog.Log.i(r14, r15)     // Catch: java.lang.Throwable -> L94
            goto L7f
        L3b:
            r0.f133352m = r3     // Catch: java.lang.Throwable -> L94
            gp.c r3 = r0.a()     // Catch: java.lang.Throwable -> L94
            long r4 = r0.f133351l     // Catch: java.lang.Throwable -> L94
            long r4 = r4 * r6
            r3.h(r4, r8)     // Catch: java.lang.Throwable -> L94
            boolean r3 = r0.f133355p     // Catch: java.lang.Throwable -> L94
            if (r3 == 0) goto L59
            android.media.MediaCodec r3 = r0.f133346g     // Catch: java.lang.Throwable -> L94
            if (r3 == 0) goto L52
            r3.flush()     // Catch: java.lang.Throwable -> L94
        L52:
            android.media.MediaCodec r3 = r0.f133346g     // Catch: java.lang.Throwable -> L94
            if (r3 == 0) goto L59
            r3.start()     // Catch: java.lang.Throwable -> L94
        L59:
            java.lang.String r3 = r0.f133342c     // Catch: java.lang.Throwable -> L94
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L94
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L94
            long r8 = r0.f133352m     // Catch: java.lang.Throwable -> L94
            long r8 = r8 / r6
            r4.append(r8)     // Catch: java.lang.Throwable -> L94
            java.lang.String r1 = ", target time:"
            r4.append(r1)     // Catch: java.lang.Throwable -> L94
            r4.append(r14)     // Catch: java.lang.Throwable -> L94
            java.lang.String r14 = ", flush:"
            r4.append(r14)     // Catch: java.lang.Throwable -> L94
            boolean r14 = r0.f133355p     // Catch: java.lang.Throwable -> L94
            r4.append(r14)     // Catch: java.lang.Throwable -> L94
            java.lang.String r14 = r4.toString()     // Catch: java.lang.Throwable -> L94
            com.tencent.mars.xlog.Log.i(r3, r14)     // Catch: java.lang.Throwable -> L94
        L7f:
            boolean r14 = r0.f133355p     // Catch: java.lang.Throwable -> L94
            if (r14 != 0) goto L8d
            android.media.MediaCodec r14 = r0.f133346g     // Catch: java.lang.Throwable -> L94
            if (r14 == 0) goto L8a
            r14.start()     // Catch: java.lang.Throwable -> L94
        L8a:
            r14 = 1
            r0.f133355p = r14     // Catch: java.lang.Throwable -> L94
        L8d:
            java.lang.Object r14 = r0.f133343d     // Catch: java.lang.Throwable -> L94
            r14.notify()     // Catch: java.lang.Throwable -> L94
            monitor-exit(r2)
            return
        L94:
            r14 = move-exception
            monitor-exit(r2)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: cw2.q4.seekTo(long):void");
    }
}
