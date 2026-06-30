package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f186720d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f186721e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI f186722f;

    public o0(com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI openFileChooserUI, android.content.Intent intent, int i17) {
        this.f186722f = openFileChooserUI;
        this.f186720d = intent;
        this.f186721e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Intent intent = this.f186720d;
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("CropImage_OutputPath_List");
        boolean booleanExtra = intent.getBooleanExtra("isTakePhoto", false);
        boolean booleanExtra2 = intent.getBooleanExtra("CropImage_Compress_Img", true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : stringArrayListExtra) {
            com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem d17 = com.tencent.mm.plugin.webview.model.m4.d(str);
            java.lang.String str2 = d17.f182736e;
            d17.f182748t = booleanExtra2;
            com.tencent.mm.plugin.webview.modeltools.z.Zi().a(d17);
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "now filepath is : %s, local id is : %s", str, str2);
            arrayList.add(str2);
        }
        java.lang.String g17 = com.tencent.mm.plugin.webview.model.o5.g(arrayList);
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "after parse to json data : %s", g17);
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("key_pick_local_pic_callback_local_ids", g17);
        intent2.putExtra("key_pick_local_pic_source_type", booleanExtra ? "camera" : com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_ALBUM);
        com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI openFileChooserUI = this.f186722f;
        intent2.putExtra("key_pick_local_media_show_memory_warning", openFileChooserUI.f183636s);
        openFileChooserUI.setResult(this.f186721e, intent2);
        openFileChooserUI.finish();
    }
}
