package ka3;

/* loaded from: classes15.dex */
public final class q implements dd1.a {
    @Override // dd1.a
    public void a(org.json.JSONObject params, android.nfc.cardemulation.HostApduService hostService) {
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(hostService, "hostService");
    }

    @Override // dd1.a
    public void b(org.json.JSONObject resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        ka3.m mVar = ka3.u.f306087r;
        com.tencent.mars.xlog.Log.i("LiteAppNFCServiceMgr", "patchRegister resp=" + resp);
    }
}
