package gk0;

/* loaded from: classes9.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f272413a;

    public b(java.util.List ppcList) {
        kotlin.jvm.internal.o.g(ppcList, "ppcList");
        this.f272413a = ppcList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(g75.z r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof gk0.a
            if (r0 == 0) goto L13
            r0 = r12
            gk0.a r0 = (gk0.a) r0
            int r1 = r0.f272412f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f272412f = r1
            goto L18
        L13:
            gk0.a r0 = new gk0.a
            r0.<init>(r10, r12)
        L18:
            r7 = r0
            java.lang.Object r12 = r7.f272410d
            pz5.a r0 = pz5.a.f359186d
            int r1 = r7.f272412f
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            kotlin.ResultKt.throwOnFailure(r12)
            goto L5c
        L28:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L30:
            kotlin.ResultKt.throwOnFailure(r12)
            g75.k r1 = g75.r.f269391p
            java.util.List r12 = r10.f272413a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "CommonBitmapLoader@"
            r3.<init>(r4)
            long r4 = java.lang.System.currentTimeMillis()
            r6 = 4
            long r8 = (long) r6
            long r4 = r4 % r8
            r3.append(r4)
            java.lang.String r4 = r3.toString()
            r5 = 0
            r8 = 8
            r9 = 0
            r7.f272412f = r2
            r2 = r12
            r3 = r11
            java.lang.Object r12 = g75.k.b(r1, r2, r3, r4, r5, r7, r8, r9)
            if (r12 != r0) goto L5c
            return r0
        L5c:
            g75.x r12 = (g75.x) r12
            g75.z r11 = r12.f269405b
            java.lang.String r12 = "Common_Bitmap"
            java.lang.Object r11 = r11.d(r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: gk0.b.a(g75.z, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
