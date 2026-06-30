package km3;

/* loaded from: classes10.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: i, reason: collision with root package name */
    public static final km3.m f309250i = new km3.m(null);

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.HashMap f309251m = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f309252d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f309253e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem f309254f;

    /* renamed from: g, reason: collision with root package name */
    public final km3.n f309255g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f309256h;

    public p(android.widget.TextView textView, android.view.View view, com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem galleryItem$VideoMediaItem, km3.n nVar, kotlin.jvm.internal.i iVar) {
        this.f309252d = new java.lang.ref.WeakReference(textView);
        this.f309253e = new java.lang.ref.WeakReference(view);
        this.f309254f = galleryItem$VideoMediaItem;
        this.f309255g = nVar;
    }

    public final void a() {
        com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem galleryItem$VideoMediaItem = this.f309254f;
        if (galleryItem$VideoMediaItem == null) {
            return;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        try {
            java.lang.String o17 = galleryItem$VideoMediaItem.o();
            kotlin.jvm.internal.o.f(o17, "getThumbPath(...)");
            java.lang.String simpleMp4InfoVFS = ((com.tencent.mm.feature.sight.api.ISightJNIService) i95.n0.c(com.tencent.mm.feature.sight.api.ISightJNIService.class)).getSimpleMp4InfoVFS(o17);
            kotlin.jvm.internal.o.f(simpleMp4InfoVFS, "getSimpleMp4InfoVFS(...)");
            org.json.JSONObject jSONObject = new org.json.JSONObject(simpleMp4InfoVFS);
            galleryItem$VideoMediaItem.f138446x = jSONObject.getInt("videoDuration");
            galleryItem$VideoMediaItem.f138447y = jSONObject.getInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_HEIGHT);
            galleryItem$VideoMediaItem.f138448z = jSONObject.getInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_WIDTH);
            galleryItem$VideoMediaItem.A = jSONObject.getInt("videoBitrate");
            galleryItem$VideoMediaItem.C = jSONObject.getInt("videoFPS");
            galleryItem$VideoMediaItem.D = ((com.tencent.mm.feature.sight.api.ISightJNIService) i95.n0.c(com.tencent.mm.feature.sight.api.ISightJNIService.class)).getMp4RotateVFS(o17);
            galleryItem$VideoMediaItem.B = 0;
            galleryItem$VideoMediaItem.f138444v = j33.q.a(jSONObject.getString("videoType"));
            galleryItem$VideoMediaItem.f138445w = j33.q.a(jSONObject.getString("audioType"));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Music.MusicMvAlbumAdapter", e17, "loadItemFromSimpleMP4Info fail", new java.lang.Object[0]);
        }
        com.tencent.mars.xlog.Log.i("Music.MusicMvAlbumAdapter", "loadItemFromSimpleMP4Info used %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof km3.p)) {
            return false;
        }
        return kotlin.jvm.internal.o.b(this.f309254f, ((km3.p) obj).f309254f);
    }

    public int hashCode() {
        com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem galleryItem$VideoMediaItem = this.f309254f;
        if (galleryItem$VideoMediaItem != null) {
            return galleryItem$VideoMediaItem.hashCode();
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x00c8, code lost:
    
        r9 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x00ca, code lost:
    
        com.tencent.mars.xlog.Log.i(r9, "hit devices but it is too big, fileSize: %s, maxSize: %s, filePath: %s", java.lang.Long.valueOf(r17), java.lang.Integer.valueOf(r6), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x012a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: km3.p.run():void");
    }
}
