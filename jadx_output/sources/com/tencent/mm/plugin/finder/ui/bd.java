package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class bd extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderPreviewCoverUI f128946d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f128947e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd(com.tencent.mm.plugin.finder.ui.FinderPreviewCoverUI finderPreviewCoverUI, android.graphics.Bitmap bitmap) {
        super(0);
        this.f128946d = finderPreviewCoverUI;
        this.f128947e = bitmap;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.ui.FinderPreviewCoverUI finderPreviewCoverUI = this.f128946d;
        com.tencent.mm.plugin.finder.ui.FinderPreviewCoverUI.d7(finderPreviewCoverUI);
        android.graphics.Bitmap bitmap = this.f128947e;
        kotlin.jvm.internal.o.f(bitmap, "$bitmap");
        com.tencent.mm.plugin.finder.ui.FinderPreviewCoverUI.f7(finderPreviewCoverUI, bitmap);
        return jz5.f0.f302826a;
    }
}
