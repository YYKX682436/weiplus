package to3;

/* loaded from: classes9.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f420985d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f420986e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ to3.a0 f420987f;

    public x(to3.a0 a0Var, int i17, int i18) {
        this.f420987f = a0Var;
        this.f420985d = i17;
        this.f420986e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f420987f.b(this.f420985d, this.f420986e);
    }
}
