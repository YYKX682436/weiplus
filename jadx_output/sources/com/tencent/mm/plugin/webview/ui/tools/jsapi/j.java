package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.jsapi.j f185203a = new com.tencent.mm.plugin.webview.ui.tools.jsapi.j();

    public final void a(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 msgHandler, int i17, boolean z17, boolean z18, int i18, boolean z19) {
        int i19 = i18;
        kotlin.jvm.internal.o.g(msgHandler, "msgHandler");
        android.content.Intent type = z17 ? new android.content.Intent().setType("video/*") : new android.content.Intent().setType("image/*");
        kotlin.jvm.internal.o.d(type);
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            type.setAction("android.provider.action.PICK_IMAGES");
            if (i19 > 1) {
                int pickImagesMaxLimit = android.provider.MediaStore.getPickImagesMaxLimit();
                java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = pu5.f.f358470a;
                if (i19 < 1) {
                    i19 = 1;
                } else if (i19 > pickImagesMaxLimit) {
                    i19 = pickImagesMaxLimit;
                }
                type.putExtra("android.provider.extra.PICK_IMAGES_MAX", i19);
            }
            type.putExtra("android.intent.extra.LOCAL_ONLY", true);
        } else {
            type.setAction("android.intent.action.GET_CONTENT");
            type.addCategory("android.intent.category.OPENABLE");
            type.putExtra("android.intent.extra.ALLOW_MULTIPLE", i19 > 1);
        }
        android.app.Activity a17 = q75.a.a(msgHandler.f184975d);
        com.tencent.mm.plugin.webview.ui.tools.jsapi.d dVar = new com.tencent.mm.plugin.webview.ui.tools.jsapi.d(z17, msgHandler, i17, z18);
        if (a17 instanceof com.tencent.mm.ui.MMActivity) {
            ((com.tencent.mm.ui.MMActivity) a17).mmSetOnActivityResultCallback(dVar);
        } else {
            if (!(a17 instanceof com.tencent.mm.ui.MMFragmentActivity)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebView.ChooseMediaFromSystemHelper", "chooseFromCamera activity(" + a17 + ") invalid");
                msgHandler.mmOnActivityResult(i17, 1, new android.content.Intent());
                return;
            }
            ((com.tencent.mm.ui.MMFragmentActivity) a17).setMMOnFragmentActivityResult(new com.tencent.mm.plugin.webview.ui.tools.jsapi.a(dVar));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(219);
        arrayList.add(type);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(a17, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/jsapi/ChooseMediaFromSystemHelper", "chooseFromAlbum", "(Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/MsgHandler;IZZIZ)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public final void b(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 msgHandler, int i17, boolean z17, boolean z18, boolean z19) {
        com.tencent.mm.vfs.r6 c17;
        android.net.Uri b17;
        android.content.Intent addFlags;
        kotlin.jvm.internal.o.g(msgHandler, "msgHandler");
        if (z17) {
            c17 = c("capture_video");
            b17 = com.tencent.mm.sdk.platformtools.i1.b(com.tencent.mm.sdk.platformtools.x2.f193071a, c17);
            kotlin.jvm.internal.o.f(b17, "getUriForFile(...)");
            addFlags = new android.content.Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", b17).addFlags(2);
            kotlin.jvm.internal.o.d(addFlags);
        } else {
            c17 = c("capture_image");
            b17 = com.tencent.mm.sdk.platformtools.i1.b(com.tencent.mm.sdk.platformtools.x2.f193071a, c17);
            kotlin.jvm.internal.o.f(b17, "getUriForFile(...)");
            addFlags = new android.content.Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", b17).addFlags(2);
            kotlin.jvm.internal.o.d(addFlags);
        }
        android.content.Intent intent = addFlags;
        android.app.Activity a17 = q75.a.a(msgHandler.f184975d);
        com.tencent.mm.plugin.webview.ui.tools.jsapi.i iVar = new com.tencent.mm.plugin.webview.ui.tools.jsapi.i(b17, msgHandler, i17, c17, z17, z19, z18);
        if (a17 instanceof com.tencent.mm.ui.MMActivity) {
            ((com.tencent.mm.ui.MMActivity) a17).mmSetOnActivityResultCallback(iVar);
        } else {
            if (!(a17 instanceof com.tencent.mm.ui.MMFragmentActivity)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebView.ChooseMediaFromSystemHelper", "chooseFromCamera activity(" + a17 + ") invalid");
                msgHandler.mmOnActivityResult(i17, 1, new android.content.Intent());
                return;
            }
            ((com.tencent.mm.ui.MMFragmentActivity) a17).setMMOnFragmentActivityResult(new com.tencent.mm.plugin.webview.ui.tools.jsapi.e(iVar));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(219);
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(a17, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/jsapi/ChooseMediaFromSystemHelper", "chooseFromCamera", "(Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/MsgHandler;IZZZ)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public final com.tencent.mm.vfs.r6 c(java.lang.String str) {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a("wcf://temp/wv_choose_media"));
        r6Var.J();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append('_');
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(java.lang.System.currentTimeMillis());
        com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(r6Var, sb6.toString());
        r6Var2.k();
        return r6Var2;
    }
}
