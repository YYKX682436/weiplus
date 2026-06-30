package dz4;

/* loaded from: classes5.dex */
public final class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz4.o1 f245340d;

    public l1(dz4.o1 o1Var) {
        this.f245340d = o1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.app.Activity activity;
        dz4.o1 o1Var = this.f245340d;
        java.lang.ref.WeakReference weakReference = ((ez4.u) o1Var.f245360a).f257944c;
        if (weakReference == null || (activity = (android.app.Activity) weakReference.get()) == null) {
            return;
        }
        o1Var.f245362c = db5.e1.Q(activity, activity.getString(com.tencent.mm.R.string.f490573yv), activity.getString(com.tencent.mm.R.string.f490604zq), true, true, new dz4.n1(o1Var));
    }
}
