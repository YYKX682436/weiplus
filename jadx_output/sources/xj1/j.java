package xj1;

/* loaded from: classes7.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList f454804d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList appBrandCollectionDisplayVerticalList) {
        super(0);
        this.f454804d = appBrandCollectionDisplayVerticalList;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        android.content.Intent intent;
        androidx.fragment.app.FragmentActivity activity = this.f454804d.getActivity();
        if (activity != null && (intent = activity.getIntent()) != null) {
            i17 = 8;
            int intExtra = intent.getIntExtra("extra_get_usage_reason", 8);
            int intExtra2 = intent.getIntExtra("extra_get_usage_prescene", 0);
            if (intExtra != 7) {
                if (intExtra == 8 && intExtra2 == 2) {
                    i17 = 6;
                }
            }
            return java.lang.Integer.valueOf(i17);
        }
        i17 = 3;
        return java.lang.Integer.valueOf(i17);
    }
}
