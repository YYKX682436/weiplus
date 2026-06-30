package r5;

/* loaded from: classes14.dex */
public final class p implements r5.j {

    /* renamed from: b, reason: collision with root package name */
    public final c6.c f392557b;

    /* renamed from: c, reason: collision with root package name */
    public final s5.a f392558c;

    /* renamed from: d, reason: collision with root package name */
    public final a6.s f392559d;

    /* renamed from: e, reason: collision with root package name */
    public final r5.f f392560e;

    /* renamed from: f, reason: collision with root package name */
    public final h6.j f392561f;

    /* renamed from: g, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f392562g;

    /* renamed from: h, reason: collision with root package name */
    public final a6.a f392563h;

    /* renamed from: i, reason: collision with root package name */
    public final a6.n f392564i;

    /* renamed from: j, reason: collision with root package name */
    public final a6.z f392565j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.List f392566k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f392567l;

    public p(android.content.Context context, c6.c defaults, s5.a bitmapPool, a6.s memoryCache, l36.m callFactory, r5.f eventListenerFactory, r5.c componentRegistry, h6.j options, h6.k kVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(defaults, "defaults");
        kotlin.jvm.internal.o.g(bitmapPool, "bitmapPool");
        kotlin.jvm.internal.o.g(memoryCache, "memoryCache");
        kotlin.jvm.internal.o.g(callFactory, "callFactory");
        kotlin.jvm.internal.o.g(eventListenerFactory, "eventListenerFactory");
        kotlin.jvm.internal.o.g(componentRegistry, "componentRegistry");
        kotlin.jvm.internal.o.g(options, "options");
        this.f392557b = defaults;
        this.f392558c = bitmapPool;
        this.f392559d = memoryCache;
        this.f392560e = eventListenerFactory;
        this.f392561f = options;
        oz5.i a17 = kotlinx.coroutines.t3.a(null, 1, null);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        this.f392562g = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) a17).plus(((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h).plus(new r5.o(kotlinx.coroutines.q0.f310567d, this)));
        s5.c cVar = memoryCache.f1692c;
        this.f392563h = new a6.a(this, cVar, null);
        a6.n nVar = new a6.n(cVar, memoryCache.f1690a, memoryCache.f1691b);
        this.f392564i = nVar;
        a6.z zVar = new a6.z(null);
        this.f392565j = zVar;
        v5.h hVar = new v5.h(bitmapPool);
        h6.l lVar = new h6.l(this, context, options.f279127c);
        r5.b bVar = new r5.b(componentRegistry);
        bVar.b(new z5.e(), java.lang.String.class);
        bVar.b(new z5.a(), android.net.Uri.class);
        bVar.b(new z5.d(context), android.net.Uri.class);
        bVar.b(new z5.c(context), java.lang.Integer.class);
        bVar.a(new x5.k(callFactory), android.net.Uri.class);
        bVar.a(new x5.l(callFactory), l36.k0.class);
        bVar.a(new x5.h(options.f279125a), java.io.File.class);
        bVar.a(new x5.a(context), android.net.Uri.class);
        bVar.a(new x5.c(context), android.net.Uri.class);
        bVar.a(new x5.m(context, hVar), android.net.Uri.class);
        bVar.a(new x5.d(hVar), android.graphics.drawable.Drawable.class);
        bVar.a(new x5.b(), android.graphics.Bitmap.class);
        v5.c cVar2 = new v5.c(context);
        java.util.List list = bVar.f392516d;
        ((java.util.ArrayList) list).add(cVar2);
        java.util.List S0 = kz5.n0.S0(bVar.f392513a);
        this.f392566k = kz5.n0.u0(S0, new y5.c(new r5.c(S0, kz5.n0.S0(bVar.f392514b), kz5.n0.S0(bVar.f392515c), kz5.n0.S0(list)), bitmapPool, memoryCache.f1692c, memoryCache.f1690a, nVar, zVar, lVar, hVar, null));
        this.f392567l = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:(2:3|(4:5|6|7|8))|7|8|(2:(0)|(1:78))) */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02f3, code lost:
    
        if (r3 == r5) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0110, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x03fa, code lost:
    
        r3 = r6;
        r12 = r11;
        r6 = r27;
        r11 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x03eb, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x03f4, code lost:
    
        r2 = r6;
        r6 = r10;
        r3 = r11;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x002e. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x03f5: MOVE (r6 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:199:0x03f4 */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x03fd: MOVE (r11 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:197:0x03fa */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x03f6: MOVE (r3 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:199:0x03f4 */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x03fb: MOVE (r12 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:197:0x03fa */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02c2 A[Catch: all -> 0x0110, TryCatch #0 {all -> 0x0110, blocks: (B:84:0x00bd, B:105:0x0297, B:107:0x02c2, B:110:0x02d9, B:116:0x0109), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02d9 A[Catch: all -> 0x0110, TRY_LEAVE, TryCatch #0 {all -> 0x0110, blocks: (B:84:0x00bd, B:105:0x0297, B:107:0x02c2, B:110:0x02d9, B:116:0x0109), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0250 A[Catch: all -> 0x025d, TryCatch #8 {all -> 0x025d, blocks: (B:125:0x0237, B:129:0x0250, B:130:0x0260, B:138:0x023e), top: B:124:0x0237, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x026d A[Catch: all -> 0x0408, TryCatch #4 {all -> 0x0408, blocks: (B:119:0x0225, B:121:0x0229, B:131:0x0269, B:133:0x026d, B:134:0x0270, B:141:0x0400, B:143:0x0404, B:144:0x0407, B:148:0x0233, B:171:0x01ef, B:174:0x01fb, B:177:0x0208, B:182:0x040c, B:183:0x0411, B:125:0x0237, B:129:0x0250, B:130:0x0260, B:138:0x023e), top: B:170:0x01ef, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x023e A[Catch: all -> 0x025d, TryCatch #8 {all -> 0x025d, blocks: (B:125:0x0237, B:129:0x0250, B:130:0x0260, B:138:0x023e), top: B:124:0x0237, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0233 A[Catch: all -> 0x0408, TRY_LEAVE, TryCatch #4 {all -> 0x0408, blocks: (B:119:0x0225, B:121:0x0229, B:131:0x0269, B:133:0x026d, B:134:0x0270, B:141:0x0400, B:143:0x0404, B:144:0x0407, B:148:0x0233, B:171:0x01ef, B:174:0x01fb, B:177:0x0208, B:182:0x040c, B:183:0x0411, B:125:0x0237, B:129:0x0250, B:130:0x0260, B:138:0x023e), top: B:170:0x01ef, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0458 A[Catch: all -> 0x004f, TRY_LEAVE, TryCatch #11 {all -> 0x004f, blocks: (B:13:0x0049, B:15:0x0446, B:20:0x0458, B:35:0x0414, B:37:0x0418, B:41:0x0461, B:42:0x046c), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x03e0 A[Catch: all -> 0x03e6, TRY_LEAVE, TryCatch #3 {all -> 0x03e6, blocks: (B:25:0x03db, B:30:0x03e0), top: B:24:0x03db }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0418 A[Catch: all -> 0x004f, TryCatch #11 {all -> 0x004f, blocks: (B:13:0x0049, B:15:0x0446, B:20:0x0458, B:35:0x0414, B:37:0x0418, B:41:0x0461, B:42:0x046c), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0461 A[Catch: all -> 0x004f, TRY_ENTER, TryCatch #11 {all -> 0x004f, blocks: (B:13:0x0049, B:15:0x0446, B:20:0x0458, B:35:0x0414, B:37:0x0418, B:41:0x0461, B:42:0x046c), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0389 A[Catch: all -> 0x039a, TryCatch #6 {all -> 0x039a, blocks: (B:69:0x0381, B:71:0x0389, B:73:0x038d, B:76:0x0396, B:77:0x0399), top: B:68:0x0381 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02fe A[Catch: all -> 0x03eb, TRY_LEAVE, TryCatch #7 {all -> 0x03eb, blocks: (B:22:0x0072, B:23:0x03cd, B:86:0x02f7, B:88:0x02fe, B:96:0x03a2, B:98:0x03a6), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03a2 A[Catch: all -> 0x03eb, TRY_ENTER, TryCatch #7 {all -> 0x03eb, blocks: (B:22:0x0072, B:23:0x03cd, B:86:0x02f7, B:88:0x02fe, B:96:0x03a2, B:98:0x03a6), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /* JADX WARN: Type inference failed for: r0v18, types: [androidx.lifecycle.x, coil.memory.BaseRequestDelegate] */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r11v43, types: [coil.memory.RequestDelegate] */
    /* JADX WARN: Type inference failed for: r11v44, types: [coil.memory.RequestDelegate] */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r11v49 */
    /* JADX WARN: Type inference failed for: r11v50 */
    /* JADX WARN: Type inference failed for: r14v6, types: [androidx.lifecycle.x, coil.memory.ViewTargetRequestDelegate] */
    /* JADX WARN: Type inference failed for: r15v0, types: [androidx.lifecycle.o] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v28, types: [coil.memory.RequestDelegate] */
    /* JADX WARN: Type inference failed for: r27v0, types: [int, coil.memory.RequestDelegate] */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v5, types: [coil.memory.RequestDelegate] */
    /* JADX WARN: Type inference failed for: r6v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(r5.p r25, c6.j r26, int r27, kotlin.coroutines.Continuation r28) {
        /*
            Method dump skipped, instructions count: 1170
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.p.a(r5.p, c6.j, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public c6.e b(c6.j request) {
        kotlin.jvm.internal.o.g(request, "request");
        kotlinx.coroutines.r2 d17 = kotlinx.coroutines.l.d(this.f392562g, null, null, new r5.k(this, request, null), 3, null);
        e6.b bVar = request.f38831c;
        return bVar instanceof e6.c ? new c6.r(h6.d.b(((coil.target.ImageViewTarget) ((e6.c) bVar)).f43914d).a(d17), (e6.c) bVar) : new c6.a(d17);
    }
}
