package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes15.dex */
public final class rg implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.k f135796d;

    public rg(kotlinx.coroutines.flow.k kVar) {
        this.f135796d = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // kotlinx.coroutines.flow.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.tencent.mm.plugin.finder.viewmodel.component.qg
            if (r0 == 0) goto L13
            r0 = r6
            com.tencent.mm.plugin.finder.viewmodel.component.qg r0 = (com.tencent.mm.plugin.finder.viewmodel.component.qg) r0
            int r1 = r0.f135705e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f135705e = r1
            goto L18
        L13:
            com.tencent.mm.plugin.finder.viewmodel.component.qg r0 = new com.tencent.mm.plugin.finder.viewmodel.component.qg
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f135704d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f135705e
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.throwOnFailure(r6)
            goto L49
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.ResultKt.throwOnFailure(r6)
            r6 = r5
            ec2.f r6 = (ec2.f) r6
            int r6 = r6.f250959d
            if (r6 != r3) goto L3b
            r6 = r3
            goto L3c
        L3b:
            r6 = 0
        L3c:
            if (r6 == 0) goto L49
            r0.f135705e = r3
            kotlinx.coroutines.flow.k r6 = r4.f135796d
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            jz5.f0 r5 = jz5.f0.f302826a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.rg.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
