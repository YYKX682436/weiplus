package hs1;

/* loaded from: classes4.dex */
public class c implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f284563d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.p9 f284564e;

    public c(int i17, r45.p9 p9Var) {
        this.f284563d = i17;
        this.f284564e = p9Var;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Preload.BizAppMsgReportMgr", "callback, errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        r45.r9 r9Var = (r45.r9) oVar.f70711b.f70700a;
        int i19 = this.f284563d;
        r45.p9 p9Var = this.f284564e;
        if (i17 == 0 && i18 == 0 && r9Var != null) {
            if (i19 > 0) {
                ax4.a.a(57);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Preload.BizAppMsgReportMgr", "[report sync]url:%s", p9Var.f382861d);
            ax4.a.a(51);
        } else if (i18 != 50001) {
            if (i19 > 0) {
                ax4.a.a(58);
            }
            ax4.a.a(52);
            if (yq1.u0.wi().insert(new hs1.a(p9Var))) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Preload.BizAppMsgReportMgr", "[report sync]");
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.Preload.BizAppMsgReportMgr", "[report sync], insert fail");
            }
        } else if (i19 < 3) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(p9Var);
            com.tencent.mm.modelbase.z2.d(hs1.e.a(linkedList, 0).a(), new hs1.c(i19 + 1, p9Var), false);
        } else {
            ax4.a.a(52);
            ax4.a.a(59);
            if (yq1.u0.wi().insert(new hs1.a(p9Var))) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Preload.BizAppMsgReportMgr", "[report sync]");
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.Preload.BizAppMsgReportMgr", "[report sync], insert fail");
            }
        }
        return 0;
    }
}
