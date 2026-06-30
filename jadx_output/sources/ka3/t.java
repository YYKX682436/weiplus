package ka3;

/* loaded from: classes15.dex */
public final class t implements dd1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ka3.u f306085a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ka3.i f306086b;

    public t(ka3.u uVar, ka3.i iVar) {
        this.f306085a = uVar;
        this.f306086b = iVar;
    }

    @Override // dd1.a
    public void a(org.json.JSONObject params, android.nfc.cardemulation.HostApduService hostService) {
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(hostService, "hostService");
    }

    @Override // dd1.a
    public void b(org.json.JSONObject resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        ka3.m mVar = ka3.u.f306087r;
        com.tencent.mars.xlog.Log.i("LiteAppNFCServiceMgr", "unregister onServiceCallback=" + resp);
        if (ka3.b.a(resp)) {
            ka3.u.a(this.f306085a);
        }
        this.f306086b.a(resp);
    }
}
