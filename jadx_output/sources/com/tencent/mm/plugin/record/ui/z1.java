package com.tencent.mm.plugin.record.ui;

/* loaded from: classes12.dex */
public class z1 implements android.widget.AdapterView.OnItemSelectedListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.RecordMsgImageUI f155610d;

    public z1(com.tencent.mm.plugin.record.ui.RecordMsgImageUI recordMsgImageUI) {
        this.f155610d = recordMsgImageUI;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/record/ui/RecordMsgImageUI$5", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.record.ui.RecordMsgImageUI recordMsgImageUI = this.f155610d;
        recordMsgImageUI.A++;
        com.tencent.mars.xlog.Log.i("MicroMsg.ShowImageUI", "onItemSelected() called with: parent = [" + adapterView + "], view = [" + view + "], position = [" + i17 + "], id = [" + j17 + "]");
        com.tencent.mm.plugin.fav.ui.gallery.r item = recordMsgImageUI.f155315i.getItem(i17);
        com.tencent.mm.plugin.fav.ui.widget.FavVideoView favVideoView = recordMsgImageUI.B;
        if (favVideoView != null) {
            favVideoView.e();
        }
        if (item.k() == 2) {
            if (bt3.g2.K(item.n(), recordMsgImageUI.f155318o, recordMsgImageUI.f155317n)) {
                recordMsgImageUI.setMMTitle(java.lang.String.format("%d/%d", java.lang.Integer.valueOf(i17 + 1), java.lang.Integer.valueOf(((java.util.LinkedList) recordMsgImageUI.f155310d).size())));
                recordMsgImageUI.enableOptionMenu(true);
            } else {
                recordMsgImageUI.enableOptionMenu(false);
            }
        } else if (view instanceof com.tencent.mm.plugin.fav.ui.widget.FavVideoView) {
            com.tencent.mm.plugin.fav.ui.widget.FavVideoView favVideoView2 = (com.tencent.mm.plugin.fav.ui.widget.FavVideoView) view;
            if ((recordMsgImageUI.f155315i.getItemViewType(i17) == 15 || recordMsgImageUI.f155315i.getItemViewType(i17) == 4) && !favVideoView2.d()) {
                if (i17 != recordMsgImageUI.f155316m || recordMsgImageUI.f155329z) {
                    favVideoView2.setStartAfterPrepared(false);
                } else {
                    favVideoView2.setStartAfterPrepared(true);
                    recordMsgImageUI.f155329z = true;
                }
                favVideoView2.f();
                recordMsgImageUI.B = favVideoView2;
            }
        }
        android.view.View findViewById = recordMsgImageUI.findViewById(com.tencent.mm.R.id.f485314u40);
        if (findViewById != null && ((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Ni(6, 1)) {
            findViewById.setPadding(findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight(), i65.a.b(recordMsgImageUI.getContext(), 16) + com.tencent.mm.ui.bl.c(recordMsgImageUI.getContext()));
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/record/ui/RecordMsgImageUI", "setSearchBtnVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/record/ui/RecordMsgImageUI", "setSearchBtnVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (recordMsgImageUI.I != i17) {
                recordMsgImageUI.I = i17;
                ((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Ri(6, 1, tg0.e1.f419061d);
            }
            findViewById.findViewById(com.tencent.mm.R.id.gib).setOnClickListener(new com.tencent.mm.plugin.record.ui.u1(recordMsgImageUI));
        } else if (findViewById != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/record/ui/RecordMsgImageUI", "setSearchBtnVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/record/ui/RecordMsgImageUI", "setSearchBtnVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/record/ui/RecordMsgImageUI$5", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(android.widget.AdapterView adapterView) {
    }
}
