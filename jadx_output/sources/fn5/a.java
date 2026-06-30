package fn5;

/* loaded from: classes3.dex */
public final class a extends db5.p8 {

    /* renamed from: g, reason: collision with root package name */
    public final android.app.Activity f264637g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f264638h;

    public a(android.app.Activity activity, java.util.ArrayList data) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(data, "data");
        this.f264637g = activity;
        this.f264638h = data;
    }

    @Override // db5.p8
    public com.tencent.mm.ui.base.MultiTouchImageView c(int i17, boolean z17) {
        return null;
    }

    @Override // db5.p8
    public java.lang.Object d(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        java.util.ArrayList arrayList = this.f264638h;
        if (view != null) {
            java.lang.Object tag = view.getTag();
            kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.view.page.ImageQueryGalleryViewHolder");
            java.lang.String str = ((com.tencent.mm.api.QueryImageData) arrayList.get(i17)).f53206g;
            kotlin.jvm.internal.o.f(str, "getScanImagePath(...)");
            ((fn5.b) tag).a(str);
            return view;
        }
        android.view.View inflate = android.view.View.inflate(this.f264637g, com.tencent.mm.R.layout.bki, null);
        kotlin.jvm.internal.o.d(inflate);
        fn5.b bVar = new fn5.b(inflate);
        inflate.setTag(bVar);
        java.lang.String str2 = ((com.tencent.mm.api.QueryImageData) arrayList.get(i17)).f53206g;
        kotlin.jvm.internal.o.f(str2, "getScanImagePath(...)");
        bVar.a(str2);
        return inflate;
    }

    @Override // db5.p8
    public com.tencent.mm.ui.base.WxImageView f(int i17, boolean z17) {
        android.view.View e17 = e(i17);
        if (e17 == null) {
            return null;
        }
        android.view.View findViewById = e17.findViewById(com.tencent.mm.R.id.h_l);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        if (z17 && findViewById.getVisibility() == 8) {
            return null;
        }
        return (com.tencent.mm.ui.base.WxImageView) findViewById;
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.f264638h.size();
    }
}
