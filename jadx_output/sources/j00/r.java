package j00;

/* loaded from: classes11.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f296873d;

    /* renamed from: e, reason: collision with root package name */
    public int f296874e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f296875f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f296876g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f296877h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f296878i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(java.lang.String str, java.util.Map map, android.content.Context context, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f296875f = str;
        this.f296876g = map;
        this.f296877h = context;
        this.f296878i = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new j00.r(this.f296875f, this.f296876g, this.f296877h, this.f296878i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((j00.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x00b2  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            r23 = this;
            r6 = r23
            pz5.a r7 = pz5.a.f359186d
            int r0 = r6.f296874e
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L23
            if (r0 == r2) goto L1b
            if (r0 != r1) goto L13
            kotlin.ResultKt.throwOnFailure(r24)
            goto Lac
        L13:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L1b:
            java.lang.Object r0 = r6.f296873d
            pi0.l1 r0 = (pi0.l1) r0
            kotlin.ResultKt.throwOnFailure(r24)
            goto L53
        L23:
            kotlin.ResultKt.throwOnFailure(r24)
            java.lang.Class<f50.y> r0 = f50.y.class
            i95.m r0 = i95.n0.c(r0)
            f50.y r0 = (f50.y) r0
            e50.z0 r0 = (e50.z0) r0
            pi0.q r9 = r0.Ui()
            pi0.l1 r0 = new pi0.l1
            java.lang.String r10 = "ecs"
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 28
            r15 = 0
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r0.f354649h = r2
            r6.f296873d = r0
            r6.f296874e = r2
            java.lang.String r3 = r6.f296875f
            java.util.Map r4 = r6.f296876g
            java.lang.Object r3 = r0.o(r3, r4, r6)
            if (r3 != r7) goto L53
            return r7
        L53:
            io.flutter.embedding.engine.plugins.FlutterPlugin[] r3 = new io.flutter.embedding.engine.plugins.FlutterPlugin[r1]
            j00.d0 r4 = new j00.d0
            r4.<init>()
            r5 = 0
            r3[r5] = r4
            java.lang.Class<s03.g> r4 = s03.g.class
            i95.m r4 = i95.n0.c(r4)
            s03.g r4 = (s03.g) r4
            r03.e r4 = (r03.e) r4
            r5 = 0
            io.flutter.embedding.engine.plugins.FlutterPlugin r4 = r4.wi(r5)
            r3[r2] = r4
            java.util.List r2 = kz5.c0.i(r3)
            r0.a(r2)
            com.tencent.mm.flutter.ui.FlutterPageStyle r2 = new com.tencent.mm.flutter.ui.FlutterPageStyle
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 4095(0xfff, float:5.738E-42)
            r22 = 0
            r8 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            android.content.Context r3 = r6.f296877h
            if (r3 != 0) goto L96
            android.content.Context r3 = com.tencent.mm.sdk.platformtools.x2.f193071a
        L96:
            kotlin.jvm.internal.o.d(r3)
            java.lang.Class<com.tencent.mm.feature.ecs.ui.EcsGiftFlutterUI> r4 = com.tencent.mm.feature.ecs.ui.EcsGiftFlutterUI.class
            r8 = 0
            r6.f296873d = r5
            r6.f296874e = r1
            r1 = r3
            r3 = r4
            r4 = r8
            r5 = r23
            java.lang.Object r0 = r0.s(r1, r2, r3, r4, r5)
            if (r0 != r7) goto Lac
            return r7
        Lac:
            j00.y r0 = j00.y.f296946a
            yz5.a r0 = r6.f296878i
            if (r0 == 0) goto Lb5
            r0.invoke()
        Lb5:
            jz5.f0 r0 = jz5.f0.f302826a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j00.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
