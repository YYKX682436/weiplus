package pb0;

/* loaded from: classes12.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static long f353125e;

    /* renamed from: a, reason: collision with root package name */
    public static final pb0.g f353121a = new pb0.g();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f353122b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f353123c = jz5.h.b(pb0.f.f353120d);

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicLong f353124d = new java.util.concurrent.atomic.AtomicLong(0);

    /* renamed from: f, reason: collision with root package name */
    public static final pb0.d f353126f = new pb0.d();

    public static final void a(pb0.g gVar, android.graphics.Bitmap bitmap, int i17, java.lang.String str, java.lang.Throwable th6) {
        java.lang.String substring;
        java.lang.Object putIfAbsent;
        gVar.getClass();
        java.util.Objects.toString(bitmap);
        bitmap.getWidth();
        bitmap.getHeight();
        java.lang.String stackTraceString = android.util.Log.getStackTraceString(th6);
        kotlin.jvm.internal.o.d(stackTraceString);
        if (r26.n0.N(stackTraceString)) {
            substring = "skipped";
        } else {
            substring = stackTraceString.substring(0, java.lang.Math.min(2048, stackTraceString.length()));
            kotlin.jvm.internal.o.f(substring, "substring(...)");
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f353122b;
        java.lang.Object obj = concurrentHashMap.get(substring);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(substring, (obj = new pb0.a()))) != null) {
            obj = putIfAbsent;
        }
        pb0.a aVar = (pb0.a) obj;
        synchronized (aVar) {
            aVar.put(bitmap, java.lang.Integer.valueOf(i17));
        }
        java.util.concurrent.atomic.AtomicLong atomicLong = f353124d;
        if (atomicLong.getAndIncrement() >= 50) {
            synchronized (atomicLong) {
                if (atomicLong.get() >= 50) {
                    atomicLong.set(0L);
                    ((ku5.t0) ku5.t0.f312615d).h(pb0.c.f353117d, "MicroMsg.HellBitmapTracer");
                }
            }
        }
    }

    public static final void b(yz5.p action) {
        kotlin.jvm.internal.o.g(action, "action");
        f353121a.c();
        java.util.Set entrySet = f353122b.entrySet();
        kotlin.jvm.internal.o.f(entrySet, "<get-entries>(...)");
        for (java.util.Map.Entry entry : kz5.n0.F0(entrySet, new pb0.b())) {
            synchronized (entry.getValue()) {
                action.invoke(entry.getKey(), entry.getValue());
            }
        }
    }

    public static final android.util.Pair d() {
        f353121a.c();
        java.util.Set entrySet = f353122b.entrySet();
        kotlin.jvm.internal.o.f(entrySet, "<get-entries>(...)");
        int i17 = 0;
        long j17 = 0;
        for (java.util.Map.Entry entry : kz5.n0.F0(entrySet, new pb0.b())) {
            synchronized (entry.getValue()) {
                i17 += ((pb0.a) entry.getValue()).size();
                j17 += ((pb0.a) entry.getValue()).a();
                if (java.lang.System.currentTimeMillis() - f353125e < java.util.concurrent.TimeUnit.SECONDS.toMillis(60L)) {
                    com.tencent.mars.xlog.Log.i("DUMP_BITMAP", "count: " + ((pb0.a) entry.getValue()).size() + ", sum byte count: " + ((pb0.a) entry.getValue()).a() + ", " + entry.getValue() + "\n trace: " + ((java.lang.String) entry.getKey()));
                    f353125e = java.lang.System.currentTimeMillis();
                }
            }
        }
        android.util.Pair create = android.util.Pair.create(java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17));
        kotlin.jvm.internal.o.f(create, "create(...)");
        return create;
    }

    public static final void e() {
        java.util.Map k17 = kz5.c1.k(new jz5.l("android/graphics/BitmapFactory", kz5.c0.i(new android.util.Pair("decodeByteArray", "([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;"), new android.util.Pair("decodeByteArray", "([BII)Landroid/graphics/Bitmap;"), new android.util.Pair("decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;"), new android.util.Pair("decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;"), new android.util.Pair("decodeFileDescriptor", "(Ljava/io/FileDescriptor;)Landroid/graphics/Bitmap;"), new android.util.Pair("decodeFileDescriptor", "(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;"), new android.util.Pair("decodeResource", "(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;"), new android.util.Pair("decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;"), new android.util.Pair("decodeResourceStream", "(Landroid/content/res/Resources;Landroid/util/TypedValue;Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;"), new android.util.Pair("decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;"), new android.util.Pair("decodeStream", "(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;"))), new jz5.l("android/graphics/BitmapRegionDecoder", kz5.b0.c(new android.util.Pair("decodeRegion", "(Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;"))), new jz5.l("android/graphics/Bitmap", kz5.c0.i(new android.util.Pair("createBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;"), new android.util.Pair("createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;"), new android.util.Pair("createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;"), new android.util.Pair("createBitmap", "(Landroid/util/DisplayMetrics;IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;"), new android.util.Pair("createBitmap", "(Landroid/util/DisplayMetrics;IILandroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;"), new android.util.Pair("createBitmap", "(Landroid/util/DisplayMetrics;IILandroid/graphics/Bitmap$Config;ZLandroid/graphics/ColorSpace;)Landroid/graphics/Bitmap;"), new android.util.Pair("createBitmap", "(Landroid/util/DisplayMetrics;[IIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;"), new android.util.Pair("createBitmap", "(IILandroid/graphics/Bitmap$Config;ZLandroid/graphics/ColorSpace;)Landroid/graphics/Bitmap;"), new android.util.Pair("createBitmap", "(IILandroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;"), new android.util.Pair("createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;"), new android.util.Pair("createBitmap", "([IIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;"), new android.util.Pair("createBitmap", "([IIIIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;"), new android.util.Pair("createBitmap", "(Landroid/graphics/Picture;)Landroid/graphics/Bitmap;"), new android.util.Pair("createBitmap", "(Landroid/graphics/Picture;IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;"), new android.util.Pair("copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;"))), new jz5.l("android/content/ContentResolver", kz5.b0.c(new android.util.Pair("loadThumbnail", "(Landroid/net/Uri;Landroid/util/Size;Landroid/os/CancellationSignal;)Landroid/graphics/Bitmap;"))), new jz5.l("android/provider/MediaStore$Images$Thumbnails", kz5.c0.i(new android.util.Pair("getThumbnail", "(Landroid/content/ContentResolver;JILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;"), new android.util.Pair("getThumbnail", "(Landroid/content/ContentResolver;JJILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;"))), new jz5.l("android/provider/MediaStore$Video$Thumbnails", kz5.c0.i(new android.util.Pair("getThumbnail", "(Landroid/content/ContentResolver;JILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;"), new android.util.Pair("getThumbnail", "(Landroid/content/ContentResolver;JJILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;"))));
        java.util.List i17 = kz5.c0.i(new android.util.Pair("getFrameAtTime", "(J)Landroid/graphics/Bitmap;"), new android.util.Pair("getFrameAtTime", "(JI)Landroid/graphics/Bitmap;"), new android.util.Pair("getFrameAtTime", "(JILandroid/media/MediaMetadataRetriever$BitmapParams;)Landroid/graphics/Bitmap;"), new android.util.Pair("getScaledFrameAtTime", "(JIII)Landroid/graphics/Bitmap;"), new android.util.Pair("getScaledFrameAtTime", "(JIIILandroid/media/MediaMetadataRetriever$BitmapParams;)Landroid/graphics/Bitmap;"), new android.util.Pair("getFrameAtIndex", "(I)Landroid/graphics/Bitmap;"), new android.util.Pair("getFrameAtIndex", "(ILandroid/media/MediaMetadataRetriever$BitmapParams;)Landroid/graphics/Bitmap;"), new android.util.Pair("getFramesAtIndex", "(II)Ljava/util/List;"), new android.util.Pair("getFramesAtIndex", "(IILandroid/media/MediaMetadataRetriever$BitmapParams;)Ljava/util/List;"), new android.util.Pair("getPrimaryImage", "()Landroid/graphics/Bitmap;"), new android.util.Pair("getPrimaryImage", "(Landroid/media/MediaMetadataRetriever$BitmapParams;)Landroid/graphics/Bitmap;"), new android.util.Pair("getImageAtIndex", "(I)Landroid/graphics/Bitmap;"), new android.util.Pair("getImageAtIndex", "(ILandroid/media/MediaMetadataRetriever$BitmapParams;)Landroid/graphics/Bitmap;"));
        xj0.a h17 = xj0.a.h();
        pb0.d dVar = f353126f;
        h17.j(k17, dVar);
        xj0.a.h().i(i17, dVar);
        com.tencent.mm.graphics.e.j(pb0.e.f353119a);
    }

    public final void c() {
        java.util.Iterator it = f353122b.entrySet().iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            kotlin.jvm.internal.o.f(next, "next(...)");
            pb0.a it6 = (pb0.a) ((java.util.Map.Entry) next).getValue();
            kotlin.jvm.internal.o.g(it6, "it");
            if (java.lang.Boolean.valueOf(it6.isEmpty()).booleanValue()) {
                it.remove();
            }
        }
    }
}
