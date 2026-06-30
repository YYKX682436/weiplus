package hs1;

/* loaded from: classes4.dex */
public class d implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f284565d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f284566e;

    public d(java.util.LinkedList linkedList, java.util.List list) {
        this.f284565d = linkedList;
        this.f284566e = list;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Preload.BizAppMsgReportMgr", "callback, errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        r45.r9 r9Var = (r45.r9) oVar.f70711b.f70700a;
        java.util.LinkedList linkedList = this.f284565d;
        if (i17 != 0 || i18 != 0 || r9Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Preload.BizAppMsgReportMgr", "[report batch]reportList:%d fail", java.lang.Integer.valueOf(linkedList.size()));
            ax4.a.a(55);
            return 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Preload.BizAppMsgReportMgr", "[report batch]reportList:%d", java.lang.Integer.valueOf(linkedList.size()));
        ax4.a.a(54);
        yq1.u0.wi().z0(this.f284566e);
        return 0;
    }
}
