package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class l2 extends k75.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.o2 f184505e;

    public l2(com.tencent.mm.plugin.webview.ui.tools.fts.o2 o2Var, com.tencent.mm.plugin.webview.ui.tools.fts.t1 t1Var) {
        this.f184505e = o2Var;
    }

    @Override // k75.b, k75.c
    public void a() {
        super.a();
        com.tencent.mm.plugin.webview.ui.tools.fts.o2 o2Var = this.f184505e;
        com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.wa(o2Var.f184567n, com.tencent.mm.plugin.webview.ui.tools.fts.u4.Search);
        com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI = o2Var.f184567n;
        int i17 = fTSSOSHomeWebViewUI.H3;
        if (i17 == 1) {
            fTSSOSHomeWebViewUI.F4.setBackgroundResource(com.tencent.mm.R.color.anl);
        } else if (i17 == 2) {
            fTSSOSHomeWebViewUI.F4.setBackgroundResource(com.tencent.mm.R.color.anm);
        } else {
            fTSSOSHomeWebViewUI.F4.setBackgroundResource(com.tencent.mm.R.color.aaw);
        }
        o2Var.f184567n.J4.d();
        o2Var.f184567n.T9(java.lang.Boolean.TRUE);
        o2Var.f184567n.Ta(true);
        com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI2 = o2Var.f184567n;
        fTSSOSHomeWebViewUI2.F4.setPadding(fTSSOSHomeWebViewUI2.f184302q5, 0, 0, 0);
        com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI3 = o2Var.f184567n;
        if (!fTSSOSHomeWebViewUI3.f184307v5) {
            android.view.View view = fTSSOSHomeWebViewUI3.f184295j5;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$SosHomeStateMachine$SearchNoFocusState", "enter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$SosHomeStateMachine$SearchNoFocusState", "enter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        o2Var.f184567n.J4.setSearchBarCancelTextContainerVisibile(0);
        if (!o2Var.f184567n.Da()) {
            o2Var.f184567n.J4.setCommonRightImageButtonVisibile(0);
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(o2Var.f184567n.P9())) {
            o2Var.f184567n.J4.setForceShowClearBtn(true);
            o2Var.f184567n.J4.setClearBtnVisable(0);
            o2Var.f184567n.J4.setCommonRightBtnForceHide(true);
            o2Var.f184567n.J4.setCommonRightImageButtonVisibile(8);
        } else {
            o2Var.f184567n.J4.setForceShowClearBtn(false);
            o2Var.f184567n.J4.setClearBtnVisable(8);
            o2Var.f184567n.J4.setCommonRightBtnForceHide(false);
            o2Var.f184567n.J4.setCommonRightImageButtonVisibile(0);
        }
        o2Var.f184567n.Ma(8);
        com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI4 = o2Var.f184567n;
        if (fTSSOSHomeWebViewUI4.T4) {
            com.tencent.mm.plugin.websearch.widget.SOSEditTextView sOSEditTextView = fTSSOSHomeWebViewUI4.J4;
            if (sOSEditTextView.f209828v) {
                sOSEditTextView.f209813d.setVisibility(8);
            } else {
                sOSEditTextView.f209813d.setVisibility(0);
            }
            com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI5 = o2Var.f184567n;
            fTSSOSHomeWebViewUI5.J4.setPadding((int) fTSSOSHomeWebViewUI5.getResources().getDimension(com.tencent.mm.R.dimen.f479738dv), 0, 0, 0);
        } else {
            fTSSOSHomeWebViewUI4.J4.g();
        }
        o2Var.f184567n.Ra(0);
        if (fp.h.c(23)) {
            fp.m.e();
            com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI6 = o2Var.f184567n;
            if (fTSSOSHomeWebViewUI6.f184265w4) {
                fTSSOSHomeWebViewUI6.Q8(fTSSOSHomeWebViewUI6.getResources().getColor(com.tencent.mm.R.color.aaw), false);
            } else {
                fTSSOSHomeWebViewUI6.C9(fTSSOSHomeWebViewUI6.getResources().getColor(com.tencent.mm.R.color.aaw));
            }
        }
        android.view.View view2 = o2Var.f184567n.Z4;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$SosHomeStateMachine$SearchNoFocusState", "enter", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$SosHomeStateMachine$SearchNoFocusState", "enter", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) o2Var.f184567n.F4.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI7 = o2Var.f184567n;
        if (fTSSOSHomeWebViewUI7.K4) {
            layoutParams.topMargin = 0;
        }
        layoutParams.width = -1;
        fTSSOSHomeWebViewUI7.F4.setLayoutParams(layoutParams);
        o2Var.f184567n.F4.setY(0.0f);
        o2Var.f184567n.F4.setX(0.0f);
        com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI8 = o2Var.f184567n;
        if (fTSSOSHomeWebViewUI8.K4) {
            fTSSOSHomeWebViewUI8.Z4.setTranslationX(0.0f);
            o2Var.f184567n.Z4.setTranslationY(0.0f);
            o2Var.f184567n.F4.setTranslationX(0.0f);
            o2Var.f184567n.F4.setTranslationY(0.0f);
        }
        com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI9 = o2Var.f184567n;
        if (fTSSOSHomeWebViewUI9.K4 && fTSSOSHomeWebViewUI9.f184306u5) {
            android.view.View view3 = fTSSOSHomeWebViewUI9.F4;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$SosHomeStateMachine$SearchNoFocusState", "enter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$SosHomeStateMachine$SearchNoFocusState", "enter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = o2Var.f184567n.Z4;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$SosHomeStateMachine$SearchNoFocusState", "enter", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view4.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$SosHomeStateMachine$SearchNoFocusState", "enter", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI10 = o2Var.f184567n;
            if (!fTSSOSHomeWebViewUI10.f184307v5) {
                android.view.View view5 = fTSSOSHomeWebViewUI10.f184295j5;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$SosHomeStateMachine$SearchNoFocusState", "enter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$SosHomeStateMachine$SearchNoFocusState", "enter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view6 = o2Var.f184567n.Z4;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$SosHomeStateMachine$SearchNoFocusState", "enter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$SosHomeStateMachine$SearchNoFocusState", "enter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (o2Var.f184567n.getIntent() != null && o2Var.f184567n.getIntent().hasExtra("customize_status_bar_color")) {
                com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI11 = o2Var.f184567n;
                fTSSOSHomeWebViewUI11.f184296k5.setBackgroundColor(fTSSOSHomeWebViewUI11.Y1);
                if (o2Var.f184567n.getIntent().hasExtra("status_bar_style")) {
                    com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI12 = o2Var.f184567n;
                    fTSSOSHomeWebViewUI12.Q8(fTSSOSHomeWebViewUI12.Y1, "black".equals(fTSSOSHomeWebViewUI12.Z1));
                }
            }
            o2Var.f184567n.f184289d5.setVisibility(0);
            java.lang.String stringExtra = o2Var.f184567n.getIntent().getStringExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                stringExtra = o2Var.f184567n.getString(com.tencent.mm.R.string.f491241cg4);
            }
            o2Var.f184567n.f184289d5.setText(stringExtra);
            int intExtra = o2Var.f184567n.getIntent().getIntExtra("hideSearchInputBackgroundRes", -1);
            if (intExtra != -1) {
                o2Var.f184567n.findViewById(com.tencent.mm.R.id.che).setBackgroundResource(intExtra);
            }
        }
        o2Var.f184567n.Q9();
    }

    @Override // k75.b, k75.c
    public void b() {
        super.b();
    }

    @Override // k75.c
    public boolean c(android.os.Message message) {
        int i17 = message.what;
        com.tencent.mm.plugin.webview.ui.tools.fts.o2 o2Var = this.f184505e;
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("LogStateTransitionState", "SearchNoFocusState processMessage = MSG_SEARCH_KEY_DOWN.");
            o2Var.f184567n.J4.f();
            return false;
        }
        if (i17 == 2) {
            com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI = o2Var.f184567n;
            if (fTSSOSHomeWebViewUI.K4) {
                fTSSOSHomeWebViewUI.finish();
                return false;
            }
            com.tencent.mm.plugin.webview.ui.tools.fts.z4 z4Var = fTSSOSHomeWebViewUI.f184290e5;
            com.tencent.mm.plugin.webview.ui.tools.fts.u4 u4Var = com.tencent.mm.plugin.webview.ui.tools.fts.u4.Init;
            z4Var.a(u4Var, true);
            com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.wa(o2Var.f184567n, u4Var);
            return false;
        }
        if (i17 == 3 || i17 == 4) {
            o2Var.o(o2Var.f184563g);
            return false;
        }
        if (i17 != 5 || !o2Var.f184567n.J4.getEditText().hasFocus()) {
            return false;
        }
        o2Var.o(o2Var.f184564h);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15521, java.lang.Integer.valueOf(o2Var.f184567n.Y3), 2, o2Var.f184567n.J4.getInEditTextQuery(), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Integer.valueOf(o2Var.f184567n.f184245b4));
        return false;
    }

    @Override // k75.c, k75.a
    public java.lang.String getName() {
        return "SearchNoFocusState";
    }
}
