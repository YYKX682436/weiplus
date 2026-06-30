package o01;

/* loaded from: classes.dex */
public final class b implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.o f341889d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u26.k0 f341890e;

    public b(com.tencent.mm.modelbase.o oVar, u26.k0 k0Var) {
        this.f341889d = oVar;
        this.f341890e = k0Var;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "FlowNetScene:" + this.f341889d.f70713d;
    }

    @Override // java.lang.Runnable
    public void run() {
        new o01.e(this.f341889d, this.f341890e).doScene(gm0.j1.d().f70764d, null);
    }
}
