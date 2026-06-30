package df2;

/* loaded from: classes10.dex */
public final class hy extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f230360d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f230361e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f230362f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.crit.LivePkCritDoingView f230363g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ df2.wy f230364h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy(kotlin.jvm.internal.f0 f0Var, com.tencent.mm.plugin.finder.view.crit.LivePkCritDoingView livePkCritDoingView, df2.wy wyVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230362f = f0Var;
        this.f230363g = livePkCritDoingView;
        this.f230364h = wyVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        df2.hy hyVar = new df2.hy(this.f230362f, this.f230363g, this.f230364h, continuation);
        hyVar.f230361e = obj;
        return hyVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.hy) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0033 -> B:5:0x0036). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r5.f230360d
            r2 = 1
            if (r1 == 0) goto L1a
            if (r1 != r2) goto L12
            java.lang.Object r1 = r5.f230361e
            kotlinx.coroutines.y0 r1 = (kotlinx.coroutines.y0) r1
            kotlin.ResultKt.throwOnFailure(r6)
            r6 = r5
            goto L36
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.Object r6 = r5.f230361e
            kotlinx.coroutines.y0 r6 = (kotlinx.coroutines.y0) r6
            r1 = r6
            r6 = r5
        L23:
            kotlin.jvm.internal.f0 r3 = r6.f230362f
            int r3 = r3.f310116d
            if (r3 <= 0) goto L44
            r6.f230361e = r1
            r6.f230360d = r2
            r3 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r3 = kotlinx.coroutines.k1.b(r3, r6)
            if (r3 != r0) goto L36
            return r0
        L36:
            kotlin.jvm.internal.f0 r3 = r6.f230362f
            int r4 = r3.f310116d
            int r4 = r4 + (-1)
            r3.f310116d = r4
            com.tencent.mm.plugin.finder.view.crit.LivePkCritDoingView r3 = r6.f230363g
            r3.m(r4)
            goto L23
        L44:
            kotlinx.coroutines.z0.g(r1)
            df2.wy r6 = r6.f230364h
            java.lang.String r0 = r6.f231736m
            java.lang.String r1 = "onCritQuestInfoChanged STAGE_QUEST_PROCESSING countDown finish"
            com.tencent.mars.xlog.Log.i(r0, r1)
            r6.l7()
            r0 = 3
            r6.f231737n = r0
            jz5.f0 r6 = jz5.f0.f302826a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.hy.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
