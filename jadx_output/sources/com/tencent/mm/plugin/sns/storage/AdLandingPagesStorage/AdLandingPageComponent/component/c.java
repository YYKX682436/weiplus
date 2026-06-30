package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public int f165106a;

    /* renamed from: b, reason: collision with root package name */
    public long f165107b;

    /* renamed from: c, reason: collision with root package name */
    public long f165108c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f165109d;

    public c(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h hVar, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.b bVar) {
    }

    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("endExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$ExposureInfo");
        if (this.f165109d) {
            this.f165109d = false;
            if (this.f165108c > 0) {
                this.f165107b += java.lang.System.currentTimeMillis() - this.f165108c;
                this.f165108c = 0L;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("endExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingCarouselComp$ExposureInfo");
    }
}
