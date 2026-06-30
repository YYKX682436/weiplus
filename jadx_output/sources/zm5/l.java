package zm5;

/* loaded from: classes3.dex */
public final class l extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public fn5.a f474233d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMViewPager f474234e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.ArrayList f474235f;

    /* renamed from: g, reason: collision with root package name */
    public int f474236g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f474237h;

    /* renamed from: i, reason: collision with root package name */
    public long f474238i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f474239m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f474240n;

    /* renamed from: o, reason: collision with root package name */
    public int f474241o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f474242p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f474235f = new java.util.ArrayList();
        this.f474236g = -1;
        this.f474237h = "";
        this.f474238i = -1L;
        this.f474239m = "";
        this.f474240n = true;
        this.f474241o = -1;
        this.f474242p = true;
    }

    public final com.tencent.mm.ui.base.WxImageView O6() {
        fn5.a aVar;
        com.tencent.mm.ui.base.MMViewPager mMViewPager = this.f474234e;
        if (mMViewPager == null || (aVar = this.f474233d) == null) {
            return null;
        }
        return aVar.f(mMViewPager.getCurrentItem(), true);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        this.f474236g = getIntent().getIntExtra("KEY_IMAGE_CURRENT_INDEX", -1);
        java.util.ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("KEY_IMAGE_DATA");
        if (parcelableArrayListExtra == null) {
            parcelableArrayListExtra = new java.util.ArrayList();
        }
        this.f474235f = parcelableArrayListExtra;
        java.lang.String stringExtra = getIntent().getStringExtra("KEY_IMAGE_KEY_WORDS");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f474237h = stringExtra;
        this.f474238i = ((com.tencent.mm.api.QueryImageData) this.f474235f.get(this.f474236g)).f53203d;
        this.f474239m = ((com.tencent.mm.api.QueryImageData) this.f474235f.get(this.f474236g)).f53210n;
        this.f474241o = this.f474236g;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryPageUIC", "currentIndex: " + this.f474236g + ", imageDataSize: " + this.f474235f.size() + ", matchKeywords: " + this.f474237h);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryPageUIC", " " + com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x + ", " + com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y);
        this.f474233d = new fn5.a(getActivity(), this.f474235f);
        com.tencent.mm.ui.base.MMViewPager mMViewPager = (com.tencent.mm.ui.base.MMViewPager) findViewById(com.tencent.mm.R.id.h_b);
        this.f474234e = mMViewPager;
        if (mMViewPager != null) {
            mMViewPager.setVerticalFadingEdgeEnabled(false);
        }
        com.tencent.mm.ui.base.MMViewPager mMViewPager2 = this.f474234e;
        if (mMViewPager2 != null) {
            mMViewPager2.setHorizontalFadingEdgeEnabled(false);
        }
        com.tencent.mm.ui.base.MMViewPager mMViewPager3 = this.f474234e;
        if (mMViewPager3 != null) {
            mMViewPager3.setOnPageChangeListener(new zm5.h(this));
        }
        com.tencent.mm.ui.base.MMViewPager mMViewPager4 = this.f474234e;
        if (mMViewPager4 != null) {
            mMViewPager4.setOffscreenPageLimit(1);
        }
        com.tencent.mm.ui.base.MMViewPager mMViewPager5 = this.f474234e;
        if (mMViewPager5 != null) {
            mMViewPager5.setAdapter(this.f474233d);
        }
        com.tencent.mm.ui.base.MMViewPager mMViewPager6 = this.f474234e;
        if (mMViewPager6 != null) {
            mMViewPager6.setCurrentItem(this.f474236g);
        }
        com.tencent.mm.ui.base.MMViewPager mMViewPager7 = this.f474234e;
        if (mMViewPager7 != null) {
            mMViewPager7.setDoubleClickListener(zm5.i.f474225a);
        }
        com.tencent.mm.ui.base.MMViewPager mMViewPager8 = this.f474234e;
        if (mMViewPager8 != null) {
            mMViewPager8.setLongClickOverListener(new zm5.j(this));
        }
        com.tencent.mm.ui.base.MMViewPager mMViewPager9 = this.f474234e;
        if (mMViewPager9 != null) {
            mMViewPager9.setSingleClickOverListener(new zm5.k(this));
        }
    }
}
