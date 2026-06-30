package com.tencent.mm.plugin.game.ui.message;

/* loaded from: classes8.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.database.Cursor f141656d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f141657e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.message.y0 f141658f;

    public x0(com.tencent.mm.plugin.game.ui.message.y0 y0Var, android.database.Cursor cursor, int i17) {
        this.f141658f = y0Var;
        this.f141656d = cursor;
        this.f141657e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.ui.message.y0 y0Var = this.f141658f;
        com.tencent.mm.plugin.game.ui.message.c1 c1Var = y0Var.f141662e;
        c1Var.f141536d2 = new com.tencent.mm.plugin.game.ui.message.b1(c1Var, y0Var.f141661d, this.f141656d, this.f141657e);
        y0Var.f141662e.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(y0Var.f141661d));
        com.tencent.mm.plugin.game.ui.message.c1 c1Var2 = y0Var.f141662e;
        c1Var2.setAdapter(c1Var2.f141536d2);
    }
}
