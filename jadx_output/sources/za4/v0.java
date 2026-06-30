package za4;

/* loaded from: classes4.dex */
public class v0 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f471207d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f471208e;

    public v0(android.content.Intent intent, android.content.Context context) {
        this.f471207d = intent;
        this.f471208e = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$2");
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$2");
        com.tencent.mars.xlog.Log.i("AdLandingPagesParseHelper", "jumpNative() use replaced xml");
        android.content.Intent intent = this.f471207d;
        intent.putExtra("sns_landing_pages_xml", str);
        android.content.Context context = this.f471208e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPagesParseHelper$2", "invoke", "(Ljava/lang/String;)Lkotlin/Unit;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPagesParseHelper$2", "invoke", "(Ljava/lang/String;)Lkotlin/Unit;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        if (com.tencent.mm.plugin.sns.storage.ADXml.isTwistAdCanvas(str) || com.tencent.mm.plugin.sns.storage.ADXml.isShakeAdCanvas(str) || com.tencent.mm.plugin.sns.storage.ADXml.isSimpleSharedShakeAd(str)) {
            ((android.app.Activity) this.f471208e).overridePendingTransition(0, 0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$2");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$2");
        return f0Var;
    }
}
