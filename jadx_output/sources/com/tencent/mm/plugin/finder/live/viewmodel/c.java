package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class c implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.g f116959a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f116960b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f116961c;

    public c(com.tencent.mm.plugin.finder.live.viewmodel.g gVar, int i17, java.lang.String str) {
        this.f116959a = gVar;
        this.f116960b = i17;
        this.f116961c = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.n73 n73Var;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String string;
        java.util.LinkedList list;
        java.lang.Object obj2;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        com.tencent.mm.plugin.finder.live.viewmodel.g gVar = this.f116959a;
        if (i17 == 0 && fVar.f70616b == 0) {
            r45.hv1 hv1Var = (r45.hv1) fVar.f70618d;
            if (hv1Var == null || (list = hv1Var.getList(1)) == null) {
                n73Var = null;
            } else {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    r45.z53 z53Var = (r45.z53) ((r45.n73) obj2).getCustom(1);
                    if (kotlin.jvm.internal.o.b(z53Var != null ? z53Var.getString(0) : null, gVar.f117100f)) {
                        break;
                    }
                }
                n73Var = (r45.n73) obj2;
            }
            if ((n73Var != null ? (r45.s63) n73Var.getCustom(3) : null) == null) {
                com.tencent.mars.xlog.Log.w(gVar.f117098d, "detail null");
                pm0.z.b(xy2.b.f458155b, "AUTH_ERROR_USERCONFIG_NULL", false, null, null, false, false, null, 124, null);
                db5.t7.makeText(gVar.getContext(), com.tencent.mm.R.string.dgq, 0).show();
            } else {
                r45.s63 s63Var = (r45.s63) n73Var.getCustom(3);
                java.lang.String str3 = "";
                if (s63Var == null || (str = s63Var.getString(1)) == null) {
                    str = "";
                }
                r45.s63 s63Var2 = (r45.s63) n73Var.getCustom(3);
                if (s63Var2 == null || (str2 = s63Var2.getString(0)) == null) {
                    str2 = "";
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("COVER_URL", str);
                intent.putExtra("DESC", str2);
                intent.putExtra("TICKET", gVar.f117101g);
                intent.putExtra("APPID", gVar.f117100f);
                intent.putExtra("POST_FROM_SCENE", this.f116960b);
                intent.putExtra("GameUserInfo", n73Var.toByteArray());
                intent.putExtra("KEY_ANTI_INFO", this.f116961c);
                r45.xl6 xl6Var = gVar.f117104m;
                if (xl6Var != null && (string = xl6Var.getString(3)) != null) {
                    str3 = string;
                }
                intent.putExtra("GAME_USER_ID", str3);
                r45.xl6 xl6Var2 = gVar.f117104m;
                intent.putExtra("GAME_PLATFROM_ID", xl6Var2 != null ? xl6Var2.getInteger(2) : 0);
                r45.xl6 xl6Var3 = gVar.f117104m;
                if (xl6Var3 != null) {
                    intent.putExtra("KEY_FROM_THIRD_PARTY_SHARE", xl6Var3.toByteArray());
                }
                i95.m c17 = i95.n0.c(c61.yb.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                c61.yb.H7((c61.yb) c17, gVar.getContext(), intent, 0L, null, 0, 0, false, 124, null);
                intent.setClass(gVar.getContext(), com.tencent.mm.plugin.finder.feed.ui.FinderLivePostPendingUI.class);
                android.app.Activity context = gVar.getContext();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveAccountUIC", "goToLivePostUI", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveAccountUIC", "goToLivePostUI", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                gVar.getActivity().finish();
            }
        } else {
            com.tencent.mars.xlog.Log.w(gVar.f117098d, "CgiFinderLiveGetUserGameConfig failed.");
            pm0.z.b(xy2.b.f458155b, "AUTH_ERROR_USERCONFIG_FAILED", false, null, null, false, false, null, 124, null);
            db5.t7.makeText(gVar.getContext(), com.tencent.mm.R.string.dgq, 0).show();
        }
        return jz5.f0.f302826a;
    }
}
