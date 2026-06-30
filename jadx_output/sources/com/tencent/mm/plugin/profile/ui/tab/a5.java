package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes11.dex */
public final class a5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo f154228d;

    public a5(com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo contactWidgetTabBizInfo) {
        this.f154228d = contactWidgetTabBizInfo;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f154228d.f154198d.onBackPressed();
        return true;
    }
}
