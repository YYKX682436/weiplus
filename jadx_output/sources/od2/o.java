package od2;

/* loaded from: classes11.dex */
public class o extends u13.g {

    /* renamed from: q, reason: collision with root package name */
    public ya2.b2 f344632q;

    /* renamed from: r, reason: collision with root package name */
    public final od2.m f344633r;

    /* renamed from: s, reason: collision with root package name */
    public p13.y f344634s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f344635t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f344636u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.CharSequence f344637v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.CharSequence f344638w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f344639x;

    /* renamed from: y, reason: collision with root package name */
    public final od2.n f344640y;

    public o(int i17) {
        super(17, i17);
        this.f344633r = new od2.m(this);
        this.f344640y = new od2.n(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    @Override // u13.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.content.Context r8, u13.e r9, java.lang.Object... r10) {
        /*
            r7 = this;
            p13.y r9 = r7.f344634s
            java.lang.String r9 = r9.f351187e
            r7.f344636u = r9
            java.lang.Class<zy2.b6> r9 = zy2.b6.class
            i95.m r9 = i95.n0.c(r9)
            zy2.b6 r9 = (zy2.b6) r9
            java.lang.String r10 = r7.f344636u
            c61.l7 r9 = (c61.l7) r9
            r9.getClass()
            java.lang.String r0 = "username"
            kotlin.jvm.internal.o.g(r10, r0)
            com.tencent.mm.plugin.finder.storage.o80 r9 = r9.Jj()
            ya2.b2 r9 = r9.y0(r10)
            r7.f344632q = r9
            if (r9 == 0) goto L31
            com.tencent.mm.storage.z3 r10 = new com.tencent.mm.storage.z3
            r10.<init>()
            r9.P0(r10)
            r7.f344635t = r10
        L31:
            java.lang.String r9 = r7.f344636u
            java.lang.String r9 = o13.n.d(r9)
            p13.y r10 = r7.f344634s
            int r10 = r10.f351185c
            r0 = 0
            r1 = 1
            if (r10 == r1) goto L4b
            r2 = 2
            if (r10 == r2) goto L49
            r2 = 3
            if (r10 == r2) goto L48
            r3 = r0
            r4 = r3
            goto L4f
        L48:
            r0 = r1
        L49:
            r10 = r1
            goto L4c
        L4b:
            r10 = r0
        L4c:
            r3 = r10
            r4 = r0
            r0 = r1
        L4f:
            r10 = 2131165797(0x7f070265, float:1.7945821E38)
            java.lang.Class<le0.x> r1 = le0.x.class
            if (r0 == 0) goto L80
            i95.m r0 = i95.n0.c(r1)
            le0.x r0 = (le0.x) r0
            int r10 = i65.a.h(r8, r10)
            float r10 = (float) r10
            ke0.e r0 = (ke0.e) r0
            r0.getClass()
            android.text.SpannableString r1 = com.tencent.mm.pluginsdk.ui.span.c0.n(r8, r9, r10)
            r7.f344637v = r1
            p13.r r2 = r7.f423762e
            int r8 = com.tencent.mm.plugin.fts.ui.b.f138016a
            float r5 = (float) r8
            android.text.TextPaint r6 = com.tencent.mm.plugin.fts.ui.d.f138034c
            p13.i r8 = p13.i.e(r1, r2, r3, r4, r5, r6)
            p13.j r8 = o13.q.e(r8)
            java.lang.CharSequence r8 = r8.f351105a
            r7.f344637v = r8
            goto L96
        L80:
            i95.m r0 = i95.n0.c(r1)
            le0.x r0 = (le0.x) r0
            int r10 = i65.a.h(r8, r10)
            float r10 = (float) r10
            ke0.e r0 = (ke0.e) r0
            r0.getClass()
            android.text.SpannableString r8 = com.tencent.mm.pluginsdk.ui.span.c0.n(r8, r9, r10)
            r7.f344637v = r8
        L96:
            java.lang.String r8 = ""
            r7.f344639x = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: od2.o.a(android.content.Context, u13.e, java.lang.Object[]):void");
    }

    @Override // u13.g
    public java.lang.String d() {
        return this.f344636u;
    }

    @Override // u13.g
    public java.lang.String f() {
        com.tencent.mm.storage.z3 z3Var = this.f344635t;
        return z3Var != null ? z3Var.P0() : "";
    }

    @Override // u13.g
    public int j() {
        return this.f344634s.f351200r;
    }

    @Override // u13.g
    public u13.f k() {
        return this.f344633r;
    }
}
