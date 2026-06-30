package m11;

/* loaded from: classes12.dex */
public class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.v0 f322799d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f322800e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f322801f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m11.t0 f322802g;

    public u0(m11.t0 t0Var, com.tencent.mm.modelbase.v0 v0Var, int i17, int i18) {
        this.f322802g = t0Var;
        this.f322799d = v0Var;
        this.f322800e = i17;
        this.f322801f = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f322799d.S(this.f322800e, this.f322801f, this.f322802g);
    }
}
