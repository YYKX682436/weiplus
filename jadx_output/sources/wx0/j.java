package wx0;

/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f450499d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.view.ViewGroup viewGroup) {
        super(0);
        this.f450499d = viewGroup;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewGroup viewGroup = this.f450499d;
        android.content.Context context = viewGroup.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautyView beautyView = new com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautyView(context, null, 0, 6, null);
        beautyView.setId(android.view.View.generateViewId());
        beautyView.setLayoutParams(new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-1, -1));
        beautyView.setVisibility(8);
        viewGroup.addView(beautyView);
        return beautyView;
    }
}
