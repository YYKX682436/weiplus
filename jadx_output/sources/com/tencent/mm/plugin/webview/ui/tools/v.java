package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186951d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f186952e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f186953f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI f186954g;

    public v(com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI openFileChooserUI, java.lang.String str, android.content.Intent intent, int i17) {
        this.f186954g = openFileChooserUI;
        this.f186951d = str;
        this.f186952e = intent;
        this.f186953f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String str = this.f186951d;
        com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem d17 = com.tencent.mm.plugin.webview.model.m4.d(str);
        d17.f182748t = true;
        d17.f182742n = 1;
        com.tencent.mm.plugin.webview.modeltools.z.Zi().a(d17);
        arrayList.add(d17.f182736e);
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "filepath is : %s, local id is : %s", str, d17.f182736e);
        com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI openFileChooserUI = this.f186954g;
        java.lang.String g17 = com.tencent.mm.sdk.platformtools.t8.D0(openFileChooserUI.f183633p, com.tencent.mm.plugin.appbrand.jsapi.media.e3.NAME) ? com.tencent.mm.plugin.webview.model.o5.g(arrayList) : com.tencent.mm.plugin.webview.model.o5.h(arrayList);
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "after parse to json data : %s", g17);
        android.content.Intent intent = this.f186952e;
        intent.putExtra("key_pick_local_media_local_ids", g17);
        intent.putExtra("key_pick_local_media_callback_type", 2);
        intent.putExtra("key_pick_local_media_show_memory_warning", openFileChooserUI.f183636s);
        intent.putExtra("key_pick_local_pic_source_type", openFileChooserUI.f183634q ? "camera" : com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_ALBUM);
        openFileChooserUI.setResult(this.f186953f, intent);
        openFileChooserUI.finish();
    }
}
