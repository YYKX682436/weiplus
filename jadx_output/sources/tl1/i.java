package tl1;

/* loaded from: classes15.dex */
public class i implements v51.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f420207a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.picker.AppBrandMultiOptionsPickerV2 f420208b;

    public i(com.tencent.mm.plugin.appbrand.widget.picker.AppBrandMultiOptionsPickerV2 appBrandMultiOptionsPickerV2, int i17) {
        this.f420208b = appBrandMultiOptionsPickerV2;
        this.f420207a = i17;
    }

    @Override // v51.c
    public void a(int i17) {
        tl1.v vVar = this.f420208b.f91802g;
        if (vVar != null) {
            int[] iArr = {this.f420207a, i17};
            tl1.u uVar = vVar.f420232u;
            if (uVar != null) {
                uVar.a(iArr);
            }
        }
    }
}
