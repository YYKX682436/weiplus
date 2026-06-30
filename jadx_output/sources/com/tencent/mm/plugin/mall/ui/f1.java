package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class f1 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.MallIndexUI f148379d;

    public f1(com.tencent.mm.plugin.mall.ui.MallIndexUI mallIndexUI) {
        this.f148379d = mallIndexUI;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        this.f148379d.C = null;
    }
}
