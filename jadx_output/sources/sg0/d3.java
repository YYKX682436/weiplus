package sg0;

/* loaded from: classes15.dex */
public final class d3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407699d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ su4.h2 f407700e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f407701f;

    public d3(java.lang.String str, su4.h2 h2Var, android.content.Context context) {
        this.f407699d = str;
        this.f407700e = h2Var;
        this.f407701f = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q80.e0 e0Var = new q80.e0();
        e0Var.f360675a = this.f407699d;
        e0Var.f360676b = this.f407700e.f412907b;
        e0Var.f360678d = false;
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Rj(this.f407701f, e0Var);
    }
}
