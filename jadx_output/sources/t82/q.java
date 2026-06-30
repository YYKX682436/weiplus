package t82;

/* loaded from: classes12.dex */
public final class q implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t82.r f416401d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f416402e;

    public q(t82.r rVar, java.util.HashMap hashMap) {
        this.f416401d = rVar;
        this.f416402e = hashMap;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        o72.r2 P6;
        o72.r2 P62;
        o72.r2 P63;
        o72.r2 P64;
        jz5.f0 f0Var = null;
        if (menuItem != null) {
            int itemId = menuItem.getItemId();
            v82.a aVar = v82.a.f434066a;
            java.util.HashMap hashMap = this.f416402e;
            if (itemId == 0) {
                hashMap.put("card_clk_type", 4);
                aVar.a("fav_page_card_operation", "view_clk", hashMap);
            } else if (itemId == 1) {
                hashMap.put("card_clk_type", 5);
                aVar.a("fav_page_card_operation", "view_clk", hashMap);
            } else if (itemId == 2) {
                hashMap.put("card_clk_type", 3);
                aVar.a("fav_page_card_operation", "view_clk", hashMap);
            } else if (itemId == 3) {
                hashMap.put("card_clk_type", 2);
                aVar.a("fav_page_card_operation", "view_clk", hashMap);
            }
            int itemId2 = menuItem.getItemId();
            t82.r rVar = this.f416401d;
            if (itemId2 != 0) {
                if (itemId2 != 1) {
                    if (itemId2 != 2) {
                        if (itemId2 == 3 && rVar.f416406g != -1 && (P64 = rVar.Q6().P6(rVar.f416406g)) != null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderFilterUI", "[handleTransmit] favItemInfo id = " + P64.field_id + ", position = " + rVar.f416406g);
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            arrayList.add(P64);
                            if (com.tencent.mm.plugin.fav.ui.FavoriteIndexUI.r7(arrayList, rVar.getContext(), new t82.m(rVar, arrayList), true, true)) {
                                com.tencent.mm.plugin.fav.ui.ec.h(rVar.getContext(), 4106, arrayList);
                            } else {
                                com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderFilterUI", "[handleTransmit] checkFavoriteTransLegal result = false");
                            }
                        }
                    } else if (rVar.f416406g != -1 && (P63 = rVar.Q6().P6(rVar.f416406g)) != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderFilterUI", "[handleTAG] favItemInfo id = " + P63.field_id + ", position = " + rVar.f416406g);
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("key_fav_scene", 4);
                        intent.putExtra("key_fav_item_id", P63.field_localId);
                        o72.x1.L0(rVar.getContext(), ".ui.FavTagEditUI", intent, null);
                        o72.z2.a("FavTagEditUI");
                        rVar.f416405f.invoke(4);
                    }
                } else if (rVar.f416406g != -1 && (P62 = rVar.Q6().P6(rVar.f416406g)) != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderFilterUI", "[handleMore] favItemInfo id = " + P62.field_id + ", position = " + rVar.f416406g);
                    rVar.Q6().T6(rVar.f416406g);
                    w82.k kVar = rVar.f416404e;
                    if (kVar == null) {
                        kotlin.jvm.internal.o.o("mMoreFooter");
                        throw null;
                    }
                    kVar.d(false, false, false, true);
                    if (!((java.util.ArrayList) rVar.Q6().S6()).isEmpty()) {
                        w82.k kVar2 = rVar.f416404e;
                        if (kVar2 == null) {
                            kotlin.jvm.internal.o.o("mMoreFooter");
                            throw null;
                        }
                        kVar2.b(true);
                    } else {
                        w82.k kVar3 = rVar.f416404e;
                        if (kVar3 == null) {
                            kotlin.jvm.internal.o.o("mMoreFooter");
                            throw null;
                        }
                        kVar3.b(false);
                    }
                    rVar.f416403d = true;
                    rVar.f416405f.invoke(15);
                }
            } else if (rVar.f416406g != -1 && (P6 = rVar.Q6().P6(rVar.f416406g)) != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderFilterUI", "[handleDelete] favItemInfo id = " + P6.field_id + ", position = " + rVar.f416406g);
                com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(rVar.getContext());
                u1Var.a(true);
                u1Var.g(rVar.getContext().getString(com.tencent.mm.R.string.c_h));
                u1Var.n(rVar.getContext().getString(com.tencent.mm.R.string.f490367t0));
                u1Var.k(b3.l.getColor(rVar.getContext(), com.tencent.mm.R.color.f479482a31));
                u1Var.l(new t82.f(P6, rVar));
                u1Var.j(rVar.getContext().getString(com.tencent.mm.R.string.baz));
                u1Var.i(new t82.g(rVar));
                u1Var.q(false);
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavFinderFilterUI", "[OnMMMenuItemSelectedListener] item = null!!");
        }
    }
}
