package rx3;

/* loaded from: classes10.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f401043d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ox3.g f401044e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ox3.g gVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f401044e = gVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rx3.n(this.f401044e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rx3.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0083 A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r9.f401043d
            ox3.g r2 = r9.f401044e
            r3 = 0
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L1a
            if (r1 != r4) goto L12
            kotlin.ResultKt.throwOnFailure(r10)
            goto L84
        L12:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1a:
            kotlin.ResultKt.throwOnFailure(r10)
            t45.n0 r10 = r2.f349749d
            boolean r1 = r10.f415619h
            if (r1 != 0) goto Lac
            int r1 = r10.f415618g
            if (r1 != 0) goto Lac
            int r1 = r10.f415615d
            r6 = 2
            if (r1 == r6) goto L2e
            goto Lac
        L2e:
            t45.g r1 = r10.f415617f
            if (r1 != 0) goto L33
            return r5
        L33:
            vx3.k r7 = vx3.l.E
            vx3.i r1 = r7.e(r1, r10)
            r1.f441289f = r10
            java.lang.Class<zy2.b6> r10 = zy2.b6.class
            i95.m r10 = i95.n0.c(r10)
            zy2.b6 r10 = (zy2.b6) r10
            c61.l7 r10 = (c61.l7) r10
            r10.getClass()
            ya2.l r10 = ya2.l.f460502a
            java.lang.String r7 = r1.f441294k
            java.lang.String r8 = r1.e()
            r10.k(r7, r5, r8)
            qx3.d r10 = qx3.d.f367349a
            r9.f401043d = r4
            t45.n0 r7 = r1.f441289f
            if (r7 == 0) goto L61
            int r8 = r7.f415615d
            if (r8 != r6) goto L61
            r6 = r4
            goto L62
        L61:
            r6 = r3
        L62:
            if (r6 == 0) goto L73
            com.tencent.mm.protocal.protobuf.FinderObject r6 = r1.f441287d
            if (r6 != 0) goto L80
            java.lang.Object r10 = r10.b(r1, r9)
            if (r10 != r0) goto L6f
            goto L81
        L6f:
            r1 = r10
            vx3.i r1 = (vx3.i) r1
            goto L80
        L73:
            if (r7 == 0) goto L7b
            int r10 = r7.f415615d
            if (r10 != r4) goto L7b
            r10 = r4
            goto L7c
        L7b:
            r10 = r3
        L7c:
            if (r10 == 0) goto L7f
            goto L80
        L7f:
            r1 = r5
        L80:
            r10 = r1
        L81:
            if (r10 != r0) goto L84
            return r0
        L84:
            vx3.i r10 = (vx3.i) r10
            if (r10 == 0) goto La8
            com.tencent.mm.protocal.protobuf.FinderObject r10 = r10.f441287d
            if (r10 == 0) goto La8
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r10 = r10.getObjectDesc()
            if (r10 == 0) goto La8
            java.util.LinkedList r10 = r10.getMedia()
            if (r10 == 0) goto La8
            java.lang.Object r10 = kz5.n0.Z(r10)
            com.tencent.mm.protocal.protobuf.FinderMedia r10 = (com.tencent.mm.protocal.protobuf.FinderMedia) r10
            if (r10 == 0) goto La8
            int r10 = r10.getMediaType()
            r0 = 4
            if (r10 != r0) goto La8
            r3 = r4
        La8:
            if (r3 != 0) goto Lab
            return r5
        Lab:
            return r2
        Lac:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: rx3.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
