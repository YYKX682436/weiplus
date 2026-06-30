package g22;

/* loaded from: classes11.dex */
public final class u extends androidx.fragment.app.e2 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f267870d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f267871e;

    /* renamed from: f, reason: collision with root package name */
    public final int f267872f;

    /* renamed from: g, reason: collision with root package name */
    public final int f267873g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(androidx.fragment.app.FragmentActivity activity, int i17, androidx.viewpager.widget.ViewPager.OnPageChangeListener pageChangedListener, com.tencent.mm.ui.mogic.WxViewPager pager, boolean z17, yz5.l fragmentRequest) {
        super(activity.getSupportFragmentManager(), 0);
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(pageChangedListener, "pageChangedListener");
        kotlin.jvm.internal.o.g(pager, "pager");
        kotlin.jvm.internal.o.g(fragmentRequest, "fragmentRequest");
        this.f267870d = z17;
        this.f267871e = fragmentRequest;
        this.f267872f = 2;
        this.f267873g = 1;
        pager.setAdapter(this);
        pager.setOnPageChangeListener(pageChangedListener);
        pager.setCurrentItem(i17);
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.f267870d ? this.f267872f : this.f267873g;
    }

    @Override // androidx.fragment.app.e2
    public androidx.fragment.app.Fragment getItem(int i17) {
        return (com.tencent.mm.ui.MMFragment) this.f267871e.invoke(java.lang.Integer.valueOf(i17));
    }
}
