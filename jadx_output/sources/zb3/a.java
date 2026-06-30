package zb3;

/* loaded from: classes9.dex */
public class a extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zb3.b f471265c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(zb3.b bVar, com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        super(mMActivity, b0Var);
        this.f471265c = bVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        this.f338834b.d(new ac3.a(1, (java.lang.String) objArr[0], ""), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (!(m1Var instanceof ac3.a)) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ProcessManager", "OpenSnsPayProcess onSceneEnd, errType:" + i17 + " errCode:" + i18 + " errMsg:" + str);
        com.tencent.mm.ui.MMActivity mMActivity = this.f338833a;
        zb3.b bVar = this.f471265c;
        if (i17 == 0 && i18 == 0) {
            db5.e1.T(mMActivity, mMActivity.getString(com.tencent.mm.R.string.gml));
            bVar.getClass();
            com.tencent.mm.autogen.events.SnsLuckyMoneyIDKeyReportEvent snsLuckyMoneyIDKeyReportEvent = new com.tencent.mm.autogen.events.SnsLuckyMoneyIDKeyReportEvent();
            snsLuckyMoneyIDKeyReportEvent.f54824g.f6795a = 121;
            snsLuckyMoneyIDKeyReportEvent.e();
            bVar.f213801c.putBoolean("is_open_sns_pay", true);
            bVar.f(mMActivity, bVar.f213801c);
        } else {
            db5.e1.T(mMActivity, mMActivity.getString(com.tencent.mm.R.string.gmk));
            bVar.getClass();
            com.tencent.mm.autogen.events.SnsLuckyMoneyIDKeyReportEvent snsLuckyMoneyIDKeyReportEvent2 = new com.tencent.mm.autogen.events.SnsLuckyMoneyIDKeyReportEvent();
            snsLuckyMoneyIDKeyReportEvent2.f54824g.f6795a = 122;
            snsLuckyMoneyIDKeyReportEvent2.e();
            bVar.f(mMActivity, null);
        }
        return true;
    }
}
