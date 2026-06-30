package u94;

/* loaded from: classes4.dex */
public class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f425868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo f425869e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u94.o f425870f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f425871g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u94.p f425872h;

    public k(u94.p pVar, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo, u94.o oVar, android.content.Context context) {
        this.f425872h = pVar;
        this.f425868d = snsInfo;
        this.f425869e = adClickActionInfo;
        this.f425870f = oVar;
        this.f425871g = context;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = this.f425869e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/controller/HalfSubscribeController$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f425868d;
        if (snsInfo != null) {
            try {
                java.lang.String uxinfo = snsInfo.getUxinfo();
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                java.lang.String str = "";
                java.lang.String str2 = uxinfo == null ? "" : uxinfo;
                java.lang.String aid = snsInfo.getAid();
                if (aid != null) {
                    str = aid;
                }
                ib4.j jVar = new ib4.j(adClickActionInfo.f162583h, str2, com.tencent.mm.sdk.platformtools.t8.E1(str), adClickActionInfo.f162611v);
                gm0.j1.d().a(2810, this.f425870f);
                gm0.j1.d().g(jVar);
                com.tencent.mm.sdk.platformtools.u3.h(new u94.j(this));
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("HalfSubscribeController", th6.toString());
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/controller/HalfSubscribeController$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$3");
    }
}
