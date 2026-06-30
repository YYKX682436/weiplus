package za4;

/* loaded from: classes4.dex */
public class u0 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f471201d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f471202e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f471203f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f471204g;

    public u0(java.lang.String str, android.content.Context context, android.content.Intent intent, int i17) {
        this.f471201d = str;
        this.f471202e = context;
        this.f471203f = intent;
        this.f471204g = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        boolean z17;
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$1");
        m54.y yVar = (m54.y) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$1");
        java.lang.String str3 = this.f471201d;
        if (yVar == null || android.text.TextUtils.isEmpty(yVar.b()) || !za4.z0.u(yVar.b())) {
            str = "";
            z17 = false;
        } else {
            str = a84.o0.h(yVar.b(), str3);
            if (android.text.TextUtils.isEmpty(str)) {
                str = str3;
            }
            z17 = za4.z0.u(str);
        }
        android.content.Context context = this.f471202e;
        if (z17) {
            android.content.Intent intent = this.f471203f;
            a54.g.b(context, intent, str);
            intent.putExtra("sns_landing_pages_xml", str);
            android.content.Context context2 = this.f471202e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            str2 = "invoke";
            yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPagesParseHelper$1", "invoke", "(Lcom/tencent/mm/plugin/sns/ad/landingpage/dynamic/PageElement;)Lkotlin/Unit;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context2, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPagesParseHelper$1", "invoke", "(Lcom/tencent/mm/plugin/sns/ad/landingpage/dynamic/PageElement;)Lkotlin/Unit;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            if (com.tencent.mm.plugin.sns.storage.ADXml.isTwistAdCanvas(str) || com.tencent.mm.plugin.sns.storage.ADXml.isShakeAdCanvas(str) || com.tencent.mm.plugin.sns.storage.ADXml.isSimpleSharedShakeAd(str)) {
                ((android.app.Activity) context).overridePendingTransition(0, 0);
            }
        } else {
            str2 = "invoke";
            com.tencent.mars.xlog.Log.i("AdLandingPagesParseHelper", "jumpNative() use old xml");
            za4.z0.y(str3, dm.n.COL_ADXML, context, false, this.f471204g);
        }
        java.lang.String str4 = str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str4, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str4, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$1");
        return f0Var;
    }
}
