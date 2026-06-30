package vq4;

/* loaded from: classes14.dex */
public final class j0 implements nq4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vq4.m0 f439317a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f439318b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f439319c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f439320d;

    public j0(vq4.m0 m0Var, java.lang.String str, boolean z17, boolean z18) {
        this.f439317a = m0Var;
        this.f439318b = str;
        this.f439319c = z17;
        this.f439320d = z18;
    }

    @Override // nq4.a
    public void onDone() {
        vq4.m0 m0Var = this.f439317a;
        vq4.o0 o0Var = m0Var.f439349m;
        if (o0Var != null) {
            java.lang.Integer valueOf = o0Var != null ? java.lang.Integer.valueOf(o0Var.f439369a) : null;
            kotlin.jvm.internal.o.d(valueOf);
            if (vq4.n0.e(valueOf.intValue())) {
                m0Var.e(this.f439318b, this.f439319c, this.f439320d);
            }
        }
    }
}
