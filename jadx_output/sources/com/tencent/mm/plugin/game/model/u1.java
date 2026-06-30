package com.tencent.mm.plugin.game.model;

/* loaded from: classes5.dex */
public class u1 extends com.tencent.mm.plugin.game.model.t1 {

    /* renamed from: a, reason: collision with root package name */
    public final m53.n2 f140484a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f140485b;

    /* renamed from: c, reason: collision with root package name */
    public final int f140486c;

    public u1(com.tencent.mm.protobuf.f fVar, int i17, int i18) {
        int i19;
        this.f140486c = 0;
        if (fVar == null) {
            this.f140484a = new m53.n2();
            return;
        }
        m53.n2 n2Var = (m53.n2) fVar;
        this.f140484a = n2Var;
        this.f140486c = i17;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = n2Var.f323923d;
        if (linkedList2 != null) {
            int i27 = i18 + 1;
            java.util.Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.game.model.b a17 = com.tencent.mm.plugin.game.model.t1.a((m53.h) it.next());
                if (a17 != null) {
                    int i28 = this.f140486c;
                    if (i28 != 1) {
                        if (i28 == 2) {
                            a17.f140212o2 = 15;
                            a17.f140213p2 = com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.t.CTRL_INDEX;
                            i19 = i27 + 1;
                            a17.f140214q2 = i27;
                        }
                        linkedList.add(a17);
                    } else {
                        a17.f140212o2 = 16;
                        a17.f140213p2 = 1601;
                        i19 = i27 + 1;
                        a17.f140214q2 = i27;
                    }
                    i27 = i19;
                    linkedList.add(a17);
                }
            }
        }
        this.f140485b = linkedList;
        r53.n.c(linkedList);
    }
}
