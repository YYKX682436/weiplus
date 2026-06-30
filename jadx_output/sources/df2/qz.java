package df2;

/* loaded from: classes3.dex */
public final class qz implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f231201d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.a00 f231202e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v65.n f231203f;

    public qz(com.tencent.mm.view.MMPAGView mMPAGView, df2.a00 a00Var, v65.n nVar) {
        this.f231201d = mMPAGView;
        this.f231202e = a00Var;
        this.f231203f = nVar;
    }

    @Override // ym5.w1
    public void a(com.tencent.mm.view.MMPAGView mMPAGView) {
        this.f231201d.i(this);
        this.f231203f.a(jz5.f0.f302826a);
    }

    @Override // ym5.w1
    public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
        this.f231201d.i(this);
        df2.a00.Z6(this.f231202e);
        this.f231203f.a(jz5.f0.f302826a);
    }
}
