package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class x20 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f120278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f120279e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.e30 f120280f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x20(boolean z17, com.tencent.mm.plugin.finder.live.widget.e30 e30Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f120279e = z17;
        this.f120280f = e30Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.x20(this.f120279e, this.f120280f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.x20) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0099 -> B:6:0x009c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00a1 -> B:6:0x009c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a3 -> B:6:0x009c). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r11.f120278d
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1c
            if (r1 != r2) goto L14
            kotlin.ResultKt.throwOnFailure(r12)
            r1 = r0
            r0 = r11
            goto L9c
        L14:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1c:
            kotlin.ResultKt.throwOnFailure(r12)
            r1 = r0
            r0 = r11
            goto L6b
        L22:
            kotlin.ResultKt.throwOnFailure(r12)
            r12 = r11
        L26:
            boolean r1 = r12.f120279e
            com.tencent.mm.plugin.finder.live.widget.e30 r5 = r12.f120280f
            if (r1 == 0) goto L3c
            java.lang.Class<mm2.c1> r1 = mm2.c1.class
            androidx.lifecycle.c1 r1 = r5.P0(r1)
            mm2.c1 r1 = (mm2.c1) r1
            long r6 = r1.J1
            int r8 = r5.A
            long r8 = (long) r8
            long r6 = r6 + r8
            r1.J1 = r6
        L3c:
            int r1 = r5.A
            r6 = 0
            r5.A = r6
            java.lang.String r6 = r5.f118213r
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "[startUpLoadLike] upload count = "
            r7.<init>(r8)
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            com.tencent.mars.xlog.Log.i(r6, r7)
            com.tencent.mm.plugin.finder.live.plugin.l r5 = r5.f118212q
            dk2.xf r5 = r5.W0()
            if (r5 == 0) goto L6e
            r12.f120278d = r4
            dk2.r4 r5 = (dk2.r4) r5
            java.lang.Object r1 = r5.F(r1, r4, r12)
            if (r1 != r0) goto L67
            return r0
        L67:
            r10 = r0
            r0 = r12
            r12 = r1
            r1 = r10
        L6b:
            r45.od1 r12 = (r45.od1) r12
            goto L71
        L6e:
            r1 = r0
            r0 = r12
            r12 = r3
        L71:
            com.tencent.mm.plugin.finder.live.widget.e30 r5 = r0.f120280f
            if (r12 == 0) goto L9f
            int r12 = r12.getInteger(r2)
            if (r12 >= r4) goto L7c
            r12 = r4
        L7c:
            long r6 = (long) r12
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r8
            java.lang.String r12 = r5.f118213r
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r8 = "[startUpLoadLike] delay = "
            r5.<init>(r8)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.mars.xlog.Log.i(r12, r5)
            r0.f120278d = r2
            java.lang.Object r12 = kotlinx.coroutines.k1.b(r6, r0)
            if (r12 != r1) goto L9c
            return r1
        L9c:
            r12 = r0
            r0 = r1
            goto La7
        L9f:
            kotlinx.coroutines.r2 r12 = r5.K
            if (r12 == 0) goto L9c
            kotlinx.coroutines.p2.a(r12, r3, r4, r3)
            goto L9c
        La7:
            com.tencent.mm.plugin.finder.live.widget.e30 r1 = r12.f120280f
            int r5 = r1.A
            if (r5 > 0) goto L26
            java.lang.String r12 = r1.f118213r
            java.lang.String r0 = "[startUpLoadLike] stop"
            com.tencent.mars.xlog.Log.i(r12, r0)
            kotlinx.coroutines.r2 r12 = r1.K
            if (r12 == 0) goto Lbb
            kotlinx.coroutines.p2.a(r12, r3, r4, r3)
        Lbb:
            jz5.f0 r12 = jz5.f0.f302826a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.x20.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
