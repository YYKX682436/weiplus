package y5;

/* loaded from: classes14.dex */
public final class c implements y5.e {

    /* renamed from: a, reason: collision with root package name */
    public final r5.c f459421a;

    /* renamed from: b, reason: collision with root package name */
    public final s5.a f459422b;

    /* renamed from: c, reason: collision with root package name */
    public final s5.c f459423c;

    /* renamed from: d, reason: collision with root package name */
    public final a6.a0 f459424d;

    /* renamed from: e, reason: collision with root package name */
    public final a6.n f459425e;

    /* renamed from: f, reason: collision with root package name */
    public final a6.z f459426f;

    /* renamed from: g, reason: collision with root package name */
    public final h6.l f459427g;

    /* renamed from: h, reason: collision with root package name */
    public final v5.h f459428h;

    public c(r5.c registry, s5.a bitmapPool, s5.c referenceCounter, a6.a0 strongMemoryCache, a6.n memoryCacheService, a6.z requestService, h6.l systemCallbacks, v5.h drawableDecoder, h6.k kVar) {
        kotlin.jvm.internal.o.g(registry, "registry");
        kotlin.jvm.internal.o.g(bitmapPool, "bitmapPool");
        kotlin.jvm.internal.o.g(referenceCounter, "referenceCounter");
        kotlin.jvm.internal.o.g(strongMemoryCache, "strongMemoryCache");
        kotlin.jvm.internal.o.g(memoryCacheService, "memoryCacheService");
        kotlin.jvm.internal.o.g(requestService, "requestService");
        kotlin.jvm.internal.o.g(systemCallbacks, "systemCallbacks");
        kotlin.jvm.internal.o.g(drawableDecoder, "drawableDecoder");
        this.f459421a = registry;
        this.f459422b = bitmapPool;
        this.f459423c = referenceCounter;
        this.f459424d = strongMemoryCache;
        this.f459425e = memoryCacheService;
        this.f459426f = requestService;
        this.f459427g = systemCallbacks;
        this.f459428h = drawableDecoder;
    }

    public final coil.memory.MemoryCache$Key a(c6.j request, java.lang.Object data, x5.g fetcher, coil.size.Size size) {
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(fetcher, "fetcher");
        kotlin.jvm.internal.o.g(size, "size");
        java.lang.String c17 = fetcher.c(data);
        if (c17 == null) {
            return null;
        }
        java.util.List list = request.f38838j;
        boolean isEmpty = list.isEmpty();
        c6.p pVar = request.f38840l;
        if (isEmpty) {
            return new coil.memory.MemoryCache$Key.Complex(c17, kz5.p0.f313996d, null, pVar.d());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size2 = list.size() - 1;
        if (size2 >= 0) {
            int i17 = 0;
            while (true) {
                int i18 = i17 + 1;
                arrayList.add("BlurTransformation(radius=" + ((ly.b) ((f6.a) list.get(i17))).f322167a + ')');
                if (i18 > size2) {
                    break;
                }
                i17 = i18;
            }
        }
        return new coil.memory.MemoryCache$Key.Complex(c17, arrayList, size, pVar.d());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(y5.d r20, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.c.b(y5.d, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00bd, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0092, code lost:
    
        if (java.lang.Math.abs(r2 - (r13 * r3)) > 1.0d) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b0, code lost:
    
        if (r10 == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bb, code lost:
    
        if (r18.a() != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (r18.a() != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a2, code lost:
    
        if (java.lang.Math.abs(r2 - r3) <= 1) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(coil.memory.MemoryCache$Key r17, a6.r r18, c6.j r19, coil.size.Size r20) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.c.c(coil.memory.MemoryCache$Key, a6.r, c6.j, coil.size.Size):boolean");
    }
}
