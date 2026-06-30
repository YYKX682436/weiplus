package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class n7 extends com.tencent.mm.ui.conversation.t7 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.q7 f207901b;

    public n7(com.tencent.mm.ui.conversation.q7 q7Var) {
        this.f207901b = q7Var;
    }

    @Override // com.tencent.mm.ui.conversation.t7
    public com.tencent.mm.ui.conversation.w7 a(android.database.Cursor cursor, int i17) {
        com.tencent.mm.ui.conversation.w7 w7Var = new com.tencent.mm.ui.conversation.w7();
        java.lang.String string = cursor.getString(c(cursor, dm.i4.COL_USERNAME));
        long j17 = cursor.getLong(c(cursor, "conversationTime"));
        w7Var.f208221d = j17;
        if (j17 == 0) {
            w7Var.f208221d = cursor.getLong(c(cursor, "flag")) & 72057594037927935L;
        }
        if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().K(string)) {
            w7Var.f208222e = 1;
        } else {
            w7Var.f208222e = 0;
        }
        return w7Var;
    }

    @Override // com.tencent.mm.ui.conversation.t7
    public android.database.Cursor d() {
        return this.f207901b.f208023q.j();
    }
}
