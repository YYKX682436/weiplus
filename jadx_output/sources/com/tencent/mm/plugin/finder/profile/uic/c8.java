package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class c8 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f123588a;

    public c8(com.tencent.mm.plugin.finder.profile.uic.ob obVar) {
        this.f123588a = obVar;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            com.tencent.mm.plugin.finder.report.b6.d(com.tencent.mm.plugin.finder.report.b6.f124969a, this.f123588a.getContextObj(), "profile_name_banner", 0, null, false, null, 56, null);
        }
    }
}
