package rm5;

/* loaded from: classes10.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static int f397521b = 1080;

    /* renamed from: c, reason: collision with root package name */
    public static long f397522c = 10000;

    /* renamed from: a, reason: collision with root package name */
    public static final rm5.l f397520a = new rm5.l();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f397523d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f397524e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashMap f397525f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.HashMap f397526g = new java.util.HashMap();

    public final void a() {
        synchronized (this) {
            f397524e.clear();
            f397523d.clear();
            f397525f.clear();
            java.util.Iterator it = f397526g.entrySet().iterator();
            while (it.hasNext()) {
                ((com.tencent.tav.asset.URLAsset) ((java.util.Map.Entry) it.next()).getValue()).release();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0318  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap b(java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 864
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rm5.l.b(java.lang.String):android.graphics.Bitmap");
    }

    public final com.tencent.tavkit.composition.resource.TAVResource c(rm5.j track) {
        kotlin.jvm.internal.o.g(track, "track");
        synchronized (this) {
            java.util.HashMap hashMap = f397524e;
            com.tencent.tavkit.composition.resource.TAVResource tAVResource = (com.tencent.tavkit.composition.resource.TAVResource) hashMap.get(track.f397499a);
            if (tAVResource == null) {
                int i17 = track.f397500b;
                if (i17 == 1) {
                    android.graphics.Bitmap b17 = f397520a.b(track.f397499a);
                    if (b17 == null) {
                        com.tencent.tavkit.composition.resource.TAVResource mo423clone = new com.tencent.tavkit.composition.resource.TAVEmptyResource(com.tencent.tav.coremedia.CMTime.CMTimeZero).mo423clone();
                        kotlin.jvm.internal.o.f(mo423clone, "clone(...)");
                        return mo423clone;
                    }
                    f397523d.put(track.f397499a, b17);
                    tAVResource = new com.tencent.tavkit.composition.resource.TAVImageResource(new com.tencent.tavkit.ciimage.CIImage(b17), new com.tencent.tav.coremedia.CMTime(f397522c, 1000), true);
                } else if (i17 == 2 || i17 == 3) {
                    com.tencent.tav.asset.URLAsset uRLAsset = new com.tencent.tav.asset.URLAsset(track.f397499a);
                    com.tencent.tavkit.composition.resource.TAVAssetTrackResource tAVAssetTrackResource = new com.tencent.tavkit.composition.resource.TAVAssetTrackResource(uRLAsset);
                    f397526g.put(track.f397499a, uRLAsset);
                    tAVResource = tAVAssetTrackResource;
                } else {
                    tAVResource = new com.tencent.tavkit.composition.resource.TAVEmptyResource(com.tencent.tav.coremedia.CMTime.CMTimeZero);
                }
                hashMap.put(track.f397499a, tAVResource);
            }
            com.tencent.tavkit.composition.resource.TAVResource mo423clone2 = tAVResource.mo423clone();
            kotlin.jvm.internal.o.f(mo423clone2, "clone(...)");
            return mo423clone2;
        }
    }

    public final rm5.p d(java.lang.String path) {
        rm5.p pVar;
        rm5.p pVar2;
        kotlin.jvm.internal.o.g(path, "path");
        synchronized (this) {
            java.util.HashMap hashMap = f397525f;
            pVar = (rm5.p) hashMap.get(path);
            if (pVar == null) {
                android.media.MediaMetadataRetriever mediaMetadataRetriever = new android.media.MediaMetadataRetriever();
                rm5.p pVar3 = null;
                try {
                    try {
                        mediaMetadataRetriever.setDataSource(path);
                        java.lang.String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
                        int parseInt = extractMetadata != null ? java.lang.Integer.parseInt(extractMetadata) : 0;
                        java.lang.String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                        int parseInt2 = extractMetadata2 != null ? java.lang.Integer.parseInt(extractMetadata2) : 0;
                        java.lang.String extractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                        int parseInt3 = extractMetadata3 != null ? java.lang.Integer.parseInt(extractMetadata3) : 0;
                        if (parseInt3 != 90 && parseInt3 != 270) {
                            int i17 = parseInt2;
                            parseInt2 = parseInt;
                            parseInt = i17;
                        }
                        java.lang.String extractMetadata4 = mediaMetadataRetriever.extractMetadata(9);
                        pVar2 = new rm5.p(parseInt2, parseInt, parseInt3, extractMetadata4 != null ? java.lang.Integer.parseInt(extractMetadata4) : 0);
                    } catch (java.lang.Exception unused) {
                    }
                    try {
                        hashMap.put(path, pVar2);
                        mediaMetadataRetriever.release();
                        pVar = pVar2;
                    } catch (java.lang.Exception unused2) {
                        pVar3 = pVar2;
                        pVar = pVar3;
                        return pVar;
                    }
                } finally {
                    mediaMetadataRetriever.release();
                }
            }
        }
        return pVar;
    }
}
