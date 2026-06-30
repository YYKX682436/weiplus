package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class u4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.IconPreference f211066d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ su4.f3 f211067e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.FindMoreFriendsUI f211068f;

    public u4(com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI, com.tencent.mm.ui.base.preference.IconPreference iconPreference, su4.f3 f3Var) {
        this.f211068f = findMoreFriendsUI;
        this.f211066d = iconPreference;
        this.f211067e = f3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public void run() {
        int i17;
        com.tencent.mm.ui.base.preference.IconPreference iconPreference = this.f211066d;
        if (iconPreference == 0) {
            return;
        }
        com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI = this.f211068f;
        findMoreFriendsUI.b1("find_friends_by_search", false);
        com.tencent.mm.plugin.newtips.model.a aVar = (com.tencent.mm.plugin.newtips.model.a) iconPreference;
        su4.f3 f3Var = this.f211067e;
        if (aVar.o0(f3Var != null && f3Var.a() && (i17 = f3Var.f412886f) >= 1 && i17 <= 4)) {
            return;
        }
        iconPreference.a0(8);
        if (f3Var == null) {
            iconPreference.c0(8);
            return;
        }
        if (f3Var.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "show red %s", iconPreference.f197774h);
            int i18 = f3Var.f412886f;
            if (i18 == 1) {
                iconPreference.c0(0);
                iconPreference.b0(8);
                aVar.e5(com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_REDPOINT, true);
            } else if (i18 == 2) {
                iconPreference.c0(8);
                iconPreference.b0(0);
                iconPreference.d0(f3Var.f412887g, -1, android.graphics.Color.parseColor("#8c8c8c"));
                iconPreference.e0(true);
                iconPreference.Y(8);
                aVar.e5(com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE, true);
            } else if (i18 == 3) {
                iconPreference.Y(0);
                iconPreference.T(0);
                iconPreference.V(0);
                iconPreference.e0(false);
                android.graphics.Bitmap Bi = ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Bi(f3Var.f412888h);
                if (Bi != null) {
                    findMoreFriendsUI.B = null;
                    iconPreference.R(Bi);
                } else {
                    ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).Ui(f3Var.f412888h, findMoreFriendsUI.C1);
                    findMoreFriendsUI.B = f3Var.f412888h;
                }
                aVar.e5(com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_REDPOINT_ICON, true);
            } else if (i18 != 4) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FindMoreFriendsUI", "search unknown red type %d", java.lang.Integer.valueOf(i18));
            } else {
                iconPreference.Y(0);
                iconPreference.T(0);
                iconPreference.V(0);
                iconPreference.b0(0);
                iconPreference.e0(false);
                iconPreference.d0(f3Var.f412887g, -1, android.graphics.Color.parseColor("#8c8c8c"));
                android.graphics.Bitmap Bi2 = ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Bi(f3Var.f412888h);
                if (Bi2 != null) {
                    findMoreFriendsUI.B = null;
                    iconPreference.R(Bi2);
                } else {
                    ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).Ui(f3Var.f412888h, findMoreFriendsUI.C1);
                    findMoreFriendsUI.B = f3Var.f412888h;
                }
                aVar.e5(com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE_ICON, true);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "hide red %s", iconPreference.f197774h);
            iconPreference.c0(8);
            iconPreference.b0(8);
            iconPreference.Y(8);
            iconPreference.E(0);
            if (iconPreference instanceof com.tencent.mm.plugin.newtips.NormalIconNewTipPreference) {
                ((com.tencent.mm.plugin.newtips.NormalIconNewTipPreference) iconPreference).h0();
            }
        }
        findMoreFriendsUI.b1("find_friends_by_search", f3Var.a());
        findMoreFriendsUI.f196656w.notifyDataSetChanged();
    }
}
