package eg4;

/* loaded from: classes4.dex */
public class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eg4.t1 f252750d;

    public k1(eg4.t1 t1Var) {
        this.f252750d = t1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.database.Cursor all = r21.w.wi().getAll();
        eg4.t1 t1Var = this.f252750d;
        t1Var.s(all);
        t1Var.notifyDataSetChanged();
    }
}
