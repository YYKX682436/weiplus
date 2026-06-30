package ee4;

/* loaded from: classes4.dex */
public final class e1 extends ee4.t {

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.v4 f251700n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f251701o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.u4 f251702p;

    /* renamed from: q, reason: collision with root package name */
    public final ud4.d f251703q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(ce4.b pcContext) {
        super(pcContext);
        kotlin.jvm.internal.o.g(pcContext, "pcContext");
        this.f251702p = new ee4.d1(this);
        this.f251703q = new ee4.c1(this);
    }

    @Override // ce4.a
    public java.lang.String d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTag", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicPreviewViewPc");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTag", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicPreviewViewPc");
        return "SnsPublish.PicPreviewViewPc";
    }

    @Override // ce4.a
    public boolean h(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicPreviewViewPc");
        if (!super.h(bundle)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicPreviewViewPc");
            return false;
        }
        this.f251701o = c().getIntent().getBooleanExtra("KBlockAdd", false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicPreviewViewPc");
        return true;
    }

    @Override // ce4.a
    public void i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicPreviewViewPc");
        super.i();
        com.tencent.mm.plugin.sns.ui.v4 v4Var = this.f251700n;
        if (v4Var != null) {
            ((ud4.t) v4Var).c();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicPreviewViewPc");
    }

    public final void p() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("changePreview", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicPreviewViewPc");
        com.tencent.mm.plugin.sns.ui.v4 v4Var = this.f251700n;
        if (v4Var != null) {
            ((ud4.t) v4Var).e(new java.util.ArrayList(m().v().e()), 9);
        }
        com.tencent.mm.plugin.sns.ui.v4 v4Var2 = this.f251700n;
        ud4.k kVar = v4Var2 instanceof ud4.k ? (ud4.k) v4Var2 : null;
        if (kVar != null) {
            kVar.d(m().v().f());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("changePreview", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicPreviewViewPc");
    }
}
