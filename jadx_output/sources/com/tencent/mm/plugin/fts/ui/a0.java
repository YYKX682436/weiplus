package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public class a0 implements q01.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.FTSAddWw f138011d;

    public a0(com.tencent.mm.plugin.fts.ui.FTSAddWw fTSAddWw) {
        this.f138011d = fTSAddWw;
    }

    @Override // e75.a
    public void onChanged(java.lang.Object obj) {
        q01.g gVar = (q01.g) obj;
        if (gVar.f359279a == q01.f.f359276e) {
            int i17 = com.tencent.mm.plugin.fts.ui.FTSAddWw.P;
            com.tencent.mm.plugin.fts.ui.FTSAddWw fTSAddWw = this.f138011d;
            fTSAddWw.getClass();
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.fts.ui.c0(fTSAddWw));
            int i18 = gVar.f359281c;
            int i19 = gVar.f359280b;
            if (i19 == 0 && i18 == 0) {
                fTSAddWw.f137889J = ((l41.e0) ((ab0.v) gVar.f359283e)).f315803g;
                fTSAddWw.K = 1;
                com.tencent.mm.autogen.mmdata.rpt.OpenIMSearchFriendtLogStruct openIMSearchFriendtLogStruct = new com.tencent.mm.autogen.mmdata.rpt.OpenIMSearchFriendtLogStruct();
                openIMSearchFriendtLogStruct.p(fTSAddWw.G);
                openIMSearchFriendtLogStruct.f59792e = 0L;
                openIMSearchFriendtLogStruct.f59793f = 1L;
                openIMSearchFriendtLogStruct.k();
            } else {
                if (i18 == -24) {
                    tm.a b17 = tm.a.b(gVar.f359282d);
                    if (b17 != null) {
                        fTSAddWw.A.setText(b17.f420399b);
                    } else {
                        fTSAddWw.A.setText(com.tencent.mm.R.string.h9y);
                    }
                } else if (i18 != -4) {
                    fTSAddWw.A.setText(com.tencent.mm.R.string.h9y);
                } else if (i19 == 4) {
                    fTSAddWw.A.setText(com.tencent.mm.R.string.h9y);
                } else {
                    fTSAddWw.A.setText(fTSAddWw.getString(com.tencent.mm.R.string.icn));
                }
                fTSAddWw.K = -1;
                com.tencent.mm.autogen.mmdata.rpt.OpenIMSearchFriendtLogStruct openIMSearchFriendtLogStruct2 = new com.tencent.mm.autogen.mmdata.rpt.OpenIMSearchFriendtLogStruct();
                openIMSearchFriendtLogStruct2.p(fTSAddWw.G);
                openIMSearchFriendtLogStruct2.f59792e = 0L;
                openIMSearchFriendtLogStruct2.f59793f = 2L;
                openIMSearchFriendtLogStruct2.k();
            }
            if (fTSAddWw.K == 0) {
                return;
            }
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.fts.ui.c0(fTSAddWw));
            int i27 = fTSAddWw.K;
            if (i27 > 0) {
                fTSAddWw.D = true;
                fTSAddWw.g7();
                return;
            }
            if (i27 <= 0) {
                fTSAddWw.f137903d.setVisibility(8);
                android.view.View view = fTSAddWw.f137892r;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view2 = fTSAddWw.f137893s;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view3 = fTSAddWw.f137894t;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view4 = fTSAddWw.f137895u;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view5 = fTSAddWw.f137896v;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                fTSAddWw.F.setVisibility(8);
                return;
            }
            r45.cx5 cx5Var = fTSAddWw.f137889J;
            java.lang.String str = cx5Var.f371900d;
            java.lang.String str2 = cx5Var.f371901e;
            fTSAddWw.f137903d.setVisibility(8);
            android.view.View view6 = fTSAddWw.f137892r;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchOpenIMContactItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchOpenIMContactItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view7 = fTSAddWw.f137893s;
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(0);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchOpenIMContactItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchOpenIMContactItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            fTSAddWw.f137897w.setOnClickListener(new com.tencent.mm.plugin.fts.ui.z(fTSAddWw));
            fTSAddWw.f137899y.setText(str2);
            fTSAddWw.f137900z.setText("");
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(fTSAddWw.f137898x, str, null);
            android.view.View view8 = fTSAddWw.f137894t;
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(8);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchOpenIMContactItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchOpenIMContactItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view9 = fTSAddWw.f137895u;
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            arrayList9.add(8);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(view9, arrayList9.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchOpenIMContactItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(view9, "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchOpenIMContactItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view10 = fTSAddWw.f137896v;
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            arrayList10.add(8);
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(view10, arrayList10.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchOpenIMContactItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view10.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(view10, "com/tencent/mm/plugin/fts/ui/FTSAddWw", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchOpenIMContactItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            fTSAddWw.F.setVisibility(8);
        }
    }
}
