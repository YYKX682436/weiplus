package s74;

/* loaded from: classes4.dex */
public final class b3 {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.flow.i2 f404218a = kotlinx.coroutines.flow.r2.b(0, 0, null, 7, null);

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlinx.coroutines.flow.k r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            java.lang.String r0 = "collect"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicTemplateEventHelper"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = r8 instanceof s74.a3
            if (r2 == 0) goto L1a
            r2 = r8
            s74.a3 r2 = (s74.a3) r2
            int r3 = r2.f404207f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1a
            int r3 = r3 - r4
            r2.f404207f = r3
            goto L1f
        L1a:
            s74.a3 r2 = new s74.a3
            r2.<init>(r6, r8)
        L1f:
            java.lang.Object r8 = r2.f404205d
            pz5.a r3 = pz5.a.f359186d
            int r4 = r2.f404207f
            r5 = 1
            if (r4 == 0) goto L39
            if (r4 == r5) goto L35
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r7
        L35:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L62
        L39:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r4 = "collect is called, "
            r8.<init>(r4)
            r8.append(r6)
            java.lang.String r8 = r8.toString()
            java.lang.String r4 = "SnsAd.TemplateEventHelper"
            com.tencent.mars.xlog.Log.i(r4, r8)
            kotlinx.coroutines.flow.i2 r8 = r6.f404218a
            r2.f404207f = r5
            kotlinx.coroutines.flow.q2 r8 = (kotlinx.coroutines.flow.q2) r8
            r8.getClass()
            java.lang.Object r7 = kotlinx.coroutines.flow.q2.l(r8, r7, r2)
            if (r7 != r3) goto L62
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        L62:
            jz5.d r7 = new jz5.d
            r7.<init>()
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: s74.b3.a(kotlinx.coroutines.flow.k, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
