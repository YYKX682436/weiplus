package e33;

/* loaded from: classes10.dex */
public class h3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f247252d;

    public h3(e33.w2 w2Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        e33.c2 c2Var;
        java.lang.ref.WeakReference weakReference = this.f247252d;
        if (weakReference == null || (c2Var = (e33.c2) weakReference.get()) == null) {
            return;
        }
        c2Var.notifyDataSetChanged();
    }
}
