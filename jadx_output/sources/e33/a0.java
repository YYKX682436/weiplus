package e33;

/* loaded from: classes10.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.HashMap f247108h = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f247109d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem f247110e;

    /* renamed from: f, reason: collision with root package name */
    public final e33.z f247111f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f247112g;

    public a0(android.widget.TextView textView, com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem galleryItem$VideoMediaItem, e33.z zVar) {
        this.f247109d = new java.lang.ref.WeakReference(textView);
        this.f247110e = galleryItem$VideoMediaItem;
        this.f247111f = zVar;
    }

    public static void a(android.widget.TextView textView, com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem galleryItem$VideoMediaItem) {
        e33.a0 a0Var;
        if (textView == null || galleryItem$VideoMediaItem == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AlbumAdapter", "Error input for duration fetcher");
            return;
        }
        java.util.HashMap hashMap = f247108h;
        if (hashMap.containsKey(textView) && (a0Var = (e33.a0) hashMap.get(textView)) != null) {
            if (a0Var.f247110e.equals(galleryItem$VideoMediaItem)) {
                return;
            }
            if (textView.equals(a0Var.f247109d.get())) {
                a0Var.f247109d = new java.lang.ref.WeakReference(null);
                a0Var.f247112g = true;
            }
        }
        int i17 = galleryItem$VideoMediaItem.f138446x;
        if (i17 >= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AlbumAdapter", "Directly attach durationMs %d to tv, path %s", java.lang.Integer.valueOf(i17), galleryItem$VideoMediaItem);
            c(textView, galleryItem$VideoMediaItem.f138446x);
            hashMap.remove(textView);
        } else {
            textView.setText("");
            e33.a0 a0Var2 = new e33.a0(textView, galleryItem$VideoMediaItem, new e33.y());
            t23.p0.n().b(a0Var2);
            hashMap.put(textView, a0Var2);
        }
    }

    public static void c(android.widget.TextView textView, int i17) {
        if (textView == null) {
            return;
        }
        if (i17 < 0) {
            textView.setText("--:--");
            return;
        }
        int round = java.lang.Math.round(i17 / 1000.0f);
        java.lang.String valueOf = java.lang.String.valueOf(round % 60);
        if (valueOf.length() < 2) {
            valueOf = "0".concat(valueOf);
        }
        textView.setText((round / 60) + ":" + valueOf);
    }

    public final void b() {
        com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem galleryItem$VideoMediaItem = this.f247110e;
        if (galleryItem$VideoMediaItem == null) {
            return;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        try {
            java.lang.String o17 = galleryItem$VideoMediaItem.o();
            org.json.JSONObject jSONObject = new org.json.JSONObject(com.tencent.mm.plugin.sight.base.SightVideoJNI.getSimpleMp4InfoVFS(o17));
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
        if (!(obj instanceof e33.a0)) {
            return false;
        }
        return this.f247110e.equals(((e33.a0) obj).f247110e);
    }

    public int hashCode() {
        return this.f247110e.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0120  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e33.a0.run():void");
    }
}
