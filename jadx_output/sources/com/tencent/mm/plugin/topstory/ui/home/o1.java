package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes11.dex */
public class o1 implements r35.d2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.home.TopStorySettingVisibilityDetailUI f175064a;

    public o1(com.tencent.mm.plugin.topstory.ui.home.TopStorySettingVisibilityDetailUI topStorySettingVisibilityDetailUI) {
        this.f175064a = topStorySettingVisibilityDetailUI;
    }

    @Override // r35.d2
    public void a(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference;
        com.tencent.mm.plugin.topstory.ui.home.TopStorySettingVisibilityDetailUI topStorySettingVisibilityDetailUI = this.f175064a;
        java.lang.String c17 = lz.a.c(topStorySettingVisibilityDetailUI.f174901d, i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "roomPref del " + i17 + " userName : " + c17);
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(2, null);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        if (str.equals(c17)) {
            db5.e1.s(topStorySettingVisibilityDetailUI.getContext(), topStorySettingVisibilityDetailUI.getString(com.tencent.mm.R.string.i4t), "");
            return;
        }
        topStorySettingVisibilityDetailUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "dealDelChatRoomMember");
        if (c17 != null && !c17.equals("")) {
            java.util.List list = topStorySettingVisibilityDetailUI.f174905h;
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
            arrayList.remove(c17);
            com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference2 = topStorySettingVisibilityDetailUI.f174901d;
            if (contactListExpandPreference2 != null) {
                contactListExpandPreference2.S(list);
                topStorySettingVisibilityDetailUI.f174901d.s();
            }
            if (arrayList.size() != 0 || (contactListExpandPreference = topStorySettingVisibilityDetailUI.f174901d) == null) {
                com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference3 = topStorySettingVisibilityDetailUI.f174901d;
                if (contactListExpandPreference3 != null) {
                    contactListExpandPreference3.T(true);
                    contactListExpandPreference3.V(true);
                }
            } else {
                contactListExpandPreference.N();
                com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference4 = topStorySettingVisibilityDetailUI.f174901d;
                contactListExpandPreference4.T(true);
                contactListExpandPreference4.V(false);
                ((com.tencent.mm.ui.base.preference.h0) topStorySettingVisibilityDetailUI.f174904g).notifyDataSetChanged();
            }
            ((java.util.ArrayList) topStorySettingVisibilityDetailUI.f174907m).clear();
            topStorySettingVisibilityDetailUI.X6();
            topStorySettingVisibilityDetailUI.Y6();
        }
        if (!(((java.lang.Object) topStorySettingVisibilityDetailUI.f174909o) + " " + com.tencent.mm.sdk.platformtools.t8.c1(topStorySettingVisibilityDetailUI.f174905h, ",")).equals(topStorySettingVisibilityDetailUI.f174910p) || topStorySettingVisibilityDetailUI.f174908n == 0) {
            topStorySettingVisibilityDetailUI.enableOptionMenu(true);
        } else {
            topStorySettingVisibilityDetailUI.enableOptionMenu(false);
        }
    }

    @Override // r35.d2
    public void b(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
    }

    @Override // r35.d2
    public void c(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.tencent.mm.plugin.topstory.ui.home.TopStorySettingVisibilityDetailUI topStorySettingVisibilityDetailUI = this.f175064a;
        java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(topStorySettingVisibilityDetailUI.f174905h, ",");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("titile", topStorySettingVisibilityDetailUI.getString(com.tencent.mm.R.string.f489934fx));
        intent.putExtra("list_type", 1);
        intent.putExtra("KBlockOpenImFav", true);
        intent.putExtra("show_too_many_member", false);
        com.tencent.mm.ui.contact.i5.e();
        intent.putExtra("list_attr", com.tencent.mm.ui.contact.i5.g(com.tencent.mm.ui.contact.i5.g(com.tencent.mm.ui.contact.i5.f206782c, 1024), 524288) & (-16777217));
        intent.putExtra("always_select_contact", c17);
        intent.putExtra("topstory_import_type", topStorySettingVisibilityDetailUI.f174908n == 1 ? 1 : 2);
        j45.l.v(topStorySettingVisibilityDetailUI, ".ui.contact.SelectContactUI", intent, 1);
    }

    @Override // r35.d2
    public void d(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference = this.f175064a.f174901d;
        if (contactListExpandPreference != null) {
            contactListExpandPreference.N();
        }
    }

    @Override // r35.d2
    public void e(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.tencent.mm.plugin.topstory.ui.home.TopStorySettingVisibilityDetailUI topStorySettingVisibilityDetailUI = this.f175064a;
        java.lang.String c17 = lz.a.c(topStorySettingVisibilityDetailUI.f174901d, i17);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", c17);
        j45.l.j(topStorySettingVisibilityDetailUI, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
    }
}
