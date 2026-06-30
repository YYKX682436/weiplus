package hs0;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f284547a;

    /* renamed from: b, reason: collision with root package name */
    public final gp.c f284548b;

    /* renamed from: c, reason: collision with root package name */
    public final int f284549c;

    /* renamed from: d, reason: collision with root package name */
    public final int f284550d;

    /* renamed from: e, reason: collision with root package name */
    public final android.media.MediaFormat f284551e;

    /* renamed from: f, reason: collision with root package name */
    public final android.media.MediaFormat f284552f;

    /* renamed from: g, reason: collision with root package name */
    public final int f284553g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f284554h;

    /* renamed from: i, reason: collision with root package name */
    public int f284555i;

    /* renamed from: j, reason: collision with root package name */
    public long f284556j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f284557k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f284558l;

    public a(java.lang.String filePath) {
        int integer;
        kotlin.jvm.internal.o.g(filePath, "filePath");
        this.f284547a = filePath;
        gp.c cVar = new gp.c();
        this.f284548b = cVar;
        this.f284549c = -1;
        this.f284550d = -1;
        try {
            cVar.k(filePath);
            int d17 = cVar.d();
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaExtractorWrapper", "trackCount :" + d17 + " filePath :" + filePath);
            android.util.SparseArray sparseArray = new android.util.SparseArray();
            android.util.SparseArray sparseArray2 = new android.util.SparseArray();
            for (int i17 = 0; i17 < d17; i17++) {
                android.media.MediaFormat e17 = this.f284548b.e(i17);
                kotlin.jvm.internal.o.f(e17, "getTrackFormat(...)");
                java.lang.String string = e17.getString("mime");
                kotlin.jvm.internal.o.d(string);
                if (r26.n0.B(string, "video", false)) {
                    sparseArray.put(i17, e17);
                } else if (r26.n0.B(string, "audio", false)) {
                    sparseArray2.put(i17, e17);
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaExtractorWrapper", "video track count:" + sparseArray.size() + ", audio track count:" + sparseArray2.size());
            if (sparseArray2.size() > 0) {
                int keyAt = sparseArray2.keyAt(0);
                this.f284550d = keyAt;
                this.f284552f = (android.media.MediaFormat) sparseArray2.get(keyAt);
            }
            if (sparseArray.size() > 0) {
                int size = sparseArray.size();
                int i18 = Integer.MAX_VALUE;
                for (int i19 = 0; i19 < size; i19++) {
                    int keyAt2 = sparseArray.keyAt(i19);
                    android.media.MediaFormat mediaFormat = (android.media.MediaFormat) sparseArray.get(keyAt2);
                    if (mediaFormat.containsKey("frame-rate") && (integer = mediaFormat.getInteger("frame-rate")) < i18) {
                        this.f284549c = keyAt2;
                        this.f284551e = mediaFormat;
                        i18 = integer;
                    }
                }
                if (this.f284549c < 0) {
                    int keyAt3 = sparseArray.keyAt(0);
                    this.f284549c = keyAt3;
                    this.f284551e = (android.media.MediaFormat) sparseArray.get(keyAt3);
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaExtractorWrapper", "audio track index:" + this.f284550d + ", format:" + this.f284552f);
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaExtractorWrapper", "video track index: " + this.f284549c + ", format:" + this.f284551e);
            int i27 = this.f284549c;
            if (i27 >= 0) {
                this.f284548b.i(i27);
                this.f284554h = true;
            }
            gp.d dVar = new gp.d();
            dVar.setDataSource(this.f284547a);
            this.f284553g = java.lang.Integer.parseInt(dVar.extractMetadata(20));
            dVar.release();
            toString();
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaExtractorWrapper", e18, "", new java.lang.Object[0]);
            this.f284557k = true;
        }
    }

    public static boolean c(hs0.a aVar, java.nio.ByteBuffer byteBuffer, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            i17 = 0;
        }
        gp.c cVar = aVar.f284548b;
        kotlin.jvm.internal.o.g(byteBuffer, "byteBuffer");
        try {
            if (aVar.f284558l) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MediaExtractorWrapper", "readNextSampleData already release");
                return false;
            }
            aVar.f284555i = cVar.f(byteBuffer, i17);
            aVar.f284556j = cVar.b();
            cVar.a();
            return cVar.c() == (aVar.f284554h ? aVar.f284549c : aVar.f284550d);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaExtractorWrapper", e17, "readNextSampleData", new java.lang.Object[0]);
            return false;
        }
    }

    public final long a() {
        try {
            return this.f284556j;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaExtractorWrapper", e17, "getSampleTime error", new java.lang.Object[0]);
            return -1L;
        }
    }

    public final java.lang.String b() {
        android.media.MediaFormat mediaFormat = this.f284551e;
        if (mediaFormat != null) {
            return mediaFormat.getString("mime");
        }
        return null;
    }

    public final void d() {
        this.f284548b.g();
        this.f284558l = true;
    }

    public final void e(long j17) {
        if (this.f284558l) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MediaExtractorWrapper", "seek error, mediaExtractor already release!");
        } else {
            this.f284548b.h(j17, 0);
        }
    }

    public final void f() {
        try {
            int i17 = this.f284549c;
            gp.c cVar = this.f284548b;
            if (i17 >= 0) {
                cVar.f274162a.unselectTrack(i17);
            }
            int i18 = this.f284550d;
            if (i18 >= 0) {
                this.f284554h = false;
                cVar.i(i18);
                this.f284555i = 0;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaExtractorWrapper", e17, "selectAudio error", new java.lang.Object[0]);
        }
    }

    public final void g() {
        try {
            int i17 = this.f284550d;
            gp.c cVar = this.f284548b;
            if (i17 >= 0) {
                cVar.f274162a.unselectTrack(i17);
            }
            int i18 = this.f284549c;
            if (i18 >= 0) {
                this.f284554h = true;
                cVar.i(i18);
                this.f284555i = 0;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaExtractorWrapper", e17, "selectVideo error", new java.lang.Object[0]);
        }
    }

    public java.lang.String toString() {
        return "MediaExtractorWrapper(filePath='" + this.f284547a + "', mediaExtractor=" + this.f284548b + ", videoTrackIndex=" + this.f284549c + ", audioTrackIndex=" + this.f284550d + ", videoTrackFormat=" + this.f284551e + ", audioTrackForamt=" + this.f284552f + ", videoBitrate=" + this.f284553g + ", selectVideo=" + this.f284554h + ", sampleSize=" + this.f284555i + ", hasError=" + this.f284557k + ", isRelease=" + this.f284558l + ')';
    }
}
