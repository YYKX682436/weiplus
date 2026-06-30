package v14;

/* loaded from: classes.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f432547d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v14.p f432548e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f432549f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(v14.p pVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f432548e = pVar;
        this.f432549f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new v14.i(this.f432548e, this.f432549f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((v14.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r5.f432547d
            r2 = 1
            v14.p r3 = r5.f432548e
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.ResultKt.throwOnFailure(r6)
            goto L2d
        Lf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L17:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.String r6 = r3.f432578e
            if (r6 != 0) goto L2f
            kv.b0 r6 = r3.f432577d
            r5.f432547d = r2
            hn1.s r6 = (hn1.s) r6
            java.lang.String r1 = r5.f432549f
            java.lang.Object r6 = r6.hj(r1, r5)
            if (r6 != r0) goto L2d
            return r0
        L2d:
            java.lang.String r6 = (java.lang.String) r6
        L2f:
            jz5.f0 r0 = jz5.f0.f302826a
            if (r6 != 0) goto L4b
            androidx.appcompat.app.AppCompatActivity r6 = r3.getActivity()
            int r1 = com.tencent.mm.ui.widget.dialog.f4.f211790n
            com.tencent.mm.ui.widget.dialog.e4 r1 = new com.tencent.mm.ui.widget.dialog.e4
            r1.<init>(r6)
            r6 = 2131774682(0x7f104cda, float:1.9180787E38)
            r1.d(r6)
            r6 = 0
            r1.f211779f = r6
            r1.c()
            return r0
        L4b:
            java.lang.Class<zb0.b0> r1 = zb0.b0.class
            i95.m r1 = i95.n0.c(r1)
            zb0.b0 r1 = (zb0.b0) r1
            androidx.appcompat.app.AppCompatActivity r2 = r3.getActivity()
            v14.h r4 = new v14.h
            r4.<init>(r3, r6)
            yb0.g r1 = (yb0.g) r1
            r1.wi(r2, r6, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v14.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
