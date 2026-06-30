package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class s4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FeedUpdateEvent f133015d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout f133016e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent, com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout finderColumnFrameLayout) {
        super(0);
        this.f133015d = feedUpdateEvent;
        this.f133016e = finderColumnFrameLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0093 A[LOOP:0: B:16:0x0062->B:28:0x0093, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097 A[EDGE_INSN: B:29:0x0097->B:30:0x0097 BREAK  A[LOOP:0: B:16:0x0062->B:28:0x0093], SYNTHETIC] */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r11 = this;
            com.tencent.mm.autogen.events.FeedUpdateEvent r0 = r11.f133015d
            am.ia r1 = r0.f54252g
            int r1 = r1.f6919b
            r2 = 8
            if (r1 != r2) goto Lcb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "FeedUpdateEvent TYPE_LIVE_CHANGE id:"
            r1.<init>(r2)
            am.ia r0 = r0.f54252g
            long r2 = r0.f6918a
            r1.append(r2)
            java.lang.String r2 = ",username:"
            r1.append(r2)
            java.lang.String r2 = r0.f6924g
            r1.append(r2)
            java.lang.String r2 = ",liveStaus:"
            r1.append(r2)
            int r2 = r0.f6925h
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FinderColumnFrameLayout"
            com.tencent.mars.xlog.Log.i(r2, r1)
            long r1 = r0.f6918a
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto Lcb
            int r1 = r0.f6921d
            r2 = 1
            if (r1 != r2) goto Lcb
            com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout r1 = r11.f133016e
            ey2.u r3 = r1.f130914r
            if (r3 == 0) goto Lcb
            androidx.lifecycle.j0 r3 = r3.f257542x
            if (r3 == 0) goto Lcb
            java.lang.Object r3 = r3.getValue()
            jz5.l r3 = (jz5.l) r3
            if (r3 == 0) goto Lcb
            java.lang.Object r3 = r3.f302833d
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r3 = (com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer) r3
            if (r3 != 0) goto L5c
            goto Lcb
        L5c:
            java.util.Iterator r4 = r3.iterator()
            r5 = 0
            r6 = r5
        L62:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L96
            java.lang.Object r7 = r4.next()
            so2.j5 r7 = (so2.j5) r7
            boolean r8 = r7 instanceof so2.h1
            if (r8 == 0) goto L8f
            so2.h1 r7 = (so2.h1) r7
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r7.getFeedObject()
            r45.nw1 r7 = r7.getLiveInfo()
            if (r7 == 0) goto L8a
            long r7 = r7.getLong(r5)
            long r9 = r0.f6918a
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto L8a
            r7 = r2
            goto L8b
        L8a:
            r7 = r5
        L8b:
            if (r7 == 0) goto L8f
            r7 = r2
            goto L90
        L8f:
            r7 = r5
        L90:
            if (r7 == 0) goto L93
            goto L97
        L93:
            int r6 = r6 + 1
            goto L62
        L96:
            r6 = -1
        L97:
            if (r6 < 0) goto Lcb
            java.lang.Object r2 = r3.get(r6)
            so2.j5 r2 = (so2.j5) r2
            boolean r3 = r2 instanceof so2.h1
            if (r3 == 0) goto La6
            so2.h1 r2 = (so2.h1) r2
            goto La7
        La6:
            r2 = 0
        La7:
            if (r2 == 0) goto Lcb
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.getFeedObject()
            r45.nw1 r2 = r2.getLiveInfo()
            if (r2 != 0) goto Lb4
            goto Lbe
        Lb4:
            int r0 = r0.f6925h
            r3 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.set(r3, r0)
        Lbe:
            com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView r0 = r1.getRecyclerView()
            androidx.recyclerview.widget.f2 r0 = r0.getAdapter()
            if (r0 == 0) goto Lcb
            r0.notifyItemChanged(r6)
        Lcb:
            jz5.f0 r0 = jz5.f0.f302826a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.view.s4.invoke():java.lang.Object");
    }
}
