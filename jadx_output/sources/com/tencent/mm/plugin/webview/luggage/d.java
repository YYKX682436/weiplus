package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class d implements vz.j1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.DownloadProgressImageView f182162a;

    public d(com.tencent.mm.plugin.webview.luggage.DownloadProgressImageView downloadProgressImageView) {
        this.f182162a = downloadProgressImageView;
    }

    public void a(android.os.Bundle bundle) {
        if (bundle.getBoolean("downloadInWidget")) {
            int i17 = bundle.getInt("event");
            int i18 = bundle.getInt("state");
            java.lang.String string = bundle.getString("appId");
            int i19 = bundle.getInt("progress");
            com.tencent.mm.plugin.webview.luggage.DownloadProgressImageView.DownloadTaskInfo downloadTaskInfo = new com.tencent.mm.plugin.webview.luggage.DownloadProgressImageView.DownloadTaskInfo();
            downloadTaskInfo.f182111d = string;
            downloadTaskInfo.f182112e = i18;
            downloadTaskInfo.f182113f = i19;
            com.tencent.mm.plugin.webview.luggage.DownloadProgressImageView downloadProgressImageView = this.f182162a;
            if (i17 == 1 || i17 == 7) {
                if (downloadProgressImageView.f182107h.contains(downloadTaskInfo)) {
                    com.tencent.mm.plugin.webview.luggage.DownloadProgressImageView.DownloadTaskInfo downloadTaskInfo2 = (com.tencent.mm.plugin.webview.luggage.DownloadProgressImageView.DownloadTaskInfo) downloadProgressImageView.f182107h.get(downloadProgressImageView.f182107h.indexOf(downloadTaskInfo));
                    downloadTaskInfo2.f182112e = i18;
                    downloadTaskInfo2.f182113f = i19;
                } else {
                    downloadProgressImageView.f182107h.add(0, downloadTaskInfo);
                }
            } else if (i17 == 4 || i17 == 9) {
                downloadProgressImageView.f182107h.remove(downloadTaskInfo);
            } else {
                int indexOf = downloadProgressImageView.f182107h.indexOf(downloadTaskInfo);
                if (indexOf != -1) {
                    com.tencent.mm.plugin.webview.luggage.DownloadProgressImageView.DownloadTaskInfo downloadTaskInfo3 = (com.tencent.mm.plugin.webview.luggage.DownloadProgressImageView.DownloadTaskInfo) downloadProgressImageView.f182107h.get(indexOf);
                    downloadTaskInfo3.f182112e = i18;
                    downloadTaskInfo3.f182113f = i19;
                }
            }
            downloadProgressImageView.post(new com.tencent.mm.plugin.webview.luggage.c(this));
        }
    }
}
