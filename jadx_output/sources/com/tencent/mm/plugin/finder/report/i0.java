package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class i0 extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f125068a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f125069b;

    public i0(android.app.Activity activity) {
        this.f125069b = activity;
    }

    @Override // ym5.q3
    public void d(int i17, rn5.a aVar, boolean z17) {
        if (i17 == 1) {
            this.f125068a = true;
        } else {
            this.f125068a = false;
            com.tencent.mm.plugin.finder.report.j0.f125083a.f(this.f125069b.hashCode());
        }
    }

    @Override // ym5.q3
    public void e(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        if (reason.f463516a == 2) {
            return;
        }
        if (!this.f125068a) {
            com.tencent.mm.plugin.finder.report.j0.f125083a.e(this.f125069b.hashCode());
        }
        this.f125068a = false;
    }
}
