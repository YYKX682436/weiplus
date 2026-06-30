package k64;

/* loaded from: classes4.dex */
public final class k implements p64.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f304598d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.js5 f304599e;

    public k(yz5.l lVar, r45.js5 js5Var) {
        this.f304598d = lVar;
        this.f304599e = js5Var;
    }

    @Override // p64.a
    public final void onCallbackFromServer(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallbackFromServer", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiRequestHelper$requestCgi$builder$1");
        yz5.l lVar = this.f304598d;
        r45.js5 js5Var = this.f304599e;
        if (bundle == null) {
            lVar.invoke(new k64.b(-1, -1, "no response!", js5Var));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallbackFromServer", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiRequestHelper$requestCgi$builder$1");
            return;
        }
        byte[] byteArray = bundle.getByteArray("resp_pb_bytes");
        if (byteArray != null) {
            try {
                js5Var.parseFrom(byteArray);
            } catch (java.lang.Throwable unused) {
            }
        }
        int i17 = bundle.getInt("resp_error_type", -1);
        int i18 = bundle.getInt("resp_error_code", -1);
        java.lang.String string = bundle.getString("resp_error_msg", "");
        kotlin.jvm.internal.o.d(string);
        lVar.invoke(new k64.b(i17, i18, string, js5Var));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallbackFromServer", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiRequestHelper$requestCgi$builder$1");
    }
}
