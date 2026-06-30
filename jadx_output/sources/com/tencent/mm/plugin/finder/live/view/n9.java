package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class n9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f116525d;

    /* renamed from: e, reason: collision with root package name */
    public int f116526e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.hd5 f116527f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView f116528g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f116529h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9(r45.hd5 hd5Var, com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView finderLiveProductRecordView, android.widget.TextView textView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f116527f = hd5Var;
        this.f116528g = finderLiveProductRecordView;
        this.f116529h = textView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.view.n9(this.f116527f, this.f116528g, this.f116529h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.view.n9) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x003c */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r8.f116526e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1a
            if (r1 != r3) goto L12
            java.lang.Object r1 = r8.f116525d
            kotlin.jvm.internal.f0 r1 = (kotlin.jvm.internal.f0) r1
            kotlin.ResultKt.throwOnFailure(r9)
            goto L30
        L12:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1a:
            kotlin.ResultKt.throwOnFailure(r9)
            kotlin.jvm.internal.f0 r9 = new kotlin.jvm.internal.f0
            r9.<init>()
            int r1 = c01.id.e()
            r45.hd5 r4 = r8.f116527f
            int r4 = r4.getInteger(r2)
            int r1 = r1 - r4
            r9.f310116d = r1
            r1 = r9
        L30:
            r9 = r8
        L31:
            int r4 = r1.f310116d
            long r4 = (long) r4
            com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView r6 = r9.f116528g
            long r6 = com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView.a(r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L62
            int r4 = c01.id.e()
            r45.hd5 r5 = r9.f116527f
            int r5 = r5.getInteger(r2)
            int r4 = r4 - r5
            r1.f310116d = r4
            com.tencent.mm.plugin.finder.live.view.m9 r4 = new com.tencent.mm.plugin.finder.live.view.m9
            android.widget.TextView r5 = r9.f116529h
            r4.<init>(r5, r1)
            pm0.v.X(r4)
            r9.f116525d = r1
            r9.f116526e = r3
            r4 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r4 = kotlinx.coroutines.k1.b(r4, r9)
            if (r4 != r0) goto L31
            return r0
        L62:
            jz5.f0 r9 = jz5.f0.f302826a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.view.n9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
