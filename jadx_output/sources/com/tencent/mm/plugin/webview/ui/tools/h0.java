package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes.dex */
public class h0 implements kotlin.coroutines.Continuation {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI f184780d;

    public h0(com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI openFileChooserUI) {
        this.f184780d = openFileChooserUI;
    }

    @Override // kotlin.coroutines.Continuation
    public oz5.l getContext() {
        return oz5.m.f350329d;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "optRecord finish");
        boolean z17 = obj instanceof qc0.m1;
        com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI openFileChooserUI = this.f184780d;
        if (z17) {
            final qc0.m1 m1Var = (qc0.m1) obj;
            if (m1Var.f361411b != -1 || m1Var.f361412c != 0) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_pick_local_media_show_memory_warning", openFileChooserUI.f183636s);
                openFileChooserUI.setResult(m1Var.f361411b, intent);
                openFileChooserUI.finish();
                return;
            }
            qc0.l1 a17 = m1Var.a();
            boolean a18 = a17.a();
            final java.lang.String str = a17.f361396b;
            if (a18) {
                final android.content.Intent intent2 = new android.content.Intent();
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.OpenFileChooserUI", "picture_picturePath file is not exist! path:%s", str);
                    intent2.putExtra("key_pick_local_pic_fail_reason", "can't get the image's filePath!");
                    openFileChooserUI.setResult(1, intent2);
                    openFileChooserUI.finish();
                    return;
                }
                com.tencent.mm.vfs.z7 a19 = com.tencent.mm.vfs.z7.a(str);
                java.lang.String str2 = a19.f213279f;
                if (str2 != null) {
                    java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                    if (!str2.equals(l17)) {
                        a19 = new com.tencent.mm.vfs.z7(a19.f213277d, a19.f213278e, l17, a19.f213280g, a19.f213281h);
                    }
                }
                com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a19, null);
                if (m17.a() ? m17.f213266a.F(m17.f213267b) : false) {
                    dw4.a.a(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.webview.ui.tools.h0$$a
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.tencent.mm.plugin.webview.ui.tools.h0 h0Var = com.tencent.mm.plugin.webview.ui.tools.h0.this;
                            h0Var.getClass();
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.lang.String str3 = str;
                            com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem d17 = com.tencent.mm.plugin.webview.model.m4.d(str3);
                            d17.f182748t = true;
                            d17.f182742n = 1;
                            com.tencent.mm.plugin.webview.modeltools.z.Zi().a(d17);
                            arrayList.add(d17.f182736e);
                            com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "filepath is : %s, local id is : %s", str3, d17.f182736e);
                            com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI openFileChooserUI2 = h0Var.f184780d;
                            java.lang.String g17 = com.tencent.mm.sdk.platformtools.t8.D0(openFileChooserUI2.f183633p, com.tencent.mm.plugin.appbrand.jsapi.media.e3.NAME) ? com.tencent.mm.plugin.webview.model.o5.g(arrayList) : com.tencent.mm.plugin.webview.model.o5.h(arrayList);
                            com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "after parse to json data : %s", g17);
                            android.content.Intent intent3 = intent2;
                            intent3.putExtra("key_pick_local_media_local_ids", g17);
                            intent3.putExtra("key_pick_local_media_callback_type", 2);
                            intent3.putExtra("key_pick_local_media_show_memory_warning", openFileChooserUI2.f183636s);
                            intent3.putExtra("key_pick_local_pic_source_type", openFileChooserUI2.f183634q ? "camera" : com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_ALBUM);
                            openFileChooserUI2.setResult(m1Var.f361411b, intent3);
                            openFileChooserUI2.finish();
                        }
                    });
                    return;
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.OpenFileChooserUI", "picture filePath is not nil, but couldn't access the picture! The reason might be no permissions! path:%s", str);
                intent2.putExtra("key_pick_local_pic_fail_reason", "can't have access to the image!");
                openFileChooserUI.setResult(1, intent2);
                openFileChooserUI.finish();
                return;
            }
            openFileChooserUI.f183631n = str;
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "videoFilePath:%s", str);
            if (!openFileChooserUI.c7(openFileChooserUI.f183632o)) {
                java.lang.String str3 = a17.f361397c;
                if (openFileChooserUI.c7(str3)) {
                    openFileChooserUI.f183632o = str3;
                }
            }
            com.tencent.mm.vfs.r6 r6Var = android.text.TextUtils.isEmpty(openFileChooserUI.f183631n) ? null : new com.tencent.mm.vfs.r6(openFileChooserUI.f183631n);
            if (r6Var != null && r6Var.m()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.OpenFileChooserUI", "video file is exist! path:%s", openFileChooserUI.f183631n);
                openFileChooserUI.W6(openFileChooserUI.f183631n);
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenFileChooserUI", "video file is not exist! path:%s", openFileChooserUI.f183631n);
        }
        android.content.Intent intent3 = new android.content.Intent();
        intent3.putExtra("key_pick_local_media_show_memory_warning", openFileChooserUI.f183636s);
        openFileChooserUI.setResult(1, intent3);
        openFileChooserUI.finish();
    }
}
