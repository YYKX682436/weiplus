package tb2;

/* loaded from: classes2.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f416954d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f416955e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tb2.f f416956f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.mb4 f416957g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f416958h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.widget.ImageView imageView, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, tb2.f fVar, r45.mb4 mb4Var, android.view.View view) {
        super(1);
        this.f416954d = imageView;
        this.f416955e = baseFinderFeed;
        this.f416956f = fVar;
        this.f416957g = mb4Var;
        this.f416958h = view;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        android.widget.ImageView imageView = this.f416954d;
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f416955e;
        int a17 = baseFinderFeed.getFeedObject().isLiveFeed() ? (int) (this.f416956f.f416970h * intValue) : bu2.z.a(bu2.z.g(this.f416957g), intValue, baseFinderFeed.getFeedObject().isLiveFeed());
        if (a17 > 0) {
            layoutParams.width = intValue;
            layoutParams.height = a17;
            imageView.setLayoutParams(layoutParams);
            android.view.View view = this.f416958h;
            view.getLayoutParams().width = layoutParams.width;
            view.getLayoutParams().height = layoutParams.height;
        }
        return jz5.f0.f302826a;
    }
}
