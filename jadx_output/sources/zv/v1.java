package zv;

/* loaded from: classes11.dex */
public final class v1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zv.e2 f476119d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(zv.e2 e2Var) {
        super(0);
        this.f476119d = e2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ((hw.o0) ((gw.i) i95.n0.c(gw.i.class))).Bi(8);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("shouldPrelayoutMagicCardWhenMainSessionExpose ");
        zv.e2 e2Var = this.f476119d;
        sb6.append(e2Var.f475951i);
        com.tencent.mars.xlog.Log.i(e2Var.f475946d, sb6.toString());
        if (e2Var.f475951i) {
            e2Var.f475951i = false;
            com.tencent.wechat.aff.brand_service.v.f216049c.e(zv.b2.f475913a);
        }
        return jz5.f0.f302826a;
    }
}
