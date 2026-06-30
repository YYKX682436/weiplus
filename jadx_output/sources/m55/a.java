package m55;

/* loaded from: classes10.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f324320d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m55.b f324321e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ og3.d f324322f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ og3.e f324323g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(m55.b bVar, og3.d dVar, og3.e eVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f324321e = bVar;
        this.f324322f = dVar;
        this.f324323g = eVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new m55.a(this.f324321e, this.f324322f, this.f324323g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((m55.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r8.f324320d
            og3.e r2 = r8.f324323g
            og3.d r3 = r8.f324322f
            m55.b r4 = r8.f324321e
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L22
            if (r1 == r6) goto L1e
            if (r1 != r5) goto L16
            kotlin.ResultKt.throwOnFailure(r9)
            goto L4c
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L2e
        L22:
            kotlin.ResultKt.throwOnFailure(r9)
            r8.f324320d = r6
            java.lang.Object r9 = r4.d(r3, r2, r8)
            if (r9 != r0) goto L2e
            return r0
        L2e:
            com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo r9 = (com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo) r9
            r9.getClass()
            og3.h r1 = og3.h.f345166f
            og3.h r7 = r9.f148602d
            if (r7 != r1) goto L3a
            goto L3b
        L3a:
            r6 = 0
        L3b:
            if (r6 == 0) goto L5f
            m55.c r9 = r4.f324324a
            if (r9 == 0) goto L50
            r8.f324320d = r5
            m55.b r9 = (m55.b) r9
            java.lang.Object r9 = r9.c(r3, r2, r8)
            if (r9 != r0) goto L4c
            return r0
        L4c:
            com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo r9 = (com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo) r9
            if (r9 != 0) goto L5f
        L50:
            r2 = -1
            java.lang.String r3 = "no chain handle video remux"
            com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo r9 = new com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo
            og3.h r1 = og3.h.f345164d
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
        L5f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: m55.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
