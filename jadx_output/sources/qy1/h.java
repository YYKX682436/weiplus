package qy1;

/* loaded from: classes13.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f367728d;

    /* renamed from: e, reason: collision with root package name */
    public int f367729e;

    /* renamed from: f, reason: collision with root package name */
    public int f367730f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qy1.m f367731g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(qy1.m mVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f367731g = mVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qy1.h(this.f367731g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qy1.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x003c -> B:5:0x003f). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r6.f367730f
            r2 = 1
            if (r1 == 0) goto L1a
            if (r1 != r2) goto L12
            int r1 = r6.f367729e
            int r3 = r6.f367728d
            kotlin.ResultKt.throwOnFailure(r7)
            r7 = r6
            goto L3f
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            kotlin.ResultKt.throwOnFailure(r7)
            qy1.m r7 = r6.f367731g
            int r7 = r7.f367744b
            r1 = 0
            r3 = r1
            r1 = r7
            r7 = r6
        L25:
            if (r3 >= r1) goto L48
            qy1.m r4 = r7.f367731g
            u26.w r4 = r4.f367745c
            qy1.i r5 = new qy1.i
            r5.<init>(r3)
            r7.f367728d = r3
            r7.f367729e = r1
            r7.f367730f = r2
            u26.o r4 = (u26.o) r4
            java.lang.Object r4 = r4.t(r5, r7)
            if (r4 != r0) goto L3f
            return r0
        L3f:
            qy1.m r4 = r7.f367731g
            java.util.concurrent.atomic.AtomicInteger r4 = r4.f367743a
            r4.incrementAndGet()
            int r3 = r3 + r2
            goto L25
        L48:
            jz5.f0 r7 = jz5.f0.f302826a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: qy1.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
