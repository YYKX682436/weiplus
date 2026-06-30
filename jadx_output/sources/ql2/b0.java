package ql2;

/* loaded from: classes10.dex */
public final class b0 implements zy2.k5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ql2.d0 f364499a;

    public b0(ql2.d0 d0Var) {
        this.f364499a = d0Var;
    }

    @Override // zy2.k5
    public void a(int i17, int i18, java.lang.String str, r45.z61 resp) {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        r45.nw1 liveInfo;
        kotlin.jvm.internal.o.g(resp, "resp");
        if (i17 != 0 || i18 != 0 || (finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) resp.getCustom(1)) == null || (liveInfo = finderObject.getLiveInfo()) == null) {
            return;
        }
        ql2.d0 d0Var = this.f364499a;
        d0Var.f364503e.put(pm0.v.u(liveInfo.getLong(0)), liveInfo);
        if (d0Var.f364504f == 1) {
            d0Var.p();
        }
    }
}
