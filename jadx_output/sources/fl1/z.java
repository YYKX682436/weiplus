package fl1;

/* loaded from: classes14.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fl1.b2 f263896d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fl1.c0 f263897e;

    public z(fl1.c0 c0Var, fl1.b2 b2Var) {
        this.f263897e = c0Var;
        this.f263896d = b2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f263897e.a(this.f263896d);
    }
}
