package com.tencent.mm.plugin.sns.ui.widget.ad;

/* loaded from: classes3.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.ad.v0 f170993d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.plugin.sns.ui.widget.ad.v0 v0Var) {
        super(0);
        this.f170993d = v0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.ImageView imageView;
        android.widget.ImageView imageView2;
        android.widget.ImageView imageView3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$imageContainerList$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$imageContainerList$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.plugin.sns.ui.widget.ad.v0 v0Var = this.f170993d;
        android.view.ViewGroup L = v0Var.L();
        if (L != null && (imageView3 = (android.widget.ImageView) L.findViewById(com.tencent.mm.R.id.f482488fw)) != null) {
            arrayList.add(imageView3);
        }
        android.view.ViewGroup L2 = v0Var.L();
        if (L2 != null && (imageView2 = (android.widget.ImageView) L2.findViewById(com.tencent.mm.R.id.f482489fx)) != null) {
            arrayList.add(imageView2);
        }
        android.view.ViewGroup L3 = v0Var.L();
        if (L3 != null && (imageView = (android.widget.ImageView) L3.findViewById(com.tencent.mm.R.id.f482490fy)) != null) {
            arrayList.add(imageView);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$imageContainerList$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$imageContainerList$2");
        return arrayList;
    }
}
