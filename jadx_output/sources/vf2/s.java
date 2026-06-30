package vf2;

/* loaded from: classes3.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f436356d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f436357e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vf2.t f436358f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(vf2.t tVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f436358f = tVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        vf2.s sVar = new vf2.s(this.f436358f, continuation);
        sVar.f436357e = obj;
        return sVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vf2.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0034 -> B:5:0x0037). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f436356d
            r3 = 1
            if (r2 == 0) goto L1c
            if (r2 != r3) goto L14
            java.lang.Object r2 = r0.f436357e
            kotlinx.coroutines.y0 r2 = (kotlinx.coroutines.y0) r2
            kotlin.ResultKt.throwOnFailure(r18)
            r4 = r0
            goto L37
        L14:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L1c:
            kotlin.ResultKt.throwOnFailure(r18)
            java.lang.Object r2 = r0.f436357e
            kotlinx.coroutines.y0 r2 = (kotlinx.coroutines.y0) r2
            r4 = r0
        L24:
            boolean r5 = kotlinx.coroutines.z0.h(r2)
            if (r5 == 0) goto L76
            r4.f436357e = r2
            r4.f436356d = r3
            r5 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r5 = kotlinx.coroutines.k1.b(r5, r4)
            if (r5 != r1) goto L37
            return r1
        L37:
            vf2.t r5 = r4.f436358f
            boolean r5 = vf2.t.Z6(r5)
            if (r5 == 0) goto L24
            tn0.w0 r5 = dk2.ef.f233378d
            r6 = 0
            if (r5 == 0) goto L57
            ts0.r r5 = r5.f420775v
            if (r5 == 0) goto L52
            ts0.b r5 = (ts0.b) r5
            boolean r5 = r5.G()
            if (r5 != r3) goto L52
            r5 = r3
            goto L53
        L52:
            r5 = r6
        L53:
            if (r5 != r3) goto L57
            r5 = r3
            goto L58
        L57:
            r5 = r6
        L58:
            if (r5 == 0) goto L24
            xy2.b r7 = xy2.b.f458155b
            java.lang.String r8 = "need_block_but_camera_previewing"
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 124(0x7c, float:1.74E-43)
            r16 = 0
            pm0.z.b(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            tn0.w0 r5 = dk2.ef.f233378d
            if (r5 == 0) goto L24
            r5.H0()
            qz5.b.d(r6)
            goto L24
        L76:
            jz5.f0 r1 = jz5.f0.f302826a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vf2.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
