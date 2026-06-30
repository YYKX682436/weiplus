package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class o7 extends com.tencent.mm.ui.conversation.t7 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.q7 f207945b;

    public o7(com.tencent.mm.ui.conversation.q7 q7Var) {
        this.f207945b = q7Var;
    }

    @Override // com.tencent.mm.ui.conversation.t7
    public com.tencent.mm.ui.conversation.w7 a(android.database.Cursor cursor, int i17) {
        com.tencent.mm.ui.conversation.w7 w7Var = new com.tencent.mm.ui.conversation.w7();
        w7Var.f208221d = cursor.getLong(c(cursor, "lastMsgTime"));
        if ((cursor.getLong(c(cursor, "flag")) & 4611686018427387904L) != 0) {
            w7Var.f208222e = 1;
        } else {
            w7Var.f208222e = 0;
        }
        return w7Var;
    }

    @Override // com.tencent.mm.ui.conversation.t7
    public android.database.Cursor d() {
        return this.f207945b.f208024r.j();
    }
}
