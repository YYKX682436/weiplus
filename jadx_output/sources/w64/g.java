package w64;

/* loaded from: classes4.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f443299d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f443300e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w64.i f443301f;

    public g(w64.i iVar, int i17, int i18) {
        this.f443301f = iVar;
        this.f443299d = i17;
        this.f443300e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler$4$1");
        w64.i iVar = this.f443301f;
        w64.n nVar = iVar.f443304b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        n74.d dVar = nVar.f443326s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        w64.n nVar2 = iVar.f443304b;
        if (dVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            android.content.Context context = nVar2.f443312e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            int i17 = nVar2.f443309b;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            w64.k kVar = nVar2.f443325r;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            n74.d dVar2 = new n74.d(context, i17, kVar);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
            nVar2.f443326s = dVar2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        n74.d dVar3 = nVar2.f443326s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo a17 = w64.n.a(nVar2);
        com.tencent.mm.plugin.sns.storage.SnsInfo b17 = w64.n.b(nVar2);
        dVar3.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showBottomSheet, followNum=");
        int i18 = this.f443299d;
        sb6.append(i18);
        sb6.append(", feedNum=");
        int i19 = this.f443300e;
        sb6.append(i19);
        sb6.append(", userName=");
        sb6.append(a17.finderUsername);
        sb6.append(", snsId=");
        sb6.append(ca4.z0.t0(b17.field_snsId));
        com.tencent.mars.xlog.Log.i("ActionBtnFollowFinderHelper", sb6.toString());
        dVar3.f335328e = a17;
        dVar3.f335327d = b17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderFollowInfo");
        s34.y yVar = new s34.y();
        java.lang.String str = a17.finderUsername;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        yVar.f402829a = str;
        java.lang.String str2 = a17.Y;
        if (str2 == null) {
            str2 = "";
        }
        yVar.f402830b = str2;
        java.lang.String str3 = a17.Z;
        if (str3 == null) {
            str3 = "";
        }
        yVar.f402831c = str3;
        java.lang.String str4 = a17.f162572b0;
        if (str4 == null) {
            str4 = "";
        }
        yVar.f402832d = str4;
        java.lang.String str5 = a17.f162588j0;
        if (str5 == null) {
            str5 = "";
        }
        yVar.f402833e = str5;
        java.lang.String str6 = a17.f162586i0;
        if (str6 == null) {
            str6 = "";
        }
        yVar.f402834f = str6;
        java.lang.String str7 = a17.f162584h0;
        yVar.f402835g = str7 != null ? str7 : "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderFollowInfo");
        dVar3.f335329f = yVar;
        dVar3.d(yVar, i18, i19);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler$4$1");
    }
}
