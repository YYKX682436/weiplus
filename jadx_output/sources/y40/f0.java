package y40;

/* loaded from: classes8.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.mm.finder_box.k2 f459288d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y40.i0 f459289e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.tencent.wechat.mm.finder_box.k2 k2Var, y40.i0 i0Var) {
        super(0);
        this.f459288d = k2Var;
        this.f459289e = i0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedList<com.tencent.wechat.mm.finder_box.d0> appmsg_list = this.f459288d.f219579e.f219381d;
        kotlin.jvm.internal.o.f(appmsg_list, "appmsg_list");
        for (com.tencent.wechat.mm.finder_box.d0 d0Var : appmsg_list) {
            com.tencent.mars.xlog.Log.i(this.f459289e.f459295d, "syncAllFoldBlockMpArticle has been block key : " + d0Var.f219355d);
            r01.q3.oj().s(d0Var.f219355d, 3);
        }
        return jz5.f0.f302826a;
    }
}
