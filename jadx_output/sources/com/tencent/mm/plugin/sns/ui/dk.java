package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class dk implements y51.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f168197a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.bk f168198b;

    public dk(com.tencent.mm.plugin.sns.ui.bk bkVar, r45.jj4 jj4Var) {
        this.f168198b = bkVar;
        this.f168197a = jj4Var;
    }

    @Override // y51.f
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$2");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("live_photo_sessionid", ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Bi());
        hashMap.put("live_photo_opt", 1);
        hashMap.put("live_clk_scene", java.lang.Integer.valueOf(this.f168198b.f167925r.D == 7 ? 4 : 0));
        r45.jj4 jj4Var = this.f168197a;
        hashMap.put("live_photo_ms", java.lang.Float.valueOf(jj4Var.X.R));
        hashMap.put("image_id", jj4Var.f377855d);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("live_photo_bnt", "view_clk", hashMap, 33050);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$2");
    }

    @Override // y51.f
    public int b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetViewMaxHeightLocation", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        android.content.Context context = this.f168198b.f167917g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(context);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetViewMaxHeightLocation", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$2");
        return a17.f197136b;
    }

    @Override // y51.f
    public int c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetLocationCallback", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetLocationCallback", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$2");
        return 0;
    }
}
