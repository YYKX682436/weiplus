package r71;

/* loaded from: classes12.dex */
public class c implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f393124d;

    /* renamed from: e, reason: collision with root package name */
    public r71.a f393125e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashSet f393126f = new java.util.HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashSet f393127g = new java.util.HashSet();

    /* renamed from: h, reason: collision with root package name */
    public android.app.Dialog f393128h = null;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Set f393129i = new java.util.HashSet();

    public c(android.content.Context context, r71.a aVar) {
        this.f393125e = null;
        this.f393124d = context;
        this.f393125e = aVar;
    }

    public void a(int i17) {
        ((java.util.HashSet) this.f393129i).add(java.lang.Integer.valueOf(i17));
        c01.d9.e().a(i17, this);
    }

    public void b(com.tencent.mm.modelbase.m1 m1Var, boolean z17) {
        android.app.Dialog dialog;
        this.f393127g.add(m1Var);
        if (z17 && ((dialog = this.f393128h) == null || (dialog != null && !dialog.isShowing()))) {
            android.app.Dialog dialog2 = this.f393128h;
            if (dialog2 != null) {
                dialog2.dismiss();
            }
            this.f393128h = db5.e1.Q(this.f393124d, "", "", true, true, new r71.b(this));
        }
        c01.d9.e().g(m1Var);
    }

    public void c(int i17) {
        c01.d9.e().q(i17, this);
        java.util.Set set = this.f393129i;
        ((java.util.HashSet) set).remove(java.lang.Integer.valueOf(i17));
        if (((java.util.HashSet) set).isEmpty()) {
            android.app.Dialog dialog = this.f393128h;
            if (dialog != null) {
                dialog.dismiss();
                this.f393128h = null;
            }
            java.util.HashSet hashSet = this.f393126f;
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                c01.d9.e().d((com.tencent.mm.modelbase.m1) it.next());
            }
            java.util.HashSet hashSet2 = this.f393127g;
            java.util.Iterator it6 = hashSet2.iterator();
            while (it6.hasNext()) {
                c01.d9.e().d((com.tencent.mm.modelbase.m1) it6.next());
            }
            hashSet.clear();
            hashSet2.clear();
            this.f393125e = null;
            this.f393124d = null;
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        boolean z17;
        r71.a aVar;
        android.app.Dialog dialog;
        java.util.HashSet hashSet = this.f393127g;
        boolean contains = hashSet.contains(m1Var);
        java.util.HashSet hashSet2 = this.f393126f;
        boolean z18 = false;
        if (contains) {
            hashSet.remove(m1Var);
        } else {
            if (!hashSet2.contains(m1Var)) {
                z17 = false;
                if (hashSet.isEmpty() && hashSet2.isEmpty() && (dialog = this.f393128h) != null) {
                    dialog.dismiss();
                    this.f393128h = null;
                }
                if (z17 || (aVar = this.f393125e) == null) {
                }
                com.tencent.mm.plugin.address.ui.WalletSelectAddrUI walletSelectAddrUI = (com.tencent.mm.plugin.address.ui.WalletSelectAddrUI) aVar;
                walletSelectAddrUI.f74494m.onSceneEnd(i17, i18, str, m1Var);
                if (i17 != 0 || i18 != 0) {
                    if (m1Var.getType() == 419 && i18 == -3103) {
                        db5.e1.K(walletSelectAddrUI, true, str, "", walletSelectAddrUI.getString(com.tencent.mm.R.string.f489864dv), walletSelectAddrUI.getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.address.ui.s2(walletSelectAddrUI), new com.tencent.mm.plugin.address.ui.t2(walletSelectAddrUI));
                        return;
                    }
                    return;
                }
                if (m1Var.getType() == 417) {
                    if (((q71.o) m1Var).f360357f) {
                        android.view.View findViewById = walletSelectAddrUI.getContentView().findViewById(com.tencent.mm.R.id.f482734me);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(findViewById, "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        walletSelectAddrUI.V6();
                        if (walletSelectAddrUI.f74499r && ((java.util.LinkedList) walletSelectAddrUI.f74488d).size() == 0) {
                            android.content.Intent intent = new android.content.Intent();
                            intent.setClass(walletSelectAddrUI, com.tencent.mm.plugin.address.ui.WalletAddAddressUI.class);
                            walletSelectAddrUI.startActivityForResult(intent, 1);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (m1Var.getType() == 416) {
                    o71.l.wi();
                    s71.b a17 = o71.l.Bi().a(((q71.p) m1Var).f360360f);
                    if (a17 != null) {
                        o71.l.wi();
                        q71.f0 Bi = o71.l.Bi();
                        if (Bi.f360339a == null) {
                            Bi.f360339a = new s71.a();
                        }
                        int i19 = 0;
                        while (true) {
                            if (i19 >= Bi.f360339a.f403969d.size()) {
                                break;
                            }
                            if (((s71.b) Bi.f360339a.f403969d.get(i19)).f403970d == a17.f403970d) {
                                Bi.f360339a.f403969d.remove(i19);
                                z18 = true;
                                break;
                            }
                            i19++;
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSelectAddrUI", "delte addr " + z18);
                    }
                    walletSelectAddrUI.V6();
                    return;
                }
                if (m1Var.getType() == 419) {
                    s71.b bVar = walletSelectAddrUI.f74491g;
                    if (bVar != null) {
                        walletSelectAddrUI.setResult(-1, t71.a.a(bVar));
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSelectAddrUI", "[setResult] OK, address selected");
                        walletSelectAddrUI.finish();
                        return;
                    }
                    return;
                }
                if (m1Var.getType() == 582) {
                    java.lang.String string = walletSelectAddrUI.getString(com.tencent.mm.R.string.f489939g2);
                    int i27 = ((q71.n) m1Var).f360352d;
                    if (i27 == 0) {
                        c01.d9.b().p().w(196657, java.lang.Boolean.TRUE);
                        walletSelectAddrUI.f74496o.setVisibility(8);
                        walletSelectAddrUI.V6();
                        android.view.View contentView = walletSelectAddrUI.getContentView();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                        arrayList2.add(0);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(contentView, arrayList2.toArray(), "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        contentView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(contentView, "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        java.lang.String string2 = walletSelectAddrUI.getString(com.tencent.mm.R.string.f489941g4);
                        com.tencent.mm.ui.widget.dialog.j0 j0Var = walletSelectAddrUI.f74504w;
                        if (j0Var != null) {
                            j0Var.dismiss();
                        }
                        walletSelectAddrUI.f74504w = db5.e1.G(walletSelectAddrUI, string2, null, true, null);
                        return;
                    }
                    if (i27 == 1 || i27 == 2) {
                        c01.d9.b().p().w(196657, java.lang.Boolean.TRUE);
                        walletSelectAddrUI.f74496o.setVisibility(8);
                        java.lang.String string3 = walletSelectAddrUI.getString(com.tencent.mm.R.string.f489940g3);
                        com.tencent.mm.ui.widget.dialog.j0 j0Var2 = walletSelectAddrUI.f74504w;
                        if (j0Var2 != null) {
                            j0Var2.dismiss();
                        }
                        walletSelectAddrUI.f74504w = db5.e1.G(walletSelectAddrUI, string3, null, true, null);
                        return;
                    }
                    if (i27 != 3) {
                        com.tencent.mm.ui.widget.dialog.j0 j0Var3 = walletSelectAddrUI.f74504w;
                        if (j0Var3 != null) {
                            j0Var3.dismiss();
                        }
                        walletSelectAddrUI.f74504w = db5.e1.G(walletSelectAddrUI, string, null, true, null);
                        return;
                    }
                    com.tencent.mm.autogen.events.NeedVerifyQQEvent needVerifyQQEvent = new com.tencent.mm.autogen.events.NeedVerifyQQEvent();
                    am.ok okVar = needVerifyQQEvent.f54517g;
                    okVar.f7553a = walletSelectAddrUI;
                    okVar.f7554b = new com.tencent.mm.plugin.address.ui.r2(walletSelectAddrUI, needVerifyQQEvent);
                    needVerifyQQEvent.b(android.os.Looper.myLooper());
                    return;
                }
                return;
            }
            hashSet2.remove(m1Var);
        }
        z17 = true;
        if (hashSet.isEmpty()) {
            dialog.dismiss();
            this.f393128h = null;
        }
        if (z17) {
        }
    }
}
