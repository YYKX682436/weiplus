package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class m7 extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.q7 f207870a;

    public m7(com.tencent.mm.ui.conversation.q7 q7Var) {
        this.f207870a = q7Var;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        com.tencent.mm.ui.conversation.q7 q7Var = this.f207870a;
        com.tencent.mm.ui.conversation.y7 y7Var = q7Var.f208022p;
        if (y7Var != null) {
            y7Var.c();
        }
        q7Var.notifyDataSetChanged();
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        com.tencent.mm.ui.conversation.q7 q7Var = this.f207870a;
        com.tencent.mm.ui.conversation.y7 y7Var = q7Var.f208022p;
        if (y7Var != null) {
            y7Var.c();
        }
        q7Var.notifyDataSetInvalidated();
    }
}
