package com.tencent.mm.plugin.game.ui;

/* loaded from: classes5.dex */
public class v4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.y4 f141800d;

    public v4(com.tencent.mm.plugin.game.ui.y4 y4Var) {
        this.f141800d = y4Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f141800d.notifyDataSetChanged();
    }
}
