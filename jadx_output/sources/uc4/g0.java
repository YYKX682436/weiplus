package uc4;

/* loaded from: classes4.dex */
public final class g0 extends uc4.g {

    /* renamed from: f, reason: collision with root package name */
    public final yz5.a f426409f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f426410g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(android.content.Context context, yz5.a aVar) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f426409f = aVar;
        this.f426410g = jz5.h.b(new uc4.f0(this, context));
    }

    @Override // uc4.g
    public void a(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderMediaClick");
        xc4.p c17 = c();
        if (c17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderMediaClick");
            return;
        }
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderMediaClick");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.FinderMedia", "perform click");
        view.setTag(c17.h1());
        yz5.a aVar = this.f426409f;
        if (aVar != null) {
            aVar.invoke();
        }
        com.tencent.mm.plugin.sns.ui.kw.e(view, c17.W0());
        dy1.s sVar = (dy1.s) i95.n0.c(dy1.s.class);
        java.lang.String a17 = c17.a1();
        zy1.f fVar = (zy1.f) sVar;
        fVar.Bi(12076, "ClickFeedCount", 1);
        fVar.Di(12076, "ClickFeedId", a17);
        fVar.Di(12076, "ClickFinderFeedCnt", a17);
        fVar.Ni(12076, "FinderFeedTime");
        yc4.b0 b0Var = yc4.b0.f460839a;
        b0Var.b(c17.a1());
        b0Var.c(c17.a1(), 1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderMediaClick");
    }

    @Override // uc4.g
    public android.view.View.OnCreateContextMenuListener d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderMediaClick");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFinderMediaMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderMediaClick");
        com.tencent.mm.plugin.sns.ui.listener.h1 h1Var = (com.tencent.mm.plugin.sns.ui.listener.h1) ((jz5.n) this.f426410g).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFinderMediaMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderMediaClick");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderMediaClick");
        return h1Var;
    }
}
