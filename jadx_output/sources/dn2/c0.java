package dn2;

/* loaded from: classes3.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cn2.p0 f241896d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dn2.d0 f241897e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f241898f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(cn2.p0 p0Var, dn2.d0 d0Var, android.view.View view) {
        super(1);
        this.f241896d = p0Var;
        this.f241897e = d0Var;
        this.f241898f = view;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        cn2.p0 p0Var = this.f241896d;
        p0Var.f43599j = booleanValue;
        dn2.d0 d0Var = this.f241897e;
        if (booleanValue) {
            d0Var.e(3, 1);
            p0Var.b().j(-1);
        } else {
            d0Var.e(4, 1);
            kotlinx.coroutines.r2 r2Var = d0Var.f241905e;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            d0Var.f241905e = com.tencent.mm.plugin.finder.live.util.y.m(p0Var.f43591b, null, null, new dn2.b0(d0Var, p0Var, this.f241898f, null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}
