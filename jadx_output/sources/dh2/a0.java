package dh2;

/* loaded from: classes10.dex */
public final class a0 extends bh2.x {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dh2.b0 f232418e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f232419f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(ah2.d dVar, dh2.b0 b0Var, kotlin.jvm.internal.c0 c0Var) {
        super(dVar);
        this.f232418e = b0Var;
        this.f232419f = c0Var;
    }

    @Override // bh2.b
    public void P1(java.lang.String songUniqueId, int i17) {
        om2.q qVar;
        java.lang.String str;
        kotlin.jvm.internal.o.g(songUniqueId, "songUniqueId");
        bh2.b bVar = this.f20908d;
        if (bVar != null) {
            bVar.P1(songUniqueId, i17);
        }
        dh2.b0 b0Var = this.f232418e;
        jh2.c cVar = b0Var.f232426f;
        if (cVar != null) {
            cVar.j();
        }
        om2.s sVar = b0Var.f232423c;
        if (sVar == null || (qVar = sVar.f346380c) == null || (str = qVar.f346373b) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i(b0Var.f232424d, "onPlayBGMEnd accompanyLocalPath: ".concat(str));
        if (this.f232419f.f310112d) {
            return;
        }
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        ah2.d dVar = b0Var.f232425e;
        if (dVar != null) {
            jh2.e eVar = jh2.e.f299813e;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("accBgm play fail; fileExit: ");
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            sb6.append(m17.a() ? m17.f213266a.F(m17.f213267b) : false);
            dVar.e6(songUniqueId, new jh2.d(eVar, i17, sb6.toString(), 0, 0));
        }
    }

    @Override // bh2.b
    public void Y4(java.lang.String songUniqueId, int i17) {
        om2.q qVar;
        java.lang.String str;
        kotlin.jvm.internal.o.g(songUniqueId, "songUniqueId");
        bh2.b bVar = this.f20908d;
        if (bVar != null) {
            bVar.Y4(songUniqueId, i17);
        }
        dh2.b0 b0Var = this.f232418e;
        jh2.c cVar = b0Var.f232426f;
        if (cVar != null) {
            cVar.j();
        }
        om2.s sVar = b0Var.f232423c;
        if (sVar == null || (qVar = sVar.f346380c) == null || (str = qVar.f346373b) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i(b0Var.f232424d, "onChorusPlayError accompanyLocalPath: ".concat(str));
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        ah2.d dVar = b0Var.f232425e;
        if (dVar != null) {
            jh2.e eVar = jh2.e.f299813e;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("accBgm play fail; fileExit: ");
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            sb6.append(m17.a() ? m17.f213266a.F(m17.f213267b) : false);
            dVar.E0(songUniqueId, new jh2.d(eVar, i17, sb6.toString(), 0, 0));
        }
    }

    @Override // bh2.b
    public void a0(java.lang.String songUniqueId, int i17) {
        kotlin.jvm.internal.o.g(songUniqueId, "songUniqueId");
        bh2.b bVar = this.f20908d;
        if (bVar != null) {
            bVar.a0(songUniqueId, i17);
        }
        this.f232419f.f310112d = true;
        dh2.b0 b0Var = this.f232418e;
        b0Var.c(0L);
        dh2.b0.a(b0Var);
    }

    @Override // bh2.b
    public void s0(java.lang.String songUniqueId, long j17) {
        kotlin.jvm.internal.o.g(songUniqueId, "songUniqueId");
        bh2.b bVar = this.f20908d;
        if (bVar != null) {
            bVar.s0(songUniqueId, j17);
        }
        dh2.b0 b0Var = this.f232418e;
        b0Var.c(j17);
        dh2.b0.a(b0Var);
    }

    @Override // bh2.b
    public void y2(java.lang.String songUniqueId, long j17, long j18) {
        kotlin.jvm.internal.o.g(songUniqueId, "songUniqueId");
        bh2.b bVar = this.f20908d;
        if (bVar != null) {
            bVar.y2(songUniqueId, j17, j18);
        }
        this.f232418e.f232430j = j17;
    }
}
