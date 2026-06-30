package df;

/* loaded from: classes15.dex */
public final class f0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f229449d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f229450e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df.p0 f229451f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.android.RenderMode f229452g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f229453h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.engine.renderer.FlutterRenderer f229454i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(boolean z17, df.p0 p0Var, io.flutter.embedding.android.RenderMode renderMode, long j17, io.flutter.embedding.engine.renderer.FlutterRenderer flutterRenderer, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f229450e = z17;
        this.f229451f = p0Var;
        this.f229452g = renderMode;
        this.f229453h = j17;
        this.f229454i = flutterRenderer;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df.f0(this.f229450e, this.f229451f, this.f229452g, this.f229453h, this.f229454i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df.f0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007c, code lost:
    
        if (r15 == r0) goto L18;
     */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r14.f229449d
            r2 = 0
            long r3 = r14.f229453h
            java.lang.String r5 = " tick:"
            io.flutter.embedding.android.RenderMode r6 = r14.f229452g
            java.lang.String r7 = " to mode:"
            java.lang.String r8 = "switchFlutterRenderSurface-"
            java.lang.String r9 = "SkylineFlutterViewWrapperSwapRenderSurfaceImpl"
            jz5.f0 r10 = jz5.f0.f302826a
            df.p0 r11 = r14.f229451f
            r12 = 1
            if (r1 == 0) goto L26
            if (r1 != r12) goto L1e
            kotlin.ResultKt.throwOnFailure(r15)
            goto L83
        L1e:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L26:
            kotlin.ResultKt.throwOnFailure(r15)
            boolean r15 = r14.f229450e
            if (r15 == 0) goto L56
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>(r8)
            df.z r0 = r11.f229532a
            int r0 = r0.getSkylineWindowId()
            r15.append(r0)
            r15.append(r7)
            r15.append(r6)
            r15.append(r5)
            r15.append(r3)
            java.lang.String r0 = " do swap surface path -- ignore displaying end"
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            java.lang.Object[] r0 = new java.lang.Object[r2]
            com.tencent.mm.plugin.appbrand.utils.s3.b(r9, r15, r0)
            goto Lab
        L56:
            r14.f229449d = r12
            r11.getClass()
            io.flutter.embedding.engine.renderer.FlutterRenderer r15 = r14.f229454i
            boolean r1 = r15.isDisplayingFlutterUi()
            if (r1 == 0) goto L64
            goto L7f
        L64:
            kotlinx.coroutines.r r1 = new kotlinx.coroutines.r
            kotlin.coroutines.Continuation r13 = pz5.f.b(r14)
            r1.<init>(r13, r12)
            r1.k()
            df.m0 r12 = new df.m0
            r12.<init>(r1, r15)
            r15.addIsDisplayingFlutterUiListener(r12)
            java.lang.Object r15 = r1.j()
            if (r15 != r0) goto L7f
            goto L80
        L7f:
            r15 = r10
        L80:
            if (r15 != r0) goto L83
            return r0
        L83:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>(r8)
            df.z r0 = r11.f229532a
            int r0 = r0.getSkylineWindowId()
            r15.append(r0)
            r15.append(r7)
            r15.append(r6)
            r15.append(r5)
            r15.append(r3)
            java.lang.String r0 = " do swap surface path -- wait for displaying end"
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            java.lang.Object[] r0 = new java.lang.Object[r2]
            com.tencent.mm.plugin.appbrand.utils.s3.b(r9, r15, r0)
        Lab:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: df.f0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
