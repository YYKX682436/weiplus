package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class h6 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.i6 f207718d;

    public h6(com.tencent.mm.ui.conversation.i6 i6Var) {
        this.f207718d = i6Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        c01.d9.e().d(this.f207718d.f207746d.f208007m);
        if (p94.w0.c() != null) {
            ((com.tencent.mm.plugin.sns.storage.e2) p94.w0.c()).D0();
        }
    }
}
