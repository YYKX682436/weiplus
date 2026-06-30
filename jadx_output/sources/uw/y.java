package uw;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public volatile kotlinx.coroutines.r2 f431522a;

    /* renamed from: b, reason: collision with root package name */
    public volatile kotlin.Result f431523b;

    /* renamed from: c, reason: collision with root package name */
    public volatile yz5.l f431524c;

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f431525d = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(kotlinx.coroutines.t3.a(null, 1, null)));

    /* renamed from: e, reason: collision with root package name */
    public final uw.s f431526e = new uw.s(this);

    /* JADX WARN: Removed duplicated region for block: B:14:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof uw.t
            if (r0 == 0) goto L13
            r0 = r11
            uw.t r0 = (uw.t) r0
            int r1 = r0.f431511g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f431511g = r1
            goto L18
        L13:
            uw.t r0 = new uw.t
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f431509e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f431511g
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r0 = r0.f431508d
            uw.y r0 = (uw.y) r0
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.lang.Exception -> L2b
            goto L82
        L2b:
            r11 = move-exception
            goto L9d
        L2e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L36:
            kotlin.ResultKt.throwOnFailure(r11)
            kotlin.Result r11 = r10.f431523b
            if (r11 == 0) goto L59
            kotlin.Result r11 = r10.f431523b
            r2 = 0
            if (r11 == 0) goto L4d
            java.lang.Object r11 = r11.getValue()
            boolean r11 = kotlin.Result.m528isSuccessimpl(r11)
            if (r11 != r3) goto L4d
            r2 = r3
        L4d:
            if (r2 == 0) goto L59
            kotlin.Result r11 = r10.f431523b
            kotlin.jvm.internal.o.d(r11)
            java.lang.Object r11 = r11.getValue()
            return r11
        L59:
            kotlinx.coroutines.r2 r11 = r10.f431522a
            r2 = 0
            if (r11 == 0) goto L61
            kotlinx.coroutines.p2.a(r11, r2, r3, r2)
        L61:
            kotlinx.coroutines.y0 r4 = r10.f431525d
            r5 = 0
            r6 = 0
            uw.x r7 = new uw.x
            r7.<init>(r10, r2)
            r8 = 3
            r9 = 0
            kotlinx.coroutines.r2 r11 = kotlinx.coroutines.l.d(r4, r5, r6, r7, r8, r9)
            r10.f431522a = r11
            kotlinx.coroutines.r2 r11 = r10.f431522a     // Catch: java.lang.Exception -> L2b
            if (r11 == 0) goto L81
            r0.f431508d = r10     // Catch: java.lang.Exception -> L2b
            r0.f431511g = r3     // Catch: java.lang.Exception -> L2b
            java.lang.Object r11 = r11.C(r0)     // Catch: java.lang.Exception -> L2b
            if (r11 != r1) goto L81
            return r1
        L81:
            r0 = r10
        L82:
            kotlin.Result r11 = r0.f431523b
            if (r11 == 0) goto L8b
            java.lang.Object r11 = r11.getValue()
            goto L9c
        L8b:
            kotlin.Result$Companion r11 = kotlin.Result.INSTANCE
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "No Location"
            r11.<init>(r0)
            java.lang.Object r11 = kotlin.ResultKt.createFailure(r11)
            java.lang.Object r11 = kotlin.Result.m521constructorimpl(r11)
        L9c:
            return r11
        L9d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "requestLocationJob join failed: "
            r0.<init>(r1)
            java.lang.String r11 = r11.getMessage()
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            java.lang.String r0 = "FlutterBSGetPoiHelper"
            com.tencent.mars.xlog.Log.e(r0, r11)
            kotlin.Result$Companion r11 = kotlin.Result.INSTANCE
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "Location request failed"
            r11.<init>(r0)
            java.lang.Object r11 = kotlin.ResultKt.createFailure(r11)
            java.lang.Object r11 = kotlin.Result.m521constructorimpl(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: uw.y.a(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
