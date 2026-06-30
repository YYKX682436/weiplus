package com.tencent.mm.ui;

/* loaded from: classes14.dex */
public final class gj extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.TallHalfScreenDialogFragment f208704d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj(com.tencent.mm.ui.TallHalfScreenDialogFragment tallHalfScreenDialogFragment) {
        super(0);
        this.f208704d = tallHalfScreenDialogFragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.ui.TallHalfScreenDialogFragment.H;
        return java.lang.Integer.valueOf((int) (this.f208704d.w0() * 0.85d));
    }
}
