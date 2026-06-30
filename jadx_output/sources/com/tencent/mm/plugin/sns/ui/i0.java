package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.ArtistHeader f168547d;

    public i0(com.tencent.mm.plugin.sns.ui.ArtistHeader artistHeader) {
        this.f168547d = artistHeader;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.ArtistHeader$2");
        com.tencent.mm.plugin.sns.model.i1 hj6 = com.tencent.mm.plugin.sns.model.l4.hj();
        com.tencent.mm.plugin.sns.ui.ArtistHeader artistHeader = this.f168547d;
        r45.jj4 jj4Var = com.tencent.mm.plugin.sns.ui.ArtistHeader.b(artistHeader).f391845h.f369879d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        android.widget.ImageView imageView = artistHeader.f166197g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        android.content.Context context = artistHeader.f166200m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        hj6.o(jj4Var, imageView, context.hashCode(), true, com.tencent.mm.storage.s7.f195307k, false, "", new com.tencent.mm.plugin.sns.ui.h0(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.ArtistHeader$2");
    }
}
