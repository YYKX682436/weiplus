package d92;

/* loaded from: classes3.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f227457d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f227458e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.view.View view, boolean z17) {
        super(0);
        this.f227457d = view;
        this.f227458e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        d92.f fVar = d92.f.f227470a;
        android.view.View view = this.f227457d;
        view.setPadding((int) fVar.g(view.getContext(), view.getPaddingLeft()), (int) fVar.g(view.getContext(), view.getPaddingTop()), (int) fVar.g(view.getContext(), view.getPaddingRight()), (int) fVar.g(view.getContext(), view.getPaddingBottom()));
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (this.f227458e) {
            if (layoutParams.width > 0) {
                layoutParams.width = (int) fVar.g(view.getContext(), layoutParams.width);
            }
            if (layoutParams.height > 0) {
                layoutParams.height = (int) fVar.g(view.getContext(), layoutParams.height);
            }
        }
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = (int) fVar.g(view.getContext(), marginLayoutParams.leftMargin);
            marginLayoutParams.rightMargin = (int) fVar.g(view.getContext(), marginLayoutParams.rightMargin);
            marginLayoutParams.topMargin = (int) fVar.g(view.getContext(), marginLayoutParams.topMargin);
            marginLayoutParams.bottomMargin = (int) fVar.g(view.getContext(), marginLayoutParams.bottomMargin);
            marginLayoutParams.setMarginStart((int) fVar.g(view.getContext(), marginLayoutParams.getMarginStart()));
            marginLayoutParams.setMarginEnd((int) fVar.g(view.getContext(), marginLayoutParams.getMarginEnd()));
        }
        view.setLayoutParams(layoutParams);
        return jz5.f0.f302826a;
    }
}
