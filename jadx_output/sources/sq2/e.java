package sq2;

/* loaded from: classes2.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f411346d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f411347e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f411348f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.e0 e0Var, int i17) {
        super(0);
        this.f411346d = f0Var;
        this.f411347e = e0Var;
        this.f411348f = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = this.f411346d.f310116d;
        kotlin.jvm.internal.e0 e0Var = this.f411347e;
        if (i17 == 1) {
            i95.m c17 = i95.n0.c(ys5.f.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ys5.f.D6((ys5.f) c17, ys5.e.f465259g, e0Var.f310115d, null, 4, null);
        } else if (i17 != 2) {
            com.tencent.mars.xlog.Log.i("NearbyRefreshServiceImp", "finderLiveHomeEntranceExposePredict: predict do nothing, op=" + this.f411348f);
            if (((sq2.g) ((ys5.f) i95.n0.c(ys5.f.class))).Bi()) {
                ((sq2.g) ((ys5.f) i95.n0.c(ys5.f.class))).f411353h = "";
            }
        } else {
            i95.m c18 = i95.n0.c(ys5.f.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            ys5.f.D6((ys5.f) c18, ys5.e.f465256d, e0Var.f310115d, null, 4, null);
        }
        return jz5.f0.f302826a;
    }
}
