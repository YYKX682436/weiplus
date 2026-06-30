package xc2;

/* loaded from: classes4.dex */
public final class w1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f453323d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f453324e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f453325f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f453326g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f453327h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f453328i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(kotlin.jvm.internal.c0 c0Var, android.content.Context context, xc2.p0 p0Var, in5.s0 s0Var, boolean z17, java.lang.String str) {
        super(0);
        this.f453323d = c0Var;
        this.f453324e = context;
        this.f453325f = p0Var;
        this.f453326g = s0Var;
        this.f453327h = z17;
        this.f453328i = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (this.f453323d.f310112d) {
            xc2.y2.P(xc2.y2.f453343a, this.f453324e, this.f453325f, 0, false, this.f453326g, 0.0f, 44, null);
        } else if (this.f453327h) {
            xc2.y2.f453343a.E(this.f453324e, this.f453328i);
        }
        return jz5.f0.f302826a;
    }
}
