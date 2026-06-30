package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class oa implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.pa f207948d;

    public oa(com.tencent.mm.ui.conversation.pa paVar) {
        this.f207948d = paVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.conversation.pa paVar = this.f207948d;
        if (paVar.f207969d.isFinishing()) {
            return;
        }
        paVar.f207971f.setSelection(0);
    }
}
