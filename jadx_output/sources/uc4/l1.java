package uc4;

/* loaded from: classes4.dex */
public final class l1 extends uc4.g {

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f426430f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f426431g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f426430f = jz5.h.b(new uc4.k1(this));
        this.f426431g = jz5.h.b(new uc4.i1(context, this));
    }

    @Override // uc4.g
    public void a(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.m7 m7Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveWeTagClick");
        xc4.p c17 = c();
        if (c17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveWeTagClick");
            return;
        }
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveWeTagClick");
            return;
        }
        view.setTag(new ca4.n(view, c17.W0()));
        com.tencent.mm.plugin.sns.ui.m7 n17 = n();
        n17.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setIsFullScreen", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
        n17.f169896h = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIsFullScreen", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
        n().b(view, false, false);
        com.tencent.mm.plugin.sns.ui.m7 n18 = n();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOpenIMUnlikeHelper", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveGlobalInstance");
        if (!kotlin.jvm.internal.o.b(pc4.a.f353407a, n18) && (m7Var = pc4.a.f353407a) != null) {
            m7Var.c();
        }
        pc4.a.f353407a = n18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOpenIMUnlikeHelper", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveGlobalInstance");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveWeTagClick");
    }

    public final com.tencent.mm.plugin.sns.ui.m7 n() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOpenIMUnlikeHelper", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveWeTagClick");
        com.tencent.mm.plugin.sns.ui.m7 m7Var = (com.tencent.mm.plugin.sns.ui.m7) ((jz5.n) this.f426431g).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOpenIMUnlikeHelper", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveWeTagClick");
        return m7Var;
    }
}
