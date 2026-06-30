package d45;

/* loaded from: classes10.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: h, reason: collision with root package name */
    public static final d45.f f226441h = new d45.f(null);

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.HashMap f226442i = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f226443d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem f226444e;

    /* renamed from: f, reason: collision with root package name */
    public final d45.g f226445f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f226446g;

    public i(android.widget.TextView textView, com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem galleryItem$VideoMediaItem, d45.g gVar, kotlin.jvm.internal.i iVar) {
        this.f226443d = new java.lang.ref.WeakReference(textView);
        this.f226444e = galleryItem$VideoMediaItem;
        this.f226445f = gVar;
    }

    public final void a() {
        com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem galleryItem$VideoMediaItem = this.f226444e;
        if (galleryItem$VideoMediaItem == null) {
            return;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        try {
            java.lang.String o17 = galleryItem$VideoMediaItem.o();
            kotlin.jvm.internal.o.f(o17, "getThumbPath(...)");
            java.lang.String simpleMp4InfoVFS = com.tencent.mm.plugin.sight.base.SightVideoJNI.getSimpleMp4InfoVFS(o17);
            kotlin.jvm.internal.o.f(simpleMp4InfoVFS, "getSimpleMp4InfoVFS(...)");
            org.json.JSONObject jSONObject = new org.json.JSONObject(simpleMp4InfoVFS);
            galleryItem$VideoMediaItem.f138446x = jSONObject.getInt("videoDuration");
            galleryItem$VideoMediaItem.f138447y = jSONObject.getInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_HEIGHT);
            galleryItem$VideoMediaItem.f138448z = jSONObject.getInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_WIDTH);
            galleryItem$VideoMediaItem.A = jSONObject.getInt("videoBitrate");
            galleryItem$VideoMediaItem.C = jSONObject.getInt("videoFPS");
            galleryItem$VideoMediaItem.D = com.tencent.mm.plugin.sight.base.SightVideoJNI.getMp4RotateVFS(o17);
            galleryItem$VideoMediaItem.B = 0;
            galleryItem$VideoMediaItem.f138444v = j33.q.a(jSONObject.getString("videoType"));
            galleryItem$VideoMediaItem.f138445w = j33.q.a(jSONObject.getString("audioType"));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AlbumAdapter", e17, "loadItemFromSimpleMP4Info fail", new java.lang.Object[0]);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AlbumAdapter", "loadItemFromSimpleMP4Info mediaItem: %s", galleryItem$VideoMediaItem);
        com.tencent.mars.xlog.Log.i("MicroMsg.AlbumAdapter", "loadItemFromSimpleMP4Info used %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof d45.i)) {
            return false;
        }
        return kotlin.jvm.internal.o.b(this.f226444e, ((d45.i) obj).f226444e);
    }

    public int hashCode() {
        com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem galleryItem$VideoMediaItem = this.f226444e;
        if (galleryItem$VideoMediaItem != null) {
            return galleryItem$VideoMediaItem.hashCode();
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x00c8, code lost:
    
        r9 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x00ca, code lost:
    
        com.tencent.mars.xlog.Log.i(r9, "hit devices but it is too big, fileSize: %s, maxSize: %s, filePath: %s", java.lang.Long.valueOf(r17), java.lang.Integer.valueOf(r6), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x012a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 703
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d45.i.run():void");
    }
}
