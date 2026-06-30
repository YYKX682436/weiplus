package o54;

/* loaded from: classes4.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final o54.j f343153a = new o54.j(null);

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f343154b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static q64.a f343155c;

    public static final void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createChannel", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy");
        o54.j jVar = f343153a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createChannel", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy$Companion");
        o64.a aVar = new o64.a();
        aVar.d(new o54.h());
        aVar.c(o54.i.f343152d);
        q64.a a17 = aVar.a();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setIpcRequester$cp", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy");
        f343155c = a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setIpcRequester$cp", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getIpcRequester$cp", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy");
        q64.a aVar2 = f343155c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getIpcRequester$cp", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy");
        if (aVar2 != null) {
            ((r64.b) aVar2).c(new android.os.Bundle());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getIpcRequester$cp", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy");
        q64.a aVar3 = f343155c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getIpcRequester$cp", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy");
        if (aVar3 == null) {
            jVar.a();
            com.tencent.mars.xlog.Log.e("AdToolsIPCProxy", "the ipc request object is null, please check the log to find the reason!");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createChannel", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createChannel", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy");
    }

    public static final void b(java.lang.String className, yz5.l processor) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("injectProcessor", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("injectProcessor", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy$Companion");
        kotlin.jvm.internal.o.g(className, "className");
        kotlin.jvm.internal.o.g(processor, "processor");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getProcessors$cp", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy");
        java.util.Map map = f343154b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getProcessors$cp", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy");
        map.put(className, processor);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("injectProcessor", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("injectProcessor", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy");
    }
}
