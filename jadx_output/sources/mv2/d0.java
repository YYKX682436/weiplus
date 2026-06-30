package mv2;

/* loaded from: classes.dex */
public final class d0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f331557a;

    public d0(yz5.l lVar) {
        this.f331557a = lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006e, code lost:
    
        if (r11.getInteger(12) == 1) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
    @Override // gm5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object call(java.lang.Object r11) {
        /*
            r10 = this;
            com.tencent.mm.modelbase.f r11 = (com.tencent.mm.modelbase.f) r11
            int r0 = r11.f70615a
            java.lang.String r1 = "LogPost.FinderPostManager"
            r2 = 0
            if (r0 != 0) goto L21
            int r0 = r11.f70616b
            if (r0 != 0) goto L21
            com.tencent.mm.protobuf.f r11 = r11.f70618d
            r45.du2 r11 = (r45.du2) r11
            if (r11 == 0) goto L53
            r0 = 2
            java.util.LinkedList r11 = r11.getList(r0)
            if (r11 == 0) goto L53
            java.lang.Object r11 = kz5.n0.Z(r11)
            r45.e21 r11 = (r45.e21) r11
            goto L54
        L21:
            com.tencent.mm.plugin.report.service.g0 r3 = com.tencent.mm.plugin.report.service.g0.INSTANCE
            r4 = 1253(0x4e5, double:6.19E-321)
            r6 = 71
            r8 = 1
            r3.C(r4, r6, r8)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "errorType = "
            r0.<init>(r3)
            int r3 = r11.f70615a
            r0.append(r3)
            java.lang.String r3 = " errorCode = "
            r0.append(r3)
            int r3 = r11.f70616b
            r0.append(r3)
            java.lang.String r3 = "  errorMsg = "
            r0.append(r3)
            java.lang.String r11 = r11.f70617c
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            com.tencent.mars.xlog.Log.i(r1, r11)
        L53:
            r11 = r2
        L54:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "eventInfo = "
            r0.<init>(r3)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r1, r0)
            if (r11 == 0) goto L71
            r0 = 12
            int r0 = r11.getInteger(r0)
            r1 = 1
            if (r0 != r1) goto L71
            goto L72
        L71:
            r1 = 0
        L72:
            yz5.l r0 = r10.f331557a
            if (r1 == 0) goto L85
            com.tencent.mm.plugin.report.service.g0 r3 = com.tencent.mm.plugin.report.service.g0.INSTANCE
            r4 = 1253(0x4e5, double:6.19E-321)
            r6 = 72
            r8 = 1
            r3.C(r4, r6, r8)
            r0.invoke(r2)
            goto L88
        L85:
            r0.invoke(r11)
        L88:
            jz5.f0 r11 = jz5.f0.f302826a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: mv2.d0.call(java.lang.Object):java.lang.Object");
    }
}
