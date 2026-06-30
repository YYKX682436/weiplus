package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public class u implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.FTSAddFriendUI f138189d;

    public u(com.tencent.mm.plugin.fts.ui.FTSAddFriendUI fTSAddFriendUI) {
        this.f138189d = fTSAddFriendUI;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        r45.fi6 fi6Var;
        com.tencent.mm.plugin.fts.ui.FTSAddFriendUI fTSAddFriendUI = this.f138189d;
        su4.p1 p1Var = fTSAddFriendUI.U;
        if (m1Var != p1Var || p1Var == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSAddFriendUI", "OnPardusSearchSceneEnd, errType: " + i17 + ", errCode: " + i18 + ", errMsg: " + str);
        if (i17 == 0 && i18 == 0 && (fi6Var = fTSAddFriendUI.U.f413036f.f375863m) != null) {
            if (fi6Var.f374387d.isEmpty()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FTS.FTSAddFriendUI", "buildRelevantFooter: sugResult is null or empty");
                return;
            }
            fTSAddFriendUI.f137881x.removeAllViews();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.Iterator it = fi6Var.f374387d.iterator();
            int i19 = -1;
            while (it.hasNext()) {
                r45.di6 di6Var = (r45.di6) it.next();
                i19++;
                android.view.View inflate = android.view.LayoutInflater.from(fTSAddFriendUI.getContext()).inflate(com.tencent.mm.R.layout.efp, (android.view.ViewGroup) fTSAddFriendUI.f137880w, false);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(di6Var.f372520o)) {
                    ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ltk)).setText(o13.q.g(di6Var.f372520o, fTSAddFriendUI.getContext().getResources().getColor(com.tencent.mm.R.color.Brand_90)));
                } else if (com.tencent.mm.sdk.platformtools.t8.K0(di6Var.f372512d)) {
                    return;
                } else {
                    ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ltk)).setText(o13.q.e(p13.i.d(di6Var.f372512d, p13.r.b(fTSAddFriendUI.f137910n, false), false, false)).f351105a);
                }
                if (i19 > 0) {
                    sb6.append("|");
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(di6Var.f372512d)) {
                    sb6.append(di6Var.f372512d);
                }
                if (i19 == fi6Var.f374387d.size() - 1) {
                    android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.lt8);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "buildRelevantFooter", "(Lcom/tencent/mm/protocal/protobuf/SugResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "buildRelevantFooter", "(Lcom/tencent/mm/protocal/protobuf/SugResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.lt8);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "buildRelevantFooter", "(Lcom/tencent/mm/protocal/protobuf/SugResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "buildRelevantFooter", "(Lcom/tencent/mm/protocal/protobuf/SugResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                inflate.setOnClickListener(new com.tencent.mm.plugin.fts.ui.t(fTSAddFriendUI, di6Var));
                inflate.setTag(di6Var);
                fTSAddFriendUI.f137881x.addView(inflate);
            }
            fTSAddFriendUI.Q = sb6.toString();
        }
    }
}
