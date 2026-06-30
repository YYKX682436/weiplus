package ox2;

/* loaded from: classes3.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f349711d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f349712e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(android.view.View view, android.view.View view2) {
        super(0);
        this.f349711d = view;
        this.f349712e = view2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) this.f349711d;
        if (weImageView != null) {
            weImageView.setAlpha(0.0f);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) this.f349712e;
        if (weImageView2 != null) {
            weImageView2.setAlpha(1.0f);
        }
        return jz5.f0.f302826a;
    }
}
