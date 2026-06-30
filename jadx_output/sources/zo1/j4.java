package zo1;

/* loaded from: classes5.dex */
public final class j4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zo1.k4 f474659d;

    public j4(zo1.k4 k4Var) {
        this.f474659d = k4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zo1.k4 k4Var = this.f474659d;
        if (k4Var.f474674e.size() == 1) {
            k4Var.B(((com.tencent.wechat.aff.affroam.g) k4Var.f474674e.get(0)).f215829d);
            k4Var.notifyDataSetChanged();
        }
    }
}
