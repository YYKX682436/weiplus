package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class vh implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f147550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 f147551e;

    public vh(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2, int i17) {
        this.f147551e = luckyMoneyNewYearSendUIV2;
        this.f147550d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = this.f147551e;
        int i17 = this.f147550d;
        luckyMoneyNewYearSendUIV2.I2 = i17;
        int i18 = luckyMoneyNewYearSendUIV2.P1;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (i18 == 0) {
            luckyMoneyNewYearSendUIV2.f146407i.setVisibility(0);
            android.view.View view = luckyMoneyNewYearSendUIV2.f146413m;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = luckyMoneyNewYearSendUIV2.f146417o;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2.X6(luckyMoneyNewYearSendUIV2);
            return;
        }
        luckyMoneyNewYearSendUIV2.f146407i.setVisibility(8);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUIV2", "exchangeExpressionState() state:%s", java.lang.Integer.valueOf(i17));
        switch (i17) {
            case 0:
                android.view.View view3 = luckyMoneyNewYearSendUIV2.f146413m;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                luckyMoneyNewYearSendUIV2.f146415n.setText("");
                android.view.View view4 = luckyMoneyNewYearSendUIV2.f146417o;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2.X6(luckyMoneyNewYearSendUIV2);
                return;
            case 1:
                if (luckyMoneyNewYearSendUIV2.X1 != null) {
                    luckyMoneyNewYearSendUIV2.Y1 = new com.tencent.mm.autogen.mmdata.rpt.HBReportNewStruct();
                    com.tencent.mm.autogen.mmdata.rpt.HBReportNewStruct hBReportNewStruct = luckyMoneyNewYearSendUIV2.Y1;
                    hBReportNewStruct.f58415d = 4L;
                    hBReportNewStruct.k();
                }
                luckyMoneyNewYearSendUIV2.X1 = luckyMoneyNewYearSendUIV2.W1;
                int i19 = luckyMoneyNewYearSendUIV2.f146398b2;
                if (i19 == 0) {
                    com.tencent.mm.feature.emoji.api.j6 j6Var = (com.tencent.mm.feature.emoji.api.j6) i95.n0.c(com.tencent.mm.feature.emoji.api.j6.class);
                    com.tencent.mm.api.IEmojiInfo iEmojiInfo = luckyMoneyNewYearSendUIV2.W1;
                    ((com.tencent.mm.feature.emoji.h2) j6Var).getClass();
                    if (n22.m.j(iEmojiInfo)) {
                        luckyMoneyNewYearSendUIV2.f146397a2 = 2;
                    } else {
                        com.tencent.mm.feature.emoji.api.j6 j6Var2 = (com.tencent.mm.feature.emoji.api.j6) i95.n0.c(com.tencent.mm.feature.emoji.api.j6.class);
                        com.tencent.mm.api.IEmojiInfo iEmojiInfo2 = luckyMoneyNewYearSendUIV2.W1;
                        ((com.tencent.mm.feature.emoji.h2) j6Var2).getClass();
                        if (n22.m.p(iEmojiInfo2)) {
                            luckyMoneyNewYearSendUIV2.f146397a2 = 4;
                        } else {
                            luckyMoneyNewYearSendUIV2.f146397a2 = 3;
                        }
                    }
                } else if (i19 == 1) {
                    luckyMoneyNewYearSendUIV2.f146397a2 = 2;
                    luckyMoneyNewYearSendUIV2.f146400d2++;
                } else if (i19 == 2) {
                    com.tencent.mm.feature.emoji.api.j6 j6Var3 = (com.tencent.mm.feature.emoji.api.j6) i95.n0.c(com.tencent.mm.feature.emoji.api.j6.class);
                    com.tencent.mm.api.IEmojiInfo iEmojiInfo3 = luckyMoneyNewYearSendUIV2.W1;
                    ((com.tencent.mm.feature.emoji.h2) j6Var3).getClass();
                    if (n22.m.j(iEmojiInfo3)) {
                        luckyMoneyNewYearSendUIV2.f146397a2 = 2;
                        luckyMoneyNewYearSendUIV2.f146404g2++;
                    } else {
                        com.tencent.mm.feature.emoji.api.j6 j6Var4 = (com.tencent.mm.feature.emoji.api.j6) i95.n0.c(com.tencent.mm.feature.emoji.api.j6.class);
                        com.tencent.mm.api.IEmojiInfo iEmojiInfo4 = luckyMoneyNewYearSendUIV2.W1;
                        ((com.tencent.mm.feature.emoji.h2) j6Var4).getClass();
                        if (n22.m.p(iEmojiInfo4)) {
                            luckyMoneyNewYearSendUIV2.f146397a2 = 4;
                            luckyMoneyNewYearSendUIV2.f146402f2++;
                        } else {
                            luckyMoneyNewYearSendUIV2.f146397a2 = 3;
                            luckyMoneyNewYearSendUIV2.f146401e2++;
                        }
                    }
                }
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2.X6(luckyMoneyNewYearSendUIV2);
                android.view.View view5 = luckyMoneyNewYearSendUIV2.f146413m;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view6 = luckyMoneyNewYearSendUIV2.f146417o;
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.add(0);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view6, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                luckyMoneyNewYearSendUIV2.f146427s.setVisibility(8);
                luckyMoneyNewYearSendUIV2.f146419p.setVisibility(0);
                luckyMoneyNewYearSendUIV2.f146423q.setVisibility(0);
                android.view.View view7 = luckyMoneyNewYearSendUIV2.f146425r;
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                arrayList7.add(0);
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(view7, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view8 = luckyMoneyNewYearSendUIV2.f146429t;
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                arrayList8.add(0);
                java.util.Collections.reverse(arrayList8);
                yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                yj0.a.f(view8, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                luckyMoneyNewYearSendUIV2.f146431u.setVisibility(8);
                luckyMoneyNewYearSendUIV2.f146433v.setVisibility(8);
                return;
            case 2:
                android.view.View view9 = luckyMoneyNewYearSendUIV2.f146413m;
                java.util.ArrayList arrayList9 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList9.add(8);
                java.util.Collections.reverse(arrayList9);
                yj0.a.d(view9, arrayList9.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view9.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                yj0.a.f(view9, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view10 = luckyMoneyNewYearSendUIV2.f146417o;
                java.util.ArrayList arrayList10 = new java.util.ArrayList();
                arrayList10.add(0);
                java.util.Collections.reverse(arrayList10);
                yj0.a.d(view10, arrayList10.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view10.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
                yj0.a.f(view10, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                luckyMoneyNewYearSendUIV2.f146427s.setVisibility(8);
                luckyMoneyNewYearSendUIV2.f146419p.setVisibility(8);
                luckyMoneyNewYearSendUIV2.f146423q.setVisibility(8);
                android.view.View view11 = luckyMoneyNewYearSendUIV2.f146425r;
                java.util.ArrayList arrayList11 = new java.util.ArrayList();
                arrayList11.add(8);
                java.util.Collections.reverse(arrayList11);
                yj0.a.d(view11, arrayList11.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view11.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
                yj0.a.f(view11, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view12 = luckyMoneyNewYearSendUIV2.f146429t;
                java.util.ArrayList arrayList12 = new java.util.ArrayList();
                arrayList12.add(8);
                java.util.Collections.reverse(arrayList12);
                yj0.a.d(view12, arrayList12.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view12.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
                yj0.a.f(view12, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                luckyMoneyNewYearSendUIV2.f146431u.setVisibility(0);
                luckyMoneyNewYearSendUIV2.f146433v.setVisibility(8);
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2.X6(luckyMoneyNewYearSendUIV2);
                return;
            case 3:
                android.view.View view13 = luckyMoneyNewYearSendUIV2.f146413m;
                java.util.ArrayList arrayList13 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                arrayList13.add(8);
                java.util.Collections.reverse(arrayList13);
                yj0.a.d(view13, arrayList13.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view13.setVisibility(((java.lang.Integer) arrayList13.get(0)).intValue());
                yj0.a.f(view13, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2.X6(luckyMoneyNewYearSendUIV2);
                android.view.View view14 = luckyMoneyNewYearSendUIV2.f146417o;
                java.util.ArrayList arrayList14 = new java.util.ArrayList();
                arrayList14.add(0);
                java.util.Collections.reverse(arrayList14);
                yj0.a.d(view14, arrayList14.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view14.setVisibility(((java.lang.Integer) arrayList14.get(0)).intValue());
                yj0.a.f(view14, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                luckyMoneyNewYearSendUIV2.f146427s.setVisibility(8);
                luckyMoneyNewYearSendUIV2.f146419p.setVisibility(8);
                luckyMoneyNewYearSendUIV2.f146423q.setVisibility(8);
                android.view.View view15 = luckyMoneyNewYearSendUIV2.f146425r;
                java.util.ArrayList arrayList15 = new java.util.ArrayList();
                arrayList15.add(8);
                java.util.Collections.reverse(arrayList15);
                yj0.a.d(view15, arrayList15.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view15.setVisibility(((java.lang.Integer) arrayList15.get(0)).intValue());
                yj0.a.f(view15, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view16 = luckyMoneyNewYearSendUIV2.f146429t;
                java.util.ArrayList arrayList16 = new java.util.ArrayList();
                arrayList16.add(8);
                java.util.Collections.reverse(arrayList16);
                yj0.a.d(view16, arrayList16.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view16.setVisibility(((java.lang.Integer) arrayList16.get(0)).intValue());
                yj0.a.f(view16, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                luckyMoneyNewYearSendUIV2.f146431u.setVisibility(8);
                luckyMoneyNewYearSendUIV2.f146433v.setVisibility(0);
                luckyMoneyNewYearSendUIV2.f146435w.setImageResource(com.tencent.mm.R.raw.lucky_money_newyear_creat_loading);
                return;
            case 4:
                android.view.View view17 = luckyMoneyNewYearSendUIV2.f146413m;
                java.util.ArrayList arrayList17 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
                arrayList17.add(0);
                java.util.Collections.reverse(arrayList17);
                yj0.a.d(view17, arrayList17.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view17.setVisibility(((java.lang.Integer) arrayList17.get(0)).intValue());
                yj0.a.f(view17, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                luckyMoneyNewYearSendUIV2.f146415n.setText(com.tencent.mm.R.string.f492428gm1);
                android.view.View view18 = luckyMoneyNewYearSendUIV2.f146417o;
                java.util.ArrayList arrayList18 = new java.util.ArrayList();
                arrayList18.add(8);
                java.util.Collections.reverse(arrayList18);
                yj0.a.d(view18, arrayList18.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view18.setVisibility(((java.lang.Integer) arrayList18.get(0)).intValue());
                yj0.a.f(view18, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2.X6(luckyMoneyNewYearSendUIV2);
                return;
            case 5:
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUIV2", "setPAGDataAndStart：%s", luckyMoneyNewYearSendUIV2.C1);
                luckyMoneyNewYearSendUIV2.f146442y0.post(new com.tencent.mm.plugin.luckymoney.ui.li(luckyMoneyNewYearSendUIV2));
                return;
            case 6:
                android.view.View view19 = luckyMoneyNewYearSendUIV2.f146413m;
                java.util.ArrayList arrayList19 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
                arrayList19.add(8);
                java.util.Collections.reverse(arrayList19);
                yj0.a.d(view19, arrayList19.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view19.setVisibility(((java.lang.Integer) arrayList19.get(0)).intValue());
                yj0.a.f(view19, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view20 = luckyMoneyNewYearSendUIV2.f146417o;
                java.util.ArrayList arrayList20 = new java.util.ArrayList();
                arrayList20.add(0);
                java.util.Collections.reverse(arrayList20);
                yj0.a.d(view20, arrayList20.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view20.setVisibility(((java.lang.Integer) arrayList20.get(0)).intValue());
                yj0.a.f(view20, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                luckyMoneyNewYearSendUIV2.f146427s.setVisibility(8);
                luckyMoneyNewYearSendUIV2.f146419p.setVisibility(8);
                luckyMoneyNewYearSendUIV2.f146423q.setVisibility(8);
                android.view.View view21 = luckyMoneyNewYearSendUIV2.f146425r;
                java.util.ArrayList arrayList21 = new java.util.ArrayList();
                arrayList21.add(8);
                java.util.Collections.reverse(arrayList21);
                yj0.a.d(view21, arrayList21.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view21.setVisibility(((java.lang.Integer) arrayList21.get(0)).intValue());
                yj0.a.f(view21, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view22 = luckyMoneyNewYearSendUIV2.f146429t;
                java.util.ArrayList arrayList22 = new java.util.ArrayList();
                arrayList22.add(8);
                java.util.Collections.reverse(arrayList22);
                yj0.a.d(view22, arrayList22.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view22.setVisibility(((java.lang.Integer) arrayList22.get(0)).intValue());
                yj0.a.f(view22, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$17", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                luckyMoneyNewYearSendUIV2.f146431u.setVisibility(8);
                luckyMoneyNewYearSendUIV2.f146433v.setVisibility(0);
                luckyMoneyNewYearSendUIV2.f146435w.setImageResource(com.tencent.mm.R.drawable.aml);
                android.view.animation.RotateAnimation rotateAnimation = new android.view.animation.RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
                rotateAnimation.setDuration(1000L);
                rotateAnimation.setRepeatCount(-1);
                rotateAnimation.setInterpolator(new android.view.animation.LinearInterpolator());
                luckyMoneyNewYearSendUIV2.f146435w.startAnimation(rotateAnimation);
                luckyMoneyNewYearSendUIV2.B2.alive();
                com.tencent.mm.plugin.luckymoney.model.e5.b(luckyMoneyNewYearSendUIV2.A1, luckyMoneyNewYearSendUIV2.B1);
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2.X6(luckyMoneyNewYearSendUIV2);
                return;
            default:
                return;
        }
    }
}
