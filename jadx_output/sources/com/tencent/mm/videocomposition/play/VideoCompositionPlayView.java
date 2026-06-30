package com.tencent.mm.videocomposition.play;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0016\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u0010/\u001a\u00020\u0004¢\u0006\u0004\b0\u00101B\u0019\b\u0016\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b0\u00102J\"\u0010\u0007\u001a\u00020\u00052\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003J\u0010\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0013\u001a\u00020\u0011R$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010#\u001a\u0004\u0018\u00010\u001c8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010*\u001a\u00020\u000e8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u00063"}, d2 = {"Lcom/tencent/mm/videocomposition/play/VideoCompositionPlayView;", "Landroid/view/TextureView;", "Landroid/view/TextureView$SurfaceTextureListener;", "Lkotlin/Function2;", "", "Ljz5/f0;", "onSizeChanged", "setOnSizeChangedListener", "Lvm5/a;", "callback", "setPlayerCallback", "Lvm5/c;", "profileCallback", "setPlayerProfileCallback", "", "loop", "setLoop", "", "getPosition", "getLaggingTime", "Lvm5/g;", "d", "Lvm5/g;", "getPlayer", "()Lvm5/g;", "setPlayer", "(Lvm5/g;)V", "player", "Lrm5/v;", "i", "Lrm5/v;", "getComposition", "()Lrm5/v;", "setComposition", "(Lrm5/v;)V", "composition", "q", "Z", "getFirstFrame", "()Z", "setFirstFrame", "(Z)V", "firstFrame", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "composer_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public class VideoCompositionPlayView extends android.view.TextureView implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public vm5.g player;

    /* renamed from: e, reason: collision with root package name */
    public yz5.p f213285e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.SurfaceTexture f213286f;

    /* renamed from: g, reason: collision with root package name */
    public int f213287g;

    /* renamed from: h, reason: collision with root package name */
    public int f213288h;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public rm5.v composition;

    /* renamed from: m, reason: collision with root package name */
    public boolean f213290m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f213291n;

    /* renamed from: o, reason: collision with root package name */
    public vm5.a f213292o;

    /* renamed from: p, reason: collision with root package name */
    public vm5.c f213293p;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public boolean firstFrame;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoCompositionPlayView(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f213291n = true;
        this.firstFrame = true;
        setSurfaceTextureListener(this);
        xm5.b.c("VideoCompositionPlayView", "create VLogCompositionPlayView", new java.lang.Object[0]);
    }

    public void c() {
        vm5.g gVar;
        if (this.composition == null || this.f213286f == null) {
            return;
        }
        xm5.b.c("VideoCompositionPlayView", "do createPlayer, composition:" + this.composition, new java.lang.Object[0]);
        rm5.v vVar = this.composition;
        kotlin.jvm.internal.o.d(vVar);
        vm5.g gVar2 = new vm5.g(vVar);
        this.player = gVar2;
        android.graphics.SurfaceTexture surfaceTexture = this.f213286f;
        kotlin.jvm.internal.o.d(surfaceTexture);
        int i17 = this.f213287g;
        int i18 = this.f213288h;
        gVar2.f438162f = i17;
        gVar2.f438163g = i18;
        xm5.b.c("VideoCompositionPlayer", "createPlayerLayerBySurfaceTexture: " + surfaceTexture + ", size:[" + i17 + ", " + i18 + ']', new java.lang.Object[0]);
        new com.tencent.tav.player.PlayerLayer(surfaceTexture, i17, i18).setPlayer(gVar2.f438158b);
        xm5.b.c("VideoCompositionPlayer", "setSurfaceTexture: " + surfaceTexture + ", width:" + i17 + ", height:" + i18, new java.lang.Object[0]);
        vm5.g gVar3 = this.player;
        if (gVar3 != null) {
            gVar3.b(this.f213291n);
        }
        vm5.a aVar = this.f213292o;
        if (aVar != null && (gVar = this.player) != null) {
            gVar.f438161e = aVar;
            com.tencent.tav.player.Player player = gVar.f438158b;
            if (player != null) {
                player.setPlayerListener(new vm5.d(gVar));
            }
        }
        vm5.g gVar4 = this.player;
        if (gVar4 != null) {
            gVar4.f438166j = this.f213293p;
        }
    }

    public final void e() {
        vm5.g gVar = this.player;
        if (gVar != null) {
            xm5.b.c("VideoCompositionPlayer", "refreshSurface isStarted:" + gVar.f438164h, new java.lang.Object[0]);
            if (gVar.f438164h) {
                return;
            }
            android.os.SystemClock.elapsedRealtime();
            com.tencent.tav.player.Player player = gVar.f438158b;
            if (player != null) {
                player.refreshSurface(null);
            }
        }
    }

    public final void f(boolean z17) {
        com.tencent.tav.player.Player player;
        vm5.g gVar = this.player;
        if (gVar == null || (player = gVar.f438158b) == null) {
            return;
        }
        player.setVolume(z17 ? 0.0f : 1.0f);
    }

    public final void g() {
        xm5.b.c("VideoCompositionPlayView", "release", new java.lang.Object[0]);
        this.f213290m = false;
        vm5.g gVar = this.player;
        if (gVar != null) {
            xm5.b.c("VideoCompositionPlayer", "release", new java.lang.Object[0]);
            com.tencent.tav.player.Player player = gVar.f438158b;
            if (player != null) {
                player.release();
            }
            gVar.f438158b = null;
            gVar.f438164h = false;
        }
    }

    public final rm5.v getComposition() {
        return this.composition;
    }

    public final boolean getFirstFrame() {
        return this.firstFrame;
    }

    public final long getLaggingTime() {
        vm5.g gVar = this.player;
        if (gVar != null) {
            return gVar.f438160d.getLaggingTime();
        }
        return 0L;
    }

    public final vm5.g getPlayer() {
        return this.player;
    }

    public final long getPosition() {
        vm5.g gVar = this.player;
        if (gVar != null) {
            return gVar.a();
        }
        return 0L;
    }

    public final void h() {
        xm5.b.c("VideoCompositionPlayView", "resume", new java.lang.Object[0]);
        this.f213290m = true;
        vm5.g gVar = this.player;
        if (gVar != null) {
            gVar.c();
        }
    }

    public final boolean isPlaying() {
        com.tencent.tav.player.Player player;
        vm5.g gVar = this.player;
        if (gVar == null || (player = gVar.f438158b) == null) {
            return false;
        }
        return player.isPlaying();
    }

    public final void j(long j17) {
        xm5.b.c("VideoCompositionPlayView", "seekTo:" + j17, new java.lang.Object[0]);
        vm5.g gVar = this.player;
        if (gVar != null) {
            xm5.b.c("VideoCompositionPlayer", "seekTo:" + j17 + ", isUpdatingComposition:" + gVar.f438165i, new java.lang.Object[0]);
            if (gVar.f438165i) {
                return;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.tav.player.Player player = gVar.f438158b;
            if (player != null) {
                player.seekToTime(new com.tencent.tav.coremedia.CMTime(j17, 1000), new vm5.f(currentTimeMillis, j17, gVar));
            }
        }
    }

    public final void k(long j17, long j18) {
        com.tencent.tav.player.Player player;
        vm5.g gVar = this.player;
        if (gVar == null || (player = gVar.f438158b) == null) {
            return;
        }
        player.setPlayRange(new com.tencent.tav.coremedia.CMTimeRange(new com.tencent.tav.coremedia.CMTime(j17, 1000), new com.tencent.tav.coremedia.CMTime(j18 - j17, 1000)));
    }

    public void o(rm5.v composition) {
        kotlin.jvm.internal.o.g(composition, "composition");
        xm5.b.e("VideoCompositionPlayView", hashCode() + " start, surface:" + this.f213286f + ", player:" + this.player + ", surfaceWidth:" + this.f213287g + ", surfaceHeight:" + this.f213288h + ", composition:" + composition.hashCode(), new java.lang.Object[0]);
        if (this.player != null && this.f213286f != null && this.f213287g > 0 && this.f213288h > 0 && !kotlin.jvm.internal.o.b(composition, this.composition)) {
            xm5.b.c("VideoCompositionPlayView", "startWithUpdateComposition", new java.lang.Object[0]);
            vm5.g gVar = this.player;
            if (gVar != null) {
                gVar.d(composition, true, false, -1L);
            }
            this.composition = composition;
            return;
        }
        if (kotlin.jvm.internal.o.b(composition, this.composition)) {
            if (this.f213286f == null) {
                xm5.b.c("VideoCompositionPlayView", "same composition but surface is null", new java.lang.Object[0]);
                this.f213290m = true;
                return;
            }
            xm5.b.c("VideoCompositionPlayView", "same composition directly start", new java.lang.Object[0]);
            this.f213290m = true;
            vm5.g gVar2 = this.player;
            if (gVar2 != null) {
                gVar2.d(composition, true, false, -1L);
                return;
            }
            return;
        }
        this.composition = composition;
        if (this.f213286f != null && this.f213287g > 0 && this.f213288h > 0) {
            c();
        }
        this.f213290m = true;
        vm5.g gVar3 = this.player;
        if (gVar3 != null) {
            gVar3.c();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        vm5.g gVar;
        kotlin.jvm.internal.o.g(surface, "surface");
        xm5.b.c("VideoCompositionPlayView", "surfaceAvailable, surfaceTexture:" + getSurfaceTexture() + ", width:" + i17 + ", height:" + i18, new java.lang.Object[0]);
        this.f213286f = surface;
        this.f213287g = i17;
        this.f213288h = i18;
        if (this.composition != null) {
            c();
            if (!this.f213290m || (gVar = this.player) == null) {
                return;
            }
            gVar.c();
        }
    }

    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        xm5.b.c("VideoCompositionPlayView", "surfaceDestroy", new java.lang.Object[0]);
        surface.release();
        vm5.g gVar = this.player;
        if (gVar != null) {
            xm5.b.c("VideoCompositionPlayer", "release", new java.lang.Object[0]);
            com.tencent.tav.player.Player player = gVar.f438158b;
            if (player != null) {
                player.release();
            }
            gVar.f438158b = null;
            gVar.f438164h = false;
        }
        this.f213287g = 0;
        this.f213288h = 0;
        this.f213286f = null;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        xm5.b.c("VideoCompositionPlayView", "surfaceSizeChanged, surfaceTexture:" + getSurfaceTexture() + ", width:" + i17 + ", height:" + i18, new java.lang.Object[0]);
        this.f213287g = i17;
        this.f213288h = i18;
        vm5.g gVar = this.player;
        if (gVar != null) {
            xm5.b.c("VideoCompositionPlayer", "updateDisplaySize:[" + i17 + ", " + i18 + ']', new java.lang.Object[0]);
            com.tencent.tav.player.Player player = gVar.f438158b;
            if (player != null) {
                player.updateViewport(i17, i18);
            }
        }
        yz5.p pVar = this.f213285e;
        if (pVar != null) {
            pVar.invoke(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        if (this.firstFrame && this.f213290m) {
            xm5.b.c("VideoCompositionPlayView", "onSurfaceTextureUpdated", new java.lang.Object[0]);
            vm5.a aVar = this.f213292o;
            if (aVar != null) {
                aVar.x();
            }
            this.firstFrame = false;
        }
        vm5.a aVar2 = this.f213292o;
        vm5.b bVar = aVar2 instanceof vm5.b ? (vm5.b) aVar2 : null;
        if (bVar != null) {
            bVar.r();
        }
    }

    public boolean pause() {
        xm5.b.c("VideoCompositionPlayView", "pause", new java.lang.Object[0]);
        this.f213290m = false;
        vm5.g gVar = this.player;
        if (gVar == null) {
            return true;
        }
        xm5.b.c("VideoCompositionPlayer", "pause", new java.lang.Object[0]);
        com.tencent.tav.player.Player player = gVar.f438158b;
        if (player != null) {
            player.pause();
        }
        gVar.f438164h = false;
        return true;
    }

    public void q(rm5.v composition, boolean z17, boolean z18, long j17) {
        kotlin.jvm.internal.o.g(composition, "composition");
        xm5.b.c("VideoCompositionPlayView", "updateComposition, playAfterUpdate:" + z17 + ", seekToOriginPosition:" + z18 + ", seekTo:" + j17, new java.lang.Object[0]);
        vm5.g gVar = this.player;
        if (gVar != null) {
            gVar.d(composition, z17, z18, j17);
        }
        this.composition = composition;
    }

    public final void setComposition(rm5.v vVar) {
        this.composition = vVar;
    }

    public final void setFirstFrame(boolean z17) {
        this.firstFrame = z17;
    }

    public final void setLoop(boolean z17) {
        xm5.b.c("VideoCompositionPlayView", "setLoop:" + z17, new java.lang.Object[0]);
        this.f213291n = z17;
        vm5.g gVar = this.player;
        if (gVar == null) {
            this.f213291n = z17;
        } else if (gVar != null) {
            gVar.b(z17);
        }
    }

    public final void setOnSizeChangedListener(yz5.p pVar) {
        this.f213285e = pVar;
    }

    public final void setPlayer(vm5.g gVar) {
        this.player = gVar;
    }

    public final void setPlayerCallback(vm5.a aVar) {
        vm5.g gVar = this.player;
        if (gVar != null) {
            gVar.f438161e = aVar;
            com.tencent.tav.player.Player player = gVar.f438158b;
            if (player != null) {
                player.setPlayerListener(new vm5.d(gVar));
            }
        }
        this.f213292o = aVar;
    }

    public final void setPlayerProfileCallback(vm5.c cVar) {
        this.f213293p = cVar;
        vm5.g gVar = this.player;
        if (gVar != null) {
            gVar.f438166j = cVar;
        }
    }

    public void stop() {
        xm5.b.c("VideoCompositionPlayView", "stop", new java.lang.Object[0]);
        this.f213290m = false;
        this.firstFrame = true;
        vm5.g gVar = this.player;
        if (gVar != null) {
            xm5.b.c("VideoCompositionPlayer", "stop", new java.lang.Object[0]);
            com.tencent.tav.player.Player player = gVar.f438158b;
            if (player != null) {
                player.stop();
            }
            gVar.f438164h = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoCompositionPlayView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f213291n = true;
        this.firstFrame = true;
        setSurfaceTextureListener(this);
        xm5.b.c("VideoCompositionPlayView", "create VLogCompositionPlayView", new java.lang.Object[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoCompositionPlayView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f213291n = true;
        this.firstFrame = true;
        setSurfaceTextureListener(this);
        xm5.b.c("VideoCompositionPlayView", "create VLogCompositionPlayView", new java.lang.Object[0]);
    }
}
