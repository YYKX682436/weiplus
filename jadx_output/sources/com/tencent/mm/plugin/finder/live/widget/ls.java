package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ls extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f118971d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f118972e;

    /* renamed from: f, reason: collision with root package name */
    public int f118973f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.et f118974g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.vv1 f118975h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ls(com.tencent.mm.plugin.finder.live.widget.et etVar, r45.vv1 vv1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f118974g = etVar;
        this.f118975h = vv1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.ls(this.f118974g, this.f118975h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.ls) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a0  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r9.f118973f
            r2 = 1
            if (r1 == 0) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r0 = r9.f118972e
            r45.uc5 r0 = (r45.uc5) r0
            java.lang.Object r1 = r9.f118971d
            com.tencent.mm.plugin.finder.live.widget.et r1 = (com.tencent.mm.plugin.finder.live.widget.et) r1
            kotlin.ResultKt.throwOnFailure(r10)
            goto Lb3
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1e:
            kotlin.ResultKt.throwOnFailure(r10)
            r45.vv1 r10 = r9.f118975h
            r1 = 0
            int r10 = r10.getInteger(r1)
            com.tencent.mm.plugin.finder.live.widget.et r3 = r9.f118974g
            java.util.LinkedList r4 = r3.K
            r5 = 0
            if (r4 == 0) goto L98
            java.util.Iterator r4 = r4.iterator()
            r6 = r1
        L34:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L58
            java.lang.Object r7 = r4.next()
            r45.uc5 r7 = (r45.uc5) r7
            r8 = 3
            com.tencent.mm.protobuf.f r7 = r7.getCustom(r8)
            r45.vv1 r7 = (r45.vv1) r7
            if (r7 == 0) goto L51
            int r7 = r7.getInteger(r1)
            if (r7 != r10) goto L51
            r7 = r2
            goto L52
        L51:
            r7 = r1
        L52:
            if (r7 == 0) goto L55
            goto L59
        L55:
            int r6 = r6 + 1
            goto L34
        L58:
            r6 = -1
        L59:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            int r4 = r10.intValue()
            java.util.LinkedList r6 = r3.K
            if (r6 == 0) goto L6a
            e06.k r6 = kz5.c0.g(r6)
            goto L6f
        L6a:
            e06.k r6 = new e06.k
            r6.<init>(r1, r1)
        L6f:
            int r7 = r6.f246210e
            if (r4 > r7) goto L78
            int r6 = r6.f246209d
            if (r6 > r4) goto L78
            r1 = r2
        L78:
            if (r1 == 0) goto L7b
            goto L7c
        L7b:
            r10 = r5
        L7c:
            if (r10 == 0) goto L98
            int r10 = r10.intValue()
            jz5.l r1 = new jz5.l
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            java.util.LinkedList r6 = r3.K
            if (r6 == 0) goto L93
            java.lang.Object r10 = kz5.n0.a0(r6, r10)
            r45.uc5 r10 = (r45.uc5) r10
            goto L94
        L93:
            r10 = r5
        L94:
            r1.<init>(r4, r10)
            goto L99
        L98:
            r1 = r5
        L99:
            if (r1 == 0) goto La0
            java.lang.Object r10 = r1.f302834e
            r45.uc5 r10 = (r45.uc5) r10
            goto La1
        La0:
            r10 = r5
        La1:
            if (r10 == 0) goto Lc6
            r9.f118971d = r3
            r9.f118972e = r10
            r9.f118973f = r2
            java.lang.Object r1 = com.tencent.mm.plugin.finder.live.widget.et.e0(r3, r10, r9)
            if (r1 != r0) goto Lb0
            return r0
        Lb0:
            r0 = r10
            r10 = r1
            r1 = r3
        Lb3:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Lc6
            r1.getClass()
            com.tencent.mm.plugin.finder.live.widget.es r10 = new com.tencent.mm.plugin.finder.live.widget.es
            r10.<init>(r1, r0)
            pm0.v.X(r10)
        Lc6:
            jz5.f0 r10 = jz5.f0.f302826a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.ls.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
