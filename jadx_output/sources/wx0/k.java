package wx0;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f450501d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(android.view.ViewGroup viewGroup) {
        super(0);
        this.f450501d = viewGroup;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewGroup viewGroup = this.f450501d;
        android.content.Context context = viewGroup.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.FaceEffectView faceEffectView = new com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.FaceEffectView(context, null, 0, 6, null);
        faceEffectView.setId(android.view.View.generateViewId());
        faceEffectView.setLayoutParams(new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-1, -1));
        faceEffectView.setVisibility(8);
        viewGroup.addView(faceEffectView);
        return faceEffectView;
    }
}
