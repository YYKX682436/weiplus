package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.DownloadProgressImageView.GetDownloadWidgeInfoTask f182176d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.DownloadProgressImageView f182177e;

    public e(com.tencent.mm.plugin.webview.luggage.DownloadProgressImageView downloadProgressImageView, com.tencent.mm.plugin.webview.luggage.DownloadProgressImageView.GetDownloadWidgeInfoTask getDownloadWidgeInfoTask) {
        this.f182177e = downloadProgressImageView;
        this.f182176d = getDownloadWidgeInfoTask;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.luggage.DownloadProgressImageView.GetDownloadWidgeInfoTask getDownloadWidgeInfoTask = this.f182176d;
        getDownloadWidgeInfoTask.x();
        java.util.ArrayList arrayList = getDownloadWidgeInfoTask.f182114f;
        com.tencent.mm.plugin.webview.luggage.DownloadProgressImageView downloadProgressImageView = this.f182177e;
        downloadProgressImageView.f182107h = arrayList;
        com.tencent.mm.plugin.webview.luggage.DownloadProgressImageView.n(downloadProgressImageView);
    }
}
