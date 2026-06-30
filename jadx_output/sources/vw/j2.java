package vw;

/* loaded from: classes8.dex */
public final class j2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.mm.biz.i3 f440666d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vw.m2 f440667e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(com.tencent.wechat.mm.biz.i3 i3Var, vw.m2 m2Var) {
        super(0);
        this.f440666d = i3Var;
        this.f440667e = m2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedList<com.tencent.wechat.mm.biz.h0> appmsg_list = this.f440666d.f218184e.f218175d;
        kotlin.jvm.internal.o.f(appmsg_list, "appmsg_list");
        for (com.tencent.wechat.mm.biz.h0 h0Var : appmsg_list) {
            com.tencent.mars.xlog.Log.i(this.f440667e.f440684d, "syncAllFoldBlockMpArticle has been block key : " + h0Var.f218093d);
            r01.q3.oj().s(h0Var.f218093d, 3);
        }
        return jz5.f0.f302826a;
    }
}
