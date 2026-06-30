package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class zk implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.bl f200389d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f200390e;

    public zk(com.tencent.mm.ui.chatting.component.bl blVar, java.util.List list) {
        this.f200389d = blVar;
        this.f200390e = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        android.widget.HorizontalScrollView horizontalScrollView;
        com.tencent.mm.ui.chatting.component.bl blVar = this.f200389d;
        android.widget.LinearLayout linearLayout = blVar.f198835f;
        if (linearLayout == null || (horizontalScrollView = blVar.f198834e) == null) {
            i17 = 0;
        } else {
            int width = horizontalScrollView.getWidth();
            if (width <= 0) {
                i17 = linearLayout.getChildCount();
            } else {
                int childCount = linearLayout.getChildCount();
                int i18 = 0;
                for (int i19 = 0; i19 < childCount; i19++) {
                    android.view.View childAt = linearLayout.getChildAt(i19);
                    if (childAt != null) {
                        if (childAt.getLeft() >= width) {
                            break;
                        } else {
                            i18++;
                        }
                    }
                }
                i17 = i18;
            }
        }
        blVar.f198838i = i17;
        int size = this.f200390e.size();
        android.widget.HorizontalScrollView horizontalScrollView2 = blVar.f198834e;
        if (horizontalScrollView2 == null || blVar.f198839m || horizontalScrollView2.getVisibility() != 0) {
            return;
        }
        blVar.f198839m = true;
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(horizontalScrollView2, "shortcut_name_btn");
        aVar.gk(horizontalScrollView2, kz5.c1.k(new jz5.l("weclawbot_username", blVar.f198580d.x()), new jz5.l("clawbot_shortcut_count", java.lang.Integer.valueOf(size)), new jz5.l("clawbot_visible_shortcut_count", java.lang.Integer.valueOf(blVar.f198838i))));
        aVar.ik(horizontalScrollView2, 1, 37790);
        try {
            aVar.Ej("view_exp", kz5.c1.k(new jz5.l("view_id", "shortcut_name_btn"), new jz5.l("weclawbot_username", blVar.f198580d.x()), new jz5.l("clawbot_shortcut_count", java.lang.Integer.valueOf(size)), new jz5.l("clawbot_visible_shortcut_count", java.lang.Integer.valueOf(blVar.f198838i))), 37790);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ShortcutCommandTagComponent", e17, "reportExp failed", new java.lang.Object[0]);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ShortcutCommandTagComponent", "setupScrollViewReport: totalCount=%d, visibleCount=%d, exposure reported", java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(blVar.f198838i));
    }
}
