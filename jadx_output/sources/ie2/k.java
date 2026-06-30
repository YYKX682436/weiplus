package ie2;

/* loaded from: classes13.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f290992d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer f290993e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout f290994f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer linearBubbleAnimateContainer, com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout frameBubbleContentLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f290993e = linearBubbleAnimateContainer;
        this.f290994f = frameBubbleContentLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ie2.k(this.f290993e, this.f290994f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ie2.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r10.f290992d
            java.lang.String r2 = "LinearBubbleAnimateContainer"
            r3 = 3
            r4 = 2
            r5 = 1
            com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout r6 = r10.f290994f
            com.tencent.mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer r7 = r10.f290993e
            if (r1 == 0) goto L29
            if (r1 == r5) goto L25
            if (r1 == r4) goto L21
            if (r1 != r3) goto L19
            kotlin.ResultKt.throwOnFailure(r11)
            goto L88
        L19:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L21:
            kotlin.ResultKt.throwOnFailure(r11)
            goto L7f
        L25:
            kotlin.ResultKt.throwOnFailure(r11)
            goto L6b
        L29:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r1 = "runBubbleShow isNeedAnimateShow: "
            r11.<init>(r1)
            boolean r1 = r7.f111519h
            r11.append(r1)
            java.lang.String r1 = " size = "
            r11.append(r1)
            java.util.LinkedList r1 = r7.f111515d
            int r1 = r1.size()
            r11.append(r1)
            java.lang.String r1 = " curContent = "
            r11.append(r1)
            r11.append(r6)
            java.lang.String r11 = r11.toString()
            com.tencent.mars.xlog.Log.i(r2, r11)
            boolean r11 = r7.f111519h
            r7.e(r11, r6)
            boolean r11 = r7.f111519h
            if (r11 == 0) goto L88
            long r8 = com.tencent.mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer.a(r7)
            r10.f290992d = r5
            java.lang.Object r11 = kotlinx.coroutines.k1.b(r8, r10)
            if (r11 != r0) goto L6b
            return r0
        L6b:
            java.lang.String r11 = "runBubbleShow delay end "
            com.tencent.mars.xlog.Log.i(r2, r11)
            ie2.h r11 = r6.getSceneStateListener()
            if (r11 == 0) goto L7f
            r10.f290992d = r4
            java.lang.Object r11 = r11.q(r10)
            if (r11 != r0) goto L7f
            return r0
        L7f:
            r10.f290992d = r3
            java.lang.Object r11 = r6.g(r10)
            if (r11 != r0) goto L88
            return r0
        L88:
            java.util.LinkedList r11 = r7.f111516e
            r11.remove(r6)
            com.tencent.mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer.c(r7)
            jz5.f0 r11 = jz5.f0.f302826a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ie2.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
