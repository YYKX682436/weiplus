package df2;

/* loaded from: classes3.dex */
public final class zg extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f231966d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.bh f231967e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zg(df2.bh bhVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f231967e = bhVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.zg(this.f231967e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.zg) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:5:0x002e). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r13.f231966d
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.ResultKt.throwOnFailure(r14)
            r1 = r0
            r0 = r13
            goto L2e
        Lf:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L17:
            kotlin.ResultKt.throwOnFailure(r14)
            r14 = r13
        L1b:
            df2.bh r1 = r14.f231967e
            u26.w r1 = r1.f229806o
            r14.f231966d = r2
            u26.k r1 = (u26.k) r1
            java.lang.Object r1 = r1.r(r14)
            if (r1 != r0) goto L2a
            return r0
        L2a:
            r12 = r0
            r0 = r14
            r14 = r1
            r1 = r12
        L2e:
            jz5.l r14 = (jz5.l) r14
            df2.bh r3 = r0.f231967e
            java.lang.String r4 = r3.f229804m
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "loc = "
            r5.<init>(r6)
            r5.append(r14)
            java.lang.String r6 = ", isEmpty = "
            r5.append(r6)
            u26.w r6 = r3.f229806o
            boolean r6 = r6.isEmpty()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.mars.xlog.Log.i(r4, r5)
            df2.bh r6 = r0.f231967e
            r7 = 0
            r8 = 0
            df2.yg r9 = new df2.yg
            r4 = 0
            r9.<init>(r6, r14, r4)
            r10 = 3
            r11 = 0
            com.tencent.mm.plugin.finder.live.util.y.o(r6, r7, r8, r9, r10, r11)
            java.lang.String r14 = r3.f229804m
            java.lang.String r3 = "receive end"
            com.tencent.mars.xlog.Log.i(r14, r3)
            r14 = r0
            r0 = r1
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.zg.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
