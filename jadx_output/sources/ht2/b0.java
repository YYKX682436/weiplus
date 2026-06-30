package ht2;

/* loaded from: classes2.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f284812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f284813e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(android.widget.TextView textView, com.tencent.mm.view.MMPAGView mMPAGView) {
        super(1);
        this.f284812d = textView;
        this.f284813e = mMPAGView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.animation.Animator it = (android.animation.Animator) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.widget.TextView textView = this.f284812d;
        if (textView != null) {
            textView.setVisibility(4);
        }
        android.view.ViewParent parent = this.f284813e.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.post(new ht2.a0(viewGroup));
        }
        return jz5.f0.f302826a;
    }
}
