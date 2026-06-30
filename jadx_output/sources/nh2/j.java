package nh2;

/* loaded from: classes10.dex */
public final class j implements nh2.c, android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final ah2.f f337114d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.TextureView f337115e;

    /* renamed from: f, reason: collision with root package name */
    public nh2.b f337116f;

    public j(android.view.TextureView textureView, ah2.f fVar) {
        this.f337114d = fVar;
        this.f337115e = textureView;
        if (textureView != null) {
            textureView.setOpaque(false);
        }
        if (textureView == null) {
            return;
        }
        textureView.setSurfaceTextureListener(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        if (r7.h() == true) goto L23;
     */
    @Override // nh2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(nh2.b r7) {
        /*
            r6 = this;
            r6.f337116f = r7
            ah2.f r7 = r6.f337114d
            boolean r0 = r7 instanceof fi2.e0
            r1 = 0
            if (r0 == 0) goto Ld
            r0 = r7
            fi2.e0 r0 = (fi2.e0) r0
            goto Le
        Ld:
            r0 = r1
        Le:
            r2 = 0
            if (r0 == 0) goto L22
            com.tencent.mm.plugin.finder.feed.y20 r0 = r0.f262817b
            if (r0 == 0) goto L22
            com.tencent.mm.plugin.finder.feed.df r0 = (com.tencent.mm.plugin.finder.feed.df) r0
            com.tencent.mm.plugin.finder.feed.kf r0 = r0.f106558a
            com.tencent.mm.plugin.finder.storage.FeedData r0 = r0.f107194h
            if (r0 == 0) goto L22
            long r2 = r0.getFeedId()
        L22:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "setCallback feedId:"
            r0.<init>(r4)
            r0.append(r2)
            java.lang.String r4 = " fromFeed:"
            r0.append(r4)
            if (r7 == 0) goto L3d
            boolean r4 = r7.h()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            goto L3e
        L3d:
            r4 = r1
        L3e:
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "KtvTextureViewRender"
            com.tencent.mars.xlog.Log.i(r4, r0)
            r0 = 0
            if (r7 == 0) goto L55
            boolean r7 = r7.h()
            r5 = 1
            if (r7 != r5) goto L55
            goto L56
        L55:
            r5 = r0
        L56:
            if (r5 != 0) goto Lb3
            me2.c r7 = me2.c.f325921a
            boolean r7 = r7.a(r2)
            java.util.Map r5 = me2.c.f325924d
            if (r7 != 0) goto L66
            r5.clear()
            goto L71
        L66:
            java.lang.Long r7 = java.lang.Long.valueOf(r2)
            java.lang.Object r7 = r5.remove(r7)
            r1 = r7
            android.graphics.SurfaceTexture r1 = (android.graphics.SurfaceTexture) r1
        L71:
            if (r1 == 0) goto Lb3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r2 = "setSurfaceTexture surface="
            r7.<init>(r2)
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            com.tencent.mars.xlog.Log.i(r4, r7)
            int r7 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r7 < r2) goto L97
            boolean r7 = r1.isReleased()
            if (r7 == 0) goto L97
            java.lang.String r7 = "Cannot use released SurfaceTexture"
            com.tencent.mars.xlog.Log.e(r4, r7)
            return
        L97:
            android.view.TextureView r7 = r6.f337115e
            if (r7 == 0) goto L9e
            r7.setSurfaceTexture(r1)
        L9e:
            android.view.TextureView r7 = r6.f337115e
            if (r7 == 0) goto La7
            int r7 = r7.getWidth()
            goto La8
        La7:
            r7 = r0
        La8:
            android.view.TextureView r2 = r6.f337115e
            if (r2 == 0) goto Lb0
            int r0 = r2.getHeight()
        Lb0:
            r6.onSurfaceTextureAvailable(r1, r7, r0)
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nh2.j.a(nh2.b):void");
    }

    @Override // nh2.c
    public android.graphics.Canvas lockCanvas() {
        android.view.TextureView textureView = this.f337115e;
        if (textureView != null) {
            return textureView.lockCanvas();
        }
        return null;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        android.view.TextureView textureView = this.f337115e;
        if (textureView != null) {
            textureView.setOpaque(false);
        }
        nh2.b bVar = this.f337116f;
        if (bVar != null) {
            bVar.c();
        }
        java.lang.String format = java.lang.String.format("onSurfaceTextureAvailable width=%d,height=%d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)}, 2));
        kotlin.jvm.internal.o.f(format, "format(...)");
        com.tencent.mars.xlog.Log.i("KtvTextureViewRender", format);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        com.tencent.mm.plugin.finder.feed.y20 y20Var;
        com.tencent.mm.plugin.finder.storage.FeedData feedData;
        kotlin.jvm.internal.o.g(surface, "surface");
        ah2.f fVar = this.f337114d;
        if (fVar != null && fVar.h()) {
            fi2.e0 e0Var = fVar instanceof fi2.e0 ? (fi2.e0) fVar : null;
            long j17 = 0;
            if (e0Var != null && (y20Var = e0Var.f262817b) != null && (feedData = ((com.tencent.mm.plugin.finder.feed.df) y20Var).f106558a.f107194h) != null) {
                j17 = feedData.getFeedId();
            }
            com.tencent.mars.xlog.Log.i("KtvTextureViewRender", "onSurfaceTextureDestroyed feedId:" + j17);
            me2.c cVar = me2.c.f325921a;
            com.tencent.mars.xlog.Log.i("FinderLiveFeedDataCnl", "saveKTVSurfaceTexture feedId: " + j17);
            java.util.Map ktvSurfaceTextureMap = me2.c.f325924d;
            kotlin.jvm.internal.o.f(ktvSurfaceTextureMap, "ktvSurfaceTextureMap");
            ktvSurfaceTextureMap.put(java.lang.Long.valueOf(j17), surface);
        }
        nh2.b bVar = this.f337116f;
        if (bVar != null) {
            bVar.d();
        }
        return !(fVar != null ? fVar.h() : false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        nh2.b bVar = this.f337116f;
        if (bVar != null) {
            bVar.a();
        }
        java.lang.String format = java.lang.String.format("onSurfaceTextureSizeChanged width=%d,height=%d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)}, 2));
        kotlin.jvm.internal.o.f(format, "format(...)");
        com.tencent.mars.xlog.Log.i("KtvTextureViewRender", format);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
    }

    @Override // nh2.c
    public void unlockCanvasAndPost(android.graphics.Canvas canvas) {
        android.view.TextureView textureView = this.f337115e;
        if (textureView != null) {
            kotlin.jvm.internal.o.d(canvas);
            textureView.unlockCanvasAndPost(canvas);
        }
    }
}
