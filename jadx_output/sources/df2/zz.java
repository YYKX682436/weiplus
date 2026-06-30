package df2;

/* loaded from: classes3.dex */
public final class zz extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f232011d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f232012e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.xb2 f232013f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.a00 f232014g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zz(r45.xb2 xb2Var, df2.a00 a00Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f232013f = xb2Var;
        this.f232014g = a00Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        df2.zz zzVar = new df2.zz(this.f232013f, this.f232014g, continuation);
        zzVar.f232012e = obj;
        return zzVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.zz) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0068  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r13.f232011d
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L25
            if (r1 == r4) goto L1d
            if (r1 != r2) goto L15
            java.lang.Object r0 = r13.f232012e
            com.tencent.mm.rfx.RfxPagFile r0 = (com.tencent.mm.rfx.RfxPagFile) r0
            kotlin.ResultKt.throwOnFailure(r14)
            goto L63
        L15:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1d:
            java.lang.Object r1 = r13.f232012e
            kotlinx.coroutines.f1 r1 = (kotlinx.coroutines.f1) r1
            kotlin.ResultKt.throwOnFailure(r14)
            goto L54
        L25:
            kotlin.ResultKt.throwOnFailure(r14)
            java.lang.Object r14 = r13.f232012e
            kotlinx.coroutines.y0 r14 = (kotlinx.coroutines.y0) r14
            r6 = 0
            r7 = 0
            df2.yz r8 = new df2.yz
            r45.xb2 r1 = r13.f232013f
            df2.a00 r11 = r13.f232014g
            r8.<init>(r1, r11, r3)
            r9 = 3
            r10 = 0
            r5 = r14
            kotlinx.coroutines.f1 r12 = kotlinx.coroutines.l.b(r5, r6, r7, r8, r9, r10)
            df2.xz r8 = new df2.xz
            r8.<init>(r1, r11, r3)
            kotlinx.coroutines.f1 r1 = kotlinx.coroutines.l.b(r5, r6, r7, r8, r9, r10)
            r13.f232012e = r1
            r13.f232011d = r4
            kotlinx.coroutines.g1 r12 = (kotlinx.coroutines.g1) r12
            java.lang.Object r14 = r12.k(r13)
            if (r14 != r0) goto L54
            return r0
        L54:
            com.tencent.mm.rfx.RfxPagFile r14 = (com.tencent.mm.rfx.RfxPagFile) r14
            r13.f232012e = r14
            r13.f232011d = r2
            java.lang.Object r1 = r1.k(r13)
            if (r1 != r0) goto L61
            return r0
        L61:
            r0 = r14
            r14 = r1
        L63:
            com.tencent.mm.rfx.RfxPagFile r14 = (com.tencent.mm.rfx.RfxPagFile) r14
            r1 = 0
            if (r0 == 0) goto L6a
            r2 = r4
            goto L6b
        L6a:
            r2 = r1
        L6b:
            if (r2 == 0) goto L78
            if (r14 == 0) goto L70
            goto L71
        L70:
            r4 = r1
        L71:
            if (r4 == 0) goto L78
            jz5.l r3 = new jz5.l
            r3.<init>(r0, r14)
        L78:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.zz.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
