package zf0;

/* loaded from: classes10.dex */
public final class y0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f472596d;

    /* renamed from: e, reason: collision with root package name */
    public int f472597e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f472598f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zf0.a f472599g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d11.d f472600h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f472601i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(zf0.a aVar, d11.d dVar, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f472599g = aVar;
        this.f472600h = dVar;
        this.f472601i = atomicBoolean;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        zf0.y0 y0Var = new zf0.y0(this.f472599g, this.f472600h, this.f472601i, continuation);
        y0Var.f472598f = obj;
        return y0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((zf0.y0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0039 -> B:5:0x003c). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r7.f472597e
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1d
            if (r1 != r3) goto L15
            int r1 = r7.f472596d
            java.lang.Object r4 = r7.f472598f
            kotlinx.coroutines.y0 r4 = (kotlinx.coroutines.y0) r4
            kotlin.ResultKt.throwOnFailure(r8)
            r8 = r7
            goto L3c
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.Object r8 = r7.f472598f
            kotlinx.coroutines.y0 r8 = (kotlinx.coroutines.y0) r8
            r4 = r8
            r1 = r2
            r8 = r7
        L27:
            boolean r5 = kotlinx.coroutines.z0.h(r4)
            if (r5 == 0) goto L59
            r8.f472598f = r4
            r8.f472596d = r1
            r8.f472597e = r3
            r5 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r5 = kotlinx.coroutines.k1.b(r5, r8)
            if (r5 != r0) goto L3c
            return r0
        L3c:
            int r1 = r1 + r3
            zf0.a r5 = r8.f472599g
            if (r5 == 0) goto L49
            boolean r5 = r5.a(r1)
            if (r5 != r3) goto L49
            r5 = r3
            goto L4a
        L49:
            r5 = r2
        L4a:
            if (r5 == 0) goto L27
            d11.d r5 = r8.f472600h
            j3.h r5 = r5.f225657b
            r5.a()
            java.util.concurrent.atomic.AtomicBoolean r5 = r8.f472601i
            r5.set(r3)
            goto L27
        L59:
            jz5.f0 r8 = jz5.f0.f302826a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zf0.y0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
