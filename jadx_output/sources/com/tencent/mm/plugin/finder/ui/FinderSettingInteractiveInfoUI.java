package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderSettingInteractiveInfoUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class FinderSettingInteractiveInfoUI extends com.tencent.mm.ui.base.preference.MMPreference {
    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494886an;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.f491418d12);
        setBackBtn(new com.tencent.mm.plugin.finder.ui.ch(this));
        int dimension = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479704cz);
        com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("settings_liked");
        java.lang.String string = getContext().getString(com.tencent.mm.R.string.eqs);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        h17.L(hc2.x0.k(string, context, '#', com.tencent.mm.R.raw.icons_filled_channels_like_thick, com.tencent.mm.R.color.a0c, dimension, dimension, 0, 0, 0, com.tencent.wcdb.FileUtils.S_IRWXU, null));
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str = preference != null ? preference.f197780q : null;
        com.tencent.mars.xlog.Log.i("FinderSettingInteractiveInfoUI", "click " + str);
        if (str == null) {
            return true;
        }
        int hashCode = str.hashCode();
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        switch (hashCode) {
            case -1556120431:
                if (!str.equals("settings_liked")) {
                    return true;
                }
                com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar, this, getIntent(), 0L, null, 0, 0, false, 0, null, 508, null);
                getIntent().setClass(this, com.tencent.mm.plugin.finder.feed.ui.FinderLikeFeedGridUI.class);
                android.content.Intent intent = getIntent();
                androidx.appcompat.app.AppCompatActivity context = getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                intent.putExtra("finder_username", xy2.c.e(context));
                android.content.Intent intent2 = getIntent();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent2);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderSettingInteractiveInfoUI", "handleLikedClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(this, "com/tencent/mm/plugin/finder/ui/FinderSettingInteractiveInfoUI", "handleLikedClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return true;
            case -1161289907:
                if (!str.equals("settings_follow")) {
                    return true;
                }
                android.content.Intent intent3 = new android.content.Intent();
                com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar, this, intent3, 0L, null, 0, 0, false, 0, null, 508, null);
                intent3.setClass(this, com.tencent.mm.plugin.finder.ui.FinderFollowListUI.class);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent3);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/FinderSettingInteractiveInfoUI", "handleFollowClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(this, "com/tencent/mm/plugin/finder/ui/FinderSettingInteractiveInfoUI", "handleFollowClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return true;
            case -6902322:
                if (!str.equals("settings_mention")) {
                    return true;
                }
                ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).zk(this, null);
                return true;
            case 734000174:
                if (!str.equals("settings_privacy_msg")) {
                    return true;
                }
                i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                ((com.tencent.mm.plugin.finder.assist.i0) c17).yk(this, null);
                return true;
            case 1091629613:
                if (!str.equals("settings_collected")) {
                    return true;
                }
                android.content.Intent intent4 = new android.content.Intent();
                com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar, this, intent4, 0L, null, 0, 0, false, 0, null, 508, null);
                intent4.setClass(this, com.tencent.mm.plugin.finder.feed.ui.FinderFavFeedUI.class);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(intent4);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(this, arrayList3.toArray(), "com/tencent/mm/plugin/finder/ui/FinderSettingInteractiveInfoUI", "handleCollectedClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList3.get(0));
                yj0.a.f(this, "com/tencent/mm/plugin/finder/ui/FinderSettingInteractiveInfoUI", "handleCollectedClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return true;
            default:
                return true;
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        java.lang.String str;
        super.onResume();
        if (((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode()) {
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("settings_privacy_msg", true);
        }
        r45.rl2 a17 = cu2.f0.f222391a.a("FinderObjectDynamicImageKey_FinderFavOffIcon");
        if (a17 == null || (str = a17.getString(1)) == null) {
            str = "";
        }
        com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("settings_collected");
        com.tencent.mm.ui.base.preference.IconPreference iconPreference = h17 instanceof com.tencent.mm.ui.base.preference.IconPreference ? (com.tencent.mm.ui.base.preference.IconPreference) h17 : null;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            mn2.g1 g1Var = mn2.g1.f329975a;
            wo0.c b17 = g1Var.e().b(new mn2.q3(str, com.tencent.mm.plugin.finder.storage.y90.f128355e), g1Var.h(mn2.f1.A));
            com.tencent.mm.plugin.finder.ui.eh ehVar = new com.tencent.mm.plugin.finder.ui.eh(this, iconPreference);
            b17.getClass();
            b17.f447873d = ehVar;
            b17.a();
            return;
        }
        int dimension = (int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479704cz);
        if (iconPreference == null) {
            return;
        }
        java.lang.String string = getContext().getString(com.tencent.mm.R.string.cuo);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        iconPreference.L(hc2.x0.k(string, context, '#', com.tencent.mm.R.raw.icons_outlined_star_new, com.tencent.mm.R.color.a0c, dimension, dimension, 0, 0, 0, com.tencent.wcdb.FileUtils.S_IRWXU, null));
    }
}
