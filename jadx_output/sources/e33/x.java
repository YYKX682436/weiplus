package e33;

/* loaded from: classes10.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e33.a0 f247533d;

    public x(e33.a0 a0Var) {
        this.f247533d = a0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.TextView textView;
        e33.a0 a0Var = this.f247533d;
        if (a0Var.f247111f != null) {
            int i17 = a0Var.f247110e.f138446x;
            java.lang.ref.WeakReference weakReference = a0Var.f247109d;
            if (weakReference == null || (textView = (android.widget.TextView) weakReference.get()) == null) {
                return;
            }
            e33.a0.c(textView, i17);
            e33.a0.f247108h.remove(textView);
        }
    }
}
