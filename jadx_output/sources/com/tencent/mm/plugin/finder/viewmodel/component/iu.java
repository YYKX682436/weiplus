package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class iu extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.viewmodel.component.iu f134767d = new com.tencent.mm.plugin.finder.viewmodel.component.iu();

    public iu() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.ep2 ep2Var = new r45.ep2();
        java.lang.String v17 = gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_FINDER_SYNC_POPUP_CLIENT_FREQ_CONFIG_STRING_SYNC, "");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            kotlin.Result.m521constructorimpl(ep2Var.parseFrom(com.tencent.mm.sdk.platformtools.t8.h(v17)));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderPopupUIC", "initFinderPopupClientFreqConfig expose_quota=" + ep2Var.getInteger(0) + ",expose_interval=" + ep2Var.getInteger(1) + '!');
        return ep2Var;
    }
}
