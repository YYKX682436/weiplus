package qd0;

/* loaded from: classes11.dex */
public class n0 implements rd0.a1, rd0.c1 {

    /* renamed from: a, reason: collision with root package name */
    public int f361550a;

    /* renamed from: b, reason: collision with root package name */
    public int f361551b;

    /* renamed from: c, reason: collision with root package name */
    public int f361552c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f361553d;

    /* renamed from: e, reason: collision with root package name */
    public int f361554e;

    /* renamed from: f, reason: collision with root package name */
    public int f361555f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f361556g;

    /* renamed from: h, reason: collision with root package name */
    public int f361557h;

    /* renamed from: i, reason: collision with root package name */
    public int f361558i;

    /* renamed from: j, reason: collision with root package name */
    public java.util.List f361559j;

    /* renamed from: k, reason: collision with root package name */
    public java.util.List f361560k;

    /* renamed from: l, reason: collision with root package name */
    public java.util.List f361561l;

    /* renamed from: m, reason: collision with root package name */
    public p13.c f361562m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f361563n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f361564o;

    /* renamed from: p, reason: collision with root package name */
    public p13.r f361565p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.List f361566q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f361567r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f361568s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f361569t;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.ui.contact.o4 f361570u;

    /* renamed from: v, reason: collision with root package name */
    public rd0.b1 f361571v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f361572w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f361573x;

    /* renamed from: y, reason: collision with root package name */
    public final o13.x f361574y;

    /* renamed from: z, reason: collision with root package name */
    public int f361575z;

    public n0(com.tencent.mm.ui.contact.o4 o4Var, java.util.List list) {
        this.f361550a = Integer.MAX_VALUE;
        this.f361551b = Integer.MAX_VALUE;
        this.f361552c = Integer.MAX_VALUE;
        this.f361553d = true;
        this.f361554e = Integer.MAX_VALUE;
        this.f361555f = Integer.MAX_VALUE;
        this.f361556g = true;
        this.f361557h = Integer.MAX_VALUE;
        this.f361558i = Integer.MAX_VALUE;
        this.f361559j = null;
        this.f361560k = null;
        this.f361561l = null;
        this.f361567r = false;
        this.f361568s = false;
        this.f361569t = false;
        this.f361573x = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f361574y = new qd0.m0(this);
        this.f361575z = 0;
        this.f361570u = o4Var;
        h(list);
    }

    public static void a(qd0.n0 n0Var, java.util.List list, int i17) {
        if (n0Var.f361559j == null) {
            n0Var.f361559j = new java.util.LinkedList();
        }
        java.util.Iterator it = n0Var.f361559j.iterator();
        while (it.hasNext()) {
            if (((p13.y) it.next()).f351184b == i17) {
                it.remove();
            }
        }
        if (list != null) {
            n0Var.f361559j.addAll(list);
        }
    }

    public final boolean b() {
        if (((java.util.ArrayList) this.f361564o).size() <= 0) {
            return true;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        int intValue = ((java.lang.Integer) ((java.util.ArrayList) this.f361564o).remove(0)).intValue();
        p13.u uVar = new p13.u();
        uVar.f351141c = this.f361563n;
        uVar.f351145g = new int[]{intValue};
        uVar.f351148j = hashSet;
        uVar.f351151m = this.f361574y;
        uVar.f351152n = this.f361573x;
        if (intValue == 131075) {
            uVar.f351140b = 32;
            uVar.f351150l = r13.a.f368601d;
        } else {
            uVar.f351140b = 16;
            uVar.f351150l = r13.b.f368602d;
        }
        this.f361562m = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar);
        return false;
    }

    public com.tencent.mm.ui.contact.item.d c(int i17) {
        int i18 = (i17 - this.f361555f) - 1;
        com.tencent.mm.ui.contact.item.h hVar = new com.tencent.mm.ui.contact.item.h(i17);
        p13.y yVar = (p13.y) this.f361560k.get(i18);
        hVar.C = yVar;
        hVar.f206836e = this.f361570u.f207078f;
        hVar.f206855x = true;
        hVar.f206854w = i18 + 1;
        int i19 = yVar.f351184b;
        int i27 = yVar.f351185c;
        hVar.f206853v = i19;
        hVar.f206852u = i27;
        return hVar;
    }

