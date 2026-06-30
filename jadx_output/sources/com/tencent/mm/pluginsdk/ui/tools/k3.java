package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes5.dex */
public final class k3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.f4 f191744d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f191745e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f191746f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f191747g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI f191748h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(com.tencent.mm.ui.widget.dialog.f4 f4Var, java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI fileSelectorUI) {
        super(0);
        this.f191744d = f4Var;
        this.f191745e = str;
        this.f191746f = str2;
        this.f191747g = str3;
        this.f191748h = fileSelectorUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.widget.dialog.f4 f4Var = this.f191744d;
        if (f4Var != null) {
            f4Var.dismiss();
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, this.f191745e);
        intent.putExtra("fileExt", this.f191746f);
        intent.putExtra(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME, this.f191747g);
        com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI fileSelectorUI = this.f191748h;
        fileSelectorUI.setResult(-1, intent);
        fileSelectorUI.finish();
        return jz5.f0.f302826a;
    }
}
