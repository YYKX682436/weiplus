package sj3;

/* loaded from: classes4.dex */
public final class p0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f408676d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f408677e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sj3.a1 f408678f;

    public p0(android.widget.ImageView imageView, android.widget.TextView textView, sj3.a1 a1Var) {
        this.f408676d = imageView;
        this.f408677e = textView;
        this.f408678f = a1Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.ControlPanelLogic", "camera btn state: " + bool);
        kotlin.jvm.internal.o.d(bool);
        boolean booleanValue = bool.booleanValue();
        sj3.a1 a1Var = this.f408678f;
        android.widget.TextView textView = this.f408677e;
        android.widget.ImageView imageView = this.f408676d;
        if (booleanValue) {
            imageView.setSelected(true);
            textView.setText(com.tencent.mm.R.string.f492584h15);
            imageView.setContentDescription(a1Var.f408393d.getString(com.tencent.mm.R.string.f492584h15));
        } else {
            imageView.setSelected(false);
            textView.setText(com.tencent.mm.R.string.f492583h14);
            imageView.setContentDescription(a1Var.f408393d.getString(com.tencent.mm.R.string.f492583h14));
        }
    }
}
