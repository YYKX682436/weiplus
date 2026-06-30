package wc5;

/* loaded from: classes10.dex */
public final /* synthetic */ class o0 extends kotlin.jvm.internal.m implements yz5.l {
    public o0(java.lang.Object obj) {
        super(1, obj, wc5.y0.class, "onSearchTextChanged", "onSearchTextChanged(Ljava/lang/String;)V", 0);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        xm3.t0 b17;
        java.lang.String p07 = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(p07, "p0");
        wc5.y0 y0Var = (wc5.y0) this.receiver;
        y0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGallerySearchFilterUIC", "onSearchTextChanged: query='" + p07 + "', isSearching=" + y0Var.f444659g);
        kotlinx.coroutines.r2 r2Var = y0Var.f444658f;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        y0Var.Y6(true, !r26.n0.N(p07));
        if (r26.n0.N(p07)) {
            y0Var.f444660h = "";
            y0Var.V6("", false);
            if (y0Var.f444659g) {
                y0Var.f444659g = false;
                y0Var.f444660h = "";
                y0Var.f444665p = vc5.j.f435324d;
                y0Var.f444666q = null;
                y0Var.f444667r = null;
                uc5.f fVar = y0Var.f444657e;
                fVar.getClass();
                fVar.f426482a = "";
                y0Var.V6("", false);
                com.tencent.mm.plugin.mvvmlist.MvvmList l76 = ((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) y0Var.U6()).l7();
                if (l76 != null && (b17 = xm3.u0.b(((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) y0Var.U6()).m7())) != null) {
                    java.util.ArrayList arrayList = l76.f152065o;
                    kotlin.jvm.internal.o.e(arrayList, "null cannot be cast to non-null type java.util.ArrayList<com.tencent.mm.ui.chatting.history.base.MsgHistoryGalleryRow>{ kotlin.collections.TypeAliasesKt.ArrayList<com.tencent.mm.ui.chatting.history.base.MsgHistoryGalleryRow> }");
                    b17.E0(arrayList);
                    b17.notifyDataSetChanged();
                    y0Var.W6();
                    if (((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) y0Var.U6()).r7()) {
                        y0Var.X6();
                    }
                }
            }
        } else {
            y0Var.f444660h = p07;
            y0Var.f444658f = v65.i.b(((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) y0Var.U6()).k7(), null, new wc5.r0(y0Var, p07, null), 1, null);
        }
        return jz5.f0.f302826a;
    }
}
