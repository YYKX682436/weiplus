package kr2;

/* loaded from: classes8.dex */
public final class s implements com.tencent.mm.modelbase.h1 {
    @Override // com.tencent.mm.modelbase.n0
    public void b(r45.tp businessInfo) {
        kotlin.jvm.internal.o.g(businessInfo, "businessInfo");
        r45.al2 al2Var = new r45.al2();
        al2Var.parseFrom(businessInfo.f386637e.g());
        kr2.q.f311317h.a().c(al2Var, false, 0L);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("newNpsSurveyTaskConf taskId = ");
        sb6.append(al2Var.getLong(0));
        sb6.append(" positions = ");
        java.util.LinkedList list = al2Var.getList(2);
        kotlin.jvm.internal.o.f(list, "getFeed_pos(...)");
        sb6.append(kz5.n0.g0(list, null, null, null, 0, null, null, 63, null));
        sb6.append(" conditions = ");
        sb6.append(al2Var.getInteger(1));
        sb6.append(" deliver_scenes = ");
        sb6.append(al2Var.getInteger(3));
        sb6.append(" startTime = ");
        sb6.append(al2Var.getLong(4));
        sb6.append(" expireTime = ");
        sb6.append(al2Var.getLong(5));
        sb6.append(" excludeDays = ");
        sb6.append(al2Var.getInteger(6));
        com.tencent.mars.xlog.Log.i("Finder.NpsSurveyFuncMsgExtension", sb6.toString());
    }

    @Override // com.tencent.mm.modelbase.n0
    public void c(int i17, com.tencent.mm.modelbase.m0 m0Var) {
    }
}
