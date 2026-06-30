package wu3;

/* loaded from: classes5.dex */
public final class g2 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.LinearLayout f449747d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(android.content.Context context) {
        super(context);
        com.tencent.wechat.aff.udr.x Ui;
        kotlin.jvm.internal.o.g(context, "context");
        kotlinx.coroutines.z0.b();
        android.view.View.inflate(context, com.tencent.mm.R.layout.dxr, this);
        setGravity(1);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.s_e);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        ((android.widget.TextView) findViewById).setText(getSpannableString());
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.s_d);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        ((android.widget.TextView) findViewById2).setText(context.getString(com.tencent.mm.R.string.n2q));
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.s_c);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f449747d = (android.widget.LinearLayout) findViewById3;
        com.tencent.mm.udr.e0 e0Var = (com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class);
        java.util.ArrayList<qu3.e> arrayList = null;
        if (e0Var != null && (Ui = ((com.tencent.mm.udr.a1) e0Var).Ui("ilinkres_806b4baf", "SecondCutPromotionItems")) != null) {
            com.tencent.mars.xlog.Log.i("UDRSecondCutPromotionItems", "Resource info: %s", Ui.toString());
            java.lang.String c17 = Ui.c();
            if (c17 == null) {
                com.tencent.mars.xlog.Log.e("UDRSecondCutPromotionItems", "resource.postPath is null");
            } else {
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(c17, "resource");
                if (r6Var.m() && r6Var.y()) {
                    java.lang.String l17 = com.tencent.mm.vfs.e8.l("config.json", false, true);
                    com.tencent.mm.vfs.z7 z7Var = r6Var.f213166d;
                    if (l17 != null && !l17.isEmpty()) {
                        java.lang.String str = z7Var.f213279f;
                        z7Var = new com.tencent.mm.vfs.z7(z7Var.f213277d, z7Var.f213278e, str + '/' + l17, z7Var.f213280g, z7Var.f213281h);
                    }
                    com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(z7Var, null);
                    if (m17.a() ? m17.f213266a.F(m17.f213267b) : false) {
                        try {
                            java.lang.String M = com.tencent.mm.vfs.w6.M(z7Var.toString());
                            java.lang.String str2 = com.tencent.mm.sdk.platformtools.m2.m() ? "description_zh_Hans" : com.tencent.mm.sdk.platformtools.m2.n() ? "description_zh_Hant" : "description_en";
                            try {
                                org.json.JSONArray jSONArray = new org.json.JSONArray(M);
                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                c75.c.d(jSONArray, new qu3.f(r6Var, str2, arrayList2));
                                arrayList = arrayList2;
                            } catch (java.lang.ClassCastException e17) {
                                com.tencent.mars.xlog.Log.e("UDRSecondCutPromotionItems", "ClassCastException: " + e17.getMessage());
                            } catch (org.json.JSONException e18) {
                                com.tencent.mars.xlog.Log.e("UDRSecondCutPromotionItems", "Parse config json error: " + e18.getMessage());
                            }
                        } catch (java.io.IOException unused) {
                            com.tencent.mars.xlog.Log.e("UDRSecondCutPromotionItems", "Read config file %s failed", z7Var.toString());
                        }
                    } else {
                        com.tencent.mars.xlog.Log.w("UDRSecondCutPromotionItems", "Config file doesn't exist");
                    }
                }
            }
        }
        android.widget.LinearLayout linearLayout = this.f449747d;
        if (arrayList == null) {
            android.content.Context context2 = linearLayout.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            zu3.q qVar = new zu3.q(context2);
            qVar.a(com.tencent.mm.R.raw.icons_outlined_giff_effect_on, com.tencent.mm.R.string.n0u);
            linearLayout.addView(qVar);
            android.content.Context context3 = linearLayout.getContext();
            kotlin.jvm.internal.o.f(context3, "getContext(...)");
            zu3.q qVar2 = new zu3.q(context3);
            qVar2.a(com.tencent.mm.R.raw.icons_outlined_crop, com.tencent.mm.R.string.n0t);
            linearLayout.addView(qVar2);
            android.content.Context context4 = linearLayout.getContext();
            kotlin.jvm.internal.o.f(context4, "getContext(...)");
            zu3.q qVar3 = new zu3.q(context4);
            qVar3.a(com.tencent.mm.R.raw.icons_outlined_clock_1_0, com.tencent.mm.R.string.n0s);
            linearLayout.addView(qVar3);
        } else {
            for (qu3.e eVar : arrayList) {
                android.content.Context context5 = getContext();
                kotlin.jvm.internal.o.f(context5, "getContext(...)");
                zu3.q qVar4 = new zu3.q(context5);
                java.lang.String iconPath = eVar.f366821a;
                kotlin.jvm.internal.o.g(iconPath, "iconPath");
                java.lang.String text = eVar.f366822b;
                kotlin.jvm.internal.o.g(text, "text");
                ((wo0.b) dw3.w0.f244291a.i(iconPath)).c(qVar4.f475824d);
                qVar4.f475825e.setText(text);
                linearLayout.addView(qVar4);
            }
        }
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(this, "video_edit_other_miaojian_jump");
        ((cy1.a) aVar.ik(this, 32, 32337)).fk(this, "post_session_id", ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Bi());
    }

    private final android.text.SpannableString getSpannableString() {
        java.lang.String r17 = i65.a.r(getContext(), com.tencent.mm.R.string.n2r);
        android.text.SpannableString spannableString = new android.text.SpannableString(r17);
        kotlin.jvm.internal.o.d(r17);
        int K = r26.n0.K(r17, '~', 0, false, 6, null);
        int O = r26.n0.O(r17, '~', 0, false, 6, null);
        if (K != -1 && K != O) {
            wu3.f2 f2Var = new wu3.f2(i65.a.h(getContext(), com.tencent.mm.R.dimen.aih) / 2);
            int i17 = K + 1;
            spannableString.setSpan(f2Var, K, i17, 17);
            spannableString.setSpan(f2Var, O, O + 1, 17);
            android.graphics.drawable.Drawable e17 = com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_outlined_miaojian, -16777216);
            int h17 = i65.a.h(getContext(), com.tencent.mm.R.dimen.f479691cq);
            e17.setBounds(0, 0, h17, h17);
            spannableString.setSpan(new wu3.e2(e17), K, i17, 33);
        }
        return spannableString;
    }
}
