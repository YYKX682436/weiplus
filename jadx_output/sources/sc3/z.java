package sc3;

/* loaded from: classes7.dex */
public final class z implements com.tencent.mm.wemedia.WeMediaCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f406553a;

    public z(sc3.k1 k1Var) {
        this.f406553a = k1Var;
    }

    @Override // com.tencent.mm.wemedia.WeMediaCallback
    public java.lang.String getAbTest(java.lang.String str) {
        java.lang.String a17 = j62.e.g().a(str, "", true, true);
        kotlin.jvm.internal.o.f(a17, "getMulitExpt(...)");
        return a17;
    }

    @Override // com.tencent.mm.wemedia.WeMediaCallback
    public java.lang.String getAbsolutePath(java.lang.String str) {
        java.lang.String str2;
        sc3.k1 k1Var = this.f406553a;
        com.tencent.mars.xlog.Log.i(k1Var.Q, "wemedia: getFilePath " + str);
        if ((str == null || str.length() == 0) || r26.i0.y(str, "http://", false) || r26.i0.y(str, "https://", false)) {
            return str;
        }
        if (r26.i0.y(str, "wxfile://", false)) {
            jc3.x xVar = k1Var.f406486r;
            if (xVar == null) {
                kotlin.jvm.internal.o.o("pkgManagement");
                throw null;
            }
            com.tencent.mm.vfs.r6 absoluteFile = xVar.b().getAbsoluteFile(str);
            if (absoluteFile != null && absoluteFile.m()) {
                java.lang.String o17 = absoluteFile.o();
                com.tencent.mars.xlog.Log.i(k1Var.Q, "wemedia: getFilePath ret = " + o17);
                return o17;
            }
        }
        bf3.g0 g0Var = bf3.g0.f19627a;
        jc3.x xVar2 = k1Var.f406486r;
        if (xVar2 == null) {
            kotlin.jvm.internal.o.o("pkgManagement");
            throw null;
        }
        java.nio.ByteBuffer c17 = g0Var.c(xVar2, str);
        if (c17 != null && c17.capacity() > 0) {
            jc3.x xVar3 = k1Var.f406486r;
            if (xVar3 == null) {
                kotlin.jvm.internal.o.o("pkgManagement");
                throw null;
            }
            com.tencent.mm.plugin.appbrand.appstorage.u1 b17 = xVar3.b();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(k1Var.Q);
            sb6.append("_wemedia_getAbsolutePath_");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(android.os.SystemClock.elapsedRealtime());
            com.tencent.mm.vfs.r6 allocTempFile = b17.allocTempFile(sb6.toString());
            if (allocTempFile != null) {
                byte[] bArr = new byte[c17.remaining()];
                c17.get(bArr);
                com.tencent.mm.vfs.s6.c(allocTempFile, bArr);
                str2 = allocTempFile.o();
                com.tencent.mars.xlog.Log.i(k1Var.Q, "wemedia: getFilePath ret, before " + str + " after " + str2);
                return str2;
            }
        }
        str2 = str;
        com.tencent.mars.xlog.Log.i(k1Var.Q, "wemedia: getFilePath ret, before " + str + " after " + str2);
        return str2;
    }

    @Override // com.tencent.mm.wemedia.WeMediaCallback
    public boolean getExternalConfig(java.lang.String str, boolean z17) {
        return j62.e.g().l(str, z17, true, true);
    }

    @Override // com.tencent.mm.wemedia.WeMediaCallback
    public void reportEvent(java.lang.String event, java.lang.String reportInfo, java.lang.String extJson) {
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(reportInfo, "reportInfo");
        kotlin.jvm.internal.o.g(extJson, "extJson");
        mq0.s0 s0Var = (mq0.s0) ((mq0.d0) i95.n0.c(mq0.d0.class));
        s0Var.getClass();
        if (reportInfo.length() == 0) {
            return;
        }
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
        org.json.JSONObject jSONObject = new org.json.JSONObject(reportInfo);
        java.lang.String optString = jSONObject.optString("bizName");
        h0Var.f310123d = optString;
        if (s0Var.f330616e.contains(optString)) {
            h0Var2.f310123d = jSONObject.optString("frameSetName");
            ym5.a1.f(new mq0.p0(event, h0Var, h0Var2, extJson));
        }
    }
}
