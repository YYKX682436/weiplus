package wu;

/* loaded from: classes9.dex */
public final class b extends wu.p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(hu.f uiParams, com.tencent.mm.plugin.mvvmlist.MvvmList<hu.b> mvvmList) {
        super(uiParams, mvvmList);
        kotlin.jvm.internal.o.g(uiParams, "uiParams");
        kotlin.jvm.internal.o.g(mvvmList, "mvvmList");
    }

    @Override // wu.p
    public void n(android.widget.FrameLayout containerView, hu.b item, int i17, int i18) {
        java.lang.String P;
        java.lang.String string;
        s05.d dVar;
        s05.d dVar2;
        s05.a o17;
        kotlin.jvm.internal.o.g(containerView, "containerView");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.mvvm.MvvmView mvvmView = (com.tencent.mm.mvvm.MvvmView) containerView.findViewById(com.tencent.mm.R.id.uxi);
        if (mvvmView == null || (P = item.f284997e.P()) == null) {
            return;
        }
        l15.c cVar = new l15.c();
        cVar.fromXml(P);
        z01.a aVar = new z01.a();
        v05.b k17 = cVar.k();
        aVar.f468928f = k17 != null ? (s05.d) k17.getCustom(k17.f432315e + 39) : null;
        aVar.f468931i = new wu.a(item, this);
        v05.b k18 = cVar.k();
        aVar.f468930h = k18 != null ? k18.getString(k18.f368365d + 3) : null;
        aVar.f468932m = com.tencent.mm.R.drawable.d87;
        v05.b k19 = cVar.k();
        aVar.f468926d = k19 != null ? k19.getString(k19.f368365d + 2) : null;
        v05.b k27 = cVar.k();
        if (k27 == null || (dVar2 = (s05.d) k27.getCustom(k27.f432315e + 39)) == null || (o17 = dVar2.o()) == null || (string = o17.getSourceName()) == null) {
            v05.b k28 = cVar.k();
            string = k28 != null ? k28.getString(k28.f432315e + 12) : null;
        }
        aVar.f468927e = string;
        hu.f fVar = this.f449610e;
        aVar.f468933n = k01.d.a(fVar.q());
        aVar.f468934o = fVar.o();
        aVar.f468935p = fVar.q();
        v05.b k29 = cVar.k();
        aVar.f468936q = (k29 == null || (dVar = (s05.d) k29.getCustom(k29.f432315e + 39)) == null) ? null : dVar.o();
        v05.b k37 = cVar.k();
        aVar.f468929g = k37 != null ? (v05.a) k37.getCustom(k37.f432315e + 8) : null;
        mvvmView.setViewModel(aVar);
    }

    @Override // wu.p
    public void p(android.widget.FrameLayout containerView, int i17) {
        kotlin.jvm.internal.o.g(containerView, "containerView");
        ((q31.t) ((q31.r) i95.n0.c(q31.r.class))).Ai();
        android.content.Context context = containerView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingAppBrandFakeNativeMvvmView chattingAppBrandFakeNativeMvvmView = new com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingAppBrandFakeNativeMvvmView(context, null, 0, 6, null);
        chattingAppBrandFakeNativeMvvmView.setId(com.tencent.mm.R.id.uxi);
        containerView.addView(chattingAppBrandFakeNativeMvvmView, -2, -2);
    }
}
