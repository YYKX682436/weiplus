package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class c5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f198075d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f198076e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.d5 f198077f;

    public c5(com.tencent.mm.ui.d5 d5Var, java.lang.String str, android.graphics.Bitmap bitmap) {
        this.f198077f = d5Var;
        this.f198075d = str;
        this.f198076e = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("download url ");
        java.lang.String str = this.f198075d;
        sb6.append(str);
        sb6.append(" , result ");
        android.graphics.Bitmap bitmap = this.f198076e;
        sb6.append(bitmap == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", sb6.toString());
        com.tencent.mm.ui.d5 d5Var = this.f198077f;
        com.tencent.mm.ui.base.preference.IconPreference iconPreference = (com.tencent.mm.ui.base.preference.IconPreference) d5Var.f208328a.f196656w.h("jd_market_entrance");
        if (iconPreference != null) {
            if (str.equals(d5Var.f208328a.C)) {
                iconPreference.R(bitmap);
                d5Var.f208328a.C = null;
            }
            d5Var.f208328a.f196656w.notifyDataSetChanged();
        }
        if (str.equals(d5Var.f208328a.f196663z)) {
            ((com.tencent.mm.ui.base.preference.IconPreference) d5Var.f208328a.f196656w.h("find_friends_by_look")).U = new android.graphics.drawable.BitmapDrawable(d5Var.f208328a.getContext().getResources(), bitmap);
            com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI = d5Var.f208328a;
            findMoreFriendsUI.f196663z = null;
            findMoreFriendsUI.f196656w.notifyDataSetChanged();
        }
        if (str.equals(d5Var.f208328a.A)) {
            ((com.tencent.mm.ui.base.preference.IconPreference) d5Var.f208328a.f196656w.h("find_friends_by_search")).U = new android.graphics.drawable.BitmapDrawable(d5Var.f208328a.getContext().getResources(), bitmap);
            com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI2 = d5Var.f208328a;
            findMoreFriendsUI2.A = null;
            findMoreFriendsUI2.f196656w.notifyDataSetChanged();
        }
        if (str.equals(d5Var.f208328a.f196654u.f209034b)) {
            ((com.tencent.mm.ui.base.preference.IconPreference) d5Var.f208328a.f196656w.h("find_friends_by_look")).R(bitmap);
            com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI3 = d5Var.f208328a;
            findMoreFriendsUI3.f196654u.f209034b = null;
            findMoreFriendsUI3.f196656w.notifyDataSetChanged();
        }
        if (str.equals(d5Var.f208328a.B)) {
            ((com.tencent.mm.ui.base.preference.IconPreference) d5Var.f208328a.f196656w.h("find_friends_by_search")).R(bitmap);
            com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI4 = d5Var.f208328a;
            findMoreFriendsUI4.B = null;
            findMoreFriendsUI4.f196656w.notifyDataSetChanged();
        }
        if (str.equals(d5Var.f208328a.f196651p1)) {
            ((com.tencent.mm.ui.base.preference.IconPreference) d5Var.f208328a.f196656w.h("my_life_around")).R(com.tencent.mm.sdk.platformtools.x.s0(bitmap, false, bitmap.getWidth() * 0.1f));
            com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI5 = d5Var.f208328a;
            findMoreFriendsUI5.f196651p1 = null;
            findMoreFriendsUI5.f196656w.notifyDataSetChanged();
        }
    }
}
