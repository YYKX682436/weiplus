package gg4;

/* loaded from: classes11.dex */
public class p extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f271767d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchResultUI f271768e;

    public p(com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchResultUI contactSearchResultUI, android.content.Context context) {
        this.f271768e = contactSearchResultUI;
        this.f271767d = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchResultUI contactSearchResultUI = this.f271768e;
        return contactSearchResultUI.f172421e.size() + contactSearchResultUI.f172422f.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        gg4.r rVar;
        android.view.View view2;
        java.lang.String str;
        android.content.Context context = this.f271767d;
        if (view == null) {
            view2 = android.view.View.inflate(context, com.tencent.mm.R.layout.ciy, null);
            rVar = new gg4.r();
            rVar.f271772b = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.a9n);
            rVar.f271773c = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.kbg);
            rVar.f271775e = view2.findViewById(com.tencent.mm.R.id.f487538ox2);
            rVar.f271774d = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.hed);
            rVar.f271776f = view2.findViewById(com.tencent.mm.R.id.f483390aj3);
            view2.setTag(rVar);
        } else {
            rVar = (gg4.r) view.getTag();
            view2 = view;
        }
        com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchResultUI contactSearchResultUI = this.f271768e;
        if (i17 >= contactSearchResultUI.f172421e.size()) {
            r45.cx5 cx5Var = (r45.cx5) contactSearchResultUI.f172422f.get(i17 - contactSearchResultUI.f172421e.size());
            rVar.f271771a = cx5Var.f371900d;
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(rVar.f271772b, rVar.f271771a);
            rVar.f271772b.setTag(rVar.f271771a);
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(rVar.f271772b, rVar.f271771a, null);
            android.view.View view3 = rVar.f271775e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchResultUI$ContactSearchResultAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchResultUI$ContactSearchResultAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = rVar.f271776f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchResultUI$ContactSearchResultAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchResultUI$ContactSearchResultAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            rVar.f271774d.setText("");
            try {
                android.widget.TextView textView = rVar.f271773c;
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String str2 = cx5Var.f371901e;
                float textSize = rVar.f271773c.getTextSize();
                ((ke0.e) xVar).getClass();
                textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str2, textSize));
            } catch (java.lang.Exception unused) {
                rVar.f271773c.setText("");
            }
            return view2;
        }
        r45.gw5 gw5Var = (r45.gw5) contactSearchResultUI.f172421e.get(i17);
        if (gw5Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactSearchResultAdapter", "shouldnot be empty");
            return view2;
        }
        rVar.f271771a = gw5Var.f375561d.f372756d;
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(rVar.f271772b, rVar.f271771a);
        rVar.f271772b.setTag(rVar.f271771a);
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(rVar.f271772b, rVar.f271771a, null);
        java.lang.String str3 = gw5Var.f375561d.f372756d;
        gg4.q qVar = (gg4.q) ((java.util.HashMap) contactSearchResultUI.f172423g).get(str3);
        if (qVar == null) {
            qVar = new gg4.q(null);
            ((java.util.HashMap) contactSearchResultUI.f172423g).put(str3, qVar);
            r45.va0 va0Var = gw5Var.C;
            if (va0Var != null) {
                qk.o oVar = new qk.o();
                oVar.field_username = str3;
                oVar.field_brandFlag = va0Var.f388021d;
                oVar.field_brandIconURL = va0Var.f388024g;
                oVar.field_brandInfo = va0Var.f388023f;
                oVar.field_extInfo = va0Var.f388022e;
                qk.j k17 = oVar.D0(false) != null ? oVar.D0(false).k() : null;
                if (k17 != null) {
                    qk.n D0 = oVar.D0(false);
                    org.json.JSONObject jSONObject = D0.f364256a;
                    if (jSONObject != null) {
                        D0.f364278w = com.tencent.mm.sdk.platformtools.t8.P(jSONObject.optString("IsTrademarkProtection"), 0) == 1;
                    }
                    qVar.f271769a = D0.f364278w && !com.tencent.mm.sdk.platformtools.t8.K0(k17.f364177b);
                    qVar.f271770b = gw5Var.f375571q != 0;
                }
            }
        }
        android.view.View view5 = rVar.f271775e;
        int i18 = qVar.f271770b ? 0 : 8;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList3.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchResultUI$ContactSearchResultAdapter", "dealVerifyInfo", "(Lcom/tencent/mm/protocal/protobuf/SearchContactItem;Lcom/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchResultUI$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchResultUI$ContactSearchResultAdapter", "dealVerifyInfo", "(Lcom/tencent/mm/protocal/protobuf/SearchContactItem;Lcom/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchResultUI$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view6 = rVar.f271776f;
        int i19 = qVar.f271769a ? 0 : 8;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view6, arrayList4.toArray(), "com/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchResultUI$ContactSearchResultAdapter", "dealVerifyInfo", "(Lcom/tencent/mm/protocal/protobuf/SearchContactItem;Lcom/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchResultUI$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view6, "com/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchResultUI$ContactSearchResultAdapter", "dealVerifyInfo", "(Lcom/tencent/mm/protocal/protobuf/SearchContactItem;Lcom/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchResultUI$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.String str4 = gw5Var.f375569o;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str4 == null) {
            str4 = "";
        }
        try {
            android.widget.TextView textView2 = rVar.f271774d;
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            float textSize2 = rVar.f271774d.getTextSize();
            ((ke0.e) xVar2).getClass();
            textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str4, textSize2));
        } catch (java.lang.Exception unused2) {
            rVar.f271774d.setText("");
        }
        try {
            android.widget.TextView textView3 = rVar.f271773c;
            le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(gw5Var.f375562e.f372756d)) {
                str = gw5Var.f375562e.f372756d;
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(gw5Var.f375574t)) {
                str = gw5Var.f375561d.f372756d;
                if (str == null) {
                    str = "";
                }
            } else {
                str = gw5Var.f375574t;
            }
            float textSize3 = rVar.f271773c.getTextSize();
            ((ke0.e) xVar3).getClass();
            textView3.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str, textSize3));
        } catch (java.lang.Exception unused3) {
            rVar.f271773c.setText("");
        }
        return view2;
    }
}
