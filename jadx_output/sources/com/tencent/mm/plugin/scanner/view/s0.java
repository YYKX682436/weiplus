package com.tencent.mm.plugin.scanner.view;

/* loaded from: classes14.dex */
public final class s0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.view.t0 f159978d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f159979e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.tencent.mm.plugin.scanner.view.t0 t0Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f159978d = t0Var;
        this.f159979e = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.scanner.view.s0(this.f159978d, this.f159979e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.scanner.view.s0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (kotlin.jvm.internal.o.a(r0 != null ? java.lang.Float.valueOf(r0.getAlpha()) : null, 0.0f) != false) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            pz5.a r0 = pz5.a.f359186d
            kotlin.ResultKt.throwOnFailure(r12)
            com.tencent.mm.plugin.scanner.view.t0 r12 = r11.f159978d
            android.widget.TextView r0 = r12.f159991u
            java.lang.String r1 = r11.f159979e
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L1d
            java.lang.CharSequence r0 = r0.getText()
            if (r0 == 0) goto L1d
            boolean r0 = r0.equals(r1)
            if (r0 != r2) goto L1d
            r0 = r2
            goto L1e
        L1d:
            r0 = r3
        L1e:
            jz5.f0 r4 = jz5.f0.f302826a
            if (r0 == 0) goto L23
            return r4
        L23:
            android.widget.TextView r0 = r12.f159991u
            com.tencent.mm.plugin.scanner.view.t r5 = r12.f159984l1
            float r6 = r12.getAlpha()
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 != 0) goto L32
            r6 = r2
            goto L33
        L32:
            r6 = r3
        L33:
            r8 = 0
            if (r6 == 0) goto L4a
            if (r0 == 0) goto L41
            float r6 = r0.getAlpha()
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            goto L42
        L41:
            r6 = r8
        L42:
            boolean r6 = kotlin.jvm.internal.o.a(r6, r7)
            if (r6 == 0) goto L4a
            goto Lbd
        L4a:
            r6 = 2
            float[] r6 = new float[r6]
            if (r0 == 0) goto L54
            float r9 = r0.getAlpha()
            goto L55
        L54:
            r9 = r7
        L55:
            r6[r3] = r9
            r6[r2] = r7
            java.lang.String r7 = "alpha"
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r0, r7, r6)
            r9 = 500(0x1f4, double:2.47E-321)
            r6.setDuration(r9)
            android.animation.AnimatorSet r7 = new android.animation.AnimatorSet
            r7.<init>()
            android.animation.Animator[] r9 = new android.animation.Animator[r2]
            r9[r3] = r6
            r7.playTogether(r9)
            com.tencent.mm.plugin.scanner.view.x r3 = new com.tencent.mm.plugin.scanner.view.x
            r3.<init>(r0, r12, r5)
            r3.f160005d = r1
            r7.addListener(r3)
            boolean r1 = r5.f159980a
            if (r1 == 0) goto La9
            java.util.Map r0 = r12.f159988r
            if (r0 == 0) goto L8b
            java.lang.String r1 = "personal_passport"
            java.lang.Object r0 = r0.get(r1)
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
        L8b:
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r8)
            if (r0 != 0) goto L92
            goto L9d
        L92:
            android.content.Context r12 = r12.getContext()
            r0 = 2131780332(0x7f1062ec, float:1.9192246E38)
            java.lang.String r8 = r12.getString(r0)
        L9d:
            java.lang.String r12 = r3.f160005d
            boolean r12 = kotlin.jvm.internal.o.b(r8, r12)
            if (r12 == 0) goto La6
            goto Lbd
        La6:
            r5.f159981b = r7
            goto Lbd
        La9:
            if (r0 == 0) goto Laf
            java.lang.CharSequence r8 = r0.getText()
        Laf:
            java.lang.String r12 = r3.f160005d
            boolean r12 = kotlin.jvm.internal.o.b(r8, r12)
            if (r12 == 0) goto Lb8
            goto Lbd
        Lb8:
            r5.f159980a = r2
            r7.start()
        Lbd:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.scanner.view.s0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
