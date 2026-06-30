package oh1;

/* loaded from: classes4.dex */
public class h2 implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f345226d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f345227e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ oh1.j2 f345228f;

    public h2(oh1.j2 j2Var, java.util.LinkedList linkedList, java.util.LinkedList linkedList2) {
        this.f345228f = j2Var;
        this.f345226d = linkedList;
        this.f345227e = linkedList2;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        java.util.LinkedList linkedList;
        r45.up3 up3Var = (r45.up3) oVar.f70711b.f70700a;
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaUpdateableMsgService", "getUpdateableMsg errType:%d errCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        oh1.j2 j2Var = this.f345228f;
        if (i17 == 0 && i18 == 0 && (linkedList = up3Var.f387546d) != null && linkedList.size() > 0) {
            java.util.LinkedList linkedList2 = up3Var.f387546d;
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaUpdateableMsgService", "getUpdateableMsg response.updatable_msg_list.size:%d", java.lang.Integer.valueOf(linkedList2.size()));
            oh1.j2.a(j2Var, linkedList2);
            oh1.j2.b(j2Var, linkedList2, 0);
            oh1.j2.d(j2Var, linkedList2);
            j2Var.h();
        } else if (i17 == 4) {
            oh1.j2.e(j2Var, this.f345226d, this.f345227e);
            oh1.j2.f(j2Var);
        }
        return 0;
    }
}
