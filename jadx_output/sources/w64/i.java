package w64;

/* loaded from: classes4.dex */
public class i implements zy2.c6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelsns.SnsAdClick f443303a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w64.n f443304b;

    public i(w64.n nVar, com.tencent.mm.modelsns.SnsAdClick snsAdClick) {
        this.f443304b = nVar;
        this.f443303a = snsAdClick;
    }

    @Override // zy2.c6
    public void a(zy2.dc dcVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDone", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler$4");
        if (dcVar != null) {
            ya2.b2 b2Var = (ya2.b2) dcVar;
            int i17 = b2Var.field_follow_Flag;
            int i18 = b2Var.field_friendFollowCount;
            int i19 = b2Var.field_feedCount;
            com.tencent.mars.xlog.Log.i("AdClickActionHandler", "handleQuickAddFinder, getFinderContact onDone, followFlg=" + i17 + ", followNum=" + i18 + ", feedNum=" + i19);
            com.tencent.mm.modelsns.SnsAdClick snsAdClick = this.f443303a;
            if (i17 == 0) {
                snsAdClick.f71470h = 47;
                com.tencent.mm.sdk.platformtools.u3.h(new w64.g(this, i18, i19));
            } else {
                snsAdClick.f71470h = 37;
                com.tencent.mm.sdk.platformtools.u3.h(new w64.h(this));
            }
            ca4.z0.x0(snsAdClick);
        } else {
            com.tencent.mars.xlog.Log.e("AdClickActionHandler", "handleQuickAddFinder, getFinderContact onDone, iLocalFinderContact==null");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDone", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler$4");
    }
}
