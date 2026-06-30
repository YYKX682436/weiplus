package com.tencent.mm.sns_compose.page;

/* loaded from: classes14.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f193588d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f193589e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f193590f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(java.util.List list, java.lang.String str, yz5.l lVar) {
        super(3);
        this.f193588d = list;
        this.f193589e = str;
        this.f193590f = lVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean z17;
        d0.z zVar;
        z0.p pVar;
        boolean z18;
        n0.h3 h3Var;
        d0.z MediaContent = (d0.z) obj;
        n0.o oVar = (n0.o) obj2;
        int intValue = ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(MediaContent, "$this$MediaContent");
        if ((intValue & 14) == 0) {
            intValue |= ((n0.y0) oVar).e(MediaContent) ? 4 : 2;
        }
        if ((intValue & 91) == 18) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        java.lang.Object obj4 = n0.e1.f333492a;
        java.util.List list = this.f193588d;
        if (list.isEmpty()) {
            com.tencent.mars.xlog.Log.e("WithFriendsPage.ListItems", "image content media list is empty");
        } else {
            int i17 = z0.t.f468922q1;
            z0.p pVar2 = z0.p.f468921d;
            z0.t f17 = d0.a3.f(pVar2, 0.0f, 1, null);
            java.lang.String str = this.f193589e;
            n0.y0 y0Var2 = (n0.y0) oVar;
            y0Var2.U(693286680);
            d0.d dVar = d0.p.f225184b;
            int i18 = z0.d.f468903a;
            s1.t0 a17 = d0.n2.a(dVar, z0.a.f468898j, y0Var2, 0);
            y0Var2.U(-1323940314);
            n0.h3 h3Var2 = androidx.compose.ui.platform.m2.f10646e;
            p2.f fVar = (p2.f) y0Var2.i(h3Var2);
            n0.h3 h3Var3 = androidx.compose.ui.platform.m2.f10652k;
            p2.s sVar = (p2.s) y0Var2.i(h3Var3);
            n0.h3 h3Var4 = androidx.compose.ui.platform.m2.f10656o;
            androidx.compose.ui.platform.k4 k4Var = (androidx.compose.ui.platform.k4) y0Var2.i(h3Var4);
            u1.g.f423594i1.getClass();
            yz5.a aVar = u1.f.f423587b;
            yz5.q a18 = s1.g0.a(f17);
            boolean z19 = y0Var2.f333761b instanceof n0.e;
            if (!z19) {
                n0.l.a();
                throw null;
            }
            y0Var2.X();
            if (y0Var2.L) {
                y0Var2.j(aVar);
            } else {
                y0Var2.i0();
            }
            y0Var2.f333784y = false;
            yz5.p pVar3 = u1.f.f423590e;
            n0.i5.a(y0Var2, a17, pVar3);
            yz5.p pVar4 = u1.f.f423589d;
            n0.i5.a(y0Var2, fVar, pVar4);
            yz5.p pVar5 = u1.f.f423591f;
            n0.i5.a(y0Var2, sVar, pVar5);
            yz5.p pVar6 = u1.f.f423592g;
            n0.i5.a(y0Var2, k4Var, pVar6);
            y0Var2.n();
            ((u0.i) a18).invoke(new n0.i4(y0Var2), y0Var2, 0);
            y0Var2.U(2058660585);
            y0Var2.U(-678309503);
            d0.q2 q2Var = d0.q2.f225198a;
            z0.t a19 = d0.o2.a(q2Var, pVar2, 1.0f, false, 2, null);
            y0Var2.U(-483455358);
            d0.l lVar = d0.p.f225186d;
            z0.b bVar = z0.a.f468900l;
            s1.t0 a27 = d0.j0.a(lVar, bVar, y0Var2, 0);
            y0Var2.U(-1323940314);
            p2.f fVar2 = (p2.f) y0Var2.i(h3Var2);
            p2.s sVar2 = (p2.s) y0Var2.i(h3Var3);
            androidx.compose.ui.platform.k4 k4Var2 = (androidx.compose.ui.platform.k4) y0Var2.i(h3Var4);
            yz5.q a28 = s1.g0.a(a19);
            if (!z19) {
                n0.l.a();
                throw null;
            }
            y0Var2.X();
            if (y0Var2.L) {
                y0Var2.j(aVar);
            } else {
                y0Var2.i0();
            }
            y0Var2.f333784y = false;
            n0.i5.a(y0Var2, a27, pVar3);
            n0.i5.a(y0Var2, fVar2, pVar4);
            n0.i5.a(y0Var2, sVar2, pVar5);
            n0.i5.a(y0Var2, k4Var2, pVar6);
            y0Var2.n();
            ((u0.i) a28).invoke(new n0.i4(y0Var2), y0Var2, 0);
            y0Var2.U(2058660585);
            y0Var2.U(-1163856341);
            d0.m0 m0Var = d0.m0.f225171a;
            java.lang.String Id = ((r45.jj4) list.get(0)).f377855d;
            kotlin.jvm.internal.o.f(Id, "Id");
            z0.t a29 = d0.k0.a(m0Var, d0.a3.f(pVar2, 0.0f, 1, null), 1.0f, false, 2, null);
            yz5.l lVar2 = this.f193590f;
            com.tencent.mm.sns_compose.page.s0.a(str, Id, a0.d0.d(a29, false, null, null, new com.tencent.mm.sns_compose.page.q(lVar2, list), 7, null), y0Var2, 0, 0);
            y0Var2.U(-2079692798);
            if (list.size() > 3) {
                d0.e3.a(d0.a3.g(pVar2, 1), y0Var2, 6);
                java.lang.String Id2 = ((r45.jj4) list.get(2)).f377855d;
                kotlin.jvm.internal.o.f(Id2, "Id");
                com.tencent.mm.sns_compose.page.s0.a(str, Id2, a0.d0.d(d0.k0.a(m0Var, d0.a3.f(pVar2, 0.0f, 1, null), 1.0f, false, 2, null), false, null, null, new com.tencent.mm.sns_compose.page.r(lVar2, list), 7, null), y0Var2, 0, 0);
            }
            y0Var2.o(false);
            y0Var2.o(false);
            y0Var2.o(false);
            y0Var2.o(true);
            y0Var2.o(false);
            y0Var2.o(false);
            y0Var2.U(1103212078);
            if (list.size() > 1) {
                float f18 = 1;
                l0.a2.a(d0.a3.j(pVar2, f18), null, 0L, 0L, null, 0.0f, com.tencent.mm.sns_compose.page.c.f193437a, y0Var2, 1572870, 62);
                zVar = MediaContent;
                h3Var = h3Var2;
                z0.t a37 = d0.o2.a(q2Var, pVar2, 1.0f, false, 2, null);
                y0Var2.U(-483455358);
                z17 = false;
                s1.t0 a38 = d0.j0.a(lVar, bVar, y0Var2, 0);
                y0Var2.U(-1323940314);
                p2.f fVar3 = (p2.f) y0Var2.i(h3Var);
                p2.s sVar3 = (p2.s) y0Var2.i(h3Var3);
                androidx.compose.ui.platform.k4 k4Var3 = (androidx.compose.ui.platform.k4) y0Var2.i(h3Var4);
                yz5.q a39 = s1.g0.a(a37);
                if (!z19) {
                    n0.l.a();
                    throw null;
                }
                y0Var2.X();
                if (y0Var2.L) {
                    y0Var2.j(aVar);
                } else {
                    y0Var2.i0();
                }
                y0Var2.f333784y = false;
                n0.i5.a(y0Var2, a38, pVar3);
                n0.i5.a(y0Var2, fVar3, pVar4);
                n0.i5.a(y0Var2, sVar3, pVar5);
                n0.i5.a(y0Var2, k4Var3, pVar6);
                y0Var2.n();
                ((u0.i) a39).invoke(new n0.i4(y0Var2), y0Var2, 0);
                y0Var2.U(2058660585);
                y0Var2.U(-1163856341);
                list = list;
                java.lang.String Id3 = ((r45.jj4) list.get(1)).f377855d;
                kotlin.jvm.internal.o.f(Id3, "Id");
                pVar = pVar2;
                com.tencent.mm.sns_compose.page.s0.a(str, Id3, a0.d0.d(d0.k0.a(m0Var, d0.a3.f(pVar, 0.0f, 1, null), 1.0f, false, 2, null), false, null, null, new com.tencent.mm.sns_compose.page.s(lVar2, list), 7, null), y0Var2, 0, 0);
                y0Var2.U(-2079691900);
                if (list.size() > 2) {
                    d0.e3.a(d0.a3.g(pVar, f18), y0Var2, 6);
                    int i19 = list.size() > 3 ? 3 : 2;
                    java.lang.String Id4 = ((r45.jj4) list.get(i19)).f377855d;
                    kotlin.jvm.internal.o.f(Id4, "Id");
                    com.tencent.mm.sns_compose.page.s0.a(str, Id4, a0.d0.d(d0.k0.a(m0Var, d0.a3.f(pVar, 0.0f, 1, null), 1.0f, false, 2, null), false, null, null, new com.tencent.mm.sns_compose.page.t(lVar2, list, i19), 7, null), y0Var2, 0, 0);
                }
                y0Var2.o(false);
                y0Var2.o(false);
                y0Var2.o(false);
                z18 = true;
                y0Var2.o(true);
                y0Var2.o(false);
                y0Var2.o(false);
            } else {
                z17 = false;
                zVar = MediaContent;
                pVar = pVar2;
                z18 = true;
                h3Var = h3Var2;
            }
            y0Var2.o(z17);
            y0Var2.o(z17);
            y0Var2.o(z17);
            y0Var2.o(z18);
            y0Var2.o(z17);
            y0Var2.o(z17);
            if (list.size() > 4) {
                java.lang.String str2 = "共" + list.size() + (char) 24352;
                float f19 = 8;
                long z27 = ((p2.f) y0Var2.i(h3Var)).z(((float) 1.75d) * f19);
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                long b17 = rz0.a.b(com.tencent.mm.R.color.BW_100_Alpha_0_9, context);
                a2.o1 o1Var = ((l0.j5) y0Var2.i(l0.l5.f314376a)).f314309i;
                float a47 = i65.a.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 3);
                android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                tz0.x.b(str2, d0.a2.j(zVar.a(pVar, z0.a.f468897i), 0.0f, 0.0f, 2 * f19, ((float) 1.5d) * f19, 3, null), b17, z27, null, null, null, 0L, null, null, 0L, 0, false, 0, null, a2.o1.a(o1Var, 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, new e1.z0(rz0.a.b(com.tencent.mm.R.color.BW_100_Alpha_0_3, context2), 0L, a47, 2, null), null, null, 0L, null, 253951, null), y0Var2, 3072, 0, 32752);
            }
        }
        return jz5.f0.f302826a;
    }
}
