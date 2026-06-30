package mw4;

/* loaded from: classes.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f331759d;

    /* renamed from: e, reason: collision with root package name */
    public int f331760e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f331761f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f331762g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f331761f = str;
        this.f331762g = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mw4.b(this.f331761f, this.f331762g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mw4.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0077, code lost:
    
        if ((r0.length() > 0) == true) goto L26;
     */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r8.f331760e
            java.lang.String r2 = "MicroMsg.EmoticonInterceptor"
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L1c
            if (r1 != r4) goto L14
            java.lang.Object r0 = r8.f331759d
            com.tencent.mm.api.IEmojiInfo r0 = (com.tencent.mm.api.IEmojiInfo) r0
            kotlin.ResultKt.throwOnFailure(r9)
            goto L62
        L14:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1c:
            kotlin.ResultKt.throwOnFailure(r9)
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            java.lang.String r1 = "md5"
            java.lang.String r5 = r8.f331761f
            r9.putString(r1, r5)
            java.lang.String r1 = "emojiInfoBuf"
            java.lang.String r5 = r8.f331762g
            r9.putString(r1, r5)
            java.lang.String r1 = com.tencent.mm.sdk.platformtools.w9.f193053a
            java.lang.Class<mw4.d> r5 = mw4.d.class
            android.os.Parcelable r9 = com.tencent.mm.ipcinvoker.d0.f(r1, r9, r5)
            com.tencent.mm.api.IEmojiInfo r9 = (com.tencent.mm.api.IEmojiInfo) r9
            if (r9 != 0) goto L44
            java.lang.String r9 = "input emojiInfoBuf is invalid"
            com.tencent.mars.xlog.Log.e(r2, r9)
            return r3
        L44:
            r8.f331759d = r9
            r8.f331760e = r4
            oz5.n r5 = new oz5.n
            kotlin.coroutines.Continuation r6 = pz5.f.b(r8)
            r5.<init>(r6)
            mw4.a r6 = new mw4.a
            r6.<init>(r5)
            java.lang.Class<mw4.f> r7 = mw4.f.class
            com.tencent.mm.ipcinvoker.d0.d(r1, r9, r7, r6)
            java.lang.Object r9 = r5.a()
            if (r9 != r0) goto L62
            return r0
        L62:
            r0 = r9
            com.tencent.mm.ipcinvoker.type.IPCString r0 = (com.tencent.mm.ipcinvoker.type.IPCString) r0
            r1 = 0
            if (r0 == 0) goto L7a
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L7a
            int r0 = r0.length()
            if (r0 <= 0) goto L76
            r0 = r4
            goto L77
        L76:
            r0 = r1
        L77:
            if (r0 != r4) goto L7a
            goto L7b
        L7a:
            r4 = r1
        L7b:
            if (r4 == 0) goto L7e
            goto L7f
        L7e:
            r9 = r3
        L7f:
            com.tencent.mm.ipcinvoker.type.IPCString r9 = (com.tencent.mm.ipcinvoker.type.IPCString) r9
            if (r9 == 0) goto L94
            java.lang.String r9 = r9.f68406d     // Catch: java.lang.Exception -> L8c
            r0 = -1
            byte[] r9 = com.tencent.mm.vfs.w6.N(r9, r1, r0)     // Catch: java.lang.Exception -> L8c
            r3 = r9
            goto L94
        L8c:
            r9 = move-exception
            java.lang.String r0 = "failed to read emoticon file"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.tencent.mars.xlog.Log.printErrStackTrace(r2, r9, r0, r1)
        L94:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: mw4.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
