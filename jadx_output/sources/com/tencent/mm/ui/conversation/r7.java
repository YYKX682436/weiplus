package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class r7 extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.y7 f208048a;

    public r7(com.tencent.mm.ui.conversation.y7 y7Var) {
        this.f208048a = y7Var;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        com.tencent.mm.ui.conversation.y7 y7Var = this.f208048a;
        com.tencent.mm.ui.conversation.y7.a(y7Var, -1);
        y7Var.c();
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        com.tencent.mm.ui.conversation.y7 y7Var = this.f208048a;
        com.tencent.mm.ui.conversation.y7.b(y7Var, -1);
        y7Var.c();
    }
}
