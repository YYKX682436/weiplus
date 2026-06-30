package sr2;

/* loaded from: classes10.dex */
public final class e0 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f411542d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sr2.w0 f411543e;

    public e0(int i17, sr2.w0 w0Var) {
        this.f411542d = i17;
        this.f411543e = w0Var;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        android.view.View findViewById;
        android.view.View findViewById2;
        int i17;
        android.widget.LinearLayout linearLayout;
        sr2.p5 p5Var;
        sr2.w0 w0Var = this.f411543e;
        if (editable != null) {
            int selectionStart = w0Var.V6().getSelectionStart() > 0 ? w0Var.V6().getSelectionStart() : w0Var.f411769w;
            sr2.v5 p76 = w0Var.p7();
            if (p76.f411744e) {
                int i18 = selectionStart - 1;
                if (i18 >= 0 && i18 < editable.length()) {
                    if ((editable.length() > 0) && editable.charAt(i18) == '#') {
                        p76.f411749m = i18;
                        android.widget.LinearLayout linearLayout2 = p76.f411743d;
                        if (linearLayout2 != null) {
                            linearLayout2.setVisibility(0);
                        }
                        java.util.List list = p76.f411747h;
                        if (list != null && (p5Var = p76.f411748i) != null) {
                            p5Var.f411674d = list;
                            p5Var.notifyDataSetChanged();
                        }
                        p76.O6(0, "", 0);
                    }
                }
                int i19 = p76.f411749m;
                if (!(i19 >= 0 && i19 < i18) || i19 + 1 >= editable.length() || (i17 = i18 + 1) > editable.length()) {
                    android.widget.LinearLayout linearLayout3 = p76.f411743d;
                    if (linearLayout3 != null) {
                        linearLayout3.setVisibility(8);
                    }
                    p76.f411749m = -1;
                    p76.f411750n = "";
                } else {
                    int i27 = p76.f411749m;
                    char[] cArr = new char[i18 - i27];
                    editable.getChars(i27 + 1, i17, cArr, 0);
                    p76.f411750n = new java.lang.String(cArr);
                    java.util.List list2 = p76.f411747h;
                    if (list2 != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        for (java.lang.Object obj : list2) {
                            java.lang.String string = ((r45.r03) obj).getString(0);
                            if (string != null ? r26.n0.B(string, p76.f411750n, false) : false) {
                                arrayList.add(obj);
                            }
                        }
                        if (!((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.ad0.f126402a.a().r()).booleanValue()) {
                            sr2.p5 p5Var2 = p76.f411748i;
                            if (p5Var2 != null) {
                                p5Var2.f411674d = arrayList;
                                p5Var2.notifyDataSetChanged();
                            }
                        } else if (arrayList.isEmpty()) {
                            android.widget.LinearLayout linearLayout4 = p76.f411743d;
                            if (linearLayout4 != null) {
                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                                arrayList2.add(8);
                                java.util.Collections.reverse(arrayList2);
                                yj0.a.d(linearLayout4, arrayList2.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                int intValue = ((java.lang.Integer) arrayList2.get(0)).intValue();
                                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                arrayList3.add(java.lang.Integer.valueOf(intValue));
                                java.util.Collections.reverse(arrayList3);
                                yj0.a.d(linearLayout4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/post/PostTopicUIC", "filterTopic", "(Landroid/text/Editable;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                linearLayout4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                                yj0.a.f(linearLayout4, "com/tencent/mm/plugin/finder/post/PostTopicUIC", "filterTopic", "(Landroid/text/Editable;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                yj0.a.f(linearLayout4, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                        } else {
                            sr2.p5 p5Var3 = p76.f411748i;
                            if (p5Var3 != null) {
                                p5Var3.f411674d = arrayList;
                                p5Var3.notifyDataSetChanged();
                            }
                            android.widget.LinearLayout linearLayout5 = p76.f411743d;
                            if (linearLayout5 != null) {
                                if (!(linearLayout5.getVisibility() == 0) && (linearLayout = p76.f411743d) != null) {
                                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                                    arrayList4.add(0);
                                    java.util.Collections.reverse(arrayList4);
                                    yj0.a.d(linearLayout, arrayList4.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    int intValue2 = ((java.lang.Integer) arrayList4.get(0)).intValue();
                                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                                    arrayList5.add(java.lang.Integer.valueOf(intValue2));
                                    java.util.Collections.reverse(arrayList5);
                                    yj0.a.d(linearLayout, arrayList5.toArray(), "com/tencent/mm/plugin/finder/post/PostTopicUIC", "filterTopic", "(Landroid/text/Editable;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    linearLayout.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                                    yj0.a.f(linearLayout, "com/tencent/mm/plugin/finder/post/PostTopicUIC", "filterTopic", "(Landroid/text/Editable;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    yj0.a.f(linearLayout, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                }
                            }
                        }
                    }
                }
            }
        }
        com.tencent.mars.xlog.Log.i("Finder.PostEditUIC", "afterTextChanged text:" + ((java.lang.Object) editable));
        int i28 = this.f411542d;
        int b17 = i28 - (com.tencent.mm.ui.tools.v4.b(i28 * 2, java.lang.String.valueOf(editable)) / 2);
        w0Var.D = b17;
        w0Var.f411765s = true;
        w0Var.Q6(b17);
        double d17 = w0Var.D / i28;
        int i29 = w0Var.B;
        if (d17 >= 0.95d) {
            android.widget.TextView textView = w0Var.f411755f;
            if (textView == null) {
                kotlin.jvm.internal.o.o("textCountTv");
                throw null;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(w0Var.D);
            sb6.append('/');
            sb6.append(i28);
            textView.setText(sb6.toString());
            if (w0Var.D > i28) {
                android.widget.TextView textView2 = w0Var.f411755f;
                if (textView2 == null) {
                    kotlin.jvm.internal.o.o("textCountTv");
                    throw null;
                }
                textView2.setTextColor(w0Var.getResources().getColor(com.tencent.mm.R.color.Red_100));
                w0Var.f411765s = false;
            } else {
                android.widget.TextView textView3 = w0Var.f411755f;
                if (textView3 == null) {
                    kotlin.jvm.internal.o.o("textCountTv");
                    throw null;
                }
                textView3.setTextColor(w0Var.getResources().getColor(com.tencent.mm.R.color.FG_1));
            }
            android.widget.TextView textView4 = w0Var.f411755f;
            if (textView4 == null) {
                kotlin.jvm.internal.o.o("textCountTv");
                throw null;
            }
            textView4.setVisibility(0);
            if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.ad0.f126402a.a().r()).booleanValue() && (findViewById2 = w0Var.getActivity().findViewById(com.tencent.mm.R.id.ur9)) != null) {
                if (!(findViewById2.getVisibility() == 0)) {
                    com.tencent.mm.plugin.finder.view.FinderPostEditText V6 = w0Var.V6();
                    V6.setMaxHeight(V6.getMaxHeight() - i29);
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                    arrayList6.add(0);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(findViewById2, arrayList6.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    int intValue3 = ((java.lang.Integer) arrayList6.get(0)).intValue();
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    arrayList7.add(java.lang.Integer.valueOf(intValue3));
                    java.util.Collections.reverse(arrayList7);
                    yj0.a.d(findViewById2, arrayList7.toArray(), "com/tencent/mm/plugin/finder/post/PostEditUIC$initDescText$textWatcher$1", "afterTextChanged", "(Landroid/text/Editable;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/post/PostEditUIC$initDescText$textWatcher$1", "afterTextChanged", "(Landroid/text/Editable;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    yj0.a.f(findViewById2, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        } else {
            android.widget.TextView textView5 = w0Var.f411755f;
            if (textView5 == null) {
                kotlin.jvm.internal.o.o("textCountTv");
                throw null;
            }
            textView5.setText("");
            android.widget.TextView textView6 = w0Var.f411755f;
            if (textView6 == null) {
                kotlin.jvm.internal.o.o("textCountTv");
                throw null;
            }
            textView6.setVisibility(8);
            if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.ad0.f126402a.a().r()).booleanValue() && (findViewById = w0Var.getActivity().findViewById(com.tencent.mm.R.id.ur9)) != null) {
                if (!(findViewById.getVisibility() == 8)) {
                    com.tencent.mm.plugin.finder.view.FinderPostEditText V62 = w0Var.V6();
                    V62.setMaxHeight(V62.getMaxHeight() + i29);
                    java.util.ArrayList arrayList8 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                    arrayList8.add(8);
                    java.util.Collections.reverse(arrayList8);
                    yj0.a.d(findViewById, arrayList8.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    int intValue4 = ((java.lang.Integer) arrayList8.get(0)).intValue();
                    java.util.ArrayList arrayList9 = new java.util.ArrayList();
                    arrayList9.add(java.lang.Integer.valueOf(intValue4));
                    java.util.Collections.reverse(arrayList9);
                    yj0.a.d(findViewById, arrayList9.toArray(), "com/tencent/mm/plugin/finder/post/PostEditUIC$initDescText$textWatcher$1", "afterTextChanged", "(Landroid/text/Editable;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/post/PostEditUIC$initDescText$textWatcher$1", "afterTextChanged", "(Landroid/text/Editable;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    yj0.a.f(findViewById, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
        w0Var.P6();
        rx2.u d76 = w0Var.d7();
        java.lang.String valueOf = java.lang.String.valueOf(editable);
        kotlin.jvm.internal.o.d(editable);
        d76.a(valueOf, editable);
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (t70Var.G2()) {
            rx2.w wVar = w0Var.d7().f400995a;
            if (wVar == null) {
                kotlin.jvm.internal.o.o("topicSuggestManager");
                throw null;
            }
            if (((java.util.ArrayList) wVar.f400999a).size() > ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.N0).getValue()).r()).intValue()) {
                w0Var.W6().d(false);
            } else {
                w0Var.W6().d(true);
            }
        }
        if (t70Var.e()) {
            jz5.g gVar = com.tencent.mm.plugin.finder.storage.t70.f127668e1;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue() == 1000 || w0Var.d7().b().f400966b.size() < ((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue()) {
                w0Var.W6().c(true);
            } else {
                w0Var.W6().c(false);
            }
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        java.lang.Character C0;
        java.lang.Object obj;
        if (charSequence == null || (C0 = r26.p0.C0(charSequence, i17)) == null || C0.charValue() != '@' || i19 != 1) {
            return;
        }
        int i27 = i17 - 1;
        if (i27 < 0) {
            i27 = 0;
        }
        java.lang.Character C02 = r26.p0.C0(charSequence, i27);
        if (i17 != 0) {
            r26.t tVar = com.tencent.mm.plugin.finder.assist.j1.f102274a;
            java.util.Iterator it = com.tencent.mm.plugin.finder.assist.j1.f102275b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((r26.t) obj).a(java.lang.String.valueOf(C02))) {
                        break;
                    }
                }
            }
            if (obj == null) {
                return;
            }
        }
        sr2.w0 w0Var = this.f411543e;
        if (w0Var.getActivity() instanceof com.tencent.mm.ui.MMActivity) {
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            androidx.appcompat.app.AppCompatActivity activity = w0Var.getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((c61.l7) b6Var).Lk((com.tencent.mm.ui.MMActivity) activity, 20006, null, 1);
        }
    }
}
