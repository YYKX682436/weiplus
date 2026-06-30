package fl1;

/* loaded from: classes14.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fl1.c0 f263884d;

    public w(fl1.c0 c0Var) {
        this.f263884d = c0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        fl1.c0 c0Var = this.f263884d;
        c0Var.setBackgroundColor(0);
        c0Var.removeAllViews();
        c0Var.setVisibility(4);
    }
}
