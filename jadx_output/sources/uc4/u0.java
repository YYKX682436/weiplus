package uc4;

/* loaded from: classes4.dex */
public final class u0 extends uc4.t0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // uc4.t0
    public com.tencent.mm.plugin.sns.ui.i2 n() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildTag", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMusicTingCategoryClick");
        xc4.p c17 = c();
        com.tencent.mm.protocal.protobuf.TimeLineObject h17 = c17 != null ? c17.h1() : null;
        xc4.p c18 = c();
        com.tencent.mm.plugin.sns.ui.i2 i2Var = new com.tencent.mm.plugin.sns.ui.i2(h17, c18 != null ? c18.W0() : "");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildTag", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMusicTingCategoryClick");
        return i2Var;
    }

    @Override // uc4.t0
    public void o(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMusicItemClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMusicTingCategoryClick");
        xc4.p c17 = c();
        if (c17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMusicItemClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMusicTingCategoryClick");
            return;
        }
        yc4.b0 b0Var = yc4.b0.f460839a;
        b0Var.b(c17.a1());
        b0Var.c(c17.a1(), 1);
        com.tencent.mm.plugin.sns.ui.kw.g(view);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMusicItemClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMusicTingCategoryClick");
    }
}
