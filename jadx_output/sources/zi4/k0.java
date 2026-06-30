package zi4;

/* loaded from: classes11.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zi4.l0 f473232d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(zi4.l0 l0Var) {
        super(0);
        this.f473232d = l0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.animation.ObjectAnimator objectAnimator;
        zi4.l0 l0Var = this.f473232d;
        java.lang.ref.WeakReference weakReference = l0Var.f473181e;
        java.lang.Object obj = weakReference != null ? (android.content.Context) weakReference.get() : null;
        com.tencent.mm.plugin.textstatus.ui.TextStatusNewActivity textStatusNewActivity = obj instanceof com.tencent.mm.plugin.textstatus.ui.TextStatusNewActivity ? (com.tencent.mm.plugin.textstatus.ui.TextStatusNewActivity) obj : null;
        if (textStatusNewActivity != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatusNewActivity", "doEnterAnim: ");
            if (!textStatusNewActivity.isFinishing() && !textStatusNewActivity.isDestroyed() && (objectAnimator = textStatusNewActivity.f173654v) != null) {
                objectAnimator.start();
            }
        }
        com.tencent.mars.xlog.Log.i(l0Var.f473234g, "handleRequest: " + textStatusNewActivity);
        return jz5.f0.f302826a;
    }
}
