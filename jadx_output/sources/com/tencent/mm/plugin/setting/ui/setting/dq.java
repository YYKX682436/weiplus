package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class dq extends wu5.b implements com.tencent.mm.modelbase.u0 {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.setting.ui.setting.gq f160958e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Collection f160959f;

    /* renamed from: g, reason: collision with root package name */
    public int f160960g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f160961h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f160962i = 0;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f160963m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f160964n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI f160965o;

    public dq(com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI unfamiliarContactDetailUI, java.util.Collection collection, com.tencent.mm.plugin.setting.ui.setting.gq gqVar) {
        this.f160965o = unfamiliarContactDetailUI;
        this.f160959f = collection;
        this.f160958e = gqVar;
    }

    @Override // wu5.b
    public boolean b() {
        super.b();
        com.tencent.mm.plugin.setting.ui.setting.gq gqVar = this.f160958e;
        if (gqVar != null) {
            this.f160965o.f160780u.clear();
            com.tencent.mm.plugin.setting.ui.setting.mp mpVar = (com.tencent.mm.plugin.setting.ui.setting.mp) gqVar;
            mpVar.getClass();
            java.lang.String str = com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI.B;
            com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI unfamiliarContactDetailUI = mpVar.f161339a;
            unfamiliarContactDetailUI.V6(false);
            unfamiliarContactDetailUI.f160770h.setText(unfamiliarContactDetailUI.getString(com.tencent.mm.R.string.k2o) + "(" + unfamiliarContactDetailUI.f160779t.size() + ")");
            com.tencent.mm.plugin.setting.ui.setting.xp xpVar = unfamiliarContactDetailUI.f160776q;
            if (xpVar != null) {
                xpVar.notifyDataSetChanged();
            }
        }
        return false;
    }

    @Override // wu5.g
    public java.lang.String getKey() {
        return "delete_contact_task";
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        e21.i iVar;
        r45.j25 j25Var;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        if (m1Var.getType() != 681 || !(m1Var instanceof e21.j)) {
            return;
        }
        e21.j jVar = (e21.j) m1Var;
        e21.g gVar = jVar.f246537e;
        if (gVar == null || (iVar = gVar.f246521b) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.UnfamiliarContactUI", "[onSceneEnd] rr is null!");
            return;
        }
        r45.i25 i25Var = iVar.f246528a;
        int i19 = i25Var.f376687d;
        if (i19 != 0 || (j25Var = i25Var.f376688e) == null || (linkedList = j25Var.f377518e) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.UnfamiliarContactUI", "summeroplog tryStartNetscene onSceneEnd Ret:%d  not ok and no retry.", java.lang.Integer.valueOf(i19));
            return;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) jVar.f246538f;
        com.tencent.mars.xlog.Log.i("MicroMsg.UnfamiliarContactUI", "[onSceneEnd] list size:%s, result:%s", java.lang.Integer.valueOf(arrayList.size()), java.lang.Integer.valueOf(linkedList.size()));
        int i27 = 0;
        while (true) {
            int size = arrayList.size();
            linkedList2 = this.f160963m;
            if (i27 >= size) {
                break;
            }
            xg3.q0 q0Var = (xg3.q0) arrayList.get(i27);
            if (q0Var.b() != 4) {
                com.tencent.mars.xlog.Log.w("MicroMsg.UnfamiliarContactUI", "cmdId:%s operation:%s", java.lang.Integer.valueOf(q0Var.b()), q0Var.toString());
            } else {
                this.f160960g--;
                r45.xb0 xb0Var = (r45.xb0) q0Var.f454431j;
                if (((java.lang.Integer) linkedList.get(i27)).intValue() == 0) {
                    this.f160961h++;
                    com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(x51.j1.g(xb0Var.f389941d), true);
                    if (n17 != null) {
                        n17.s3();
                        c01.w9.h(n17.d1(), null);
                        de0.j jVar2 = (de0.j) i95.n0.c(de0.j.class);
                        java.lang.String d17 = n17.d1();
                        ((ce0.e) jVar2).getClass();
                        com.tencent.mm.modelsimple.g1.I(d17, 15);
                        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().p0(n17.d1(), n17);
                        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().k(n17.d1());
                        linkedList2.add(n17.d1());
                    }
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.UnfamiliarContactUI", "delete contact fail! ret:%s", linkedList.get(i27), x51.j1.g(xb0Var.f389941d));
                }
            }
            i27++;
        }
        if (this.f160960g > 0) {
            return;
        }
        java.util.Iterator it = linkedList2.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI unfamiliarContactDetailUI = this.f160965o;
            if (!hasNext) {
                unfamiliarContactDetailUI.U6(unfamiliarContactDetailUI.f160779t);
                unfamiliarContactDetailUI.runOnUiThread(new com.tencent.mm.plugin.setting.ui.setting.cq(this));
                return;
            } else {
                java.lang.String str2 = (java.lang.String) it.next();
                java.util.Iterator it6 = unfamiliarContactDetailUI.f160779t.iterator();
                while (it6.hasNext()) {
                    if (((com.tencent.mm.plugin.setting.ui.setting.yp) it6.next()).f161800c.d1().equals(str2)) {
                        it6.remove();
                    }
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Collection collection = this.f160959f;
        this.f160960g = collection.size();
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Integer) it.next()).intValue();
            this.f160962i++;
            int size = collection.size();
            int i17 = this.f160962i;
            com.tencent.mm.plugin.setting.ui.setting.xp xpVar = this.f160965o.f160776q;
            if (xpVar != null) {
                com.tencent.mm.storage.z3 z3Var = xpVar.x(intValue).f161800c;
                if (com.tencent.mm.storage.z3.m4(z3Var.d1())) {
                    ((np.h) ((vg3.e4) i95.n0.c(vg3.e4.class))).wi(z3Var.d1());
                } else {
                    r45.xb0 xb0Var = new r45.xb0();
                    r45.du5 du5Var = new r45.du5();
                    java.lang.String d17 = z3Var.d1();
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    if (d17 == null) {
                        d17 = "";
                    }
                    du5Var.f372756d = d17;
                    du5Var.f372757e = true;
                    xb0Var.f389941d = du5Var;
                    java.util.LinkedList linkedList = this.f160964n;
                    linkedList.add(new xg3.p0(4, xb0Var));
                    if (linkedList.size() % 20 == 0 || i17 == size) {
                        gm0.j1.i();
                        gm0.j1.n().f273288b.g(new e21.j(linkedList));
                        linkedList.clear();
                    }
                }
            }
        }
    }
}
