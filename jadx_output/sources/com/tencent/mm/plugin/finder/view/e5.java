package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class e5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f131980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.f5 f131981e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f131982f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(com.tencent.mm.plugin.finder.view.f5 f5Var, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f131981e = f5Var;
        this.f131982f = finderItem;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.view.e5(this.f131981e, this.f131982f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.view.e5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r6.f131980d
            r2 = 0
            com.tencent.mm.plugin.finder.view.f5 r3 = r6.f131981e
            r4 = 1
            if (r1 == 0) goto L18
            if (r1 != r4) goto L10
            kotlin.ResultKt.throwOnFailure(r7)
            goto L30
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            kotlin.ResultKt.throwOnFailure(r7)
            com.tencent.mm.plugin.finder.view.FinderCommentDrawer r7 = r3.f132067a
            if (r7 == 0) goto L37
            com.tencent.mm.plugin.finder.feed.a7 r7 = r7.getPresenter()
            if (r7 == 0) goto L37
            r6.f131980d = r4
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r6.f131982f
            java.lang.Object r7 = r7.J0(r1, r6)
            if (r7 != r0) goto L30
            return r0
        L30:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            goto L38
        L37:
            r7 = r2
        L38:
            if (r7 == 0) goto Lba
            com.tencent.mm.plugin.finder.view.FinderCommentDrawer r7 = r3.f132067a
            if (r7 == 0) goto Lba
            com.tencent.mm.plugin.finder.feed.a7 r7 = r7.getPresenter()
            if (r7 == 0) goto Lba
            yw2.a0 r0 = r7.f106216o
            if (r0 == 0) goto Lba
            android.widget.TextView r0 = r0.f466610f
            if (r0 == 0) goto Lb3
            com.tencent.mm.plugin.finder.feed.f7 r1 = r7.X
            java.lang.String r3 = "Finder.DrawerPresenter"
            if (r1 == 0) goto L76
            com.tencent.mm.plugin.finder.feed.e7 r1 = r1.f106709a
            com.tencent.mm.plugin.finder.feed.e7 r5 = com.tencent.mm.plugin.finder.feed.e7.f106633e
            if (r1 != r5) goto L5a
            r1 = r4
            goto L5b
        L5a:
            r1 = r2
        L5b:
            if (r1 != r4) goto L5f
            r1 = r4
            goto L60
        L5f:
            r1 = r2
        L60:
            if (r1 != 0) goto L76
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "showEducationPopupWindow but curCommentSelectType="
            r0.<init>(r1)
            com.tencent.mm.plugin.finder.feed.f7 r7 = r7.X
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            com.tencent.mars.xlog.Log.w(r3, r7)
            goto Lba
        L76:
            gm0.b0 r1 = gm0.j1.u()
            com.tencent.mm.storage.n3 r1 = r1.c()
            com.tencent.mm.storage.u3 r5 = com.tencent.mm.storage.u3.USERINFO_FINDER_FEED_COMMENT_SELECT_EDUCATION_INT
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = r1.m(r5, r2)
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Int"
            kotlin.jvm.internal.o.e(r1, r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 > 0) goto Lad
            gm0.b0 r1 = gm0.j1.u()
            com.tencent.mm.storage.n3 r1 = r1.c()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r1.x(r5, r2)
            com.tencent.mm.plugin.finder.feed.g6 r1 = new com.tencent.mm.plugin.finder.feed.g6
            r1.<init>(r7, r0)
            r0.post(r1)
            goto Lba
        Lad:
            java.lang.String r7 = "showEducationPopupWindow but have show!"
            com.tencent.mars.xlog.Log.i(r3, r7)
            goto Lba
        Lb3:
            java.lang.String r7 = "headerTitleTv"
            kotlin.jvm.internal.o.o(r7)
            r7 = 0
            throw r7
        Lba:
            jz5.f0 r7 = jz5.f0.f302826a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.view.e5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
