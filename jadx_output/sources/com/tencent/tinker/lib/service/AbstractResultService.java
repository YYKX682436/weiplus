package com.tencent.tinker.lib.service;

/* loaded from: classes11.dex */
public abstract class AbstractResultService extends android.app.IntentService {
    public AbstractResultService() {
        super("TinkerResultService");
    }

    public static void b(android.content.Context context, com.tencent.tinker.lib.service.PatchResult patchResult, java.lang.String str) {
        if (str == null) {
            throw new com.tencent.tinker.loader.TinkerRuntimeException("resultServiceClass is null.");
        }
        try {
            android.content.Intent intent = new android.content.Intent();
            intent.setClassName(context, str);
            intent.putExtra("result_extra", patchResult);
            context.startService(intent);
        } catch (java.lang.Throwable th6) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.e("Tinker.AbstractResultService", "run result service fail, exception:" + th6, new java.lang.Object[0]);
        }
    }

    public abstract void a(com.tencent.tinker.lib.service.PatchResult patchResult);

    @Override // android.app.IntentService
    public void onHandleIntent(android.content.Intent intent) {
        if (intent == null) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.e("Tinker.AbstractResultService", "AbstractResultService received a null intent, ignoring.", new java.lang.Object[0]);
        } else {
            a((com.tencent.tinker.lib.service.PatchResult) com.tencent.tinker.loader.shareutil.ShareIntentUtil.getSerializableExtra(intent, "result_extra"));
        }
    }
}
