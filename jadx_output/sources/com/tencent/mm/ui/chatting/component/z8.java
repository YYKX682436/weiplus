package com.tencent.mm.ui.chatting.component;

/* loaded from: classes4.dex */
public final class z8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.a9 f200362d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f200363e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8(com.tencent.mm.ui.chatting.component.a9 a9Var, java.lang.String str) {
        super(0);
        this.f200362d = a9Var;
        this.f200363e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String talkerUsername = this.f200363e;
        kotlin.jvm.internal.o.f(talkerUsername, "$talkerUsername");
        java.lang.String str = this.f200362d.f198613e;
        com.tencent.mars.xlog.Log.i(str, "clearVoipReadMsg");
        android.database.Cursor cursor = null;
        try {
            try {
                cursor = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().T7(talkerUsername, 50, 10);
                while (cursor.moveToNext()) {
                    com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                    f9Var.convertFrom(cursor);
                    f9Var.r1(6);
                    ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(f9Var.getMsgId(), f9Var, true);
                    com.tencent.mars.xlog.Log.i(str, "do update msg " + f9Var.getMsgId() + " status");
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(str, e17, "clearVoipReadMsg error", new java.lang.Object[0]);
            }
            com.tencent.mm.sdk.platformtools.t8.v1(cursor);
            return jz5.f0.f302826a;
        } catch (java.lang.Throwable th6) {
            com.tencent.mm.sdk.platformtools.t8.v1(cursor);
            throw th6;
        }
    }
}
