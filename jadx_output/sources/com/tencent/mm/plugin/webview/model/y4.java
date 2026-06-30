package com.tencent.mm.plugin.webview.model;

/* loaded from: classes8.dex */
public class y4 implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183206a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183207b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.z4 f183208c;

    public y4(java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.webview.model.z4 z4Var) {
        this.f183206a = str;
        this.f183207b = str2;
        this.f183208c = z4Var;
    }

    @Override // p11.h
    public void a(java.lang.String str, android.view.View view) {
    }

    @Override // p11.h
    public void b(java.lang.String str, android.view.View view, q11.b bVar) {
        android.graphics.Bitmap bitmap;
        int i17 = bVar.f359531a;
        com.tencent.mm.plugin.webview.model.z4 z4Var = this.f183208c;
        if (i17 != 0 || bVar.f359534d == null) {
            com.tencent.mm.plugin.webview.model.a5.b(z4Var, false);
            return;
        }
        int g17 = (int) (i65.a.g(com.tencent.mm.sdk.platformtools.x2.f193071a) * 48.0f);
        android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bVar.f359534d, g17, g17, false);
        if (createScaledBitmap != null) {
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Boolean.TRUE);
            arrayList.add(config);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(createScaledBitmap, arrayList.toArray(), "com/tencent/mm/plugin/webview/model/WebViewShortcutManager$1", "onImageLoadFinish", "(Ljava/lang/String;Landroid/view/View;Lcom/tencent/mm/modelimage/loader/model/Response;)V", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
            bitmap = createScaledBitmap.copy((android.graphics.Bitmap.Config) arrayList.get(0), ((java.lang.Boolean) arrayList.get(1)).booleanValue());
            yj0.a.e(createScaledBitmap, bitmap, "com/tencent/mm/plugin/webview/model/WebViewShortcutManager$1", "onImageLoadFinish", "(Ljava/lang/String;Landroid/view/View;Lcom/tencent/mm/modelimage/loader/model/Response;)V", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewShortcutManager", "bitmap recycle %s", createScaledBitmap);
            createScaledBitmap.recycle();
        } else {
            bitmap = null;
        }
        android.content.Intent a17 = com.tencent.mm.plugin.webview.model.a5.a(bitmap, this.f183206a, this.f183207b, true);
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewShortcutManager", "intent is null");
            com.tencent.mm.plugin.webview.model.a5.b(z4Var, false);
        } else {
            com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.webview.model.x4(this, a17), 500L);
            com.tencent.mm.plugin.webview.model.a5.b(z4Var, true);
        }
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
        return null;
    }
}
