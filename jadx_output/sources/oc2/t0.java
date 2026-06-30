package oc2;

/* loaded from: classes8.dex */
public final class t0 extends qz5.l implements yz5.p {
    public int A;
    public int B;
    public /* synthetic */ java.lang.Object C;
    public final /* synthetic */ java.util.List D;
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.render.RenderView E;
    public final /* synthetic */ int F;
    public final /* synthetic */ r45.st3 G;
    public final /* synthetic */ oc2.w H;
    public final /* synthetic */ boolean I;

    /* renamed from: J, reason: collision with root package name */
    public final /* synthetic */ r45.st3 f344252J;
    public final /* synthetic */ oc2.e K;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f344253d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f344254e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f344255f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f344256g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f344257h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f344258i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f344259m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Object f344260n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Object f344261o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Object f344262p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.Object f344263q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.Object f344264r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.Object f344265s;

    /* renamed from: t, reason: collision with root package name */
    public long f344266t;

    /* renamed from: u, reason: collision with root package name */
    public long f344267u;

    /* renamed from: v, reason: collision with root package name */
    public int f344268v;

    /* renamed from: w, reason: collision with root package name */
    public int f344269w;

    /* renamed from: x, reason: collision with root package name */
    public int f344270x;

    /* renamed from: y, reason: collision with root package name */
    public int f344271y;

    /* renamed from: z, reason: collision with root package name */
    public int f344272z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(java.util.List list, com.tencent.mm.plugin.finder.extension.reddot.render.RenderView renderView, int i17, r45.st3 st3Var, oc2.w wVar, boolean z17, r45.st3 st3Var2, oc2.e eVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.D = list;
        this.E = renderView;
        this.F = i17;
        this.G = st3Var;
        this.H = wVar;
        this.I = z17;
        this.f344252J = st3Var2;
        this.K = eVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        oc2.t0 t0Var = new oc2.t0(this.D, this.E, this.F, this.G, this.H, this.I, this.f344252J, this.K, continuation);
        t0Var.C = obj;
        return t0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((oc2.t0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0a37, code lost:
    
        r34 = r6;
        r30 = r8;
        r6 = r0;
        r20 = r10;
        r1 = r27;
        r2 = r28;
        r5 = r5;
        r7 = r34;
        r3 = r50;
        r4 = r4;
        r31 = r18;
        r28 = r23;
        r24 = r25;
        r18 = r12;
        r12 = r13;
        r23 = r22;
        r13 = r9;
        r22 = r11;
        r11 = r14;
        r14 = r26;
        r26 = r15;
        r15 = r13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0993  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0a4b  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x05d3 A[LOOP:11: B:257:0x0574->B:290:0x05d3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x05d8 A[EDGE_INSN: B:291:0x05d8->B:292:0x05d8 BREAK  A[LOOP:11: B:257:0x0574->B:290:0x05d3], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x07df  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0b32  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0b80 A[LOOP:3: B:83:0x0b7a->B:85:0x0b80, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0b35  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x090e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0a60  */
    /* JADX WARN: Type inference failed for: r1v95, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v31, types: [oc2.z, android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v45, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v38, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0972 -> B:5:0x098b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x08ce -> B:6:0x0908). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r50) {
        /*
            Method dump skipped, instructions count: 2969
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oc2.t0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
