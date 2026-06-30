package com.tencent.mm.plugin.webview.stub;

/* loaded from: classes.dex */
public class k0 implements com.tencent.mm.plugin.downloader.model.g1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.stub.WebViewStubService f183540d;

    public k0(com.tencent.mm.plugin.webview.stub.WebViewStubService webViewStubService) {
        this.f183540d = webViewStubService;
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void b(long j17, int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskFailed, downloadId = " + j17);
        try {
            java.lang.String a17 = com.tencent.mm.plugin.webview.model.s3.f183104a.a(j17);
            if (a17 != null) {
                ((ee0.c) ((fe0.k3) i95.n0.c(fe0.k3.class))).getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportAddDownloadTaskStraightFail", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
                l44.z.b(4001006, a17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportAddDownloadTaskStraightFail", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
            }
            java.util.Iterator it = ((java.util.ArrayList) this.f183540d.f183486i).iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper webViewStubCallbackWrapper = (com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper) it.next();
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putLong("download_manager_downloadid", j17);
                ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
                h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
                bundle.putCharSequence("download_manager_appid", c17 != null ? c17.field_appId : "");
                bundle.putInt("download_manager_errcode", i17);
                webViewStubCallbackWrapper.f183795d.callback(1003, bundle);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskFailed, ex = " + e17.getMessage());
        }
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void c(long j17, java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskFinished, downloadId = " + j17);
        try {
            ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
            h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
            com.tencent.mm.plugin.webview.model.s3.f183104a.c(j17, c17.field_autoInstall);
            java.util.Iterator it = ((java.util.ArrayList) this.f183540d.f183486i).iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper webViewStubCallbackWrapper = (com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper) it.next();
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putLong("download_manager_downloadid", j17);
                bundle.putCharSequence("download_manager_appid", c17.field_appId);
                webViewStubCallbackWrapper.f183795d.callback(1002, bundle);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskFinished, ex = " + e17.getMessage());
        }
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void f(long j17) {
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void h(long j17, java.lang.String str, long j18, long j19) {
        try {
            java.util.Iterator it = ((java.util.ArrayList) this.f183540d.f183486i).iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper webViewStubCallbackWrapper = (com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper) it.next();
                ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
                h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
                if (c17 != null) {
                    long j27 = c17.field_totalSize;
                    if (j27 != 0) {
                        long j28 = c17.field_downloadedSize;
                        int i17 = (int) ((j28 / j27) * 100.0d);
                        float f17 = (((float) j28) * 100.0f) / ((float) j27);
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putLong("download_manager_downloadid", j17);
                        bundle.putInt("download_manager_progress", i17);
                        bundle.putFloat("download_manager_progress_float", f17);
                        bundle.putString("download_manager_appid", c17.field_appId);
                        webViewStubCallbackWrapper.f183795d.callback(1007, bundle);
                    }
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.WebViewUI.IFileDownloadCallback", "loadDownloadProgress failed, downloadId = " + j17);
                return;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskProgressChanged, ex = " + e17.getMessage());
        }
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void i(long j17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskResumed, downloadId = " + j17);
        try {
            java.lang.String a17 = com.tencent.mm.plugin.webview.model.s3.f183104a.a(j17);
            if (a17 != null) {
                ((ee0.c) ((fe0.k3) i95.n0.c(fe0.k3.class))).getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportAddDownloadTaskStraightResume", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
                l44.z.b(4001005, a17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportAddDownloadTaskStraightResume", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
            }
            java.util.Iterator it = ((java.util.ArrayList) this.f183540d.f183486i).iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper webViewStubCallbackWrapper = (com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper) it.next();
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putLong("download_manager_downloadid", j17);
                ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
                h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
                bundle.putCharSequence("download_manager_appid", c17 != null ? c17.field_appId : "");
                webViewStubCallbackWrapper.f183795d.callback(1011, bundle);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskRemoved, ex = " + e17.getMessage());
        }
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void k(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskPaused, downloadId = " + j17);
        try {
            java.lang.String a17 = com.tencent.mm.plugin.webview.model.s3.f183104a.a(j17);
            if (a17 != null) {
                ((ee0.c) ((fe0.k3) i95.n0.c(fe0.k3.class))).getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportAddDownloadTaskStraightPause", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
                l44.z.b(4001004, a17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportAddDownloadTaskStraightPause", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
            }
            java.util.Iterator it = ((java.util.ArrayList) this.f183540d.f183486i).iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper webViewStubCallbackWrapper = (com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper) it.next();
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putLong("download_manager_downloadid", j17);
                ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
                h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
                bundle.putCharSequence("download_manager_appid", c17 != null ? c17.field_appId : "");
                webViewStubCallbackWrapper.f183795d.callback(1010, bundle);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskRemoved, ex = " + e17.getMessage());
        }
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void l(long j17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskResumed, downloadId = " + j17);
        try {
            java.util.Iterator it = ((java.util.ArrayList) this.f183540d.f183486i).iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper webViewStubCallbackWrapper = (com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper) it.next();
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putLong("download_manager_downloadid", j17);
                ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
                h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
                bundle.putCharSequence("download_manager_appid", c17 != null ? c17.field_appId : "");
                webViewStubCallbackWrapper.f183795d.callback(1012, bundle);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskRemoved, ex = " + e17.getMessage());
        }
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void m(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskRemoved, downloadId = " + j17);
        try {
            java.util.Iterator it = ((java.util.ArrayList) this.f183540d.f183486i).iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper webViewStubCallbackWrapper = (com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper) it.next();
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putLong("download_manager_downloadid", j17);
                ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
                h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
                bundle.putCharSequence("download_manager_appid", c17 != null ? c17.field_appId : "");
                webViewStubCallbackWrapper.f183795d.callback(1008, bundle);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskRemoved, ex = " + e17.getMessage());
        }
    }
}
