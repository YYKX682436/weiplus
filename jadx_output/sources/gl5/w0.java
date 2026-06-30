package gl5;

/* loaded from: classes5.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gl5.d1 f273107d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(gl5.d1 d1Var) {
        super(0);
        this.f273107d = d1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        gl5.d1 d1Var = this.f273107d;
        android.view.View findViewById = d1Var.e().findViewById(com.tencent.mm.R.id.f483658bm0);
        findViewById.setOnTouchListener(new gl5.u0(findViewById, d1Var));
        findViewById.setOnClickListener(new gl5.v0(d1Var));
        android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = fp.j0.a(findViewById.getContext(), -1);
            findViewById.setLayoutParams(marginLayoutParams);
        }
        return findViewById;
    }
}
