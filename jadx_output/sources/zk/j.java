package zk;

/* loaded from: classes5.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f473394d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f473395e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.provider.ShareableChatRecordsProvider f473396f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f473397g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.app.provider.ShareableChatRecordsProvider shareableChatRecordsProvider, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f473396f = shareableChatRecordsProvider;
        this.f473397g = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        zk.j jVar = new zk.j(this.f473396f, this.f473397g, continuation);
        jVar.f473395e = obj;
        return jVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((zk.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0078  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r6.f473394d
            kz5.p0 r2 = kz5.p0.f313996d
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            kotlin.ResultKt.throwOnFailure(r7)
            goto L73
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            java.lang.Object r1 = r6.f473395e
            kotlinx.coroutines.y0 r1 = (kotlinx.coroutines.y0) r1
            kotlin.ResultKt.throwOnFailure(r7)
            goto L36
        L22:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.Object r7 = r6.f473395e
            kotlinx.coroutines.y0 r7 = (kotlinx.coroutines.y0) r7
            r6.f473395e = r7
            r6.f473394d = r4
            com.tencent.mm.app.provider.ShareableChatRecordsProvider r7 = r6.f473396f
            java.lang.Object r7 = com.tencent.mm.app.provider.ShareableChatRecordsProvider.a(r7, r6)
            if (r7 != r0) goto L36
            return r0
        L36:
            ct.q2 r7 = (ct.q2) r7
            if (r7 != 0) goto L42
            java.lang.String r7 = "MicroMsg.ShareableChatRecordsProvider"
            java.lang.String r0 = "[-] writeCdnInfos: service is null after retry"
            com.tencent.mars.xlog.Log.e(r7, r0)
            return r2
        L42:
            java.util.ArrayList r1 = new java.util.ArrayList
            r4 = 10
            java.util.List r5 = r6.f473397g
            int r4 = kz5.d0.q(r5, r4)
            r1.<init>(r4)
            java.util.Iterator r4 = r5.iterator()
        L53:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L65
            java.lang.Object r5 = r4.next()
            zk.b r5 = (zk.b) r5
            com.tencent.mm.storage.f9 r5 = r5.f473350b
            r1.add(r5)
            goto L53
        L65:
            r4 = 0
            r6.f473395e = r4
            r6.f473394d = r3
            qg5.l0 r7 = (qg5.l0) r7
            java.lang.Object r7 = r7.bj(r1, r6)
            if (r7 != r0) goto L73
            return r0
        L73:
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L78
            goto L79
        L78:
            r2 = r7
        L79:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: zk.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
