package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class qe extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f119521d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.k0 f119522e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.se f119523f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe(com.tencent.mm.plugin.finder.live.view.k0 k0Var, com.tencent.mm.plugin.finder.live.widget.se seVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f119522e = k0Var;
        this.f119523f = seVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.qe(this.f119522e, this.f119523f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.qe) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0047  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r4.f119521d
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            kotlin.ResultKt.throwOnFailure(r5)
            goto L3d
        Ld:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L15:
            kotlin.ResultKt.throwOnFailure(r5)
            com.tencent.mm.plugin.finder.live.view.k0 r5 = r4.f119522e
            java.lang.Class<com.tencent.mm.plugin.finder.live.util.a1> r1 = com.tencent.mm.plugin.finder.live.util.a1.class
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r5 = r5.getController(r1)
            com.tencent.mm.plugin.finder.live.util.a1 r5 = (com.tencent.mm.plugin.finder.live.util.a1) r5
            if (r5 == 0) goto L44
            com.tencent.mm.plugin.finder.live.widget.se r1 = r4.f119523f
            android.view.View r1 = r1.f119753a
            android.content.Context r1 = r1.getContext()
            boolean r3 = r1 instanceof com.tencent.mm.ui.MMActivity
            if (r3 == 0) goto L33
            com.tencent.mm.ui.MMActivity r1 = (com.tencent.mm.ui.MMActivity) r1
            goto L34
        L33:
            r1 = 0
        L34:
            r4.f119521d = r2
            java.lang.Object r5 = r5.c7(r1, r4)
            if (r5 != r0) goto L3d
            return r0
        L3d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            goto L45
        L44:
            r5 = 0
        L45:
            if (r5 == 0) goto L54
            java.lang.Class<s40.w0> r5 = s40.w0.class
            i95.m r5 = i95.n0.c(r5)
            s40.w0 r5 = (s40.w0) r5
            com.tencent.mm.feature.finder.live.v4 r5 = (com.tencent.mm.feature.finder.live.v4) r5
            r5.Ek()
        L54:
            jz5.f0 r5 = jz5.f0.f302826a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.qe.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
