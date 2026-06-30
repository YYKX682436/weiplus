package hf2;

/* loaded from: classes10.dex */
public final class t0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f281167d;

    /* renamed from: e, reason: collision with root package name */
    public int f281168e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hf2.y0 f281169f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(hf2.y0 y0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f281169f = y0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hf2.t0(this.f281169f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hf2.t0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r10.f281168e
            java.lang.String r2 = "maas_confirm"
            java.lang.String r3 = ""
            r4 = 3
            r5 = 2
            r6 = 1
            hf2.y0 r7 = r10.f281169f
            if (r1 == 0) goto L32
            if (r1 == r6) goto L2a
            if (r1 == r5) goto L22
            if (r1 != r4) goto L1a
            kotlin.ResultKt.throwOnFailure(r11)
            goto Lbc
        L1a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L22:
            java.lang.Object r1 = r10.f281167d
            java.lang.String r1 = (java.lang.String) r1
            kotlin.ResultKt.throwOnFailure(r11)
            goto L61
        L2a:
            java.lang.Object r1 = r10.f281167d
            java.lang.String r1 = (java.lang.String) r1
            kotlin.ResultKt.throwOnFailure(r11)
            goto L52
        L32:
            kotlin.ResultKt.throwOnFailure(r11)
            android.widget.EditText r11 = r7.f281205f
            if (r11 == 0) goto L45
            android.text.Editable r11 = r11.getText()
            if (r11 == 0) goto L45
            java.lang.String r11 = r11.toString()
            if (r11 != 0) goto L46
        L45:
            r11 = r3
        L46:
            r10.f281167d = r11
            r10.f281168e = r6
            java.lang.Object r1 = r7.d(r2, r10)
            if (r1 != r0) goto L51
            return r0
        L51:
            r1 = r11
        L52:
            hf2.x r11 = r7.f281200a
            r45.h84 r11 = r11.f281186r
            r10.f281167d = r1
            r10.f281168e = r5
            java.lang.Object r11 = r7.a(r11, r1, r10)
            if (r11 != r0) goto L61
            return r0
        L61:
            android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
            r5 = 0
            if (r11 == 0) goto L98
            hf2.x r8 = r7.f281200a
            r8.getClass()
            java.lang.String r9 = "text"
            kotlin.jvm.internal.o.g(r1, r9)
            java.lang.String r9 = "replaceRestoreDataText_"
            java.lang.String r9 = r9.concat(r1)
            r8.a7(r9, r3)
            r45.ei0 r3 = r8.f281185q
            if (r3 == 0) goto L89
            java.util.LinkedList r3 = r3.f373529d
            if (r3 == 0) goto L89
            java.lang.Object r3 = kz5.n0.Z(r3)
            r45.ji0 r3 = (r45.ji0) r3
            goto L8a
        L89:
            r3 = r5
        L8a:
            if (r3 != 0) goto L8d
            goto L8f
        L8d:
            r3.f377829n = r1
        L8f:
            hf2.x r3 = r7.f281200a
            hf2.h0 r3 = r3.f7()
            r3.c(r2, r11)
        L98:
            hf2.x r11 = r7.f281200a
            hf2.l2 r11 = r11.l7()
            int r1 = r1.length()
            if (r1 <= 0) goto La5
            goto La6
        La5:
            r6 = 0
        La6:
            java.lang.String r1 = "MaasInputConfirm"
            r11.b(r1, r6)
            hf2.x r11 = r7.f281200a
            hf2.b2 r11 = r11.h7()
            r10.f281167d = r5
            r10.f281168e = r4
            java.lang.Object r11 = r11.g(r1, r10)
            if (r11 != r0) goto Lbc
            return r0
        Lbc:
            jz5.f0 r11 = jz5.f0.f302826a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: hf2.t0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
