package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class pg implements com.tencent.mm.ui.base.preference.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSettingDetailInfoUI f129645a;

    public pg(com.tencent.mm.plugin.finder.ui.FinderSettingDetailInfoUI finderSettingDetailInfoUI) {
        this.f129645a = finderSettingDetailInfoUI;
    }

    public void a(java.lang.String username, android.widget.ImageView icon, boolean z17) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(icon, "icon");
        com.tencent.mm.plugin.finder.ui.FinderSettingDetailInfoUI finderSettingDetailInfoUI = this.f129645a;
        if (finderSettingDetailInfoUI.f128715m == null) {
            com.tencent.mars.xlog.Log.e(finderSettingDetailInfoUI.f128709d, "error self contact is null");
            return;
        }
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d a17 = g1Var.a();
        ya2.b2 b2Var = finderSettingDetailInfoUI.f128715m;
        kotlin.jvm.internal.o.d(b2Var);
        a17.c(new mn2.n(b2Var.field_avatarUrl, null, 2, null), icon, g1Var.h(mn2.f1.f329957h));
    }
}
