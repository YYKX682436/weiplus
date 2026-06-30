package nu0;

/* loaded from: classes5.dex */
public final class e1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f339921d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f339922e;

    /* renamed from: f, reason: collision with root package name */
    public int f339923f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f339924g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f339925h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(java.util.List list, nu0.b4 b4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f339924g = list;
        this.f339925h = b4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nu0.e1(this.f339924g, this.f339925h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((nu0.e1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0055  */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004b -> B:5:0x0051). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r8.f339923f
            r2 = 1
            if (r1 == 0) goto L21
            if (r1 != r2) goto L19
            java.lang.Object r1 = r8.f339922e
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r3 = r8.f339921d
            java.util.Collection r3 = (java.util.Collection) r3
            kotlin.ResultKt.throwOnFailure(r9)
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r8
            goto L51
        L19:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L21:
            kotlin.ResultKt.throwOnFailure(r9)
            java.util.List r9 = r8.f339924g
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r9 = r9.iterator()
            r3 = r1
            r1 = r9
            r9 = r8
        L32:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L5d
            java.lang.Object r4 = r1.next()
            com.tencent.mm.maas_api.MJMediaItem r4 = (com.tencent.mm.maas_api.MJMediaItem) r4
            r9.f339921d = r3
            r9.f339922e = r1
            r9.f339923f = r2
            java.lang.Object r4 = zu0.g.f(r4, r9)
            if (r4 != r0) goto L4b
            return r0
        L4b:
            r7 = r0
            r0 = r9
            r9 = r4
            r4 = r3
            r3 = r1
            r1 = r7
        L51:
            zu0.a r9 = (zu0.a) r9
            if (r9 == 0) goto L58
            r4.add(r9)
        L58:
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L32
        L5d:
            java.util.List r3 = (java.util.List) r3
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kz5.d0.q(r3, r1)
            r0.<init>(r1)
            java.util.Iterator r1 = r3.iterator()
        L6e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L80
            java.lang.Object r2 = r1.next()
            zu0.a r2 = (zu0.a) r2
            com.tencent.maas.instamovie.base.asset.MJAssetInfo r2 = r2.f475661a
            r0.add(r2)
            goto L6e
        L80:
            nu0.b4 r1 = r9.f339925h
            nu0.q0 r1 = r1.U6()
            nu0.d1 r2 = new nu0.d1
            nu0.b4 r9 = r9.f339925h
            r2.<init>(r9, r3)
            r1.getClass()
            com.tencent.maas.imagestudio.MJImageSession r9 = r1.f340075r
            if (r9 == 0) goto L9c
            com.tencent.maas.imagestudio.MJImageScene[] r9 = r9.getImageScenes()
            if (r9 == 0) goto L9c
            int r9 = r9.length
            goto L9d
        L9c:
            r9 = 0
        L9d:
            int r3 = r0.size()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "[addScene] currentSize:"
            r4.<init>(r5)
            r4.append(r9)
            java.lang.String r5 = " addSize:"
            r4.append(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "ImageControlUIC"
            com.tencent.mars.xlog.Log.i(r5, r4)
            com.tencent.maas.imagestudio.MJImageSession r4 = r1.f340075r
            if (r4 == 0) goto Lce
            java.lang.Object r5 = kz5.n0.X(r0)
            com.tencent.maas.instamovie.base.asset.MJAssetInfo r5 = (com.tencent.maas.instamovie.base.asset.MJAssetInfo) r5
            nu0.x r6 = new nu0.x
            r6.<init>(r2, r9, r3, r1)
            r4.a(r0, r5, r6)
        Lce:
            jz5.f0 r9 = jz5.f0.f302826a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: nu0.e1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
