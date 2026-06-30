package gu0;

/* loaded from: classes5.dex */
public final class e1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f275658d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gu0.k2 f275659e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f275660f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(gu0.k2 k2Var, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f275659e = k2Var;
        this.f275660f = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gu0.e1(this.f275659e, this.f275660f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gu0.e1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f A[Catch: Exception -> 0x00a2, TryCatch #0 {Exception -> 0x00a2, blocks: (B:7:0x001a, B:8:0x008c, B:10:0x001f, B:11:0x0082, B:14:0x0023, B:15:0x0078, B:18:0x0027, B:19:0x006e, B:22:0x002b, B:23:0x0057, B:25:0x005f, B:26:0x0064, B:29:0x002f, B:30:0x003f, B:32:0x0047, B:34:0x004d, B:38:0x0036), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0047 A[Catch: Exception -> 0x00a2, TryCatch #0 {Exception -> 0x00a2, blocks: (B:7:0x001a, B:8:0x008c, B:10:0x001f, B:11:0x0082, B:14:0x0023, B:15:0x0078, B:18:0x0027, B:19:0x006e, B:22:0x002b, B:23:0x0057, B:25:0x005f, B:26:0x0064, B:29:0x002f, B:30:0x003f, B:32:0x0047, B:34:0x004d, B:38:0x0036), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004d A[Catch: Exception -> 0x00a2, TryCatch #0 {Exception -> 0x00a2, blocks: (B:7:0x001a, B:8:0x008c, B:10:0x001f, B:11:0x0082, B:14:0x0023, B:15:0x0078, B:18:0x0027, B:19:0x006e, B:22:0x002b, B:23:0x0057, B:25:0x005f, B:26:0x0064, B:29:0x002f, B:30:0x003f, B:32:0x0047, B:34:0x004d, B:38:0x0036), top: B:2:0x000f }] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r0 = "preparePreview: complete, templateId="
            pz5.a r1 = pz5.a.f359186d
            int r2 = r8.f275658d
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 1
            yz5.l r5 = r8.f275660f
            java.lang.String r6 = "MJCC.Session"
            gu0.k2 r7 = r8.f275659e
            switch(r2) {
                case 0: goto L33;
                case 1: goto L2f;
                case 2: goto L2b;
                case 3: goto L27;
                case 4: goto L23;
                case 5: goto L1f;
                case 6: goto L1a;
                default: goto L12;
            }
        L12:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1a:
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Exception -> La2
            goto L8c
        L1f:
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Exception -> La2
            goto L82
        L23:
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Exception -> La2
            goto L78
        L27:
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Exception -> La2
            goto L6e
        L2b:
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Exception -> La2
            goto L57
        L2f:
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Exception -> La2
            goto L3f
        L33:
            kotlin.ResultKt.throwOnFailure(r9)
            r8.f275658d = r4     // Catch: java.lang.Exception -> La2
            java.lang.Object r9 = r7.n(r8)     // Catch: java.lang.Exception -> La2
            if (r9 != r1) goto L3f
            return r1
        L3f:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Exception -> La2
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Exception -> La2
            if (r9 != 0) goto L4d
            java.lang.String r9 = "MaaS SDK not ready"
            r5.invoke(r9)     // Catch: java.lang.Exception -> La2
            return r3
        L4d:
            r9 = 2
            r8.f275658d = r9     // Catch: java.lang.Exception -> La2
            java.lang.Object r9 = gu0.k2.k(r7, r8)     // Catch: java.lang.Exception -> La2
            if (r9 != r1) goto L57
            return r1
        L57:
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Exception -> La2
            eu0.b r2 = r7.f275725a     // Catch: java.lang.Exception -> La2
            eu0.n r2 = r2.f256702h     // Catch: java.lang.Exception -> La2
            if (r2 != 0) goto L64
            java.lang.String r2 = "preparePreview: no music info"
            com.tencent.mars.xlog.Log.i(r6, r2)     // Catch: java.lang.Exception -> La2
        L64:
            r2 = 3
            r8.f275658d = r2     // Catch: java.lang.Exception -> La2
            java.lang.Object r9 = gu0.k2.g(r7, r9, r8)     // Catch: java.lang.Exception -> La2
            if (r9 != r1) goto L6e
            return r1
        L6e:
            r9 = 4
            r8.f275658d = r9     // Catch: java.lang.Exception -> La2
            java.lang.Object r9 = gu0.k2.i(r7, r8)     // Catch: java.lang.Exception -> La2
            if (r9 != r1) goto L78
            return r1
        L78:
            r9 = 5
            r8.f275658d = r9     // Catch: java.lang.Exception -> La2
            java.lang.Object r9 = gu0.k2.d(r7, r8)     // Catch: java.lang.Exception -> La2
            if (r9 != r1) goto L82
            return r1
        L82:
            r9 = 6
            r8.f275658d = r9     // Catch: java.lang.Exception -> La2
            java.lang.Object r9 = r7.u(r4, r8)     // Catch: java.lang.Exception -> La2
            if (r9 != r1) goto L8c
            return r1
        L8c:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La2
            r9.<init>(r0)     // Catch: java.lang.Exception -> La2
            java.lang.String r0 = r7.f275744t     // Catch: java.lang.Exception -> La2
            r9.append(r0)     // Catch: java.lang.Exception -> La2
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Exception -> La2
            com.tencent.mars.xlog.Log.i(r6, r9)     // Catch: java.lang.Exception -> La2
            r9 = 0
            r5.invoke(r9)     // Catch: java.lang.Exception -> La2
            goto Lcd
        La2:
            r9 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "preparePreview: exception: "
            r0.<init>(r1)
            java.lang.String r1 = r9.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.e(r6, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Exception: "
            r0.<init>(r1)
            java.lang.String r9 = r9.getMessage()
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r5.invoke(r9)
        Lcd:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: gu0.e1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
