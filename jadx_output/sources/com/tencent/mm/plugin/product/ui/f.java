package com.tencent.mm.plugin.product.ui;

/* loaded from: classes14.dex */
public class f implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.product.ui.MallBaseUI f153286d;

    public f(com.tencent.mm.plugin.product.ui.MallBaseUI mallBaseUI) {
        this.f153286d = mallBaseUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f153286d.finish();
    }
}
