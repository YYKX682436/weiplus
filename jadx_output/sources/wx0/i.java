package wx0;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f450497d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.view.ViewGroup viewGroup) {
        super(0);
        this.f450497d = viewGroup;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewGroup viewGroup = this.f450497d;
        android.content.Context context = viewGroup.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautifyPanel beautifyPanel = new com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautifyPanel(context, null, 0, 6, null);
        beautifyPanel.setId(android.view.View.generateViewId());
        beautifyPanel.setLayoutParams(new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-1, -1));
        beautifyPanel.setVisibility(8);
        viewGroup.addView(beautifyPanel);
        return beautifyPanel;
    }
}
