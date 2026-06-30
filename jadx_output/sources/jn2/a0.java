package jn2;

/* loaded from: classes5.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f300546d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jn2.f0 f300547e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(jn2.f0 f0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f300547e = f0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new jn2.a0(this.f300547e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((jn2.a0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0053 A[Catch: all -> 0x0097, Exception -> 0x0099, TryCatch #0 {Exception -> 0x0099, blocks: (B:5:0x000f, B:6:0x0045, B:8:0x004b, B:9:0x004f, B:11:0x0053, B:12:0x0057, B:14:0x005b, B:19:0x0066, B:22:0x006e, B:25:0x0074, B:27:0x0081, B:29:0x0085, B:31:0x0089, B:32:0x009b, B:33:0x009e, B:37:0x009f, B:38:0x00a2, B:47:0x0020, B:49:0x0024, B:51:0x0031, B:52:0x003a), top: B:2:0x000b, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b A[Catch: all -> 0x0097, Exception -> 0x0099, TRY_LEAVE, TryCatch #0 {Exception -> 0x0099, blocks: (B:5:0x000f, B:6:0x0045, B:8:0x004b, B:9:0x004f, B:11:0x0053, B:12:0x0057, B:14:0x005b, B:19:0x0066, B:22:0x006e, B:25:0x0074, B:27:0x0081, B:29:0x0085, B:31:0x0089, B:32:0x009b, B:33:0x009e, B:37:0x009f, B:38:0x00a2, B:47:0x0020, B:49:0x0024, B:51:0x0031, B:52:0x003a), top: B:2:0x000b, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066 A[Catch: all -> 0x0097, Exception -> 0x0099, TRY_ENTER, TryCatch #0 {Exception -> 0x0099, blocks: (B:5:0x000f, B:6:0x0045, B:8:0x004b, B:9:0x004f, B:11:0x0053, B:12:0x0057, B:14:0x005b, B:19:0x0066, B:22:0x006e, B:25:0x0074, B:27:0x0081, B:29:0x0085, B:31:0x0089, B:32:0x009b, B:33:0x009e, B:37:0x009f, B:38:0x00a2, B:47:0x0020, B:49:0x0024, B:51:0x0031, B:52:0x003a), top: B:2:0x000b, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074 A[Catch: all -> 0x0097, Exception -> 0x0099, TRY_ENTER, TryCatch #0 {Exception -> 0x0099, blocks: (B:5:0x000f, B:6:0x0045, B:8:0x004b, B:9:0x004f, B:11:0x0053, B:12:0x0057, B:14:0x005b, B:19:0x0066, B:22:0x006e, B:25:0x0074, B:27:0x0081, B:29:0x0085, B:31:0x0089, B:32:0x009b, B:33:0x009e, B:37:0x009f, B:38:0x00a2, B:47:0x0020, B:49:0x0024, B:51:0x0031, B:52:0x003a), top: B:2:0x000b, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009f A[Catch: all -> 0x0097, Exception -> 0x0099, TryCatch #0 {Exception -> 0x0099, blocks: (B:5:0x000f, B:6:0x0045, B:8:0x004b, B:9:0x004f, B:11:0x0053, B:12:0x0057, B:14:0x005b, B:19:0x0066, B:22:0x006e, B:25:0x0074, B:27:0x0081, B:29:0x0085, B:31:0x0089, B:32:0x009b, B:33:0x009e, B:37:0x009f, B:38:0x00a2, B:47:0x0020, B:49:0x0024, B:51:0x0031, B:52:0x003a), top: B:2:0x000b, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004b A[Catch: all -> 0x0097, Exception -> 0x0099, TryCatch #0 {Exception -> 0x0099, blocks: (B:5:0x000f, B:6:0x0045, B:8:0x004b, B:9:0x004f, B:11:0x0053, B:12:0x0057, B:14:0x005b, B:19:0x0066, B:22:0x006e, B:25:0x0074, B:27:0x0081, B:29:0x0085, B:31:0x0089, B:32:0x009b, B:33:0x009e, B:37:0x009f, B:38:0x00a2, B:47:0x0020, B:49:0x0024, B:51:0x0031, B:52:0x003a), top: B:2:0x000b, outer: #1 }] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r0 = "load more failed: "
            pz5.a r1 = pz5.a.f359186d
            int r2 = r9.f300546d
            r3 = 1
            r4 = 0
            r5 = 0
            jn2.f0 r6 = r9.f300547e
            if (r2 == 0) goto L1b
            if (r2 != r3) goto L13
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            goto L45
        L13:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1b:
            kotlin.ResultKt.throwOnFailure(r10)
            r6.f300609r = r3
            sf2.x r10 = r6.f300598d     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            if (r10 == 0) goto L48
            r45.in r2 = r6.f300608q     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            int r2 = r2.f377156d     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            java.lang.Integer r7 = new java.lang.Integer     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r45.ch6 r2 = r6.f300605n     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            if (r2 == 0) goto L39
            int r2 = r2.f371555d     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            java.lang.Integer r8 = new java.lang.Integer     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            goto L3a
        L39:
            r8 = r5
        L3a:
            com.tencent.mm.protobuf.g r2 = r6.f300610s     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r9.f300546d = r3     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            java.lang.Object r10 = r10.d7(r7, r8, r2, r9)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            if (r10 != r1) goto L45
            return r1
        L45:
            r45.zw1 r10 = (r45.zw1) r10     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            goto L49
        L48:
            r10 = r5
        L49:
            if (r10 == 0) goto L4e
            com.tencent.mm.protobuf.g r1 = r10.f392416e     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            goto L4f
        L4e:
            r1 = r5
        L4f:
            r6.f300610s = r1     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            if (r10 == 0) goto L56
            int r1 = r10.f392417f     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            goto L57
        L56:
            r1 = r4
        L57:
            r6.f300611t = r1     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            if (r10 == 0) goto L5e
            java.util.LinkedList r1 = r10.f392415d     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            goto L5f
        L5e:
            r1 = r5
        L5f:
            kz5.p0 r2 = kz5.p0.f313996d
            if (r1 != 0) goto L64
            r1 = r2
        L64:
            if (r10 == 0) goto L69
            java.util.LinkedList r10 = r10.f392419h     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            goto L6a
        L69:
            r10 = r5
        L6a:
            if (r10 != 0) goto L6d
            goto L6e
        L6d:
            r2 = r10
        L6e:
            jn2.c1 r10 = r6.f300600f     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            java.lang.String r3 = "rvAdapter"
            if (r10 == 0) goto L9f
            java.util.List r1 = kz5.n0.S0(r1)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            java.lang.String r7 = ""
            r10.x(r1, r2, r7)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            int r10 = r6.f300611t     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            if (r10 != 0) goto Lb8
            jn2.c1 r10 = r6.f300600f     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            if (r10 == 0) goto L9b
            boolean r1 = r10.f300575o     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            if (r1 == 0) goto Lb8
            r10.f300575o = r4     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            java.util.List r1 = r10.f300574n     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            r10.notifyItemRemoved(r1)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            goto Lb8
        L97:
            r10 = move-exception
            goto Lbd
        L99:
            r10 = move-exception
            goto La3
        L9b:
            kotlin.jvm.internal.o.o(r3)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            throw r5     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
        L9f:
            kotlin.jvm.internal.o.o(r3)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            throw r5     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
        La3:
            java.lang.String r1 = "FinderLiveAnchorSingSongAddPanelTabView"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L97
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L97
            java.lang.String r10 = r10.getMessage()     // Catch: java.lang.Throwable -> L97
            r2.append(r10)     // Catch: java.lang.Throwable -> L97
            java.lang.String r10 = r2.toString()     // Catch: java.lang.Throwable -> L97
            com.tencent.mars.xlog.Log.e(r1, r10)     // Catch: java.lang.Throwable -> L97
        Lb8:
            r6.f300609r = r4
            jz5.f0 r10 = jz5.f0.f302826a
            return r10
        Lbd:
            r6.f300609r = r4
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: jn2.a0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
