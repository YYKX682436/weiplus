package k33;

/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f303869a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.ui.base.MMViewPager f303870b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.gallery.view.ImagePreviewViewPager f303871c;

    public i(android.view.ViewGroup parent) {
        kotlin.jvm.internal.o.g(parent, "parent");
        this.f303869a = jz5.h.b(k33.h.f303868d);
        android.view.ViewStub viewStub = (android.view.ViewStub) parent.findViewById(com.tencent.mm.R.id.pwn);
        if (viewStub != null) {
            viewStub.setLayoutResource(a() ? com.tencent.mm.R.layout.dck : com.tencent.mm.R.layout.dcl);
        }
        android.view.View inflate = viewStub != null ? viewStub.inflate() : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewViewPagerWrapper", "useMMViewPager: " + a());
        if (a()) {
            this.f303870b = inflate != null ? (com.tencent.mm.ui.base.MMViewPager) inflate.findViewById(com.tencent.mm.R.id.ghs) : null;
        } else {
            this.f303871c = inflate != null ? (com.tencent.mm.plugin.gallery.view.ImagePreviewViewPager) inflate.findViewById(com.tencent.mm.R.id.ghs) : null;
        }
    }

    public final boolean a() {
        return ((java.lang.Boolean) this.f303869a.getValue()).booleanValue();
    }

    public final void b(int i17, boolean z17) {
        if (a()) {
            com.tencent.mm.ui.base.MMViewPager mMViewPager = this.f303870b;
            if (mMViewPager != null) {
                mMViewPager.setCurrentItem(i17, z17, false);
                return;
            }
            return;
        }
        com.tencent.mm.plugin.gallery.view.ImagePreviewViewPager imagePreviewViewPager = this.f303871c;
        if (imagePreviewViewPager != null) {
            imagePreviewViewPager.setCurrentItem(i17, z17);
        }
    }
}
