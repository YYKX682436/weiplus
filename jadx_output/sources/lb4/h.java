package lb4;

/* loaded from: classes11.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.j0 f317786a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.picker.base.view.WheelView f317787b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.j0 f317788c;

    /* renamed from: d, reason: collision with root package name */
    public lb4.f f317789d;

    public h(android.content.Context context, androidx.lifecycle.j0 bindData, com.tencent.mm.picker.base.view.WheelView wheelView, int i17, kotlin.jvm.internal.i iVar) {
        wheelView = (i17 & 4) != 0 ? new com.tencent.mm.picker.base.view.WheelView(context) : wheelView;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bindData, "bindData");
        kotlin.jvm.internal.o.g(wheelView, "wheelView");
        this.f317786a = bindData;
        this.f317787b = wheelView;
        this.f317788c = new androidx.lifecycle.j0();
        wheelView.setOnItemSelectedListener(new lb4.d(this));
        bindData.observeForever(new lb4.e(this));
    }

    public static final kb4.c a(lb4.h hVar, int i17) {
        java.util.List a17;
        kb4.c cVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getDataNode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController");
        hVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDataNode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController");
        lb4.f fVar = hVar.f317789d;
        kb4.c cVar2 = null;
        if (fVar != null && (a17 = fVar.a()) != null) {
            if (!(a17.size() > i17)) {
                a17 = null;
            }
            if (a17 != null && (cVar = (kb4.c) a17.get(i17)) != null) {
                cVar2 = cVar;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDataNode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getDataNode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController");
                return cVar2;
            }
        }
        com.tencent.mars.xlog.Log.w("PickerWheelView", "onItemSelectedListener error: cannot find selectItem!");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDataNode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getDataNode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController");
        return cVar2;
    }

    public final androidx.lifecycle.g0 b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSelectedItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController");
        androidx.lifecycle.j0 j0Var = this.f317788c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelectedItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController");
        return j0Var;
    }

    public final com.tencent.mm.picker.base.view.WheelView c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWheelView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWheelView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController");
        return this.f317787b;
    }
}
