package mf2;

/* loaded from: classes10.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f326070d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore) {
        super(0);
        this.f326070d = liveRoomControllerStore;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ab, code lost:
    
        if ((r6 != null && r6.f376877o) == true) goto L49;
     */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r7 = this;
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r0 = r7.f326070d
            java.util.HashSet r0 = r0.getControllers()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L24
            java.lang.Object r2 = r0.next()
            r3 = r2
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r3 = (com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController) r3
            boolean r3 = r3 instanceof mf2.f0
            if (r3 == 0) goto Lf
            r1.add(r2)
            goto Lf
        L24:
            java.util.Iterator r0 = r1.iterator()
        L28:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lb7
            java.lang.Object r1 = r0.next()
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r1 = (com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController) r1
            boolean r2 = r1 instanceof mf2.f0
            r3 = 0
            if (r2 == 0) goto L3c
            mf2.f0 r1 = (mf2.f0) r1
            goto L3d
        L3c:
            r1 = r3
        L3d:
            if (r1 == 0) goto L28
            ch2.o2 r1 = (ch2.o2) r1
            java.lang.String r2 = "FinderLiveKTVSingController"
            java.lang.String r4 = "onCallOff"
            com.tencent.mars.xlog.Log.i(r2, r4)
            kotlinx.coroutines.r2 r2 = r1.f41432y
            r4 = 1
            if (r2 == 0) goto L50
            kotlinx.coroutines.p2.a(r2, r3, r4, r3)
        L50:
            mm2.e1 r2 = r1.i7()
            boolean r2 = r2.b7()
            if (r2 != 0) goto L5b
            goto L28
        L5b:
            zl2.r4 r2 = zl2.r4.f473950a
            boolean r2 = r2.x1()
            r5 = 0
            if (r2 != 0) goto L76
            tn0.w0 r2 = r1.Q6()
            if (r2 == 0) goto L72
            boolean r2 = r2.X()
            if (r2 != r4) goto L72
            r2 = r4
            goto L73
        L72:
            r2 = r5
        L73:
            if (r2 != 0) goto L76
            goto L28
        L76:
            om2.g r2 = r1.q7()
            kotlinx.coroutines.flow.f3 r2 = r2.A
            kotlinx.coroutines.flow.h3 r2 = (kotlinx.coroutines.flow.h3) r2
            java.lang.Object r2 = r2.getValue()
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L28
            java.lang.Object r2 = kz5.n0.Z(r2)
            r45.yx1 r2 = (r45.yx1) r2
            if (r2 == 0) goto L28
            om2.g r6 = r1.q7()
            boolean r6 = r6.T6(r2)
            if (r6 == 0) goto L28
            om2.g r6 = r1.q7()
            om2.i r6 = r6.f346307n
            if (r6 == 0) goto Lae
            r45.ia4 r6 = r6.f346323c
            if (r6 == 0) goto Laa
            boolean r6 = r6.f376877o
            if (r6 != r4) goto Laa
            r6 = r4
            goto Lab
        Laa:
            r6 = r5
        Lab:
            if (r6 != r4) goto Lae
            goto Laf
        Lae:
            r4 = r5
        Laf:
            if (r4 == 0) goto L28
            r4 = 2
            zh2.a.i4(r1, r2, r3, r4, r3)
            goto L28
        Lb7:
            jz5.f0 r0 = jz5.f0.f302826a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mf2.g0.invoke():java.lang.Object");
    }
}
