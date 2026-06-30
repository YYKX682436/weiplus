package ee4;

/* loaded from: classes4.dex */
public final class g1 extends ee4.t {

    /* renamed from: n, reason: collision with root package name */
    public kotlinx.coroutines.y0 f251710n;

    /* renamed from: o, reason: collision with root package name */
    public kotlinx.coroutines.y0 f251711o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(ce4.b pcContext) {
        super(pcContext);
        kotlin.jvm.internal.o.g(pcContext, "pcContext");
    }

    @Override // ce4.a
    public java.lang.String d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTag", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicScopePc");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTag", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicScopePc");
        return "SnsPublish.MultiPicScopePc";
    }

    @Override // ce4.a
    public void i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicScopePc");
        super.i();
        kotlinx.coroutines.y0 y0Var = this.f251710n;
        if (y0Var != null) {
            kotlinx.coroutines.z0.c(y0Var, null);
        }
        this.f251710n = null;
        kotlinx.coroutines.y0 y0Var2 = this.f251711o;
        if (y0Var2 != null) {
            kotlinx.coroutines.z0.c(y0Var2, null);
        }
        this.f251711o = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicScopePc");
    }

    public final kotlinx.coroutines.y0 p() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getIoScope", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicScopePc");
        if (this.f251711o == null) {
            this.f251711o = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(kotlinx.coroutines.t3.a(null, 1, null)));
        }
        kotlinx.coroutines.y0 y0Var = this.f251711o;
        kotlin.jvm.internal.o.d(y0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getIoScope", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicScopePc");
        return y0Var;
    }

    public final kotlinx.coroutines.y0 q() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMainScope", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicScopePc");
        if (this.f251710n == null) {
            this.f251710n = kotlinx.coroutines.z0.b();
        }
        kotlinx.coroutines.y0 y0Var = this.f251710n;
        kotlin.jvm.internal.o.d(y0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMainScope", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicScopePc");
        return y0Var;
    }
}
