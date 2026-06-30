package com.tencent.mm.plugin.hp.mmdiff;

/* loaded from: classes11.dex */
public class MMDiffPatchResultService extends com.tencent.mm.plugin.hp.mmdiff.AbstractMMdiffResultService {

    /* renamed from: e, reason: collision with root package name */
    public static x73.i f142398e;

    /* renamed from: f, reason: collision with root package name */
    public static x73.i f142399f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f142400d = true;

    public static void b(android.content.Context context, x73.a aVar, boolean z17) {
        try {
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(context, com.tencent.mm.plugin.hp.mmdiff.MMDiffPatchResultService.class);
            intent.putExtra("result_extra", aVar);
            intent.putExtra("needKillProccess", z17);
            context.startService(intent);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("Tinker.MMDiffPatchResultService.HdiffApk", "run result service fail, exception:" + th6);
        }
    }

    @Override // com.tencent.mm.plugin.hp.mmdiff.AbstractMMdiffResultService
    public void a(x73.a aVar) {
        x73.i iVar;
        x73.i iVar2;
        if (aVar == null) {
            com.tencent.mars.xlog.Log.e("Tinker.MMDiffPatchResultService.HdiffApk", "MMDiffPatchResultService received null result!!!!");
            return;
        }
        com.tencent.mars.xlog.Log.i("Tinker.MMDiffPatchResultService.HdiffApk", "MMDiffPatchResultService receive result: %s, needKillProccess = %s", aVar.toString(), java.lang.Boolean.valueOf(this.f142400d));
        com.tencent.mars.xlog.Log.i("Tinker.MMDiffPatchResultService.HdiffApk", "isAuto = %s, autoResultCallBack = %s, maunalResultCallBack = %s.", java.lang.Boolean.valueOf(aVar.f452439f), f142399f, f142398e);
        if (aVar.f452439f && (iVar2 = f142399f) != null) {
            iVar2.a(aVar);
        }
        if (aVar.f452439f || (iVar = f142398e) == null) {
            return;
        }
        iVar.a(aVar);
    }

    @Override // android.app.IntentService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.plugin.hp.mmdiff.AbstractMMdiffResultService, android.app.IntentService
    public void onHandleIntent(android.content.Intent intent) {
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("Tinker.MMDiffPatchResultService.HdiffApk", "AbstractResultService received a null intent, ignoring.");
            return;
        }
        x73.a aVar = (x73.a) ak0.a0.a(intent, "result_extra");
        this.f142400d = intent.getBooleanExtra("needKillProccess", true);
        a(aVar);
    }
}
