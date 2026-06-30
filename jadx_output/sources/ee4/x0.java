package ee4;

/* loaded from: classes4.dex */
public final class x0 extends ee4.t {

    /* renamed from: n, reason: collision with root package name */
    public kotlinx.coroutines.r2 f251768n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(ce4.b pcContext) {
        super(pcContext);
        kotlin.jvm.internal.o.g(pcContext, "pcContext");
    }

    @Override // ce4.a
    public java.util.ArrayList b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dependComponents", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(l());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dependComponents", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc");
        return arrayList;
    }

    @Override // ce4.a
    public java.lang.String d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTag", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTag", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc");
        return "SnsPublish.MultiPicMediaErrorPc";
    }

    @Override // ce4.a
    public boolean h(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc");
        if (!super.h(bundle)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initCollectLivePhotoWorkFlowJob", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc");
        this.f251768n = kotlinx.coroutines.l.d(o().p(), null, null, new ee4.w0(this, null), 3, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initCollectLivePhotoWorkFlowJob", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc");
        return true;
    }

    @Override // ce4.a
    public void i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc");
        super.i();
        kotlinx.coroutines.r2 r2Var = this.f251768n;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f251768n = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc");
    }
}
