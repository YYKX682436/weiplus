package ev0;

/* loaded from: classes5.dex */
public final class c extends cu0.x {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f256838p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f256839q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider, android.content.Context context, yz5.l ignoreBackgroundTouchEvent) {
        super(recordConfigProvider, context, ignoreBackgroundTouchEvent);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(ignoreBackgroundTouchEvent, "ignoreBackgroundTouchEvent");
        this.f256838p = "MicroMsg.MovieComposingMusicPicker";
    }

    @Override // cu0.x
    public boolean c(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo) {
        if (audioCacheInfo != null) {
            return audioCacheInfo.f155709J;
        }
        return false;
    }

    @Override // cu0.x
    public cu0.y d(yz5.l ignoreBackgroundTouchEvent) {
        kotlin.jvm.internal.o.g(ignoreBackgroundTouchEvent, "ignoreBackgroundTouchEvent");
        return new ev0.f(this.f222351a, ignoreBackgroundTouchEvent);
    }

    @Override // cu0.x
    public java.lang.String j() {
        return this.f256838p;
    }

    @Override // cu0.x
    public void k() {
        if (this.f256839q) {
            super.k();
        } else {
            if (l()) {
                return;
            }
            this.f222353c.d();
        }
    }

    @Override // cu0.x
    public boolean l() {
        return ((com.tencent.mm.mj_publisher.finder.movie_composing.music.MovieComposingMusicPickerComponentLayout) g().e()).s();
    }

    @Override // cu0.x
    public void n(boolean z17, java.util.List lyricsInfos) {
        kotlin.jvm.internal.o.g(lyricsInfos, "lyricsInfos");
        yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.t3(m7Var, null), 3, null);
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = this.f222355e;
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo2 = this.f222355e;
        if (z17 && audioCacheInfo2 == null) {
            g().toggleLyrics(false);
        }
    }

    public final java.util.List o(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            zu0.a aVar = (zu0.a) it.next();
            java.lang.String identifier = aVar.f475661a.getMediaType() == qg.c.Image ? aVar.f475661a.getIdentifier() : null;
            if (identifier != null) {
                arrayList.add(identifier);
            }
        }
        return arrayList;
    }

    public final void p(java.util.List mediaItems, com.tencent.maas.model.time.MJTime mJTime) {
        java.lang.String str;
        java.lang.Object obj;
        boolean z17;
        boolean z18;
        com.tencent.maas.instamovie.base.asset.MJAssetInfo mJAssetInfo;
        kotlin.jvm.internal.o.g(mediaItems, "mediaItems");
        java.util.Iterator it = mediaItems.iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((zu0.a) obj).f475661a.getMediaType() == qg.c.Video) {
                    break;
                }
            }
        }
        zu0.a aVar = (zu0.a) obj;
        if (aVar != null && (mJAssetInfo = aVar.f475661a) != null) {
            str = mJAssetInfo.getIdentifier();
        }
        if (str == null) {
            str = "";
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (str.length() > 0) {
            this.f256839q = true;
            arrayList.addAll(o(mediaItems));
            r6 = mJTime != null ? (long) mJTime.toMilliseconds() : 0L;
            z18 = false;
            z17 = true;
        } else {
            arrayList.addAll(o(mediaItems));
            z17 = false;
            z18 = true;
        }
        cu0.y g17 = g();
        kotlin.jvm.internal.o.e(g17, "null cannot be cast to non-null type com.tencent.mm.mj_publisher.finder.movie_composing.music.MovieComposingMusicPickerDrawerImpl");
        ev0.f fVar = (ev0.f) g17;
        com.tencent.mars.xlog.Log.i("MicroMsg.MovieComposingMusicPickerDrawerImpl", "setup: ");
        st3.k kVar = new st3.k();
        kVar.f412551f = st3.v.f412609h;
        kVar.f412547b = z17;
        kVar.f412549d = z17;
        boolean z19 = z18;
        ((com.tencent.mm.mj_publisher.finder.movie_composing.music.MovieComposingMusicPickerComponentLayout) fVar.e()).x(new yu3.b(new yu3.a(10, true, str, arrayList, 0L, r6, z19, 2, null, null, 768, null), (str.length() == 0) && (arrayList.isEmpty() ^ true), kVar, false), z19);
    }
}
