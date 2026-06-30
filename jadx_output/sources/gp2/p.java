package gp2;

/* loaded from: classes2.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f274287d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gp2.l0 f274288e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.h1 f274289f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(yz5.a aVar, gp2.l0 l0Var, so2.h1 h1Var) {
        super(0);
        this.f274287d = aVar;
        this.f274288e = l0Var;
        this.f274289f = h1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yz5.a aVar = this.f274287d;
        if (aVar != null) {
            aVar.invoke();
        }
        boolean z17 = gp2.l0.N;
        com.tencent.mars.xlog.Log.i(this.f274288e.t(), "checkAutoPlayByOutside: liveFinishCallback feed=" + this.f274289f);
        return jz5.f0.f302826a;
    }
}
