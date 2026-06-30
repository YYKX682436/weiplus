package tl1;

/* loaded from: classes15.dex */
public class f implements tl1.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.picker.AppBrandMultiOptionsPicker f420204a;

    public f(com.tencent.mm.plugin.appbrand.widget.picker.AppBrandMultiOptionsPicker appBrandMultiOptionsPicker) {
        this.f420204a = appBrandMultiOptionsPicker;
    }

    public void a(com.tencent.mm.plugin.appbrand.widget.picker.YANumberPicker yANumberPicker, int i17, int i18) {
        com.tencent.mm.plugin.appbrand.widget.picker.AppBrandMultiOptionsPicker appBrandMultiOptionsPicker = this.f420204a;
        if (appBrandMultiOptionsPicker.f91797h != null) {
            int[] iArr = {((java.lang.Integer) yANumberPicker.getTag(com.tencent.mm.R.id.f483172ym)).intValue(), i18};
            tl1.u uVar = appBrandMultiOptionsPicker.f91797h.f420232u;
            if (uVar != null) {
                uVar.a(iArr);
            }
        }
    }
}
