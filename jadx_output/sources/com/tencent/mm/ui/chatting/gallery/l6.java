package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class l6 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f201176d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f201177e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f201178f;

    public l6(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI, com.tencent.mm.storage.f9 f9Var, java.util.ArrayList arrayList) {
        this.f201178f = imageGalleryUI;
        this.f201176d = f9Var;
        this.f201177e = arrayList;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        int i17;
        g4Var.clear();
        if (c01.ia.e(this.f201176d)) {
            return;
        }
        boolean y17 = c01.ia.y(this.f201176d);
        int i18 = com.tencent.mm.R.color.f478502m;
        boolean z17 = false;
        if (!y17 && !c01.ia.C(this.f201176d)) {
            g4Var.h(0, this.f201178f.getString(com.tencent.mm.R.string.i29), com.tencent.mm.R.raw.icons_filled_share, this.f201178f.getResources().getColor(com.tencent.mm.R.color.f478502m));
            this.f201177e.add(1);
            if (this.f201176d.M2() && com.tencent.mm.pluginsdk.ui.tools.e9.l()) {
                g4Var.h(10, this.f201178f.getString(com.tencent.mm.R.string.hra), com.tencent.mm.R.raw.bottomsheet_icon_moment, 0);
            }
        }
        j45.l.g("favorite");
        if (!c01.ia.A(this.f201176d)) {
            if (com.tencent.mm.ui.chatting.gallery.k1.N(this.f201176d)) {
                t21.v2 h17 = t21.d3.h(this.f201176d.z0());
                if (h17 != null && ((i17 = h17.f415011i) == 199 || i17 == 199 || t21.d3.u(h17))) {
                    g4Var.h(2, this.f201178f.getString(com.tencent.mm.R.string.hjg), com.tencent.mm.R.raw.bottomsheet_icon_fav, 0);
                    this.f201177e.add(2);
                }
            } else {
                g4Var.h(2, this.f201178f.getString(com.tencent.mm.R.string.hjg), com.tencent.mm.R.raw.bottomsheet_icon_fav, 0);
                this.f201177e.add(2);
            }
        }
        ((su4.x0) i95.n0.c(su4.x0.class)).getClass();
        if (com.tencent.mm.ui.chatting.gallery.k1.L(this.f201176d) || com.tencent.mm.ui.chatting.gallery.k1.K(this.f201176d)) {
            ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
            if (su4.r2.l() || this.f201176d == null) {
                return;
            }
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f201178f;
            int i19 = com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.f200588p4;
            if (android.text.TextUtils.isEmpty(imageGalleryUI.H7()) && ((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Ni(1, 2)) {
                z17 = true;
            }
            if (z17) {
                java.lang.String Di = ((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Di(1, 2);
                int Bi = ((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Bi(1, 2);
                sg0.e eVar = (sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class));
                eVar.getClass();
                android.content.res.Resources resources = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources();
                int Bi2 = eVar.Bi(1, 2);
                if (Bi2 != com.tencent.mm.R.raw.icons_filled_image_recognize_logo) {
                    i18 = Bi2 == com.tencent.mm.R.raw.icons_filled_search_logo ? com.tencent.mm.R.color.f478532ac : com.tencent.mm.R.color.f478553an;
                }
                g4Var.h(14, Di, Bi, resources.getColor(i18));
            } else {
                g4Var.h(11, this.f201178f.getString(com.tencent.mm.R.string.f490873b44), com.tencent.mm.R.raw.icons_filled_search_logo, this.f201178f.getResources().getColor(com.tencent.mm.R.color.f478532ac));
            }
            this.f201177e.add(3);
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ui.chatting.gallery.k6(this, z17));
        }
    }
}
