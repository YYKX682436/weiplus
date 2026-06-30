package wc5;

/* loaded from: classes10.dex */
public final class w0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f444650d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f444651e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wc5.y0 f444652f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(wc5.y0 y0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f444652f = y0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        wc5.w0 w0Var = new wc5.w0(this.f444652f, continuation);
        w0Var.f444651e = obj;
        return w0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((wc5.w0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x009a  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r0 = "imageIdentify: toIdentify="
            pz5.a r1 = pz5.a.f359186d
            int r2 = r8.f444650d
            r3 = 0
            java.lang.String r4 = "MicroMsg.MsgHistoryGallerySearchFilterUIC"
            jz5.f0 r5 = jz5.f0.f302826a
            r6 = 1
            if (r2 == 0) goto L1c
            if (r2 != r6) goto L14
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L89
            goto L81
        L14:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1c:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.Object r9 = r8.f444651e
            kotlinx.coroutines.y0 r9 = (kotlinx.coroutines.y0) r9
            wc5.y0 r2 = r8.f444652f
            kotlin.Result$Companion r7 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L89
            nc5.a r7 = nc5.a.f336188a     // Catch: java.lang.Throwable -> L89
            uc5.r r2 = r2.U6()     // Catch: java.lang.Throwable -> L89
            com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI r2 = (com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) r2     // Catch: java.lang.Throwable -> L89
            java.lang.String r2 = r2.j7()     // Catch: java.lang.Throwable -> L89
            android.util.Pair r2 = r7.g(r2, r3)     // Catch: java.lang.Throwable -> L89
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L89
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L89
            java.lang.Object r0 = r2.first     // Catch: java.lang.Throwable -> L89
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L89
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L89
            r7.append(r0)     // Catch: java.lang.Throwable -> L89
            java.lang.String r0 = ", oldData="
            r7.append(r0)     // Catch: java.lang.Throwable -> L89
            java.lang.Object r0 = r2.second     // Catch: java.lang.Throwable -> L89
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L89
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L89
            r7.append(r0)     // Catch: java.lang.Throwable -> L89
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> L89
            com.tencent.mars.xlog.Log.i(r4, r0)     // Catch: java.lang.Throwable -> L89
            kotlinx.coroutines.z0.g(r9)     // Catch: java.lang.Throwable -> L89
            aq.n r9 = aq.o.f12922c     // Catch: java.lang.Throwable -> L89
            if (r9 == 0) goto L83
            java.lang.Object r0 = r2.first     // Catch: java.lang.Throwable -> L89
            java.lang.String r7 = "first"
            kotlin.jvm.internal.o.f(r0, r7)     // Catch: java.lang.Throwable -> L89
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L89
            java.lang.Object r2 = r2.second     // Catch: java.lang.Throwable -> L89
            java.lang.String r7 = "second"
            kotlin.jvm.internal.o.f(r2, r7)     // Catch: java.lang.Throwable -> L89
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> L89
            r8.f444650d = r6     // Catch: java.lang.Throwable -> L89
            java.lang.Object r9 = r9.c(r0, r2, r8)     // Catch: java.lang.Throwable -> L89
            if (r9 != r1) goto L81
            return r1
        L81:
            r9 = r5
            goto L84
        L83:
            r9 = 0
        L84:
            java.lang.Object r9 = kotlin.Result.m521constructorimpl(r9)     // Catch: java.lang.Throwable -> L89
            goto L94
        L89:
            r9 = move-exception
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            java.lang.Object r9 = kotlin.ResultKt.createFailure(r9)
            java.lang.Object r9 = kotlin.Result.m521constructorimpl(r9)
        L94:
            java.lang.Throwable r9 = kotlin.Result.m524exceptionOrNullimpl(r9)
            if (r9 == 0) goto La2
            java.lang.String r0 = "startBackgroundImageIdentify failed"
            java.lang.Object[] r1 = new java.lang.Object[r3]
            com.tencent.mars.xlog.Log.printErrStackTrace(r4, r9, r0, r1)
        La2:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: wc5.w0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
