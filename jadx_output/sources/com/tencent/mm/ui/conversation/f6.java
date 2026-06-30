package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class f6 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.q5 f207675d;

    public f6(com.tencent.mm.ui.conversation.q5 q5Var) {
        this.f207675d = q5Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        gm0.j1.e().j(new com.tencent.mm.ui.conversation.d6(this));
        com.tencent.mm.ui.conversation.q5 q5Var = this.f207675d;
        q5Var.f208002e.dismiss();
        db5.e1.o(q5Var.f208009o, com.tencent.mm.R.string.bn7, com.tencent.mm.R.string.f490573yv, false, new com.tencent.mm.ui.conversation.e6(this));
    }
}
