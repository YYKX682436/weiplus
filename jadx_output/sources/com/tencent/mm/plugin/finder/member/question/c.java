package com.tencent.mm.plugin.finder.member.question;

/* loaded from: classes2.dex */
public abstract class c implements com.tencent.mm.plugin.finder.feed.k8 {
    public final void c(android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, java.lang.String authorFinderUsername, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(authorFinderUsername, "authorFinderUsername");
        if (!feed.getFeedObject().isPostFinish() || feed.getFeedObject().isPostFailed()) {
            cu2.u.f222441a.d(feed, !feed.getFeedObject().isPostFailed());
            return;
        }
        if (i17 == 0) {
            cu2.u.f222441a.e(context, feed, com.tencent.mm.plugin.finder.member.question.a.f121320d);
            return;
        }
        pm0.v.T(new ho2.h(i17, xy2.c.e(context), authorFinderUsername, feed.getFeedObject(), "FinderLocal_" + java.lang.System.nanoTime()).l(), com.tencent.mm.plugin.finder.member.question.b.f121321d);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(android.content.Context r23, com.tencent.mm.plugin.finder.view.f5 r24, com.tencent.mm.plugin.finder.model.BaseFinderFeed r25, java.lang.String r26, long r27, com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.CloseDrawerCallback r29, int r30) {
        /*
            r22 = this;
            r0 = r23
            r1 = r25
            r12 = r26
            java.lang.String r2 = "context"
            kotlin.jvm.internal.o.g(r0, r2)
            java.lang.String r2 = "item"
            kotlin.jvm.internal.o.g(r1, r2)
            java.lang.String r2 = "providerUsername"
            kotlin.jvm.internal.o.g(r12, r2)
            if (r24 != 0) goto L18
            return
        L18:
            java.lang.String r2 = xy2.c.e(r23)
            boolean r2 = kotlin.jvm.internal.o.b(r12, r2)
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2b
            com.tencent.mm.plugin.finder.storage.t70 r2 = com.tencent.mm.plugin.finder.storage.t70.f127590a
            r2.b3(r4)
        L29:
            r10 = r4
            goto L43
        L2b:
            boolean r2 = hc2.b0.j(r1, r0)
            if (r2 != 0) goto L42
            ya2.b2 r2 = r25.getContact()
            boolean r2 = hc2.s.f(r2)
            if (r2 == 0) goto L42
            com.tencent.mm.plugin.finder.storage.t70 r2 = com.tencent.mm.plugin.finder.storage.t70.f127590a
            r5 = 2
            r2.b3(r5)
            goto L29
        L42:
            r10 = r3
        L43:
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r25.getFeedObject()
            int r2 = com.tencent.mm.ui.bl.c(r23)
            android.content.Context r6 = com.tencent.mm.sdk.platformtools.x2.f193071a
            android.graphics.Point r6 = com.tencent.mm.ui.bl.b(r6)
            int r7 = r6.x
            int r6 = r6.y
            java.lang.System.nanoTime()
            boolean r8 = com.tencent.mm.ui.bk.y()
            if (r8 != 0) goto L6a
            boolean r8 = com.tencent.mm.ui.bk.Q()
            if (r8 != 0) goto L6a
            boolean r8 = com.tencent.mm.ui.bk.A()
            if (r8 == 0) goto L6b
        L6a:
            r3 = r4
        L6b:
            java.lang.String r4 = com.tencent.mm.sdk.platformtools.z.f193105a
            if (r3 == 0) goto L71
            int r6 = r6 - r2
            goto L77
        L71:
            if (r6 >= r7) goto L74
            goto L75
        L74:
            r7 = r6
        L75:
            int r6 = r7 - r2
        L77:
            float r2 = (float) r6
            kx2.a r3 = kx2.a.f313278a
            float r3 = r3.a(r0)
            float r2 = r2 * r3
            int r2 = (int) r2
            r16 = r2
            r4 = 0
            r7 = 0
            r8 = 1
            r9 = 0
            r11 = 4
            r13 = 0
            r14 = 0
            r17 = 2
            r20 = 1056(0x420, float:1.48E-42)
            r21 = 0
            r2 = r24
            r3 = r5
            r5 = r27
            r12 = r29
            r18 = r26
            r19 = r30
            com.tencent.mm.plugin.finder.view.f5.c(r2, r3, r4, r5, r7, r8, r9, r10, r11, r12, r13, r14, r16, r17, r18, r19, r20, r21)
            pf5.z r2 = pf5.z.f353948a
            boolean r3 = r0 instanceof androidx.appcompat.app.AppCompatActivity
            if (r3 == 0) goto Lc0
            androidx.appcompat.app.AppCompatActivity r0 = (androidx.appcompat.app.AppCompatActivity) r0
            pf5.v r0 = r2.a(r0)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.w6> r2 = com.tencent.mm.plugin.finder.viewmodel.component.w6.class
            pf5.b0 r0 = r0.e(r2)
            com.tencent.mm.plugin.finder.viewmodel.component.w6 r0 = (com.tencent.mm.plugin.finder.viewmodel.component.w6) r0
            if (r0 == 0) goto Lbf
            com.tencent.mm.plugin.finder.feed.model.l0 r0 = r0.f136307d
            if (r0 == 0) goto Lbf
            long r1 = r25.getItemId()
            r0.Q0(r1)
        Lbf:
            return
        Lc0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.member.question.c.f(android.content.Context, com.tencent.mm.plugin.finder.view.f5, com.tencent.mm.plugin.finder.model.BaseFinderFeed, java.lang.String, long, com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract$CloseDrawerCallback, int):void");
    }
}
