package ht2;

/* loaded from: classes2.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f284909d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f284910e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(android.widget.TextView textView, com.tencent.mm.ui.widget.imageview.WeImageView weImageView) {
        super(0);
        this.f284909d = textView;
        this.f284910e = weImageView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.TextView textView = this.f284909d;
        if (textView != null) {
            textView.setVisibility(4);
        }
        android.view.ViewParent parent = this.f284910e.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            return java.lang.Boolean.valueOf(viewGroup.post(new ht2.t(viewGroup)));
        }
        return null;
    }
}
