package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class kg extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f118837d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f118838e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.bh f118839f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg(com.tencent.mm.plugin.finder.live.widget.bh bhVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f118839f = bhVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.finder.live.widget.kg kgVar = new com.tencent.mm.plugin.finder.live.widget.kg(this.f118839f, continuation);
        kgVar.f118838e = obj;
        return kgVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.kg) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008a  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r9.f118837d
            r2 = 0
            r3 = 3
            com.tencent.mm.plugin.finder.live.widget.bh r4 = r9.f118839f
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L2f
            if (r1 == r6) goto L2b
            if (r1 == r5) goto L23
            if (r1 != r3) goto L1b
            java.lang.Object r0 = r9.f118838e
            xg2.h r0 = (xg2.h) r0
            kotlin.ResultKt.throwOnFailure(r10)
            goto La2
        L1b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L23:
            java.lang.Object r1 = r9.f118838e
            xg2.h r1 = (xg2.h) r1
            kotlin.ResultKt.throwOnFailure(r10)
            goto L86
        L2b:
            kotlin.ResultKt.throwOnFailure(r10)
            goto L67
        L2f:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.Object r10 = r9.f118838e
            kotlinx.coroutines.y0 r10 = (kotlinx.coroutines.y0) r10
            r45.aq1 r1 = new r45.aq1
            r1.<init>()
            db2.t4 r7 = db2.t4.f228171a
            r8 = 11250(0x2bf2, float:1.5765E-41)
            r45.kv0 r7 = r7.a(r8)
            r1.set(r6, r7)
            android.content.Context r7 = r4.getContext()
            java.lang.String r8 = "getContext(...)"
            kotlin.jvm.internal.o.f(r7, r8)
            java.lang.String r7 = xy2.c.e(r7)
            r1.set(r5, r7)
            com.tencent.mm.modelbase.i r1 = r1.d()
            oz5.l r10 = r10.getF11582e()
            r9.f118837d = r6
            java.lang.Object r10 = xg2.g.b(r1, r10, r9)
            if (r10 != r0) goto L67
            return r0
        L67:
            r1 = r10
            xg2.h r1 = (xg2.h) r1
            boolean r10 = r1 instanceof xg2.i
            if (r10 == 0) goto L86
            oz5.l r10 = r1.f454392a
            if (r10 != 0) goto L76
            oz5.l r10 = r9.getContext()
        L76:
            com.tencent.mm.plugin.finder.live.widget.jg r6 = new com.tencent.mm.plugin.finder.live.widget.jg
            r6.<init>(r1, r2, r4)
            r9.f118838e = r1
            r9.f118837d = r5
            java.lang.Object r10 = kotlinx.coroutines.l.g(r10, r6, r9)
            if (r10 != r0) goto L86
            return r0
        L86:
            boolean r10 = r1 instanceof xg2.b
            if (r10 == 0) goto La2
            oz5.l r10 = r1.f454392a
            if (r10 != 0) goto L92
            oz5.l r10 = r9.getContext()
        L92:
            com.tencent.mm.plugin.finder.live.widget.ig r5 = new com.tencent.mm.plugin.finder.live.widget.ig
            r5.<init>(r1, r2, r4)
            r9.f118838e = r1
            r9.f118837d = r3
            java.lang.Object r10 = kotlinx.coroutines.l.g(r10, r5, r9)
            if (r10 != r0) goto La2
            return r0
        La2:
            jz5.f0 r10 = jz5.f0.f302826a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.kg.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
