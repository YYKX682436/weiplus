package r44;

/* loaded from: classes4.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC f369550d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC improveDataUIC) {
        super(1);
        this.f369550d = improveDataUIC;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0084 A[EDGE_INSN: B:23:0x0084->B:24:0x0084 BREAK  A[LOOP:2: B:12:0x0059->B:31:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[LOOP:2: B:12:0x0059->B:31:?, LOOP_END, SYNTHETIC] */
    @Override // yz5.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.String r0 = "invoke"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC$adConsecutiveCheck$1"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.util.List r13 = (java.util.List) r13
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "list"
            kotlin.jvm.internal.o.g(r13, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kz5.d0.q(r13, r3)
            r2.<init>(r3)
            java.util.Iterator r13 = r13.iterator()
        L22:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto L36
            java.lang.Object r3 = r13.next()
            zc4.b r3 = (zc4.b) r3
            xc4.p r3 = r3.n()
            r2.add(r3)
            goto L22
        L36:
            java.util.List r13 = kz5.n0.V0(r2)
            java.util.List r2 = l44.o4.i(r13)
            if (r2 == 0) goto La3
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.util.Iterator r2 = r2.iterator()
        L46:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto La3
            java.lang.Object r3 = r2.next()
            java.lang.Long r3 = (java.lang.Long) r3
            r4 = r13
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.util.Iterator r4 = r4.iterator()
        L59:
            boolean r5 = r4.hasNext()
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L83
            java.lang.Object r5 = r4.next()
            r8 = r5
            xc4.p r8 = (xc4.p) r8
            boolean r9 = r8.isAd()
            if (r9 == 0) goto L7f
            long r8 = r8.y0()
            if (r3 != 0) goto L75
            goto L7f
        L75:
            long r10 = r3.longValue()
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L7f
            r8 = r6
            goto L80
        L7f:
            r8 = r7
        L80:
            if (r8 == 0) goto L59
            goto L84
        L83:
            r5 = 0
        L84:
            xc4.p r5 = (xc4.p) r5
            if (r5 == 0) goto L46
            xc4.p r3 = new xc4.p
            r3.<init>()
            android.content.ContentValues r4 = r5.t0()
            r3.convertFrom(r4, r7)
            com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC r4 = r12.f369550d
            com.tencent.mm.plugin.mvvmlist.MvvmList r4 = r4.S6()
            zc4.b r5 = new zc4.b
            r5.<init>(r3, r6)
            r4.u(r5)
            goto L46
        La3:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            jz5.f0 r13 = jz5.f0.f302826a
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: r44.a.invoke(java.lang.Object):java.lang.Object");
    }
}
