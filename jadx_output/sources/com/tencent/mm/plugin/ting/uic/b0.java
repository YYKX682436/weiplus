package com.tencent.mm.plugin.ting.uic;

/* loaded from: classes.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f174738d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f174739e;

    /* renamed from: f, reason: collision with root package name */
    public int f174740f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.uic.e0 f174741g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f174742h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f174743i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f174744m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.tencent.mm.plugin.ting.uic.e0 e0Var, boolean z17, kotlin.coroutines.Continuation continuation, boolean z18, kotlin.coroutines.Continuation continuation2) {
        super(2, continuation2);
        this.f174741g = e0Var;
        this.f174742h = z17;
        this.f174743i = continuation;
        this.f174744m = z18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.ting.uic.b0(this.f174741g, this.f174742h, this.f174743i, this.f174744m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.ting.uic.b0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0050 -> B:5:0x0056). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r9.f174740f
            jz5.f0 r2 = jz5.f0.f302826a
            java.lang.String r3 = "MicroMsg.TingFloatBallAnimationUICWrapper"
            r4 = 1
            if (r1 == 0) goto L25
            if (r1 != r4) goto L1d
            java.lang.Object r1 = r9.f174739e
            com.tencent.mm.plugin.ting.uic.i r1 = (com.tencent.mm.plugin.ting.uic.i) r1
            java.lang.Object r5 = r9.f174738d
            java.util.Iterator r5 = (java.util.Iterator) r5
            kotlin.ResultKt.throwOnFailure(r10)
            r6 = r5
            r5 = r1
            r1 = r0
            r0 = r9
            goto L56
        L1d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L25:
            kotlin.ResultKt.throwOnFailure(r10)
            com.tencent.mm.plugin.ting.uic.e0 r10 = r9.f174741g
            java.util.ArrayList r10 = r10.O6()
            java.util.Iterator r10 = r10.iterator()
            r5 = r10
            r10 = r9
        L34:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L81
            java.lang.Object r1 = r5.next()
            com.tencent.mm.plugin.ting.uic.i r1 = (com.tencent.mm.plugin.ting.uic.i) r1
            r10.f174738d = r5
            r10.f174739e = r1
            r10.f174740f = r4
            boolean r6 = r10.f174742h
            r7 = 0
            java.lang.Object r6 = r1.d(r6, r7, r10)
            if (r6 != r0) goto L50
            return r0
        L50:
            r8 = r0
            r0 = r10
            r10 = r6
            r6 = r5
            r5 = r1
            r1 = r8
        L56:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L7d
            java.lang.Class r10 = r5.getClass()
            java.lang.String r10 = r10.getSimpleName()
            java.lang.String r1 = "exitWithAnimation handled by "
            java.lang.String r10 = r1.concat(r10)
            com.tencent.mars.xlog.Log.i(r3, r10)
            kotlin.Result$Companion r10 = kotlin.Result.INSTANCE
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            java.lang.Object r10 = kotlin.Result.m521constructorimpl(r10)
            kotlin.coroutines.Continuation r0 = r0.f174743i
            r0.resumeWith(r10)
            return r2
        L7d:
            r10 = r0
            r0 = r1
            r5 = r6
            goto L34
        L81:
            java.lang.String r0 = "exitWithAnimation handled: false"
            com.tencent.mars.xlog.Log.i(r3, r0)
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.Object r0 = kotlin.Result.m521constructorimpl(r0)
            kotlin.coroutines.Continuation r1 = r10.f174743i
            r1.resumeWith(r0)
            boolean r0 = r10.f174744m
            if (r0 == 0) goto La0
            com.tencent.mm.plugin.ting.uic.e0 r10 = r10.f174741g
            androidx.appcompat.app.AppCompatActivity r10 = r10.getActivity()
            r10.finish()
        La0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.ting.uic.b0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
