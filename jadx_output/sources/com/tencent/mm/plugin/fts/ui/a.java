package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public abstract class a extends t13.b implements o13.x {

    /* renamed from: h, reason: collision with root package name */
    public long f138006h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f138007i;

    /* renamed from: m, reason: collision with root package name */
    public p13.c f138008m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f138009n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.HashSet f138010o;

    public a(android.content.Context context, t13.j jVar, int i17) {
        super(context, jVar, i17);
        this.f138009n = java.util.Collections.synchronizedList(new java.util.LinkedList());
        this.f138010o = new java.util.HashSet();
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        int i17 = vVar.f351158c;
        t13.j jVar = this.f414558d;
        p13.u uVar = vVar.f351156a;
        if (i17 == -3 || i17 == -2 || i17 == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.BaseNativeFTSUIUnit", "onSearchError: type=%d | errorCode=%d | originQuery=%s", java.lang.Integer.valueOf(getType()), java.lang.Integer.valueOf(vVar.f351158c), uVar.f351141c);
            if (uVar.f351141c.equals(this.f138007i)) {
                jVar.a(this, uVar.f351141c, false);
                return;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.FTS.BaseNativeFTSUIUnit", "Native Search: Not Same Query");
                return;
            }
        }
        if (i17 != 0) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.BaseNativeFTSUIUnit", "search type %d | result %d", java.lang.Integer.valueOf(getType()), java.lang.Integer.valueOf(vVar.f351160e.size()));
        java.lang.String str = this.f138007i;
        if (str == null || !str.equals(uVar.f351141c)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.BaseNativeFTSUIUnit", "Native Search: Not Same query origin:%s current:%s", uVar.f351141c, this.f138007i);
            return;
        }
        this.f138006h = java.lang.System.currentTimeMillis();
        java.util.HashSet hashSet = uVar.f351148j;
        this.f138010o = hashSet;
        s(vVar, hashSet);
        jVar.a(this, uVar.f351141c, true);
        this.f414561g = this.f138009n.size();
    }

    @Override // t13.k
    public u13.g b(int i17) {
        java.util.List list = this.f138009n;
        int size = list.size();
        int i18 = 0;
        while (true) {
            u13.g gVar = null;
            if (i18 >= size) {
                return null;
            }
            t13.i iVar = (t13.i) list.get(i18);
            if (iVar.f414565a == i17 && iVar.f414566b) {
                gVar = m(i17, iVar);
            } else {
                int i19 = iVar.f414567c;
                if (i19 == i17 && iVar.f414568d) {
                    gVar = n(i17, iVar);
                } else if (i17 <= i19) {
                    gVar = o(i17, iVar);
                }
            }
            if (gVar != null) {
                if (gVar.f423759b == iVar.f414567c) {
                    gVar.f423761d = false;
                }
                gVar.f423765h = this.f414560f;
                gVar.f423762e = iVar.f414571g;
                gVar.f423764g = iVar.f414569e;
                return gVar;
            }
            i18++;
        }
    }

    @Override // t13.k
    public void c() {
        this.f138007i = null;
        this.f414561g = 0;
        this.f138010o.clear();
        this.f138009n.clear();
    }

    @Override // t13.k
    public void cancelSearch() {
        if (this.f138008m != null) {
            ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(this.f138008m);
            this.f138008m = null;
        }
    }

    @Override // t13.k
    public long d() {
        return this.f138006h;
    }

    @Override // t13.k
    public int e() {
        return r();
    }

    @Override // t13.k
    public void f(java.lang.String str, com.tencent.mm.sdk.platformtools.n3 n3Var, java.util.HashSet hashSet, long j17) {
        cancelSearch();
        c();
        this.f138007i = str;
        this.f138008m = q(n3Var, hashSet);
    }

    @Override // t13.k
    public java.util.LinkedList g() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.List list = this.f138009n;
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            t13.i iVar = (t13.i) list.get(i17);
            int i18 = iVar.f414565a;
            if (i18 != Integer.MAX_VALUE && iVar.f414566b) {
                linkedList.add(java.lang.Integer.valueOf(i18));
            }
        }
        return linkedList;
    }

    @Override // t13.k
    public java.util.List h(long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.f138006h > 0) {
            int i17 = 0;
            while (true) {
                java.util.List list = this.f138009n;
                if (i17 >= list.size()) {
                    break;
                }
                t13.i iVar = (t13.i) list.get(i17);
                int size = iVar.f414570f.size() + iVar.f414574j;
                for (int i18 = 0; i18 < size; i18++) {
                    p13.e l17 = l(i18, j17, iVar);
                    if (l17 != null) {
                        l17.f351078f = this.f138006h - j17;
                        if (iVar.f414566b) {
                            l17.f351074b = iVar.f414565a + i18 + 1;
                        } else {
                            l17.f351074b = iVar.f414565a + i18;
                        }
                        l17.f351076d = 1;
                        l17.f351073a = i18;
                        l17.f351084l = com.tencent.mm.plugin.fts.ui.x2.b(((p13.y) iVar.f414570f.get(i18)).f351184b, ((p13.y) iVar.f414570f.get(i18)).f351185c, ((p13.y) iVar.f414570f.get(i18)).f351201s);
                        arrayList.add(l17);
                    }
                }
                if (iVar.f414568d) {
                    p13.e eVar = new p13.e();
                    eVar.f351079g = java.lang.String.valueOf(iVar.hashCode());
                    eVar.f351076d = 2;
                    eVar.f351073a = size;
                    int i19 = iVar.f414569e;
                    if (i19 == -3) {
                        eVar.f351075c = 4;
                    } else if (i19 == -4) {
                        eVar.f351075c = 3;
                    } else if (i19 == -1) {
                        eVar.f351075c = 12;
                    } else if (i19 == -2) {
                        eVar.f351075c = 11;
                    } else if (i19 == -6) {
                        eVar.f351075c = 10;
                    } else if (i19 == -13) {
                        eVar.f351075c = 19;
                    } else if (i19 == -7 || i19 == -27 || i19 == -29) {
                        eVar.f351075c = 5;
                    } else if (i19 == -24) {
                        eVar.f351075c = 33;
                    } else if (i19 == -23) {
                        eVar.f351075c = 31;
                    } else if (i19 == -28) {
                        eVar.f351075c = 36;
                    } else if (i19 == -30) {
                        eVar.f351075c = 39;
                    } else if (i19 == -32) {
                        eVar.f351075c = 40;
                    } else {
                        eVar = null;
                    }
                    if (eVar != null) {
                        eVar.f351078f = this.f138006h - j17;
                        eVar.f351074b = iVar.f414567c;
                        arrayList.add(eVar);
                    }
                }
                i17++;
            }
        }
        return arrayList;
    }

    @Override // t13.k
    public int j(int i17) {
        java.util.List list = this.f138009n;
        int size = list.size();
        for (int i18 = 0; i18 < size; i18++) {
            t13.i iVar = (t13.i) list.get(i18);
            iVar.f414565a = i17;
            if (iVar.f414566b) {
                i17++;
            }
            i17 += iVar.f414570f.size() + iVar.f414574j;
            iVar.f414567c = i17;
            if (iVar.f414568d) {
                i17++;
            }
        }
        return i17;
    }

    public p13.e l(int i17, long j17, t13.i iVar) {
        return null;
    }

    public e23.g0 m(int i17, t13.i iVar) {
        return new e23.g0(i17);
    }

    public e23.s0 n(int i17, t13.i iVar) {
        e23.s0 s0Var = new e23.s0(i17);
        s0Var.f423767j = iVar.f414567c - iVar.f414565a;
        s0Var.f423772o = true;
        return s0Var;
    }

    public abstract u13.g o(int i17, t13.i iVar);

    public u13.g p(int i17, int i18, p13.y yVar, t13.i iVar) {
        return null;
    }

    public abstract p13.c q(com.tencent.mm.sdk.platformtools.n3 n3Var, java.util.HashSet hashSet);

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0030. Please report as an issue. */
    public int r() {
        java.util.List list = this.f138009n;
        int size = list.size();
        int i17 = 0;
        for (int i18 = 0; i18 < size; i18++) {
            java.util.Iterator it = ((t13.i) list.get(i18)).f414570f.iterator();
            while (it.hasNext()) {
                java.lang.String str = ((p13.y) it.next()).f351187e;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str == null) {
                    str = "";
                }
                char c17 = 65535;
                switch (str.hashCode()) {
                    case -19329355:
                        if (str.equals("create_chatroom\u200b")) {
                            c17 = 0;
                            break;
                        }
                        break;
                    case 255180560:
                        if (str.equals("no_result\u200b")) {
                            c17 = 1;
                            break;
                        }
                        break;
                    case 541269703:
                        if (str.equals("create_talker_message\u200b")) {
                            c17 = 2;
                            break;
                        }
                        break;
                }
                switch (c17) {
                    case 0:
                    case 1:
                    case 2:
                        break;
                    default:
                        i17++;
                        break;
                }
            }
        }
        return i17;
    }

    public abstract void s(p13.v vVar, java.util.HashSet hashSet);
}
