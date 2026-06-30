package wx0;

/* loaded from: classes5.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f450531d;

    /* renamed from: e, reason: collision with root package name */
    public int f450532e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wx0.c0 f450533f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f450534g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(wx0.c0 c0Var, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f450533f = c0Var;
        this.f450534g = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wx0.r(this.f450533f, this.f450534g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((wx0.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x00bd  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r11.f450532e
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L16
            java.lang.Object r0 = r11.f450531d
            com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautyView r0 = (com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautyView) r0
            kotlin.ResultKt.throwOnFailure(r12)
            goto La9
        L16:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1e:
            kotlin.ResultKt.throwOnFailure(r12)
            goto L73
        L22:
            kotlin.ResultKt.throwOnFailure(r12)
            wx0.c0 r12 = r11.f450533f
            com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautyView r12 = r12.c()
            wx0.n r1 = new wx0.n
            yz5.a r5 = r11.f450534g
            r1.<init>(r5)
            r12.setOnDismissListener(r1)
            wx0.c0 r12 = r11.f450533f
            com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautyView r12 = r12.c()
            wx0.o r1 = new wx0.o
            wx0.c0 r5 = r11.f450533f
            r1.<init>(r5)
            r12.setOnBeautyViewDismissListener(r1)
            wx0.c0 r12 = r11.f450533f
            com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautyView r12 = r12.c()
            wx0.q r1 = new wx0.q
            wx0.c0 r5 = r11.f450533f
            r1.<init>(r5)
            r12.setOnBeautySwitch(r1)
            wx0.c0 r12 = r11.f450533f
            yx0.b8 r12 = r12.f450459g
            r11.f450532e = r4
            kotlinx.coroutines.y0 r5 = r12.L
            r6 = 0
            r7 = 0
            yx0.g2 r8 = new yx0.g2
            r8.<init>(r12, r2)
            r9 = 3
            r10 = 0
            kotlinx.coroutines.f1 r12 = kotlinx.coroutines.l.b(r5, r6, r7, r8, r9, r10)
            kotlinx.coroutines.g1 r12 = (kotlinx.coroutines.g1) r12
            java.lang.Object r12 = r12.k(r11)
            if (r12 != r0) goto L73
            return r0
        L73:
            nx0.y r12 = (nx0.y) r12
            wx0.c0 r1 = r11.f450533f
            com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautyView r1 = r1.c()
            nx0.y r1 = r1.getF69589u()
            if (r12 == r1) goto Lae
            wx0.c0 r12 = r11.f450533f
            com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautyView r12 = r12.c()
            wx0.c0 r1 = r11.f450533f
            yx0.b8 r1 = r1.f450459g
            r11.f450531d = r12
            r11.f450532e = r3
            kotlinx.coroutines.y0 r5 = r1.L
            r6 = 0
            r7 = 0
            yx0.g2 r8 = new yx0.g2
            r8.<init>(r1, r2)
            r9 = 3
            r10 = 0
            kotlinx.coroutines.f1 r1 = kotlinx.coroutines.l.b(r5, r6, r7, r8, r9, r10)
            kotlinx.coroutines.g1 r1 = (kotlinx.coroutines.g1) r1
            java.lang.Object r1 = r1.k(r11)
            if (r1 != r0) goto La7
            return r0
        La7:
            r0 = r12
            r12 = r1
        La9:
            nx0.y r12 = (nx0.y) r12
            r0.setBeautyModel(r12)
        Lae:
            wx0.c0 r12 = r11.f450533f
            com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautyView r12 = r12.c()
            wx0.c0 r0 = r11.f450533f
            yx0.b8 r0 = r0.f450459g
            com.tencent.maas.camstudio.MJCamTemplateInfo r0 = r0.Q
            if (r0 != 0) goto Lbd
            goto Lbe
        Lbd:
            r4 = 0
        Lbe:
            r12.setEnableMakeup(r4)
            wx0.c0 r12 = r11.f450533f
            com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautyView r12 = r12.c()
            r12.e()
            jz5.f0 r12 = jz5.f0.f302826a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: wx0.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
