package vd2;

/* loaded from: classes7.dex */
public final class o2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vd2.p2 f435833d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435834e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.nw1 f435835f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435836g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(vd2.p2 p2Var, java.lang.String str, r45.nw1 nw1Var, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f435833d = p2Var;
        this.f435834e = str;
        this.f435835f = nw1Var;
        this.f435836g = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vd2.o2(this.f435833d, this.f435834e, this.f435835f, this.f435836g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vd2.o2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        jz5.f0 f0Var = jz5.f0.f302826a;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        vd2.p2 p2Var = this.f435833d;
        java.lang.String str = p2Var.f435851d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start preload key:");
        java.lang.String str2 = this.f435834e;
        sb6.append(str2);
        sb6.append(", liveId:");
        sb6.append(pm0.v.u(this.f435835f.getLong(0)));
        sb6.append(", streamUrl:");
        java.lang.String str3 = this.f435836g;
        sb6.append(str3);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        try {
            java.net.URLConnection openConnection = new java.net.URL(str3).openConnection();
            r4 = openConnection instanceof java.net.HttpURLConnection ? (java.net.HttpURLConnection) openConnection : null;
        } catch (java.lang.Throwable th6) {
            try {
                com.tencent.mars.xlog.Log.printErrStackTrace(p2Var.f435851d, th6, "Preload Exception", new java.lang.Object[0]);
                com.tencent.mars.xlog.Log.i(p2Var.f435851d, "preload disconnect, key:" + str2);
                if (r4 != null) {
                    try {
                        r4.disconnect();
                    } catch (java.lang.Throwable th7) {
                        com.tencent.mars.xlog.Log.printErrStackTrace(p2Var.f435851d, th7, "Disconnect Exception", new java.lang.Object[0]);
                    }
                }
            } catch (java.lang.Throwable th8) {
                com.tencent.mars.xlog.Log.i(p2Var.f435851d, "preload disconnect, key:" + str2);
                if (r4 != null) {
                    try {
                        r4.disconnect();
                    } catch (java.lang.Throwable th9) {
                        com.tencent.mars.xlog.Log.printErrStackTrace(p2Var.f435851d, th9, "Disconnect Exception", new java.lang.Object[0]);
                    }
                }
                p2Var.f435853f.remove(str2);
                throw th8;
            }
        }
        if (r4 == null) {
            com.tencent.mars.xlog.Log.i(p2Var.f435851d, "preload disconnect, key:" + str2);
            p2Var.f435853f.remove(str2);
            return f0Var;
        }
        r4.setRequestMethod("GET");
        r4.setConnectTimeout(3000);
        r4.setReadTimeout(3000);
        int responseCode = r4.getResponseCode();
        com.tencent.mars.xlog.Log.i(p2Var.f435851d, "preload connected, key:" + str2 + ", respCode:" + responseCode);
        if (responseCode == 200) {
            p2Var.f435852e.add(str2);
        }
        com.tencent.mars.xlog.Log.i(p2Var.f435851d, "preload disconnect, key:" + str2);
        try {
            r4.disconnect();
        } catch (java.lang.Throwable th10) {
            com.tencent.mars.xlog.Log.printErrStackTrace(p2Var.f435851d, th10, "Disconnect Exception", new java.lang.Object[0]);
        }
        p2Var.f435853f.remove(str2);
        return f0Var;
    }
}
