package gu0;

/* loaded from: classes5.dex */
public final class z0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gu0.k2 f275864d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f275865e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(gu0.k2 k2Var, yz5.a aVar) {
        super(0);
        this.f275864d = k2Var;
        this.f275865e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f275864d.f275732h = false;
        com.tencent.mars.xlog.Log.e("MJCC.Session", "openEditPage: LiteApp open failed");
        yz5.a aVar = this.f275865e;
        if (aVar != null) {
            aVar.invoke();
        }
        return jz5.f0.f302826a;
    }
}
