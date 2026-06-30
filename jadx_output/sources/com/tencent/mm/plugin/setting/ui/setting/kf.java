package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes12.dex */
public class kf implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsLanguageUI f161238d;

    public kf(com.tencent.mm.plugin.setting.ui.setting.SettingsLanguageUI settingsLanguageUI) {
        this.f161238d = settingsLanguageUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsLanguageUI activity = this.f161238d;
        java.lang.String languageCode = activity.f160482m;
        com.tencent.mm.plugin.setting.ui.setting.jf jfVar = new com.tencent.mm.plugin.setting.ui.setting.jf(this);
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(languageCode, "languageCode");
        ((fm.h) ((k65.j) i95.n0.c(k65.j.class))).getClass();
        if (!(!com.tencent.mm.sdk.platformtools.a0.c())) {
            jfVar.invoke();
        }
        kotlinx.coroutines.y0 lifecycleAsyncScope = activity.getLifecycleAsyncScope();
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(lifecycleAsyncScope, kotlinx.coroutines.internal.b0.f310484a, null, new com.tencent.mm.plugin.setting.ui.setting.b5(activity, languageCode, jfVar, null), 2, null);
        return true;
    }
}
