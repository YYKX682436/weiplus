package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage;

/* loaded from: classes4.dex */
public class AdLandingPageChattingTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask> CREATOR = new za4.m();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f165005f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f165006g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f165007h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Runnable f165008i;

    public AdLandingPageChattingTask() {
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseFromParcel", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask");
        this.f165005f = parcel.readString();
        this.f165006g = parcel.readString();
        this.f165007h = parcel.readString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromParcel", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask");
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("writeToParcel", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask");
        parcel.writeString(this.f165005f);
        parcel.writeString(this.f165006g);
        parcel.writeString(this.f165007h);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("writeToParcel", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask");
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("runInClientProcess", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask");
        java.lang.Runnable runnable = this.f165008i;
        if (runnable != null) {
            runnable.run();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("runInClientProcess", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask");
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("runInMainProcess", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask");
        if (!gm0.j1.b().f273254q) {
            c();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("runInMainProcess", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask");
            return;
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f165006g, true);
        if (n17 == null || ((int) n17.E2) == 0) {
            com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3(this.f165006g);
            z3Var.setType(0);
            z3Var.M1(this.f165007h);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().h0(z3Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingPageChattingTask", "%s save to contact_table", this.f165006g);
        }
        ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Ri(this.f165006g, new za4.l(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("runInMainProcess", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask");
    }

    public AdLandingPageChattingTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
