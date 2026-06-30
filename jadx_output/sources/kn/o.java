package kn;

/* loaded from: classes4.dex */
public class o extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0, m65.a {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f309434d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f309435e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f309436f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f309437g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f309438h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f309439i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f309440m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f309441n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f309442o;

    /* renamed from: p, reason: collision with root package name */
    public int f309443p = 0;

    public o(java.lang.String str, java.util.List list, java.lang.String str2, java.lang.String str3) {
        if (list != null && list.size() > 0) {
        }
        list.size();
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.w90();
        lVar.f70665b = new r45.x90();
        lVar.f70666c = "/cgi-bin/micromsg-bin/createchatroom";
        lVar.f70667d = 119;
        lVar.f70668e = 37;
        lVar.f70669f = 1000000037;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f309435e = a17;
        r45.w90 w90Var = (r45.w90) a17.f70710a.f70684a;
        w90Var.f388978d = x51.j1.i(str);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str4 = (java.lang.String) it.next();
            r45.kk4 kk4Var = new r45.kk4();
            kk4Var.f378780d = x51.j1.i(str4);
            linkedList.add(kk4Var);
        }
        w90Var.f388980f = linkedList;
        w90Var.f388979e = linkedList.size();
        w90Var.f388984m = str2;
        w90Var.f388983i = str3;
        this.f309436f = new java.util.LinkedList();
        this.f309437g = new java.util.LinkedList();
        this.f309438h = new java.util.LinkedList();
        this.f309439i = new java.util.LinkedList();
        this.f309440m = new java.util.LinkedList();
        this.f309441n = new java.util.LinkedList();
        this.f309442o = "";
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f309434d = u0Var;
        return dispatch(sVar, this.f309435e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 119;
    }

    @Override // m65.a
    public o65.b l(o65.b bVar) {
        if (!(bVar instanceof o65.d)) {
            return bVar;
        }
        o65.d dVar = (o65.d) bVar;
        dVar.f343218i = this.f309442o;
        dVar.f343211b = this.f309436f;
        dVar.f343217h = this.f309443p;
        dVar.f343210a = this.f309440m;
        dVar.f343212c = this.f309437g;
        dVar.f343213d = this.f309438h;
        dVar.f343215f = new java.util.LinkedList();
        dVar.f343214e = this.f309439i;
        dVar.f343216g = this.f309441n;
        return dVar;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.modelbase.o oVar = this.f309435e;
        r45.x90 x90Var = (r45.x90) oVar.f70711b.f70700a;
        this.f309442o = x51.j1.g(x90Var.f389889i);
        int retCode = oVar.f70711b.getRetCode();
        this.f309443p = x90Var.f389887g;
        java.util.LinkedList linkedList = x90Var.f389888h;
        for (int i27 = 0; i27 < linkedList.size(); i27++) {
            int i28 = ((r45.lk4) linkedList.get(i27)).f379544e;
            if (i28 == 0) {
                ((java.util.LinkedList) this.f309440m).add(x51.j1.g(((r45.lk4) linkedList.get(i27)).f379543d));
            } else if (i28 == 3) {
                r45.du5 du5Var = ((r45.lk4) linkedList.get(i27)).f379543d;
                ((java.util.LinkedList) this.f309437g).add(x51.j1.g(((r45.lk4) linkedList.get(i27)).f379543d));
            } else if (i28 == 1) {
                r45.du5 du5Var2 = ((r45.lk4) linkedList.get(i27)).f379543d;
                ((java.util.LinkedList) this.f309438h).add(x51.j1.g(((r45.lk4) linkedList.get(i27)).f379543d));
            } else if (i28 == 2) {
                r45.du5 du5Var3 = ((r45.lk4) linkedList.get(i27)).f379543d;
                ((java.util.LinkedList) this.f309436f).add(x51.j1.g(((r45.lk4) linkedList.get(i27)).f379543d));
            } else if (i28 == 4) {
                r45.du5 du5Var4 = ((r45.lk4) linkedList.get(i27)).f379543d;
                ((java.util.LinkedList) this.f309439i).add(x51.j1.g(((r45.lk4) linkedList.get(i27)).f379543d));
            } else if (i28 != 5 && i28 != 6) {
                if (i28 == 10) {
                    r45.du5 du5Var5 = ((r45.lk4) linkedList.get(i27)).f379543d;
                    ((java.util.LinkedList) this.f309441n).add(x51.j1.g(((r45.lk4) linkedList.get(i27)).f379543d));
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneCreateChatRoom", "unknown member status : status = " + i28);
                }
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f309442o) && retCode == 0) {
            if (!x51.j1.g(x90Var.f389889i).toLowerCase().endsWith("@chatroom") || x90Var.f389887g == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneCreateChatRoom", "CreateChatroom: room:[" + x90Var.f389889i + "] listCnt:" + x90Var.f389887g);
            } else {
                com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
                z3Var.M1(x51.j1.g(x90Var.f389884d));
                z3Var.R1(x51.j1.g(x90Var.f389885e));
                z3Var.S1(x51.j1.g(x90Var.f389886f));
                z3Var.X1(x51.j1.g(x90Var.f389889i));
                com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
                if (!Bi.j0(z3Var.d1())) {
                    Bi.h0(z3Var);
                }
                com.tencent.mm.modelavatar.r0 r0Var = new com.tencent.mm.modelavatar.r0();
                r0Var.f70529a = z3Var.d1();
                r0Var.f70533e = x90Var.f389891n;
                r0Var.f70532d = x90Var.f389892o;
                r0Var.f70530b = 3;
                r0Var.f70534f = 0;
                r0Var.f70537i = -1;
                ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                com.tencent.mm.modelavatar.d1.Ni().y0(r0Var);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (int i29 = 0; i29 < linkedList.size(); i29++) {
                    if (((r45.lk4) linkedList.get(i29)).f379544e == 0) {
                        com.tencent.mm.storage.z3 n17 = Bi.n(x51.j1.g(((r45.lk4) linkedList.get(i29)).f379543d), true);
                        if (((int) n17.E2) != 0) {
                            n17.G2();
                            Bi.p0(n17.d1(), n17);
                        } else {
                            c01.v1.H(n17, (r45.lk4) linkedList.get(i29));
                            Bi.h0(n17);
                        }
                        arrayList.add(n17.d1());
                    }
                }
                if (!arrayList.contains(c01.z1.r())) {
                    arrayList.add(c01.z1.r());
                    arrayList.contains(c01.z1.r());
                }
                c01.v1.t(z3Var.d1(), arrayList, c01.z1.r());
            }
        }
        this.f309434d.onSceneEnd(i18, i19, str, this);
    }
}
