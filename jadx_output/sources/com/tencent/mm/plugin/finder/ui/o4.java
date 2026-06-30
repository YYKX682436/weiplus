package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class o4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderCropAvatarUI f129569d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(com.tencent.mm.plugin.finder.ui.FinderCropAvatarUI finderCropAvatarUI) {
        super(0);
        this.f129569d = finderCropAvatarUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.plugin.finder.ui.FinderCropAvatarUI.H;
        com.tencent.mm.plugin.finder.ui.FinderCropAvatarUI finderCropAvatarUI = this.f129569d;
        int intValue = ((java.lang.Number) ((jz5.n) finderCropAvatarUI.f128560y).getValue()).intValue();
        if (intValue == 0) {
            db5.e1.i(finderCropAvatarUI, com.tencent.mm.R.string.csl, 0);
        } else if (intValue == 1) {
            db5.e1.i(finderCropAvatarUI, com.tencent.mm.R.string.csk, 0);
        }
        return jz5.f0.f302826a;
    }
}
