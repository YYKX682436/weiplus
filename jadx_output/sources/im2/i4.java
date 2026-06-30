package im2;

/* loaded from: classes2.dex */
public final class i4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f292387d;

    /* renamed from: e, reason: collision with root package name */
    public int f292388e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ im2.p4 f292389f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(im2.p4 p4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f292389f = p4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new im2.i4(this.f292389f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((im2.i4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x005f  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r13.f292388e
            r2 = 1
            im2.p4 r3 = r13.f292389f
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r0 = r13.f292387d
            com.tencent.mm.plugin.finder.assist.d9 r0 = (com.tencent.mm.plugin.finder.assist.d9) r0
            kotlin.ResultKt.throwOnFailure(r14)
            goto L53
        L13:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1b:
            kotlin.ResultKt.throwOnFailure(r14)
            com.tencent.mm.plugin.finder.assist.a9 r4 = com.tencent.mm.plugin.finder.assist.d9.f102093f
            androidx.appcompat.app.AppCompatActivity r5 = r3.getActivity()
            androidx.appcompat.app.AppCompatActivity r14 = r3.getActivity()
            android.content.res.Resources r14 = r14.getResources()
            r1 = 2131768164(0x7f103364, float:1.9167567E38)
            java.lang.String r6 = r14.getString(r1)
            r7 = 500(0x1f4, double:2.47E-321)
            r9 = 0
            r10 = 8
            r11 = 0
            com.tencent.mm.plugin.finder.assist.d9 r14 = com.tencent.mm.plugin.finder.assist.a9.a(r4, r5, r6, r7, r9, r10, r11)
            r14.a()
            kotlinx.coroutines.f1 r1 = r3.f292498r
            if (r1 == 0) goto L56
            r13.f292387d = r14
            r13.f292388e = r2
            kotlinx.coroutines.g1 r1 = (kotlinx.coroutines.g1) r1
            java.lang.Object r1 = r1.k(r13)
            if (r1 != r0) goto L51
            return r0
        L51:
            r0 = r14
            r14 = r1
        L53:
            yl2.k r14 = (yl2.k) r14
            goto L5a
        L56:
            r0 = 0
            r12 = r0
            r0 = r14
            r14 = r12
        L5a:
            r0.b()
            if (r14 == 0) goto L65
            int r0 = r3.f292489f
            r1 = 2
            im2.p4.O6(r3, r1, r0, r14)
        L65:
            jz5.f0 r14 = jz5.f0.f302826a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: im2.i4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
