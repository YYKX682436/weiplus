package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class zc extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderPreviewCoverUI f130090d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f130091e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc(com.tencent.mm.plugin.finder.ui.FinderPreviewCoverUI finderPreviewCoverUI, android.graphics.Bitmap bitmap) {
        super(0);
        this.f130090d = finderPreviewCoverUI;
        this.f130091e = bitmap;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.ui.FinderPreviewCoverUI finderPreviewCoverUI = this.f130090d;
        com.tencent.mm.plugin.finder.ui.FinderPreviewCoverUI.d7(finderPreviewCoverUI);
        android.graphics.Bitmap bitmap = this.f130091e;
        kotlin.jvm.internal.o.f(bitmap, "$bitmap");
        com.tencent.mm.plugin.finder.ui.FinderPreviewCoverUI.e7(finderPreviewCoverUI, bitmap);
        return jz5.f0.f302826a;
    }
}
