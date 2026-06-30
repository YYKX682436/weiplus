package sh2;

/* loaded from: classes3.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f408011d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sh2.c f408012e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sh2.h f408013f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(sh2.c cVar, sh2.h hVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f408012e = cVar;
        this.f408013f = hVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sh2.b(this.f408012e, this.f408013f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((sh2.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0041  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r6.f408011d
            sh2.c r2 = r6.f408012e
            r3 = 1
            if (r1 == 0) goto L17
            if (r1 != r3) goto Lf
            kotlin.ResultKt.throwOnFailure(r7)
            goto L39
        Lf:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L17:
            kotlin.ResultKt.throwOnFailure(r7)
            dk2.ef r7 = dk2.ef.f233372a
            com.tencent.mm.plugin.finder.live.view.k0 r1 = dk2.ef.f233380e
            dk2.xf r7 = r7.j(r1)
            if (r7 == 0) goto L3c
            boolean r1 = r2.f408015e
            if (r1 == 0) goto L2a
            r1 = r3
            goto L2b
        L2a:
            r1 = 2
        L2b:
            r6.f408011d = r3
            dk2.r4 r7 = (dk2.r4) r7
            r4 = 3
            int r5 = r2.f408016f
            java.lang.Object r7 = r7.G(r4, r1, r5, r6)
            if (r7 != r0) goto L39
            return r0
        L39:
            r45.od1 r7 = (r45.od1) r7
            goto L3d
        L3c:
            r7 = 0
        L3d:
            sh2.h r0 = r6.f408013f
            if (r7 == 0) goto L50
            fp0.u r7 = fp0.u.f265290f
            sh2.i r0 = (sh2.i) r0
            r0.getClass()
            sh2.j r0 = r0.f408025a
            r0.b(r7)
            sh2.d r7 = r2.f408008a
            goto L84
        L50:
            fp0.u r7 = fp0.u.f265291g
            sh2.i r0 = (sh2.i) r0
            r0.getClass()
            sh2.j r0 = r0.f408025a
            r0.b(r7)
            sh2.d r7 = r2.f408008a
            if (r7 == 0) goto L84
            df2.vm r7 = (df2.vm) r7
            df2.cn r7 = r7.f231617a
            java.lang.String r0 = r7.f229892p
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "like action failed: "
            r1.<init>(r4)
            boolean r2 = r2.f408015e
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.mars.xlog.Log.i(r0, r1)
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData r7 = r7.f229897u
            r0 = r2 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.postValue(r0)
        L84:
            jz5.f0 r7 = jz5.f0.f302826a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: sh2.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
