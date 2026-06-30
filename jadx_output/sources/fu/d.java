package fu;

/* loaded from: classes5.dex */
public final class d extends ru.j {

    /* renamed from: o, reason: collision with root package name */
    public final fu.a f266754o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(fu.a params) {
        super(params);
        kotlin.jvm.internal.o.g(params, "params");
        this.f266754o = params;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // ru.j, qi3.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object A(kotlin.coroutines.Continuation r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof fu.c
            if (r0 == 0) goto L13
            r0 = r12
            fu.c r0 = (fu.c) r0
            int r1 = r0.f266753g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f266753g = r1
            goto L18
        L13:
            fu.c r0 = new fu.c
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.f266751e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f266753g
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            java.lang.Object r0 = r0.f266750d
            fu.d r0 = (fu.d) r0
            kotlin.ResultKt.throwOnFailure(r12)
            goto L43
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L35:
            kotlin.ResultKt.throwOnFailure(r12)
            r0.f266750d = r11
            r0.f266753g = r4
            super.A(r0)
            if (r3 != r1) goto L42
            return r1
        L42:
            r0 = r11
        L43:
            pt0.e0 r12 = pt0.f0.f358209b1
            fu.a r1 = r0.f266754o
            oi3.e r1 = r1.f412188j
            if (r1 == 0) goto L54
            int r2 = r1.f345617d
            int r2 = r2 + 3
            java.lang.String r1 = r1.getString(r2)
            goto L55
        L54:
            r1 = 0
        L55:
            fu.a r0 = r0.f266754o
            oi3.e r0 = r0.f412188j
            if (r0 == 0) goto L64
            int r2 = r0.f345617d
            int r2 = r2 + 0
            long r4 = r0.getLong(r2)
            goto L66
        L64:
            r4 = 0
        L66:
            com.tencent.mm.storage.f9 r12 = r12.k(r1, r4)
            if (r12 == 0) goto L92
            java.lang.String r0 = r12.j()
            ot0.q r0 = ot0.q.v(r0)
            if (r0 == 0) goto L92
            java.lang.Class<aa0.e> r1 = aa0.e.class
            i95.m r1 = i95.n0.c(r1)
            aa0.e r1 = (aa0.e) r1
            long r5 = r12.getMsgId()
            long r7 = r12.I0()
            java.lang.String r9 = r12.Q0()
            com.tencent.mm.plugin.msgquote.model.MsgQuoteItem r10 = r0.f348725w2
            r4 = r1
            ri3.e r4 = (ri3.e) r4
            r4.Ui(r5, r7, r9, r10)
        L92:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: fu.d.A(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ru.j, qi3.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object D(yz5.l r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fu.d.D(yz5.l, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
