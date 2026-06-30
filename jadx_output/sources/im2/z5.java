package im2;

/* loaded from: classes3.dex */
public final class z5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f292674d;

    /* renamed from: e, reason: collision with root package name */
    public int f292675e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.f1 f292676f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.f1 f292677g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ im2.h6 f292678h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(kotlinx.coroutines.f1 f1Var, kotlinx.coroutines.f1 f1Var2, im2.h6 h6Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f292676f = f1Var;
        this.f292677g = f1Var2;
        this.f292678h = h6Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new im2.z5(this.f292676f, this.f292677g, this.f292678h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((im2.z5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0046 A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r4.f292675e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            java.lang.Object r0 = r4.f292674d
            r45.l71 r0 = (r45.l71) r0
            kotlin.ResultKt.throwOnFailure(r5)
            goto L3e
        L14:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1c:
            kotlin.ResultKt.throwOnFailure(r5)
            goto L2e
        L20:
            kotlin.ResultKt.throwOnFailure(r5)
            r4.f292675e = r3
            kotlinx.coroutines.f1 r5 = r4.f292676f
            java.lang.Object r5 = r5.k(r4)
            if (r5 != r0) goto L2e
            return r0
        L2e:
            r45.l71 r5 = (r45.l71) r5
            r4.f292674d = r5
            r4.f292675e = r2
            kotlinx.coroutines.f1 r1 = r4.f292677g
            java.lang.Object r1 = r1.k(r4)
            if (r1 != r0) goto L3d
            return r0
        L3d:
            r0 = r5
        L3e:
            im2.h6 r5 = r4.f292678h
            boolean r1 = r5.P
            jz5.f0 r2 = jz5.f0.f302826a
            if (r1 == 0) goto L47
            return r2
        L47:
            com.tencent.mm.plugin.finder.live.widget.b4 r1 = r5.C
            boolean r1 = r1.f117828i
            if (r1 == 0) goto L55
            java.lang.String r5 = "FinderLiveVisitorAfterPagePlugin"
            java.lang.String r0 = "next live v2 shown, hide replay"
            com.tencent.mars.xlog.Log.i(r5, r0)
            return r2
        L55:
            com.tencent.mm.plugin.finder.live.widget.q4 r5 = r5.D
            r5.e(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: im2.z5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
