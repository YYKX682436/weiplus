package mm2;

/* loaded from: classes3.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm2.c1 f328740d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f328741e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f328742f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(mm2.c1 c1Var, java.util.LinkedList linkedList, boolean z17) {
        super(0);
        this.f328740d = c1Var;
        this.f328741e = linkedList;
        this.f328742f = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mm2.c1 c1Var = this.f328740d;
        c1Var.f328815h4.clear();
        java.util.LinkedList linkedList = this.f328741e;
        java.util.List list = c1Var.f328815h4;
        list.addAll(linkedList);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("printRedPacketInfoList(reset,fromJoinLive:" + this.f328742f + ")：");
        if (list != null) {
            int i17 = 0;
            for (java.lang.Object obj : list) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                sb6.append("index:" + i17 + ',' + ((r45.v62) obj) + "};");
                i17 = i18;
            }
        }
        com.tencent.mars.xlog.Log.i(c1Var.f328800f, sb6.toString());
        return jz5.f0.f302826a;
    }
}
