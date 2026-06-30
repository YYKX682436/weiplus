package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ag implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsCommentFooter f167756d;

    public ag(com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter) {
        this.f167756d = snsCommentFooter;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$8");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsCommentFooter$8", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        ku5.u0 u0Var = ku5.t0.f312615d;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.ag$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.sns.ui.ag agVar = com.tencent.mm.plugin.sns.ui.ag.this;
                agVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$onTouch$0", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$8");
                java.lang.String str = com.tencent.mm.plugin.sns.ui.SnsCommentFooter.I1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                agVar.f167756d.U(false);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$onTouch$0", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$8");
            }
        };
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(runnable, 200L, false);
        this.f167756d.setToSendTextColor(true);
        com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter = this.f167756d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1602", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        snsCommentFooter.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1602", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter2 = this.f167756d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        snsCommentFooter2.w();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter3 = this.f167756d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        android.widget.ImageButton imageButton = snsCommentFooter3.f167091h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        imageButton.setImageResource(com.tencent.mm.R.raw.icons_outlined_emoji);
        com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter4 = this.f167756d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.tencent.mm.plugin.sns.ui.cg cgVar = snsCommentFooter4.F1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        if (cgVar != null) {
            com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter5 = this.f167756d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            com.tencent.mm.plugin.sns.ui.cg cgVar2 = snsCommentFooter5.F1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.AnonymousClass34 anonymousClass34 = (com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.AnonymousClass34) cgVar2;
            anonymousClass34.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$34");
            boolean c17 = ha4.k.c(anonymousClass34.f166981a.getLocalid());
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.this;
            if (!c17) {
                int i17 = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.O2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$5100", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                android.app.Dialog dialog = snsCommentDetailUI.B1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$5100", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                if (dialog != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$5100", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    android.app.Dialog dialog2 = snsCommentDetailUI.B1;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$5100", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    if (dialog2.isShowing()) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$34");
                    }
                }
                android.app.Dialog a17 = ja4.d.a(snsCommentDetailUI.getContext(), snsCommentDetailUI.D2.g(0));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$5102", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                snsCommentDetailUI.B1 = a17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$5102", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$34");
            } else if (snsCommentDetailUI.keyboardState() == 1 || com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.W6(snsCommentDetailUI).y()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$34");
            } else {
                com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.d7(snsCommentDetailUI);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$34");
            }
        }
        com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter6 = this.f167756d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$802", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        snsCommentFooter6.f167107x = 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$802", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/SnsCommentFooter$8", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$8");
        return false;
    }
}
