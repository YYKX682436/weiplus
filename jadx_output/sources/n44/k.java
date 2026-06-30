package n44;

/* loaded from: classes4.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n44.p f334956d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f334957e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f334958f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f334959g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f334960h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f334961i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f334962m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f334963n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ s34.p1 f334964o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f334965p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n44.p pVar, android.content.Intent intent, int i17, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, s34.p1 p1Var, java.lang.String str4) {
        super(4);
        this.f334956d = pVar;
        this.f334957e = intent;
        this.f334958f = i17;
        this.f334959g = context;
        this.f334960h = str;
        this.f334961i = str2;
        this.f334962m = str3;
        this.f334963n = i18;
        this.f334964o = p1Var;
        this.f334965p = str4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper$doHalfScreenWeComProfile$3$1$1");
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        com.tencent.mm.modelbase.m1 m1Var = (com.tencent.mm.modelbase.m1) obj4;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper$doHalfScreenWeComProfile$3$1$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doHalfScreenWeComProfile, errType is ");
        sb6.append(intValue);
        sb6.append(", errCode is ");
        sb6.append(intValue2);
        sb6.append(", errMsg is ");
        sb6.append((java.lang.String) obj3);
        sb6.append(", scene type is ");
        sb6.append(m1Var != 0 ? java.lang.Integer.valueOf(m1Var.getType()) : null);
        com.tencent.mars.xlog.Log.i("AdHalfScreenJumpHelper", sb6.toString());
        n44.p.a(this.f334956d);
        android.content.Context context = this.f334959g;
        if (intValue == 0 && intValue2 == 0) {
            if (m1Var != 0 && m1Var.getType() == 372) {
                ab0.v vVar = m1Var instanceof ab0.v ? (ab0.v) m1Var : null;
                r45.cx5 cx5Var = vVar != null ? ((l41.e0) vVar).f315803g : null;
                java.lang.String str = cx5Var != null ? cx5Var.f371900d : null;
                if (str == null) {
                    str = "";
                }
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("doHalfScreenWeComProfile username=");
                sb7.append(str);
                sb7.append(", nickname=");
                sb7.append(cx5Var != null ? cx5Var.f371901e : null);
                com.tencent.mars.xlog.Log.i("AdHalfScreenJumpHelper", sb7.toString());
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    dp.a.makeText(context, com.tencent.mm.R.string.icr, 0).show();
                } else {
                    com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
                    android.content.Intent intent = this.f334957e;
                    qk.p.b(intent, cx5Var, 181);
                    if (n17 != null && !n17.r2()) {
                        intent.putExtra("Contact_IsLBSFriend", true);
                    }
                    intent.putExtra("Contact_IsHalfScreen", true);
                    intent.putExtra("scroll_to_top", 0);
                    intent.putExtra("click_action_type", this.f334958f);
                    intent.putExtra("is_half_screen_height_assigned", 1);
                    intent.setClass(context, com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.class);
                    android.content.Context context2 = this.f334959g;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/helper/halfscreen/AdHalfScreenJumpHelper$doHalfScreenWeComProfile$3$1$1", "invoke", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context2.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(context2, "com/tencent/mm/plugin/sns/ad/helper/halfscreen/AdHalfScreenJumpHelper$doHalfScreenWeComProfile$3$1$1", "invoke", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    ((com.tencent.mm.ui.MMActivity) context).overridePendingTransition(0, 0);
                }
                i17 = 0;
                java.lang.String str2 = this.f334960h;
                java.lang.String str3 = this.f334961i;
                java.lang.String str4 = this.f334962m;
                l44.p3 p3Var = l44.p3.f316299a;
                int f17 = p3Var.f(this.f334963n);
                s34.p1 p1Var = this.f334964o;
                java.lang.String a17 = p1Var.a();
                java.lang.String a18 = p1Var.a();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getQrExtInfo", "com.tencent.mm.plugin.sns.ad.adxml.QrClickActionInfo");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQrExtInfo", "com.tencent.mm.plugin.sns.ad.adxml.QrClickActionInfo");
                p3Var.e(new l44.j3(str2, str3, str4, f17, 11, i17, a17, a18, p1Var.f402739a, 1, 0, this.f334965p));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper$doHalfScreenWeComProfile$3$1$1");
                jz5.f0 f0Var = jz5.f0.f302826a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper$doHalfScreenWeComProfile$3$1$1");
                return f0Var;
            }
        }
        db5.t7.g(context, context.getString(com.tencent.mm.R.string.f493180ly4));
        i17 = 1;
        java.lang.String str22 = this.f334960h;
        java.lang.String str32 = this.f334961i;
        java.lang.String str42 = this.f334962m;
        l44.p3 p3Var2 = l44.p3.f316299a;
        int f172 = p3Var2.f(this.f334963n);
        s34.p1 p1Var2 = this.f334964o;
        java.lang.String a172 = p1Var2.a();
        java.lang.String a182 = p1Var2.a();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getQrExtInfo", "com.tencent.mm.plugin.sns.ad.adxml.QrClickActionInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQrExtInfo", "com.tencent.mm.plugin.sns.ad.adxml.QrClickActionInfo");
        p3Var2.e(new l44.j3(str22, str32, str42, f172, 11, i17, a172, a182, p1Var2.f402739a, 1, 0, this.f334965p));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper$doHalfScreenWeComProfile$3$1$1");
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper$doHalfScreenWeComProfile$3$1$1");
        return f0Var2;
    }
}
