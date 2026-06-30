package hy0;

/* loaded from: classes5.dex */
public final class n0 extends hy0.h0 implements iy0.b {

    /* renamed from: c, reason: collision with root package name */
    public final int f285891c;

    /* renamed from: d, reason: collision with root package name */
    public final float f285892d;

    /* renamed from: e, reason: collision with root package name */
    public final float f285893e;

    /* renamed from: f, reason: collision with root package name */
    public final int f285894f;

    /* renamed from: g, reason: collision with root package name */
    public final int f285895g;

    /* renamed from: h, reason: collision with root package name */
    public final int f285896h;

    /* renamed from: i, reason: collision with root package name */
    public final int f285897i;

    /* renamed from: j, reason: collision with root package name */
    public final int f285898j;

    /* renamed from: k, reason: collision with root package name */
    public final int f285899k;

    /* renamed from: l, reason: collision with root package name */
    public final android.graphics.Rect f285900l;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Rect f285901m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.RectF f285902n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.RectF f285903o;

    /* renamed from: p, reason: collision with root package name */
    public final android.graphics.RectF f285904p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f285905q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f285906r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f285907s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f285908t;

    /* renamed from: u, reason: collision with root package name */
    public final android.graphics.Path f285909u;

    /* renamed from: v, reason: collision with root package name */
    public final android.graphics.RectF f285910v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ hy0.y0 f285911w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(hy0.y0 y0Var, android.content.Context context) {
        super(y0Var);
        kotlin.jvm.internal.o.g(context, "context");
        this.f285911w = y0Var;
        this.f285891c = (int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * 2);
        this.f285892d = (int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * 4);
        float f17 = 3;
        this.f285893e = (int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * f17);
        this.f285894f = (int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * 12);
        this.f285895g = (int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * f17);
        this.f285896h = (int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * f17);
        this.f285897i = (int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * f17);
        this.f285898j = (int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * 19);
        this.f285899k = (int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * 16);
        this.f285900l = new android.graphics.Rect();
        this.f285901m = new android.graphics.Rect();
        this.f285902n = new android.graphics.RectF();
        this.f285903o = new android.graphics.RectF();
        this.f285904p = new android.graphics.RectF();
        this.f285905q = jz5.h.b(new hy0.m0(context));
        this.f285906r = jz5.h.b(new hy0.l0(context));
        this.f285907s = jz5.h.b(new hy0.k0(context));
        this.f285908t = jz5.h.b(new hy0.j0(context));
        this.f285909u = new android.graphics.Path();
        this.f285910v = new android.graphics.RectF();
    }

    @Override // iy0.c
    public void a(android.graphics.Canvas canvas, hy0.z2 context) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(context, "context");
        ex0.a0 a0Var = context.f286046b;
        java.util.Iterator it = a0Var.f257097g.f257179g.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ex0.q qVar = (ex0.q) it.next();
            com.tencent.maas.base.MJID mjid = qVar.f257168b;
            ex0.r n17 = a0Var.n();
            if (!kotlin.jvm.internal.o.b(mjid, n17 != null ? n17.f257168b : null)) {
                h(canvas, context, qVar, false);
            }
        }
        ex0.r n18 = a0Var.n();
        ex0.q qVar2 = n18 instanceof ex0.q ? (ex0.q) n18 : null;
        if (qVar2 != null) {
            h(canvas, context, qVar2, true);
        }
    }

    public final void g(android.graphics.Canvas canvas, android.graphics.RectF rectF) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        hy0.y0 y0Var = this.f285911w;
        float f17 = (((float) ((currentTimeMillis - y0Var.f286034u) % 800)) / ((float) 800)) * 360.0f;
        canvas.save();
        canvas.rotate(f17, rectF.centerX(), rectF.centerY());
        canvas.drawBitmap((android.graphics.Bitmap) ((jz5.n) y0Var.f286033t).getValue(), (android.graphics.Rect) null, rectF, (android.graphics.Paint) null);
        canvas.restore();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v89 float, still in use, count: 2, list:
          (r0v89 float) from 0x0113: PHI (r0v91 float) = (r0v89 float), (r0v90 float), (r0v98 float) binds: [B:33:0x010f, B:31:0x0111, B:24:0x00fc] A[DONT_GENERATE, DONT_INLINE]
          (r0v89 float) from 0x010d: CMP_G (r0v89 float), (0.0f float) A[WRAPPED]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
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
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
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
    /* JADX WARN: Removed duplicated region for block: B:39:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x032f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(android.graphics.Canvas r38, hy0.z2 r39, ex0.q r40, boolean r41) {
        /*
            Method dump skipped, instructions count: 1398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hy0.n0.h(android.graphics.Canvas, hy0.z2, ex0.q, boolean):void");
    }
}
