package nu0;

/* loaded from: classes5.dex */
public final class m1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f340017d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f340018e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f340019f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(nu0.b4 b4Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f340018e = b4Var;
        this.f340019f = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nu0.m1(this.f340018e, this.f340019f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((nu0.m1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0068 A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r6.f340017d
            r2 = 3
            r3 = 2
            nu0.b4 r4 = r6.f340018e
            r5 = 1
            if (r1 == 0) goto L25
            if (r1 == r5) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            kotlin.ResultKt.throwOnFailure(r7)
            goto L69
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            kotlin.ResultKt.throwOnFailure(r7)
            goto L60
        L21:
            kotlin.ResultKt.throwOnFailure(r7)
            goto L32
        L25:
            kotlin.ResultKt.throwOnFailure(r7)
            r6.f340017d = r5
            r7 = 0
            java.lang.Object r7 = yt0.c.o(r4, r7, r6, r5, r7)
            if (r7 != r0) goto L32
            return r0
        L32:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "doExitMovieComposing: releaseMaasCore = "
            r7.<init>(r1)
            com.tencent.mm.mj_publisher.finder.movie_composing.uic.MovieComposingConfig r1 = r4.o7()
            boolean r1 = r1.a()
            r1 = r1 ^ r5
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            java.lang.String r1 = "ImageComp.MainComposingUIC"
            com.tencent.mars.xlog.Log.i(r1, r7)
            com.tencent.mm.mj_publisher.finder.movie_composing.uic.MovieComposingConfig r7 = r4.o7()
            boolean r7 = r7.a()
            r7 = r7 ^ r5
            r6.f340017d = r3
            java.lang.Object r7 = nu0.b4.f7(r4, r7, r5, r6)
            if (r7 != r0) goto L60
            return r0
        L60:
            r6.f340017d = r2
            java.lang.Object r7 = r4.E4(r6)
            if (r7 != r0) goto L69
            return r0
        L69:
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            java.lang.String r0 = "cancel"
            r7.putExtra(r0, r5)
            java.lang.String r0 = "edited"
            boolean r1 = r6.f340019f
            r7.putExtra(r0, r1)
            androidx.appcompat.app.AppCompatActivity r0 = r4.getActivity()
            r1 = 0
            r0.setResult(r1, r7)
            androidx.appcompat.app.AppCompatActivity r7 = r4.getActivity()
            r7.finish()
            jz5.f0 r7 = jz5.f0.f302826a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: nu0.m1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
