package gb4;

/* loaded from: classes4.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f270060d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f270061e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f270062f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment f270063g;

    public h(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment contentFragment, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f270063g = contentFragment;
        this.f270060d = str;
        this.f270061e = str2;
        this.f270062f = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap bitmap;
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment contentFragment = this.f270063g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$3");
        java.lang.String str = this.f270060d;
        com.tencent.mars.xlog.Log.i("ContentFragment", "download bg ok path %s ", str);
        try {
            int i17 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment.P;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            za4.g0 g0Var = contentFragment.B;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            boolean z17 = g0Var.f471082b;
            android.graphics.Bitmap bitmap2 = null;
            if (z17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBlurHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                com.tencent.mm.sdk.platformtools.u3.i(new gb4.m(contentFragment), 1000L);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBlurHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                java.lang.String l17 = za4.t0.l(this.f270061e, this.f270062f + "_blurimg");
                if (com.tencent.mm.vfs.w6.j(l17)) {
                    bitmap2 = com.tencent.mm.sdk.platformtools.x.J(l17, null);
                } else {
                    android.graphics.Bitmap J2 = com.tencent.mm.sdk.platformtools.x.J(str, null);
                    if (J2 != null) {
                        float max = (J2.getHeight() < com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment.n0(contentFragment) || J2.getWidth() < com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment.j0(contentFragment)) ? java.lang.Math.max((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment.j0(contentFragment) * 1.0f) / J2.getWidth(), (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment.n0(contentFragment) * 1.0f) / J2.getHeight()) : 1.0f;
                        android.graphics.Bitmap z07 = com.tencent.mm.sdk.platformtools.x.z0(J2, 0.0f, max, max);
                        int width = (z07.getWidth() - com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment.j0(contentFragment)) >>> 1;
                        int height = (z07.getHeight() - com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment.n0(contentFragment)) >>> 1;
                        try {
                            int j07 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment.j0(contentFragment);
                            int n07 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment.n0(contentFragment);
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                            arrayList.add(java.lang.Integer.valueOf(n07));
                            arrayList.add(java.lang.Integer.valueOf(j07));
                            arrayList.add(java.lang.Integer.valueOf(height));
                            arrayList.add(java.lang.Integer.valueOf(width));
                            arrayList.add(z07);
                            java.lang.Object obj = new java.lang.Object();
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/verticalviewpager/adapter/ContentFragment$3", "run", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
                            bitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), ((java.lang.Integer) arrayList.get(3)).intValue(), ((java.lang.Integer) arrayList.get(4)).intValue());
                            yj0.a.e(obj, bitmap, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/verticalviewpager/adapter/ContentFragment$3", "run", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
                        } catch (java.lang.OutOfMemoryError e17) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("ContentFragment", e17, "", new java.lang.Object[0]);
                            bitmap = null;
                        }
                        com.tencent.mm.memory.r a17 = bitmap != null ? ha4.a.a(bitmap, l17, android.graphics.Color.argb(140, 0, 0, 0), 180) : null;
                        if (a17 != null) {
                            bitmap2 = a17.f68970d;
                        }
                    }
                }
            } else {
                bitmap2 = com.tencent.mm.sdk.platformtools.x.J(str, null);
            }
            com.tencent.mm.sdk.platformtools.u3.h(new gb4.g(this, bitmap2));
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("ContentFragment", "the backgroundCoverUrl is set error ,because " + e18.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$3");
    }
}
