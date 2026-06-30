package j23;

/* loaded from: classes12.dex */
public class g extends com.tencent.mm.plugin.fts.ui.a {

    /* renamed from: p, reason: collision with root package name */
    public boolean f297271p;

    public g(android.content.Context context, t13.j jVar, int i17) {
        super(context, jVar, i17);
        this.f297271p = false;
    }

    @Override // t13.k
    public int getType() {
        return 48;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public p13.e l(int i17, long j17, t13.i iVar) {
        if (i17 >= iVar.f414570f.size() || i17 < 0) {
            return null;
        }
        p13.y yVar = (p13.y) iVar.f414570f.get(i17);
        p13.e eVar = new p13.e();
        if (yVar.f351187e.equals("create_chatroom\u200b")) {
            eVar.f351075c = 20;
            eVar.f351079g = java.lang.String.valueOf(yVar.hashCode());
        } else {
            if (yVar.f351184b != 131075) {
                return null;
            }
            eVar.f351075c = 4;
            eVar.f351079g = java.lang.String.valueOf(yVar.hashCode());
        }
        return eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0043  */
    @Override // com.tencent.mm.plugin.fts.ui.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public u13.g o(int r5, t13.i r6) {
        /*
            r4 = this;
            int r0 = r6.f414565a
            int r0 = r5 - r0
            int r0 = r0 + (-1)
            java.util.List r1 = r6.f414570f
            int r1 = r1.size()
            if (r0 >= r1) goto L40
            if (r0 < 0) goto L40
            java.util.List r1 = r6.f414570f
            java.lang.Object r1 = r1.get(r0)
            p13.y r1 = (p13.y) r1
            java.lang.String r2 = r1.f351187e
            java.lang.String r3 = "create_chatroom\u200b"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L2c
            e23.x r1 = new e23.x
            r1.<init>(r5)
            p13.r r5 = r6.f414571g
            r1.f423762e = r5
            goto L41
        L2c:
            int r2 = r1.f351184b
            r3 = 131075(0x20003, float:1.83675E-40)
            if (r2 != r3) goto L40
            u13.g r5 = r4.p(r3, r5, r1, r6)
            int r2 = r1.f351184b
            int r1 = r1.f351185c
            r5.n(r2, r1)
            r1 = r5
            goto L41
        L40:
            r1 = 0
        L41:
            if (r1 == 0) goto L54
            int r5 = r0 + 1
            r1.f423767j = r5
            java.util.List r5 = r6.f414570f
            int r5 = r5.size()
            int r5 = r5 + (-1)
            if (r0 != r5) goto L54
            r5 = 0
            r1.f423761d = r5
        L54:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j23.g.o(int, t13.i):u13.g");
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public u13.g p(int i17, int i18, p13.y yVar, t13.i iVar) {
        e23.s1 s1Var = new e23.s1(i18);
        s1Var.f246958q = yVar;
        s1Var.f423762e = iVar.f414571g;
        s1Var.n(yVar.f351184b, yVar.f351185c);
        return s1Var;
    }

    @Override // com.tencent.mm.plugin.fts.ui.a
    public p13.c q(com.tencent.mm.sdk.platformtools.n3 n3Var, java.util.HashSet hashSet) {
        this.f297271p = false;
        ((s50.m0) ((u50.x) i95.n0.c(u50.x.class))).x1();
        ((ku5.t0) ku5.t0.f312615d).h(new j23.f(this), "WCSearchGroupTrain.init");
        p13.u uVar = new p13.u();
        uVar.f351140b = 96;
        uVar.f351147i = 3;
        uVar.f351141c = this.f138007i;
        uVar.f351148j = hashSet;
        uVar.f351150l = r13.a.f368601d;
        uVar.f351151m = this;
        uVar.f351152n = n3Var;
        return ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0111  */
    @Override // com.tencent.mm.plugin.fts.ui.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s(p13.v r13, java.util.HashSet r14) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j23.g.s(p13.v, java.util.HashSet):void");
    }
}
