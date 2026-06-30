package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class fa extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.pa f207682a;

    public fa(com.tencent.mm.ui.conversation.pa paVar) {
        this.f207682a = paVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        com.tencent.mm.ui.conversation.pa paVar = this.f207682a;
        yf5.j0 j0Var = paVar.f207970e;
        if (j0Var != null) {
            ((yf5.w0) j0Var).d().f461972s.clear();
            ((yf5.w0) paVar.f207970e).notifyDataSetChanged();
        }
    }
}
