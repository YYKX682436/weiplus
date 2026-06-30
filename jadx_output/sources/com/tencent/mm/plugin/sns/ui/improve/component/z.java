package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class z extends com.tencent.mm.plugin.sns.ui.improve.component.j implements bd4.u0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f169061d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.GestureDetector f169062e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f169062e = new android.view.GestureDetector(getContext(), new com.tencent.mm.plugin.sns.ui.improve.component.y(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveFixUIC");
        getOverScrollView().setDispatchTouchListener(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveFixUIC");
    }
}
