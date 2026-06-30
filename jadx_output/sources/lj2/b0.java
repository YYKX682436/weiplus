package lj2;

/* loaded from: classes10.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lj2.c0 f318826d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(lj2.c0 c0Var) {
        super(0);
        this.f318826d = c0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        dk2.u4 K;
        lj2.c0 c0Var = this.f318826d;
        lj2.t0 a07 = c0Var.f318831b.a0();
        if (a07 != null && (K = a07.K()) != null) {
            c0Var.c().b(0);
            c0Var.b().a(8);
            lj2.t c17 = c0Var.c();
            int i17 = K.f234160g;
            int i18 = K.f234161h;
            int i19 = K.f234166m;
            c17.f318951e = i17;
            c17.f318952f = i19;
            android.widget.TextView textView = c17.f318950d;
            android.widget.TextView textView2 = c17.f318949c;
            android.view.View view = c17.f318947a;
            if (i18 == 1) {
                textView2.setText(view.getContext().getString(com.tencent.mm.R.string.f491477d70));
                c17.a();
                textView.setText(view.getContext().getString(com.tencent.mm.R.string.lje));
            } else {
                textView2.setText(view.getContext().getString(com.tencent.mm.R.string.f491477d70));
                c17.a();
                textView.setText(view.getContext().getString(com.tencent.mm.R.string.ljg));
            }
        }
        c0Var.c().f318947a.animate().translationX(0.0f).setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator()).setListener(null).start();
        return jz5.f0.f302826a;
    }
}
