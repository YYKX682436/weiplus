package com.tencent.mm.plugin.game.ui.message;

/* loaded from: classes8.dex */
public class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.database.Cursor f141649d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.message.w0 f141650e;

    public v0(com.tencent.mm.plugin.game.ui.message.w0 w0Var, android.database.Cursor cursor) {
        this.f141650e = w0Var;
        this.f141649d = cursor;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.ui.message.s sVar;
        com.tencent.mm.plugin.game.ui.message.w0 w0Var = this.f141650e;
        com.tencent.mm.plugin.game.ui.message.b1 b1Var = w0Var.f141652d.f141536d2;
        android.database.Cursor cursor = this.f141649d;
        b1Var.x(cursor);
        w0Var.f141652d.f141536d2.notifyDataSetChanged();
        if ((cursor == null || cursor.getCount() == 0) && (sVar = w0Var.f141652d.f141539g2) != null) {
            sVar.a();
        }
    }
}
