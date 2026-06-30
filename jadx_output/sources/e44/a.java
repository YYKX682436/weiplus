package e44;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final e44.a f249366b = new e44.a();

    /* renamed from: a, reason: collision with root package name */
    public final f44.f f249367a = new f44.f();

    public void a(java.lang.String str, java.lang.String[] strArr) {
        f44.f fVar;
        f44.e eVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("publish", "com.tencent.mm.plugin.sns.ad.h5.H5PrefetchManager");
        try {
            fVar = this.f249367a;
            fVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("publish", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("offerTask", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
        } catch (java.lang.Throwable unused) {
        }
        if (str != null && !a84.b0.d(strArr)) {
            eVar = fVar.a(new f44.e(str, strArr));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("offerTask", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
            fVar.b(eVar);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("publish", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("publish", "com.tencent.mm.plugin.sns.ad.h5.H5PrefetchManager");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("offerTask", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
        eVar = null;
        fVar.b(eVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("publish", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("publish", "com.tencent.mm.plugin.sns.ad.h5.H5PrefetchManager");
    }
}
