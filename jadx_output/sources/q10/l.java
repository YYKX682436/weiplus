package q10;

/* loaded from: classes7.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final q10.l f359523a = new q10.l();

    public final double a(java.lang.String bizName, int i17) {
        kotlin.jvm.internal.o.g(bizName, "bizName");
        java.lang.Integer b17 = b(bizName, 2, "isSupportKeepAlive");
        if (!(b17 != null && b17.intValue() >= 0)) {
            com.tencent.mars.xlog.Log.i("MagicEcsNirvanaCommonUtil", "getFinalAutoDestroyTime, not support keep alive, set autoDestroyTime to 0");
            return 0.0d;
        }
        if (i17 < 0) {
            return 0.0d;
        }
        return i17 == 0 ? 300.0d : i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Integer b(java.lang.String r6, int r7, java.lang.String r8) {
        /*
            r5 = this;
            java.lang.Class<com.tencent.mm.udr.e0> r0 = com.tencent.mm.udr.e0.class
            i95.m r0 = i95.n0.c(r0)
            com.tencent.mm.udr.e0 r0 = (com.tencent.mm.udr.e0) r0
            java.lang.String r1 = "ilinkres_4274070d"
            com.tencent.mm.udr.a1 r0 = (com.tencent.mm.udr.a1) r0
            com.tencent.wechat.aff.udr.x r6 = r0.Ui(r1, r6)
            r0 = 0
            java.lang.String r1 = "MagicEcsNirvanaCommonUtil"
            if (r6 != 0) goto L2a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r8)
            java.lang.String r7 = ", resource is null"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.mars.xlog.Log.w(r1, r6)
            return r0
        L2a:
            java.util.LinkedList r6 = r6.f217606x
            if (r6 == 0) goto L56
            java.util.Iterator r6 = r6.iterator()
        L32:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L4c
            java.lang.Object r2 = r6.next()
            r3 = r2
            com.tencent.wechat.aff.udr.u r3 = (com.tencent.wechat.aff.udr.u) r3
            java.lang.String r3 = r3.getKey()
            java.lang.String r4 = "mbapp_ecs_ext"
            boolean r3 = kotlin.jvm.internal.o.b(r3, r4)
            if (r3 == 0) goto L32
            goto L4d
        L4c:
            r2 = r0
        L4d:
            com.tencent.wechat.aff.udr.u r2 = (com.tencent.wechat.aff.udr.u) r2
            if (r2 == 0) goto L56
            java.lang.String r6 = r2.getValue()
            goto L57
        L56:
            r6 = r0
        L57:
            if (r6 == 0) goto L62
            int r2 = r6.length()
            if (r2 != 0) goto L60
            goto L62
        L60:
            r2 = 0
            goto L63
        L62:
            r2 = 1
        L63:
            if (r2 == 0) goto L7a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r8)
            java.lang.String r7 = ", udr not include feature list info"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.mars.xlog.Log.i(r1, r6)
            return r0
        L7a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            java.lang.String r3 = ", featureListValue: "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            com.tencent.mars.xlog.Log.i(r1, r2)
            d00.b r2 = d00.b.f225252a
            java.util.Map r6 = r2.a(r6)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            java.lang.String r3 = ", pkgFeatureList: "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            com.tencent.mars.xlog.Log.i(r1, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            java.util.LinkedHashMap r6 = (java.util.LinkedHashMap) r6
            java.lang.Object r6 = r6.get(r2)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto Lc0
            java.lang.Integer r0 = r26.h0.h(r6)
        Lc0:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r8)
            java.lang.String r8 = ", featureId: "
            r6.append(r8)
            r6.append(r7)
            java.lang.String r7 = ", version: "
            r6.append(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            com.tencent.mars.xlog.Log.i(r1, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q10.l.b(java.lang.String, int, java.lang.String):java.lang.Integer");
    }
}
