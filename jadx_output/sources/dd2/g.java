package dd2;

/* loaded from: classes2.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public yz5.p f228965a;

    /* JADX WARN: Removed duplicated region for block: B:23:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof dd2.f
            if (r0 == 0) goto L13
            r0 = r8
            dd2.f r0 = (dd2.f) r0
            int r1 = r0.f228964g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f228964g = r1
            goto L18
        L13:
            dd2.f r0 = new dd2.f
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f228962e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f228964g
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            kotlin.ResultKt.throwOnFailure(r8)
            goto L80
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            java.lang.Object r2 = r0.f228961d
            dd2.g r2 = (dd2.g) r2
            kotlin.ResultKt.throwOnFailure(r8)
            goto L6d
        L3b:
            kotlin.ResultKt.throwOnFailure(r8)
            r0.f228961d = r7
            r0.f228964g = r5
            r8 = r7
            dd2.d r8 = (dd2.d) r8
            com.tencent.mm.modelbase.i r2 = r8.f228955b
            if (r2 == 0) goto L68
            oz5.n r5 = new oz5.n
            kotlin.coroutines.Continuation r6 = pz5.f.b(r0)
            r5.<init>(r6)
            pq5.g r2 = r2.l()
            dd2.a r6 = new dd2.a
            r6.<init>(r8, r5)
            dd2.c r8 = new dd2.c
            r8.<init>(r6)
            r2.H(r8)
            java.lang.Object r8 = r5.a()
            goto L69
        L68:
            r8 = r3
        L69:
            if (r8 != r1) goto L6c
            return r1
        L6c:
            r2 = r7
        L6d:
            com.tencent.mm.plugin.finder.feed.model.internal.IResponse r8 = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) r8
            if (r8 == 0) goto L80
            yz5.p r2 = r2.f228965a
            if (r2 == 0) goto L80
            r0.f228961d = r3
            r0.f228964g = r4
            java.lang.Object r8 = r2.invoke(r8, r0)
            if (r8 != r1) goto L80
            return r1
        L80:
            jz5.f0 r8 = jz5.f0.f302826a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: dd2.g.a(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
