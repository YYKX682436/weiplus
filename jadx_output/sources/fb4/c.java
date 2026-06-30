package fb4;

/* loaded from: classes4.dex */
public final class c implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eb4.k f260874a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f260875b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f260876c;

    public c(eb4.k kVar, java.lang.String str, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f260874a = kVar;
        this.f260875b = str;
        this.f260876c = z2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.wheelpicker.WheelPickerCaller$handleOpenWheelPicker$1");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("ret", -1);
        this.f260874a.e(this.f260875b, "user canceled", hashMap);
        this.f260876c.B();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.wheelpicker.WheelPickerCaller$handleOpenWheelPicker$1");
    }
}
