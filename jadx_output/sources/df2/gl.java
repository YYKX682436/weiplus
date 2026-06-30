package df2;

/* loaded from: classes3.dex */
public final class gl extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f230227d;

    /* renamed from: e, reason: collision with root package name */
    public int f230228e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.pl f230229f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f230230g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gl(df2.pl plVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230229f = plVar;
        this.f230230g = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.gl(this.f230229f, this.f230230g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.gl) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0053  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            r25 = this;
            r6 = r25
            pz5.a r7 = pz5.a.f359186d
            int r0 = r6.f230228e
            r1 = 1
            if (r0 == 0) goto L1e
            if (r0 != r1) goto L16
            java.lang.Object r0 = r6.f230227d
            df2.pl r0 = (df2.pl) r0
            kotlin.ResultKt.throwOnFailure(r26)
            r8 = r0
            r0 = r26
            goto L4f
        L16:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L1e:
            kotlin.ResultKt.throwOnFailure(r26)
            df2.pl r8 = r6.f230229f
            ce2.i r2 = r8.f231088n
            r0 = 0
            if (r2 == 0) goto L2d
            r45.yi6 r3 = r2.Q0()
            goto L2e
        L2d:
            r3 = r0
        L2e:
            java.lang.String r4 = r6.f230230g
            if (r2 == 0) goto Le2
            if (r3 == 0) goto Le2
            dk2.xf r5 = r8.P6()
            if (r5 == 0) goto L51
            android.content.Context r9 = r8.O6()
            r6.f230227d = r8
            r6.f230228e = r1
            r0 = r5
            dk2.r4 r0 = (dk2.r4) r0
            r1 = r9
            r5 = r25
            java.lang.Object r0 = r0.t0(r1, r2, r3, r4, r5)
            if (r0 != r7) goto L4f
            return r7
        L4f:
            r45.hb2 r0 = (r45.hb2) r0
        L51:
            if (r0 == 0) goto Lcc
            android.view.View r0 = r8.f231091q
            if (r0 == 0) goto L5a
            r0.performClick()
        L5a:
            dk2.ef r0 = dk2.ef.f233372a
            gk2.e r0 = dk2.ef.I
            if (r0 == 0) goto Le2
            ek2.z r1 = new ek2.z
            java.lang.Class<mm2.e1> r2 = mm2.e1.class
            androidx.lifecycle.c1 r3 = r0.a(r2)
            mm2.e1 r3 = (mm2.e1) r3
            r45.nw1 r3 = r3.f328988r
            r4 = 0
            long r10 = r3.getLong(r4)
            androidx.lifecycle.c1 r3 = r0.a(r2)
            mm2.e1 r3 = (mm2.e1) r3
            long r12 = r3.f328983m
            androidx.lifecycle.c1 r3 = r0.a(r2)
            mm2.e1 r3 = (mm2.e1) r3
            java.lang.String r14 = r3.f328992v
            android.content.Context r3 = r8.O6()
            java.lang.String r15 = xy2.c.e(r3)
            r16 = 0
            androidx.lifecycle.c1 r2 = r0.a(r2)
            mm2.e1 r2 = (mm2.e1) r2
            byte[] r2 = r2.f328985o
            zl2.r4 r3 = zl2.r4.f473950a
            int r18 = r3.b0(r0)
            r19 = 1
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 1792(0x700, float:2.511E-42)
            r24 = 0
            r9 = r1
            r17 = r2
            r9.<init>(r10, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            pq5.g r0 = r1.l()
            df2.fl r1 = new df2.fl
            r1.<init>(r8)
            r0.K(r1)
            r8.O6()
            android.content.Context r1 = r8.O6()
            boolean r1 = r1 instanceof com.tencent.mm.ui.MMActivity
            if (r1 == 0) goto Le2
            android.content.Context r1 = r8.O6()
            com.tencent.mm.ui.MMActivity r1 = (com.tencent.mm.ui.MMActivity) r1
            r0.f(r1)
            goto Le2
        Lcc:
            android.content.Context r0 = r8.O6()
            android.content.Context r1 = r8.O6()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131763791(0x7f10224f, float:1.9158697E38)
            java.lang.String r1 = r1.getString(r2)
            db5.t7.g(r0, r1)
        Le2:
            jz5.f0 r0 = jz5.f0.f302826a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.gl.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
