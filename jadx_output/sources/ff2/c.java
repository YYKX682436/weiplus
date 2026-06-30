package ff2;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ff2.c f261638a = new ff2.c();

    public final com.tencent.mm.plugin.finder.live.util.u1 a(int i17) {
        java.util.List i18 = i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 6 ? kz5.c0.i("#D5AB71", "#F9E5B8", "#CC9C59") : kz5.c0.i("#D5AB71", "#F9E5B8", "#CC9C59") : kz5.c0.i("#D5AB71", "#F9E5B8", "#CC9C59") : kz5.c0.i("#B19696", "#FFF2F2", "#966D6D") : kz5.c0.i("#DE7E6C", "#FFC7BA", "#B84836");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(i18, 10));
        java.util.Iterator it = i18.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(android.graphics.Color.parseColor((java.lang.String) it.next())));
        }
        return new com.tencent.mm.plugin.finder.live.util.u1(kz5.n0.R0(arrayList), new float[]{0.0f, 0.6f, 1.0f});
    }

    public final void b(java.util.List pageItems, android.view.ViewGroup parent, boolean z17, yz5.a aVar) {
        java.lang.String string;
        r45.dg1 dg1Var;
        java.lang.String string2;
        r45.e02 e02Var;
        kotlin.jvm.internal.o.g(pageItems, "pageItems");
        kotlin.jvm.internal.o.g(parent, "parent");
        parent.removeAllViews();
        java.util.Iterator it = pageItems.iterator();
        while (it.hasNext()) {
            r45.fg1 fg1Var = (r45.fg1) it.next();
            int integer = fg1Var.getInteger(0);
            int i17 = com.tencent.mm.R.id.scx;
            int i18 = com.tencent.mm.R.id.scw;
            int i19 = com.tencent.mm.R.id.scz;
            int i27 = com.tencent.mm.R.layout.f488834e82;
            ff2.c cVar = f261638a;
            if (integer == 1) {
                r45.d02 d02Var = (r45.d02) fg1Var.getCustom(1);
                java.util.LinkedList list = (d02Var == null || (e02Var = (r45.e02) d02Var.getCustom(0)) == null) ? null : e02Var.getList(0);
                if (list != null) {
                    boolean z18 = !z17 && list.size() > 1;
                    java.util.Iterator it6 = list.iterator();
                    while (it6.hasNext()) {
                        r45.c02 c02Var = (r45.c02) it6.next();
                        android.view.View inflate = com.tencent.mm.ui.id.b(parent.getContext()).inflate(i27, parent, false);
                        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(i19);
                        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(i18);
                        android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(i17);
                        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.scy);
                        if (z18) {
                            java.lang.String string3 = parent.getContext().getResources().getString(com.tencent.mm.R.string.nnv);
                            kotlin.jvm.internal.o.f(string3, "getString(...)");
                            string2 = java.lang.String.format(string3, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(list.size())}, 1));
                            kotlin.jvm.internal.o.f(string2, "format(...)");
                        } else {
                            string2 = parent.getContext().getResources().getString(com.tencent.mm.R.string.nnw);
                        }
                        textView.setText(string2);
                        textView2.setText(c02Var.getString(1));
                        textView3.setText(parent.getContext().getResources().getString(com.tencent.mm.R.string.nnu));
                        textView3.setVisibility(z18 ? 0 : 8);
                        int i28 = z18 ? 0 : 8;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(java.lang.Integer.valueOf(i28));
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/anchormilestoneshare/util/FinderLiveAnchorMilestoneUIUtil", "insertMilestoneCards", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveAnchorClosePageItem;Landroid/view/ViewGroup;ZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/controller/anchormilestoneshare/util/FinderLiveAnchorMilestoneUIUtil", "insertMilestoneCards", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveAnchorClosePageItem;Landroid/view/ViewGroup;ZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        textView.setTextColor(parent.getContext().getResources().getColor(com.tencent.mm.R.color.BW_F_Alpha_0_8));
                        textView.post(new com.tencent.mm.plugin.finder.live.util.v1(cVar.a(c02Var.getInteger(0)), textView));
                        textView2.post(new com.tencent.mm.plugin.finder.live.util.v1(cVar.a(c02Var.getInteger(0)), textView2));
                        parent.addView(inflate);
                        if (z18) {
                            textView3.setOnClickListener(new ff2.b(aVar));
                            break;
                        }
                        i17 = com.tencent.mm.R.id.scx;
                        i18 = com.tencent.mm.R.id.scw;
                        i19 = com.tencent.mm.R.id.scz;
                        i27 = com.tencent.mm.R.layout.f488834e82;
                    }
                }
            } else if (integer == 2) {
                r45.hw1 hw1Var = (r45.hw1) fg1Var.getCustom(2);
                if (hw1Var != null && (string = hw1Var.getString(0)) != null) {
                    android.view.View inflate2 = com.tencent.mm.ui.id.b(parent.getContext()).inflate(com.tencent.mm.R.layout.f488834e82, parent, false);
                    android.widget.TextView textView4 = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.scz);
                    android.widget.TextView textView5 = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.scw);
                    textView4.setText(parent.getContext().getResources().getString(com.tencent.mm.R.string.nnt));
                    textView5.setText(string);
                    textView4.setTextColor(parent.getContext().getResources().getColor(com.tencent.mm.R.color.BW_F_Alpha_0_8));
                    textView4.post(new com.tencent.mm.plugin.finder.live.util.v1(cVar.a(3), textView4));
                    textView5.post(new com.tencent.mm.plugin.finder.live.util.v1(cVar.a(3), textView5));
                    parent.addView(inflate2);
                }
            } else if (integer == 3 && (dg1Var = (r45.dg1) fg1Var.getCustom(3)) != null && dg1Var.getString(0) != null && dg1Var.getString(1) != null) {
                android.view.View inflate3 = com.tencent.mm.ui.id.b(parent.getContext()).inflate(com.tencent.mm.R.layout.f488834e82, parent, false);
                android.widget.TextView textView6 = (android.widget.TextView) inflate3.findViewById(com.tencent.mm.R.id.scz);
                android.widget.TextView textView7 = (android.widget.TextView) inflate3.findViewById(com.tencent.mm.R.id.scw);
                android.widget.TextView textView8 = (android.widget.TextView) inflate3.findViewById(com.tencent.mm.R.id.scx);
                textView6.setText(dg1Var.getString(0));
                textView7.setText(dg1Var.getString(1));
                java.lang.String string4 = dg1Var.getString(2);
                if (string4 == null) {
                    string4 = "";
                }
                textView8.setText(string4);
                textView8.setVisibility(dg1Var.getString(2) == null ? 8 : 0);
                if (dg1Var.getBoolean(3)) {
                    textView7.post(new com.tencent.mm.plugin.finder.live.util.v1(cVar.a(3), textView7));
                }
                if (dg1Var.getInteger(4) == 2) {
                    qg0.h0 h0Var = (qg0.h0) i95.n0.c(qg0.h0.class);
                    android.content.Context context = parent.getContext();
                    ((pg0.s3) h0Var).getClass();
                    textView7.setTypeface(com.tencent.mm.wallet_core.ui.r1.F(context, 4));
                }
                parent.addView(inflate3);
            }
        }
    }
}
