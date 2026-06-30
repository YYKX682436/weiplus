package zh5;

/* loaded from: classes12.dex */
public final class k {
    public final void a(java.lang.String mediaId) {
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope;
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlinx.coroutines.flow.n2 Ai = ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Ai(mediaId);
        gm0.b bVar = gm0.j1.b().f273245h;
        if (bVar == null || (lifecycleScope = bVar.f273145e) == null) {
            return;
        }
        v65.i.b(lifecycleScope, null, new zh5.h(Ai, mediaId, null), 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(zh5.l r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof zh5.i
            if (r0 == 0) goto L13
            r0 = r6
            zh5.i r0 = (zh5.i) r0
            int r1 = r0.f473031f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f473031f = r1
            goto L18
        L13:
            zh5.i r0 = new zh5.i
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f473029d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f473031f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.throwOnFailure(r6)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.ResultKt.throwOnFailure(r6)
            zh5.j r6 = new zh5.j
            r2 = 0
            r6.<init>(r5, r2)
            r0.f473031f = r3
            java.lang.Object r6 = r6.invoke(r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            zh5.f r6 = (zh5.f) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zh5.k.b(zh5.l, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
