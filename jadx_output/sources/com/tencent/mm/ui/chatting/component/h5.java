package com.tencent.mm.ui.chatting.component;

/* loaded from: classes8.dex */
public class h5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.b5 f199144d;

    public h5(com.tencent.mm.ui.chatting.component.b5 b5Var) {
        this.f199144d = b5Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/ChattingMoreComponent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.component.b5 b5Var = this.f199144d;
        sb5.z zVar = (sb5.z) b5Var.f198580d.f460708c.a(sb5.z.class);
        if (zVar == null || ((com.tencent.mm.ui.chatting.adapter.k) zVar).L0() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingMoreBtnBarHelper", "ignore click del btn, selected items count is 0");
            yj0.a.h(this, "com/tencent/mm/ui/chatting/component/ChattingMoreComponent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.util.List p07 = b5Var.p0();
        if (com.tencent.mm.ui.chatting.n3.u(p07)) {
            db5.e1.y(b5Var.f198580d.g(), b5Var.f198580d.g().getString(com.tencent.mm.R.string.bkp), "", b5Var.f198580d.g().getString(com.tencent.mm.R.string.f489708h), new com.tencent.mm.ui.chatting.component.i5(this));
            yj0.a.h(this, "com/tencent/mm/ui/chatting/component/ChattingMoreComponent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (com.tencent.mm.ui.chatting.n3.v(p07)) {
            db5.e1.y(b5Var.f198580d.g(), b5Var.f198580d.g().getString(com.tencent.mm.R.string.bkq), "", b5Var.f198580d.g().getString(com.tencent.mm.R.string.f489708h), new com.tencent.mm.ui.chatting.component.j5(this));
            yj0.a.h(this, "com/tencent/mm/ui/chatting/component/ChattingMoreComponent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (com.tencent.mm.ui.chatting.n3.t(p07)) {
            db5.e1.y(b5Var.f198580d.g(), b5Var.f198580d.g().getString(com.tencent.mm.R.string.bko), "", b5Var.f198580d.g().getString(com.tencent.mm.R.string.f489708h), new com.tencent.mm.ui.chatting.component.k5(this));
            yj0.a.h(this, "com/tencent/mm/ui/chatting/component/ChattingMoreComponent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        ac5.f fVar = ac5.f.f3090a;
        yb5.d dVar = b5Var.f198580d;
        com.tencent.mm.storage.z3 z3Var = b5Var.f198697h;
        yz5.a aVar = new yz5.a() { // from class: com.tencent.mm.ui.chatting.component.h5$$a
            @Override // yz5.a
            public final java.lang.Object invoke() {
                com.tencent.mm.ui.chatting.component.h5.this.f199144d.o0();
                return null;
            }
        };
        boolean w17 = com.tencent.mm.ui.chatting.n3.w(p07);
        if (dVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingEditModeSendToOtherApp", "do send to mail fail, context is null");
        } else {
            if (!(p07.isEmpty())) {
                if (z3Var == null || ((int) z3Var.E2) <= 0) {
                    str = "(Landroid/view/View;)V";
                    str2 = "onClick";
                    com.tencent.mars.xlog.Log.w("MicroMsg.ChattingEditModeSendToOtherApp", "do send to mail fail, contact error");
                } else {
                    android.app.Activity g17 = dVar.g();
                    kotlin.jvm.internal.o.d(g17);
                    java.lang.String b17 = fVar.b(g17, z3Var);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.ChattingEditModeSendToOtherApp", "gen subject fail");
                    } else {
                        bc5.e eVar = new bc5.e(g17, p07, z3Var);
                        eVar.f19195k = b17;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.util.HashSet hashSet = new java.util.HashSet();
                        str = "(Landroid/view/View;)V";
                        hashSet.add(com.tencent.mm.sdk.platformtools.x2.f193072b);
                        android.content.Intent a17 = fVar.a(eVar);
                        str2 = "onClick";
                        java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = g17.getPackageManager().queryIntentActivities(a17, 131072);
                        kotlin.jvm.internal.o.d(queryIntentActivities);
                        java.util.Iterator it = queryIntentActivities.iterator();
                        while (it.hasNext()) {
                            android.content.pm.ResolveInfo resolveInfo = (android.content.pm.ResolveInfo) it.next();
                            java.util.Iterator it6 = it;
                            if (!hashSet.contains(resolveInfo.activityInfo.packageName)) {
                                hashSet.add(resolveInfo.activityInfo.packageName);
                                arrayList2.add(new com.tencent.mm.pluginsdk.model.b(resolveInfo, a17));
                            }
                            it = it6;
                        }
                        com.tencent.mm.pluginsdk.model.g2 g2Var = new com.tencent.mm.pluginsdk.model.g2("wechat/multi_send", null);
                        com.tencent.mm.pluginsdk.model.f2 f2Var = new com.tencent.mm.pluginsdk.model.f2();
                        f2Var.f189297a = arrayList2;
                        f2Var.f189298b = new ac5.b(eVar);
                        f2Var.f189300d = a17;
                        if (w17) {
                            f2Var.f189299c = new ac5.d(dVar, g17);
                        }
                        java.util.Map map = f2Var.f189301e;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        for (java.lang.Object obj : p07) {
                            if (((com.tencent.mm.storage.f9) obj) != null) {
                                arrayList3.add(obj);
                            }
                        }
                        java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(arrayList3, 10));
                        java.util.Iterator it7 = arrayList3.iterator();
                        while (it7.hasNext()) {
                            com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) it7.next();
                            java.util.Iterator it8 = it7;
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{\"msgid\":");
                            sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.I0()) : null);
                            sb6.append(";\"msg_type\":");
                            sb6.append(f9Var != null ? java.lang.Integer.valueOf(g95.e0.e(f9Var)) : null);
                            sb6.append(";\"inner_msg_type\":");
                            sb6.append(f9Var != null ? java.lang.Integer.valueOf(g95.e0.b(f9Var)) : null);
                            sb6.append(";\"send_time\":");
                            sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.getCreateTime()) : null);
                            sb6.append('}');
                            arrayList4.add(sb6.toString());
                            it7 = it8;
                        }
                        map.put("selected_msg_list", kz5.n0.g0(arrayList4, "#", null, null, 0, null, null, 62, null));
                        java.util.LinkedList linkedList = (java.util.LinkedList) p07;
                        map.put("selected_how_many_msgs_to_forward", java.lang.Integer.valueOf(linkedList.size()));
                        g2Var.f189318k = f2Var;
                        g2Var.f189317j = aVar;
                        g2Var.f189315h = 7;
                        g2Var.f189313f = z3Var.d1();
                        ((jb0.g) ((jt.x) i95.n0.c(jt.x.class))).Ri(g17, g2Var.f189315h, new ac5.a(g17, g2Var, eVar));
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10811, 9, java.lang.Integer.valueOf(linkedList.size()));
                    }
                }
                tb5.i0.f417055a.c(p07, ya.a.SHARE, b5Var.f198580d.x(), b5Var.f198703q);
                yj0.a.h(this, "com/tencent/mm/ui/chatting/component/ChattingMoreComponent$3", "android/view/View$OnClickListener", str2, str);
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingEditModeSendToOtherApp", "do send to mail fail, select item empty");
        }
        str = "(Landroid/view/View;)V";
        str2 = "onClick";
        tb5.i0.f417055a.c(p07, ya.a.SHARE, b5Var.f198580d.x(), b5Var.f198703q);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/ChattingMoreComponent$3", "android/view/View$OnClickListener", str2, str);
    }
}
