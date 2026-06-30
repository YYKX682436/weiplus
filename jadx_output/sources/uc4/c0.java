package uc4;

/* loaded from: classes4.dex */
public final class c0 extends uc4.g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // uc4.g
    public void a(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveDeleteClick");
        xc4.p c17 = c();
        if (c17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveDeleteClick");
            return;
        }
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(b());
        java.lang.String string = c17.isInValid() ? b().getResources().getString(com.tencent.mm.R.string.jg8) : b().getResources().getString(com.tencent.mm.R.string.jg7);
        kotlin.jvm.internal.o.d(string);
        u1Var.g(string);
        u1Var.n(b().getResources().getString(com.tencent.mm.R.string.f490367t0));
        u1Var.k(b().getResources().getColor(com.tencent.mm.R.color.f479482a31));
        u1Var.l(new uc4.a0(c17, this));
        u1Var.j(b().getResources().getString(com.tencent.mm.R.string.f490347sg));
        u1Var.i(uc4.b0.f426380a);
        u1Var.q(false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveDeleteClick");
    }

    public final void n(long j17, long j18, int i17) {
        androidx.lifecycle.c1 a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyDBDeleteByLocalId", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveDeleteClick");
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(zc4.h.class);
        }
        ((zc4.g) ((zc4.h) a17).P6(zc4.g.class)).X6(j17, j18, i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyDBDeleteByLocalId", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveDeleteClick");
    }
}
