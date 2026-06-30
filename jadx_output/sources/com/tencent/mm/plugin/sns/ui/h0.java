package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class h0 implements com.tencent.mm.plugin.sns.model.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.i0 f168473a;

    public h0(com.tencent.mm.plugin.sns.ui.i0 i0Var) {
        this.f168473a = i0Var;
    }

    @Override // com.tencent.mm.plugin.sns.model.c2
    public void a(android.graphics.Bitmap bitmap) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onImgDecodeFin", "com.tencent.mm.plugin.sns.ui.ArtistHeader$2$1");
        if (ca4.z0.f(bitmap)) {
            com.tencent.mm.plugin.sns.ui.i0 i0Var = this.f168473a;
            com.tencent.mm.plugin.sns.ui.ArtistHeader.c(i0Var.f168547d, bitmap);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
            com.tencent.mm.plugin.sns.ui.ArtistHeader artistHeader = i0Var.f168547d;
            android.widget.ProgressBar progressBar = artistHeader.f166198h;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
            progressBar.setVisibility(4);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
            android.view.View view = artistHeader.f166199i;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/ArtistHeader$2$1", "onImgDecodeFin", "(Landroid/graphics/Bitmap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/ArtistHeader$2$1", "onImgDecodeFin", "(Landroid/graphics/Bitmap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onImgDecodeFin", "com.tencent.mm.plugin.sns.ui.ArtistHeader$2$1");
    }
}
