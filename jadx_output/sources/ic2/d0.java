package ic2;

/* loaded from: classes8.dex */
public final class d0 implements com.tencent.mm.app.t2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ic2.l0 f290323d;

    public d0(ic2.l0 l0Var) {
        this.f290323d = l0Var;
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        ((ku5.t0) ku5.t0.f312615d).B(new ic2.c0(this.f290323d));
    }
}
