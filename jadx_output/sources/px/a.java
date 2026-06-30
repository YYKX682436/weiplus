package px;

@j95.b
/* loaded from: classes12.dex */
public final class a extends i95.w implements qx.d0 {
    public java.lang.String Ai(java.lang.String str, java.lang.String str2, long j17) {
        if (!com.tencent.mm.storage.z3.L4(str) || str2 == null || j17 <= 0) {
            return null;
        }
        java.lang.String wi6 = wi(pt0.f0.f358209b1.k(str2, j17));
        if (r26.n0.N(wi6)) {
            return null;
        }
        return wi6;
    }

    public final void Bi(java.lang.String str, java.lang.String text, java.lang.String str2, long j17) {
        java.lang.String r17 = c01.z1.r();
        kotlin.jvm.internal.o.f(r17, "getUsernameFromUserInfo(...)");
        qi3.n nVar = new qi3.n(r17, str == null ? "" : str, str, 0, str2, str + 'T' + j17, null, 72, null);
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        kotlin.jvm.internal.o.g(text, "text");
        java.lang.String str3 = nVar.f363750c;
        if (str3 == null) {
            str3 = nVar.f363749b;
        }
        oi3.g gVar = new oi3.g();
        int i17 = gVar.f345617d;
        gVar.set(i17 + 3, str3);
        long longValue = valueOf != null ? valueOf.longValue() : c01.w9.o(str3);
        int i18 = i17 + 2;
        gVar.set(i18, java.lang.Long.valueOf(longValue - 1));
        gVar.set(i17 + 4, java.lang.Integer.valueOf(c01.e2.C(nVar.f363749b)));
        gVar.set(i17 + 7, 1);
        gVar.set(i17 + 9, 1);
        gVar.set(i17 + 13, text);
        gVar.set(i17 + 12, "");
        long r18 = pt0.f0.f358209b1.r(gVar);
        com.tencent.mm.sdk.platformtools.w2.a(c01.z1.r());
        long j18 = gVar.getLong(i18) / 1000;
        kotlinx.coroutines.l.d(v65.m.f433580a, kotlinx.coroutines.q1.f310568a, null, new qi3.k(nVar, java.lang.Long.valueOf(r18).longValue(), valueOf, text, null), 2, null);
    }

    public boolean Di(java.lang.String str, java.lang.String str2, long j17, java.lang.String str3, long j18) {
        java.lang.String Ai = Ai(str, str2, j17);
        if (Ai == null) {
            return false;
        }
        Bi(str, Ai, str3, j18);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if ((r7 == null || r26.n0.N(r7)) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Ni(java.lang.String r3, java.lang.String r4, long r5, java.lang.String r7) {
        /*
            r2 = this;
            java.lang.String r4 = r2.Ai(r3, r4, r5)
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L11
            boolean r0 = r26.n0.N(r4)
            if (r0 == 0) goto Lf
            goto L11
        Lf:
            r0 = r5
            goto L12
        L11:
            r0 = r6
        L12:
            if (r0 == 0) goto L23
            if (r7 == 0) goto L1f
            boolean r0 = r26.n0.N(r7)
            if (r0 == 0) goto L1d
            goto L1f
        L1d:
            r0 = r5
            goto L20
        L1f:
            r0 = r6
        L20:
            if (r0 != 0) goto L23
            goto L24
        L23:
            r7 = r4
        L24:
            if (r7 == 0) goto L2f
            boolean r4 = r26.n0.N(r7)
            if (r4 == 0) goto L2d
            goto L2f
        L2d:
            r4 = r5
            goto L30
        L2f:
            r4 = r6
        L30:
            if (r4 == 0) goto L33
            return r5
        L33:
            java.lang.Object[] r4 = new java.lang.Object[]{r3}
            java.lang.String r0 = "BypMsgInfoService"
            java.lang.String r1 = "trySendClawTextSummaryForForward: sending text summary to %s"
            com.tencent.mars.xlog.Log.i(r0, r1, r4)
            w11.p1 r4 = w11.p1.f442102d
            w11.r1 r0 = new w11.r1
            r0.<init>()
            r0.g(r3)
            r0.f442137l = r4
            r0.g(r3)
            r0.e(r7)
            r0.f442130e = r6
            r0.f442131f = r5
            r3 = 4
            r0.f442134i = r3
            w11.n1 r3 = r0.a()
            r3.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: px.a.Ni(java.lang.String, java.lang.String, long, java.lang.String):boolean");
    }

    public final java.lang.String wi(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null) {
            return "";
        }
        try {
            oy.j jVar = (oy.j) i95.n0.c(oy.j.class);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            java.lang.String str = (java.lang.String) kz5.n0.Z(((te5.l1) jVar).nj(context, kz5.b0.c(f9Var), null, false, true, true, false, 2));
            return str == null ? "" : str;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("BypMsgInfoService", e17, "generateClawTextSummary(MsgInfo) failed", new java.lang.Object[0]);
            return "";
        }
    }
}
