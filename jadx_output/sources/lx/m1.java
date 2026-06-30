package lx;

/* loaded from: classes8.dex */
public final class m1 implements d85.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lx.r1 f321863a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f321864b;

    public m1(lx.r1 r1Var, yz5.l lVar) {
        this.f321863a = r1Var;
        this.f321864b = lVar;
    }

    @Override // d85.k0
    public final void onOp(java.lang.Boolean bool) {
        this.f321863a.getClass();
        kotlin.jvm.internal.o.d(bool);
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizLocationPlugin", "requestBusinessLocationPermission result: ".concat(bool.booleanValue() ? "granted" : "denied"));
        this.f321864b.invoke(bool);
    }
}
