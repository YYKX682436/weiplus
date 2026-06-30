package com.tencent.mm.ui.feature.api.screenshot;

/* loaded from: classes8.dex */
public final class l0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f208520d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qj5.q f208521e;

    public l0(android.app.Activity activity, qj5.q qVar) {
        this.f208520d = activity;
        this.f208521e = qVar;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        int i17;
        int i18;
        android.app.Activity activity = this.f208520d;
        g4Var.h(910524417, activity.getString(com.tencent.mm.R.string.o6v), com.tencent.mm.R.raw.icons_filled_share, activity.getResources().getColor(com.tencent.mm.R.color.f478502m));
        g4Var.h(910524419, activity.getString(com.tencent.mm.R.string.o6t), com.tencent.mm.R.raw.bottomsheet_icon_fav, 0);
        qj5.q qVar = this.f208521e;
        if (qVar.h().f363995a) {
            g4Var.h(910524418, activity.getString(com.tencent.mm.R.string.o6w), com.tencent.mm.R.raw.bottomsheet_icon_moment, 0);
        }
        if (qVar.h().f363996b) {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_new_screen_shot_publish_to_biz_android, true)) {
                ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).getClass();
                boolean d17 = com.tencent.wechat.iam.biz.t1.f217792c.d();
                boolean Ai = ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Ai();
                int i19 = d17 ? com.tencent.mm.R.string.p4d : com.tencent.mm.R.string.f493787p25;
                if (Ai) {
                    i17 = com.tencent.mm.R.raw.photo_accounts_filled;
                    i18 = com.tencent.mm.R.color.Blue_100;
                } else {
                    i17 = com.tencent.mm.R.raw.subscriptions_filled;
                    i18 = com.tencent.mm.R.color.Indigo_100;
                }
                g4Var.h(910524426, activity.getString(i19), i17, activity.getResources().getColor(i18));
            }
        }
        if (qVar.h().f363997c) {
            g4Var.h(910524427, activity.getString(com.tencent.mm.R.string.f493788p26), com.tencent.mm.R.raw.bottomsheet_icon_gamecircle, 0);
        }
        sg0.e eVar = (sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class));
        boolean Ni = eVar.Ni(15, 2);
        if (Ni) {
            eVar.Ri(15, 2, tg0.e1.f419061d);
        }
        if (Ni) {
            g4Var.h(910524425, activity.getString(com.tencent.mm.R.string.f493786p24), com.tencent.mm.R.raw.icons_filled_search_logo, -65536);
        }
    }
}
