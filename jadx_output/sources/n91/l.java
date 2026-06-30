package n91;

/* loaded from: classes7.dex */
public class l implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.appbrand.custom_loading.CustomLoadingUpdateRecordIPCData customLoadingUpdateRecordIPCData = (com.tencent.mm.plugin.appbrand.custom_loading.CustomLoadingUpdateRecordIPCData) obj;
        com.tencent.luggage.sdk.processes.s[] j17 = com.tencent.mm.plugin.appbrand.task.u0.C().j(customLoadingUpdateRecordIPCData.f77554e, customLoadingUpdateRecordIPCData.f77555f);
        if (j17.length == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.CustomLoadingManager", "invoke: updateMainProcessRecordTask records is null");
            return;
        }
        if (j17.length > 1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.CustomLoadingManager", "invoke: updateMainProcessRecordTask records length > 1");
            return;
        }
        ((com.tencent.mm.plugin.appbrand.task.o) j17[0]).f89106j = customLoadingUpdateRecordIPCData.f77553d;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.CustomLoadingManager", "update status success. isInFullscreen=" + customLoadingUpdateRecordIPCData.f77553d);
    }
}
