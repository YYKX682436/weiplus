package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class gv extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC f134554d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gv(com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC finderProfileDrawerUIC) {
        super(0);
        this.f134554d = finderProfileDrawerUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment = this.f134554d.f133619d;
        androidx.activity.ComponentActivity componentActivity = vASCommonFragment != null ? vASCommonFragment.f211121p : null;
        com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI finderProfileUI = componentActivity instanceof com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI ? (com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI) componentActivity : null;
        return java.lang.Boolean.valueOf(finderProfileUI != null ? finderProfileUI.d7() : true);
    }
}
