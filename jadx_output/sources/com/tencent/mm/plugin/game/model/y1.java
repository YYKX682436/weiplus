package com.tencent.mm.plugin.game.model;

/* loaded from: classes5.dex */
public class y1 extends com.tencent.mm.plugin.game.model.t1 {

    /* renamed from: a, reason: collision with root package name */
    public final m53.k2 f140526a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f140527b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f140528c;

    /* renamed from: d, reason: collision with root package name */
    public final int f140529d;

    public y1(com.tencent.mm.protobuf.f fVar, boolean z17, boolean z18, int i17) {
        this.f140529d = 0;
        if (fVar == null) {
            this.f140526a = new m53.k2();
            return;
        }
        this.f140526a = (m53.k2) fVar;
        this.f140529d = i17;
        java.util.LinkedList c17 = c();
        this.f140527b = c17;
        java.util.LinkedList b17 = b();
        this.f140528c = b17;
        if (z17) {
            ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ri().J0("pb_library", fVar);
        }
        if (z18) {
            r53.n.c(c17);
            r53.n.c(b17);
        }
    }

    public final java.util.LinkedList b() {
        com.tencent.mm.plugin.game.model.b a17;
        m53.d dVar;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = this.f140526a.f323838e;
        if (linkedList2 == null) {
            return linkedList;
        }
        int i17 = this.f140529d;
        int i18 = i17 + 1;
        int i19 = (i17 / 15) + 901;
        java.util.Iterator it = linkedList2.iterator();
        while (it.hasNext()) {
            m53.f fVar = (m53.f) it.next();
            int i27 = fVar.f323664d;
            if (i27 == 1) {
                a17 = com.tencent.mm.plugin.game.model.t1.a(fVar.f323665e);
                if (a17 != null) {
                    a17.f140214q2 = i18;
                    i18++;
                }
            } else if (i27 == 2 && (dVar = fVar.f323666f) != null) {
                com.tencent.mm.plugin.game.model.b a18 = com.tencent.mm.plugin.game.model.t1.a(dVar.f323609d);
                if (a18 != null) {
                    a18.f140205h2 = 1;
                    m53.d dVar2 = fVar.f323666f;
                    a18.f140208k2 = dVar2.f323611f;
                    a18.f140209l2 = dVar2.f323610e;
                    a18.f140214q2 = i19;
                    i19++;
                }
                a17 = a18;
            } else {
                a17 = null;
            }
            if (a17 != null) {
                a17.f140212o2 = 11;
                a17.f140213p2 = 1111;
                linkedList.add(a17);
            }
        }
        return linkedList;
    }

    public final java.util.LinkedList c() {
        m53.i4 i4Var;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        m53.u3 u3Var = this.f140526a.f323837d;
        if (u3Var != null && (i4Var = u3Var.f324100e) != null && (linkedList = i4Var.f323792d) != null) {
            java.util.Iterator it = linkedList.iterator();
            int i17 = 1;
            while (it.hasNext()) {
                m53.j4 j4Var = (m53.j4) it.next();
                com.tencent.mm.plugin.game.model.b a17 = com.tencent.mm.plugin.game.model.t1.a(j4Var.f323821d);
                if (a17 != null) {
                    a17.f140217t2 = j4Var.f323821d.f323730t;
                    a17.f140212o2 = 11;
                    a17.f140213p2 = 1110;
                    a17.f140214q2 = i17;
                    linkedList2.add(a17);
                    i17++;
                }
            }
        }
        return linkedList2;
    }

    public y1(byte[] bArr) {
        this.f140529d = 0;
        m53.k2 k2Var = new m53.k2();
        this.f140526a = k2Var;
        if (bArr == null || bArr.length == 0) {
            return;
        }
        try {
            k2Var.parseFrom(bArr);
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GamePBDataLibrary", "Parsing Failed: %s", e17.getMessage());
        }
        java.util.LinkedList c17 = c();
        this.f140527b = c17;
        java.util.LinkedList b17 = b();
        this.f140528c = b17;
        r53.n.c(c17);
        r53.n.c(b17);
    }
}