    public com.tencent.mm.ui.contact.item.d d(int i17) {
        int i18 = (i17 - this.f361555f) - 1;
        com.tencent.mm.ui.contact.item.p pVar = new com.tencent.mm.ui.contact.item.p(i17);
        p13.y yVar = (p13.y) this.f361560k.get(i18);
        pVar.C = yVar;
        pVar.f206836e = this.f361570u.f207078f;
        pVar.f206855x = true;
        pVar.f206854w = i18 + 1;
        int i19 = yVar.f351184b;
        int i27 = yVar.f351185c;
        pVar.f206853v = i19;
        pVar.f206852u = i27;
        return pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public com.tencent.mm.ui.contact.item.d e(int i17) {
        com.tencent.mm.ui.contact.item.a1 a1Var;
        com.tencent.mm.ui.contact.item.u uVar;
        com.tencent.mm.ui.contact.item.d c17;
        int i18 = this.f361550a;
        com.tencent.mm.ui.contact.o4 o4Var = this.f361570u;
        if (i17 == i18) {
            c17 = new com.tencent.mm.ui.contact.item.i0(i17);
            c17.f206855x = true;
        } else {
            int i19 = this.f361551b;
            if (i17 == i19) {
                c17 = ((rd0.z0) o4Var).a(com.tencent.mm.R.string.fg7, i17);
            } else {
                int i27 = this.f361552c;
                if (i17 == i27) {
                    c17 = ((rd0.z0) o4Var).a(com.tencent.mm.R.string.ffq, i17);
                } else {
                    int i28 = this.f361555f;
                    if (i17 == i28) {
                        c17 = ((rd0.z0) o4Var).a(com.tencent.mm.R.string.ffp, i17);
                    } else {
                        int i29 = this.f361558i;
                        if (i17 == i29) {
                            c17 = ((rd0.z0) o4Var).a(com.tencent.mm.R.string.ffo, i17);
                        } else {
                            if (i17 == this.f361554e) {
                                boolean z17 = this.f361553d;
                                a1Var = new com.tencent.mm.ui.contact.item.a1(i17);
                                a1Var.C = com.tencent.mm.R.string.ffq;
                                a1Var.D = z17;
                            } else if (i17 == this.f361557h) {
                                boolean z18 = this.f361556g;
                                a1Var = new com.tencent.mm.ui.contact.item.a1(i17);
                                a1Var.C = com.tencent.mm.R.string.ffp;
                                a1Var.D = z18;
                            } else {
                                if (i17 > i29) {
                                    int i37 = (i17 - i29) - 1;
                                    uVar = new com.tencent.mm.ui.contact.item.u(i17);
                                    p13.y yVar = (p13.y) this.f361561l.get(i37);
                                    uVar.C = yVar;
                                    uVar.f206836e = o4Var.f207078f;
                                    uVar.f206855x = true;
                                    uVar.f206854w = i37 + 1;
                                    int i38 = yVar.f351184b;
                                    int i39 = yVar.f351185c;
                                    uVar.f206853v = i38;
                                    uVar.f206852u = i39;
                                } else if (i17 > i28) {
                                    c17 = this.f361572w ? ((rd0.z0) o4Var).c(i17) : ((rd0.z0) o4Var).d(i17);
                                } else if (i17 > i27) {
                                    int i47 = (i17 - i27) - 1;
                                    uVar = new com.tencent.mm.ui.contact.item.u(i17);
                                    p13.y yVar2 = (p13.y) ((java.util.LinkedList) this.f361559j).get(i47);
                                    uVar.C = yVar2;
                                    uVar.f206836e = o4Var.f207078f;
                                    uVar.f206855x = true;
                                    uVar.f206854w = i47 + 1;
                                    int i48 = yVar2.f351184b;
                                    int i49 = yVar2.f351185c;
                                    uVar.f206853v = i48;
                                    uVar.f206852u = i49;
                                    uVar.f206834c = this.f361567r;
                                    uVar.G = this.f361568s;
                                } else {
                                    a1Var = null;
                                    if (i17 > i19) {
                                        throw null;
                                    }
                                    com.tencent.mars.xlog.Log.e("MicroMsg.MMSearchContactAdapter", "unkown position=%d", java.lang.Integer.valueOf(i17));
                                }
                                c17 = uVar;
                            }
                            c17 = a1Var;
                        }
                    }
                }
            }
        }
        if (c17 != null) {
            c17.f206848q = this.f361563n;
            if (c17 instanceof com.tencent.mm.ui.contact.item.a) {
                ((com.tencent.mm.ui.contact.item.a) c17).A = this.f361565p;
            }
            c17.f206851t = o4Var.f207080h;
        }
        return c17;
    }

    public com.tencent.mm.ui.contact.item.d f(int i17, int i18) {
        com.tencent.mm.ui.contact.item.n0 n0Var = new com.tencent.mm.ui.contact.item.n0(i18);
        n0Var.f206903y = this.f361570u.f207076d.getActivity().getResources().getString(i17);
        return n0Var;
    }

    public void g(java.lang.String str, int[] iArr, boolean z17) {
        if (this.f361562m != null) {
            ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(this.f361562m);
            this.f361562m = null;
        }
        this.f361563n = str;
        ((java.util.ArrayList) this.f361564o).clear();
        for (int i17 : iArr) {
            ((java.util.ArrayList) this.f361564o).add(java.lang.Integer.valueOf(i17));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSearchContactAdapter", "doSearch: query=%s", this.f361563n);
        b();
    }

    public final void h(java.util.List list) {
        this.f361566q = list;
        this.f361564o = new java.util.ArrayList();
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSearchContactAdapter", "Create!");
        i();
    }

    public void i() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSearchContactAdapter", "initData!");
        this.f361563n = null;
        this.f361551b = Integer.MAX_VALUE;
        this.f361552c = Integer.MAX_VALUE;
        this.f361553d = true;
        this.f361554e = Integer.MAX_VALUE;
        this.f361555f = Integer.MAX_VALUE;
        this.f361556g = true;
        this.f361557h = Integer.MAX_VALUE;
        this.f361558i = Integer.MAX_VALUE;
        this.f361559j = null;
        this.f361560k = null;
        this.f361561l = null;
        this.f361565p = null;
        this.f361575z = 0;
        com.tencent.mm.ui.contact.o4 o4Var = this.f361570u;
        o4Var.h();
        o4Var.notifyDataSetChanged();
        if (this.f361562m != null) {
            ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(this.f361562m);
            this.f361562m = null;
        }
        o4Var.h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(java.lang.String str, boolean z17, boolean z18) {
        int i17;
        int i18;
        java.util.List list = this.f361559j;
        int i19 = 0;
        int size = list == null ? 0 : ((java.util.LinkedList) list).size();
        java.util.List list2 = this.f361560k;
        int size2 = list2 == null ? 0 : list2.size();
        java.util.List list3 = this.f361561l;
        int size3 = list3 == null ? 0 : list3.size();
        this.f361551b = Integer.MAX_VALUE;
        if (size > 0) {
            this.f361552c = 0;
            if (size <= 3 || (size2 <= 0 && size3 <= 0)) {
                this.f361554e = Integer.MAX_VALUE;
                i19 = 0 + size + 1;
            } else {
                if (this.f361553d) {
                    i18 = 4;
                    this.f361554e = 4;
                } else {
                    i18 = size + 1 + 0;
                    this.f361554e = i18;
                }
                i19 = i18 + 1;
            }
        } else {
            this.f361552c = Integer.MAX_VALUE;
        }
        p13.r rVar = this.f361565p;
        com.tencent.mm.ui.contact.o4 o4Var = this.f361570u;
        if (rVar == null || rVar.f351131c.length <= 1 || o4Var.f207078f) {
            this.f361550a = Integer.MAX_VALUE;
        } else {
            this.f361550a = i19;
            i19++;
        }
        if (size2 > 0) {
            this.f361555f = i19;
            if (size2 <= 3 || size3 <= 0) {
                this.f361557h = Integer.MAX_VALUE;
                i19 += size2 + 1;
            } else {
                if (this.f361556g) {
                    i17 = i19 + 4;
                    this.f361557h = i17;
                } else {
                    i17 = i19 + size2 + 1;
                    this.f361557h = i17;
                }
                i19 = i17 + 1;
            }
        } else {
            this.f361555f = Integer.MAX_VALUE;
        }
        if (size3 > 0) {
            this.f361558i = i19;
            i19 += size3 + 1;
        } else {
            this.f361558i = Integer.MAX_VALUE;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSearchContactAdapter", "setCount %d", java.lang.Integer.valueOf(i19));
        this.f361575z = i19;
        if (z18) {
            ((rd0.z0) o4Var).f(str, z17);
        }
        o4Var.h();
        o4Var.notifyDataSetChanged();
    }

    public n0(com.tencent.mm.ui.contact.o4 o4Var, java.util.List list, boolean z17, int i17) {
        this.f361550a = Integer.MAX_VALUE;
        this.f361551b = Integer.MAX_VALUE;
        this.f361552c = Integer.MAX_VALUE;
        this.f361553d = true;
        this.f361554e = Integer.MAX_VALUE;
        this.f361555f = Integer.MAX_VALUE;
        this.f361556g = true;
        this.f361557h = Integer.MAX_VALUE;
        this.f361558i = Integer.MAX_VALUE;
        this.f361559j = null;
        this.f361560k = null;
        this.f361561l = null;
        this.f361567r = false;
        this.f361568s = false;
        this.f361569t = false;
        this.f361573x = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f361574y = new qd0.m0(this);
        this.f361575z = 0;
        this.f361570u = o4Var;
        this.f361567r = z17;
        this.f361568s = i17 == 1;
        h(list);
    }

    public n0(com.tencent.mm.ui.contact.o4 o4Var, java.util.List list, boolean z17, boolean z18) {
        this.f361550a = Integer.MAX_VALUE;
        this.f361551b = Integer.MAX_VALUE;
        this.f361552c = Integer.MAX_VALUE;
        this.f361553d = true;
        this.f361554e = Integer.MAX_VALUE;
        this.f361555f = Integer.MAX_VALUE;
        this.f361556g = true;
        this.f361557h = Integer.MAX_VALUE;
        this.f361558i = Integer.MAX_VALUE;
        this.f361559j = null;
        this.f361560k = null;
        this.f361561l = null;
        this.f361567r = false;
        this.f361568s = false;
        this.f361569t = false;
        this.f361573x = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f361574y = new qd0.m0(this);
        this.f361575z = 0;
        this.f361570u = o4Var;
        this.f361567r = z17;
        h(list);
        this.f361572w = z18;
    }
}
