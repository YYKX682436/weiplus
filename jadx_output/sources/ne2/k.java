package ne2;

/* loaded from: classes3.dex */
public final class k implements ne2.e {

    /* renamed from: a, reason: collision with root package name */
    public final long f336534a;

    /* renamed from: b, reason: collision with root package name */
    public final int f336535b;

    /* renamed from: c, reason: collision with root package name */
    public final int f336536c;

    /* renamed from: d, reason: collision with root package name */
    public ne2.d f336537d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f336538e;

    /* renamed from: f, reason: collision with root package name */
    public r45.td2 f336539f;

    /* renamed from: g, reason: collision with root package name */
    public r45.q84 f336540g;

    /* renamed from: h, reason: collision with root package name */
    public int f336541h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f336542i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f336543j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f336544k;

    public k(int i17, long j17, int i18, int i19, int i27, kotlin.jvm.internal.i iVar) {
        i18 = (i27 & 4) != 0 ? 5 : i18;
        i19 = (i27 & 8) != 0 ? 30 : i19;
        this.f336534a = j17;
        this.f336535b = i18;
        this.f336536c = i19;
        this.f336543j = jz5.h.b(new ne2.j(this));
        this.f336544k = jz5.h.b(new ne2.h(this));
    }

    public final void b(r45.td2 td2Var) {
        java.lang.String str;
        if (td2Var == null) {
            str = "FinderLiveUrlOption:NULL!";
        } else {
            str = "FinderLiveUrlOption:[" + td2Var.getInteger(1) + ',' + td2Var.getInteger(3) + ']';
        }
        com.tencent.mars.xlog.Log.i("LiveFreeTimeManager", java.lang.String.valueOf(str));
        this.f336539f = td2Var;
    }

    public void c(r45.td2 td2Var) {
        ne2.d dVar;
        this.f336540g = (r45.q84) ((yz5.r) ((jz5.n) this.f336543j).getValue()).C("startTask", 1, java.lang.Long.valueOf(this.f336534a), td2Var);
        b(td2Var);
        r45.q84 q84Var = this.f336540g;
        int integer = q84Var != null ? q84Var.getInteger(2) : 0;
        r45.q84 q84Var2 = this.f336540g;
        this.f336541h = integer - (q84Var2 != null ? q84Var2.getInteger(1) : 0);
        r45.q84 q84Var3 = this.f336540g;
        if (q84Var3 != null && (dVar = this.f336537d) != null) {
            dVar.a(q84Var3);
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f336538e;
        if (b4Var != null) {
            b4Var.d();
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var2 = new com.tencent.mm.sdk.platformtools.b4("LiveFreeTimeManager" + hashCode(), (com.tencent.mm.sdk.platformtools.a4) ((jz5.n) this.f336544k).getValue(), true);
        this.f336538e = b4Var2;
        b4Var2.setLogging(false);
        com.tencent.mm.sdk.platformtools.b4 b4Var3 = this.f336538e;
        if (b4Var3 != null) {
            b4Var3.c(1000L, 1000L);
        }
        this.f336542i = true;
    }

    public void d(long j17, boolean z17, boolean z18) {
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f336538e;
        if (b4Var != null) {
            b4Var.d();
        }
        this.f336542i = false;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stopTask remote liveId:");
        sb6.append(j17);
        sb6.append(",local liveId:");
        long j18 = this.f336534a;
        sb6.append(j18);
        sb6.append(", updateInfo:");
        sb6.append(z17);
        sb6.append(", taskOver:");
        sb6.append(z18);
        com.tencent.mars.xlog.Log.i("LiveFreeTimeManager", sb6.toString());
        if (z17 && j17 == j18) {
            f(z18);
        }
    }

    public boolean e() {
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f336538e;
        return (b4Var == null || b4Var.e()) ? false : true;
    }

    public final void f(boolean z17) {
        if (z17) {
            return;
        }
        be2.c Nj = ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).Nj();
        long j17 = this.f336534a;
        int i17 = this.f336541h;
        rl2.d dVar = (rl2.d) Nj;
        if (!dVar.f397190f) {
            dVar.z0();
        }
        rl2.c cVar = (rl2.c) dVar.f397191g.get(java.lang.Long.valueOf(j17));
        if (cVar != null) {
            cVar.f397185b = i17;
        }
        zl2.r4.f473950a.M2("FinderLiveChargeInfoStorage", "updateLiveChargeInfo " + dVar.f397191g.get(java.lang.Long.valueOf(j17)));
    }
}
