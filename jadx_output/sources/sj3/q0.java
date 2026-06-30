package sj3;

/* loaded from: classes4.dex */
public final class q0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f408700d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f408701e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sj3.a1 f408702f;

    public q0(android.widget.ImageView imageView, android.widget.TextView textView, sj3.a1 a1Var) {
        this.f408700d = imageView;
        this.f408701e = textView;
        this.f408702f = a1Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.ControlPanelLogic", "mic btn state: " + bool);
        kotlin.jvm.internal.o.d(bool);
        boolean booleanValue = bool.booleanValue();
        sj3.a1 a1Var = this.f408702f;
        android.widget.TextView textView = this.f408701e;
        android.widget.ImageView imageView = this.f408700d;
        if (booleanValue) {
            imageView.setSelected(true);
            textView.setText(com.tencent.mm.R.string.h2b);
            imageView.setContentDescription(a1Var.f408393d.getString(com.tencent.mm.R.string.h2b));
        } else {
            imageView.setSelected(false);
            textView.setText(com.tencent.mm.R.string.h2a);
            imageView.setContentDescription(a1Var.f408393d.getString(com.tencent.mm.R.string.h2a));
        }
    }
}
