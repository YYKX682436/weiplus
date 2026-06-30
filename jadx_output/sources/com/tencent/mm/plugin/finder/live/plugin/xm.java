package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class xm extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f115105d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f115106e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.bn f115107f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ce2.i f115108g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm(com.tencent.mm.plugin.finder.live.plugin.bn bnVar, ce2.i iVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f115107f = bnVar;
        this.f115108g = iVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.finder.live.plugin.xm xmVar = new com.tencent.mm.plugin.finder.live.plugin.xm(this.f115107f, this.f115108g, continuation);
        xmVar.f115106e = obj;
        return xmVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.xm) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0022 A[SYNTHETIC] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r12.f115105d
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            java.lang.Object r1 = r12.f115106e
            kotlinx.coroutines.y0 r1 = (kotlinx.coroutines.y0) r1
            kotlin.ResultKt.throwOnFailure(r13)
            goto L21
        L11:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L19:
            kotlin.ResultKt.throwOnFailure(r13)
            java.lang.Object r13 = r12.f115106e
            kotlinx.coroutines.y0 r13 = (kotlinx.coroutines.y0) r13
            r1 = r13
        L21:
            r13 = r12
        L22:
            com.tencent.mm.plugin.finder.live.plugin.bn r3 = r13.f115107f
            java.util.concurrent.ConcurrentLinkedQueue r4 = r3.f112058v
            boolean r4 = r4.isEmpty()
            r4 = r4 ^ r2
            if (r4 == 0) goto Ld2
            boolean r4 = kotlinx.coroutines.z0.h(r1)
            if (r4 == 0) goto Ld2
            java.util.concurrent.ConcurrentLinkedQueue r4 = r3.f112058v
            java.lang.Object r4 = r4.poll()
            r45.yv1 r4 = (r45.yv1) r4
            if (r4 != 0) goto L3f
            goto Ld2
        L3f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "start random gift animation, animation_id:"
            r5.<init>(r6)
            r6 = 0
            java.lang.String r7 = r4.getString(r6)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.String r7 = "Finder.FinderLiveGiftPlayPlugin"
            com.tencent.mars.xlog.Log.i(r7, r5)
            ce2.i r5 = r13.f115108g
            r45.zq4 r5 = r5.field_multiAnimationList
            r8 = 0
            if (r5 == 0) goto L88
            java.util.LinkedList r5 = r5.getList(r6)
            if (r5 == 0) goto L88
            java.util.Iterator r5 = r5.iterator()
        L68:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L84
            java.lang.Object r9 = r5.next()
            r10 = r9
            r45.yq4 r10 = (r45.yq4) r10
            java.lang.String r10 = r10.getString(r6)
            java.lang.String r11 = r4.getString(r6)
            boolean r10 = kotlin.jvm.internal.o.b(r10, r11)
            if (r10 == 0) goto L68
            goto L85
        L84:
            r9 = r8
        L85:
            r45.yq4 r9 = (r45.yq4) r9
            goto L89
        L88:
            r9 = r8
        L89:
            if (r9 != 0) goto L91
            java.lang.String r3 = "start random gift animation, multiAnimation null"
            com.tencent.mars.xlog.Log.i(r7, r3)
            goto L22
        L91:
            boolean r4 = r3.x0()
            if (r4 == 0) goto La5
            r4 = 2
            com.tencent.mm.protobuf.f r4 = r9.getCustom(r4)
            r45.gs5 r4 = (r45.gs5) r4
            if (r4 == 0) goto Lb2
            java.lang.String r4 = r4.getString(r6)
            goto Lb3
        La5:
            com.tencent.mm.protobuf.f r4 = r9.getCustom(r2)
            r45.gs5 r4 = (r45.gs5) r4
            if (r4 == 0) goto Lb2
            java.lang.String r4 = r4.getString(r6)
            goto Lb3
        Lb2:
            r4 = r8
        Lb3:
            com.tencent.mm.view.MMPAGView r5 = r3.f112052p
            r6 = 3
            r5.setScaleMode(r6)
            com.tencent.mm.view.MMPAGView r5 = r3.f112052p
            r5.setRepeatCount(r2)
            kotlinx.coroutines.p0 r5 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r5 = kotlinx.coroutines.internal.b0.f310484a
            com.tencent.mm.plugin.finder.live.plugin.wm r6 = new com.tencent.mm.plugin.finder.live.plugin.wm
            r6.<init>(r3, r4, r8)
            r13.f115106e = r1
            r13.f115105d = r2
            java.lang.Object r3 = kotlinx.coroutines.l.g(r5, r6, r13)
            if (r3 != r0) goto L22
            return r0
        Ld2:
            jz5.f0 r13 = jz5.f0.f302826a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.xm.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
