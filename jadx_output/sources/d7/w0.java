package d7;

/* loaded from: classes13.dex */
public class w0 implements t6.n {

    /* renamed from: d, reason: collision with root package name */
    public static final t6.k f226845d = new t6.k("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new d7.q0());

    /* renamed from: e, reason: collision with root package name */
    public static final t6.k f226846e = new t6.k("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new d7.r0());

    /* renamed from: f, reason: collision with root package name */
    public static final d7.t0 f226847f = new d7.t0();

    /* renamed from: a, reason: collision with root package name */
    public final d7.u0 f226848a;

    /* renamed from: b, reason: collision with root package name */
    public final x6.d f226849b;

    /* renamed from: c, reason: collision with root package name */
    public final d7.t0 f226850c = f226847f;

    public w0(x6.d dVar, d7.u0 u0Var) {
        this.f226849b = dVar;
        this.f226848a = u0Var;
    }

    public static android.graphics.Bitmap c(android.media.MediaMetadataRetriever mediaMetadataRetriever, long j17, int i17, int i18, int i19, d7.v vVar) {
        android.graphics.Bitmap bitmap = null;
        if (android.os.Build.VERSION.SDK_INT >= 27 && i18 != Integer.MIN_VALUE && i19 != Integer.MIN_VALUE && vVar != d7.v.f226841d) {
            try {
                int parseInt = java.lang.Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                int parseInt2 = java.lang.Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                int parseInt3 = java.lang.Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                if (parseInt3 == 90 || parseInt3 == 270) {
                    parseInt2 = parseInt;
                    parseInt = parseInt2;
                }
                float b17 = vVar.b(parseInt, parseInt2, i18, i19);
                int round = java.lang.Math.round(parseInt * b17);
                int round2 = java.lang.Math.round(b17 * parseInt2);
                zj0.a aVar = new zj0.a();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                aVar.c(java.lang.Integer.valueOf(round2));
                aVar.c(java.lang.Integer.valueOf(round));
                aVar.c(java.lang.Integer.valueOf(i17));
                aVar.c(java.lang.Long.valueOf(j17));
                yj0.a.d(mediaMetadataRetriever, aVar.b(), "com/bumptech/glide/load/resource/bitmap/VideoDecoder", "decodeScaledFrame", "(Landroid/media/MediaMetadataRetriever;JIIILcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;)Landroid/graphics/Bitmap;", "Undefined", "getScaledFrameAtTime", "(JIII)Landroid/graphics/Bitmap;");
                zj0.c.f473285a.set(aVar);
                long longValue = ((java.lang.Long) aVar.a(0)).longValue();
                zj0.a a17 = zj0.c.a();
                android.graphics.Bitmap scaledFrameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(longValue, ((java.lang.Integer) a17.a(1)).intValue(), ((java.lang.Integer) a17.a(2)).intValue(), ((java.lang.Integer) a17.a(3)).intValue());
                yj0.a.e(mediaMetadataRetriever, scaledFrameAtTime, "com/bumptech/glide/load/resource/bitmap/VideoDecoder", "decodeScaledFrame", "(Landroid/media/MediaMetadataRetriever;JIIILcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;)Landroid/graphics/Bitmap;", "Undefined", "getScaledFrameAtTime", "(JIII)Landroid/graphics/Bitmap;");
                bitmap = scaledFrameAtTime;
            } catch (java.lang.Throwable unused) {
                android.util.Log.isLoggable("VideoDecoder", 3);
            }
        }
        if (bitmap != null) {
            return bitmap;
        }
        zj0.a aVar2 = new zj0.a();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        aVar2.c(java.lang.Integer.valueOf(i17));
        aVar2.c(java.lang.Long.valueOf(j17));
        yj0.a.d(mediaMetadataRetriever, aVar2.b(), "com/bumptech/glide/load/resource/bitmap/VideoDecoder", "decodeOriginalFrame", "(Landroid/media/MediaMetadataRetriever;JI)Landroid/graphics/Bitmap;", "Undefined", "getFrameAtTime", "(JI)Landroid/graphics/Bitmap;");
        zj0.c.f473285a.set(aVar2);
        android.graphics.Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(((java.lang.Long) aVar2.a(0)).longValue(), ((java.lang.Integer) zj0.c.a().a(1)).intValue());
        yj0.a.e(mediaMetadataRetriever, frameAtTime, "com/bumptech/glide/load/resource/bitmap/VideoDecoder", "decodeOriginalFrame", "(Landroid/media/MediaMetadataRetriever;JI)Landroid/graphics/Bitmap;", "Undefined", "getFrameAtTime", "(JI)Landroid/graphics/Bitmap;");
        return frameAtTime;
    }

    @Override // t6.n
    public w6.z0 a(java.lang.Object obj, int i17, int i18, t6.l lVar) {
        long longValue = ((java.lang.Long) lVar.c(f226845d)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new java.lang.IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
        java.lang.Integer num = (java.lang.Integer) lVar.c(f226846e);
        if (num == null) {
            num = 2;
        }
        d7.v vVar = (d7.v) lVar.c(d7.v.f226843f);
        if (vVar == null) {
            vVar = d7.v.f226842e;
        }
        d7.v vVar2 = vVar;
        this.f226850c.getClass();
        android.media.MediaMetadataRetriever mediaMetadataRetriever = new android.media.MediaMetadataRetriever();
        try {
            try {
                this.f226848a.a(mediaMetadataRetriever, obj);
                android.graphics.Bitmap c17 = c(mediaMetadataRetriever, longValue, num.intValue(), i17, i18, vVar2);
                mediaMetadataRetriever.release();
                return d7.e.b(c17, this.f226849b);
            } catch (java.lang.RuntimeException e17) {
                throw new java.io.IOException(e17);
            }
        } catch (java.lang.Throwable th6) {
            mediaMetadataRetriever.release();
            throw th6;
        }
    }

    @Override // t6.n
    public boolean b(java.lang.Object obj, t6.l lVar) {
        return true;
    }
}
