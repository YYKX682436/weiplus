package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class ga implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.RefreshHelper$3 f207708d;

    public ga(com.tencent.mm.ui.conversation.RefreshHelper$3 refreshHelper$3) {
        this.f207708d = refreshHelper$3;
    }

    @Override // java.lang.Runnable
    public void run() {
        yf5.j0 j0Var = this.f207708d.f207413d.f207970e;
        if (j0Var != null) {
            ((yf5.w0) j0Var).notifyDataSetChanged();
        }
    }
}
