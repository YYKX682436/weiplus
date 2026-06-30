package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class ma implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.pa f207874d;

    public ma(com.tencent.mm.ui.conversation.pa paVar) {
        this.f207874d = paVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.conversation.pa paVar = this.f207874d;
        android.app.Activity activity = paVar.f207969d;
        db5.e1.A(activity, activity.getString(com.tencent.mm.R.string.hba), "", paVar.f207969d.getString(com.tencent.mm.R.string.hbb), paVar.f207969d.getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.ui.conversation.ka(this), new com.tencent.mm.ui.conversation.la(this));
    }
}
