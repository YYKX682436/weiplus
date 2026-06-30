package xt2;

/* loaded from: classes3.dex */
public final class c3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f456660d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xt2.e3 f456661e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(android.content.Context context, xt2.e3 e3Var) {
        super(0);
        this.f456660d = context;
        this.f456661e = e3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View finderLiveShoppingSubsidyOverlayView = new com.tencent.mm.plugin.finder.shopping.view.subsidy.FinderLiveShoppingSubsidyOverlayView(this.f456660d, null, 0, 6, null);
        int f17 = i65.a.f(this.f456660d, com.tencent.mm.R.dimen.f479738dv);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        int i17 = -f17;
        layoutParams.setMargins(i17, i17, i17, i17);
        finderLiveShoppingSubsidyOverlayView.setLayoutParams(layoutParams);
        android.view.ViewGroup viewGroup = this.f456661e.f456710o;
        if (viewGroup != null) {
            viewGroup.addView(finderLiveShoppingSubsidyOverlayView);
        }
        finderLiveShoppingSubsidyOverlayView.setVisibility(8);
        return finderLiveShoppingSubsidyOverlayView;
    }
}
