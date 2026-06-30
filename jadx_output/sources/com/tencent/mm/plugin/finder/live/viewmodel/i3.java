package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class i3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f117138d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.m3 f117139e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r2 f117140f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f117141g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(com.tencent.mm.plugin.finder.live.viewmodel.m3 m3Var, kotlinx.coroutines.r2 r2Var, androidx.appcompat.app.AppCompatActivity appCompatActivity, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f117139e = m3Var;
        this.f117140f = r2Var;
        this.f117141g = appCompatActivity;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.viewmodel.i3(this.f117139e, this.f117140f, this.f117141g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.viewmodel.i3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (r1 == null) goto L22;
     */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r5.f117138d
            com.tencent.mm.plugin.finder.live.viewmodel.m3 r2 = r5.f117139e
            r3 = 1
            if (r1 == 0) goto L17
            if (r1 != r3) goto Lf
            kotlin.ResultKt.throwOnFailure(r6)
            goto L23
        Lf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L17:
            kotlin.ResultKt.throwOnFailure(r6)
            r5.f117138d = r3
            java.lang.Object r6 = r2.U6(r5)
            if (r6 != r0) goto L23
            return r0
        L23:
            jz5.l r6 = (jz5.l) r6
            java.lang.Object r0 = r6.f302833d
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L5f
            kotlinx.coroutines.r2 r0 = r5.f117140f
            r1 = 0
            kotlinx.coroutines.p2.a(r0, r1, r3, r1)
            r0 = 0
            r2.f117242f = r0
            r2.X6()
            java.lang.Object r6 = r6.f302834e
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L4e
            int r4 = r6.length()
            if (r4 <= 0) goto L48
            goto L49
        L48:
            r3 = r0
        L49:
            if (r3 == 0) goto L4c
            r1 = r6
        L4c:
            if (r1 != 0) goto L5c
        L4e:
            androidx.appcompat.app.AppCompatActivity r6 = r5.f117141g
            r0 = 2131780989(0x7f10657d, float:1.9193579E38)
            java.lang.String r1 = r6.getString(r0)
            java.lang.String r6 = "getString(...)"
            kotlin.jvm.internal.o.f(r1, r6)
        L5c:
            r2.V6(r1)
        L5f:
            jz5.f0 r6 = jz5.f0.f302826a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.viewmodel.i3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
