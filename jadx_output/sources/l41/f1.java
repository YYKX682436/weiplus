package l41;

/* loaded from: classes15.dex */
public final class f1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f315811d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l41.j1 f315812e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f315813f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(l41.j1 j1Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f315812e = j1Var;
        this.f315813f = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new l41.f1(this.f315812e, this.f315813f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((l41.f1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004e  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r10.f315811d
            r2 = 1
            l41.j1 r3 = r10.f315812e
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.ResultKt.throwOnFailure(r11)
            goto L3e
        Lf:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L17:
            kotlin.ResultKt.throwOnFailure(r11)
            com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest r11 = r3.f315844c
            r1 = 0
            if (r11 == 0) goto L25
            boolean r11 = r11.f72275g
            if (r2 != r11) goto L25
            r11 = r2
            goto L26
        L25:
            r11 = r1
        L26:
            if (r11 == 0) goto L35
            jz5.l r11 = new jz5.l
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            java.lang.String r1 = ""
            r11.<init>(r0, r1)
            goto L40
        L35:
            r10.f315811d = r2
            java.lang.Object r11 = l41.j1.a(r3, r10)
            if (r11 != r0) goto L3e
            return r0
        L3e:
            jz5.l r11 = (jz5.l) r11
        L40:
            java.lang.Object r0 = r11.f302833d
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Object r1 = r11.f302834e
            java.lang.Object r11 = r11.f302833d
            if (r0 != 0) goto L69
            android.os.ResultReceiver r4 = r3.l()
            long r5 = r3.m()
            r7 = 1
            java.lang.Number r11 = (java.lang.Number) r11
            int r8 = r11.intValue()
            r9 = r1
            java.lang.String r9 = (java.lang.String) r9
            l41.e2.a(r4, r5, r7, r8, r9)
            boolean r11 = r10.f315813f
            r3.r(r11)
            goto L8b
        L69:
            r0 = r11
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            r3.g(r0, r2)
            android.os.ResultReceiver r4 = r3.l()
            long r5 = r3.m()
            r7 = 0
            java.lang.Number r11 = (java.lang.Number) r11
            int r8 = r11.intValue()
            r9 = r1
            java.lang.String r9 = (java.lang.String) r9
            l41.e2.a(r4, r5, r7, r8, r9)
        L8b:
            jz5.f0 r11 = jz5.f0.f302826a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: l41.f1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
