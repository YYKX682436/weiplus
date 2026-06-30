package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class s7 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f199912a = new java.lang.Object();

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f199913b = false;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f199914c = false;

    /* renamed from: d, reason: collision with root package name */
    public int f199915d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f199916e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final sb5.x1 f199917f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.component.ig f199918g;

    public s7(yb5.d dVar) {
        this.f199917f = ((com.tencent.mm.ui.chatting.component.n7) ((sb5.g0) dVar.f460708c.a(sb5.g0.class))).n0();
        this.f199918g = ((com.tencent.mm.ui.chatting.component.n7) ((sb5.g0) dVar.f460708c.a(sb5.g0.class))).o0();
    }

    public final void a(java.lang.String str) {
        java.util.List y57;
        com.tencent.mm.storage.f9 f9Var;
        if (android.text.TextUtils.isEmpty(str) || (y57 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().y5(str, 1)) == null || y57.isEmpty() || (f9Var = (com.tencent.mm.storage.f9) y57.get(0)) == null) {
            return;
        }
        com.tencent.mm.storage.ma c17 = c();
        p75.n0 n0Var = dm.da.f236423n;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        linkedList2.add(dm.da.f236424o.u());
        p75.i0 g17 = dm.da.f236423n.g(linkedList);
        g17.f352657d = null;
        g17.d(linkedList2);
        g17.b(linkedList3);
        g17.c(1, 0);
        com.tencent.mm.storage.oa oaVar = (com.tencent.mm.storage.oa) g17.a().o(c17.f193147g.Q4(), com.tencent.mm.storage.oa.class);
        if (oaVar == null || f9Var.getMsgId() != oaVar.field_msgId) {
            ((com.tencent.mm.ui.chatting.component.m7) this.f199917f).a(((com.tencent.mm.ui.chatting.component.t7) this.f199918g).a(str));
        }
    }

    public final java.util.List b(int i17, int i18, java.lang.String str, long j17) {
        p75.n0 n0Var = dm.c8.f236162y0;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        linkedList.add(dm.c8.f236159l1);
        p75.m c17 = dm.c8.f236164z1.o(java.lang.Long.valueOf(j17 - 1)).c(dm.c8.A1.j(str));
        p75.j0 j0Var = new p75.j0(i17, i18);
        linkedList2.add(dm.c8.f236164z1.u());
        p75.i0 g17 = dm.c8.f236162y0.g(linkedList);
        g17.f352657d = c17;
        g17.d(linkedList2);
        g17.b(linkedList3);
        g17.c(j0Var.f352667a, j0Var.f352668b);
        return g17.a().j(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().f193989r);
    }

    public final com.tencent.mm.storage.ma c() {
        androidx.lifecycle.c1 a17;
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(com.tencent.mm.storage.na.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(com.tencent.mm.storage.na.class);
        }
        return (com.tencent.mm.storage.ma) ((com.tencent.mm.storage.na) a17).P6(com.tencent.mm.storage.ma.class);
    }
}
