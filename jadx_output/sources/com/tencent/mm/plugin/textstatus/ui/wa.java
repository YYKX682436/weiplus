package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes5.dex */
public final class wa extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f174407d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity f174408e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa(android.graphics.Bitmap bitmap, com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity) {
        super(0);
        this.f174407d = bitmap;
        this.f174408e = textStatusEditActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Bitmap bitmap;
        android.graphics.Bitmap bitmap2 = this.f174407d;
        if (bitmap2 != null) {
            com.tencent.mm.plugin.textstatus.ui.d8 d8Var = com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity.f173566u2;
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity = this.f174408e;
            textStatusEditActivity.q7().setImageBitmap(bitmap2);
            textStatusEditActivity.q7().setVisibility(0);
            android.widget.FrameLayout frameLayout = textStatusEditActivity.C;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            try {
                ib5.k kVar = new ib5.k(textStatusEditActivity);
                android.graphics.Bitmap.Config config = bitmap2.getConfig();
                kotlin.jvm.internal.o.d(config);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Boolean.TRUE);
                arrayList.add(config);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(bitmap2, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/util/UIHelper", "blurBitmap", "(Landroid/graphics/Bitmap;Landroid/content/Context;F)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
                bitmap = bitmap2.copy((android.graphics.Bitmap.Config) arrayList.get(0), ((java.lang.Boolean) arrayList.get(1)).booleanValue());
                yj0.a.e(bitmap2, bitmap, "com/tencent/mm/plugin/textstatus/util/UIHelper", "blurBitmap", "(Landroid/graphics/Bitmap;Landroid/content/Context;F)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
                if (bitmap == null) {
                    bitmap = null;
                } else {
                    kVar.b(bitmap, 10.0f);
                    kVar.destroy();
                }
            } catch (java.lang.Throwable unused) {
                bitmap = bitmap2;
            }
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity.f173569x2 = bitmap;
            textStatusEditActivity.C1 = bitmap2;
            textStatusEditActivity.Q7();
        }
        return jz5.f0.f302826a;
    }
}
