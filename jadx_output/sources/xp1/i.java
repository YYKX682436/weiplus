package xp1;

/* loaded from: classes11.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xp1.p f455886d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f455887e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.util.Pair f455888f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f455889g;

    public i(xp1.p pVar, android.content.Context context, android.util.Pair pair, boolean z17) {
        this.f455886d = pVar;
        this.f455887e = context;
        this.f455888f = pair;
        this.f455889g = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            cr3.d0 d0Var = ((cr3.m) this.f455886d).f221957a;
            xp1.c.c(d0Var.f221931d, d0Var.f221932e.d1(), true);
            android.content.Context context = this.f455887e;
            android.util.Pair pair = this.f455888f;
            xp1.d.h(context, ((java.lang.Integer) pair.first).intValue(), ((java.lang.Integer) pair.second).intValue(), this.f455889g, null, false);
        } catch (java.lang.IllegalStateException e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ShortcutUtil", e17.toString());
        }
    }
}
