package fl1;

/* loaded from: classes14.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fl1.b2 f263888d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fl1.c0 f263889e;

    public x(fl1.c0 c0Var, fl1.b2 b2Var) {
        this.f263889e = c0Var;
        this.f263888d = b2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f263889e.c(this.f263888d);
    }
}
