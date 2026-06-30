package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes2.dex */
public final class e8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f112378d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8(android.view.ViewGroup viewGroup) {
        super(0);
        this.f112378d = viewGroup;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
        java.lang.System.nanoTime();
        boolean z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        int i18 = a17.f197135a;
        if (!z17 && i18 > (i17 = a17.f197136b)) {
            i18 = i17;
        }
        return java.lang.Integer.valueOf((i18 - (this.f112378d.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9) * 2)) / 4);
    }
}
