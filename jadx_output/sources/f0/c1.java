package f0;

/* loaded from: classes14.dex */
public final class c1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f258029d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f258030e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0.p2 f258031f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f258032g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f258033h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f258034i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f258035m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f258036n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ f0.r1 f258037o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f258038p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f258039q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(float f17, kotlin.jvm.internal.e0 e0Var, b0.p2 p2Var, kotlin.jvm.internal.c0 c0Var, boolean z17, float f18, kotlin.jvm.internal.f0 f0Var, int i17, f0.r1 r1Var, int i18, kotlin.jvm.internal.h0 h0Var) {
        super(1);
        this.f258029d = f17;
        this.f258030e = e0Var;
        this.f258031f = p2Var;
        this.f258032g = c0Var;
        this.f258033h = z17;
        this.f258034i = f18;
        this.f258035m = f0Var;
        this.f258036n = i17;
        this.f258037o = r1Var;
        this.f258038p = i18;
        this.f258039q = h0Var;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v20 float, still in use, count: 2, list:
          (r7v20 float) from 0x003d: PHI (r7v17 float) = (r7v4 float), (r7v20 float) binds: [B:43:0x003a, B:6:0x002b] A[DONT_GENERATE, DONT_INLINE]
          (r7v20 float) from 0x0029: CMP_L (r7v20 float), (r2v2 float) A[WRAPPED]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.c1.invoke(java.lang.Object):java.lang.Object");
    }
}
