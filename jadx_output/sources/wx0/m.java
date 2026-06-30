package wx0;

/* loaded from: classes5.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f450511d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.view.ViewGroup viewGroup) {
        super(0);
        this.f450511d = viewGroup;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewGroup viewGroup = this.f450511d;
        android.content.Context context = viewGroup.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.MakeupView makeupView = new com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.MakeupView(context, null, 0, 6, null);
        makeupView.setId(android.view.View.generateViewId());
        makeupView.setLayoutParams(new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-1, -1));
        makeupView.setVisibility(8);
        viewGroup.addView(makeupView);
        return makeupView;
    }
}
