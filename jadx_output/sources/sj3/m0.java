package sj3;

/* loaded from: classes14.dex */
public final class m0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.a1 f408628d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f408629e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f408630f;

    public m0(sj3.a1 a1Var, android.widget.ImageView imageView, android.widget.TextView textView) {
        this.f408628d = a1Var;
        this.f408629e = imageView;
        this.f408630f = textView;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        boolean Di = ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Di(com.tencent.mm.plugin.multitalk.model.e3.Di().f473174o.a());
        sj3.a1 a1Var = this.f408628d;
        a1Var.G = Di;
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.ControlPanelLogic", "speakeron btn state: " + num + ", " + a1Var.G);
        a1Var.H.a();
        boolean z17 = a1Var.G;
        android.widget.TextView textView = this.f408630f;
        android.widget.ImageView imageView = this.f408629e;
        if (z17) {
            imageView.setActivated(true);
            imageView.setSelected(true);
            com.tencent.mm.plugin.multitalk.model.e3.Di().f473174o.getClass();
            java.lang.String str = ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Bi().f222517b;
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.ControlPanelLogic", "speakeron btn state: " + str);
            textView.setText(str);
            imageView.setContentDescription(str);
            return;
        }
        imageView.setActivated(false);
        com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI multiTalkMainUI = a1Var.f408393d;
        if (num != null && num.intValue() == 1) {
            imageView.setSelected(true);
            textView.setText(com.tencent.mm.R.string.f492593h30);
            imageView.setContentDescription(multiTalkMainUI.getString(com.tencent.mm.R.string.f492593h30));
        } else {
            imageView.setSelected(false);
            textView.setText(com.tencent.mm.R.string.h2z);
            imageView.setContentDescription(multiTalkMainUI.getString(com.tencent.mm.R.string.h2z));
        }
    }
}
