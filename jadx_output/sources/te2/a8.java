package te2;

/* loaded from: classes3.dex */
public final class a8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f417879d;

    /* renamed from: e, reason: collision with root package name */
    public int f417880e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f417881f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f417882g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(te2.p8 p8Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f417881f = p8Var;
        this.f417882g = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new te2.a8(this.f417881f, this.f417882g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((te2.a8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x007c  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f417880e
            r3 = 0
            boolean r4 = r0.f417882g
            r5 = 0
            r6 = 2
            r7 = 1
            te2.p8 r8 = r0.f417881f
            if (r2 == 0) goto L2d
            if (r2 == r7) goto L22
            if (r2 != r6) goto L1a
            kotlin.ResultKt.throwOnFailure(r17)
            r2 = r17
            goto L73
        L1a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L22:
            java.lang.Object r2 = r0.f417879d
            te2.p8 r2 = (te2.p8) r2
            kotlin.ResultKt.throwOnFailure(r17)
            r9 = r2
            r2 = r17
            goto L48
        L2d:
            kotlin.ResultKt.throwOnFailure(r17)
            java.lang.String r2 = r8.f418333y1
            boolean r2 = com.tencent.mm.vfs.w6.j(r2)
            if (r2 == 0) goto L4b
            zl2.o0 r2 = zl2.o0.f473907a
            java.lang.String r9 = r8.f418333y1
            r0.f417879d = r8
            r0.f417880e = r7
            java.lang.Object r2 = r2.b(r9, r0)
            if (r2 != r1) goto L47
            return r1
        L47:
            r9 = r8
        L48:
            java.lang.String r2 = (java.lang.String) r2
            goto L4e
        L4b:
            java.lang.String r2 = r8.f418333y1
            r9 = r8
        L4e:
            r9.t7(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r9 = "REQUEST_CODE_CROP_IMAGE uploadImage result: "
            r2.<init>(r9)
            java.lang.String r9 = r8.f418333y1
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            java.lang.String r9 = "FinderLiveNoticeQRCodeUIC"
            com.tencent.mars.xlog.Log.i(r9, r2)
            if (r4 != 0) goto L80
            r0.f417879d = r5
            r0.f417880e = r6
            java.lang.Object r2 = te2.p8.T6(r8, r3, r0, r7, r5)
            if (r2 != r1) goto L73
            return r1
        L73:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r1 = r2.booleanValue()
            if (r1 == 0) goto L7c
            goto L80
        L7c:
            r8.Y6()
            goto Lbf
        L80:
            java.lang.String r1 = r8.f418314l1
            java.lang.String r2 = r8.f418333y1
            boolean r1 = kotlin.jvm.internal.o.b(r1, r2)
            if (r1 != 0) goto La9
            java.lang.Class<zy2.zb> r1 = zy2.zb.class
            i95.m r1 = i95.n0.c(r1)
            java.lang.String r2 = "getService(...)"
            kotlin.jvm.internal.o.f(r1, r2)
            r9 = r1
            zy2.zb r9 = (zy2.zb) r9
            ml2.y2 r10 = ml2.y2.f328260p
            java.lang.String r11 = ""
            te2.rc r1 = r8.A1
            java.lang.String r12 = r1.b()
            r13 = 0
            r14 = 8
            r15 = 0
            zy2.zb.qg(r9, r10, r11, r12, r13, r14, r15)
        La9:
            java.lang.String r1 = r8.f418333y1
            r8.f418314l1 = r1
            int r1 = r8.f418329x0
            r8.f418332y0 = r1
            if (r4 == 0) goto Lb7
            r1 = 3
            r8.E1 = r1
            goto Lb9
        Lb7:
            r8.E1 = r6
        Lb9:
            r8.r7(r7)
            r8.p7()
        Lbf:
            te2.p8.x7(r8, r3, r5, r6, r5)
            jz5.f0 r1 = jz5.f0.f302826a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: te2.a8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
