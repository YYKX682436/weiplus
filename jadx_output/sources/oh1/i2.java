package oh1;

/* loaded from: classes4.dex */
public class i2 implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f345230d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f345231e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ oh1.j2 f345232f;

    public i2(oh1.j2 j2Var, java.util.LinkedList linkedList, java.util.LinkedList linkedList2) {
        this.f345232f = j2Var;
        this.f345230d = linkedList;
        this.f345231e = linkedList2;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        java.util.LinkedList linkedList;
        r45.bd3 bd3Var = (r45.bd3) oVar.f70711b.f70700a;
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaUpdateableMsgService", "GetChatToolMsg errType:%d errCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        oh1.j2 j2Var = this.f345232f;
        if (i17 != 0 || i18 != 0 || (linkedList = bd3Var.f370675d) == null || linkedList.size() <= 0) {
            if (i17 != 4) {
                return 0;
            }
            oh1.j2.e(j2Var, this.f345230d, this.f345231e);
            oh1.j2.f(j2Var);
            return 0;
        }
        java.util.LinkedList linkedList2 = bd3Var.f370675d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaUpdateableMsgService", "GetChatToolMsg response.updatable_msg_list.size:%d", java.lang.Integer.valueOf(linkedList2.size()));
        oh1.j2.a(j2Var, linkedList2);
        oh1.j2.b(j2Var, linkedList2, 1);
        oh1.j2.d(j2Var, linkedList2);
        j2Var.h();
        return 0;
    }
}
