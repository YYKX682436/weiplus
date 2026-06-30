package df2;

/* loaded from: classes3.dex */
public final class d00 implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f229929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.m00 f229930e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v65.n f229931f;

    public d00(com.tencent.mm.view.MMPAGView mMPAGView, df2.m00 m00Var, v65.n nVar) {
        this.f229929d = mMPAGView;
        this.f229930e = m00Var;
        this.f229931f = nVar;
    }

    @Override // ym5.w1
    public void a(com.tencent.mm.view.MMPAGView mMPAGView) {
        this.f229929d.i(this);
        this.f229931f.a(jz5.f0.f302826a);
    }

    @Override // ym5.w1
    public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
        this.f229929d.i(this);
        df2.m00.b7(this.f229930e);
        this.f229931f.a(jz5.f0.f302826a);
    }
}
