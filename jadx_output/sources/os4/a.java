package os4;

/* loaded from: classes8.dex */
public abstract class a {
    public static final void a(androidx.lifecycle.j0 j0Var, java.lang.Object obj) {
        if (j0Var == null) {
            return;
        }
        if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
            j0Var.setValue(obj);
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new os4.b(j0Var, obj, null));
    }
}
