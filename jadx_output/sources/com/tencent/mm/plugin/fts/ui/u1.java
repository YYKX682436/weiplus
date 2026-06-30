package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes8.dex */
public final class u1 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f138191d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.FTSBizDetailUI f138192e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a23.e f138193f;

    public u1(android.view.View view, com.tencent.mm.plugin.fts.ui.FTSBizDetailUI fTSBizDetailUI, a23.e eVar) {
        this.f138191d = view;
        this.f138192e = fTSBizDetailUI;
        this.f138193f = eVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/FTSBizDetailUI$refreshHistoryItemViews$1$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            android.view.View view2 = this.f138191d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(java.lang.Float.valueOf(0.7f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fts/ui/FTSBizDetailUI$refreshHistoryItemViews$1$3", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/fts/ui/FTSBizDetailUI$refreshHistoryItemViews$1$3", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        } else {
            if (motionEvent.getAction() == 1) {
                com.tencent.mm.plugin.fts.ui.FTSBizDetailUI fTSBizDetailUI = this.f138192e;
                a23.g gVar = fTSBizDetailUI.f137950t;
                if (gVar != null) {
                    gVar.d(this.f138193f.f849a);
                }
                a23.g gVar2 = fTSBizDetailUI.f137950t;
                if (gVar2 != null && (gVar2.b().isEmpty() ^ true)) {
                    android.widget.LinearLayout linearLayout = fTSBizDetailUI.f137949s;
                    if (linearLayout != null) {
                        linearLayout.removeView(this.f138191d);
                    }
                } else {
                    android.widget.LinearLayout linearLayout2 = fTSBizDetailUI.f137949s;
                    if (linearLayout2 != null) {
                        linearLayout2.removeAllViews();
                    }
                }
                android.view.View view3 = this.f138191d;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/fts/ui/FTSBizDetailUI$refreshHistoryItemViews$1$3", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/fts/ui/FTSBizDetailUI$refreshHistoryItemViews$1$3", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            } else {
                android.view.View view4 = this.f138191d;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList4.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/fts/ui/FTSBizDetailUI$refreshHistoryItemViews$1$3", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view4.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/fts/ui/FTSBizDetailUI$refreshHistoryItemViews$1$3", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/fts/ui/FTSBizDetailUI$refreshHistoryItemViews$1$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
