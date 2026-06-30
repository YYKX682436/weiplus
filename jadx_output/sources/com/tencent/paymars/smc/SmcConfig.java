package com.tencent.paymars.smc;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0006\u0010\u0005\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\r"}, d2 = {"Lcom/tencent/paymars/smc/SmcConfig;", "", "Ljz5/f0;", "setFreqLimit", "checkConfig", "updateConfig", "", "TAG", "Ljava/lang/String;", "UDR_PROJECT_ID", "UDR_CONFIG_FILE_NAME", "<init>", "()V", "plugin-report_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class SmcConfig {
    public static final com.tencent.paymars.smc.SmcConfig INSTANCE = new com.tencent.paymars.smc.SmcConfig();
    private static final java.lang.String TAG = "MicroMsg.SmcConfig";
    public static final java.lang.String UDR_CONFIG_FILE_NAME = "kv_idkey_config";
    public static final java.lang.String UDR_PROJECT_ID = "ilinkres_6eea8388";

    private SmcConfig() {
    }

    private final void checkConfig() {
        com.tencent.mars.xlog.Log.i(TAG, "smc-config checking");
        com.tencent.wechat.aff.udr.q qVar = new com.tencent.wechat.aff.udr.q();
        qVar.c("ilinkres_6eea8388");
        java.util.LinkedList linkedList = qVar.f217548e;
        if (linkedList != null) {
            linkedList.add("kv_idkey_config");
        }
        ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Di(qVar, new ea5.k() { // from class: com.tencent.paymars.smc.SmcConfig$checkConfig$1
            @Override // ea5.k, com.tencent.wechat.aff.udr.e
            public void onCallBackFailAsync(long j17, int i17, int i18, java.lang.String projectId, java.lang.String name, int i19, com.tencent.wechat.aff.udr.r type) {
                kotlin.jvm.internal.o.g(projectId, "projectId");
                kotlin.jvm.internal.o.g(name, "name");
                kotlin.jvm.internal.o.g(type, "type");
                super.onCallBackFailAsync(j17, i17, i18, projectId, name, i19, type);
                com.tencent.mars.xlog.Log.i("MicroMsg.SmcConfig", "smc-config check fail");
            }

            @Override // ea5.k, com.tencent.wechat.aff.udr.e
            public void onCallBackSuccessAsync(long j17, java.lang.String projectId, java.lang.String name, int i17, com.tencent.wechat.aff.udr.r type) {
                kotlin.jvm.internal.o.g(projectId, "projectId");
                kotlin.jvm.internal.o.g(name, "name");
                kotlin.jvm.internal.o.g(type, "type");
                super.onCallBackSuccessAsync(j17, projectId, name, i17, type);
                com.tencent.mars.xlog.Log.i("MicroMsg.SmcConfig", "smc-config check success");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFreqLimit() {
        java.lang.String path;
        com.tencent.wechat.aff.udr.x Ui = ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Ui("ilinkres_6eea8388", "kv_idkey_config");
        boolean z17 = false;
        if (Ui != null && (path = Ui.getPath()) != null) {
            if (path.length() > 0) {
                z17 = true;
            }
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.i(TAG, "smc-config config is empty. do check.");
            checkConfig();
        } else {
            com.tencent.mars.xlog.Log.i(TAG, "smc-config config: " + Ui.getPath());
            ((com.tencent.paymars.smc.SmcManager) com.tencent.paymars.MarsContext.getContext().getManager(com.tencent.paymars.smc.SmcManager.class)).updateFreqLimitConfig(Ui.getPath());
        }
    }

    public final void updateConfig() {
        com.tencent.mars.xlog.Log.i(TAG, "smc-config process: " + bm5.f1.a());
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            setFreqLimit();
        } else {
            if (!com.tencent.mm.sdk.platformtools.x2.p()) {
                com.tencent.mars.xlog.Log.i(TAG, "smc-config FreqLimit ignore");
                return;
            }
            ((ku5.t0) ku5.t0.f312615d).k(new java.lang.Runnable() { // from class: com.tencent.paymars.smc.SmcConfig$updateConfig$1
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.paymars.smc.SmcConfig.INSTANCE.setFreqLimit();
                }
            }, 5000L);
        }
    }
}
