package zi4;

/* loaded from: classes11.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zi4.n0 f473237d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(zi4.n0 n0Var) {
        super(0);
        this.f473237d = n0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.animation.ObjectAnimator objectAnimator;
        zi4.n0 n0Var = this.f473237d;
        java.lang.ref.WeakReference weakReference = n0Var.f473181e;
        java.lang.Object obj = weakReference != null ? (android.content.Context) weakReference.get() : null;
        com.tencent.mm.plugin.textstatus.ui.TextStatusNewActivity textStatusNewActivity = obj instanceof com.tencent.mm.plugin.textstatus.ui.TextStatusNewActivity ? (com.tencent.mm.plugin.textstatus.ui.TextStatusNewActivity) obj : null;
        if (textStatusNewActivity != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatusNewActivity", "doExitAnim: ");
            if (!textStatusNewActivity.isDestroyed() && (objectAnimator = textStatusNewActivity.f173654v) != null) {
                objectAnimator.reverse();
            }
        }
        com.tencent.mars.xlog.Log.i(n0Var.f473241g, "handleRequest: " + textStatusNewActivity);
        return jz5.f0.f302826a;
    }
}
