package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes5.dex */
public final class av extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f117797d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.dv f117798e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av(com.tencent.mm.plugin.finder.live.widget.dv dvVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f117798e = dvVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.av(this.f117798e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.av) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r5.f117797d
            java.lang.String r2 = "FinderLiveRequestSongRvWidget"
            r3 = 1
            com.tencent.mm.plugin.finder.live.widget.dv r4 = r5.f117798e
            if (r1 == 0) goto L19
            if (r1 != r3) goto L11
            kotlin.ResultKt.throwOnFailure(r6)
            goto L32
        L11:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L19:
            kotlin.ResultKt.throwOnFailure(r6)
            r4.f118156i = r3
            java.lang.String r6 = "loading more"
            com.tencent.mars.xlog.Log.i(r2, r6)
            yz5.p r6 = r4.f118162o
            if (r6 == 0) goto L46
            com.tencent.mm.protobuf.g r1 = r4.f118157j
            r5.f117797d = r3
            java.lang.Object r6 = r6.invoke(r1, r5)
            if (r6 != r0) goto L32
            return r0
        L32:
            jz5.l r6 = (jz5.l) r6
            if (r6 == 0) goto L46
            java.lang.Object r0 = r6.f302833d
            com.tencent.mm.protobuf.g r0 = (com.tencent.mm.protobuf.g) r0
            r4.f118157j = r0
            java.lang.Object r6 = r6.f302834e
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r4.f118158k = r6
        L46:
            int r6 = r4.f118158k
            if (r6 != 0) goto L54
            java.lang.String r6 = "all data loaded"
            com.tencent.mars.xlog.Log.i(r2, r6)
            yz5.a r6 = r4.f118163p
            r6.invoke()
        L54:
            r6 = 0
            r4.f118156i = r6
            jz5.f0 r6 = jz5.f0.f302826a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.av.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
