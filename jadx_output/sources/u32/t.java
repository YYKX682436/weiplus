package u32;

/* loaded from: classes13.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f424367d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f424368e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u32.u f424369f;

    public t(u32.u uVar, java.lang.String str, boolean z17) {
        this.f424369f = uVar;
        this.f424367d = str;
        this.f424368e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (u32.h1.c().f99006a != null) {
            u32.n0 n0Var = u32.h1.c().f99006a;
            ((u32.k1) n0Var).a(this.f424367d, this.f424368e, this.f424369f);
        }
    }
}
