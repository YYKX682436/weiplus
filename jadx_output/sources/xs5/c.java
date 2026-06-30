package xs5;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final xs5.c f456416a = new xs5.c();

    /* renamed from: b, reason: collision with root package name */
    public static xs5.a f456417b;

    public static /* synthetic */ void g(xs5.c cVar, xs5.b bVar, boolean z17, boolean z18, boolean z19, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        if ((i17 & 8) != 0) {
            z19 = false;
        }
        cVar.f(bVar, z17, z18, z19);
    }

    public final void a(r45.vs2 vs2Var, boolean z17) {
        r45.xs2 c17 = c();
        c17.set(17, 1);
        c17.set(13, java.lang.Integer.valueOf(z17 ? 1 : 0));
        vs2Var.f388488f = new com.tencent.mm.protobuf.g(c17.toByteArray());
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.f03 d17 = d();
        d17.f373892i = "NearbyEntrance";
        linkedList.add(d17);
        r45.f03 e17 = e();
        e17.f373892i = "NearbyLiveTab";
        e17.f373893m = "NearbyEntrance";
        linkedList.add(e17);
        vs2Var.f388489g = linkedList;
    }

    public final void b(r45.vs2 vs2Var, boolean z17, boolean z18, boolean z19, boolean z27) {
        r45.xs2 c17 = c();
        c17.set(17, 0);
        c17.set(13, java.lang.Integer.valueOf(z17 ? 1 : 0));
        r45.wo1 wo1Var = new r45.wo1();
        c17.set(0, java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
        wo1Var.set(0, java.lang.Boolean.TRUE);
        long j17 = z18 ? 3L : 1L;
        if (z19) {
            j17 |= 8;
        }
        if (z27) {
            j17 |= 4;
        }
        wo1Var.set(1, java.lang.Long.valueOf(j17));
        wo1Var.set(2, 100);
        wo1Var.set(3, java.lang.Long.valueOf((c01.id.c() / 1000) + 300));
        wo1Var.set(4, 60);
        c17.set(30, wo1Var);
        if (z27) {
            r45.y62 y62Var = new r45.y62();
            y62Var.set(1, java.lang.Double.valueOf(0.8d));
            y62Var.set(0, 1);
            c17.set(31, y62Var);
        }
        vs2Var.f388488f = new com.tencent.mm.protobuf.g(c17.toByteArray());
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.f03 d17 = d();
        d17.f373892i = "FinderLiveEntrance";
        linkedList.add(d17);
        r45.f03 e17 = e();
        e17.f373893m = "FinderLiveEntrance";
        e17.f373892i = "NearbyLiveTab";
        linkedList.add(e17);
        long j18 = c17.getLong(3);
        r45.f03 f03Var = new r45.f03();
        f03Var.f373891h = 1;
        f03Var.f373894n = 1;
        f03Var.f373895o = new com.tencent.mm.protobuf.g(new r45.j03().toByteArray());
        f03Var.f373898r = f456416a.h();
        f03Var.f373887d = 15;
        com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo finderTipsShowEntranceExtInfo = new com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo();
        finderTipsShowEntranceExtInfo.set(2, 2);
        finderTipsShowEntranceExtInfo.set(5, "testreport");
        finderTipsShowEntranceExtInfo.set(0, java.lang.Long.valueOf(j18));
        f03Var.f373895o = new com.tencent.mm.protobuf.g(finderTipsShowEntranceExtInfo.toByteArray());
        f03Var.f373892i = "FinderLiveEntrance";
        linkedList.add(f03Var);
        vs2Var.f388489g = linkedList;
    }

    public final r45.xs2 c() {
        r45.xs2 xs2Var = new r45.xs2();
        xs2Var.set(12, java.lang.Integer.valueOf(h()));
        xs5.a aVar = f456417b;
        if (aVar == null) {
            kotlin.jvm.internal.o.o("currentRedDotData");
            throw null;
        }
        xs2Var.set(3, java.lang.Long.valueOf(aVar.f456404a));
        xs2Var.set(9, 12);
        xs5.a aVar2 = f456417b;
        if (aVar2 == null) {
            kotlin.jvm.internal.o.o("currentRedDotData");
            throw null;
        }
        xs2Var.set(8, aVar2.f456407d);
        xs5.a aVar3 = f456417b;
        if (aVar3 == null) {
            kotlin.jvm.internal.o.o("currentRedDotData");
            throw null;
        }
        xs2Var.set(14, aVar3.f456408e);
        xs5.a aVar4 = f456417b;
        if (aVar4 == null) {
            kotlin.jvm.internal.o.o("currentRedDotData");
            throw null;
        }
        xs2Var.set(15, aVar4.f456409f);
        xs5.a aVar5 = f456417b;
        if (aVar5 != null) {
            xs2Var.set(16, aVar5.f456410g);
            return xs2Var;
        }
        kotlin.jvm.internal.o.o("currentRedDotData");
        throw null;
    }

    public final r45.f03 d() {
        r45.f03 f03Var = new r45.f03();
        f03Var.f373891h = 1;
        xs5.a aVar = f456417b;
        if (aVar == null) {
            kotlin.jvm.internal.o.o("currentRedDotData");
            throw null;
        }
        f03Var.f373890g = aVar.f456405b;
        f03Var.f373889f = "直播中";
        f03Var.f373894n = 1;
        f03Var.f373887d = 16;
        com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo finderTipsShowEntranceExtInfo = new com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo();
        xs5.a aVar2 = f456417b;
        if (aVar2 == null) {
            kotlin.jvm.internal.o.o("currentRedDotData");
            throw null;
        }
        finderTipsShowEntranceExtInfo.set(0, java.lang.Long.valueOf(aVar2.f456404a));
        finderTipsShowEntranceExtInfo.set(2, 12);
        f03Var.f373895o = new com.tencent.mm.protobuf.g(finderTipsShowEntranceExtInfo.toByteArray());
        return f03Var;
    }

    public final r45.f03 e() {
        r45.f03 f03Var = new r45.f03();
        f03Var.f373891h = 1;
        f03Var.f373894n = 2;
        f03Var.f373895o = new com.tencent.mm.protobuf.g(new r45.j03().toByteArray());
        f03Var.f373898r = f456416a.h();
        f03Var.f373887d = 15;
        return f03Var;
    }

    public final void f(xs5.b redDotType, boolean z17, boolean z18, boolean z19) {
        kotlin.jvm.internal.o.g(redDotType, "redDotType");
        if (f456417b == null) {
            return;
        }
        r45.vs2 vs2Var = new r45.vs2();
        vs2Var.f388486d = 400000;
        vs2Var.f388491i = 0;
        vs2Var.f388487e = 16;
        vs2Var.f388490h = "test";
        r45.dz2 dz2Var = new r45.dz2();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.gz2 gz2Var = new r45.gz2();
        gz2Var.set(0, vs2Var);
        linkedList.add(gz2Var);
        dz2Var.set(0, linkedList);
        int ordinal = redDotType.ordinal();
        if (ordinal == 0) {
            b(vs2Var, true, z17, z18, z19);
        } else if (ordinal == 1) {
            b(vs2Var, false, z17, z18, z19);
        } else if (ordinal == 2) {
            a(vs2Var, true);
        } else if (ordinal == 3) {
            a(vs2Var, false);
        }
        ((com.tencent.mm.plugin.finder.extension.reddot.x2) ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk()).e1(dz2Var, "nearbyRedDotGenerateTest");
        ((sq2.g) ((ys5.f) i95.n0.c(ys5.f.class))).getClass();
        pq2.e.f357587u = 1;
    }

    public final int h() {
        try {
            xs5.a aVar = f456417b;
            if (aVar != null) {
                return java.lang.Integer.parseInt(aVar.f456406c);
            }
            kotlin.jvm.internal.o.o("currentRedDotData");
            throw null;
        } catch (java.lang.NumberFormatException unused) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("saveCurrentTestRedDot NumberFormatException jumpTabId: ");
            xs5.a aVar2 = f456417b;
            if (aVar2 == null) {
                kotlin.jvm.internal.o.o("currentRedDotData");
                throw null;
            }
            sb6.append(aVar2.f456406c);
            com.tencent.mars.xlog.Log.i("NearbyRedDotGenerate", sb6.toString());
            return 0;
        }
    }
}
