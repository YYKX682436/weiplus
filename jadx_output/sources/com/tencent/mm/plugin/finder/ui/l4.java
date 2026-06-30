package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class l4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderCropAvatarUI f129454d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(com.tencent.mm.plugin.finder.ui.FinderCropAvatarUI finderCropAvatarUI) {
        super(0);
        this.f129454d = finderCropAvatarUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f129454d.getIntent().getIntExtra("key_crop_type", 0));
    }
}
