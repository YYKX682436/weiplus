package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class a3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f116892d;

    /* renamed from: e, reason: collision with root package name */
    public int f116893e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.m3 f116894f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f116895g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(com.tencent.mm.plugin.finder.live.viewmodel.m3 m3Var, androidx.appcompat.app.AppCompatActivity appCompatActivity, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f116894f = m3Var;
        this.f116895g = appCompatActivity;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.viewmodel.a3(this.f116894f, this.f116895g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.viewmodel.a3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        if (r2 == null) goto L22;
     */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r7.f116893e
            r2 = 0
            r3 = 0
            androidx.appcompat.app.AppCompatActivity r4 = r7.f116895g
            com.tencent.mm.plugin.finder.live.viewmodel.m3 r5 = r7.f116894f
            r6 = 1
            if (r1 == 0) goto L1f
            if (r1 != r6) goto L17
            java.lang.Object r0 = r7.f116892d
            com.tencent.mm.ui.widget.dialog.u3 r0 = (com.tencent.mm.ui.widget.dialog.u3) r0
            kotlin.ResultKt.throwOnFailure(r8)
            goto L3e
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            kotlin.ResultKt.throwOnFailure(r8)
            android.app.Activity r8 = r5.getContext()
            r1 = 2131770609(0x7f103cf1, float:1.9172526E38)
            java.lang.String r1 = r4.getString(r1)
            com.tencent.mm.ui.widget.dialog.u3 r8 = com.tencent.mm.ui.widget.dialog.u3.f(r8, r1, r6, r3, r2)
            r7.f116892d = r8
            r7.f116893e = r6
            java.lang.Object r1 = r5.T6(r7)
            if (r1 != r0) goto L3c
            return r0
        L3c:
            r0 = r8
            r8 = r1
        L3e:
            jz5.l r8 = (jz5.l) r8
            java.lang.Object r1 = r8.f302833d
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L6b
            java.lang.Object r8 = r8.f302834e
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L5c
            int r1 = r8.length()
            if (r1 <= 0) goto L57
            r3 = r6
        L57:
            if (r3 == 0) goto L5a
            r2 = r8
        L5a:
            if (r2 != 0) goto L68
        L5c:
            r8 = 2131780989(0x7f10657d, float:1.9193579E38)
            java.lang.String r2 = r4.getString(r8)
            java.lang.String r8 = "getString(...)"
            kotlin.jvm.internal.o.f(r2, r8)
        L68:
            r5.V6(r2)
        L6b:
            r0.dismiss()
            jz5.f0 r8 = jz5.f0.f302826a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.viewmodel.a3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
