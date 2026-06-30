package xt2;

/* loaded from: classes3.dex */
public final class f2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f456739d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xt2.e3 f456740e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(long j17, xt2.e3 e3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f456739d = j17;
        this.f456740e = e3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xt2.f2(this.f456739d, this.f456740e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xt2.f2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            pz5.a r0 = pz5.a.f359186d
            kotlin.ResultKt.throwOnFailure(r7)
            xt2.e3 r7 = r6.f456740e
            android.view.ViewGroup r0 = r7.f456709n
            r1 = 0
            long r2 = r6.f456739d
            if (r0 == 0) goto L23
            java.lang.Object r0 = r0.getTag()
            boolean r4 = r0 instanceof java.lang.Long
            if (r4 != 0) goto L17
            goto L23
        L17:
            java.lang.Number r0 = (java.lang.Number) r0
            long r4 = r0.longValue()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L23
            r0 = 1
            goto L24
        L23:
            r0 = r1
        L24:
            jz5.f0 r4 = jz5.f0.f302826a
            if (r0 == 0) goto L41
            java.lang.String r7 = r7.f456706h
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "bubbleAttachToParent id:"
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = " view have attach!"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r7, r0)
            return r4
        L41:
            android.view.ViewGroup r0 = r7.f456702d
            r5 = 2131320251(0x7f095dbb, float:1.8259091E38)
            android.view.View r0 = r0.findViewById(r5)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r7.f456709n = r0
            android.view.ViewGroup r0 = r7.f456709n
            if (r0 == 0) goto L5c
            int r0 = r0.indexOfChild(r7)
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r0)
            goto L5d
        L5c:
            r5 = 0
        L5d:
            if (r5 != 0) goto L60
            goto L74
        L60:
            int r0 = r5.intValue()
            r5 = -1
            if (r0 != r5) goto L74
            zl2.r4 r0 = zl2.r4.f473950a
            r0.Q2(r7)
            android.view.ViewGroup r0 = r7.f456709n
            if (r0 == 0) goto L7b
            r0.addView(r7)
            goto L7b
        L74:
            java.lang.String r0 = r7.f456706h
            java.lang.String r5 = "bubbleAttachToParent, have contain child!"
            com.tencent.mars.xlog.Log.i(r0, r5)
        L7b:
            android.view.ViewGroup r0 = r7.f456709n
            if (r0 != 0) goto L80
            goto L83
        L80:
            r0.setVisibility(r1)
        L83:
            android.view.ViewGroup r0 = r7.f456709n
            if (r0 != 0) goto L88
            goto L90
        L88:
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r2)
            r0.setTag(r1)
        L90:
            r45.y23 r0 = r7.getProductData()
            if (r0 == 0) goto L9b
            r1 = 31
            r7.g(r1, r0)
        L9b:
            dk2.f r7 = r7.M
            r7.a(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: xt2.f2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
