package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class vp implements com.tencent.mm.plugin.setting.ui.setting.hq {

    /* renamed from: a, reason: collision with root package name */
    public final long f161677a = java.lang.System.currentTimeMillis();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI f161678b;

    public vp(com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI unfamiliarContactDetailUI) {
        this.f161678b = unfamiliarContactDetailUI;
    }

    public void a(com.tencent.mm.plugin.setting.ui.setting.eq eqVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.UnfamiliarContactUI", "[onLoading] type:%s", eqVar.name());
        com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI unfamiliarContactDetailUI = this.f161678b;
        android.view.View findViewById = unfamiliarContactDetailUI.findViewById(com.tencent.mm.R.id.o_j);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onLoading", "(Lcom/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$LoadingType;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onLoading", "(Lcom/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$LoadingType;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = unfamiliarContactDetailUI.findViewById(com.tencent.mm.R.id.lbl);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onLoading", "(Lcom/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$LoadingType;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$8", "onLoading", "(Lcom/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$LoadingType;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (eqVar == com.tencent.mm.plugin.setting.ui.setting.eq.NORMAL) {
            unfamiliarContactDetailUI.f160775p.setText(unfamiliarContactDetailUI.getString(com.tencent.mm.R.string.ggc));
        } else if (eqVar == com.tencent.mm.plugin.setting.ui.setting.eq.OVER_ONE_MIN) {
            unfamiliarContactDetailUI.f160775p.setText(unfamiliarContactDetailUI.getString(com.tencent.mm.R.string.k2v));
        }
    }

    public void b(java.util.HashSet hashSet) {
        java.lang.String P0;
        java.lang.String a17;
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Integer.valueOf(hashSet == null ? 0 : hashSet.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.UnfamiliarContactUI", "[onResult] size:%s", objArr);
        if (hashSet != null) {
            com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI unfamiliarContactDetailUI = this.f161678b;
            java.util.ArrayList arrayList = unfamiliarContactDetailUI.f160779t;
            arrayList.clear();
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.Iterator it = hashSet.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                linkedList.add((java.lang.String) it.next());
                i17++;
                if (i17 % 200 == 0 || i17 == hashSet.size()) {
                    com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
                    Bi.getClass();
                    iz5.a.g(null, linkedList.size() > 0);
                    java.lang.String str = "select username ,nickname ,alias,conRemark,verifyFlag,showHead,weiboFlag,rowid ,deleteFlag,lvbuff,type from rcontact  where ";
                    for (int i18 = 0; i18 < linkedList.size(); i18++) {
                        str = i18 != linkedList.size() - 1 ? str + "username = '" + ((java.lang.String) linkedList.get(i18)) + "' OR " : str + "username = '" + ((java.lang.String) linkedList.get(i18)) + "'";
                    }
                    android.database.Cursor B = Bi.f195071d.B(str + " order by showHead asc,  case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull)  else upper(quanPin) end asc,  case when length(conRemark) > 0 then upper(conRemark)  else upper(quanPin) end asc,  upper(quanPin) asc,  upper(nickname) asc,  upper(username) asc ", null);
                    if (B != null) {
                        B.moveToFirst();
                        while (!B.isAfterLast()) {
                            com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
                            z3Var.convertFrom(B);
                            if (z3Var.r2()) {
                                com.tencent.mm.plugin.setting.ui.setting.yp ypVar = new com.tencent.mm.plugin.setting.ui.setting.yp(unfamiliarContactDetailUI, z3Var);
                                com.tencent.mm.storage.z3 z3Var2 = ypVar.f161800c;
                                if (z3Var2 == null) {
                                    P0 = null;
                                } else {
                                    P0 = z3Var2.P0();
                                    if (!com.tencent.mm.sdk.platformtools.t8.K0(z3Var2.w0())) {
                                        P0 = z3Var2.w0();
                                    } else if (com.tencent.mm.sdk.platformtools.t8.K0(P0)) {
                                        P0 = z3Var2.f2();
                                    }
                                }
                                if (android.text.TextUtils.isEmpty(P0)) {
                                    com.tencent.mars.xlog.Log.w("MicroMsg.UnfamiliarContactUI", "[%s:%s]", z3Var.d1(), z3Var.P0());
                                    a17 = "";
                                } else {
                                    a17 = com.tencent.mm.platformtools.SpellMap.a(P0.charAt(0));
                                }
                                ypVar.f161798a = (!com.tencent.mm.sdk.platformtools.t8.K0(a17) && a17.matches("[a-zA-Z]+$")) ? a17.toLowerCase().substring(0, 1) : com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI.B;
                                ypVar.f161799b = P0;
                                arrayList.add(ypVar);
                                B.moveToNext();
                            } else {
                                z3Var.P0();
                                B.moveToNext();
                            }
                        }
                        B.close();
                    }
                    linkedList.clear();
                }
            }
            java.util.Collections.sort(arrayList, new com.tencent.mm.plugin.setting.ui.setting.hp(unfamiliarContactDetailUI));
            unfamiliarContactDetailUI.U6(arrayList);
        }
    }
}
