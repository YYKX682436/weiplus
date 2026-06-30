package yc4;

/* loaded from: classes4.dex */
public abstract class f {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.improve.component.w1 f460851d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f460852e;

    public f(com.tencent.mm.plugin.sns.ui.improve.component.w1 uic) {
        kotlin.jvm.internal.o.g(uic, "uic");
        this.f460851d = uic;
        this.f460852e = jz5.h.b(new yc4.b(this));
        jz5.h.b(new yc4.d(this));
        jz5.h.b(new yc4.c(this));
        jz5.h.b(new yc4.e(this));
        jz5.h.b(new yc4.a(this));
    }

    public static final android.content.Context a(yc4.f fVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getContext", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        fVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        android.content.Context context = (android.content.Context) ((jz5.n) fVar.f460852e).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getContext", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        return context;
    }

    public abstract void b(android.os.Bundle bundle);

    public void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
    }

    public abstract void d();

    public abstract void e();

    public abstract void f(androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.plugin.sns.ui.improve.component.x1 x1Var, int i17);
}
