package tl1;

/* loaded from: classes15.dex */
public class e implements v51.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.picker.AppBrandDatePickerV2 f420202a;

    public e(com.tencent.mm.plugin.appbrand.widget.picker.AppBrandDatePickerV2 appBrandDatePickerV2) {
        this.f420202a = appBrandDatePickerV2;
    }

    @Override // v51.f
    public void a(java.util.Date date) {
        com.tencent.mm.plugin.appbrand.widget.picker.AppBrandDatePickerV2 appBrandDatePickerV2 = this.f420202a;
        appBrandDatePickerV2.getClass();
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(date);
        appBrandDatePickerV2.f91788i = calendar.get(1);
        appBrandDatePickerV2.f91789m = calendar.get(2) + 1;
        appBrandDatePickerV2.f91790n = calendar.get(5);
    }
}
