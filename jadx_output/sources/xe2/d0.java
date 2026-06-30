package xe2;

/* loaded from: classes3.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f453843d;

    /* renamed from: e, reason: collision with root package name */
    public int f453844e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f453845f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q26.n f453846g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ xe2.h0 f453847h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(q26.n nVar, xe2.h0 h0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f453846g = nVar;
        this.f453847h = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        xe2.d0 d0Var = new xe2.d0(this.f453846g, this.f453847h, continuation);
        d0Var.f453845f = obj;
        return d0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xe2.d0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x002c A[SYNTHETIC] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r8.f453844e
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 != r2) goto L15
            java.lang.Object r1 = r8.f453843d
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r3 = r8.f453845f
            kotlinx.coroutines.y0 r3 = (kotlinx.coroutines.y0) r3
            kotlin.ResultKt.throwOnFailure(r9)
            goto L2b
        L15:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1d:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.Object r9 = r8.f453845f
            kotlinx.coroutines.y0 r9 = (kotlinx.coroutines.y0) r9
            q26.n r1 = r8.f453846g
            java.util.Iterator r1 = r1.iterator()
            r3 = r9
        L2b:
            r9 = r8
        L2c:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L81
            java.lang.Object r4 = r1.next()
            r45.ch1 r4 = (r45.ch1) r4
            r45.cj1 r5 = new r45.cj1
            r5.<init>()
            r6 = 4
            com.tencent.mm.protobuf.g r4 = r4.getByteString(r6)
            r6 = 0
            if (r4 == 0) goto L4a
            byte[] r4 = r4.g()
            goto L4b
        L4a:
            r4 = r6
        L4b:
            if (r4 != 0) goto L4f
        L4d:
            r5 = r6
            goto L60
        L4f:
            r5.parseFrom(r4)     // Catch: java.lang.Exception -> L53
            goto L60
        L53:
            r4 = move-exception
            java.lang.String r5 = ""
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r7 = "safeParser"
            com.tencent.mm.sdk.platformtools.Log.a(r7, r5, r4)
            goto L4d
        L60:
            if (r5 == 0) goto L6a
            r4 = 3
            com.tencent.mm.protobuf.f r4 = r5.getCustom(r4)
            r6 = r4
            r45.kv1 r6 = (r45.kv1) r6
        L6a:
            if (r6 == 0) goto L2c
            boolean r4 = kotlinx.coroutines.z0.h(r3)
            if (r4 == 0) goto L2c
            dk2.u7 r4 = dk2.u7.f234181a
            r9.f453845f = r3
            r9.f453843d = r1
            r9.f453844e = r2
            java.lang.Object r4 = r4.k(r6, r9)
            if (r4 != r0) goto L2c
            return r0
        L81:
            xe2.c0 r0 = new xe2.c0
            xe2.h0 r1 = r9.f453847h
            r0.<init>(r1)
            q26.n r9 = r9.f453846g
            q26.n r9 = q26.h0.o(r9, r0)
            java.util.List r9 = q26.h0.z(r9)
            java.lang.String r0 = r1.f453866c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "#dealWithMsgList after trans to giftShowInfo. size="
            r2.<init>(r3)
            int r3 = r9.size()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.mars.xlog.Log.i(r0, r2)
            gk2.e r0 = r1.f445267a
            java.lang.Class<mm2.c1> r1 = mm2.c1.class
            androidx.lifecycle.c1 r0 = r0.a(r1)
            mm2.c1 r0 = (mm2.c1) r0
            com.tencent.mm.plugin.finder.live.util.o1 r0 = r0.f328806g
            com.tencent.mm.plugin.finder.live.util.j1 r0 = (com.tencent.mm.plugin.finder.live.util.j1) r0
            r0.a(r9)
            jz5.f0 r9 = jz5.f0.f302826a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: xe2.d0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
