package vw;

/* loaded from: classes7.dex */
public final class j1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vw.m2 f440665d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(vw.m2 m2Var) {
        super(0);
        this.f440665d = m2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(kotlin.jvm.internal.o.b(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_enable_sep_new_route_session_id_android", "0"), "1"));
        boolean booleanValue = valueOf.booleanValue();
        com.tencent.mars.xlog.Log.i(this.f440665d.f440684d, "enableSepNewRouteSessionId " + booleanValue);
        return valueOf;
    }
}
