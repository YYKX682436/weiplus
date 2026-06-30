package mg1;

/* loaded from: classes7.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f326204d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.language.AppBrandOnLanguageChangeIPCMessage f326205e;

    public c(com.tencent.mm.plugin.appbrand.o6 o6Var, com.tencent.mm.plugin.appbrand.language.AppBrandOnLanguageChangeIPCMessage appBrandOnLanguageChangeIPCMessage) {
        this.f326204d = o6Var;
        this.f326205e = appBrandOnLanguageChangeIPCMessage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChangeLanguageEventListenerIPCMessage", "run task and dispatch");
        tj1.n nVar = new tj1.n();
        com.tencent.mm.plugin.appbrand.service.c0 C0 = this.f326204d.C0();
        kotlin.jvm.internal.o.f(C0, "getService(...)");
        java.lang.String language = this.f326205e.f84241f;
        kotlin.jvm.internal.o.g(language, "language");
        java.util.HashMap hashMap = new java.util.HashMap(1);
        hashMap.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, language);
        nVar.t(hashMap);
        nVar.u(C0);
        nVar.m();
    }
}
