package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class m5 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vp2.l0 f121812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ up2.o f121813e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.a5 f121814f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t5 f121815g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f121816h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(vp2.l0 l0Var, up2.o oVar, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.a5 a5Var, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t5 t5Var, in5.s0 s0Var) {
        super(2);
        this.f121812d = l0Var;
        this.f121813e = oVar;
        this.f121814f = a5Var;
        this.f121815g = t5Var;
        this.f121816h = s0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048 A[LOOP:0: B:2:0x0016->B:12:0x0048, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004c A[EDGE_INSN: B:13:0x004c->B:14:0x004c BREAK  A[LOOP:0: B:2:0x0016->B:12:0x0048], SYNTHETIC] */
    @Override // yz5.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r11, java.lang.Object r12) {
        /*
            r10 = this;
            java.lang.Number r11 = (java.lang.Number) r11
            long r6 = r11.longValue()
            java.lang.Number r12 = (java.lang.Number) r12
            long r8 = r12.longValue()
            vp2.l0 r11 = r10.f121812d
            java.util.ArrayList r11 = r11.f438941e
            java.util.Iterator r11 = r11.iterator()
            r12 = 0
            r0 = r12
        L16:
            boolean r1 = r11.hasNext()
            r2 = 1
            r3 = -1
            if (r1 == 0) goto L4b
            java.lang.Object r1 = r11.next()
            so2.j5 r1 = (so2.j5) r1
            boolean r4 = r1 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed
            if (r4 == 0) goto L44
            zl2.q4 r4 = zl2.q4.f473933a
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) r1
            boolean r4 = r4.C(r1)
            if (r4 == 0) goto L44
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            long r4 = r1.getId()
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 != 0) goto L44
            r1 = r2
            goto L45
        L44:
            r1 = r12
        L45:
            if (r1 == 0) goto L48
            goto L4c
        L48:
            int r0 = r0 + 1
            goto L16
        L4b:
            r0 = r3
        L4c:
            if (r0 == r3) goto L9a
            up2.o r11 = r10.f121813e
            int r12 = r11.a0()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "[NearbyEndLive] SpecialColumn show ended UI at index="
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r3 = ", will remove after 500ms"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "Finder.SpecialColumnListConvert"
            com.tencent.mars.xlog.Log.i(r3, r1)
            int r0 = r0 + r12
            dk2.zg r12 = new dk2.zg
            r12.<init>()
            r12.f234444g = r2
            r11.notifyItemChanged(r0, r12)
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.l5 r11 = new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.l5
            vp2.l0 r1 = r10.f121812d
            in5.s0 r2 = r10.f121816h
            up2.o r3 = r10.f121813e
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t5 r4 = r10.f121815g
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.a5 r12 = r10.f121814f
            r0 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r8)
            java.util.List r12 = r12.f121580h
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            r12.add(r11)
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t5 r12 = r10.f121815g
            com.tencent.mm.view.recyclerview.WxRecyclerView r12 = r12.f121960p
            if (r12 == 0) goto L9a
            r0 = 500(0x1f4, double:2.47E-321)
            r12.postDelayed(r11, r0)
        L9a:
            jz5.f0 r11 = jz5.f0.f302826a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.m5.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
