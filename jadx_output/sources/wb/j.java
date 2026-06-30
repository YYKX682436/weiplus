package wb;

/* loaded from: classes11.dex */
public final class j extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wb.i f444347a;

    public j(wb.i iVar) {
        this.f444347a = iVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        int i17 = message.what;
        wb.i iVar = this.f444347a;
        if (i17 == 100) {
            int i18 = message.getData().getInt(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE);
            ((y62.e) iVar.f444345a).getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.ext.ExtControlProviderVoiceControl", "localVoiceControl onGetError:%s", java.lang.Integer.valueOf(i18));
            return;
        }
        if (i17 != 200) {
            return;
        }
        wb.a aVar = (wb.a) message.obj;
        y62.e eVar = (y62.e) iVar.f444345a;
        eVar.getClass();
        if (aVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ext.ExtControlProviderVoiceControl", "localVoiceControl onGetResult restult is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.ext.voicecontrol.ExtControlProviderVoiceControl extControlProviderVoiceControl = eVar.f459634a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ext.ExtControlProviderVoiceControl", "localVoiceControl use time2:%s,text: %s,name: %s", java.lang.Long.valueOf(currentTimeMillis - extControlProviderVoiceControl.f99928w), aVar.f444327a, aVar.f444328b);
        if (com.tencent.mm.sdk.platformtools.t8.K0(aVar.f444328b)) {
            return;
        }
        extControlProviderVoiceControl.f99929x = true;
        extControlProviderVoiceControl.o(aVar.f444328b);
    }
}
