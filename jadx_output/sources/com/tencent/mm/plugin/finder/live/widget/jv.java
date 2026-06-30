package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class jv extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f118779d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f118780e;

    /* renamed from: f, reason: collision with root package name */
    public int f118781f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.h84 f118782g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.pv f118783h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv(r45.h84 h84Var, com.tencent.mm.plugin.finder.live.widget.pv pvVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f118782g = h84Var;
        this.f118783h = pvVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.jv(this.f118782g, this.f118783h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.jv) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r9.f118781f
            java.lang.String r2 = "getService(...)"
            java.lang.Class<zy.u> r3 = zy.u.class
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L2a
            if (r1 == r5) goto L1e
            if (r1 != r4) goto L16
            kotlin.ResultKt.throwOnFailure(r10)
            goto Lb6
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1e:
            java.lang.Object r1 = r9.f118780e
            r45.g84 r1 = (r45.g84) r1
            java.lang.Object r7 = r9.f118779d
            com.tencent.mm.plugin.finder.live.widget.pv r7 = (com.tencent.mm.plugin.finder.live.widget.pv) r7
            kotlin.ResultKt.throwOnFailure(r10)
            goto L6a
        L2a:
            kotlin.ResultKt.throwOnFailure(r10)
            r45.h84 r10 = com.tencent.mm.plugin.finder.live.widget.sv.f119839i
            r10 = 4
            r45.h84 r1 = r9.f118782g
            java.util.LinkedList r10 = r1.getList(r10)
            if (r10 == 0) goto L40
            java.lang.Object r10 = kz5.n0.Z(r10)
            r45.g84 r10 = (r45.g84) r10
            r1 = r10
            goto L41
        L40:
            r1 = r6
        L41:
            if (r1 == 0) goto Lb6
            i95.m r10 = i95.n0.c(r3)
            kotlin.jvm.internal.o.f(r10, r2)
            zy.u r10 = (zy.u) r10
            zy.w r10 = zy.u.p3(r10, r6, r5, r6)
            java.lang.String r7 = r1.getString(r5)
            com.tencent.mm.plugin.finder.live.widget.pv r8 = r9.f118783h
            r9.f118779d = r8
            r9.f118780e = r1
            r9.f118781f = r5
            bz.a r10 = (bz.a) r10
            bz.w r10 = r10.b()
            java.lang.Object r10 = r10.f(r7, r9)
            if (r10 != r0) goto L69
            return r0
        L69:
            r7 = r8
        L6a:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            r8 = 0
            if (r10 == 0) goto L88
            java.lang.String r10 = r1.getString(r5)
            java.lang.String r1 = r1.getString(r4)
            r9.f118779d = r6
            r9.f118780e = r6
            r9.f118781f = r4
            java.lang.Object r10 = r7.i(r10, r8, r1, r9)
            if (r10 != r0) goto Lb6
            return r0
        L88:
            i95.m r10 = i95.n0.c(r3)
            kotlin.jvm.internal.o.f(r10, r2)
            zy.u r10 = (zy.u) r10
            zy.w r10 = zy.u.p3(r10, r6, r5, r6)
            java.lang.String r0 = r1.getString(r5)
            boolean r10 = zy.w.Ie(r10, r0, r6, r4, r6)
            r0 = 8
            if (r10 == 0) goto Lac
            android.widget.ImageView r10 = r7.f119445d
            r10.setVisibility(r0)
            com.tencent.mm.ui.widget.progress.RoundProgressBtn r10 = r7.f119446e
            r10.setVisibility(r0)
            goto Lb6
        Lac:
            android.widget.ImageView r10 = r7.f119445d
            r10.setVisibility(r8)
            com.tencent.mm.ui.widget.progress.RoundProgressBtn r10 = r7.f119446e
            r10.setVisibility(r0)
        Lb6:
            jz5.f0 r10 = jz5.f0.f302826a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.jv.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
