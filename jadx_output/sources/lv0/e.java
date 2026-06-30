package lv0;

/* loaded from: classes3.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final lv0.e f321487d = new lv0.e();

    public e() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.view.ViewGroup.LayoutParams layoutParams = it.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        return java.lang.Integer.valueOf(((androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams).a());
    }
}
