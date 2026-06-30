package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class fd extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderPreviewCoverUI f129233d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f129234e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f129235f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd(com.tencent.mm.plugin.finder.ui.FinderPreviewCoverUI finderPreviewCoverUI, android.graphics.Bitmap bitmap, kotlin.jvm.internal.c0 c0Var) {
        super(0);
        this.f129233d = finderPreviewCoverUI;
        this.f129234e = bitmap;
        this.f129235f = c0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.ui.FinderPreviewCoverUI finderPreviewCoverUI = this.f129233d;
        com.tencent.mm.plugin.finder.ui.FinderPreviewCoverUI.d7(finderPreviewCoverUI);
        android.graphics.Bitmap bitmap = this.f129234e;
        kotlin.jvm.internal.o.f(bitmap, "$bitmap");
        com.tencent.mm.plugin.finder.ui.FinderPreviewCoverUI.e7(finderPreviewCoverUI, bitmap);
        if (this.f129235f.f310112d) {
            finderPreviewCoverUI.Q = finderPreviewCoverUI.P;
            com.tencent.mm.plugin.finder.ui.FinderPreviewCoverUI.f7(finderPreviewCoverUI, bitmap);
        }
        return jz5.f0.f302826a;
    }
}
