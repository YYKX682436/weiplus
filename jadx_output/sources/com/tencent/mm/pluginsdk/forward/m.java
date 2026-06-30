package com.tencent.mm.pluginsdk.forward;

@j95.b
/* loaded from: classes8.dex */
public final class m extends i95.w implements o25.y1 {

    /* renamed from: e, reason: collision with root package name */
    public int f188722e;

    /* renamed from: f, reason: collision with root package name */
    public db5.t4 f188723f;

    /* renamed from: g, reason: collision with root package name */
    public rl5.r f188724g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f188725h;

    /* renamed from: i, reason: collision with root package name */
    public db5.g4 f188726i;

    /* renamed from: m, reason: collision with root package name */
    public android.content.Context f188727m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f188728n;

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f188721d = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public int f188729o = 1;

    /* renamed from: p, reason: collision with root package name */
    public final int f188730p = 2;

    public android.view.View Ai(android.content.Context context, db5.g4 menu, com.tencent.mm.ui.widget.dialog.k0 sheet, int i17, yz5.l lVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        return Bi(context, menu, sheet, null, i17, lVar);
    }

    public android.view.View Bi(android.content.Context context, db5.g4 menu, com.tencent.mm.ui.widget.dialog.k0 sheet, db5.k4 k4Var, int i17, yz5.l lVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        this.f188727m = context;
        this.f188725h = sheet;
        this.f188726i = menu;
        this.f188729o = i17;
        sheet.f211858f = new com.tencent.mm.pluginsdk.forward.e(context, this);
        Zi();
        if (this.f188721d.size() == 0) {
            com.tencent.mars.xlog.Log.i("MircoMsg.RecentForwardMenuHelper", "addMenus return for conversationList empty!");
            if (lVar == null) {
                return null;
            }
            lVar.invoke(java.lang.Boolean.FALSE);
            return null;
        }
        android.view.View a17 = com.tencent.mm.ui.transmit.recent.k.f211058a.a(context, sheet, i17);
        if (k4Var != null) {
            sheet.K = k4Var;
        } else {
            sheet.K = com.tencent.mm.ui.transmit.recent.j.f211057a;
        }
        ij(menu, false);
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.TRUE);
        }
        return a17;
    }

    public void Di(android.content.Context context, com.tencent.mm.ui.widget.dialog.k0 bottomSheet, int i17, yz5.l lVar, yz5.l lVar2) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
        bottomSheet.f211876p = new com.tencent.mm.pluginsdk.forward.f(this, context, bottomSheet, i17, lVar);
        bottomSheet.f211885w = new com.tencent.mm.pluginsdk.forward.h(this, lVar2);
        bottomSheet.f211886x = new com.tencent.mm.pluginsdk.forward.i(this, bottomSheet);
    }

    public final void Ni(java.lang.String str) {
        b95.j Ai;
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            uk0.a.c(new com.tencent.mm.ipcinvoker.type.IPCString(str), com.tencent.mm.pluginsdk.forward.j.f188714d, null, 4, null);
            return;
        }
        com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation pluginMessengerFoundation = (com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) i95.n0.c(com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation.class);
        if (pluginMessengerFoundation == null || (Ai = pluginMessengerFoundation.Ai()) == null) {
            return;
        }
        Ai.a(str);
    }

    public void Ri(com.tencent.mm.ui.widget.dialog.k0 sheet, db5.g4 menu) {
        kotlin.jvm.internal.o.g(sheet, "sheet");
        kotlin.jvm.internal.o.g(menu, "menu");
        if (sheet.i()) {
            ij(menu, true);
            sheet.j();
        }
    }

    public java.util.ArrayList Ui() {
        Zi();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!this.f188721d.isEmpty()) {
            java.util.Iterator it = this.f188721d.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                kotlin.jvm.internal.o.f(next, "next(...)");
                com.tencent.mm.ui.transmit.recent.ForwardConversationInfo forwardConversationInfo = (com.tencent.mm.ui.transmit.recent.ForwardConversationInfo) next;
                java.lang.String str = forwardConversationInfo.f211048g;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    str = forwardConversationInfo.f211046e;
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    str = forwardConversationInfo.f211047f;
                }
                java.lang.String str2 = com.tencent.mm.sdk.platformtools.w9.f193053a;
                java.lang.String str3 = forwardConversationInfo.f211045d;
                com.tencent.mm.ipcinvoker.type.IPCString iPCString = new com.tencent.mm.ipcinvoker.type.IPCString(str3);
                ((q80.g0) i95.n0.c(q80.g0.class)).getClass();
                com.tencent.mm.ipcinvoker.type.IPCString iPCString2 = (com.tencent.mm.ipcinvoker.type.IPCString) com.tencent.mm.ipcinvoker.extension.l.b(str2, iPCString, ra3.d.class);
                kotlin.jvm.internal.o.d(str3);
                java.lang.String value = iPCString2.f68406d;
                kotlin.jvm.internal.o.f(value, "value");
                arrayList.add(new o25.m2(str3, str, value));
            }
        }
        return arrayList;
    }

    public java.util.List Vi() {
        java.util.ArrayList arrayList = this.f188721d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.tencent.mm.ui.transmit.recent.ForwardConversationInfo) it.next()).f211045d);
        }
        return arrayList2;
    }

    public final void Zi() {
        this.f188721d.clear();
        java.util.ArrayList a17 = com.tencent.mm.sdk.platformtools.x2.n() ? new com.tencent.mm.ui.transmit.recent.i().a() : new com.tencent.mm.ui.transmit.recent.i().b();
        this.f188721d = a17;
        this.f188722e = a17.size();
        this.f188728n = false;
    }

    public boolean aj(db5.h4 menu, yz5.l callback) {
        r45.pk5 pk5Var;
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(callback, "callback");
        int i17 = menu.f228366g + com.tencent.tinker.loader.shareutil.ShareConstants.ERROR_LOAD_GET_INTENT_FAIL;
        if (menu instanceof db5.v5) {
            if (((db5.v5) menu).M == 1) {
                this.f188728n = !r1.L;
                db5.g4 g4Var = this.f188726i;
                if (g4Var != null) {
                    ij(g4Var, false);
                }
                com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f188725h;
                if (k0Var == null) {
                    return false;
                }
                k0Var.j();
                return false;
            }
        }
        if (this.f188728n) {
            if (this.f188721d.size() <= i17 || i17 < 0) {
                return false;
            }
            com.tencent.mm.ui.widget.dialog.k0 k0Var2 = this.f188725h;
            android.content.Context context = this.f188727m;
            if (k0Var2 == null || context == null) {
                return false;
            }
            hj(k0Var2, context, menu, this.f188729o);
            return false;
        }
        if (this.f188721d.size() <= i17 || i17 < 0) {
            return false;
        }
        android.content.Context context2 = this.f188727m;
        if (context2 != null && (pk5Var = (r45.pk5) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ai(context2, 14, r45.pk5.class)) != null) {
            pk5Var.f383135g = i17 + 1;
        }
        com.tencent.mm.ui.mvvm.uic.conversation.recent.e eVar = com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209294a;
        com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209299f = i17 < b95.b.a() ? 8 : 4;
        java.lang.String str = ((com.tencent.mm.ui.transmit.recent.ForwardConversationInfo) this.f188721d.get(i17)).f211045d;
        if (str == null) {
            str = "";
        }
        callback.invoke(str);
        return true;
    }

    public boolean bj(com.tencent.mm.ui.widget.dialog.k0 bottomSheet, db5.h4 menu) {
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
        kotlin.jvm.internal.o.g(menu, "menu");
        return cj(bottomSheet, menu, 1);
    }

    public boolean cj(com.tencent.mm.ui.widget.dialog.k0 bottomSheet, db5.h4 menu, int i17) {
        boolean z17;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager;
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
        kotlin.jvm.internal.o.g(menu, "menu");
        if (this.f188728n) {
            return false;
        }
        int size = this.f188721d.size();
        boolean z18 = false;
        for (int i18 = 0; i18 < size; i18++) {
            if (kotlin.jvm.internal.o.b(((com.tencent.mm.ui.transmit.recent.ForwardConversationInfo) this.f188721d.get(i18)).f211045d, menu.A)) {
                rl5.r rVar = this.f188724g;
                if (rVar != null) {
                    rVar.a();
                }
                androidx.recyclerview.widget.RecyclerView recyclerView = bottomSheet.F1;
                android.view.View findViewByPosition = (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) ? null : layoutManager.findViewByPosition(i18);
                android.view.View findViewById = findViewByPosition != null ? findViewByPosition.findViewById(com.tencent.mm.R.id.f485288h62) : null;
                android.view.View view = findViewById == null ? findViewByPosition : findViewById;
                if (view != null) {
                    rl5.r rVar2 = new rl5.r(view.getContext());
                    rVar2.C = true;
                    rVar2.L = new com.tencent.mm.pluginsdk.forward.k(this);
                    this.f188724g = rVar2;
                    int[] iArr = {0, 0};
                    view.getLocationInWindow(iArr);
                    this.f188723f = new com.tencent.mm.pluginsdk.forward.l(this, bottomSheet, view, menu, i17);
                    int f17 = i65.a.f(view.getContext(), com.tencent.mm.R.dimen.f479646bl);
                    rl5.r rVar3 = this.f188724g;
                    if (rVar3 != null) {
                        db5.t4 t4Var = this.f188723f;
                        int width = (int) (iArr[0] + (view.getWidth() / 2.0f));
                        z17 = true;
                        int i19 = iArr[1] - f17;
                        rVar3.f397354x = t4Var;
                        rVar3.f397338f = findViewByPosition;
                        if (!(findViewByPosition instanceof android.widget.TextView) && (width == 0 || i19 == 0)) {
                            rVar3.l();
                        }
                        rVar3.f397356z.clear();
                        db5.g4 g4Var = rVar3.f397356z;
                        if (g4Var != null) {
                            g4Var.b(0, com.tencent.mm.R.string.ify, com.tencent.mm.R.raw.icons_filled_delete);
                        }
                        if (width == 0 && i19 == 0) {
                            rVar3.m();
                        } else {
                            rVar3.n(width, i19);
                        }
                    } else {
                        z17 = true;
                    }
                } else {
                    z17 = true;
                }
                z18 = z17;
            }
        }
        return z18;
    }

    public void fj(java.lang.String userName) {
        kotlin.jvm.internal.o.g(userName, "userName");
        java.util.Iterator it = this.f188721d.iterator();
        kotlin.jvm.internal.o.f(it, "iterator(...)");
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            kotlin.jvm.internal.o.f(next, "next(...)");
            if (kotlin.jvm.internal.o.b(((com.tencent.mm.ui.transmit.recent.ForwardConversationInfo) next).f211045d, userName)) {
                it.remove();
                break;
            }
        }
        Ni(userName);
    }

    public final void hj(com.tencent.mm.ui.widget.dialog.k0 k0Var, android.content.Context context, db5.h4 h4Var, int i17) {
        r45.pk5 pk5Var;
        java.lang.String str;
        java.util.Iterator it = this.f188721d.iterator();
        kotlin.jvm.internal.o.f(it, "iterator(...)");
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            kotlin.jvm.internal.o.f(next, "next(...)");
            if (kotlin.jvm.internal.o.b(((com.tencent.mm.ui.transmit.recent.ForwardConversationInfo) next).f211045d, h4Var.A)) {
                it.remove();
                break;
            }
        }
        db5.g4 g4Var = this.f188726i;
        if (g4Var != null) {
            ij(g4Var, false);
        }
        k0Var.j();
        if (this.f188721d.size() == 0) {
            if (i17 == 3) {
                android.widget.TextView textView = k0Var.E1;
                if (textView != null) {
                    textView.setVisibility(8);
                }
            } else if (i17 != 6) {
                android.widget.LinearLayout linearLayout = k0Var.U;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
            } else {
                com.tencent.mm.ui.transmit.recent.k.f211058a.a(context, k0Var, i17);
            }
        }
        java.lang.String str2 = h4Var.A;
        kotlin.jvm.internal.o.f(str2, "getWebUrl(...)");
        Ni(str2);
        android.content.Context context2 = this.f188727m;
        if (context2 == null || (pk5Var = (r45.pk5) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ai(context2, 14, r45.pk5.class)) == null) {
            return;
        }
        pk5Var.f383133e++;
        java.lang.String str3 = pk5Var.f383134f;
        if (str3 == null || r26.n0.N(str3)) {
            str = h4Var.A;
        } else {
            str = pk5Var.f383134f + (char) 65372 + h4Var.A;
        }
        pk5Var.f383134f = str;
    }

    public final void ij(db5.g4 g4Var, boolean z17) {
        android.content.Context context;
        ((java.util.ArrayList) g4Var.f228344d).clear();
        int size = this.f188721d.size();
        if (size > 0) {
            int i17 = 0;
            while (i17 < size) {
                db5.v5 v5Var = new db5.v5(this.f188727m, i17 + 10000, 0);
                java.lang.String str = ((com.tencent.mm.ui.transmit.recent.ForwardConversationInfo) this.f188721d.get(i17)).f211048g;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    str = ((com.tencent.mm.ui.transmit.recent.ForwardConversationInfo) this.f188721d.get(i17)).f211046e;
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    str = ((com.tencent.mm.ui.transmit.recent.ForwardConversationInfo) this.f188721d.get(i17)).f211047f;
                }
                v5Var.f228371o = str;
                v5Var.A = ((com.tencent.mm.ui.transmit.recent.ForwardConversationInfo) this.f188721d.get(i17)).f211045d;
                v5Var.f228375s = z17;
                v5Var.L = this.f188728n;
                vh0.n1 n1Var = (vh0.n1) i95.n0.c(vh0.n1.class);
                java.lang.String str2 = v5Var.A;
                ((vh0.f3) n1Var).getClass();
                if ((!com.tencent.mm.storage.z3.W4(str2) ? false : ih.a.h("clicfg_enable_yuanbao_show_openim_info_android", false)) && (context = this.f188727m) != null) {
                    v5Var.G = context.getResources().getDrawable(com.tencent.mm.R.drawable.db6);
                }
                g4Var.v(v5Var);
                i17++;
            }
            db5.v5 v5Var2 = new db5.v5(this.f188727m, i17 + 10000, 0);
            v5Var2.f228375s = z17;
            v5Var2.L = this.f188728n;
            v5Var2.M = 1;
            g4Var.v(v5Var2);
        }
    }

    public android.view.View wi(android.content.Context context, db5.g4 menu, com.tencent.mm.ui.widget.dialog.k0 sheet) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        return Ai(context, menu, sheet, 1, null);
    }
}
