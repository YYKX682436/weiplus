package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class f0 implements com.tencent.mm.plugin.sns.model.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.g0 f168285a;

    public f0(com.tencent.mm.plugin.sns.ui.g0 g0Var) {
        this.f168285a = g0Var;
    }

    @Override // com.tencent.mm.plugin.sns.model.c2
    public void a(android.graphics.Bitmap bitmap) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onImgDecodeFin", "com.tencent.mm.plugin.sns.ui.ArtistHeader$1$2");
        boolean f17 = ca4.z0.f(bitmap);
        com.tencent.mm.plugin.sns.ui.g0 g0Var = this.f168285a;
        if (f17) {
            com.tencent.mm.plugin.sns.ui.ArtistHeader.c(g0Var.f168394e, bitmap);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
            com.tencent.mm.plugin.sns.ui.ArtistHeader artistHeader = g0Var.f168394e;
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
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/ArtistHeader$1$2", "onImgDecodeFin", "(Landroid/graphics/Bitmap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/ArtistHeader$1$2", "onImgDecodeFin", "(Landroid/graphics/Bitmap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            com.tencent.mm.plugin.sns.model.i1 hj6 = com.tencent.mm.plugin.sns.model.l4.hj();
            r45.jj4 jj4Var = com.tencent.mm.plugin.sns.ui.ArtistHeader.b(g0Var.f168394e).f391845h.f369879d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
            android.widget.ImageView imageView = g0Var.f168394e.f166197g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
            hj6.e0(jj4Var, imageView, g0Var.f168393d.hashCode(), com.tencent.mm.storage.s7.f195307k);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onImgDecodeFin", "com.tencent.mm.plugin.sns.ui.ArtistHeader$1$2");
    }
}
