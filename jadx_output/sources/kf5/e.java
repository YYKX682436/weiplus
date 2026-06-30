package kf5;

/* loaded from: classes9.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.templateview.ChattingMultiCoverViewNew f307503d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.ui.chatting.viewitems.mvvmview.templateview.ChattingMultiCoverViewNew chattingMultiCoverViewNew) {
        super(3);
        this.f307503d = chattingMultiCoverViewNew;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String str;
        yz5.p pVar;
        c11.b bVar;
        java.util.List list;
        java.lang.String str2;
        int intValue = ((java.lang.Number) obj).intValue();
        android.view.View view = (android.view.View) obj2;
        c11.c cVar = (c11.c) obj3;
        kotlin.jvm.internal.o.g(view, "view");
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.ui6);
        kotlin.jvm.internal.o.d(imageView);
        int i17 = com.tencent.mm.ui.chatting.viewitems.mvvmview.templateview.ChattingMultiCoverViewNew.f204888h;
        com.tencent.mm.ui.chatting.viewitems.mvvmview.templateview.ChattingMultiCoverViewNew chattingMultiCoverViewNew = this.f307503d;
        chattingMultiCoverViewNew.getClass();
        int i18 = kf5.f.f307504a;
        gk0.k kVar = new gk0.k(i18, i18);
        kVar.f272434e = com.tencent.mm.R.raw.chatting_note_default_img;
        kVar.f272433d = 0.05f;
        java.lang.String str3 = "";
        if (cVar == null || (str = cVar.f37821a) == null) {
            str = "";
        }
        if (com.tencent.mm.vfs.w6.j(str)) {
            gk0.n0 n0Var = (gk0.n0) i95.n0.c(gk0.n0.class);
            if (cVar != null && (str2 = cVar.f37821a) != null) {
                str3 = str2;
            }
            ((h83.g) n0Var).Ai(imageView, str3, kVar);
        } else if (cVar == null || (bVar = cVar.f37822b) == null) {
            c11.f viewModel = chattingMultiCoverViewNew.getViewModel();
            if (viewModel != null && (pVar = viewModel.f37843o) != null) {
                pVar.invoke(java.lang.Integer.valueOf(intValue), imageView);
            }
        } else {
            y01.a c17 = af5.y0.c(bVar);
            java.lang.String wi6 = ((rx.h) ((gk0.k0) i95.n0.c(gk0.k0.class))).wi(kVar, c17);
            i95.m c18 = i95.n0.c(gk0.n0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            g75.z x66 = gk0.n0.x6((gk0.n0) c18, wi6, kVar, imageView, null, 8, null);
            x66.l("KeyCdnParams", c17);
            gk0.j.b(((rx.h) ((gk0.k0) i95.n0.c(gk0.k0.class))).Ai(), x66, null, 2, null);
        }
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view.findViewById(com.tencent.mm.R.id.ui7);
        kotlin.jvm.internal.o.d(frameLayout);
        frameLayout.removeAllViews();
        if (cVar != null && (list = cVar.f37823c) != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                frameLayout.addView((android.view.View) it.next());
            }
        }
        return jz5.f0.f302826a;
    }
}
