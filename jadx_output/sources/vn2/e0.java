package vn2;

/* loaded from: classes2.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f438261d;

    /* renamed from: e, reason: collision with root package name */
    public int f438262e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f438263f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f438264g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ jz5.l f438265h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader f438266i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ym5.q1 f438267m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f438268n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(android.content.Context context, r45.qt2 qt2Var, jz5.l lVar, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader, ym5.q1 q1Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f438263f = context;
        this.f438264g = qt2Var;
        this.f438265h = lVar;
        this.f438266i = baseFeedLoader;
        this.f438267m = q1Var;
        this.f438268n = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vn2.e0(this.f438263f, this.f438264g, this.f438265h, this.f438266i, this.f438267m, this.f438268n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vn2.e0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00af  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r13.f438262e
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2e
            if (r1 == r5) goto L2a
            if (r1 == r4) goto L21
            if (r1 != r3) goto L19
            java.lang.Object r0 = r13.f438261d
            xg2.h r0 = (xg2.h) r0
            kotlin.ResultKt.throwOnFailure(r14)
            goto Lcb
        L19:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L21:
            java.lang.Object r1 = r13.f438261d
            xg2.h r1 = (xg2.h) r1
            kotlin.ResultKt.throwOnFailure(r14)
            goto Lab
        L2a:
            kotlin.ResultKt.throwOnFailure(r14)
            goto L81
        L2e:
            kotlin.ResultKt.throwOnFailure(r14)
            r45.zu2 r14 = new r45.zu2
            r14.<init>()
            db2.t4 r1 = db2.t4.f228171a
            r6 = 10460(0x28dc, float:1.4658E-41)
            r45.qt2 r7 = r13.f438264g
            r45.kv0 r1 = r1.b(r6, r7)
            r14.set(r5, r1)
            jz5.l r1 = r13.f438265h
            java.lang.Object r6 = r1.f302834e
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r6 = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) r6
            long r6 = r6.getItemId()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r14.set(r4, r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r14.set(r3, r6)
            java.lang.Object r1 = r1.f302834e
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) r1
            java.lang.String r1 = r1.g0()
            r6 = 4
            r14.set(r6, r1)
            com.tencent.mm.modelbase.i r14 = r14.d()
            az2.j r14 = (az2.j) r14
            android.content.Context r7 = r13.f438263f
            r8 = 0
            r9 = 0
            r11 = 6
            r12 = 0
            r6 = r14
            az2.j.u(r6, r7, r8, r9, r11, r12)
            r13.f438262e = r5
            java.lang.Object r14 = xg2.g.d(r14, r2, r13, r5, r2)
            if (r14 != r0) goto L81
            return r0
        L81:
            r1 = r14
            xg2.h r1 = (xg2.h) r1
            jz5.l r8 = r13.f438265h
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader r9 = r13.f438266i
            ym5.q1 r10 = r13.f438267m
            java.lang.String r11 = r13.f438268n
            boolean r14 = r1 instanceof xg2.i
            if (r14 == 0) goto Lab
            oz5.l r14 = r1.f454392a
            if (r14 != 0) goto L98
            oz5.l r14 = r13.getContext()
        L98:
            vn2.d0 r12 = new vn2.d0
            r7 = 0
            r5 = r12
            r6 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r13.f438261d = r1
            r13.f438262e = r4
            java.lang.Object r14 = kotlinx.coroutines.l.g(r14, r12, r13)
            if (r14 != r0) goto Lab
            return r0
        Lab:
            boolean r14 = r1 instanceof xg2.b
            if (r14 == 0) goto Lcb
            oz5.l r14 = r1.f454392a
            if (r14 != 0) goto Lb7
            oz5.l r14 = r13.getContext()
        Lb7:
            vn2.c0 r4 = new vn2.c0
            android.content.Context r5 = r13.f438263f
            java.lang.String r6 = r13.f438268n
            r4.<init>(r1, r2, r5, r6)
            r13.f438261d = r1
            r13.f438262e = r3
            java.lang.Object r14 = kotlinx.coroutines.l.g(r14, r4, r13)
            if (r14 != r0) goto Lcb
            return r0
        Lcb:
            jz5.f0 r14 = jz5.f0.f302826a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: vn2.e0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
