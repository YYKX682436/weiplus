package gu0;

/* loaded from: classes5.dex */
public final class y0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gu0.k2 f275861d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f275862e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(gu0.k2 k2Var, yz5.a aVar) {
        super(0);
        this.f275861d = k2Var;
        this.f275862e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MJCC.Session", "openEditPage: LiteApp opened successfully");
        this.f275861d.f275732h = true;
        yz5.a aVar = this.f275862e;
        if (aVar != null) {
            aVar.invoke();
        }
        return jz5.f0.f302826a;
    }
}
