package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class ag implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSelfQRCodeUI f128862a;

    public ag(com.tencent.mm.plugin.finder.ui.FinderSelfQRCodeUI finderSelfQRCodeUI) {
        this.f128862a = finderSelfQRCodeUI;
    }

    @Override // zb0.a0
    public void a(java.lang.String srcPath, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        com.tencent.mm.plugin.finder.ui.FinderSelfQRCodeUI finderSelfQRCodeUI = this.f128862a;
        dp.a.makeText(finderSelfQRCodeUI, finderSelfQRCodeUI.getString(com.tencent.mm.R.string.f492304g00, destPath), 1).show();
    }

    @Override // zb0.a0
    public void b(java.lang.String srcPath, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        com.tencent.mm.plugin.finder.ui.FinderSelfQRCodeUI finderSelfQRCodeUI = this.f128862a;
        dp.a.makeText(finderSelfQRCodeUI, finderSelfQRCodeUI.getString(com.tencent.mm.R.string.i87), 1).show();
    }
}
