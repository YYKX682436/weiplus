package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class p5 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public static com.tencent.mm.pluginsdk.ui.span.d1 f170158d;

    /* renamed from: e, reason: collision with root package name */
    public static al5.w f170159e;

    /* renamed from: f, reason: collision with root package name */
    public static android.widget.TextView f170160f;

    /* renamed from: g, reason: collision with root package name */
    public static xe0.h0 f170161g;

    public static void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeActionDown", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
        com.tencent.mm.pluginsdk.ui.span.d1 d1Var = f170158d;
        if (d1Var != null) {
            d1Var.setIsPressed(false);
            f170160f.invalidate();
            f170160f = null;
            f170158d = null;
        }
        al5.w wVar = f170159e;
        if (wVar != null) {
            wVar.getClass();
            f170160f.invalidate();
            f170160f = null;
            f170159e = null;
        }
        b(f170160f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeActionDown", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
    }

    public static void b(android.widget.TextView textView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetTextStatusPressedIfAny", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
        xe0.h0 h0Var = f170161g;
        if (h0Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetTextStatusPressedIfAny", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
            return;
        }
        c(h0Var, false);
        f170161g = null;
        if (textView != null) {
            textView.invalidate();
        }
        f170161g = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetTextStatusPressedIfAny", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
    }

    public static void c(xe0.h0 h0Var, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSpanPressedIfPossible", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
        if (h0Var instanceof gb5.a) {
            ((gb5.a) h0Var).setIsPressed(z17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSpanPressedIfPossible", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        int totalPaddingLeft;
        int totalPaddingTop;
        xe0.h0 h0Var;
        boolean z17;
        boolean z18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/MMOnTouchListener", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        android.widget.TextView textView = (android.widget.TextView) view;
        motionEvent.getAction();
        if (motionEvent.getAction() == 3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMOnTouchListener", "onTouch CANCEL pre-reset tv=%s", textView);
            b(textView);
        }
        textView.getTag();
        java.lang.CharSequence text = textView.getText();
        android.text.Layout layout = textView.getLayout();
        boolean z19 = text instanceof android.text.Spannable;
        boolean z27 = text instanceof android.text.Spanned;
        motionEvent.getX();
        motionEvent.getY();
        if (layout == null && (textView instanceof com.tencent.mm.kiss.widget.textview.SysTextView)) {
            layout = ((com.tencent.mm.kiss.widget.textview.SysTextView) textView).getTvLayout();
        }
        boolean z28 = false;
        if (!z19 || layout == null) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/MMOnTouchListener", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
            return false;
        }
        android.text.Spannable spannable = (android.text.Spannable) text;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
        int action = motionEvent.getAction();
        android.text.Layout layout2 = textView.getLayout();
        if (layout2 == null && (textView instanceof com.tencent.mm.kiss.widget.textview.SysTextView)) {
            layout2 = ((com.tencent.mm.kiss.widget.textview.SysTextView) textView).getTvLayout();
        }
        textView.invalidate();
        if (spannable == null || !com.tencent.mm.pluginsdk.ui.span.s.a(textView, spannable)) {
            if (action == 1 || action == 0 || action == 2) {
                int x17 = (int) motionEvent.getX();
                int y17 = (int) motionEvent.getY();
                boolean z29 = textView instanceof com.tencent.mm.kiss.widget.textview.PLSysTextView;
                if (z29) {
                    com.tencent.mm.kiss.widget.textview.PLSysTextView pLSysTextView = (com.tencent.mm.kiss.widget.textview.PLSysTextView) textView;
                    if (x17 < pLSysTextView.getHorizontalDrawOffset() || x17 > layout2.getWidth() + pLSysTextView.getHorizontalDrawOffset()) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                    } else if (y17 < pLSysTextView.getVerticalDrawOffset() || y17 > layout2.getHeight() + pLSysTextView.getVerticalDrawOffset()) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                    }
                } else {
                    if (x17 < textView.getTotalPaddingLeft() || x17 > layout2.getWidth() + textView.getTotalPaddingLeft()) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                    } else if (y17 < textView.getTotalPaddingTop() || y17 > layout2.getHeight() + textView.getTotalPaddingTop()) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                    }
                    z28 = false;
                }
                if (z29) {
                    com.tencent.mm.kiss.widget.textview.PLSysTextView pLSysTextView2 = (com.tencent.mm.kiss.widget.textview.PLSysTextView) textView;
                    totalPaddingLeft = x17 - pLSysTextView2.getHorizontalDrawOffset();
                    totalPaddingTop = pLSysTextView2.getVerticalDrawOffset();
                } else {
                    totalPaddingLeft = x17 - textView.getTotalPaddingLeft();
                    totalPaddingTop = textView.getTotalPaddingTop();
                }
                int scrollX = totalPaddingLeft + textView.getScrollX();
                int scrollY = (y17 - totalPaddingTop) + textView.getScrollY();
                int offsetForHorizontal = layout2.getOffsetForHorizontal(layout2.getLineForVertical(scrollY), scrollX);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("processTextStatusItemSpanClick", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                if (spannable == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processTextStatusItemSpanClick", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                } else {
                    int action2 = motionEvent.getAction();
                    xe0.h0[] h0VarArr = (xe0.h0[]) spannable.getSpans(0, spannable.length(), xe0.h0.class);
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMOnTouchListener", "[TSSpan] action=%d count=%d", java.lang.Integer.valueOf(action2), java.lang.Integer.valueOf(h0VarArr == null ? 0 : h0VarArr.length));
                    if ((h0VarArr == null || h0VarArr.length == 0) && f170161g == null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processTextStatusItemSpanClick", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                    } else {
                        if (h0VarArr != null) {
                            int length = h0VarArr.length;
                            for (int i17 = 0; i17 < length; i17++) {
                                h0Var = h0VarArr[i17];
                                if (h0Var.a(scrollX, scrollY)) {
                                    break;
                                }
                            }
                        }
                        h0Var = null;
                        if (action2 != 0) {
                            if (action2 == 1) {
                                xe0.h0 h0Var2 = f170161g;
                                if (h0Var2 == null) {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processTextStatusItemSpanClick", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                                } else {
                                    c(h0Var2, false);
                                    f170161g = null;
                                    if (h0Var == h0Var2) {
                                        com.tencent.mars.xlog.Log.i("MicroMsg.MMOnTouchListener", "[TSSpan] UP click");
                                        try {
                                            h0Var2.b(textView);
                                        } catch (java.lang.Throwable th6) {
                                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMOnTouchListener", th6, "performSpanClick err", new java.lang.Object[0]);
                                        }
                                    } else {
                                        com.tencent.mars.xlog.Log.i("MicroMsg.MMOnTouchListener", "[TSSpan] UP release");
                                    }
                                    textView.invalidate();
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processTextStatusItemSpanClick", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                                    z28 = true;
                                }
                            } else if (action2 == 2) {
                                xe0.h0 h0Var3 = f170161g;
                                if (h0Var3 == null) {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processTextStatusItemSpanClick", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                                } else {
                                    if (h0Var != h0Var3) {
                                        c(h0Var3, false);
                                        f170161g = null;
                                        textView.invalidate();
                                        com.tencent.mars.xlog.Log.i("MicroMsg.MMOnTouchListener", "[TSSpan] MOVE out");
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processTextStatusItemSpanClick", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                                    } else {
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processTextStatusItemSpanClick", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                                    }
                                    z28 = true;
                                }
                            } else if (action2 != 3) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processTextStatusItemSpanClick", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                            } else if (f170161g != null) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.MMOnTouchListener", "[TSSpan] CANCEL");
                                c(f170161g, false);
                                f170161g = null;
                                textView.invalidate();
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processTextStatusItemSpanClick", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                                z28 = true;
                            } else {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processTextStatusItemSpanClick", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                            }
                        } else if (h0Var != null) {
                            f170161g = h0Var;
                            c(h0Var, true);
                            textView.invalidate();
                            com.tencent.mars.xlog.Log.i("MicroMsg.MMOnTouchListener", "[TSSpan] DOWN hit");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processTextStatusItemSpanClick", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                            z28 = true;
                        } else {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processTextStatusItemSpanClick", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                        }
                    }
                    z28 = false;
                }
                if (z28) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                    z28 = true;
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("processSnsClick", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                    int action3 = motionEvent.getAction();
                    com.tencent.mm.pluginsdk.ui.span.d1[] d1VarArr = (com.tencent.mm.pluginsdk.ui.span.d1[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, com.tencent.mm.pluginsdk.ui.span.d1.class);
                    al5.w[] wVarArr = (al5.w[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, al5.w.class);
                    int length2 = d1VarArr.length;
                    int length3 = wVarArr.length;
                    if (textView.getLayout() == null && (textView instanceof com.tencent.mm.kiss.widget.textview.SysTextView)) {
                        ((com.tencent.mm.kiss.widget.textview.SysTextView) textView).getTvLayout();
                    }
                    if (d1VarArr.length != 0) {
                        int length4 = d1VarArr.length - 1;
                        if (action3 == 1) {
                            d1VarArr[length4].onClick(textView);
                            new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.plugin.sns.ui.n5(this), 300L);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processSnsClick", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                            z17 = true;
                        } else if (action3 == 0 || action3 == 2 || action3 == 3) {
                            a();
                            com.tencent.mm.pluginsdk.ui.span.d1 d1Var = d1VarArr[length4];
                            f170158d = d1Var;
                            f170160f = textView;
                            z17 = true;
                            d1Var.setIsPressed(true);
                            textView.invalidate();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processSnsClick", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                        } else {
                            z17 = true;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processSnsClick", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                            z18 = false;
                        }
                        z18 = z17;
                    } else {
                        z17 = true;
                        if (wVarArr.length != 0) {
                            int length5 = wVarArr.length - 1;
                            if (action3 == 1) {
                                wVarArr[length5].onClick(textView);
                                new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.plugin.sns.ui.o5(this), 300L);
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processSnsClick", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                            } else if (action3 == 0 || action3 == 2 || action3 == 3) {
                                a();
                                al5.w wVar = wVarArr[length5];
                                f170159e = wVar;
                                f170160f = textView;
                                wVar.getClass();
                                textView.invalidate();
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processSnsClick", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                            }
                            z18 = z17;
                        } else {
                            a();
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processSnsClick", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                        z18 = false;
                    }
                    if (z18) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                        z28 = z17;
                    }
                }
            }
            a();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
            z28 = false;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
        }
        yj0.a.i(z28, this, "com/tencent/mm/plugin/sns/ui/MMOnTouchListener", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
        return z28;
    }
}
