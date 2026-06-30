package sj3;

/* loaded from: classes.dex */
public final class n0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f408645d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f408646e;

    public n0(android.widget.ImageView imageView, android.widget.TextView textView) {
        this.f408645d = imageView;
        this.f408646e = textView;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.ControlPanelLogic", "cameraEnable state: " + bool);
        kotlin.jvm.internal.o.d(bool);
        boolean booleanValue = bool.booleanValue();
        android.widget.ImageView imageView = this.f408645d;
        imageView.setEnabled(booleanValue);
        imageView.setAlpha(bool.booleanValue() ? 1.0f : 0.3f);
        this.f408646e.setAlpha(bool.booleanValue() ? 1.0f : 0.3f);
    }
}
