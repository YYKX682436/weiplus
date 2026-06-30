package sj3;

/* loaded from: classes14.dex */
public final class m5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ui.widget.ScreenCastBigView f408643d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(com.tencent.mm.plugin.multitalk.ui.widget.ScreenCastBigView screenCastBigView) {
        super(0);
        this.f408643d = screenCastBigView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View inflate = this.f408643d.getLayoutInflater().inflate(com.tencent.mm.R.layout.c3i, (android.view.ViewGroup) this.f408643d, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        if (this.f408643d.f150361i) {
            android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.jwu);
            if (imageView != null) {
                imageView.setBackgroundResource(com.tencent.mm.R.drawable.bdt);
            }
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.jwv);
            if (textView != null) {
                textView.setText(com.tencent.mm.R.string.h2s);
            }
            inflate.setRotation(90.0f);
        }
        this.f408643d.addView(inflate, new android.widget.FrameLayout.LayoutParams(this.f408643d.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479667c4), this.f408643d.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479667c4), 17));
        com.tencent.mm.plugin.multitalk.ui.widget.ScreenCastBigView screenCastBigView = this.f408643d;
        screenCastBigView.f150357e = 4;
        screenCastBigView.f150360h = inflate;
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.ScreenCastBigView", "show ori dialog");
        ku5.u0 u0Var = ku5.t0.f312615d;
        sj3.l5 l5Var = new sj3.l5(this.f408643d, inflate);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(l5Var, 3000L, false);
        return jz5.f0.f302826a;
    }
}
