package cw2;

/* loaded from: classes.dex */
public final class a2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f223559d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f223560e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(int i17, int i18) {
        super(1);
        this.f223559d = i17;
        this.f223560e = i18;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        kotlin.jvm.internal.o.g(view, "$this$null");
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.width = this.f223559d;
            layoutParams2.height = this.f223560e;
            view.setLayoutParams(layoutParams2);
        }
        return jz5.f0.f302826a;
    }
}
