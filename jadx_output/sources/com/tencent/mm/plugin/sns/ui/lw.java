package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class lw implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.kw f169879d;

    public lw(com.tencent.mm.plugin.sns.ui.kw kwVar) {
        this.f169879d = kwVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.py pyVar;
        int i17;
        com.tencent.mm.plugin.sns.model.b8 b8Var;
        java.lang.String str3;
        com.tencent.mm.sdk.platformtools.o4 o4Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$10");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() == null || !(view.getTag() instanceof com.tencent.mm.plugin.sns.ui.py) || (pyVar = (com.tencent.mm.plugin.sns.ui.py) view.getTag()) == null) {
            str = "onClick";
            str2 = "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$10";
        } else {
            com.tencent.mm.plugin.sns.model.k7 k7Var = com.tencent.mm.plugin.sns.model.k7.f164367a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clickWsFriendFeed", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
            java.lang.String str4 = pyVar.f170285a;
            long j17 = pyVar.f170286b;
            if (android.text.TextUtils.isEmpty(str4)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsWsFoldManager", "[clickWsFriendFeed] userName empty and return function");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clickWsFriendFeed", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
                str = "onClick";
                str2 = "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$10";
            } else {
                kotlin.jvm.internal.o.d(str4);
                java.lang.String d17 = k7Var.d(str4);
                com.tencent.mm.sdk.platformtools.o4 o4Var2 = com.tencent.mm.plugin.sns.model.k7.f164368b;
                java.lang.String string = o4Var2.getString(d17, "");
                if (android.text.TextUtils.isEmpty(string)) {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsWsFoldManager", "userName=" + str4 + ", first clickWsFriendFeed and record, now = " + currentTimeMillis);
                    long j18 = pyVar.f170286b;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.model.WsFoldData");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.model.WsFoldData");
                    o4Var2.D(d17, str4 + ",-1," + currentTimeMillis + ",1," + j18 + ",1");
                    str = "onClick";
                    str2 = "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$10";
                } else {
                    com.tencent.mm.plugin.sns.model.b8 a17 = com.tencent.mm.plugin.sns.model.b8.f164102g.a(string);
                    str = "onClick";
                    str2 = "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$10";
                    long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("userName=");
                    sb6.append(str4);
                    sb6.append(", second clickWsFriendFeed and record, now = ");
                    sb6.append(currentTimeMillis2);
                    sb6.append(", lastClickFeedTime = ");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLastClickFeedTime", "com.tencent.mm.plugin.sns.model.WsFoldData");
                    long j19 = a17.f164105c;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLastClickFeedTime", "com.tencent.mm.plugin.sns.model.WsFoldData");
                    sb6.append(j19);
                    sb6.append(" , secondClickWsFriendFeedTimeInterval = ");
                    long j27 = com.tencent.mm.plugin.sns.model.k7.f164370d;
                    sb6.append(j27);
                    sb6.append(" ,origin clickFeedCount = ");
                    sb6.append(a17.a());
                    sb6.append(", lastUnFoldTime = ");
                    sb6.append(a17.b());
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsWsFoldManager", sb6.toString());
                    int a18 = a17.a();
                    int i18 = com.tencent.mm.plugin.sns.model.k7.f164369c;
                    if (a18 == i18) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLastClickFeedTime", "com.tencent.mm.plugin.sns.model.WsFoldData");
                        i17 = i18;
                        long j28 = a17.f164105c;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLastClickFeedTime", "com.tencent.mm.plugin.sns.model.WsFoldData");
                        if (currentTimeMillis2 - j28 < j27) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clickWsFriendFeed", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
                            pyVar = pyVar;
                        }
                    } else {
                        i17 = i18;
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLastClickFeedTime", "com.tencent.mm.plugin.sns.model.WsFoldData");
                    long j29 = a17.f164105c;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLastClickFeedTime", "com.tencent.mm.plugin.sns.model.WsFoldData");
                    if (currentTimeMillis2 - j29 > j27) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.SnsWsFoldManager", "now - lastClickFeedTime timeout, reset clickFeedCount = 1");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setClickFeedCount", "com.tencent.mm.plugin.sns.model.WsFoldData");
                        a17.f164106d = 1;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setClickFeedCount", "com.tencent.mm.plugin.sns.model.WsFoldData");
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.SnsWsFoldManager", "clickFeedCount++ and record, current clickFeedCount = " + a17.a());
                        int a19 = a17.a() + 1;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setClickFeedCount", "com.tencent.mm.plugin.sns.model.WsFoldData");
                        a17.f164106d = a19;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setClickFeedCount", "com.tencent.mm.plugin.sns.model.WsFoldData");
                        if (a17.a() == i17) {
                            a17.c(currentTimeMillis2);
                            java.lang.String h17 = ca4.z0.h(c01.id.c());
                            com.tencent.mars.xlog.Log.i("MicroMsg.SnsWsFoldManager", "[clickWsFriendFeed] report27795 groupId = " + j17 + ", userName = " + str4 + ", session = " + h17);
                            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                            java.lang.Long valueOf = java.lang.Long.valueOf(j17);
                            b8Var = a17;
                            str3 = "com.tencent.mm.plugin.sns.model.WsFoldData";
                            o4Var = o4Var2;
                            g0Var.d(27795, 1, valueOf, str4, h17, 1, 1);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLastClickFeedTime", str3);
                            b8Var.f164105c = currentTimeMillis2;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLastClickFeedTime", str3);
                            pyVar = pyVar;
                            b8Var.e(pyVar.f170286b);
                            b8Var.d(1);
                            o4Var.D(d17, b8Var.toString());
                        }
                    }
                    b8Var = a17;
                    str3 = "com.tencent.mm.plugin.sns.model.WsFoldData";
                    o4Var = o4Var2;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLastClickFeedTime", str3);
                    b8Var.f164105c = currentTimeMillis2;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLastClickFeedTime", str3);
                    pyVar = pyVar;
                    b8Var.e(pyVar.f170286b);
                    b8Var.d(1);
                    o4Var.D(d17, b8Var.toString());
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clickWsFriendFeed", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
            }
            com.tencent.mm.plugin.sns.ui.kw kwVar = this.f169879d;
            android.content.Intent intent = new android.content.Intent(com.tencent.mm.plugin.sns.ui.kw.b(kwVar), (java.lang.Class<?>) com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI.class);
            intent.putExtra("key_ws_group_id", pyVar.f170286b);
            intent.putExtra("key_ws_detail_max_id", pyVar.f170287c);
            intent.putExtra("key_ws_detail_min_id", pyVar.f170288d);
            intent.putExtra("key_ws_detail_username", pyVar.f170285a);
            java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>();
            java.util.List list = pyVar.f170289e;
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                arrayList2.add(ca4.z0.s0(((java.lang.Long) it.next()).longValue()));
            }
            intent.putStringArrayListExtra("key_ws_str_sns_id_list", arrayList2);
            android.content.Context b17 = com.tencent.mm.plugin.sns.ui.kw.b(kwVar);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(intent);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(b17, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$10", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            b17.startActivity((android.content.Intent) arrayList3.get(0));
            yj0.a.f(b17, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$10", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
            s0Var.i(list, pyVar.f170286b, pyVar.f170285a);
            s0Var.V(pyVar.f170286b, true);
        }
        java.lang.String str5 = str;
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$10", "android/view/View$OnClickListener", str5, "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str5, str2);
    }
}
