package wj2;

/* loaded from: classes10.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wj2.c0 f446646d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(wj2.c0 c0Var) {
        super(0);
        this.f446646d = c0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        wj2.c0 c0Var = this.f446646d;
        com.tencent.mars.xlog.Log.i(c0Var.getTAG(), "showContent bindMicUser:" + c0Var.getBindLinkMicUser() + " isAnchor:" + zl2.r4.f473950a.w1() + " bindMicUserIsSelf:" + c0Var.G());
        if (c0Var.getBindLinkMicUser() != null) {
            c0Var.i0();
        }
        return jz5.f0.f302826a;
    }
}
