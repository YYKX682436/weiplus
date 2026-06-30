package mf2;

/* loaded from: classes10.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f326072d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore) {
        super(0);
        this.f326072d = liveRoomControllerStore;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        if (r2.X() == true) goto L27;
     */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r10 = this;
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r0 = r10.f326072d
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
            if (r1 == 0) goto L9d
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
            mm2.e1 r2 = r1.i7()
            boolean r2 = r2.b7()
            if (r2 != 0) goto L4c
            goto L28
        L4c:
            zl2.r4 r2 = zl2.r4.f473950a
            boolean r2 = r2.x1()
            if (r2 != 0) goto L66
            tn0.w0 r2 = r1.Q6()
            if (r2 == 0) goto L62
            boolean r2 = r2.X()
            r4 = 1
            if (r2 != r4) goto L62
            goto L63
        L62:
            r4 = 0
        L63:
            if (r4 != 0) goto L66
            goto L28
        L66:
            om2.g r2 = r1.q7()
            kotlinx.coroutines.flow.f3 r2 = r2.A
            kotlinx.coroutines.flow.h3 r2 = (kotlinx.coroutines.flow.h3) r2
            java.lang.Object r2 = r2.getValue()
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L28
            java.lang.Object r2 = kz5.n0.Z(r2)
            r45.yx1 r2 = (r45.yx1) r2
            if (r2 == 0) goto L28
            om2.g r4 = r1.q7()
            boolean r4 = r4.T6(r2)
            if (r4 == 0) goto L8c
            r4 = 2
            zh2.a.t0(r1, r2, r3, r4, r3)
        L8c:
            r5 = 0
            r6 = 0
            ch2.h1 r7 = new ch2.h1
            r7.<init>(r1, r2, r3)
            r8 = 3
            r9 = 0
            r4 = r1
            kotlinx.coroutines.r2 r2 = com.tencent.mm.plugin.finder.live.util.y.d(r4, r5, r6, r7, r8, r9)
            r1.f41432y = r2
            goto L28
        L9d:
            jz5.f0 r0 = jz5.f0.f302826a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mf2.h0.invoke():java.lang.Object");
    }
}
