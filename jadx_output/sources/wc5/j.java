package wc5;

/* loaded from: classes10.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f444581d;

    /* renamed from: e, reason: collision with root package name */
    public int f444582e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f444583f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wc5.q f444584g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(wc5.q qVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f444584g = qVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        wc5.j jVar = new wc5.j(this.f444584g, continuation);
        jVar.f444583f = obj;
        return jVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((wc5.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0080  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r8.f444582e
            r2 = 2
            r3 = 1
            jz5.f0 r4 = jz5.f0.f302826a
            r5 = 0
            if (r1 == 0) goto L27
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L6f
            goto L6a
        L13:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1b:
            java.lang.Object r1 = r8.f444581d
            com.tencent.mm.plugin.mvvmlist.MvvmList r1 = (com.tencent.mm.plugin.mvvmlist.MvvmList) r1
            java.lang.Object r3 = r8.f444583f
            wc5.q r3 = (wc5.q) r3
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L6f
            goto L54
        L27:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.Object r9 = r8.f444583f
            kotlinx.coroutines.y0 r9 = (kotlinx.coroutines.y0) r9
            wc5.q r9 = r8.f444584g
            kotlin.Result$Companion r1 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L6f
            uc5.r r1 = r9.X6()     // Catch: java.lang.Throwable -> L6f
            com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI r1 = (com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) r1     // Catch: java.lang.Throwable -> L6f
            com.tencent.mm.plugin.mvvmlist.MvvmList r1 = r1.l7()     // Catch: java.lang.Throwable -> L6f
            if (r1 != 0) goto L3f
            return r4
        L3f:
            kotlinx.coroutines.flow.n2 r6 = r1.f152072v     // Catch: java.lang.Throwable -> L6f
            wc5.h r7 = new wc5.h     // Catch: java.lang.Throwable -> L6f
            r7.<init>(r5)     // Catch: java.lang.Throwable -> L6f
            r8.f444583f = r9     // Catch: java.lang.Throwable -> L6f
            r8.f444581d = r1     // Catch: java.lang.Throwable -> L6f
            r8.f444582e = r3     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r3 = kotlinx.coroutines.flow.l.l(r6, r7, r8)     // Catch: java.lang.Throwable -> L6f
            if (r3 != r0) goto L53
            return r0
        L53:
            r3 = r9
        L54:
            kotlinx.coroutines.p0 r9 = kotlinx.coroutines.q1.f310568a     // Catch: java.lang.Throwable -> L6f
            kotlinx.coroutines.g3 r9 = kotlinx.coroutines.internal.b0.f310484a     // Catch: java.lang.Throwable -> L6f
            wc5.i r6 = new wc5.i     // Catch: java.lang.Throwable -> L6f
            r6.<init>(r1, r3, r5)     // Catch: java.lang.Throwable -> L6f
            r8.f444583f = r5     // Catch: java.lang.Throwable -> L6f
            r8.f444581d = r5     // Catch: java.lang.Throwable -> L6f
            r8.f444582e = r2     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r9 = kotlinx.coroutines.l.g(r9, r6, r8)     // Catch: java.lang.Throwable -> L6f
            if (r9 != r0) goto L6a
            return r0
        L6a:
            java.lang.Object r9 = kotlin.Result.m521constructorimpl(r4)     // Catch: java.lang.Throwable -> L6f
            goto L7a
        L6f:
            r9 = move-exception
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            java.lang.Object r9 = kotlin.ResultKt.createFailure(r9)
            java.lang.Object r9 = kotlin.Result.m521constructorimpl(r9)
        L7a:
            java.lang.Throwable r9 = kotlin.Result.m524exceptionOrNullimpl(r9)
            if (r9 == 0) goto L8a
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "MicroMsg.MsgHistoryGalleryInitialLoadUIC"
            java.lang.String r2 = "emptyLoadWatcher error"
            com.tencent.mars.xlog.Log.printErrStackTrace(r1, r9, r2, r0)
        L8a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: wc5.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
