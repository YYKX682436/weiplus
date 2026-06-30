package s11;

/* loaded from: classes12.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f402105d;

    /* renamed from: e, reason: collision with root package name */
    public final n11.c f402106e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f402107f;

    /* renamed from: g, reason: collision with root package name */
    public final n11.b f402108g;

    /* renamed from: h, reason: collision with root package name */
    public final o11.g f402109h;

    /* renamed from: i, reason: collision with root package name */
    public final p11.k f402110i;

    /* renamed from: m, reason: collision with root package name */
    public final p11.l f402111m;

    /* renamed from: n, reason: collision with root package name */
    public final p11.h f402112n;

    /* renamed from: o, reason: collision with root package name */
    public final o11.d f402113o;

    /* renamed from: p, reason: collision with root package name */
    public final p11.c f402114p;

    /* renamed from: q, reason: collision with root package name */
    public final p11.o f402115q;

    /* renamed from: r, reason: collision with root package name */
    public final p11.b f402116r;

    /* renamed from: s, reason: collision with root package name */
    public final p11.m f402117s;

    /* renamed from: t, reason: collision with root package name */
    public final p11.p f402118t;

    /* renamed from: u, reason: collision with root package name */
    public final p11.a f402119u;

    /* renamed from: v, reason: collision with root package name */
    public final p11.i f402120v;

    public b(java.lang.String str, n11.c cVar, com.tencent.mm.sdk.platformtools.n3 n3Var, o11.g gVar, p11.k kVar, p11.l lVar, n11.b bVar, p11.h hVar, p11.f fVar, p11.e eVar, p11.n nVar) {
        this.f402105d = str;
        this.f402106e = cVar;
        this.f402107f = n3Var;
        this.f402108g = bVar;
        this.f402112n = hVar;
        o11.d dVar = bVar.f334051a;
        this.f402113o = dVar;
        if (gVar == null) {
            this.f402109h = dVar.f342067e;
        } else {
            this.f402109h = gVar;
        }
        if (kVar == null) {
            this.f402110i = kVar;
        } else {
            this.f402110i = kVar;
        }
        if (lVar == null) {
            this.f402111m = dVar.f342072j;
        } else {
            this.f402111m = lVar;
        }
        o11.g gVar2 = this.f402109h;
        p11.c cVar2 = gVar2.f342128z;
        if (cVar2 != null) {
            this.f402114p = cVar2;
        } else {
            this.f402114p = dVar.f342070h;
        }
        this.f402119u = gVar2.A;
        this.f402120v = gVar2.B;
        this.f402115q = dVar.f342068f;
        this.f402116r = dVar.f342069g;
        this.f402117s = dVar.f342073k;
        this.f402118t = dVar.f342076n;
    }

    public final void a(byte[] bArr) {
        o11.g gVar = this.f402109h;
        boolean z17 = gVar.f342105c;
        java.lang.String str = this.f402105d;
        p11.b bVar = this.f402116r;
        if (z17) {
            ((com.tencent.mm.modelimage.loader.impr.a) bVar).d(str, bArr, gVar);
        }
        if (gVar.f342104b) {
            ((com.tencent.mm.modelimage.loader.impr.a) bVar).d(str, bArr, gVar);
        }
    }

    public java.lang.String b(java.lang.String str) {
        o11.g gVar;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || (gVar = this.f402109h) == null) {
            return null;
        }
        if (gVar.f342124v) {
            str = str + "round" + gVar.f342125w;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(gVar.f342122t)) {
            str = str + gVar.f342122t;
        }
        return str + "size" + gVar.f342111i + gVar.f342112j;
    }

    public final android.graphics.Bitmap c(q11.b bVar, android.graphics.Bitmap bitmap) {
        p11.h hVar = this.f402112n;
        if (hVar != null && bVar != null) {
            bVar.f359534d = bitmap;
            android.graphics.Bitmap c17 = hVar.c(this.f402105d, this.f402106e.a(), bVar);
            if (c17 != null && !c17.isRecycled()) {
                return c17;
            }
        }
        return bitmap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:271:0x00b9, code lost:
    
        ((r35.w) r2).b(r15, r13);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 24, insn: 0x01c2: MOVE (r18 I:??[OBJECT, ARRAY]) = (r24 I:??[OBJECT, ARRAY]), block:B:324:0x01c0 */
    /* JADX WARN: Not initialized variable reg: 24, insn: 0x01f6: MOVE (r18 I:??[OBJECT, ARRAY]) = (r24 I:??[OBJECT, ARRAY]), block:B:383:0x01f4 */
    /* JADX WARN: Not initialized variable reg: 25, insn: 0x01c4: MOVE (r3 I:??[OBJECT, ARRAY]) = (r25 I:??[OBJECT, ARRAY]), block:B:324:0x01c0 */
    /* JADX WARN: Removed duplicated region for block: B:278:0x00d9 A[Catch: all -> 0x00e1, TRY_LEAVE, TryCatch #1 {all -> 0x00e1, blocks: (B:301:0x009d, B:253:0x00a7, B:271:0x00b9, B:275:0x00c4, B:278:0x00d9, B:298:0x00cd), top: B:300:0x009d }] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x00e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0618 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r2v14, types: [p11.a] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 1591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s11.b.run():void");
    }
}
