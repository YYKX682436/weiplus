package wx0;

/* loaded from: classes5.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f450507d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.view.ViewGroup viewGroup) {
        super(0);
        this.f450507d = viewGroup;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewGroup viewGroup = this.f450507d;
        android.content.Context context = viewGroup.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.FilterView filterView = new com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.FilterView(context, null, 0, 6, null);
        filterView.setId(android.view.View.generateViewId());
        filterView.setLayoutParams(new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-1, -1));
        filterView.setVisibility(8);
        viewGroup.addView(filterView);
        return filterView;
    }
}
