package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class fk implements dd4.v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f168347a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.bk f168348b;

    public fk(com.tencent.mm.plugin.sns.ui.bk bkVar, int i17) {
        this.f168348b = bkVar;
        this.f168347a = i17;
    }

    public int a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSelectPos", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$4");
        int selectPos = this.f168348b.f167925r.getSelectPos();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelectPos", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$4");
        return selectPos;
    }

    public boolean b(db5.f0 f0Var, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFirstViewLoad", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$4");
        boolean m07 = this.f168348b.f167925r.m0(f0Var, i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFirstViewLoad", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$4");
        return m07;
    }
}
