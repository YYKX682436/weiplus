package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class g5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.i5 f141399d;

    public g5(com.tencent.mm.plugin.game.ui.i5 i5Var) {
        this.f141399d = i5Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().execSQL("GameRawMessage", "delete from GameRawMessage");
        com.tencent.mm.plugin.game.ui.i5 i5Var = this.f141399d;
        i5Var.f141423d.f140932i.o();
        i5Var.f141423d.f140932i.notifyDataSetChanged();
    }
}
