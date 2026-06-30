package ze5;

/* loaded from: classes9.dex */
public final class f9 extends ze5.c9 {
    @Override // ze5.c9, com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 menu, android.view.View v17, rd5.d msgData) {
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        menu.b(100, com.tencent.mm.R.string.b3p, com.tencent.mm.R.raw.icons_filled_delete);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.l6
    public void d(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
    }

    @Override // ze5.c9
    public com.tencent.mm.mvvm.MvvmView d0(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        i95.m c17 = i95.n0.c(q31.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((q31.t) ((q31.r) c17)).Ai();
        return new com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingScheduleMsgMvvmView(context, null, 0, 6, null);
    }

    @Override // ze5.c9
    public q31.p e0(yb5.d ui6, com.tencent.mm.storage.f9 msg, java.lang.String str) {
        java.lang.String n17;
        d15.a aVar;
        java.lang.Long k17;
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msg, "msg");
        z01.d0 d0Var = new z01.d0();
        java.lang.String U1 = msg.U1();
        if (!(true ^ (U1 == null || r26.n0.N(U1)))) {
            U1 = null;
        }
        if (U1 == null) {
            return new z01.d0();
        }
        l15.c cVar = new l15.c();
        cVar.fromXml(U1);
        v05.b k18 = cVar.k();
        if (k18 == null) {
            return new z01.d0();
        }
        int i17 = k18.f432315e + 33;
        d15.a aVar2 = (d15.a) k18.getCustom(i17);
        if (aVar2 == null || (n17 = aVar2.n()) == null || (aVar = (d15.a) k18.getCustom(i17)) == null || (k17 = aVar.k()) == null) {
            return d0Var;
        }
        long longValue = k17.longValue();
        com.tencent.mm.storage.f9 o27 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).o2(n17, longValue);
        d15.a aVar3 = (d15.a) k18.getCustom(i17);
        d0Var.f468986d = aVar3 != null ? aVar3.j() : null;
        d0Var.f468987e = pj5.k.f355386a.b(o27);
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        d0Var.f468988f = c01.a2.e(n17);
        android.icu.text.SimpleDateFormat simpleDateFormat = new android.icu.text.SimpleDateFormat("yyyy-MM-dd HH:mm", java.util.Locale.getDefault());
        d15.a aVar4 = (d15.a) k18.getCustom(i17);
        d0Var.f468989g = java.lang.Long.valueOf(simpleDateFormat.parse(aVar4 != null ? aVar4.l() : null).getTime());
        d0Var.f468990h = java.lang.Long.valueOf(longValue);
        d0Var.f468992m = new ze5.d9(ui6, o27);
        d0Var.f468991i = new ze5.e9(ui6, o27);
        return d0Var;
    }
}
