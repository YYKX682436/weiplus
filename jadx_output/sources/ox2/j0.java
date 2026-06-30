package ox2;

/* loaded from: classes.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f349677d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(android.view.View view) {
        super(0);
        this.f349677d = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f349677d;
        android.view.ViewParent parent = view.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup == null) {
            return null;
        }
        viewGroup.removeView(view);
        return jz5.f0.f302826a;
    }
}
