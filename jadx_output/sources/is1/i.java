package is1;

/* loaded from: classes7.dex */
public final class i implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f294419d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f294420e;

    public i(kotlin.coroutines.Continuation continuation, java.util.HashMap hashMap) {
        this.f294419d = continuation;
        this.f294420e = hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0036 A[SYNTHETIC] */
    @Override // com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSceneEnd(int r6, int r7, java.lang.String r8, com.tencent.mm.modelbase.m1 r9) {
        /*
            r5 = this;
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r8 = new java.lang.Object[]{r0, r1, r8}
            java.lang.String r0 = "[processTmplInfo]errType:%d, errCode:%d errMsg:%s"
            java.lang.String r1 = "MicroMsg.Preload.TmplInfoManager"
            com.tencent.mars.xlog.Log.i(r1, r0, r8)
            r8 = 1
            r9.setHasCallbackToQueue(r8)
            kotlin.coroutines.Continuation r0 = r5.f294419d
            if (r6 != 0) goto L80
            if (r7 != 0) goto L80
            w60.k r9 = (w60.k) r9     // Catch: java.lang.Exception -> L8a
            com.tencent.mm.modelsimple.k0 r9 = (com.tencent.mm.modelsimple.k0) r9     // Catch: java.lang.Exception -> L8a
            com.tencent.mm.modelbase.o r6 = r9.f71356e     // Catch: java.lang.Exception -> L8a
            com.tencent.mm.modelbase.n r6 = r6.f70711b     // Catch: java.lang.Exception -> L8a
            com.tencent.mm.protobuf.f r6 = r6.f70700a     // Catch: java.lang.Exception -> L8a
            r45.s83 r6 = (r45.s83) r6     // Catch: java.lang.Exception -> L8a
            java.util.LinkedList r6 = r6.f385562x     // Catch: java.lang.Exception -> L8a
            java.lang.String r7 = "getHttpHeader(...)"
            kotlin.jvm.internal.o.f(r6, r7)     // Catch: java.lang.Exception -> L8a
            java.util.HashMap r7 = r5.f294420e     // Catch: java.lang.Exception -> L8a
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Exception -> L8a
        L36:
            boolean r2 = r6.hasNext()     // Catch: java.lang.Exception -> L8a
            if (r2 == 0) goto L72
            java.lang.Object r2 = r6.next()     // Catch: java.lang.Exception -> L8a
            r45.rx3 r2 = (r45.rx3) r2     // Catch: java.lang.Exception -> L8a
            java.lang.String r3 = r2.f385272d     // Catch: java.lang.Exception -> L8a
            r4 = 0
            if (r3 == 0) goto L50
            int r3 = r3.length()     // Catch: java.lang.Exception -> L8a
            if (r3 != 0) goto L4e
            goto L50
        L4e:
            r3 = r4
            goto L51
        L50:
            r3 = r8
        L51:
            if (r3 != 0) goto L36
            java.lang.String r3 = r2.f385273e     // Catch: java.lang.Exception -> L8a
            if (r3 == 0) goto L5d
            int r3 = r3.length()     // Catch: java.lang.Exception -> L8a
            if (r3 != 0) goto L5e
        L5d:
            r4 = r8
        L5e:
            if (r4 != 0) goto L36
            java.lang.String r3 = r2.f385272d     // Catch: java.lang.Exception -> L8a
            java.lang.String r4 = "Key"
            kotlin.jvm.internal.o.f(r3, r4)     // Catch: java.lang.Exception -> L8a
            java.lang.String r2 = r2.f385273e     // Catch: java.lang.Exception -> L8a
            java.lang.String r4 = "Value"
            kotlin.jvm.internal.o.f(r2, r4)     // Catch: java.lang.Exception -> L8a
            r7.put(r3, r2)     // Catch: java.lang.Exception -> L8a
            goto L36
        L72:
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L8a
            java.lang.String r6 = r9.Q()     // Catch: java.lang.Exception -> L8a
            java.lang.Object r6 = kotlin.Result.m521constructorimpl(r6)     // Catch: java.lang.Exception -> L8a
            r0.resumeWith(r6)     // Catch: java.lang.Exception -> L8a
            goto La0
        L80:
            java.lang.String r6 = ""
            java.lang.Object r6 = kotlin.Result.m521constructorimpl(r6)     // Catch: java.lang.Exception -> L8a
            r0.resumeWith(r6)     // Catch: java.lang.Exception -> L8a
            goto La0
        L8a:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "NetSceneGetA8Key ex "
            r7.<init>(r8)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.tencent.mars.xlog.Log.e(r1, r6)
        La0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: is1.i.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
