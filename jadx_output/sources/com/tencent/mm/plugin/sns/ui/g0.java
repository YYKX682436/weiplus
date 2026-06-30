package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class g0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f168393d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.ArtistHeader f168394e;

    public g0(com.tencent.mm.plugin.sns.ui.ArtistHeader artistHeader, android.content.Context context) {
        this.f168394e = artistHeader;
        this.f168393d = context;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.ArtistHeader$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/ArtistHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.ArtistHeader artistHeader = this.f168394e;
        if (com.tencent.mm.plugin.sns.ui.ArtistHeader.a(artistHeader) != null && com.tencent.mm.plugin.sns.ui.ArtistHeader.a(artistHeader).isShowing()) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/ArtistHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.ArtistHeader$1");
            return;
        }
        if (com.tencent.mm.plugin.sns.ui.ArtistHeader.b(artistHeader) == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/ArtistHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.ArtistHeader$1");
            return;
        }
        android.view.View inflate = android.view.LayoutInflater.from(artistHeader.getContext()).inflate(com.tencent.mm.R.layout.d3s, (android.view.ViewGroup) null);
        com.tencent.mm.ui.widget.dialog.k2 k2Var = new com.tencent.mm.ui.widget.dialog.k2(artistHeader.getContext(), com.tencent.mm.R.style.f494790wc);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        artistHeader.f166196f = k2Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        inflate.setOnClickListener(new com.tencent.mm.plugin.sns.ui.e0(this));
        com.tencent.mm.plugin.sns.ui.ArtistHeader.a(artistHeader).setCanceledOnTouchOutside(true);
        com.tencent.mm.plugin.sns.ui.ArtistHeader.a(artistHeader).setContentView(inflate);
        com.tencent.mm.plugin.sns.ui.ArtistHeader.a(artistHeader).show();
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.gxg);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        artistHeader.f166197g = imageView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) inflate.findViewById(com.tencent.mm.R.id.gxh);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        artistHeader.f166198h = progressBar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.gxi);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        artistHeader.f166199i = findViewById;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        com.tencent.mm.plugin.sns.model.i1 hj6 = com.tencent.mm.plugin.sns.model.l4.hj();
        r45.jj4 jj4Var = com.tencent.mm.plugin.sns.ui.ArtistHeader.b(artistHeader).f391845h.f369879d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        android.widget.ImageView imageView2 = artistHeader.f166197g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        hj6.o(jj4Var, imageView2, this.f168393d.hashCode(), true, com.tencent.mm.storage.s7.f195307k, false, "", new com.tencent.mm.plugin.sns.ui.f0(this));
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/ArtistHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.ArtistHeader$1");
    }
}
