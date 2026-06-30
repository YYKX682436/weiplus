package i02;

/* loaded from: classes8.dex */
public class d implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i02.h f286507d;

    public d(i02.h hVar) {
        this.f286507d = hVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        boolean z17;
        i02.h hVar = this.f286507d;
        java.util.HashSet hashSet = hVar.f286521h;
        if (hashSet == null || hashSet.size() == 0) {
            android.content.Context context = hVar.f286517d;
            com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKManager.getInstance(context).releaseDownloadSDKClient("WechatDownloadClient");
            com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient tMAssistantDownloadSDKClient = hVar.f286516c;
            if (tMAssistantDownloadSDKClient != null) {
                tMAssistantDownloadSDKClient.unRegisterDownloadTaskListener(hVar.f286527n);
            }
            hVar.f286516c = null;
            com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKManager.closeAllService(context);
            try {
                context.stopService(new android.content.Intent(context, (java.lang.Class<?>) com.tencent.tmassistantsdk.downloadservice.TMAssistantDownloadSDKService.class));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FileDownloaderImplTMAssistant", "Error occurred when stopping TMAssistant Service: " + e17.toString());
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "TMAssistantSDK Client released");
            z17 = true;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "Still have tasks running");
            z17 = false;
        }
        if (!z17) {
            hVar.f286526m.c(240000L, 240000L);
        }
        return true;
    }
}
