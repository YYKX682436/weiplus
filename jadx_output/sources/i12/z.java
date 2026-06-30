package i12;

/* loaded from: classes15.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i12.a0 f287269d;

    public z(i12.a0 a0Var) {
        this.f287269d = a0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        i12.c0 c0Var = this.f287269d.f287165a;
        if (c0Var != null) {
            c0Var.notifyDataSetChanged();
        }
    }
}
