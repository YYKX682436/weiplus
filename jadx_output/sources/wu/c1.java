package wu;

/* loaded from: classes9.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f449552d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f449553e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hu.b f449554f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(android.view.View view, hu.b bVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f449553e = view;
        this.f449554f = bVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wu.c1(this.f449553e, this.f449554f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((wu.c1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        if (r0 == r13) goto L19;
     */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r12 = r15
            pz5.a r13 = pz5.a.f359186d
            int r0 = r12.f449552d
            jz5.f0 r14 = jz5.f0.f302826a
            r1 = 1
            if (r0 == 0) goto L19
            if (r0 != r1) goto L11
            kotlin.ResultKt.throwOnFailure(r16)
            goto L7d
        L11:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L19:
            kotlin.ResultKt.throwOnFailure(r16)
            java.lang.Class<c00.z2> r0 = c00.z2.class
            i95.m r0 = i95.n0.c(r0)
            c00.z2 r0 = (c00.z2) r0
            android.view.View r2 = r12.f449553e
            android.content.Context r2 = r2.getContext()
            java.lang.String r3 = "getContext(...)"
            kotlin.jvm.internal.o.f(r2, r3)
            hu.b r3 = r12.f449554f
            java.lang.String r4 = r3.f284998f
            s15.h r3 = r3.f284997e
            r12.f449552d = r1
            b00.r r0 = (b00.r) r0
            r0.getClass()
            e00.k0 r0 = new e00.k0
            r0.<init>()
            s15.k r1 = r3.z()
            if (r1 == 0) goto L4c
            bw5.g9 r1 = e00.l.e(r1)
            goto L4d
        L4c:
            r1 = 0
        L4d:
            r3 = r1
            if (r3 != 0) goto L59
            java.lang.String r0 = "ShopWindowCardJumpDelegate"
            java.lang.String r1 = "open record shop card failed, share object is null"
            com.tencent.mars.xlog.Log.e(r0, r1)
            goto L75
        L59:
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = ""
            bw5.x8 r8 = bw5.x8.ECS_REQ_SCENE_RECORD
            r9 = 0
            r10 = 128(0x80, float:1.8E-43)
            r11 = 0
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r15
            java.lang.Object r0 = e00.k0.b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r0 != r13) goto L75
            goto L76
        L75:
            r0 = r14
        L76:
            if (r0 != r13) goto L79
            goto L7a
        L79:
            r0 = r14
        L7a:
            if (r0 != r13) goto L7d
            return r13
        L7d:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: wu.c1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
