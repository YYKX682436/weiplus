package t82;

/* loaded from: classes12.dex */
public final class n implements w82.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t82.r f416397a;

    public n(t82.r rVar) {
        this.f416397a = rVar;
    }

    @Override // w82.j
    public void a() {
        t82.r rVar = this.f416397a;
        if (com.tencent.mm.plugin.fav.ui.FavoriteIndexUI.r7(rVar.Q6().S6(), rVar.getContext(), new t82.l(rVar), true, true)) {
            com.tencent.mm.plugin.fav.ui.ec.h(rVar.getContext(), 4105, rVar.Q6().S6());
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderFilterUI", "[handleMoreFooterForward] checkFavoriteTransLegal result = false");
        }
    }

    @Override // w82.j
    public void b() {
    }

    @Override // w82.j
    public void c() {
        t82.r rVar = this.f416397a;
        java.util.List S6 = rVar.Q6().S6();
        if (((java.util.ArrayList) S6).isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderFilterUI", "[handleMoreFooterDelete] getSelectFavItemInfos isEmpty = true");
            return;
        }
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(rVar.getContext());
        u1Var.a(true);
        u1Var.g(rVar.getContext().getString(com.tencent.mm.R.string.c_i));
        u1Var.n(rVar.getContext().getString(com.tencent.mm.R.string.f490367t0));
        u1Var.k(b3.l.getColor(rVar.getContext(), com.tencent.mm.R.color.f479482a31));
        u1Var.l(new t82.j(S6, rVar));
        u1Var.j(rVar.getContext().getString(com.tencent.mm.R.string.baz));
        u1Var.i(new t82.k(rVar));
        u1Var.q(false);
    }

    @Override // w82.j
    public void d() {
        t82.r rVar = this.f416397a;
        java.util.ArrayList arrayList = (java.util.ArrayList) rVar.Q6().S6();
        if (arrayList.isEmpty()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavFinderFilterUI", "[onAddTagRequest] select items count <= 0, maybe error!");
            return;
        }
        if (arrayList.size() <= 1) {
            o72.r2 r2Var = (o72.r2) arrayList.get(0);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_fav_scene", 3);
            intent.putExtra("key_fav_item_id", r2Var.field_localId);
            o72.x1.L0(rVar.getContext(), ".ui.FavTagEditUI", intent, null);
            o72.z2.a("FavTagEditUI");
            rVar.P6();
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("key_fav_scene", 3);
        intent2.putExtra("key_fav_is_add_tag", true);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            arrayList2.add(java.lang.Integer.valueOf(((o72.r2) arrayList.get(i17)).field_id));
        }
        intent2.putExtra("key_fav_item_ids", arrayList2);
        o72.x1.M0(rVar.getContext(), ".ui.FavTagEditUI", intent2, 4104, null);
        o72.z2.a("FavTagEditUI");
        rVar.P6();
    }
}
