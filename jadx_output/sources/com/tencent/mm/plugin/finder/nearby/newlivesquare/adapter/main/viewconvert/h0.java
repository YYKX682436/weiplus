package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vp2.e f121698d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f121699e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.x f121700f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f121701g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f121702h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.m0 f121703i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(vp2.e eVar, kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.x xVar, kotlin.jvm.internal.h0 h0Var2, in5.s0 s0Var, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.m0 m0Var) {
        super(2);
        this.f121698d = eVar;
        this.f121699e = h0Var;
        this.f121700f = xVar;
        this.f121701g = h0Var2;
        this.f121702h = s0Var;
        this.f121703i = m0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048 A[LOOP:0: B:2:0x0016->B:12:0x0048, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004c A[EDGE_INSN: B:13:0x004c->B:14:0x004c BREAK  A[LOOP:0: B:2:0x0016->B:12:0x0048], SYNTHETIC] */
    @Override // yz5.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r12, java.lang.Object r13) {
        /*
            r11 = this;
            java.lang.Number r12 = (java.lang.Number) r12
            long r7 = r12.longValue()
            java.lang.Number r13 = (java.lang.Number) r13
            long r9 = r13.longValue()
            vp2.e r12 = r11.f121698d
            java.util.ArrayList r12 = r12.f438915e
            java.util.Iterator r12 = r12.iterator()
            r13 = 0
            r0 = r13
        L16:
            boolean r1 = r12.hasNext()
            r2 = 1
            r3 = -1
            if (r1 == 0) goto L4b
            java.lang.Object r1 = r12.next()
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
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 != 0) goto L44
            r1 = r2
            goto L45
        L44:
            r1 = r13
        L45:
            if (r1 == 0) goto L48
            goto L4c
        L48:
            int r0 = r0 + 1
            goto L16
        L4b:
            r0 = r3
        L4c:
            if (r0 == r3) goto La6
            kotlin.jvm.internal.h0 r12 = r11.f121699e
            java.lang.Object r13 = r12.f310123d
            up2.c r13 = (up2.c) r13
            int r13 = r13.a0()
            java.lang.Object r12 = r12.f310123d
            up2.c r12 = (up2.c) r12
            int r13 = r13 + r0
            dk2.zg r1 = new dk2.zg
            r1.<init>()
            r1.f234444g = r2
            r12.notifyItemChanged(r13, r1)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "[NearbyEndLive] BigBanner show ended UI at index="
            r12.<init>(r13)
            r12.append(r0)
            java.lang.String r13 = ", will remove after 500ms"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            java.lang.String r13 = "BigBannerListConvert"
            com.tencent.mars.xlog.Log.i(r13, r12)
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.g0 r12 = new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.g0
            vp2.e r1 = r11.f121698d
            in5.s0 r2 = r11.f121702h
            kotlin.jvm.internal.h0 r3 = r11.f121699e
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.m0 r4 = r11.f121703i
            kotlin.jvm.internal.h0 r5 = r11.f121701g
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.x r13 = r11.f121700f
            r0 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9)
            java.util.List r13 = r13.f122019i
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            r13.add(r12)
            kotlin.jvm.internal.h0 r13 = r11.f121701g
            java.lang.Object r13 = r13.f310123d
            com.tencent.mm.view.recyclerview.WxRecyclerView r13 = (com.tencent.mm.view.recyclerview.WxRecyclerView) r13
            if (r13 == 0) goto La6
            r0 = 500(0x1f4, double:2.47E-321)
            r13.postDelayed(r12, r0)
        La6:
            jz5.f0 r12 = jz5.f0.f302826a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.h0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
