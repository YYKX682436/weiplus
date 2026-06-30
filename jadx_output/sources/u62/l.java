package u62;

/* loaded from: classes12.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f424959d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v25.b f424960e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ext.provider.ExtControlProviderSNS f424961f;

    public l(com.tencent.mm.plugin.ext.provider.ExtControlProviderSNS extControlProviderSNS, com.tencent.mm.storage.z3 z3Var, v25.b bVar) {
        this.f424961f = extControlProviderSNS;
        this.f424959d = z3Var;
        this.f424960e = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.events.ExtStartSnsServerAndCallbackOnFpSetSizeEvent extStartSnsServerAndCallbackOnFpSetSizeEvent = new com.tencent.mm.autogen.events.ExtStartSnsServerAndCallbackOnFpSetSizeEvent();
        am.s8 s8Var = extStartSnsServerAndCallbackOnFpSetSizeEvent.f54210g;
        s8Var.f7873a = 1;
        s8Var.f7874b = this.f424959d.d1();
        com.tencent.mm.plugin.ext.provider.ExtControlProviderSNS extControlProviderSNS = this.f424961f;
        s8Var.f7875c = extControlProviderSNS.f99912o;
        s8Var.f7876d = extControlProviderSNS.f99913p;
        s8Var.f7877e = new u62.k(this);
        extStartSnsServerAndCallbackOnFpSetSizeEvent.e();
    }
}
