package uc4;

/* loaded from: classes4.dex */
public final class i extends uc4.g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // uc4.g
    public void a(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAddressClick");
        xc4.p c17 = c();
        if (c17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAddressClick");
            return;
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo c18 = c17.c1();
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = c18.getTimeLine();
        kotlin.jvm.internal.o.f(timeLine, "getTimeLine(...)");
        r45.ed4 ed4Var = timeLine.Location;
        m21.w.d(724);
        ca4.z0.T(c18);
        c18.isAd();
        c18.getUxinfo();
        java.lang.String str = ed4Var.f373316i;
        android.content.Intent intent = new android.content.Intent();
        r45.f96 f96Var = new r45.f96();
        f96Var.set(0, java.lang.Float.valueOf(ed4Var.f373311d));
        f96Var.set(1, java.lang.Float.valueOf(ed4Var.f373312e));
        f96Var.set(2, ed4Var.f373313f);
        f96Var.set(3, ed4Var.f373314g);
        f96Var.set(4, ed4Var.f373315h);
        f96Var.set(5, ed4Var.f373316i);
        f96Var.set(6, java.lang.Integer.valueOf(ed4Var.f373317m));
        f96Var.set(7, ed4Var.f373318n);
        f96Var.set(8, java.lang.Integer.valueOf(ed4Var.f373319o));
        f96Var.set(9, java.lang.Integer.valueOf(ed4Var.f373320p));
        f96Var.set(10, java.lang.Integer.valueOf(ed4Var.f373321q));
        f96Var.set(15, ed4Var.f373326v);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        com.tencent.mm.plugin.finder.service.p3.f126174a.b(b(), f96Var, zy2.o9.f477516d, 7, timeLine.Id, new uc4.h(f96Var, intent, this, timeLine));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAddressClick");
    }
}
