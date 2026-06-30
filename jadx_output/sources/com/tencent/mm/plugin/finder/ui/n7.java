package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes3.dex */
public final class n7 implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderImagePreviewUI f129539a;

    public n7(com.tencent.mm.plugin.finder.ui.FinderImagePreviewUI finderImagePreviewUI) {
        this.f129539a = finderImagePreviewUI;
    }

    @Override // zb0.a0
    public void a(java.lang.String srcPath, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        com.tencent.mm.plugin.finder.ui.FinderImagePreviewUI finderImagePreviewUI = this.f129539a;
        db5.t7.i(finderImagePreviewUI, finderImagePreviewUI.getResources().getString(com.tencent.mm.R.string.mrk), com.tencent.mm.R.raw.icons_filled_done);
    }

    @Override // zb0.a0
    public void b(java.lang.String srcPath, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        com.tencent.mm.plugin.finder.ui.FinderImagePreviewUI finderImagePreviewUI = this.f129539a;
        db5.t7.i(finderImagePreviewUI, finderImagePreviewUI.getResources().getString(com.tencent.mm.R.string.mrj), com.tencent.mm.R.raw.icons_filled_close);
    }
}
