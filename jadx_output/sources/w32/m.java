package w32;

/* loaded from: classes13.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f442687d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f442688e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f442689f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f442690g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u32.w0 f442691h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ w32.n f442692i;

    public m(w32.n nVar, long j17, int i17, int i18, java.lang.String str, u32.w0 w0Var) {
        this.f442692i = nVar;
        this.f442687d = j17;
        this.f442688e = i17;
        this.f442689f = i18;
        this.f442690g = str;
        this.f442691h = w0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((w32.a) this.f442692i.f442693e).c(this.f442687d, this.f442688e, this.f442689f, this.f442690g, this.f442691h);
    }

    public java.lang.String toString() {
        return super.toString() + "|onTaskEnd";
    }
}
