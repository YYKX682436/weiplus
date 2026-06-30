package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FavFragment;", "Lcom/tencent/mm/plugin/finder/ui/SettingFragment;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class FavFragment extends com.tencent.mm.plugin.finder.ui.SettingFragment {
    public FavFragment() {
        super("    收藏   ", 2);
    }

    @Override // com.tencent.mm.plugin.finder.ui.SettingFragment
    public java.util.ArrayList z0() {
        java.lang.Object obj;
        java.util.Set stringSet = com.tencent.mm.sdk.platformtools.o4.R("finder_debug_settings_fav").getStringSet("fav_1", kz5.r0.f314002d);
        kotlin.jvm.internal.o.d(stringSet);
        java.util.HashSet hashSet = new java.util.HashSet(stringSet);
        java.util.List y07 = y0();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : kz5.n0.D0(hashSet)) {
            java.util.Iterator it = y07.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((lb2.j) obj).f317749d, str)) {
                    break;
                }
            }
            lb2.j jVar = (lb2.j) obj;
            if (jVar != null) {
                arrayList.add(jVar);
            }
        }
        return arrayList;
    }
}
