package qj5;

/* loaded from: classes8.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f363976d;

    /* renamed from: e, reason: collision with root package name */
    public int f363977e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f363978f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qj5.n f363979g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f363980h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(qj5.n nVar, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f363979g = nVar;
        this.f363980h = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        qj5.k kVar = new qj5.k(this.f363979g, this.f363980h, continuation);
        kVar.f363978f = obj;
        return kVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qj5.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0083, code lost:
    
        if (r10 == null) goto L31;
     */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r9.f363977e
            r2 = 1
            qj5.n r3 = r9.f363979g
            r4 = 0
            if (r1 == 0) goto L20
            if (r1 != r2) goto L18
            java.lang.Object r0 = r9.f363976d
            qj5.n r0 = (qj5.n) r0
            java.lang.Object r1 = r9.f363978f
            kotlinx.coroutines.y0 r1 = (kotlinx.coroutines.y0) r1
            kotlin.ResultKt.throwOnFailure(r10)
            goto L3c
        L18:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L20:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.Object r10 = r9.f363978f
            kotlinx.coroutines.y0 r10 = (kotlinx.coroutines.y0) r10
            qj5.j r1 = new qj5.j
            r1.<init>(r3, r4)
            r9.f363978f = r10
            r9.f363976d = r3
            r9.f363977e = r2
            r5 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r10 = kotlinx.coroutines.a4.c(r5, r1, r9)
            if (r10 != r0) goto L3b
            return r0
        L3b:
            r0 = r3
        L3c:
            java.lang.String r10 = (java.lang.String) r10
            r0.G2 = r10
            java.lang.String r10 = r3.G2
            jz5.f0 r0 = jz5.f0.f302826a
            java.lang.String r1 = "MicroMsg.MMImageBottomSheet"
            java.lang.String r2 = "mContext"
            if (r10 == 0) goto L91
            java.lang.String r5 = "setGenImg, genImg got"
            com.tencent.mars.xlog.Log.i(r1, r5)
            r3.y(r10)
            com.tencent.mm.ui.widget.button.WeButton r10 = r3.D2
            if (r10 == 0) goto L8a
            android.content.Context r5 = r3.f363989w2
            if (r5 == 0) goto L86
            r6 = 2131774063(0x7f104a6f, float:1.9179531E38)
            java.lang.String r5 = r5.getString(r6)
            r10.setText(r5)
            r10 = 0
            r3.f363987u2 = r10
            com.tencent.mm.ui.widget.dialog.u3 r10 = r3.H2
            if (r10 == 0) goto L6e
            r10.dismiss()
        L6e:
            qj5.b r10 = qj5.n.I2
            qj5.b r10 = qj5.n.I2
            if (r10 == 0) goto L82
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = r9.f363980h
            long r5 = r5 - r7
            com.tencent.mm.ui.feature.api.screenshot.h0 r10 = (com.tencent.mm.ui.feature.api.screenshot.h0) r10
            r10.a(r5)
            r10 = r0
            goto L83
        L82:
            r10 = r4
        L83:
            if (r10 != 0) goto Lbc
            goto L91
        L86:
            kotlin.jvm.internal.o.o(r2)
            throw r4
        L8a:
            java.lang.String r10 = "switchBtn"
            kotlin.jvm.internal.o.o(r10)
            throw r4
        L91:
            java.lang.String r10 = "setGenImg, genImg failed"
            com.tencent.mars.xlog.Log.w(r1, r10)
            com.tencent.mm.ui.widget.dialog.u3 r10 = r3.H2
            if (r10 == 0) goto L9d
            r10.dismiss()
        L9d:
            android.content.Context r10 = r3.f363989w2
            if (r10 == 0) goto Lc1
            int r1 = com.tencent.mm.ui.widget.dialog.f4.f211790n
            com.tencent.mm.ui.widget.dialog.e4 r1 = new com.tencent.mm.ui.widget.dialog.e4
            r1.<init>(r10)
            if (r10 == 0) goto Lbd
            r2 = 2131769249(0x7f1037a1, float:1.9169767E38)
            java.lang.String r10 = r10.getString(r2)
            r1.f211776c = r10
            r10 = 2131690910(0x7f0f059e, float:1.9010877E38)
            r1.b(r10)
            r1.c()
        Lbc:
            return r0
        Lbd:
            kotlin.jvm.internal.o.o(r2)
            throw r4
        Lc1:
            kotlin.jvm.internal.o.o(r2)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: qj5.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
