package h7;

/* loaded from: classes13.dex */
public class c implements t6.n {

    /* renamed from: f, reason: collision with root package name */
    public static final h7.a f279323f = new h7.a();

    /* renamed from: g, reason: collision with root package name */
    public static final h7.b f279324g = new h7.b();

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f279325a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f279326b;

    /* renamed from: c, reason: collision with root package name */
    public final h7.b f279327c;

    /* renamed from: d, reason: collision with root package name */
    public final h7.a f279328d;

    /* renamed from: e, reason: collision with root package name */
    public final h7.d f279329e;

    public c(android.content.Context context, java.util.List list, x6.d dVar, x6.b bVar) {
        h7.a aVar = f279323f;
        this.f279325a = context.getApplicationContext();
        this.f279326b = list;
        this.f279328d = aVar;
        this.f279329e = new h7.d(dVar, bVar);
        this.f279327c = f279324g;
    }

    @Override // t6.n
    public w6.z0 a(java.lang.Object obj, int i17, int i18, t6.l lVar) {
        s6.e eVar;
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) obj;
        h7.b bVar = this.f279327c;
        synchronized (bVar) {
            s6.e eVar2 = (s6.e) ((java.util.ArrayDeque) bVar.f279322a).poll();
            if (eVar2 == null) {
                eVar2 = new s6.e();
            }
            eVar = eVar2;
            eVar.f403290b = null;
            java.util.Arrays.fill(eVar.f403289a, (byte) 0);
            eVar.f403291c = new s6.d();
            eVar.f403292d = 0;
            java.nio.ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            eVar.f403290b = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            eVar.f403290b.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        }
        try {
            h7.h c17 = c(byteBuffer, i17, i18, eVar, lVar);
            h7.b bVar2 = this.f279327c;
            synchronized (bVar2) {
                eVar.f403290b = null;
                eVar.f403291c = null;
                ((java.util.ArrayDeque) bVar2.f279322a).offer(eVar);
            }
            return c17;
        } catch (java.lang.Throwable th6) {
            h7.b bVar3 = this.f279327c;
            synchronized (bVar3) {
                eVar.f403290b = null;
                eVar.f403291c = null;
                ((java.util.ArrayDeque) bVar3.f279322a).offer(eVar);
                throw th6;
            }
        }
    }

    @Override // t6.n
    public boolean b(java.lang.Object obj, t6.l lVar) {
        com.bumptech.glide.load.ImageHeaderParser$ImageType imageHeaderParser$ImageType;
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) obj;
        if (((java.lang.Boolean) lVar.c(h7.o.f279367b)).booleanValue()) {
            return false;
        }
        if (byteBuffer == null) {
            imageHeaderParser$ImageType = com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN;
        } else {
            java.util.List list = this.f279326b;
            int size = list.size();
            int i17 = 0;
            while (true) {
                if (i17 >= size) {
                    imageHeaderParser$ImageType = com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN;
                    break;
                }
                com.bumptech.glide.load.ImageHeaderParser$ImageType b17 = ((t6.f) list.get(i17)).b(byteBuffer);
                if (b17 != com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN) {
                    imageHeaderParser$ImageType = b17;
                    break;
                }
                i17++;
            }
        }
        return imageHeaderParser$ImageType == com.bumptech.glide.load.ImageHeaderParser$ImageType.GIF;
    }

    public final h7.h c(java.nio.ByteBuffer byteBuffer, int i17, int i18, s6.e eVar, t6.l lVar) {
        int i19 = q7.j.f360301b;
        long elapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
        try {
            s6.d b17 = eVar.b();
            if (b17.f403280c > 0 && b17.f403279b == 0) {
                android.graphics.Bitmap.Config config = lVar.c(h7.o.f279366a) == t6.b.PREFER_RGB_565 ? android.graphics.Bitmap.Config.RGB_565 : android.graphics.Bitmap.Config.ARGB_8888;
                int min = java.lang.Math.min(b17.f403284g / i18, b17.f403283f / i17);
                int max = java.lang.Math.max(1, min == 0 ? 0 : java.lang.Integer.highestOneBit(min));
                android.util.Log.isLoggable("BufferGifDecoder", 2);
                h7.a aVar = this.f279328d;
                h7.d dVar = this.f279329e;
                aVar.getClass();
                s6.f fVar = new s6.f(dVar, b17, byteBuffer, max);
                fVar.c(config);
                fVar.f403303k = (fVar.f403303k + 1) % fVar.f403304l.f403280c;
                android.graphics.Bitmap b18 = fVar.b();
                if (b18 == null) {
                    return null;
                }
                h7.h hVar = new h7.h(new h7.f(new h7.e(new h7.m(com.bumptech.glide.c.b(this.f279325a), fVar, i17, i18, (c7.e) c7.e.f39518b, b18))));
                if (android.util.Log.isLoggable("BufferGifDecoder", 2)) {
                    q7.j.a(elapsedRealtimeNanos);
                }
                return hVar;
            }
            if (android.util.Log.isLoggable("BufferGifDecoder", 2)) {
                q7.j.a(elapsedRealtimeNanos);
            }
            return null;
        } finally {
            if (android.util.Log.isLoggable("BufferGifDecoder", 2)) {
                q7.j.a(elapsedRealtimeNanos);
            }
        }
    }
}
