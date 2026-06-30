package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class o8 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f124046a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124047b;

    public o8(com.tencent.mm.plugin.finder.profile.uic.ob obVar, java.lang.String str) {
        this.f124046a = obVar;
        this.f124047b = str;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mm.plugin.finder.profile.uic.ob obVar = this.f124046a;
        if (z17) {
            com.tencent.mm.plugin.finder.report.p pVar = com.tencent.mm.plugin.finder.report.p.f125222a;
            com.tencent.mm.plugin.finder.report.k kVar = com.tencent.mm.plugin.finder.report.p.f125228g;
            kVar.c(xy2.c.e(obVar.getContext()), "", obVar.getUsername());
            com.tencent.mm.plugin.finder.report.k.b(kVar, obVar.getContextObj(), 3L, null, 4, null);
            android.widget.FrameLayout sendMsgBtn = obVar.h7().W0;
            kotlin.jvm.internal.o.f(sendMsgBtn, "sendMsgBtn");
            ym5.a1.h(sendMsgBtn, null);
        }
        if (!z17 || com.tencent.mm.sdk.platformtools.t8.K0(this.f124047b)) {
            return;
        }
        com.tencent.mm.plugin.finder.report.t2.f125363a.b(obVar.getActivity(), obVar.getUsername(), false, obVar.Q1);
    }
}
