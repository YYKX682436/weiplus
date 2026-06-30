package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class pk implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderSnsHeaderView f132847d;

    public pk(int i17, com.tencent.mm.plugin.finder.view.FinderSnsHeaderView finderSnsHeaderView, int i18) {
        this.f132847d = finderSnsHeaderView;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        java.util.LinkedList list;
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.finder.view.FinderSnsHeaderView finderSnsHeaderView = this.f132847d;
        if (itemId != 1) {
            if (itemId != 2) {
                return;
            }
            com.tencent.mm.plugin.finder.view.lk presenter = finderSnsHeaderView.getPresenter();
            presenter.getClass();
            java.lang.String format = java.lang.String.format("%s,%s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 3}, 2));
            kotlin.jvm.internal.o.f(format, "format(...)");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(21529, format);
            android.content.Intent intent = new android.content.Intent();
            presenter.getClass();
            intent.setClassName((android.content.Context) null, "com.tencent.mm.plugin.setting.ui.setting.SettingsPrivacyUI");
            presenter.getClass();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(null, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderSnsHeaderPresenter", "goSetting", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            throw null;
        }
        com.tencent.mm.plugin.finder.view.lk presenter2 = finderSnsHeaderView.getPresenter();
        java.util.ArrayList a17 = presenter2.a(so2.j1.class);
        pm0.v.O("FinderSnsLiveListExpose", new com.tencent.mm.plugin.finder.view.kk(a17, 61));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(java.lang.System.currentTimeMillis());
        sb6.append(",2,");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(a17, 10));
        java.util.Iterator it = a17.iterator();
        while (it.hasNext()) {
            r45.nw1 liveInfo = ((so2.j1) it.next()).f410439d.getLiveInfo();
            arrayList2.add(java.lang.Long.valueOf(liveInfo != null ? liveInfo.getLong(0) : 0L));
        }
        sb6.append(kz5.n0.g0(arrayList2, ";", null, null, 0, null, null, 62, null));
        sb6.append(',');
        sb6.append(((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri());
        sb6.append(',');
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(a17, 10));
        java.util.Iterator it6 = a17.iterator();
        while (it6.hasNext()) {
            r45.pw2 snsShareInfo = ((so2.j1) it6.next()).f410439d.getSnsShareInfo();
            if (snsShareInfo == null || (list = snsShareInfo.getList(3)) == null) {
                str = null;
            } else {
                java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(list, 10));
                java.util.Iterator it7 = list.iterator();
                while (it7.hasNext()) {
                    arrayList4.add(((com.tencent.mm.protocal.protobuf.FinderContact) it7.next()).getUsername());
                }
                str = kz5.n0.g0(arrayList4, ";", null, null, 0, null, null, 62, null);
            }
            arrayList3.add(str);
        }
        sb6.append(kz5.n0.g0(arrayList3, "#", null, null, 0, null, null, 62, null));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(21530, sb6.toString());
        presenter2.getClass();
        throw null;
    }
}
