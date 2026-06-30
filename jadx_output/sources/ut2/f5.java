package ut2;

/* loaded from: classes3.dex */
public final class f5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut2.j5 f430885d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(ut2.j5 j5Var) {
        super(0);
        this.f430885d = j5Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.ImageView imageView = (android.widget.ImageView) this.f430885d.t().findViewById(com.tencent.mm.R.id.muh);
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i65.a.a(imageView.getContext(), 16.0f);
        }
        return imageView;
    }
}
