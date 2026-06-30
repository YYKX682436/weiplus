package wt1;

/* loaded from: classes8.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f449369d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f449370e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f449371f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f449372g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ wt1.c0 f449373h;

    public z(wt1.c0 c0Var, java.lang.String str, int i17, int i18, int i19) {
        this.f449373h = c0Var;
        this.f449369d = str;
        this.f449370e = i17;
        this.f449371f = i18;
        this.f449372g = i19;
    }

    @Override // java.lang.Runnable
    public void run() {
        wt1.c0 c0Var = this.f449373h;
        java.lang.String str = this.f449369d;
        c0Var.c(str, this.f449370e, this.f449371f, this.f449372g);
        com.tencent.mars.xlog.Log.i("MicroMsg.CardMarkCodeMgr", "run the unmark task, the card is " + str + " system.time:" + java.lang.System.currentTimeMillis());
    }
}
