package xc5;

/* loaded from: classes9.dex */
public final class n implements n13.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f453536a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xc5.o f453537b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mf3.k f453538c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f453539d;

    public n(com.tencent.mm.storage.f9 f9Var, xc5.o oVar, mf3.k kVar, java.lang.String str) {
        this.f453536a = f9Var;
        this.f453537b = oVar;
        this.f453538c = kVar;
        this.f453539d = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // n13.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r8, java.lang.String r9, android.os.Bundle r10) {
        /*
            r7 = this;
            java.lang.String r0 = "<anonymous parameter 2>"
            kotlin.jvm.internal.o.g(r10, r0)
            java.lang.String r10 = "MsgHistoryGalleryForwardComponent"
            com.tencent.mm.storage.f9 r0 = r7.f453536a
            if (r8 != 0) goto L21
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "forwardToFriends: user cancelled, msgId="
            r8.<init>(r9)
            long r0 = r0.getMsgId()
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            com.tencent.mars.xlog.Log.i(r10, r8)
            return
        L21:
            xc5.o r8 = r7.f453537b
            r8.getClass()
            mf3.k r1 = r7.f453538c
            mf3.u r2 = r1.getType()
            int r2 = r2.ordinal()
            r3 = 1
            java.lang.String r4 = r7.f453539d
            r5 = 0
            if (r2 == r3) goto L66
            r6 = 2
            if (r2 == r6) goto L5e
            r8 = 3
            if (r2 == r8) goto L66
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r2 = "dispatchSend: unsupported type="
            r8.<init>(r2)
            mf3.u r1 = r1.getType()
            r8.append(r1)
            java.lang.String r1 = ", msgId="
            r8.append(r1)
            long r0 = r0.getMsgId()
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            com.tencent.mars.xlog.Log.w(r10, r8)
            goto L6b
        L5e:
            android.app.Activity r8 = r8.getContext()
            com.tencent.mm.ui.chatting.n3.G(r8, r4, r0, r5)
            goto L6b
        L66:
            k50.n r8 = k50.s.f304256t
            r8.a(r0, r4, r5, r5)
        L6b:
            kotlin.jvm.internal.o.d(r9)
            boolean r8 = r26.n0.N(r9)
            r8 = r8 ^ r3
            if (r8 == 0) goto L7e
            tg3.a1 r8 = tg3.t1.a()
            dk5.s5 r8 = (dk5.s5) r8
            r8.Ui(r9, r4)
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xc5.n.a(boolean, java.lang.String, android.os.Bundle):void");
    }
}
