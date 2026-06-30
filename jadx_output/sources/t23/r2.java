package t23;

/* loaded from: classes10.dex */
public class r2 implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f415255d;

    /* renamed from: e, reason: collision with root package name */
    public final int f415256e;

    /* renamed from: f, reason: collision with root package name */
    public android.media.MediaFormat f415257f;

    /* renamed from: g, reason: collision with root package name */
    public android.media.MediaFormat f415258g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem f415259h;

    /* renamed from: i, reason: collision with root package name */
    public final t23.q2 f415260i;

    public r2(java.lang.String str, int i17, com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem galleryItem$VideoMediaItem, t23.q2 q2Var) {
        this.f415255d = str;
        this.f415256e = i17;
        this.f415259h = galleryItem$VideoMediaItem;
        this.f415260i = q2Var;
    }

    public boolean equals(java.lang.Object obj) {
        java.lang.String str;
        if (obj instanceof t23.r2) {
            if (this != obj) {
                t23.r2 r2Var = (t23.r2) obj;
                if (this.f415256e == r2Var.f415256e || ((str = this.f415255d) != null && str.equals(r2Var.f415255d))) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "video_analysis";
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String string;
        gp.c cVar = new gp.c();
        try {
            try {
                cVar.k(this.f415255d);
                int d17 = cVar.d();
                int i17 = 0;
                for (int i18 = 0; i18 < d17; i18++) {
                    android.media.MediaFormat e17 = cVar.e(i18);
                    if (e17.containsKey("mime") && (string = e17.getString("mime")) != null) {
                        if (string.startsWith("video/")) {
                            if (this.f415257f == null) {
                                this.f415257f = e17;
                            }
                        } else if (string.startsWith("audio/") && this.f415258g == null) {
                            this.f415258g = e17;
                        }
                        if (this.f415258g != null && this.f415257f != null) {
                            break;
                        }
                    }
                }
                com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem galleryItem$VideoMediaItem = this.f415259h;
                if (galleryItem$VideoMediaItem != null) {
                    android.media.MediaFormat mediaFormat = this.f415257f;
                    java.lang.String str = "";
                    if (mediaFormat != null) {
                        galleryItem$VideoMediaItem.f138446x = !mediaFormat.containsKey("durationUs") ? 0 : (int) (this.f415257f.getLong("durationUs") / 1000);
                        galleryItem$VideoMediaItem.f138447y = !this.f415257f.containsKey("height") ? 0 : this.f415257f.getInteger("height");
                        galleryItem$VideoMediaItem.f138448z = !this.f415257f.containsKey("width") ? 0 : this.f415257f.getInteger("width");
                        galleryItem$VideoMediaItem.f138444v = !this.f415257f.containsKey("mime") ? "" : this.f415257f.getString("mime");
                        galleryItem$VideoMediaItem.A = !this.f415257f.containsKey(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE) ? 0 : this.f415257f.getInteger(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE);
                        galleryItem$VideoMediaItem.B = !this.f415257f.containsKey("i-frame-interval") ? 0 : this.f415257f.getInteger("i-frame-interval");
                        if (this.f415257f.containsKey("frame-rate")) {
                            i17 = this.f415257f.getInteger("frame-rate");
                        }
                        galleryItem$VideoMediaItem.C = i17;
                    }
                    android.media.MediaFormat mediaFormat2 = this.f415258g;
                    if (mediaFormat2 != null) {
                        if (mediaFormat2.containsKey("mime")) {
                            str = this.f415258g.getString("mime");
                        }
                        galleryItem$VideoMediaItem.f138445w = str;
                    }
                }
            } catch (java.lang.Exception e18) {
                e18.getMessage();
            }
            if (this.f415260i == null) {
                return;
            }
            com.tencent.mm.sdk.platformtools.u3.h(new t23.p2(this));
        } finally {
            cVar.g();
        }
    }
}
