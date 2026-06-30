package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes3.dex */
public final class e9 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI f129096d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9(com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI finderLivePostHelperUI) {
        super(1);
        this.f129096d = finderLivePostHelperUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI finderLivePostHelperUI = this.f129096d;
        if (booleanValue) {
            android.content.Intent intent = new android.content.Intent();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_PRECHECK_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
            ae2.in.f3688a.C0(1);
            intent.putExtra("PRECHECK_RESULT", 1);
            finderLivePostHelperUI.setResult(-1, intent);
        }
        finderLivePostHelperUI.finish();
        return jz5.f0.f302826a;
    }
}
