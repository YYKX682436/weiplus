package im2;

/* loaded from: classes3.dex */
public final class d6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f292295d;

    /* renamed from: e, reason: collision with root package name */
    public int f292296e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f292297f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.f1 f292298g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ im2.h6 f292299h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(kotlinx.coroutines.f1 f1Var, im2.h6 h6Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f292298g = f1Var;
        this.f292299h = h6Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        im2.d6 d6Var = new im2.d6(this.f292298g, this.f292299h, continuation);
        d6Var.f292297f = obj;
        return d6Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((im2.d6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0097  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r13.f292296e
            r2 = 0
            r3 = 2
            r4 = 1
            im2.h6 r5 = r13.f292299h
            if (r1 == 0) goto L2f
            if (r1 == r4) goto L23
            if (r1 != r3) goto L1b
            java.lang.Object r0 = r13.f292295d
            r45.l71 r0 = (r45.l71) r0
            java.lang.Object r1 = r13.f292297f
            kotlinx.coroutines.y0 r1 = (kotlinx.coroutines.y0) r1
            kotlin.ResultKt.throwOnFailure(r14)
            goto L68
        L1b:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L23:
            java.lang.Object r1 = r13.f292295d
            kotlinx.coroutines.f1 r1 = (kotlinx.coroutines.f1) r1
            java.lang.Object r4 = r13.f292297f
            kotlinx.coroutines.y0 r4 = (kotlinx.coroutines.y0) r4
            kotlin.ResultKt.throwOnFailure(r14)
            goto L56
        L2f:
            kotlin.ResultKt.throwOnFailure(r14)
            java.lang.Object r14 = r13.f292297f
            kotlinx.coroutines.y0 r14 = (kotlinx.coroutines.y0) r14
            r7 = 0
            r8 = 0
            im2.c6 r9 = new im2.c6
            r9.<init>(r5, r2)
            r10 = 3
            r11 = 0
            r6 = r14
            kotlinx.coroutines.f1 r1 = kotlinx.coroutines.l.b(r6, r7, r8, r9, r10, r11)
            r13.f292297f = r14
            r13.f292295d = r1
            r13.f292296e = r4
            kotlinx.coroutines.f1 r4 = r13.f292298g
            java.lang.Object r4 = r4.k(r13)
            if (r4 != r0) goto L53
            return r0
        L53:
            r12 = r4
            r4 = r14
            r14 = r12
        L56:
            r45.l71 r14 = (r45.l71) r14
            r13.f292297f = r4
            r13.f292295d = r14
            r13.f292296e = r3
            java.lang.Object r1 = r1.k(r13)
            if (r1 != r0) goto L65
            return r0
        L65:
            r0 = r14
            r14 = r1
            r1 = r4
        L68:
            r45.wa1 r14 = (r45.wa1) r14
            boolean r1 = kotlinx.coroutines.z0.h(r1)
            jz5.f0 r3 = jz5.f0.f302826a
            if (r1 == 0) goto Lbb
            boolean r1 = r5.P
            if (r1 == 0) goto L77
            goto Lbb
        L77:
            if (r0 == 0) goto L8d
            r1 = 21
            com.tencent.mm.protobuf.f r0 = r0.getCustom(r1)
            r45.z74 r0 = (r45.z74) r0
            if (r0 == 0) goto L8d
            r1 = 0
            long r0 = r0.getLong(r1)
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r0)
        L8d:
            java.lang.String r0 = "FinderLiveVisitorAfterPagePlugin"
            if (r2 != 0) goto L97
            java.lang.String r14 = "display flag is null!!"
            com.tencent.mars.xlog.Log.i(r0, r14)
            return r3
        L97:
            long r1 = r2.longValue()
            int r1 = (int) r1
            r2 = 8
            boolean r1 = pm0.v.z(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "can show shop window = "
            r2.<init>(r4)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            com.tencent.mars.xlog.Log.i(r0, r2)
            if (r1 != 0) goto Lb6
            return r3
        Lb6:
            com.tencent.mm.plugin.finder.live.widget.h4 r0 = r5.A
            r0.b(r14)
        Lbb:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: im2.d6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
