package gd2;

/* loaded from: classes3.dex */
public final class a implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gd2.i f270523d;

    public a(gd2.i iVar) {
        this.f270523d = iVar;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        gd2.i iVar = this.f270523d;
        java.lang.String string = iVar.f270532a.getString(com.tencent.mm.R.string.jdx);
        com.tencent.mm.ui.MMActivity mMActivity = iVar.f270532a;
        int i17 = com.tencent.mm.R.color.f478502m;
        g4Var.h(1, string, com.tencent.mm.R.raw.icons_filled_share, b3.l.getColor(mMActivity, com.tencent.mm.R.color.f478502m));
        g4Var.h(3, mMActivity.getString(com.tencent.mm.R.string.hjg), com.tencent.mm.R.raw.bottomsheet_icon_fav, 0);
        if (((qk.s6) gm0.j1.s(qk.s6.class)).isTeenMode()) {
            return;
        }
        i95.m c17 = i95.n0.c(tg0.f1.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        java.lang.String Di = ((sg0.e) ((tg0.f1) c17)).Di(3, 2);
        i95.m c18 = i95.n0.c(tg0.f1.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        int Bi = ((sg0.e) ((tg0.f1) c18)).Bi(3, 2);
        i95.m c19 = i95.n0.c(tg0.f1.class);
        kotlin.jvm.internal.o.f(c19, "getService(...)");
        android.content.res.Resources resources = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources();
        int Bi2 = ((sg0.e) ((tg0.f1) c19)).Bi(3, 2);
        if (Bi2 != com.tencent.mm.R.raw.icons_filled_image_recognize_logo) {
            i17 = Bi2 == com.tencent.mm.R.raw.icons_filled_search_logo ? com.tencent.mm.R.color.f478532ac : com.tencent.mm.R.color.f478553an;
        }
        g4Var.h(6, Di, Bi, resources.getColor(i17));
    }
}
