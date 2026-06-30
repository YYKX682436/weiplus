package lb4;

/* loaded from: classes11.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final kb4.c f317781a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f317782b;

    /* renamed from: c, reason: collision with root package name */
    public final int f317783c;

    /* renamed from: d, reason: collision with root package name */
    public final int f317784d;

    public f(kb4.c cVar, java.util.List items, int i17, int i18, int i19, kotlin.jvm.internal.i iVar) {
        i17 = (i19 & 4) != 0 ? -1 : i17;
        i18 = (i19 & 8) != 0 ? 1 : i18;
        kotlin.jvm.internal.o.g(items, "items");
        this.f317781a = cVar;
        this.f317782b = items;
        this.f317783c = i17;
        this.f317784d = i18;
    }

    public final java.util.List a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItems", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController$PickerData");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItems", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController$PickerData");
        return this.f317782b;
    }
}
