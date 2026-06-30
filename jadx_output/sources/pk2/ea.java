package pk2;

/* loaded from: classes3.dex */
public final class ea extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f355715d;

    /* renamed from: e, reason: collision with root package name */
    public int f355716e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f355717f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f355718g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea(com.tencent.mm.ui.MMActivity mMActivity, pk2.o9 o9Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f355717f = mMActivity;
        this.f355718g = o9Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pk2.ea(this.f355717f, this.f355718g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pk2.ea) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
    
        if (com.tencent.mm.sdk.platformtools.b0.f(r9) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006b, code lost:
    
        db5.t7.i(r8, r8.getResources().getString(com.tencent.mm.R.string.ot_), com.tencent.mm.R.raw.icons_filled_done);
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
    
        com.tencent.mars.xlog.Log.e(r6.f356072a, "onItemClicked: ClipboardHelper.setTextSwallowException failed");
        db5.t7.i(r8, r8.getResources().getString(com.tencent.mm.R.string.orq), com.tencent.mm.R.raw.icons_filled_close);
        r3 = r3;
     */
    /* JADX WARN: Type inference failed for: r3v0, types: [int, com.tencent.mm.plugin.finder.assist.d9] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r1 = r17
            java.lang.String r2 = "onItemClicked error: "
            pz5.a r0 = pz5.a.f359186d
            int r3 = r1.f355716e
            r4 = 2131690818(0x7f0f0542, float:1.901069E38)
            r5 = 2131780948(0x7f106554, float:1.9193496E38)
            pk2.o9 r6 = r1.f355718g
            r7 = 1
            com.tencent.mm.ui.MMActivity r8 = r1.f355717f
            if (r3 == 0) goto L2a
            if (r3 != r7) goto L22
            java.lang.Object r0 = r1.f355715d
            r3 = r0
            com.tencent.mm.plugin.finder.assist.d9 r3 = (com.tencent.mm.plugin.finder.assist.d9) r3
            kotlin.ResultKt.throwOnFailure(r18)     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La1
            r9 = r18
            goto L57
        L22:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L2a:
            kotlin.ResultKt.throwOnFailure(r18)
            com.tencent.mm.plugin.finder.assist.a9 r9 = com.tencent.mm.plugin.finder.assist.d9.f102093f
            com.tencent.mm.ui.MMActivity r10 = r1.f355717f
            android.content.Context r3 = com.tencent.mm.sdk.platformtools.x2.f193071a
            android.content.res.Resources r3 = r3.getResources()
            r11 = 2131768164(0x7f103364, float:1.9167567E38)
            java.lang.String r11 = r3.getString(r11)
            r12 = 500(0x1f4, double:2.47E-321)
            r14 = 0
            r15 = 8
            r16 = 0
            com.tencent.mm.plugin.finder.assist.d9 r3 = com.tencent.mm.plugin.finder.assist.a9.a(r9, r10, r11, r12, r14, r15, r16)
            r3.a()     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La1
            r1.f355715d = r3     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La1
            r1.f355716e = r7     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La1
            java.lang.Object r9 = pk2.ja.a(r6, r1)     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La1
            if (r9 != r0) goto L57
            return r0
        L57:
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La1
            if (r9 == 0) goto L63
            int r0 = r9.length()     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La1
            if (r0 != 0) goto L62
            goto L63
        L62:
            r7 = 0
        L63:
            if (r7 != 0) goto L92
            boolean r0 = com.tencent.mm.sdk.platformtools.b0.f(r9)     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La1
            if (r0 == 0) goto L7d
            android.content.res.Resources r0 = r8.getResources()     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La1
            r7 = 2131781008(0x7f106590, float:1.9193617E38)
            java.lang.String r0 = r0.getString(r7)     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La1
            r7 = 2131690843(0x7f0f055b, float:1.9010741E38)
            db5.t7.i(r8, r0, r7)     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La1
            goto L9d
        L7d:
            java.lang.String r0 = r6.f356072a     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La1
            java.lang.String r7 = "onItemClicked: ClipboardHelper.setTextSwallowException failed"
            com.tencent.mars.xlog.Log.e(r0, r7)     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La1
            android.content.res.Resources r0 = r8.getResources()     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La1
            java.lang.String r0 = r0.getString(r5)     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La1
            db5.t7.i(r8, r0, r4)     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La1
            goto L9d
        L90:
            r0 = move-exception
            goto La3
        L92:
            android.content.res.Resources r0 = r8.getResources()     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La1
            java.lang.String r0 = r0.getString(r5)     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La1
            db5.t7.i(r8, r0, r4)     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La1
        L9d:
            r3.b()
            goto Lc4
        La1:
            r0 = move-exception
            goto Lc7
        La3:
            java.lang.String r6 = r6.f356072a     // Catch: java.lang.Throwable -> La1
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La1
            r7.<init>(r2)     // Catch: java.lang.Throwable -> La1
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> La1
            r7.append(r0)     // Catch: java.lang.Throwable -> La1
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> La1
            com.tencent.mars.xlog.Log.e(r6, r0)     // Catch: java.lang.Throwable -> La1
            android.content.res.Resources r0 = r8.getResources()     // Catch: java.lang.Throwable -> La1
            java.lang.String r0 = r0.getString(r5)     // Catch: java.lang.Throwable -> La1
            db5.t7.i(r8, r0, r4)     // Catch: java.lang.Throwable -> La1
            goto L9d
        Lc4:
            jz5.f0 r0 = jz5.f0.f302826a
            return r0
        Lc7:
            r3.b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pk2.ea.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
