package rf2;

/* loaded from: classes10.dex */
public final class h1 extends in5.q0 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ rf2.o1 f394763h;

    public h1(rf2.o1 o1Var) {
        this.f394763h = o1Var;
    }

    @Override // in5.q0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void y(rf2.w0 holder, int i17, java.util.List payloads) {
        android.widget.TextView textView;
        rf2.o1 o1Var;
        int i18;
        java.lang.String str;
        android.widget.TextView textView2;
        android.view.View view;
        android.widget.TextView textView3;
        boolean z17;
        android.widget.TextView textView4;
        android.view.View view2;
        android.widget.TextView textView5;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        android.widget.TextView textView6 = holder.f394930e;
        if (textView6 != null) {
            com.tencent.mm.plugin.finder.live.util.k2.e(textView6, 3);
        }
        android.widget.TextView textView7 = holder.f394931f;
        if (textView7 != null) {
            com.tencent.mm.plugin.finder.live.util.k2.e(textView7, 3);
        }
        android.widget.TextView textView8 = holder.f394932g;
        if (textView8 != null) {
            com.tencent.mm.plugin.finder.live.util.k2.e(textView8, 4);
        }
        android.widget.TextView textView9 = holder.f394934i;
        if (textView9 != null) {
            com.tencent.mm.plugin.finder.live.util.k2.e(textView9, 3);
        }
        if (textView9 != null) {
            com.tencent.mm.plugin.finder.live.util.k2.d(textView9, 7, 5);
        }
        android.widget.TextView textView10 = holder.f394935m;
        if (textView10 != null) {
            com.tencent.mm.plugin.finder.live.util.k2.e(textView10, 3);
        }
        android.widget.TextView textView11 = holder.f394939q;
        if (textView11 != null) {
            com.tencent.mm.plugin.finder.live.util.k2.e(textView11, 8);
        }
        if (textView11 != null) {
            com.tencent.mm.plugin.finder.live.util.k2.d(textView11, 9, 5);
        }
        android.widget.TextView textView12 = holder.f394937o;
        if (textView12 != null) {
            com.tencent.mm.plugin.finder.live.util.k2.e(textView12, 4);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = holder.f394938p;
        if (weImageView != null) {
            com.tencent.mm.plugin.finder.live.util.k2.c(weImageView, 4);
        }
        android.view.View view3 = holder.f394943u;
        if (view3 != null) {
            com.tencent.mm.plugin.finder.live.util.k2.f(view3, 6, 0);
        }
        rf2.o1 o1Var2 = this.f394763h;
        r45.dm4 dm4Var = (r45.dm4) kz5.n0.a0(o1Var2.f394840e, i17);
        java.util.ArrayList arrayList = o1Var2.f394840e;
        java.lang.String str8 = o1Var2.f394838c;
        if (dm4Var == null) {
            android.view.View view4 = holder.itemView;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            textView = textView12;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mars.xlog.Log.e(str8, "_onBindViewHolder position:" + i17 + " data empty, dataList size:" + arrayList.size());
            o1Var = o1Var2;
        } else {
            textView = textView12;
            android.view.View view5 = holder.itemView;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            o1Var = o1Var2;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("bind position:");
        sb6.append(i17);
        sb6.append(", time:");
        sb6.append(dm4Var != null ? dm4Var.f372571f : null);
        sb6.append(", title:");
        sb6.append(dm4Var != null ? dm4Var.f372569d : null);
        sb6.append("sub_title:");
        sb6.append(dm4Var != null ? dm4Var.f372570e : null);
        sb6.append("status:");
        sb6.append(dm4Var != null ? java.lang.Integer.valueOf(dm4Var.f372572g) : null);
        sb6.append(", isAttend:");
        sb6.append(dm4Var != null ? java.lang.Integer.valueOf(dm4Var.f372576n) : null);
        sb6.append(", isReserved:");
        sb6.append(dm4Var != null ? java.lang.Integer.valueOf(dm4Var.f372574i) : null);
        com.tencent.mars.xlog.Log.i(str8, sb6.toString());
        if (textView6 != null) {
            if (dm4Var == null || (str7 = dm4Var.f372571f) == null) {
                str7 = "";
            }
            textView6.setText(str7);
        }
        if (textView7 != null) {
            if (dm4Var == null || (str6 = dm4Var.f372569d) == null) {
                str6 = "";
            }
            textView7.setText(str6);
        }
        if (textView8 != null) {
            if (dm4Var == null || (str5 = dm4Var.f372570e) == null) {
                str5 = "";
            }
            textView8.setText(str5);
        }
        android.view.View view6 = holder.f394933h;
        if (view6 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view6, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (textView9 == null) {
            i18 = 8;
        } else {
            i18 = 8;
            textView9.setVisibility(8);
        }
        if (textView10 != null) {
            textView10.setVisibility(i18);
        }
        if (textView11 != null) {
            textView11.setVisibility(i18);
        }
        android.view.View view7 = holder.f394936n;
        if (view7 == null) {
            str = "";
        } else {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            str = "";
            arrayList5.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view7, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        boolean z18 = (dm4Var != null ? dm4Var.f372576n : 0) > 0;
        boolean z19 = (dm4Var != null ? dm4Var.f372574i : 0) > 0;
        android.view.View view8 = holder.f394940r;
        if (view8 == null) {
            textView2 = textView8;
        } else {
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            textView2 = textView8;
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view8, arrayList6.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view9 = holder.f394942t;
        if (view9 == null) {
            view = view8;
        } else {
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            view = view8;
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view9, arrayList7.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view9, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view10 = holder.f394941s;
        if (view10 == null) {
            textView3 = textView7;
        } else {
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            textView3 = textView7;
            arrayList8.add(8);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view10, arrayList8.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view10.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view10, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (i17 != arrayList.size() - 1) {
            z17 = z18;
            textView4 = textView11;
            view2 = view;
            if (view3 != null) {
                java.util.ArrayList arrayList9 = new java.util.ArrayList();
                arrayList9.add(0);
                java.util.Collections.reverse(arrayList9);
                yj0.a.d(view3, arrayList9.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else if (view3 == null) {
            z17 = z18;
            textView4 = textView11;
            view2 = view;
        } else {
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            arrayList10.add(8);
            java.util.Collections.reverse(arrayList10);
            textView4 = textView11;
            view2 = view;
            z17 = z18;
            yj0.a.d(view3, arrayList10.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        int i19 = dm4Var != null ? dm4Var.f372572g : 0;
        rf2.t tVar = rf2.t.f394890a;
        rf2.o1 o1Var3 = o1Var;
        android.view.View view11 = o1Var3.f394836a;
        if (i19 == 2) {
            android.widget.TextView textView13 = textView;
            if (view9 != null) {
                java.util.ArrayList arrayList11 = new java.util.ArrayList();
                arrayList11.add(0);
                java.util.Collections.reverse(arrayList11);
                yj0.a.d(view9, arrayList11.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view9.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
                yj0.a.f(view9, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (z17) {
                if (textView13 != null) {
                    textView13.setText(view11.getContext().getString(com.tencent.mm.R.string.dr7));
                }
                if (view7 != null) {
                    java.util.ArrayList arrayList12 = new java.util.ArrayList();
                    arrayList12.add(0);
                    java.util.Collections.reverse(arrayList12);
                    yj0.a.d(view7, arrayList12.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view7.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
                    yj0.a.f(view7, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (view7 != null) {
                    view7.setOnClickListener(new rf2.z0(o1Var3, holder, dm4Var));
                }
            } else {
                tVar.e((dm4Var == null || (str2 = dm4Var.f372575m) == null) ? str : str2, 24, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
                if (textView4 == null) {
                    textView5 = textView4;
                } else {
                    textView5 = textView4;
                    textView5.setVisibility(0);
                }
                if (textView5 != null) {
                    textView5.setOnClickListener(new rf2.b1(dm4Var, o1Var3, holder));
                }
            }
            if (textView3 != null) {
                com.tencent.mm.plugin.finder.live.util.k2.e(textView3, 9);
            }
            if (textView2 != null) {
                com.tencent.mm.plugin.finder.live.util.k2.e(textView2, 10);
                return;
            }
            return;
        }
        if (i19 == 3) {
            if (view10 != null) {
                java.util.ArrayList arrayList13 = new java.util.ArrayList();
                arrayList13.add(0);
                java.util.Collections.reverse(arrayList13);
                yj0.a.d(view10, arrayList13.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view10.setVisibility(((java.lang.Integer) arrayList13.get(0)).intValue());
                yj0.a.f(view10, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (z19) {
                if (textView10 == null) {
                    return;
                }
                textView10.setVisibility(0);
                return;
            } else {
                tVar.e((dm4Var == null || (str4 = dm4Var.f372575m) == null) ? str : str4, 22, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : (dm4Var == null || (str3 = dm4Var.f372573h) == null) ? str : str3, (r13 & 16) != 0 ? null : null);
                if (textView9 != null) {
                    textView9.setVisibility(0);
                }
                if (textView9 != null) {
                    textView9.setOnClickListener(new rf2.d1(dm4Var, holder, o1Var3));
                    return;
                }
                return;
            }
        }
        if (i19 != 4) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(i17);
            sb7.append(" button_status Unknown:");
            sb7.append(dm4Var != null ? java.lang.Integer.valueOf(dm4Var.f372572g) : null);
            com.tencent.mars.xlog.Log.e(str8, sb7.toString());
            if (view6 == null) {
                return;
            }
            java.util.ArrayList arrayList14 = new java.util.ArrayList();
            arrayList14.add(8);
            java.util.Collections.reverse(arrayList14);
            yj0.a.d(view6, arrayList14.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList14.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (view2 != null) {
            java.util.ArrayList arrayList15 = new java.util.ArrayList();
            arrayList15.add(0);
            java.util.Collections.reverse(arrayList15);
            yj0.a.d(view2, arrayList15.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList15.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (textView != null) {
            textView.setText(view11.getContext().getString(com.tencent.mm.R.string.dqb));
        }
        if (view7 != null) {
            java.util.ArrayList arrayList16 = new java.util.ArrayList();
            arrayList16.add(0);
            java.util.Collections.reverse(arrayList16);
            yj0.a.d(view7, arrayList16.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList16.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$LotteryItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (view7 != null) {
            view7.setOnClickListener(new rf2.g1(o1Var3, dm4Var));
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f394763h.f394840e.size();
    }

    @Override // in5.q0
    public void x(in5.r0 r0Var, int i17) {
        rf2.w0 holder = (rf2.w0) r0Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        y(holder, i17, new java.util.ArrayList());
    }

    @Override // in5.q0
    public in5.r0 z(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.bra, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        rf2.w0 w0Var = new rf2.w0(inflate);
        android.widget.TextView textView = w0Var.f394934i;
        if (textView != null) {
            com.tencent.mm.ui.fk.a(textView);
        }
        android.widget.TextView textView2 = w0Var.f394935m;
        if (textView2 != null) {
            com.tencent.mm.ui.fk.a(textView2);
        }
        android.widget.TextView textView3 = w0Var.f394937o;
        if (textView3 != null) {
            com.tencent.mm.ui.fk.a(textView3);
        }
        android.widget.TextView textView4 = w0Var.f394939q;
        if (textView4 != null) {
            com.tencent.mm.ui.fk.a(textView4);
        }
        return w0Var;
    }
}
