package n74;

/* loaded from: classes4.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f335303d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.s7 f335304e;

    public b0(r45.jj4 jj4Var, com.tencent.mm.storage.s7 s7Var) {
        this.f335303d = jj4Var;
        this.f335304e = s7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getSightDownloadFlow$2");
        com.tencent.mm.plugin.sns.model.l4.Cj().d(this.f335303d, 4, null, this.f335304e);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getSightDownloadFlow$2");
    }
}
