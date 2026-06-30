package ry4;

/* loaded from: classes.dex */
public final class z extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f401690d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ry4.c0 f401691e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.weclaw.shortcut.ShortcutCommandItem f401692f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f401693g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(ry4.c0 c0Var, com.tencent.mm.plugin.weclaw.shortcut.ShortcutCommandItem shortcutCommandItem, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f401691e = c0Var;
        this.f401692f = shortcutCommandItem;
        this.f401693g = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ry4.z(this.f401691e, this.f401692f, this.f401693g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ry4.z) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x005b  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r9.f401690d
            r2 = 0
            r3 = 2
            r4 = 1
            ry4.c0 r5 = r9.f401691e
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L13
            kotlin.ResultKt.throwOnFailure(r10)
            goto L59
        L13:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1b:
            kotlin.ResultKt.throwOnFailure(r10)
            goto L40
        L1f:
            kotlin.ResultKt.throwOnFailure(r10)
            com.tencent.mm.plugin.weclaw.shortcut.ShortcutCommandItem r10 = r5.f401590e
            if (r10 == 0) goto L28
            r10 = r4
            goto L29
        L28:
            r10 = r2
        L29:
            r1 = 0
            com.tencent.mm.plugin.weclaw.shortcut.ShortcutCommandItem r6 = r9.f401692f
            if (r10 == 0) goto L47
            java.lang.String r10 = r5.f401589d
            r9.f401690d = r4
            kotlinx.coroutines.p0 r7 = kotlinx.coroutines.q1.f310570c
            ry4.b0 r8 = new ry4.b0
            r8.<init>(r5, r6, r10, r1)
            java.lang.Object r10 = kotlinx.coroutines.l.g(r7, r8, r9)
            if (r10 != r0) goto L40
            return r0
        L40:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            goto L5e
        L47:
            java.lang.String r10 = r5.f401589d
            r9.f401690d = r3
            kotlinx.coroutines.p0 r7 = kotlinx.coroutines.q1.f310570c
            ry4.a0 r8 = new ry4.a0
            r8.<init>(r5, r10, r6, r1)
            java.lang.Object r10 = kotlinx.coroutines.l.g(r7, r8, r9)
            if (r10 != r0) goto L59
            return r0
        L59:
            if (r10 == 0) goto L5d
            r10 = r4
            goto L5e
        L5d:
            r10 = r2
        L5e:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            if (r10 == 0) goto L66
            java.lang.String r1 = "success"
            goto L68
        L66:
            java.lang.String r1 = "failed"
        L68:
            r0[r2] = r1
            java.lang.String r1 = r5.f401589d
            r0[r4] = r1
            java.lang.String r1 = "submitCommand network: %s, username:%s"
            java.lang.String r2 = "MicroMsg.ShortcutCommandEditUIC"
            com.tencent.mars.xlog.Log.i(r2, r1, r0)
            if (r10 != 0) goto La4
            java.lang.Class<vh0.g1> r10 = vh0.g1.class
            i95.m r10 = i95.n0.c(r10)
            vh0.g1 r10 = (vh0.g1) r10
            java.lang.String r0 = r5.f401589d
            vh0.i2 r10 = (vh0.i2) r10
            vh0.f1 r10 = r10.ij(r0)
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.f192989a
            java.lang.String r0 = r9.f401693g
            if (r0 != 0) goto L90
            java.lang.String r0 = ""
        L90:
            xh0.e r10 = (xh0.e) r10
            r10.b(r0)
            r10.a()
            java.lang.String r10 = r5.f401589d
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            java.lang.String r0 = "rollbackLocalCache: rolled back local cache for username:%s"
            com.tencent.mars.xlog.Log.i(r2, r0, r10)
        La4:
            jz5.f0 r10 = jz5.f0.f302826a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ry4.z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
