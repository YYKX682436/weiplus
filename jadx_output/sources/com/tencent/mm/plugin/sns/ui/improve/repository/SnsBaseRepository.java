package com.tencent.mm.plugin.sns.ui.improve.repository;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/repository/SnsBaseRepository;", "Landroidx/lifecycle/v;", "Landroidx/lifecycle/y;", "lifecycle", "<init>", "(Landroidx/lifecycle/y;)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public abstract class SnsBaseRepository implements androidx.lifecycle.v {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.y f169105d;

    public SnsBaseRepository(androidx.lifecycle.y lifecycle) {
        kotlin.jvm.internal.o.g(lifecycle, "lifecycle");
        this.f169105d = lifecycle;
        lifecycle.mo133getLifecycle().a(this);
    }

    public abstract void a();

    public abstract void b();

    @Override // androidx.lifecycle.v
    public void onStateChanged(androidx.lifecycle.y source, androidx.lifecycle.m event) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStateChanged", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsBaseRepository");
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(event, "event");
        int i17 = zc4.d.f471435a[event.ordinal()];
        if (i17 == 1) {
            a();
        } else if (i17 == 2) {
            b();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStateChanged", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsBaseRepository");
    }
}
