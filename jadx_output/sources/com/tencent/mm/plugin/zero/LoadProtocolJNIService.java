package com.tencent.mm.plugin.zero;

@j95.b(dependencies = {com.tencent.mm.plugin.zero.LoadNormsgJNIService.class, com.tencent.mm.plugin.zero.r0.class})
/* loaded from: classes12.dex */
public class LoadProtocolJNIService extends i95.w {
    private void retryOnce(java.lang.Runnable runnable) {
        try {
            runnable.run();
        } catch (java.lang.Throwable unused) {
            runnable.run();
        }
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        fp.d0.o("MMProtocalJni");
        retryOnce(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.zero.LoadProtocolJNIService.1
            @Override // java.lang.Runnable
            public void run() {
                com.tencent.mm.protocal.MMProtocalJni.setClientPackVersion(o45.wf.f343029g);
            }
        });
        retryOnce(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.zero.LoadProtocolJNIService.2
            @Override // java.lang.Runnable
            public void run() {
                com.tencent.mm.protocal.MMProtocalJni.setProtocalJniLogLevel(com.tencent.mars.xlog.Log.getLogLevel());
            }
        });
        retryOnce(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.zero.LoadProtocolJNIService.3
            @Override // java.lang.Runnable
            public void run() {
                com.tencent.mm.protocal.MMProtocalJni.setIsLite(false);
            }
        });
    }
}
