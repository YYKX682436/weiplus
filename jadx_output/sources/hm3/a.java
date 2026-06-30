package hm3;

/* loaded from: classes.dex */
public abstract class a extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.HashMap f282221h = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final int f282222d;

    /* renamed from: e, reason: collision with root package name */
    public final long f282223e;

    /* renamed from: f, reason: collision with root package name */
    public long f282224f;

    /* renamed from: g, reason: collision with root package name */
    public long f282225g;

    public a(int i17) {
        this.f282222d = i17;
        this.f282223e = c01.id.c();
        this.f282224f = c01.id.c();
        this.f282225g = c01.id.c();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int dispatch(com.tencent.mm.network.s sVar, com.tencent.mm.network.v0 v0Var, com.tencent.mm.network.l0 l0Var) {
        this.f282224f = c01.id.c();
        return super.dispatch(sVar, v0Var, l0Var);
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f282225g = c01.id.c();
        f282221h.put(java.lang.Integer.valueOf(getType()), new hm3.b(getType(), this.f282223e, this.f282224f, this.f282225g));
    }

    public /* synthetic */ a(int i17, int i18, kotlin.jvm.internal.i iVar) {
        this((i18 & 1) != 0 ? 0 : i17);
    }
}
