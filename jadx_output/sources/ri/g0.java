package ri;

/* loaded from: classes12.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ri.g0 f395866a = new ri.g0();

    /* JADX WARN: Removed duplicated region for block: B:9:0x0033 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.lang.String r3) {
        /*
            r2 = this;
            int r0 = r3.hashCode()
            r1 = -2021012075(0xffffffff8789cd95, float:-2.07343E-34)
            if (r0 == r1) goto L28
            r1 = 2035172(0x1f0de4, float:2.851883E-39)
            if (r0 == r1) goto L1d
            r1 = 2217378(0x21d5a2, float:3.107208E-39)
            if (r0 == r1) goto L14
            goto L30
        L14:
            java.lang.String r0 = "HIGH"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L33
            goto L30
        L1d:
            java.lang.String r0 = "BEST"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L26
            goto L30
        L26:
            r3 = 0
            goto L35
        L28:
            java.lang.String r0 = "MIDDLE"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L33
        L30:
            r3 = 20
            goto L35
        L33:
            r3 = 10
        L35:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ri.g0.a(java.lang.String):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0032 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(java.lang.String r3) {
        /*
            r2 = this;
            int r0 = r3.hashCode()
            r1 = -2021012075(0xffffffff8789cd95, float:-2.07343E-34)
            if (r0 == r1) goto L28
            r1 = 2035172(0x1f0de4, float:2.851883E-39)
            if (r0 == r1) goto L1d
            r1 = 2217378(0x21d5a2, float:3.107208E-39)
            if (r0 == r1) goto L14
            goto L30
        L14:
            java.lang.String r0 = "HIGH"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L32
            goto L30
        L1d:
            java.lang.String r0 = "BEST"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L26
            goto L30
        L26:
            r3 = 0
            goto L33
        L28:
            java.lang.String r0 = "MIDDLE"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L32
        L30:
            r3 = 6
            goto L33
        L32:
            r3 = 3
        L33:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ri.g0.b(java.lang.String):int");
    }

    public final boolean c(java.lang.String scene) {
        kotlin.jvm.internal.o.g(scene, "scene");
        return r26.n0.B(scene, "FinderLiveVisitorWithoutAffinityUI", false) || r26.n0.B(scene, "FinderLiveVisitorAffinityUI", false);
    }

    public final void d(java.lang.String scene, org.json.JSONObject content) {
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(content, "content");
        if (c(scene)) {
            long optLong = content.optLong("cost");
            java.lang.String optString = content.optString("stack");
            java.lang.String optString2 = content.optString("stackKey");
            com.tencent.mars.xlog.Log.i("MicroMsg.MatrixFinderReporter", "onEvilMethod stackCost:" + optLong);
            com.tencent.mars.xlog.Log.i("MicroMsg.MatrixFinderReporter", "onEvilMethod stack:" + optString);
            com.tencent.mars.xlog.Log.i("MicroMsg.MatrixFinderReporter", "onEvilMethod stackKey:" + optString2);
            content.remove("cost");
            content.remove("stack");
            content.remove("stackKey");
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            kotlin.jvm.internal.o.d(optString);
            kotlin.jvm.internal.o.d(optString2);
            java.lang.String jSONObject = content.toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            g0Var.d(26388, java.lang.Long.valueOf(optLong), -1, r26.i0.t(r26.i0.t(optString, ",", ";", false), "\n", "|", false), r26.i0.t(r26.i0.t(optString2, ",", ";", false), "\n", "|", false), com.tencent.mm.sdk.platformtools.z.f193109e, com.tencent.mm.app.w.INSTANCE.h(), r26.i0.t(r26.i0.t(jSONObject, ",", ";", false), "\n", "|", false));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(java.lang.String r21, org.json.JSONObject r22) {
        /*
            Method dump skipped, instructions count: 882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ri.g0.e(java.lang.String, org.json.JSONObject):void");
    }
}
