package com.tencent.mm.plugin.setting.ui.setting_new.uic;

/* loaded from: classes8.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f161997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.uic.n f161998e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f161999f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f162000g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.plugin.setting.ui.setting_new.uic.n nVar, java.lang.String str, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f161998e = nVar;
        this.f161999f = str;
        this.f162000g = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.setting.ui.setting_new.uic.j(this.f161998e, this.f161999f, this.f162000g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.setting.ui.setting_new.uic.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0062  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r10.f161997d
            kz5.p0 r2 = kz5.p0.f313996d
            long r3 = r10.f162000g
            r5 = 2
            r6 = 1
            java.lang.String r7 = r10.f161999f
            com.tencent.mm.plugin.setting.ui.setting_new.uic.n r8 = r10.f161998e
            if (r1 == 0) goto L24
            if (r1 == r6) goto L20
            if (r1 != r5) goto L18
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.lang.Exception -> L7c
            goto L5e
        L18:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L20:
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.lang.Exception -> L7c
            goto L34
        L24:
            kotlin.ResultKt.throwOnFailure(r11)
            kotlinx.coroutines.r2 r11 = r8.f162007f     // Catch: java.lang.Exception -> L7c
            if (r11 == 0) goto L34
            r10.f161997d = r6     // Catch: java.lang.Exception -> L7c
            java.lang.Object r11 = r11.C(r10)     // Catch: java.lang.Exception -> L7c
            if (r11 != r0) goto L34
            return r0
        L34:
            jz5.g r11 = r8.f162005d     // Catch: java.lang.Exception -> L7c
            jz5.n r11 = (jz5.n) r11     // Catch: java.lang.Exception -> L7c
            java.lang.Object r11 = r11.getValue()     // Catch: java.lang.Exception -> L7c
            wd0.y1 r11 = (wd0.y1) r11     // Catch: java.lang.Exception -> L7c
            jz5.g r1 = r8.f162006e     // Catch: java.lang.Exception -> L7c
            jz5.n r1 = (jz5.n) r1     // Catch: java.lang.Exception -> L7c
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Exception -> L7c
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L7c
            r10.f161997d = r5     // Catch: java.lang.Exception -> L7c
            vd0.l3 r11 = (vd0.l3) r11     // Catch: java.lang.Exception -> L7c
            r11.getClass()     // Catch: java.lang.Exception -> L7c
            kotlinx.coroutines.p0 r5 = kotlinx.coroutines.q1.f310568a     // Catch: java.lang.Exception -> L7c
            vd0.k3 r6 = new vd0.k3     // Catch: java.lang.Exception -> L7c
            r9 = 0
            r6.<init>(r7, r11, r1, r9)     // Catch: java.lang.Exception -> L7c
            java.lang.Object r11 = kotlinx.coroutines.l.g(r5, r6, r10)     // Catch: java.lang.Exception -> L7c
            if (r11 != r0) goto L5e
            return r0
        L5e:
            java.util.List r11 = (java.util.List) r11     // Catch: java.lang.Exception -> L7c
            if (r11 != 0) goto L63
            r11 = r2
        L63:
            long r0 = r8.f162009h     // Catch: java.lang.Exception -> L7c
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L94
            j75.f r0 = r8.Q6()     // Catch: java.lang.Exception -> L7c
            if (r0 == 0) goto L94
            r24.c r1 = new r24.c     // Catch: java.lang.Exception -> L7c
            java.lang.String r5 = com.tencent.mm.plugin.setting.ui.setting_new.uic.n.T6(r8)     // Catch: java.lang.Exception -> L7c
            r1.<init>(r7, r11, r5)     // Catch: java.lang.Exception -> L7c
            r0.B3(r1)     // Catch: java.lang.Exception -> L7c
            goto L94
        L7c:
            long r0 = r8.f162009h
            int r11 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r11 != 0) goto L94
            j75.f r11 = r8.Q6()
            if (r11 == 0) goto L94
            r24.c r0 = new r24.c
            java.lang.String r1 = com.tencent.mm.plugin.setting.ui.setting_new.uic.n.T6(r8)
            r0.<init>(r7, r2, r1)
            r11.B3(r0)
        L94:
            jz5.f0 r11 = jz5.f0.f302826a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.setting.ui.setting_new.uic.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
