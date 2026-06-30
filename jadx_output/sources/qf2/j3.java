package qf2;

/* loaded from: classes.dex */
public final class j3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f362425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xg2.h f362426e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qf2.q3 f362427f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f362428g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ oi2.a f362429h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f362430i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(xg2.h hVar, kotlin.coroutines.Continuation continuation, qf2.q3 q3Var, java.lang.String str, oi2.a aVar) {
        super(2, continuation);
        this.f362426e = hVar;
        this.f362427f = q3Var;
        this.f362428g = str;
        this.f362429h = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.j3(this.f362426e, continuation, this.f362427f, this.f362428g, this.f362429h);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qf2.j3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d3 A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r9.f362425d
            r2 = 2
            r3 = 0
            qf2.q3 r4 = r9.f362427f
            r5 = 1
            if (r1 == 0) goto L24
            if (r1 == r5) goto L1c
            if (r1 != r2) goto L14
            kotlin.ResultKt.throwOnFailure(r10)
            goto Ld4
        L14:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1c:
            java.lang.Object r1 = r9.f362430i
            r45.m52 r1 = (r45.m52) r1
            kotlin.ResultKt.throwOnFailure(r10)
            goto L89
        L24:
            kotlin.ResultKt.throwOnFailure(r10)
            xg2.h r10 = r9.f362426e
            xg2.i r10 = (xg2.i) r10
            java.lang.Object r10 = r10.f454393b
            r1 = r10
            r45.m52 r1 = (r45.m52) r1
            com.tencent.mm.protobuf.g r10 = r1.getByteString(r5)
            r6 = 0
            if (r10 != 0) goto L5e
            r10 = 4
            com.tencent.mm.protobuf.f r7 = r1.getCustom(r10)
            r45.qp1 r7 = (r45.qp1) r7
            if (r7 == 0) goto L5e
            com.tencent.mm.protobuf.f r10 = r1.getCustom(r10)
            r45.qp1 r10 = (r45.qp1) r10
            if (r10 == 0) goto L59
            java.lang.String r10 = r10.getString(r5)
            if (r10 == 0) goto L59
            android.content.Context r0 = r4.O6()
            android.widget.Toast r10 = db5.t7.makeText(r0, r10, r6)
            r10.show()
        L59:
            r4.b7()
            goto Ld4
        L5e:
            java.lang.Class<zy2.b6> r10 = zy2.b6.class
            i95.m r10 = i95.n0.c(r10)
            zy2.b6 r10 = (zy2.b6) r10
            android.content.Context r7 = r4.O6()
            com.tencent.mm.protobuf.g r8 = r1.getByteString(r5)
            if (r8 == 0) goto L75
            byte[] r8 = r8.g()
            goto L76
        L75:
            r8 = r3
        L76:
            if (r8 != 0) goto L7a
            byte[] r8 = new byte[r6]
        L7a:
            r9.f362430i = r1
            r9.f362425d = r5
            c61.l7 r10 = (c61.l7) r10
            java.lang.String r5 = r9.f362428g
            java.lang.Object r10 = r10.Mk(r7, r8, r5, r9)
            if (r10 != r0) goto L89
            return r0
        L89:
            jz5.l r10 = (jz5.l) r10
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "applyPayMicRequest success, pay result: "
            r5.<init>(r6)
            r5.append(r10)
            java.lang.String r6 = " session_id: "
            r5.append(r6)
            r6 = 3
            java.lang.String r7 = r1.getString(r6)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.String r7 = "FinderLivePayMicControl"
            com.tencent.mars.xlog.Log.i(r7, r5)
            java.lang.Class<mm2.o4> r5 = mm2.o4.class
            androidx.lifecycle.c1 r5 = r4.business(r5)
            mm2.o4 r5 = (mm2.o4) r5
            java.lang.String r1 = r1.getString(r6)
            if (r1 != 0) goto Lbb
            java.lang.String r1 = ""
        Lbb:
            r5.P7(r1)
            kotlinx.coroutines.p0 r1 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r1 = kotlinx.coroutines.internal.b0.f310484a
            qf2.h3 r5 = new qf2.h3
            oi2.a r6 = r9.f362429h
            r5.<init>(r10, r4, r6, r3)
            r9.f362430i = r3
            r9.f362425d = r2
            java.lang.Object r10 = kotlinx.coroutines.l.g(r1, r5, r9)
            if (r10 != r0) goto Ld4
            return r0
        Ld4:
            jz5.f0 r10 = jz5.f0.f302826a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: qf2.j3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
