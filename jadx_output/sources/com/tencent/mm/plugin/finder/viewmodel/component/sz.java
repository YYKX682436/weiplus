package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes14.dex */
public final class sz implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.k f135946d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f135947e;

    public sz(kotlinx.coroutines.flow.k kVar, yz5.p pVar) {
        this.f135946d = kVar;
        this.f135947e = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // kotlinx.coroutines.flow.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.tencent.mm.plugin.finder.viewmodel.component.rz
            if (r0 == 0) goto L13
            r0 = r8
            com.tencent.mm.plugin.finder.viewmodel.component.rz r0 = (com.tencent.mm.plugin.finder.viewmodel.component.rz) r0
            int r1 = r0.f135842e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f135842e = r1
            goto L18
        L13:
            com.tencent.mm.plugin.finder.viewmodel.component.rz r0 = new com.tencent.mm.plugin.finder.viewmodel.component.rz
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f135841d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f135842e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L5b
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.Object r7 = r0.f135843f
            kotlinx.coroutines.flow.k r7 = (kotlinx.coroutines.flow.k) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L4f
        L3a:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlinx.coroutines.flow.k r8 = r6.f135946d
            r0.f135843f = r8
            r0.f135842e = r4
            yz5.p r2 = r6.f135947e
            java.lang.Object r7 = r2.invoke(r7, r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            r5 = r8
            r8 = r7
            r7 = r5
        L4f:
            r2 = 0
            r0.f135843f = r2
            r0.f135842e = r3
            java.lang.Object r7 = r7.emit(r8, r0)
            if (r7 != r1) goto L5b
            return r1
        L5b:
            jz5.f0 r7 = jz5.f0.f302826a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.sz.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
