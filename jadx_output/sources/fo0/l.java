package fo0;

/* loaded from: classes3.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fo0.n f264816d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f264817e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(fo0.n nVar, int i17) {
        super(0);
        this.f264816d = nVar;
        this.f264817e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fo0.n nVar = this.f264816d;
        com.tencent.mm.live.core.mini.AbsLiveMiniView absLiveMiniView = nVar.f264824h;
        if (absLiveMiniView != null) {
            absLiveMiniView.f(this.f264817e);
        }
        fo0.n.a(nVar);
        return jz5.f0.f302826a;
    }
}
