package rt;

/* loaded from: classes9.dex */
public final class b extends ru.j {

    /* renamed from: o, reason: collision with root package name */
    public final rt.c f399369o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(rt.c params) {
        super(params);
        kotlin.jvm.internal.o.g(params, "params");
        this.f399369o = params;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ru.j, qi3.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object D(yz5.l r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof rt.a
            if (r0 == 0) goto L13
            r0 = r8
            rt.a r0 = (rt.a) r0
            int r1 = r0.f399368g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f399368g = r1
            goto L18
        L13:
            rt.a r0 = new rt.a
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f399366e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f399368g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r7 = r0.f399365d
            rt.b r7 = (rt.b) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L42
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            kotlin.ResultKt.throwOnFailure(r8)
            r0.f399365d = r6
            r0.f399368g = r3
            java.lang.Object r8 = ru.j.E(r6, r7, r0)
            if (r8 != r1) goto L41
            return r1
        L41:
            r7 = r6
        L42:
            qi3.f0 r8 = (qi3.f0) r8
            pt0.e0 r0 = pt0.f0.f358209b1
            rt.c r1 = r7.f399369o
            oi3.e r1 = r1.f412188j
            if (r1 == 0) goto L55
            int r2 = r1.f345617d
            int r2 = r2 + 3
            java.lang.String r1 = r1.getString(r2)
            goto L56
        L55:
            r1 = 0
        L56:
            rt.c r7 = r7.f399369o
            oi3.e r7 = r7.f412188j
            r2 = 0
            if (r7 == 0) goto L65
            int r3 = r7.f345617d
            int r3 = r3 + r2
            long r3 = r7.getLong(r3)
            goto L67
        L65:
            r3 = 0
        L67:
            com.tencent.mm.storage.f9 r7 = r0.k(r1, r3)
            if (r7 == 0) goto L85
            com.tencent.mm.autogen.events.UpdateForwardMsgIdEvent r0 = new com.tencent.mm.autogen.events.UpdateForwardMsgIdEvent
            r0.<init>()
            java.lang.String r1 = r7.Q0()
            am.xz r3 = r0.f54918g
            r3.f8411c = r1
            long r4 = r7.getMsgId()
            r3.f8409a = r4
            r3.f8410b = r2
            r0.e()
        L85:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: rt.b.D(yz5.l, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
